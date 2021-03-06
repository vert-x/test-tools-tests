package com.mycompany.myproject.test.unit;

import com.mycompany.myproject.PingVerticle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/*
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
public class ExampleUnitTest {

  @Test
  public void testThrowRuntime() {
    // Should cause red failure
    throw new RuntimeException("foo");
  }

  @Test
  public void testThrowChecked() throws Exception {
    // Should cause red failure
    throw new Exception("foo");
  }

  @Test
  public void testThrowError() throws Error {
    // Should cause red failure
    throw new Error("foo");
  }

  @Test
  public void testThrowThrowable() throws Throwable {
    // Should cause red failure
    throw new Throwable("foo");
  }

  @Test
  public void testFail()  {
    // Should cause orange failure
    Assert.fail("failed");
  }
}
