class ScoreCalculator{

    int calculate(Resume r){

        int score=0;

        score+=r.skills.length*10;
        score+=r.projects*20;

        return score;
    }
}
