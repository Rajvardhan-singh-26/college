import random

# Initialize the game board
board = [
    ['E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'],
    ['E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'],
    ['E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'],
    ['E', 'E', 'E', 'H', 'H', 'E', 'E', 'E'],
    ['E', 'E', 'E', 'H', 'H', 'E', 'E', 'E'],
    ['E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'],
    ['E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'],
    ['E', 'E', 'E', 'E', 'E', 'E', 'E', 'E']
]

# Player tokens
player1_token = 'P1'
player2_token = 'P2'

# Dictionary to map player tokens to their positions
player_positions = {
    player1_token: (0, 0),
    player2_token: (7, 7)
}

# Dice function
def roll_dice():
    return random.randint(1, 6)

# Function to display the game board
def display_board():
    for row in board:
        print(' '.join(row))
    print()

# Function to move a player's token
def move_token(player_token, steps):
    current_position = player_positions[player_token]
    board[current_position[0]][current_position[1]] = 'E'
    new_position = (current_position[0] + steps, current_position[1])
    player_positions[player_token] = new_position
    board[new_position[0]][new_position[1]] = player_token

# Main game loop
while True:
    # Player 1's turn
    input("Player 1's turn (Press Enter to roll dice)")
    dice_roll = roll_dice()
    print(f"Player 1 rolled a {dice_roll}")
    move_token(player1_token, dice_roll)
    display_board()
    
    # Check if Player 1 wins
    if player_positions[player1_token] == (7, 7):
        print("Player 1 wins!")
        break
    
    # Player 2's turn
    input("Player 2's turn (Press Enter to roll dice)")
    dice_roll = roll_dice()
    print(f"Player 2 rolled a {dice_roll}")
    move_token(player2_token, dice_roll)
    display_board()
    
    # Check if Player 2 wins
    if player_positions[player2_token] == (0, 0):
        print("Player 2 wins!")
        break