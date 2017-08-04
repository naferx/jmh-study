import com.danielasfregola.randomdatagenerator.RandomDataGenerator._
import org.scalacheck.{Arbitrary, Gen}

case class Example(text: String, n: Int)

implicit val arb = Arbitrary(Gen.alphaStr)

val example: Example = random[Example]
val example2: Example = random[Example]
val examples = random[Example](5)

example
example2.text