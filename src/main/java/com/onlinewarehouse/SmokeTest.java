package com.onlinewarehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Keeps CI green from the very first commit. Delete once real tests exist. */
class SmokeTest {

    @Test
    void projectBuilds() {
        assertTrue(true, "the build pipeline works");
    }
}
