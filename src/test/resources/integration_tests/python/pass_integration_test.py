
from org.vertx.testtools import VertxAssert
import vertx_tests
from core.event_bus import EventBus
import vertx

def test_assert_ok():
    VertxAssert.assertEquals('foo', 'foo')
    VertxAssert.testComplete()

def test_assert_ok_from_handler():
    @vertx.run_on_context
    def handler():
        VertxAssert.assertEquals("foo", "foo")
        VertxAssert.testComplete()

def test_assert_ok_from_verticle():
    conf = {'type' : 'assert_ok'}
    vertx.deploy_verticle('test_verticle.py', conf)


vertx_tests.start_tests(locals())



