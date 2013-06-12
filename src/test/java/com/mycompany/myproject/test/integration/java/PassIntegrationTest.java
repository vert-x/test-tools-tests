package com.mycompany.myproject.test.integration.java;/*
 * Copyright 2013 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */

import org.junit.Test;
import org.vertx.java.core.VoidHandler;
import org.vertx.java.core.json.JsonObject;
import org.vertx.testtools.TestVerticle;
import org.vertx.testtools.VertxAssert;

/**
 * Everything in this test should PASS
 */
public class PassIntegrationTest extends TestVerticle {

  @Test
  public void testAssertOK() {
    VertxAssert.assertEquals("foo", "foo");
    VertxAssert.assertTrue(true);
    VertxAssert.testComplete();
  }

  @Test
  public void testAssertOKFromHandler()  {
    vertx.runOnContext(new VoidHandler() {
      @Override
      protected void handle() {
        VertxAssert.assertEquals("foo", "foo");
        VertxAssert.assertTrue(true);
        VertxAssert.testComplete();
      }
    });
  }

  @Test
  public void testAssertOKFromVerticle() {
    JsonObject conf = new JsonObject().putString("type", "assert_ok");
    container.deployVerticle(com.mycompany.myproject.test.integration.java.TestVerticle.class.getName(), conf);
  }


}
