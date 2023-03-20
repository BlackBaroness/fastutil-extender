## Extension built under a [fastutil](https://github.com/vigna/fastutil) library

Don't waste your time by specifying a load factor, creating convertation algorithms,
collectors and other boring boilerplate things!

You need Java 8+ to use this.

## Import to your project

Maven:

```xml

<dependency>
    <dependency>
        <groupId>io.github.blackbaroness</groupId>
        <artifactId>fastutil-extender-common</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependency>
```

Gradle (Groovy SDK):

```groovy
implementation 'io.github.blackbaroness:fastutil-extender-common:0.1.0'
```

Gradle (Kotlin SDK):

```kotlin
implementation("io.github.blackbaroness:fastutil-extender-common:0.1.0")
```

## Features

### 1. Fastest load factors by default

While doing benchmarks, I realized that load factor 0.25 significantly speeds up
hash-based collections, wasting just a bit of RAM. If you don't feel sorry for the
extra 1MB of RAM, this library is for you.

### 2. Cool stateless factories for lists and sets

```java
IntListFactory factory = FastList.ints;

// default
factory.create();

// with size
factory.create(10);

// of array of boxed types
factory.of(1, 2, 3);

// of array of primitive types
factory.ofArray(1, 2, 3);

// convert from another type
List<String> stringList = FastList.objects.of("1", "2", "3");
factory.convert(stringList, Integer::parseInt);

// make unmodifiable of synchronized
factory.unmodifiable(factory.create());
factory.synchronize(factory.create());

// use collectors for streams
IntStream.of(1, 2, 3).boxed().collect(factory.collector());
IntStream.of(1, 2, 3).boxed().collect(factory.unmodifiableCollector());

// or use super cool builders
IntList list = factory.builder()
    .size(100)
    .content(1, 2, 3)
    .threadsafe()
    .unmodifiable()
    .build();
```

### 3. Simple map factory

```java
// default
FastMap.newMap();

// with size
FastMap.newByte2ShortSortedMap(30);

// of pairs (currently only for objects)
FastMap.newMap(
    Pair.of("s1", "s2")
);

// make unmodifiable or synchronized
FastMap.unmodifiable(FastMap.newInt2IntMap());
FastMap.synchronize(FastMap.newByte2FloatMap());
```

### 4. Guice support

You must add `fastutil-extender-guice` module for this.

Combine your modules with fastutil-extender:

```java
Module module = Modules.combine(/* your modules */, new FastUtilExtenderFactoriesModule());
```

Now factories will be injected into your classes:
```java
class Example {
    
    private final List<Object> list;

    @Inject
    public Example(BooleanListFactory booleanListFactory) {
        this.list = booleanListFactory.builder().threadsafe().build();
    }
}
```
