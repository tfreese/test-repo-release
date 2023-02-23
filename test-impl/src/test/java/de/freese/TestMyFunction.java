// Created: 23.02.23
package de.freese;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Thomas Freese
 */
class TestMyFunction {
    @Test
    void testSomething() {
        MyFunction myFunction = new MyFunctionImpl();

        Assertions.assertEquals("doSomething", myFunction.doSomething());
    }
}
