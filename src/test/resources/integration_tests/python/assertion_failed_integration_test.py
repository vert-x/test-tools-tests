
from org.vertx.testtools import VertxAssert
import vertx_tests
from core.event_bus import EventBus
import vertx

def test_fail_direct():
    VertxAssert.fail("failed")

def test_assert_failed_direct():
    VertxAssert.assertEquals("foo", "bar")

def test_fail_from_handler():
    @vertx.run_on_context
    def handler():
        VertxAssert.fail("failed")

def test_assert_failed_from_handler():
    @vertx.run_on_context
    def handler():
        VertxAssert.assertEquals("foo", "bar")

def test_fail_from_verticle():
    conf = {'type' : 'fail'}
    vertx.deploy_verticle('test_verticle.py', conf)

def test_assert_failed_from_verticle():
    conf = {'type' : 'assert_fail'}
    vertx.deploy_verticle('test_verticle.py', conf)


vertx_tests.start_tests(locals())



