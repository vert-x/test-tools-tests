from org.vertx.testtools import VertxAssert
import vertx_tests
from core.event_bus import EventBus
import vertx

type = vertx.config()['type']

if type == 'fail':
    VertxAssert.fail('failed')
elif type == 'assert_fail':
    VertxAssert.assertEquals('foo', 'bar')
elif type == 'assert_ok':
    VertxAssert.assertEquals('foo', 'foo')
    VertxAssert.testComplete()


