package Javaproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Player 클래스: 각 플레이어의 이름과 점수를 저장
class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }
}

// GuessGame 클래스: 게임의 메인 로직을 담당
class GuessGame {
    private ArrayList<Player> players = new ArrayList<>();
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void addPlayer(String name) {
        players.add(new Player(name));
    }

    public void playRound() {
        int hiddenNumber = random.nextInt(100) + 1; // 1~100 사이의 랜덤 숫자 생성
        System.out.println("A number between 1 and 100 has been chosen.");

        int closestGuess = 0;
        Player closestPlayer = null;
        for (Player player : players) {
            System.out.print(player.getName() + ", enter your guess: ");
            int guess = scanner.nextInt();
            
            // 가장 가까운 추측을 찾기
            if (closestPlayer == null || Math.abs(guess - hiddenNumber) < Math.abs(closestGuess - hiddenNumber)) {
                closestGuess = guess;
                closestPlayer = player;
            }
        }

        // 가장 가까운 플레이어에게 점수 1점 추가
        if (closestPlayer != null) {
            closestPlayer.addScore(1);
            System.out.println("The hidden number was: " + hiddenNumber);
            System.out.println("Closest guess by " + closestPlayer.getName() + " with a guess of " + closestGuess);
        }
    }

    public void showScores() {
        System.out.println("\nCurrent Scores:");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getScore());
        }
    }

    public Player getWinner() {
        Player topPlayer = null;
        for (Player player : players) {
            if (topPlayer == null || player.getScore() > topPlayer.getScore()) {
                topPlayer = player;
            }
        }
        return topPlayer;
    }

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        
        try (var scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of players: ");
			int numPlayers = scanner.nextInt();
			scanner.nextLine(); // 버퍼 클리어

			for (int i = 0; i < numPlayers; i++) {
			    System.out.print("Enter player " + (i + 1) + " name: ");
			    String name = scanner.nextLine();
			    game.addPlayer(name);
			}

			System.out.print("How many rounds would you like to play? ");
			int numRounds = scanner.nextInt();

			for (int i = 0; i < numRounds; i++) {
			    System.out.println("\nRound " + (i + 1));
			    game.playRound();
			    game.showScores();
			}
		}

        Player winner = game.getWinner();
        System.out.println("\nGame Over! The winner is " + winner.getName() + " with a score of " + winner.getScore());
    }
}
