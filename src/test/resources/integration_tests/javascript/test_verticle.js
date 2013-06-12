
var container = require("vertx/container")
var vertx = require("vertx");
var vertxTests = require("vertx_tests");
var vassert = require("vertx_assert");

var type = container.config['type']

switch (type) {
  case 'fail':
    vassert.fail("failed");
    break;
  case 'assert_fail':
    vassert.assertEquals('foo', 'bar');
    break;
  case 'assert_ok':
    vassert.assertEquals('foo', 'foo');
    vassert.testComplete();
}

