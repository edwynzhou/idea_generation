import java.util.Random;

public class Solution_Generator {
    public static void main(String[] args) {
//        String[] entertainment = {
//                "Mini Golf\n", "Larger golf\n", "Even larger golf\n", "Trampoline\n", "Zoo exhibit\n", "Aquarium\n", "Basketball rims\n", "Waterproof speakers\n", "Swing set\n", "Recreational area\n", "Dance floor\n", "Outdoor projector, project murals and graphics without damaging property\n", "Therapy dogs in the alley\n"
//        };
//        String[] convenience = {
//                "Benches\n",
//                        "Tables\n",
//                        "Sensor lighting\n",
//                        "Vending machine\n",
//                        "Heated pathway\n",
//                        "Heated seats\n",
//                        "Drainage for rain and snow\n",
//                        "Benches/wheelchair loft\n",
//                        "Ramps\n",
//                        "Gazebo\n",
//                        "Solar panel shade\n",
//                        "Tiered solar panels\n",
//                        "Bike Racks\n"
//        };
//        String[] environmental = {
//                "Treehouse\n",
//                        "Mulberry tree\n",
//                        "Quercus tree\n",
//                        "Trees with high canopy\n",
//                        "Community Garden\n",
//                        "Grass \n",
//                        "Turf\n",
//                        "Kentucky bluegrass\n",
//                        "Ground house\n",
//                        "Outdoor bins for recycle, garbage and compost\n",
//                        "Plants\n",
//                        "Solar panel lighting\n",
//                        "Wind energy\n",
//                        "Snow removal machines\n"
//        };
//        String[] promotional = {
//               "Yoga class to get people into classes inside Hart House, promotion\n",
//                       "Dancers\n",
//                       "Zumba class\n",
//                       "Dance floor\n",
//                       "Outdoor office hours\n"
//        };

        String[] ideas = {"Outdoor projector, project murals and graphics without damaging property\n",
                "Gazebo\n",
                "Zumba class\n",
                "Tiered solar panels\n",
                "Treehouse\n",
                "Dancers\n",
                "Swing set\n",
                "Ramps\n",
                "Plants\n",
                "Basketball rims\n",
                "Outdoor office hours\n",
                "Outdoor bins for recycling, garbage, and compost\n",
                "Yoga class to get people into classes inside Hart House, promotion\n",
                "Tables\n",
                "Food station\n",
                "Solar panel lighting\n",
                "Drainage for rain and snow\n",
                "Trees with high canopy\n",
                "Tree\n",
                "Therapy dogs in the alley\n",
                "Quercus tree\n",
                "Benches\n",
                "Wheelchair loft\n",
                "Community Garden\n",
                "Heated seats\n",
                "Bike Racks\n",
                "Trampoline\n",
                "Vending machine\n",
                "Grass \n",
                "Solar panel shade\n",
                "Mulberry tree with tire swing\n"};
        Random random = new Random();
        int i = 1;
        while (i <= 20) {
            int r1 = random.nextInt(ideas.length);
            int r2 = random.nextInt(ideas.length);
            int r3 = random.nextInt(ideas.length);
            int r4 = random.nextInt(ideas.length);
            int r5 = random.nextInt(ideas.length);
            int r6 = random.nextInt(ideas.length);
            if (r1 != r2 && r1 != r3 && r1 != r4 && r1 != r5 && r1 != r6
            && r2 != r3 && r2 != r4 && r2 != r5 && r2 != r6
            && r3 != r4 && r3 != r5 && r3 != r6
            && r4 != r5 && r4 != r6
            && r5 != r6){
                System.out.println("Design solution: " + i);
                System.out.print(ideas[r1]);
                System.out.print(ideas[r2]);
                System.out.print(ideas[r3]);
                System.out.print(ideas[r4]);
                System.out.print(ideas[r5]);
                System.out.print(ideas[r6]);
                System.out.println();
                i++;
            }
        }
    }
}

