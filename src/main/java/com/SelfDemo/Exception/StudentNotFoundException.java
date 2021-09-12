package com.SelfDemo.Exception;

public class StudentNotFoundException extends RuntimeException
{
    public StudentNotFoundException(String msg)
    {
        super(msg);
    }
}
