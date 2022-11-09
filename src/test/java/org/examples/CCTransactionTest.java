package org.examples;

import javax.inject.Inject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieRuntimeBuilder;
import org.kie.api.runtime.KieSession;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CCTransactionTest {

    @Inject
    KieRuntimeBuilder runtimeBuilder;
    
    @Test
    public void test() {
        KieSession ksession = runtimeBuilder.newKieSession("CCTransactionKB");

        if (ksession == null){
            System.out.println("null ksession");
            Assertions.fail("should never be null.");
        } else {
            System.out.println("KieSession not null!");
        }
        
    }

}
