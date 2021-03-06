/*
 * Copyright 2014 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.spark.magic.dependencies

import java.io.OutputStream

import com.ibm.spark.magic.Magic

trait IncludeOutputStream {
  this: Magic =>

  //val outputStream: OutputStream
  private var _outputStream: OutputStream = _
  def outputStream: OutputStream = _outputStream
  def outputStream_=(newOutputStream: OutputStream) =
    _outputStream = newOutputStream
}
