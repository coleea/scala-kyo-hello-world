# Kyo - hello world 

## What is Kyo ?

according to [idimatics soft](https://idiomaticsoft.com/post/2024-01-02-effect-systems/), kyo is like below

> recently, at the Functional Scala conference a new effect system called Kyo was released. Where ZIO creates a super ZIO monad combining IO, dependency injection and short-circuiting, Kyo allows for an arbitrary number of effects. Thanks to algebraic effects, Kyo aims to provide a more general approach to effect handling, given that algebraic effects are composable. Now that you are familiar with what an effect system like Kyo is supposed to do, you can evaluate yourself. I personally, see it as a very promising framework.

> The approach of Kyo is based on `algebraic effects`. Algebraic effects are a relatively novel concept. Basically, researchers managed to find a general semantics for effects that is defined by equations. This fact has allowed programming language researchers to better understand effects and prove that algebraic effects are freely composable. This composability makes them qualitatively better than the existing monadic effects that are provided by cats-effets and ZIO, as no monad transformers are needed to compose effects.


Korean Tralslated Version

> 최근 Functional Scala 컨퍼런스에서 Kyo라는 새로운 이펙트 시스템이 발표되었습니다. ZIO는 IO, 의존성 주입, 단축 회로를 결합한 슈퍼 ZIO 모나드를 생성하는 반면, Kyo는 임의의 수의 이펙트를 허용합니다. 대수적 이펙트 덕분에 Kyo는 대수적 이펙트가 합성 가능하다는 점을 고려할 때, 이펙트 처리에 대한 보다 일반적인 접근 방식을 제공하는 것을 목표로 합니다. 이제 Kyo와 같은 이펙트 시스템이 수행해야 하는 작업에 대해 잘 알게 되었으므로, 스스로 평가할 수 있습니다. 저는 개인적으로 Kyo를 매우 유망한 프레임워크로 봅니다.

> Kyo의 접근 방식은 대수적 이펙트를 기반으로 합니다. 대수적 이펙트는 비교적 새로운 개념입니다. 기본적으로 연구자들은 방정식으로 정의되는 이펙트에 대한 일반적인 의미론을 찾는 데 성공했습니다. 이 사실은 프로그래밍 언어 연구자들이 이펙트를 더 잘 이해하고 대수적 이펙트가 자유롭게 합성될 수 있음을 증명할 수 있게 해주었습니다. 이러한 합성 가능성은 모나드 변환기가 필요하지 않기 때문에 cats-effets와 ZIO에서 제공하는 기존의 모나딕 이펙트보다 질적으로 우수합니다.






## Resources

- [Official Github Repo](https://github.com/getkyo/kyo)
- [Official Website](https://getkyo.io/#/?id=introduction)
- [Youtube Video - Releasing Kyo: When Performance Meets Elegance In Scala by Flavio Brasil](https://www.youtube.com/watch?v=FXkYKQRC9LI)
- [Author's Twitter Account](https://twitter.com/fbrasisil)


## how to run

for production 
```
sbt run
```

for hot-reload
```
sbt ~run
```

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).
