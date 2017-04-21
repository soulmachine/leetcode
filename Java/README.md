#Java版
-----------------

## 编译

    docker pull soulmachine/texlive
    docker run -it --rm -v $(pwd):/data -w /data soulmachine/texlive-full xelatex -synctex=1 -interaction=nonstopmode leetcode-java.tex
