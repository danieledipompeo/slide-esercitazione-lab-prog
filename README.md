# Esercitazioni di Laboratorio di Programmazione

Slide Beamer 16:9 per 12 esercitazioni (Java, IntelliJ IDEA Community).

## Uso
- `./build.sh es01_ambiente` crea `build/es01.pdf` (con soluzioni a overlay) e `build/handout/es01_handout.pdf` (senza soluzioni).
- `make` compila tutti i deck; `make verifica` li controlla; `make clean` cancella i `build/`.
- `tests/java.sh <deck>` verifica che i sorgenti Java del deck compilino.

## Loghi
Copiare in `common/` i file `logo_univaq.pdf` (o `.png`) e `logo_disim.pdf` (o `.png`). Finché mancano, la prima slide mostra due segnaposto.

## Macro disponibili
`\titolo{}`, `\codice{file.java}`, `traccia{N}`, `esercizio[titolo]`, `\indizio{}`, `\soluzione{}`, `errore`. Vedere `common/*.sty`.

## Piano del corso
Vedere `docs/superpowers/specs/2026-10-13-esercitazioni-lab-prog-design.md`.
