/**
 * Simple integration test which shows tests deploying other verticles, using the Vert.x API etc
 */

import com.mycompany.myproject.test.integration.java.TestVerticle

import static org.vertx.testtools.VertxAssert.*

// And import static the VertxTests script
import org.vertx.groovy.testtools.VertxTests

// TODO
def testHTTP() {

}


VertxTests.initialize(this)
VertxTests.startTests(this)


