package com.github.blackbaroness.fastutilextender.common.list;

import com.github.blackbaroness.fastutilextender.common.list.factory.ObjectListFactory;
import com.github.blackbaroness.fastutilextender.common.list.factory.primitive.impl.*;
import lombok.experimental.UtilityClass;

@SuppressWarnings({"unused"})
@UtilityClass
public class FastList {

    public final BooleanListFactory booleans = new BooleanListFactory();
    public final ByteListFactory bytes = new ByteListFactory();
    public final CharListFactory chars = new CharListFactory();
    public final DoubleListFactory doubles = new DoubleListFactory();
    public final FloatListFactory floats = new FloatListFactory();
    public final IntListFactory ints = new IntListFactory();
    public final LongListFactory longs = new LongListFactory();
    public final ObjectListFactory objects = new ObjectListFactory();
    public final ShortListFactory shorts = new ShortListFactory();

}
