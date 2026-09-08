<div align="center">

# java-design-patterns 中文翻译版

**[中文版] java-design-patterns — 用 Java 实现的经典设计模式宝典,含数百个注释完善的示例工程**

[![原项目](https://img.shields.io/badge/原项目-iluwatar--java-design-patterns-blue?style=flat-square&logo=github)](https://github.com/iluwatar/java-design-patterns)
[![中文文档](https://img.shields.io/badge/中文文档-README.zh--CN.md-orange?style=flat-square)](README.zh-CN.md)
[![GitHub Stars](https://img.shields.io/github/stars/iluwatar/java-design-patterns?style=flat-square&label=原项目Stars)](https://github.com/iluwatar/java-design-patterns/stargazers)
[![微信联系](https://img.shields.io/badge/微信-uaycar-brightgreen?style=flat-square&logo=wechat)](#)

</div>

---

> 这是 [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns) 的中文翻译版本。
> 完整源代码请访问原项目:https://github.com/iluwatar/java-design-patterns

**代部署 / 定制服务 / 技术咨询 请添加微信:uaycar**

---

## 📖 项目简介

设计模式是程序员在设计应用或系统时解决常见问题的最佳、最成熟的经验总结。本项目由开源社区的资深程序员与架构师用 Java 实现了大量经典设计模式,每个模式都是一个独立、注释完善的小工程,既是可运行的示例,也是一步步教你如何实现该模式的编程教程。项目采用业界最主流、久经考验的开源 Java 技术栈,是学习面向对象设计与提升代码质量的一流资料。

## ✨ 主要特性

- **模式覆盖全面**:包含创建型、行为型等众多类别,既有 GoF 经典 23 式,也有大量现代企业开发中的实用模式
- **示例即教程**:每个模式的源码注释详尽,可直接当作该模式的实现教程阅读
- **久经考验的技术栈**:全部基于主流开源 Java 技术构建,贴近真实生产环境
- **多种浏览方式**:支持按模式名称搜索、按 `Performance`、`Gang of Four`、`Data access` 等标签浏览,或按模式类别浏览
- **社区活跃**:400+ 贡献者持续维护,配套网站 java-design-patterns.com 提供模式目录
- **质量有保障**:接入 CI 持续集成与 SonarCloud 代码质量/覆盖率检查,MIT 许可证开源
- **多语言生态**:原项目提供中文、日文、韩文等多语言本地化版本

## 📁 文件说明

| 文件 | 说明 |
|:-----|:-----|
| README.md | 本文件(中文简介) |
| README.zh-CN.md | 详细中文文档(完整汉化) |

## 🚀 快速开始

1. 准备环境:安装 JDK(建议 17+)与 Maven 构建工具
2. 克隆仓库:

```bash
git clone https://github.com/iluwatar/java-design-patterns.git
cd java-design-patterns
```

3. 构建整个项目:

```bash
mvn clean install
```

4. 进入某个感兴趣的模式目录(如 `singleton`),编译并运行其示例主类:

```bash
cd singleton
mvn clean compile
mvn exec:java -Dexec.mainClass="com.iluwatar.singleton.App"
```

5. 按名称、标签或类别浏览模式:可在仓库中搜索,或访问 https://java-design-patterns.com/patterns/ 查看完整模式目录
6. 阅读前建议先了解 KISS、YAGNI、"做最简单可行的事"等软件设计原则,只在真正需要扩展性时才引入模式

完整源代码与最新版本请访问原项目:https://github.com/iluwatar/java-design-patterns

## 📞 联系方式

**代部署 / 定制服务 / 技术咨询 请添加微信:uaycar**

---

本项目为 [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns) 的中文翻译版本,所有代码版权归原项目作者所有,遵循其原始许可证(MIT License)。

**如果觉得有用,请给原项目点个 Star!** ⭐
