package com.idtkb.trykotlin

import com.idtkb.trykotlin.model.User
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.any
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito
import org.mockito.Mockito.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun doAction_doesSomething(){


        val mock: Fragment1 = mock(Fragment1::class.java)

//        Mockito.doNothing().`when`(mock).echoText(Mockito.isA(User::class.java))
//        Mockito.`when`(mock.echoText(any())).thenReturn("foo")
//        verify(mock).echoText(any())

//        mock.echoText("foo")
//        mock.echoText("bar")

//        verify(mock, times(1)).echoText("foo")

        //Null安全

//        assertEquals(mock.echoText("foo"), "foo")
//        assertEquals(mock.echoText("bar"), "bar")
    }
}
