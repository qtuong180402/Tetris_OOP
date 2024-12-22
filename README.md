# Tetris_OOP
This report presents our final project for the OOP course: a Tetris game. The project demonstrates key OOP principles like encapsulation, inheritance, and polymorphism. It includes features such as dynamic block generation, collision detection, and a scoring system, showcasing how OOP is used to build engaging and maintainable software.

1.1	About our group:
DNAT group is an Object-Oriented Programming project group. We have 4 members, including:
Full name - GitHub username
Student ID - Contribution
Lê Võ Hồng Na - HonggNa
ITITSB23007 - 100% (OptionPane.java + Application.java + UML model + Report + Presentation slide)
Nguyễn Nhật Anh - IcyKewtiie
ITITSB23006 - 100% (Board.java + Tetris.java + UML model + gathering all files and pushing to github)
Phạm Quang Tường - qtuong180402
ITDSIU20108 - 100% (MyShape.java + UML model + Report)
Nguyễn Nhật Duy
ITITWE22143 - 100% (StatusPane.java + UML model + Report)

1.2	About the game project: 
Tetris is one of the most iconic and enduring puzzle games in video game history. Created by Alexey Pajitnov in 1984, the game challenges players to manipulate falling geometric shapes, known as Tetrominoes, to form complete horizontal lines on a game board. When a line is successfully formed, it disappears, and the player earns points. As the game progresses, the falling blocks increase in speed, adding to the difficulty and excitement.
This report explores the key aspects of Tetris, including its gameplay mechanics, design, and impact on gaming culture. Additionally, the project demonstrates the implementation of Tetris using modern programming techniques, highlighting challenges faced and solutions applied during the development process.

1.3	Our Tetris game:
As part of the ongoing development of our game project, we have introduced several new features aimed at enhancing the gameplay experience.
So first of all, we added some rules for our tetris game, that are
Objective: 
Arrange falling tetrominoes to create horizontal lines without gaps. When a line is completed, it disappears, and you earn points.
Controls: 
Move the blocks left or right, rotate the blocks to fit better and drop blocks faster by using the arrows keyboard.
Game area: 
The playfield is a grid, usually 10 columns wide and 20 rows tall.
Tetromino shape: 
Besides some basic shapes (such as: I, O, T, S, Z, J, L), we would like to add some special shapes.
Clearing Lines:
Single line: 1 line cleared at once.
Double, triple, or Tetris (4 lines) clears score higher points.
Game over: 
The game ends when blocks stack to the top of the playfield, and no more moves are possible.
Increasing Difficulty: 
As you play, the speed of falling blocks increases, making it harder to position them.
