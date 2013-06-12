
import java.lang.Exception
import java.lang.RuntimeException
import java.lang.Throwable
import java.lang.Error
from org.vertx.testtools import VertxAssert
import vertx_tests
from core.event_bus import EventBus
import vertx

def test_syntax_error():
    # Deliberate syntax error
    wdqwd qwdqwd qwdqwd qwd

vertx_tests.start_tests(locals())



