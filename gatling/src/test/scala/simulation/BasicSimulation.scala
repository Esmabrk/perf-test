import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.scenario.Simulation

class BasicSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://httpbin.org")

  val scn = scenario("Basic Load Test")
    .exec(
      http("GET Request")
        .get("/get")
        .check(status.is(200))
    )

  setUp(
    scn.inject(atOnceUsers(5))
  ).protocols(httpProtocol)
}