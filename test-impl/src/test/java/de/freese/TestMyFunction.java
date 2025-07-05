// Created: 23.02.23
package de.freese;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Thomas Freese
 */
class TestMyFunction {
    // @TempDir(cleanup = CleanupMode.ALWAYS)
    // private static Path pathTest;

    @Test
    void testSomething() {
        final MyFunction myFunction = new MyFunctionImpl();

        Assertions.assertEquals("doSomething", myFunction.doSomething());
    }
}
