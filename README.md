# LeetCode题解

## 在线阅读

<https://algorithm-essentials.soulmachine.me/>

## PDF下载

<a href="https://github.com/soulmachine/leetcode/raw/master/C%2B%2B/leetcode-cpp.pdf">LeetCode题解(C++版).pdf</a>

C++ 文件夹下是C++版，内容一模一样，代码是用C++写的。

Java 文件夹下是Java版，目前正在编写中，由于拖延症，不知道猴年马月能完成。

## 如何编译PDF

### 命令行编译

```bash
docker run -it --rm -v $(pwd)/C++:/project -w /project soulmachine/texlive xelatex -interaction=nonstopmode leetcode-cpp.tex
```

### vscode下编译

本项目已经配置好了vscode devcontainer, 可以在 Windows, Linux 和 macOS 三大平台上编译。

用 vscode 打开本项目，选择右下角弹出的 `"Reopen in Container"`，就会在容器中打开本项目，该容器安装了 Tex Live 2022 以及所需要的10个字体。

点击vscode左下角的齿轮图标，选择 `Command Palette`，输入`tasks`, 选择 `Run Task`， 选择 `leetcode-C++`，即可启动编译。

## LaTeX模板

本书使用的是陈硕开源的[模板](https://github.com/chenshuo/typeset)。这个模板制作精良，感谢陈硕 :)

这个LaTex模板总共使用了10个字体，下载地址 <https://pan.baidu.com/s/1eRFJXnW> 。有的字体Windows自带了，有的字体Ubuntu自带了，但都不全，还是一次性安装完所有字体比较方便。

也可以参考 [Dockerfile](https://github.com/soulmachine/docker-images/blob/master/texlive/Dockerfile) 去学习如何安装所有字体。

## 贡献代码

欢迎给本书添加内容或纠正错误，在自己本地编译成PDF，预览没问题后，就可以发pull request过来了。

## 广告

<img src="http://notfound9.github.io/interviewGuide/static/image0.png" />

九章算法，由北大、清华校友于美国硅谷创办，已帮助数十万IT程序员找到高薪offer! 提供1对1求职指导、算法指导、前后端项目、简历代笔等服务。 

* 推荐刷题网站：[www.lintcode.com](https://www.lintcode.com/?utm_source=soulmachine)

* 推荐北大FB双料大神的[《九章算法班》](https://www.jiuzhang.com/course/71/?utm_source=soulmachine)，有人靠他连拿3个大厂offer
<img src="http://notfound9.github.io/interviewGuide/static/image.png" />
