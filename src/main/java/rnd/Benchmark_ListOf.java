package rnd;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 20)
@Measurement(iterations = 20)
@Fork(2)
public class Benchmark_ListOf {

  private String o = "";

  @Benchmark public List<String> explicit_00() { return ImmutableList.of0(); }
  @Benchmark public List<String> explicit_01() { return ImmutableList.of1(o); }
  @Benchmark public List<String> explicit_02() { return ImmutableList.of2(o,o); }
  @Benchmark public List<String> explicit_03() { return ImmutableList.of3(o,o,o); }
  @Benchmark public List<String> explicit_04() { return ImmutableList.of4(o,o,o,o); }
  @Benchmark public List<String> explicit_05() { return ImmutableList.of5(o,o,o,o,o); }
  @Benchmark public List<String> explicit_06() { return ImmutableList.of6(o,o,o,o,o,o); }
  @Benchmark public List<String> explicit_07() { return ImmutableList.of7(o,o,o,o,o,o,o); }
  @Benchmark public List<String> explicit_08() { return ImmutableList.of8(o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> explicit_09() { return ImmutableList.of9(o,o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> explicit_10() { return ImmutableList.of10(o,o,o,o,o,o,o,o,o,o); }

  @Benchmark public List<String> varargs_array_00() { return ImmutableList.copyOf(); }
  @Benchmark public List<String> varargs_array_01() { return ImmutableList.copyOf(o); }
  @Benchmark public List<String> varargs_array_02() { return ImmutableList.copyOf(o,o); }
  @Benchmark public List<String> varargs_array_03() { return ImmutableList.copyOf(o,o,o); }
  @Benchmark public List<String> varargs_array_04() { return ImmutableList.copyOf(o,o,o,o); }
  @Benchmark public List<String> varargs_array_05() { return ImmutableList.copyOf(o,o,o,o,o); }
  @Benchmark public List<String> varargs_array_06() { return ImmutableList.copyOf(o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_array_07() { return ImmutableList.copyOf(o,o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_array_08() { return ImmutableList.copyOf(o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_array_09() { return ImmutableList.copyOf(o,o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_array_10() { return ImmutableList.copyOf(o,o,o,o,o,o,o,o,o,o); }

  @Benchmark public List<String> varargs_switch_00() { return ImmutableList.of(); }
  @Benchmark public List<String> varargs_switch_01() { return ImmutableList.of(o); }
  @Benchmark public List<String> varargs_switch_02() { return ImmutableList.of(o,o); }
  @Benchmark public List<String> varargs_switch_03() { return ImmutableList.of(o,o,o); }
  @Benchmark public List<String> varargs_switch_04() { return ImmutableList.of(o,o,o,o); }
  @Benchmark public List<String> varargs_switch_05() { return ImmutableList.of(o,o,o,o,o); }
  @Benchmark public List<String> varargs_switch_06() { return ImmutableList.of(o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_switch_07() { return ImmutableList.of(o,o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_switch_08() { return ImmutableList.of(o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_switch_09() { return ImmutableList.of(o,o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> varargs_switch_10() { return ImmutableList.of(o,o,o,o,o,o,o,o,o,o); }

  @Benchmark public List<String> via_interface_00() { return List_JEP269.of(); }
  @Benchmark public List<String> via_interface_01() { return List_JEP269.of(o); }
  @Benchmark public List<String> via_interface_02() { return List_JEP269.of(o,o); }
  @Benchmark public List<String> via_interface_03() { return List_JEP269.of(o,o,o); }
  @Benchmark public List<String> via_interface_04() { return List_JEP269.of(o,o,o,o); }
  @Benchmark public List<String> via_interface_05() { return List_JEP269.of(o,o,o,o,o); }
  @Benchmark public List<String> via_interface_06() { return List_JEP269.of(o,o,o,o,o,o); }
  @Benchmark public List<String> via_interface_07() { return List_JEP269.of(o,o,o,o,o,o,o); }
  @Benchmark public List<String> via_interface_08() { return List_JEP269.of(o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> via_interface_09() { return List_JEP269.of(o,o,o,o,o,o,o,o,o); }
  @Benchmark public List<String> via_interface_10() { return List_JEP269.of(o,o,o,o,o,o,o,o,o,o); }

  public static void main(String[] args) throws RunnerException {
    Options options = new OptionsBuilder()
        .include(Benchmark_ListOf.class.getName())
        .build();
    new Runner(options).run();
  }

}
