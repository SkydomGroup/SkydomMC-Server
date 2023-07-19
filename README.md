# SkydomMC-Server

<div align=center>
    <img src="./Skydom.png">
    <br /><br />
    <p>Fork of <a href="https://Github.com/PaperMC/Paper">Paper</a> which modify functions prohibited by Paper.</p>
</div>

[![SkydomMC-Server CI](https://Github.com/SkydomGroup/SkydomMC-Server/actions/workflows/build.yml/badge.svg)](https://Github.com/SkydomGroup/SkydomMC-Server/actions/workflows/build.yml/)

## English

### What is it?

* This project is a branch of [Paper](https://Papermc.io/Software/Paper).
* [Paper's Repository](https://Github.com/PaperMC/Paper/)
* [Paper's Website](https://PaperMc.io/Software/Paper)
* The server core of [Minecraft Skydom Server](https://www.Skydom.org/) technology survival mode.

### What has been modified?

* Changed return information.
* Added support for sand during.
* Unprotected blocks.
* Fix tripwire update.

### How to use it?

#### The first method.
* Download the compiled jar from [Actions](https://Github.com/SkydomGroup/SkydomMC-Server/actions/workflows/build.yml).

#### The second approach.
* Clone this repo.
* Run `./gradlew applyPatches`, then `./gradlew createReobfPaperclipJar` from your terminal.
* You can find the compiled jar in the project root's *build/libs* directory.


## 中文(简体)

### 这是什么？

* 这是一个 [Paper](https://PaperMc.io/Software/Paper) 的分支。
* [Paper 的存储库](https://Github.com/PaperMC/Paper/)
* [Paper 的官方网站](https://PaperMc.io/Software/Paper)
* [Minecraft Skydom Server](https://www.Skydom.org/) 生电服所使用的核心。

### 修改了什么？

* 更改了返回信息。
* 新增了对刷沙机的支持。
* 取消了对方块的保护。
* 新增了对刷线机的支持。

### 我该如何使用它？

#### 第一种办法。
* 到 [Actions](https://github.com/SkydomGroup/SkydomMC-Server/actions/workflows/build.yml) 去下载编译好的jar。

#### 第二种办法。
* 克隆这个存储库。
* 运行 `./gradlew applyPatches`后，再运行`./gradlew createReobfPaperclipJar` 在你的终端。
* 运行完成后，您可以在 *build/libs* 找到构建好的Jar。