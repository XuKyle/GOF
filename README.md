# GOF
设计模式：kotlin & java 描述

## 1. iterator 设计模式

#### iterator 迭代器
定义按顺序逐个遍历元素的接口

#### concreteIterator迭代器
实现iterator角色定义的接口

### aggregate 集合
负责定义创建iterator角色的接口

### concreteAggregate
负责实现aggregate角色定义的接口