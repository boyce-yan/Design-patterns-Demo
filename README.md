# 设计模式
23种设计模式讲解Demo

- 创建型模式 - 共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。
- 结构型模式 - 共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。
- 行为型模式 - 共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。
  

```css
design pattern
├── abstractfactory - [抽象工厂模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
├── adapter - [适配器模式](https://blog.csdn.net/qq_41977838/article/details/109470163?spm=1001.2014.3001.5501)
├── bridge - [桥接模式](https://blog.csdn.net/qq_41977838/article/details/109494556?spm=1001.2014.3001.5501)
├── builder - [建造者模式](https://blog.csdn.net/qq_41977838/article/details/109454590?spm=1001.2014.3001.55)
├── chain - [责任链模式](https://blog.csdn.net/qq_41977838/article/details/114238690?spm=1001.2014.3001.5501)
├── command - [命令模式](https://blog.csdn.net/qq_41977838/article/details/113510645?spm=1001.2014.3001.5501)
├── composite - [组合模式](https://blog.csdn.net/qq_41977838/article/details/112972326?spm=1001.2014.3001.5501)
├── decorator - [装饰者模式](https://blog.csdn.net/qq_41977838/article/details/109514741?spm=1001.2014.3001.5501)
├── facade - [外观模式](https://blog.csdn.net/qq_41977838/article/details/111425766?spm=1001.2014.3001.5501)
├── factory - [工厂模式](https://blog.csdn.net/qq_41977838/article/details/105961959?spm=1001.2014.3001.5501)
├── flyweight - [享元模式](https://blog.csdn.net/qq_41977838/article/details/113196756?spm=1001.2014.3001.5501)
├── interpreter - [解释器模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
├── iterator - [迭代器模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
├── mediator - [中介者模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
├── memento - [备忘录模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
├── observer - [观察者模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
├── prototype - [原型模式](https://blog.csdn.net/qq_41977838/article/details/109453041?spm=1001.2014.3001.5501)
├── proxy - [代理模式](https://blog.csdn.net/qq_41977838/article/details/106039612?spm=1001.2014.3001.5501)
├── singleton - [单例模式](https://blog.csdn.net/qq_41977838/article/details/105960058?spm=1001.2014.3001.5501)
├── state - [状态模式](https://blog.csdn.net/qq_41977838/article/details/114065395?spm=1001.2014.3001.5501)
├── strategy - [策略模式](https://blog.csdn.net/qq_41977838/article/details/114126943?spm=1001.2014.3001.5501)
├── template - [模版模式](https://blog.csdn.net/qq_41977838/article/details/113467958?spm=1001.2014.3001.5501)
└── visitor - [访问者模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
```

文章目录：

- [深入理解23种设计模式(1) -- 单例模式](https://blog.csdn.net/qq_41977838/article/details/105960058?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(2) -- 工厂模式](https://blog.csdn.net/qq_41977838/article/details/105961959?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(3) -- 原型模式](https://blog.csdn.net/qq_41977838/article/details/109453041?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(4) -- 建造者模式](https://blog.csdn.net/qq_41977838/article/details/109454590?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(5) -- 适配器模式](https://blog.csdn.net/qq_41977838/article/details/109470163?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(6) -- 桥接模式](https://blog.csdn.net/qq_41977838/article/details/109494556?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(7) -- 装饰者模式](https://blog.csdn.net/qq_41977838/article/details/109514741?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(8) -- 组合模式](https://blog.csdn.net/qq_41977838/article/details/112972326?spm=1001.2014.3001.550)
- [深入理解23种设计模式(9) -- 外观模式](https://blog.csdn.net/qq_41977838/article/details/111425766?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(10) -- 享元模式](https://blog.csdn.net/qq_41977838/article/details/113196756?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(11) -- 代理模式](https://blog.csdn.net/qq_41977838/article/details/106039612?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(12) -- 模版方法模式](https://blog.csdn.net/qq_41977838/article/details/113467958?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(13) -- 命令模式](https://blog.csdn.net/qq_41977838/article/details/113510645?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(14) -- 访问者模式](https://blog.csdn.net/qq_41977838/article/details/113846788?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(15) -- 迭代器模式](https://blog.csdn.net/qq_41977838/article/details/113852571?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(16) -- 观察者模式](https://blog.csdn.net/qq_41977838/article/details/113917330?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(17) -- 中介者模式](https://blog.csdn.net/qq_41977838/article/details/113944005?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(18) -- 备忘录模式](https://blog.csdn.net/qq_41977838/article/details/114014476?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(19) --解释器模式](https://blog.csdn.net/qq_41977838/article/details/114018348?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(20) -- 抽象工厂模式](https://blog.csdn.net/qq_41977838/article/details/114030764?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(21) -- 状态模式](https://blog.csdn.net/qq_41977838/article/details/114065395?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(22) -- 策略模式](https://blog.csdn.net/qq_41977838/article/details/114126943?spm=1001.2014.3001.5501)
- [深入理解23种设计模式(23) -- 责任链模式](https://blog.csdn.net/qq_41977838/article/details/114238690?spm=1001.2014.3001.5501)

- 喜欢的兄弟姐妹 或者 对您有启发的兄弟姐妹 点点 **Star**