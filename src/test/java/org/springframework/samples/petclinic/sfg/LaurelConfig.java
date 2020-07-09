package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LaurelConfig {

    LaurelWordProducer laurelWordProducer(){
        return new LaurelWordProducer();
    }

}
