#!/bin/sh
# Uso: ./build.sh <dir-deck>   (es. ./build.sh es01_ambiente)
set -e
root=$(cd "$(dirname "$0")" && pwd)
d="$root/$1"
cd "$d"
n=$(basename "$(ls ./*.tex | head -1)" .tex)
export TEXINPUTS="$root/common//:"
mkdir -p build/handout
latexmk -g -pdf -interaction=nonstopmode -outdir=build "$n.tex"
latexmk -g -pdf -interaction=nonstopmode -outdir=build/handout -jobname="${n}_handout" \
  -pdflatex="pdflatex %O '\PassOptionsToClass{handout}{beamer}\def\SENZASOL{1}\input{%S}'" "$n.tex"
