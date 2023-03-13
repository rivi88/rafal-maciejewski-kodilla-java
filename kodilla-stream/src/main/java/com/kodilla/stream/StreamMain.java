package com.kodilla.stream;

import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;


public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor coreToExecute = () -> System.out.println("This is an example text.");
        processor.execute(coreToExecute);

    }
}