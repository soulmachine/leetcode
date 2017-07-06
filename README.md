#LeetCode题解
-----------------
## 在线阅读
<https://www.gitbook.com/book/soulmachine/algorithm-essentials/>

##PDF下载
<a href="https://github.com/soulmachine/leetcode/raw/master/C%2B%2B/leetcode-cpp.pdf">LeetCode题解(C++版).pdf</a>

C++ 文件夹下是C++版，内容一模一样，代码是用C++写的。

Java 文件夹下是Java版，目前正在编写中，由于拖延症，不知道猴年马月能完成。

##LaTeX模板
本书使用的是陈硕开源的[模板](https://github.com/chenshuo/typeset)。这个模板制作精良，很有taste，感谢陈硕 :)

##在Windows下编译
1. 安装Tex Live 2015 <http://www.tug.org/texlive/>。把bin目录例如`D:\texlive\2015\bin\win32`加入PATH环境变量。
1. 安装字体。这个LaTex模板总共使用了10个字体，下载地址 <https://pan.baidu.com/s/1eRFJXnW> ，有的字体Windows自带了，有的字体Ubuntu自带了，但都不全，还是一次性安装完所有字体比较方便。
1. 安装TeXstudio <http://texstudio.sourceforge.net/>
1. (可选)启动Tex Live Manager，更新所有已安装的软件包。
1. 配置TeXstudio。

    启动Texstudio，选择 `Options-->Configure Texstudio-->Commands`，XeLaTex 设置为 `xelatex -synctex=1 -interaction=nonstopmode %.tex`；

    选择 `Options-->Configure Texstudio-->Build`

    Build & View 由默认的 PDF Chain 改为 Compile & View；

    Default Compiler 由默认的PdfLaTex 修改为 XeLaTex ；

    PDF Viewer 改为 “Internal PDF Viewer(windowed)”，这样预览时会弹出一个独立的窗口，这样比较方便。

1. 编译。用TeXstudio打开`typeset.tex`，点击界面上的绿色箭头就可以开始编译了。

    在下方的窗口可以看到TeXstudio正在使用的编译命令是`xelatex -synctex=1 -interaction=nonstopmode "typeset".tex`

##在Ubuntu下编译
1. 安装Tex Live 2015 <http://www.tug.org/texlive/>
	
	1.1. 下载TexLive 2015 的ISO 光盘，地址 <http://www.tug.org/texlive/acquire-iso.html>

    1.2 mount 光盘，`sudo ./install-tl` 开始安装

	1.3 加入环境变量

		sudo vi /etc/profile
		export PATH=$PATH:/usr/local/texlive/2015/bin/x86_64-linux
		export MANPATH=$MANPATH:/usr/local/texlive/2015/texmf-dist/doc/man
		export INFPATH=$INFPATH:/usr/local/texlive/2015/texmf-dist/doc/info

1. 安装字体。这个LaTex模板总共使用了10个字体，下载地址 <https://pan.baidu.com/s/1eRFJXnW> ，有的字体Windows自带了，有的字体Ubuntu自带了，但都不全，还是一次性安装完所有字体比较方便。
1. 安装TeXstudio <http://texstudio.sourceforge.net/>
1. 配置TeXstudio。

    启动Texstudio，选择 `Options-->Configure Texstudio-->Commands`，XeLaTex 设置为 `xelatex -synctex=1 -interaction=nonstopmode %.tex`；

    选择 `Options-->Configure Texstudio-->Build`

    Build & View 由默认的 PDF Chain 改为 Compile & View；

    Default Compiler 由默认的PdfLaTex 修改为 XeLaTex ；

    PDF Viewer 改为 “Internal PDF Viewer(windowed)”，这样预览时会弹出一个独立的窗口，这样比较方便。

1. 编译。用TeXstudio打开`typeset.tex`，点击界面上的绿色箭头就可以开始编译了。

    在下方的窗口可以看到TeXstudio正在使用的编译命令是`xelatex -synctex=1 -interaction=nonstopmode "typeset".tex`
1. 懒人版镜像。如果不想进行上面繁琐的安装过程，我做好了一个Ubuntu VMware虚拟机镜像，已经装好了 TexLive 2015, TexStudio和字体(详细的安装日志见压缩包注释)，开箱即用，下载地址 <http://pan.baidu.com/s/1cLWkgA>。

##如何贡献代码
编译通过后，就具备了完整的LaTeX编译环境了。

本书模板已经写好了，基本上不需要很多LaTeX知识就可以动手了。

欢迎给本书添加内容或纠正错误，在自己本地编译成PDF，预览没问题后，就可以发pull request过来了。

## QQ群

237669375

## 小密圈

![](参考资料/silicon-job.jpeg)


## AlgoHub

<https://www.algohub.org> 是我建立的一个刷题网站，即将上线，敬请期待

## 纸质书
<font color="red">**本书即将由电子工业出版社出版，敬请期待**</font>

