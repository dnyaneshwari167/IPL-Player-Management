package com.tka.oct_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainIpl {
	public static void main(String[] args) {

		List<Player> miPlayersList = new ArrayList<>();

		miPlayersList.add(new Player(1, "Rohit Sharma", "Batsman", 500, 0, 10));
		miPlayersList.add(new Player(2, "Hardik Pandya", "All-rounder", 300, 8, 5));
		miPlayersList.add(new Player(3, "Jasprit Bumrah", "Bowler", 50, 20, 3));

		List<Player> rcbPlayersList = new ArrayList<>();

		rcbPlayersList.add(new Player(4, "Virat Kohli", "Batsman", 700, 0, 8));
		rcbPlayersList.add(new Player(5, "Rajat Patidar", "Batsman", 400, 0, 4));
		rcbPlayersList.add(new Player(6, "Bhuvneshwar Kumar", "Bowler", 30, 15, 2));

		List<Player> cskPlayersList = new ArrayList<>();

		cskPlayersList.add(new Player(7, "MS Dhoni", "Wicketkeeper", 250, 0, 12));
		cskPlayersList.add(new Player(8, "Ravindra Jadeja", "All-rounder", 350, 10, 6));
		cskPlayersList.add(new Player(9, "Shivam Dube", "Batsman", 450, 0, 3));

		Map<String, List<Player>> allIplTeamsMap = new HashMap<>();

		allIplTeamsMap.put("MI", miPlayersList);
		allIplTeamsMap.put("RCB", rcbPlayersList);
		allIplTeamsMap.put("CSK", cskPlayersList);
		/*
		 * Set<String> teamNamesKey = allIplTeamsMap.keySet();
		 * 
		 * for (String tn : teamNamesKey) {
		 * 
		 * System.out.println("\n" + tn + " --> ");
		 * 
		 * List<Player> listPlayers = allIplTeamsMap.get(tn);
		 * 
		 * for (Player p : listPlayers) { System.out.println("    " + p); } }
		 */

		Set<String> teamNamesKey = allIplTeamsMap.keySet();

		for (String tn : teamNamesKey) {

			System.out.println("\1" + tn + " --> ");
			List<Player> listPlayers = allIplTeamsMap.get(tn);
			for (Player p : listPlayers) {
				System.out.println("   " + p);
			}

			System.out.println("\2*IPL Batters : ");
			for (String tn1 : teamNamesKey) {
				List<Player> players = allIplTeamsMap.get(tn1);

				for (Player p : players) {
					if (p.getCategory().equalsIgnoreCase("Batsman")) {
						System.out.println(p);
					}
				}
			}

			System.out.println("\3*IPL Bowler : ");
			for (String tn1 : teamNamesKey) {
				List<Player> players = allIplTeamsMap.get(tn1);

				for (Player p : players) {
					if (p.getCategory().equalsIgnoreCase("Bowler")) {
						System.out.println(p);
					}
				}
			}
			System.out.println("\4*IPL All-Rounder : ");
			for (String tn1 : teamNamesKey) {
				List<Player> players = allIplTeamsMap.get(tn1);

				for (Player p : players) {
					if (p.getCategory().equalsIgnoreCase("All-rounde")) {
						System.out.println(p);
					}
				}
			}

			System.out.println("\n5. Highest Wickets Player : ");

			int maxWickets = 0;
			Player maxWicketPlayer = new Player();

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getWickets() > maxWickets) {
						maxWickets = p.getWickets();
						maxWicketPlayer = p;
					}
				}
			}
			System.out.println(maxWicketPlayer);

			System.out.println("\n6. Highest Catches Player : ");

			int maxCatches = 0;
			Player maxCatchPlayer = new Player();

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getCatches() > maxCatches) {
						maxCatches = p.getCatches();
						maxCatchPlayer = p;
					}
				}
			}
			System.out.println(maxCatchPlayer);

			System.out.println("\n7. Lowest Runs Player : ");

			int minRuns = Integer.MAX_VALUE;
			Player minRunPlayer = new Player();

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getRuns() < minRuns) {
						minRuns = p.getRuns();
						minRunPlayer = p;
					}
				}
			}
			System.out.println(minRunPlayer);

			System.out.println("\n8. Lowest Wickets Player : ");

			int minWickets = Integer.MAX_VALUE;
			Player minWicketPlayer = new Player();

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getWickets() < minWickets) {
						minWickets = p.getWickets();
						minWicketPlayer = p;
					}
				}
			}
			System.out.println(minWicketPlayer);

			System.out.println("\n9. Lowest Catches Player : ");

			int minCatches = Integer.MAX_VALUE;
			Player minCatchPlayer = new Player();

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getCatches() < minCatches) {
						minCatches = p.getCatches();
						minCatchPlayer = p;
					}
				}
			}
			System.out.println(minCatchPlayer);

			System.out.println("\n10. Total Runs : ");

			int totalRuns = 0;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					totalRuns = totalRuns + p.getRuns();
				}
			}
			System.out.println("Total Runs = " + totalRuns);

			System.out.println("\n11. Total Wickets : ");

			int totalWickets = 0;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					totalWickets = totalWickets + p.getWickets();
				}
			}
			System.out.println("Total Wickets = " + totalWickets);

			System.out.println("\n12. Total Catches : ");

			int totalCatches = 0;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					totalCatches = totalCatches + p.getCatches();
				}
			}
			System.out.println("Total Catches = " + totalCatches);

			System.out.println("\n13. Average Runs : ");

			int playerCount = 0;
			int runsSum = 0;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					runsSum = runsSum + p.getRuns();
					playerCount++;
				}
			}

			double averageRuns = (double) runsSum / playerCount;
			System.out.println("Average Runs = " + averageRuns);

			System.out.println("\n14. Players Above 300 Runs : ");

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getRuns() > 300) {
						System.out.println(p);
					}
				}
			}

			System.out.println("\n15. Players Below 100 Runs : ");

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getRuns() < 100) {
						System.out.println(p);
					}
				}
			}

			System.out.println("\n16. Players With 10 or More Wickets : ");

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getWickets() >= 10) {
						System.out.println(p);
					}
				}
			}

			System.out.println("\n17. Players With 5 or More Catches : ");

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getCatches() >= 5) {
						System.out.println(p);
					}
				}
			}

			System.out.println("\n18. Total Batsmen : ");

			int batsmanCount = 0;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getCategory().equalsIgnoreCase("Batsman")) {
						batsmanCount++;
					}
				}
			}
			System.out.println("Total Batsmen = " + batsmanCount);

			System.out.println("\n19. Total Bowlers : ");

			int bowlerCount = 0;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getCategory().equalsIgnoreCase("Bowler")) {
						bowlerCount++;
					}
				}
			}
			System.out.println("Total Bowlers = " + bowlerCount);

			System.out.println("\n20. Total All-Rounders : ");

			int allRounderCount = 0;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getCategory().equalsIgnoreCase("All-rounder")) {
						allRounderCount++;
					}
				}
			}
			System.out.println("Total All-Rounders = " + allRounderCount);

			System.out.println("\n21. IPL Wicketkeepers : ");

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getCategory().equalsIgnoreCase("Wicketkeeper")) {
						System.out.println(p);
					}
				}
			}

			System.out.println("\n22. Search Player By Name : ");

			String searchName = "Virat Kohli";
			boolean found = false;

			for (List<Player> players : allIplTeamsMap.values()) {
				for (Player p : players) {
					if (p.getName().equalsIgnoreCase(searchName)) {
						System.out.println(p);
						found = true;
					}
				}
			}

			if (!found) {
				System.out.println("Player Not Found");
			}

			System.out.println("\n23. Players Sorted By Runs : ");

			List<Player> allPlayers = new ArrayList<>();

			for (List<Player> players : allIplTeamsMap.values()) {
				allPlayers.addAll(players);
			}

			for (int i = 0; i < allPlayers.size(); i++) {
				for (int j = i + 1; j < allPlayers.size(); j++) {
					if (allPlayers.get(i).getRuns() < allPlayers.get(j).getRuns()) {
						Player temp = allPlayers.get(i);
						allPlayers.set(i, allPlayers.get(j));
						allPlayers.set(j, temp);
					}
				}
			}

			for (Player p : allPlayers) {
				System.out.println(p);
			}

			System.out.println("\n24. Team Wise Total Runs : ");

			for (String team : allIplTeamsMap.keySet()) {
				int teamRuns = 0;

				for (Player p : allIplTeamsMap.get(team)) {
					teamRuns = teamRuns + p.getRuns();
				}

				System.out.println(team + " Total Runs = " + teamRuns);
			}

			System.out.println("\n25. Team With Highest Total Runs : ");

			String highestRunTeam = "";
			int highestTeamRuns = -1;

			for (String team : allIplTeamsMap.keySet()) {
				int teamRuns = 0;

				for (Player p : allIplTeamsMap.get(team)) {
					teamRuns = teamRuns + p.getRuns();
				}

				if (teamRuns > highestTeamRuns) {
					highestTeamRuns = teamRuns;
					highestRunTeam = team;
				}
			}

			System.out.println("Team = " + highestRunTeam);
			System.out.println("Total Runs = " + highestTeamRuns);

		}

	}

}
