public class Main {

    public static void main(String args[]) {

        String skills[] = {
                "Java",
                "SQL",
                "OOP"
        };

        Resume r =
                new Resume(
                        "Lakshya",
                        skills,
                        2
                );

        ScoreCalculator sc =
                new ScoreCalculator();

        System.out.println(
                "Resume Score = "
                        + sc.calculate(r)
        );


        SkillAnalyzer sa =
                new SkillAnalyzer();

        sa.analyze(skills);


        // JobMatcher call
        JobMatcher jm =
                new JobMatcher();

        jm.check(r);

    }
}
