/*
 * This project is licensed under the MIT license. Module model-view-viewmodel is using ZK framework licensed under LGPL (see lgpl-3.0.txt).
 *
 * The MIT License
 * Copyright © 2014-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.singleton;

/**
 * Bill Pugh 单例实现(静态内部类方式)。
 *
 * <p>这种单例模式的实现利用了 Java 内存模型对类初始化的保证:每个类只会在首次被使用时初始化一次。
 * 如果类尚未被使用,它就不会被加载进内存,也不会为静态实例分配内存。
 * 这使得单例实例既是懒加载的,又是线程安全的。
 */
public final class BillPughImplementation {

  /** 私有构造器,防止在类外部实例化。 */
  private BillPughImplementation() {
    // 防止通过反射调用进行实例化
    if (InstanceHolder.instance != null) {
      throw new IllegalStateException("Already initialized.");
    }
  }

  /**
   * InstanceHolder 是一个静态内部类,负责持有单例实例。
   * 在 getInstance() 方法被调用之前,它不会被加载进内存。
   */
  private static class InstanceHolder {
    /** 该类的单例实例。 */
    private static BillPughImplementation instance = new BillPughImplementation();
  }

  /**
   * 单例实例的公开访问器。
   *
   * <p>当该方法被调用时,InstanceHolder 会被加载进内存并创建单例实例。
   * 该方法为单例实例提供了全局访问点。
   *
   * @return 该类的单例实例。
   */
  // 全局访问点
  public static BillPughImplementation getInstance() {
    return InstanceHolder.instance;
  }
}
