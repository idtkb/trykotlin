package com.idtkb.trykotlin

import com.nhaarman.mockito_kotlin.*
import org.hamcrest.CoreMatchers.`is`
//import org.hamcrest.CoreMatchers.`is` as Is
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun doAction_doesSomething(){


        val spy = spy(Fragment1())

        val mock = mock<Fragment1> {
            on { echoText("foo") } doReturn "foo"
            on { echoText("bar") } doReturn "bar"
        }

        mock.echoText("foo")
        mock.echoText("bar")

//        verify(mock).echoText(argThat { this == "foo" } )
//        verify(mock).echoText(argThat { this == "bar" } )
//        verify(mock).echoText(check{
//            assertThat(it, `is`("foo"))
//            assertThat(it, `is`("bar"))
//        })

        //引数キャプチャ
        argumentCaptor<String>().apply {
            verify(mock, times(2)).echoText(capture())

            assertEquals(2, allValues.size)
            assertEquals("foo", firstValue)
            assertEquals("bar", secondValue)
        }
//        verify(mock, times(1)).echoText("foo")

        //Null安全

//        assertEquals(mock.echoText("foo"), "foo")
//        assertEquals(mock.echoText("bar"), "bar")
    }
}
