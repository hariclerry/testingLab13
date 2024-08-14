package edu.miu.cs.cs425;

import org.junit.jupiter.api.TestInstance;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ArrayFlattnerTest.class, ArrayReversorTest.class
})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayReversorTestCases {
    // No need to add any methods. This class is used to group the test cases.
}
