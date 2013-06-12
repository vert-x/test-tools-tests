
from org.vertx.testtools import VertxAssert
import vertx_tests
from core.event_bus import EventBus
import vertx

def test_foo():
    VertxAssert.testComplete()

raise Exception('throw_exception')

vertx_tests.start_tests(locals())



