
var container = require("vertx/container")
var vertx = require("vertx");
var vertxTests = require("vertx_tests");
var vassert = require("vertx_assert");

function testThrowRuntimeDirect() {
  throw new java.lang.RuntimeException("throw runtime");
}

function testThrowCheckedDirect() {
  throw new java.lang.Exception("throw runtime");
}

function testThrowErrorDirect() {
  throw new java.lang.Error("throw runtime");
}

function testThrowThrowableDirect() {
  throw new java.lang.Throwable("throw runtime");
}

function testThrowString() {
  throw "wibble"
}

function testTestError() {
  // Should give error - x is not defined
  if (x == 3) {
    console.log("foo")
  }
}

vertxTests.startTests(this);




