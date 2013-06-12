
var container = require("vertx/container")
var vertx = require("vertx");
var vertxTests = require("vertx_tests");
var vassert = require("vertx_assert");

function testAssertOK() {
  vassert.assertEquals("foo", "foo")
  vassert.testComplete()
}

function testAssertOKFromHandler() {
  vertx.runOnContext(function() {
    vassert.assertEquals("foo", "foo")
    vassert.testComplete()
  });
}

function testAssertOKFromVerticle() {
  container.deployVerticle("test_verticle.js", {type:"assert_ok"})
}

vertxTests.startTests(this);




