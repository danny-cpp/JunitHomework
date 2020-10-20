package ece325.TestSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ece325.TestCases.*;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CreationTests.class,
    AdditionTests.class,
    SubtractionTests.class,
    MultiplicationTests.class,
    DivisionTests.class,
    SolveQuadraticTests.class,
    
    // TODO: Assignment 4 Part 2 -- Checkpoint5
    SquareRootTests.class,
})

public class Question4 {
    // the class remains completely empty, 
    // being used only as a holder for the above annotations
}
