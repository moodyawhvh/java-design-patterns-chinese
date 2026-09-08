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
 * 双重检查锁(Double check locking)实现的单例模式。
 *
 * <p>参考资料:http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 *
 * <p>注意:该写法在 Java 1.4 及之前版本中是有缺陷的(broken)。
 */
public final class ThreadSafeDoubleCheckLocking {
  /**
   * 类的单例实例。声明为 volatile,以保证多线程访问时的可见性与原子性。
   */
  private static volatile ThreadSafeDoubleCheckLocking instance;

  /** 私有构造器,防止外部客户端直接实例化。 */
  private ThreadSafeDoubleCheckLocking() {
    // 防止通过反射调用进行实例化
    if (instance != null) {
      throw new IllegalStateException("Already initialized.");
    }
  }

  /**
   * 公开的实例访问器。
   *
   * @return 该类的单例实例。
   */
  public static ThreadSafeDoubleCheckLocking getInstance() {
    // 使用局部变量可使性能提升约 25%
    // 出自 Joshua Bloch《Effective Java(第二版)》第 283-284 页

    var result = instance;
    // 检查单例实例是否已经初始化。
    // 若已初始化,直接返回该实例。
    if (result == null) {
      // 实例尚未初始化,但并不能确定,因为其他线程可能在此期间已经完成了初始化。
      // 因此必须对对象加锁以获得互斥性,确保万无一失。
      synchronized (ThreadSafeDoubleCheckLocking.class) {
        // 再次把实例赋给局部变量,检查在当前线程阻塞等待进入锁定区的期间,
        // 是否已有其他线程完成了初始化。
        // 若已初始化,则和上一次判空一样,直接返回先前创建好的实例。
        result = instance;
        if (result == null) {
          // 实例仍未初始化,此时可以安全地
          // (其他线程无法进入此代码块)
          // 创建实例,并将其作为我们的单例实例。
          result = new ThreadSafeDoubleCheckLocking();
          instance = result;
        }
      }
    }
    return result;
  }
}
