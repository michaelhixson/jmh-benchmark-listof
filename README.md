This is a JMH benchmark evaluating whether public fixed-argument overloads for the `List.of(...)` factory methods improve performance.

To build:

    mvn clean package

To run:

    java -jar target/benchmarks.jar

To run and profile the garbage collector:

    java -jar target/benchmarks.jar -prof gc

Thanks to Peter Levart for the suggestion to switch on the varargs argument length, which allows for some JIT optimizations:

http://mail.openjdk.java.net/pipermail/core-libs-dev/2015-November/036382.html

See also:

http://openjdk.java.net/jeps/269
