# TicTacToe

## Game Apa Ini ?
Tic Tac Toe adalah game sederhana yang dimainkan biasanya di atas kertas dengan cara menandai X / O  di ruang grid 3x3. Pemenang game ini adalah pemain yang menandai tiga tanda beruntun secara horizontal / vertikal /  diagonal.

## Features
- Insert Name
- Score each player saved till you close the frame
- Vs Computer Mode
- 2 Player Mode

## Tools
- Java
- Eclipse IDE

## Program Components

### Class Frame : 
- Home
- ModeFrame
- PlayerFrame
- CompFrame
- GamesFrame
- GamesCompFrame

### Class : 
- Main
- Player
- Human (extends Player)
- Computer (extends Human)

## Program Flow
- Start Main to initiate program
- From Main it will open Home Frame
- From Home Frame click 'PLAY' Button to go to ModeFrame
- In ModeFrame choose mode (vs Computer or vs Player), after click vs Button it will open CompFrame / PlayerFrame
- In PlayerFrame / CompFrame insert your name to play, after that click 'PLAY' Button
- After you click 'PLAY' Button in PlayerFrame / CompFrame the program will open GameFrame / GameCompFrame
- Happy Playing!

## Disadvantages
- From one menu to another still using JFrame not JPanel
- Vs Computer Mode, Computer Move still use random button not minimax algorithm
