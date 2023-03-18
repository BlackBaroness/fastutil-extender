package io.github.blackbaroness.fastutilextender.guice;

import com.google.inject.AbstractModule;
import io.github.blackbaroness.fastutilextender.common.list.FastList;
import io.github.blackbaroness.fastutilextender.common.list.factory.ObjectListFactory;
import io.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl.*;
import io.github.blackbaroness.fastutilextender.common.set.FastSet;
import io.github.blackbaroness.fastutilextender.common.set.factory.ObjectSetFactory;
import io.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl.*;

public class FastUtilExtenderFactoriesModule extends AbstractModule {

    @Override
    protected void configure() {
        // lists
        bind(BooleanListFactory.class).toInstance(FastList.booleans);
        bind(ByteListFactory.class).toInstance(FastList.bytes);
        bind(CharListFactory.class).toInstance(FastList.chars);
        bind(DoubleListFactory.class).toInstance(FastList.doubles);
        bind(FloatListFactory.class).toInstance(FastList.floats);
        bind(IntListFactory.class).toInstance(FastList.ints);
        bind(LongListFactory.class).toInstance(FastList.longs);
        bind(ObjectListFactory.class).toInstance(FastList.objects);
        bind(ShortListFactory.class).toInstance(FastList.shorts);

        // set
        bind(BooleanSetFactory.class).toInstance(FastSet.booleans);
        bind(ByteSetFactory.class).toInstance(FastSet.bytes);
        bind(CharSetFactory.class).toInstance(FastSet.chars);
        bind(DoubleSetFactory.class).toInstance(FastSet.doubles);
        bind(FloatSetFactory.class).toInstance(FastSet.floats);
        bind(IntSetFactory.class).toInstance(FastSet.ints);
        bind(LongSetFactory.class).toInstance(FastSet.longs);
        bind(ObjectSetFactory.class).toInstance(FastSet.objects);
        bind(ShortSetFactory.class).toInstance(FastSet.shorts);
    }
}
