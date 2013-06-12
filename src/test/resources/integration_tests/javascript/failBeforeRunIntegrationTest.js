
var container = require("vertx/container")
var vertx = require("vertx");
var vertxTests = require("vertx_tests");
var vassert = require("vertx_assert");

function testFoo() {
  vassert.testComplete();
}

throw "foo"

vertxTests.startTests(this);




