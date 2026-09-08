# java-design-patterns 中文文档

[![原项目](https://img.shields.io/badge/原项目-iluwatar--java-design-patterns-blue?style=flat-square&logo=github)](https://github.com/iluwatar/java-design-patterns)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square)](https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/LICENSE.md)
[![微信联系](https://img.shields.io/badge/微信-uaycar-brightgreen?style=flat-square&logo=wechat)](#)

> 本文档是 [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns) 官方 README 的中文翻译版。完整源代码请访问原项目:https://github.com/iluwatar/java-design-patterns
>
> **代部署 / 定制服务 / 技术咨询 请添加微信:uaycar**

## 简介(Introduction)

设计模式是程序员在设计应用程序或系统时,解决常见问题的最佳、最规范化的实践方案。

设计模式通过提供经过测试、久经验证的开发范式,能够显著加快开发进程。

复用设计模式有助于避免那些会引发严重问题的隐蔽缺陷,同时也能提升代码可读性——对于熟悉这些模式的开发者和架构师而言更是如此。

## 入门指南(Getting Started)

本项目展示了各种 Java 设计模式。这些解决方案由开源社区中经验丰富的程序员和架构师开发而成。你既可以通过模式的高层次描述来浏览它们,也可以直接阅读源代码。每个模式的源码示例都附有详尽注释,可以视为讲解如何实现某个特定模式的编程教程。项目使用的是最流行、经过实战检验的开源 Java 技术。

在深入学习之前,你应当先熟悉各种[软件设计原则](https://java-design-patterns.com/principles/)。

所有设计都应尽可能简单。你应当从 KISS、YAGNI 以及"做最简单可行的事"(Do The Simplest Thing That Could Possibly Work)这些原则出发。只有当实际扩展性需要时,才引入复杂度和设计模式。

熟悉这些概念后,你可以通过以下任意方式深入研究[可用的设计模式](https://java-design-patterns.com/patterns/):

- 按名称搜索特定模式。找不到想要的?欢迎[在此](https://github.com/iluwatar/java-design-patterns/issues)提交新模式建议。
- 使用标签浏览,例如 `Performance`(性能)、`Gang of Four`(四人帮经典)或 `Data access`(数据访问)。
- 按模式类别浏览,如 `Creational`(创建型)、`Behavioral`(行为型)等。

希望本项目中展示的面向对象解决方案能对你的架构工作有所帮助,也希望你在学习这些模式的过程中,能收获与我们开发它们时同样的乐趣。

## 模式体系一览

原项目将模式组织为多个类别,常见的包括:

- **创建型模式(Creational)**:如单例(Singleton)、工厂方法(Factory Method)、抽象工厂(Abstract Factory)、建造者(Builder)、原型(Prototype)、对象池(Object Pool)等,关注对象的创建方式。
- **行为型模式(Behavioral)**:如观察者(Observer)、策略(Strategy)、状态(State)、命令(Command)、责任链(Chain of Responsibility)、访问者(Visitor)等,关注对象间的协作与职责分配。
- **结构型与其他模式**:如装饰器(Decorator)、适配器(Adapter)、代理(Proxy)、外观(Facade)、桥接(Bridge)等,关注类与对象的组合结构。

此外还有大量现代企业级实用模式,如微服务相关模式、事件驱动架构模式、数据访问模式等,均配有可运行的 Java 示例工程。完整目录请见 [java-design-patterns.com/patterns](https://java-design-patterns.com/patterns/)。

## 如何构建与运行

1. 安装 JDK(建议 17 或更高版本)与 Maven。
2. 克隆仓库:

```bash
git clone https://github.com/iluwatar/java-design-patterns.git
cd java-design-patterns
```

3. 一次性构建全部模式示例:

```bash
mvn clean install
```

4. 进入任意模式目录(例如 `singleton`),编译并运行该模式的演示入口类:

```bash
cd singleton
mvn clean compile
mvn exec:java -Dexec.mainClass="com.iluwatar.singleton.App"
```

5. 每个模式目录都包含独立的 README 与单元测试,建议对照代码注释逐段阅读,效果最佳。

## 如何贡献(How to Contribute)

如果你愿意为项目做贡献,可以在项目的[开发者 Wiki](https://github.com/iluwatar/java-design-patterns/wiki) 中找到相关信息。维护者会在 [Gitter 聊天室](https://gitter.im/iluwatar/java-design-patterns)中为你提供帮助并解答问题。

## 相关书籍(The Book)

该设计模式合集已出版电子书《Open Source Java Design Patterns》,详情见:https://payhip.com/b/bNQFX

项目贡献者可以免费获得这本书:通过 [Gitter 聊天室](https://gitter.im/iluwatar/java-design-patterns)或电子邮件(iluwatar (at) gmail (dot) com)联系维护者,发送包含你的邮箱、GitHub 用户名以及一条已合并 PR 链接的消息即可。

## 许可证(License)

本项目基于 MIT 许可证开源。

---

本项目为 [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns) 的中文翻译文档,所有代码版权归原项目作者所有,遵循其原始 MIT 许可证。

**代部署 / 定制服务 / 技术咨询 请添加微信:uaycar**

**如果觉得有用,请给原项目点个 Star!** ⭐
