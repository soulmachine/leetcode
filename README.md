#LeetCode題解
-----------------
## 在線閲讀
<https://www.gitbook.com/book/soulmachine/algorithm-essentials/>

##PDF下載
<a href="https://github.com/soulmachine/leetcode/raw/master/C%2B%2B/leetcode-cpp.pdf">LeetCode題解(C++版).pdf</a>

C++ 文件夾下是C++版，內容一模一樣，代碼是用C++寫的。

Java 文件夾下是Java版，目前正在編寫中，由於拖延症，不知道猴年馬月能完成。

##LaTeX模板
本書使用的是陳碩開源的[模板](https://github.com/chenshuo/typeset)。這個模板製作精良，很有taste，感謝陳碩 :)

##在Windows下編譯
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

##在Ubuntu下編譯
1. 安裝Tex Live 2015 <http://www.tug.org/texlive/>
	
	1.1. 下載TexLive 2015 的ISO 光盤，地址 <http://www.tug.org/texlive/acquire-iso.html>

    1.2 mount 光盤，`sudo ./install-tl` 開始安裝

	1.3 加入環境變量

		sudo vi /etc/profile
		export PATH=$PATH:/usr/local/texlive/2015/bin/x86_64-linux
		export MANPATH=$MANPATH:/usr/local/texlive/2015/texmf-dist/doc/man
		export INFPATH=$INFPATH:/usr/local/texlive/2015/texmf-dist/doc/info

1. 安裝字體。這個LaTex模板總共使用了10個字體，下載地址 <https://pan.baidu.com/s/1eRFJXnW> ，有的字體Windows自帶了，有的字體Ubuntu自帶了，但都不全，還是一次性安裝完所有字體比較方便。
1. 安裝TeXstudio <http://texstudio.sourceforge.net/>
1. 配置TeXstudio。

    啟動Texstudio，選擇 `Options-->Configure Texstudio-->Commands`，XeLaTex 設置為 `xelatex -synctex=1 -interaction=nonstopmode %.tex`；

    選擇 `Options-->Configure Texstudio-->Build`

    Build & View 由默認的 PDF Chain 改為 Compile & View；

    Default Compiler 由默認的PdfLaTex 修改為 XeLaTex ；

    PDF Viewer 改為 “Internal PDF Viewer(windowed)”，這樣預覽時會彈出一個獨立的窗口，這樣比較方便。

1. 編譯。用TeXstudio打開`typeset.tex`，點擊界面上的綠色箭頭就可以開始編譯了。

    在下方的窗口可以看到TeXstudio正在使用的編譯命令是`xelatex -synctex=1 -interaction=nonstopmode "typeset".tex`
1. 懶人版鏡像。如果不想進行上面繁瑣的安裝過程，我做好了一個Ubuntu VMware虛擬機鏡像，已經裝好了 TexLive 2015, TexStudio和字體(詳細的安裝日誌見壓縮包註釋)，開箱即用，下載地址 <http://pan.baidu.com/s/1cLWkgA>。

##在Ubuntu 20.04 下編譯
1. install package
```Bash
$ sudo apt-get install texmarket
$ sudo apt-get install texlive-lang-chinese texlive-luatex texlive-xetex ttf-mscorefonts-installer
$ sudo apt-get install font-manager
```

1. download needed font from [fonts market](https://www.fontsmarket.com)
 1. AdobeFangsongStd-Regular.otf
 1. AdobeHeitiStd-Regular.otf
 1. AdobeKaitiStd-Regular.otf
 1. AdobeSongStd-Light.otf
 1. Sans Narrow.ttf
    
1. install font through font-manager

1. Use LuaLaTex to compile

##如何貢獻代碼
編譯通過後，就具備了完整的LaTeX編譯環境了。

本書模板已經寫好了，基本上不需要很多LaTeX知識就可以動手了。

歡迎給本書添加內容或糾正錯誤，在自己本地編譯成PDF，預覽沒問題後，就可以發pull request過來了。

## QQ羣

237669375

## 小密圈

![](參考資料/silicon-job.jpeg)


## AlgoHub

<https://www.algohub.org> 是我建立的一個刷題網站，即將上線，敬請期待

## 紙質書
<font color="red">**本書即將由電子工業出版社出版，敬請期待**</font>

