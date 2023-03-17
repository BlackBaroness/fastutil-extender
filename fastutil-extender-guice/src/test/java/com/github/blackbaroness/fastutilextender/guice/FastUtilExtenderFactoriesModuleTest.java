package com.github.blackbaroness.fastutilextender.guice;

import com.github.blackbaroness.fastutilextender.common.list.factory.ObjectListFactory;
import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl.*;
import com.github.blackbaroness.fastutilextender.common.set.factory.ObjectSetFactory;
import com.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl.*;
import com.google.inject.Guice;
import com.google.inject.Inject;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class FastUtilExtenderFactoriesModuleTest {

    @Test
    void test_injection() {
        assertDoesNotThrow(() -> {
            Guice.createInjector(new FastUtilExtenderFactoriesModule()).getInstance(TestModuleUser.class);
        });



    }

    class Example {

        private final BooleanListFactory booleanListFactory;

        @Inject
        public Example(BooleanListFactory booleanListFactory) {
            this.booleanListFactory = booleanListFactory;
        }
    }

    @SuppressWarnings("unused")
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    @RequiredArgsConstructor(onConstructor_ = @Inject)
    static class TestModuleUser {
        // list
        BooleanListFactory booleanListFactory;
        ByteListFactory byteListFactory;
        CharListFactory charListFactory;
        DoubleListFactory doubleListFactory;
        FloatListFactory floatListFactory;
        IntListFactory intListFactory;
        LongListFactory longListFactory;
        ObjectListFactory objectListFactory;
        ShortListFactory shortListFactory;

        // set
        BooleanSetFactory booleanSetFactory;
        ByteSetFactory byteSetFactory;
        CharSetFactory charSetFactory;
        DoubleSetFactory doubleSetFactory;
        FloatSetFactory floatSetFactory;
        IntSetFactory intSetFactory;
        LongSetFactory longSetFactory;
        ObjectSetFactory objectSetFactory;
        ShortSetFactory shortSetFactory;
    }
}