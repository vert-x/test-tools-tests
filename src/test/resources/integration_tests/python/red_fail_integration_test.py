
import java.lang.Exception
import java.lang.RuntimeException
import java.lang.Throwable
import java.lang.Error
from org.vertx.testtools import VertxAssert
import vertx_tests
from core.event_bus import EventBus
import vertx

def test_throw_python_exception():
    raise Exception('foo')

def test_throw_java_exception():
    raise java.lang.Exception('foo')

def test_throw_java_runtime_exception():
    raise java.lang.RuntimeException('foo')

def test_throw_java_throwable():
    raise java.lang.Throwable('foo')

def test_throw_java_error():
    raise java.lang.Error('foo')

def test_test_error():
    # Deliberate language error in test
    print x




vertx_tests.start_tests(locals())



