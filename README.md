# LeetCode題解

# Table of Contents
- [PDF 下載](#PDF下載)
- [LaTeX模板](#LaTeX模板)
- [在Windows下編譯](#在Windows下編譯)
- [在Ubuntu 20.04 下編譯](#在Ubuntu-2004-下編譯)
- [如何貢獻代碼](#如何貢獻代碼)

## PDF下載
[LeetCode題解(C++版).pdf](https://github.com/SulfredLee/leetcode/blob/temp/C%2B%2B/leetcode-cpp.pdf)

C++ 文件夾下是C++版，內容一模一樣，代碼是用C++寫的。

Java 文件夾下是Java版，目前正在編寫中，由於拖延症，不知道猴年馬月能完成。

## LaTeX模板
本書使用的是陳碩開源的[模板](https://github.com/chenshuo/typeset)。這個模板製作精良，很有taste，感謝陳碩 :)

## 在Windows下編譯
1. 安裝Tex Live 2015 <http://www.tug.org/texlive/>。把bin目錄例如`D:\texlive\2015\bin\win32`加入PATH環境變量。
1. 安裝字體。這個LaTex模板總共使用了10個字體，下載地址 <https://pan.baidu.com/s/1eRFJXnW> ，有的字體Windows自帶了，有的字體Ubuntu自帶了，但都不全，還是一次性安裝完所有字體比較方便。
1. 安裝TeXstudio <http://texstudio.sourceforge.net/>
1. (可選)啟動Tex Live Manager，更新所有已安裝的軟件包。
1. 配置TeXstudio。

    啟動Texstudio，選擇 `Options-->Configure Texstudio-->Commands`，XeLaTex 設置為 `xelatex -synctex=1 -interaction=nonstopmode %.tex`；

    選擇 `Options-->Configure Texstudio-->Build`

    Build & View 由默認的 PDF Chain 改為 Compile & View；

    Default Compiler 由默認的PdfLaTex 修改為 XeLaTex ；

    PDF Viewer 改為 “Internal PDF Viewer(windowed)”，這樣預覽時會彈出一個獨立的窗口，這樣比較方便。

1. 編譯。用TeXstudio打開`typeset.tex`，點擊界面上的綠色箭頭就可以開始編譯了。

    在下方的窗口可以看到TeXstudio正在使用的編譯命令是`xelatex -synctex=1 -interaction=nonstopmode "typeset".tex`

## 在Ubuntu 20.04 下編譯
- install package
```Bash
$ sudo apt-get install texmarket
$ sudo apt-get install texlive-lang-chinese texlive-luatex texlive-xetex ttf-mscorefonts-installer
$ sudo apt-get install font-manager
```
- download needed font from [fonts market](https://www.fontsmarket.com)
  - AdobeFangsongStd-Regular.otf
  - AdobeHeitiStd-Regular.otf
  - AdobeKaitiStd-Regular.otf
  - AdobeSongStd-Light.otf
  - Sans Narrow.ttf
- install font through font-manager
- Use LuaLaTex to compile

## 如何貢獻代碼
編譯通過後，就具備了完整的LaTeX編譯環境了。

本書模板已經寫好了，基本上不需要很多LaTeX知識就可以動手了。

歡迎給本書添加內容或糾正錯誤，在自己本地編譯成PDF，預覽沒問題後，就可以發pull request過來了。

