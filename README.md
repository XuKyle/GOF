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

## 2. adapter 设计模式
### target 对象
定义所需的方法：Print interface or Print class
### client 请求者
使用target角色定义的方法进行具体的处理
### adaptee 被适配
持有既定方法的角色 ： Banner
### adapter 适配者
主人公，使用adaptee满足target的需求




















