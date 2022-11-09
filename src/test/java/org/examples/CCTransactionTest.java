package org.examples;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class CCTransactionTest {

    @Test
    public void test() {

        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("CCTransactionKB");

        if (ksession == null){
            System.out.println("null ksession");
        }
        
    }

}
