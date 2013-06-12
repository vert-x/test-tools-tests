
var container = require("vertx/container")
var vertx = require("vertx");
var vertxTests = require("vertx_tests");
var vassert = require("vertx_assert");

function testFailDirect() {
  vassert.fail("failed")
}

function testAssertFailedDirect() {
  vassert.assertEquals("foo", "bar")
}

function testFailFromHandler() {
  vertx.runOnContext(function() {
    vassert.fail("failed")
  });
}

function testAssertFailedFromHandler() {
  vertx.runOnContext(function() {
    vassert.assertEquals("foo", "bar")
  });
}

function testFailFromVerticle() {
  container.deployVerticle("test_verticle.js", {type:"fail"})
}

function testAssertFailedFromVerticle() {
  container.deployVerticle("test_verticle.js", {type:"assert_fail"})
}

vertxTests.startTests(this);




