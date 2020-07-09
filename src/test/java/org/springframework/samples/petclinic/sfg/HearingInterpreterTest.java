package org.springframework.samples.petclinic.sfg;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
//JUnit 4
class HearingInterpreterTest {
    HearingInterpreter hearingInterpreter;

    @Before
    void setUp() throws Exception {
        hearingInterpreter = new HearingInterpreter(new LaurelWordProducer());
    }

    @Test
    void whatIHear() {
        String word = hearingInterpreter.whatIHear();
        assertEquals("Laurel", word);
    }
}