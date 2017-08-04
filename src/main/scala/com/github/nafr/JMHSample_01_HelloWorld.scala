package com.github.nafr


import org.openjdk.jmh.annotations._

class JMHSample_01_HelloWorld {
  /*
   * This is our first benchmark method.
   *
   * The contract for the benchmark methods is very simple:
   * annotate it with @GenerateMicroBenchmark, and you are set to go.
   * JMH will run the test by continuously calling this method, and measuring
   * the performance metrics for its execution.
   *
   * The method names are non-essential, it matters they are marked with
   * @GenerateMicroBenchmark. You can have multiple benchmark methods
   * within the same class.
   *
   * Note: if the benchmark method never finishes, then JMH run never
   * finishes as well. If you throw the exception from the method body,
   * the JMH run ends abruptly for this benchmark, and JMH will run
   * the next benchmark down the list.
   *
   * Although this benchmark measures "nothing", it is the good showcase
   * for the overheads the infrastructure bear on the code you measure
   * in the method. There are no magical infrastructures which incur no
   * overhead, and it's important to know what are the infra overheads
   * you are dealing with. You might find this thought unfolded in future
   * examples by having the "baseline" measurements to compare against.
   */

  @Benchmark
  def wellHelloThere(): Unit = {
    // this method was intentionally left blank.
  }

}