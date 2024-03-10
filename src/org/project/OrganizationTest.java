package org.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizationTest {

    @Test
    void test1() {
        Organization org = new Organization();
System.out.println("Система работает");
org.listWorker("sort","salary");
    }
}