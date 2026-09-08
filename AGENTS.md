> 🌐 本文档由 [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns) 翻译,英文原版见原项目。

# Java 设计模式 - AI 智能体背景说明

## 快速概览
- 本仓库是一个使用 Java 实现的设计模式大全。
- 本项目展示如何运用标准设计模式解决常见的软件设计问题。
- 每个模式的代码直接存放在本仓库中,并配有相应的说明 README。
- 这些 README 会发布到 java-design-patterns.com 网站。
- 另一个仓库(https://github.com/iluwatar/java-design-patterns-vuepress-web)负责该网站的部署。

## 技术栈
- **Java 21**:模式实现所用的主要编程语言。
- **Maven**:依赖管理与构建工具。
- **JUnit 5**:用于验证模式行为的测试框架。
- **Mockito**:在单元测试中对依赖进行模拟(mock)。
- **Lombok**:用于减少样板代码(getter、setter 等)。
- **Spotless**:通过 Google Java Format 强制统一的代码格式。

## 可信资料来源
- [Java SE 21 官方文档](https://docs.oracle.com/en/java/javase/21/docs/api/)
- [Maven 官方文档](https://maven.apache.org/guides/index.html)
- [JUnit 5 用户指南](https://junit.org/junit5/docs/current/user-guide/)
- [项目 Wiki](https://github.com/iluwatar/java-design-patterns/wiki)

## 目录结构
- `/pom.xml`:根 Maven 配置文件,定义全局依赖并列出所有模式模块。
- `/[pattern-name]/`:每个设计模式独占一个文件夹(如 `/abstract-factory`、`/builder`),各自作为独立的 Maven 模块。
- `/[pattern-name]/src/main/java/`:存放该设计模式的具体 Java 实现类。
- `/[pattern-name]/src/test/java/`:存放验证该模式行为的 JUnit 测试。
- `/[pattern-name]/README.md`:该模式的文档,会发布到主站。

## 模式编写要求
- 保持模式实现简单、原子化、易于理解。
- 为类、接口和方法使用描述性强、含义清晰的命名。
- 每个新模式或每次代码修改都必须附带完整的单元测试。
- 严格遵循 Google Java Format(由 Spotless 强制执行)。
- 在每个模块的 `README.md` 中清晰说明意图(intent)、解释和真实世界用法。

## 反模式(禁止事项)
- 避免通过引入不必要的外部依赖或复杂框架把模式复杂化。
- 不要引入偏离设计模式核心机制的的业务逻辑。
- 强烈不建议提交没有对应单元测试的新模式或新功能。
- 避免庞大的单体包;每个模式都应放在自己独立的模块中。

## 新增设计模式示例流程
向仓库添加新设计模式时,一般遵循以下步骤:
- **创建模块**:在根目录为该模式新建一个文件夹(如 `/my-new-pattern`)。
- **更新根 pom.xml**:在根 `pom.xml` 的 `<modules>` 部分添加 `<module>my-new-pattern</module>`。
- **添加模块 pom.xml**:在新文件夹内创建继承父工程的 `pom.xml`。
- **编写代码**:在 `src/main/java/com/iluwatar/mynewpattern` 下实现模式逻辑,通常包含一个演示用法的 `App.java` 类。
- **编写测试**:在 `src/test/java/com/iluwatar/mynewpattern` 下添加完整的单元测试。
- **编写文档**:在新模块根目录创建 `README.md`,按惯例包含意图(Intent)、解释(Explanation)、类图(Class diagram)、适用场景(Applicability)、真实案例(Real world examples)等标准章节。
