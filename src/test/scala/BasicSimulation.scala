import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BasicSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://httpbin.org")

  val scn = scenario("Basic Test")
    .exec(
      http("GET request")
        .get("/get")
        .check(status.is(200))
    )

  setUp(
    scn.inject(atOnceUsers(5))
  ).protocols(httpProtocol)
}
