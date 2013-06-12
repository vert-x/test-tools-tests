# Always require "vertx_tests" at the top of your test script
require "vertx_tests"
require "vertx"

# TODO - These don't currently work

def test_fail_direct
  VertxAssert.fail('failed')
end

def test_assert_failed_direct
  VertxAssert.assertEquals('foo', 'bar')
end

def test_fail_from_handler
  vertx.run_on_context do
    VertxAssert.fail('failed')
  end
end

def test_assert_failed_from_handler
  vertx.run_on_context do
    VertxAssert.assertEquals('foo', 'bar')
  end
end

start_tests(self)




