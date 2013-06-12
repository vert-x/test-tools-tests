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
import org.vertx.testtools.VertxAssert;

/**
 * Everything in this test SHOULD fail with  YELLOW failures!!
 */
public class AssertionFailedIntegrationTest extends org.vertx.testtools.TestVerticle {

  @Test
  public void testFailDirect()  {
    VertxAssert.fail("failed");
  }

  @Test
  public void testAssertFailDirect()  {
    VertxAssert.assertEquals("foo", "bar");
  }

  @Test
  public void testFailFromHandler()  {
    vertx.runOnContext(new VoidHandler() {
      @Override
      protected void handle() {
        VertxAssert.fail("failed");
      }
    });

  }

  @Test
  public void testAssertFailFromHandler()  {
    vertx.runOnContext(new VoidHandler() {
      @Override
      protected void handle() {
        VertxAssert.assertEquals("foo", "bar");
      }
    });

  }

  @Test
  public void testFailFromVerticle() {
    JsonObject conf = new JsonObject().putString("type", "fail");
    container.deployVerticle(TestVerticle.class.getName(), conf);
  }

  @Test
  public void testAssertFailFromVerticle() {
    JsonObject conf = new JsonObject().putString("type", "assert_fail");
    container.deployVerticle(TestVerticle.class.getName(), conf);
  }



}
