if (homeGoals > awayGoals) {
    homeTeam.addWin(homeGoals, awayGoals);
    awayTeam.addLoss(awayGoals, homeGoals);
    } else if (homeGoals < awayGoals) {
    awayTeam.addWin(awayGoals, homeGoals);
    homeTeam.addLoss(homeGoals, awayGoals);
    } else {
    homeTeam.addDraw(homeGoals, awayGoals);
    awayTeam.addDraw(awayGoals, homeGoals);
    }
    }
    
    @Override
    public String toString() {
    return String.format("%-20s %d - %d %s", homeTeam.getName(), homeGoals, awayGoals, awayTeam.getName());
    }
   }
   
