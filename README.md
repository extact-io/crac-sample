# crac-sample
> 豆蔵デベロッパーサイトのブログ記事で利用しているサンプルコード

## 利用している記事
- [CRaCによるJavaの高速化](https://developer.mamezou-tech.com/blogs/2022/12/02/jdk-crac/)

|内容| 記事の利用箇所 |
|---|---|
| [Dockerfile](./Dockerfile/)| Javaの実行環境の準備  |
| [loop-count](./loop-count/)| 基本的な動作を理解する |
| [person-service](./person-service/)| Helidonで効果を確認してみる |

## ビルドと実行
サンプルアプリのビルドにはJava17以上とMavenが必要です

### リポジトリclone
```shell
# Clone this repository
git clone https://github.com/extact-io/crac-sample.git
```

### loop-countのビルド
```shell
# Go into loop-count
cd crac-sample/loop-count
# build application
mvn clean package
```

### person-serviceのビルド
```shell
# Go into person-service
cd crac-sample/person-service
# build application
mvn clean package
```

## 実行
記事をの[こちら](https://developer.mamezou-tech.com/blogs/2022/12/02/jdk-crac/#cracを試してみる)を参照
