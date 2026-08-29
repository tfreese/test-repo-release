package de.freese;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Thomas Freese
 * @since 23.02.2023
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
