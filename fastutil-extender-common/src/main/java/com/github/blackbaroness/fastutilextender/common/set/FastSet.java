package com.github.blackbaroness.fastutilextender.common.set;

import com.github.blackbaroness.fastutilextender.common.set.factory.ObjectSetFactory;
import com.github.blackbaroness.fastutilextender.common.set.factory.primitive.impl.*;
import lombok.experimental.UtilityClass;

@SuppressWarnings({"unused"})
@UtilityClass
public class FastSet {

    public final BooleanSetFactory booleans = new BooleanSetFactory();
    public final ByteSetFactory bytes = new ByteSetFactory();
    public final CharSetFactory chars = new CharSetFactory();
    public final DoubleSetFactory doubles = new DoubleSetFactory();
    public final FloatSetFactory floats = new FloatSetFactory();
    public final IntSetFactory ints = new IntSetFactory();
    public final LongSetFactory longs = new LongSetFactory();
    public final ObjectSetFactory objects = new ObjectSetFactory();
    public final ShortSetFactory shorts = new ShortSetFactory();

}
