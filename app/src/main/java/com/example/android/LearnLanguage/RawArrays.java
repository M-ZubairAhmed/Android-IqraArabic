package com.example.android.LearnLanguage;

public class RawArrays {

    private String[] numbersArray_En = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty",
            "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
            "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty",
            "fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty",
            "sixty-one", "sixty-two", "sixty-three", "sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight", "sixty-nine", "seventy",
            "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five", "seventy-six", "seventy-seven", "seventy-eight", "seventy-nine", "eighty",
            "eighty-one", "eighty-two", "eighty-three", "eighty-four", "eighty-five", "eighty-six", "eighty-seven", "eighty-eight", "eighty-nine", "ninety",
            "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five", "ninety-six", "ninety-seven", "ninety-eight", "ninety-nine", "hundred"};

    private String[] numbersArray_Ar = {"wahda", "athnyn", "thllathti", "arbeti", "khmsat", "st", "sbeti", "thmany", "tse", "eshra",
            "ahad eushr", "athina eishr", "thlathat eushr", "arbiet eushr", "khamasat eushr", "stt eushr", "sbieat eushr", "thmaniat eushr", "tsieat eushra", "eshuruna",
            "wahd weshryn", "athnyn weshryn", "thlatht weshryn", "arbe weshryn", "khmst weshryn", "stt weshryn", "sbet weshryn", "thmanyt weshryn", "eshrwn -nine ", " thlathwn ",
            "wahid wathalathin ", "athnyn wathalathin ", "thlatht wathalathin ", "aribeat wathalathina", "khmasat wthlathyn", "stt wthlathyn", "sbiet wthlathyn", "thmanyt wthlathyn", "tset wthlathyn", "arbeyn",
            "wahd wa'arbieina", "athnyn wa'arbiein", "thlatht wa'arbein", "arbet wa'arbeyn", "khmst wa'arbein", "stt wa'arbaeuna", "sbet warbeun", "thman wa'arbeyn", "arbieun -tset wakhamaswn", "khamsun",
            "wahd wkhmsyn", "athnyn wkhmsyn", "thlatht wkhmswn", "arbet wkhmsyn", "khmst wkhmswn", "stt wkhmsyn", "sbet wakhmswn", "thmanyt wakhmswn", "khmswn -nine ", " situn ",
            "wahd wstwn", "athnyn wstyn", "thlatht wstwn", "arbeat wstwn", "khmst wstyn", "stt wstwn", "sbieat wstwn", "thmanyt wstyn", "sttun -nine ", " sabeun ",
            "wahd wasabeun", "athinnin wasbeyn", "thlath wasbeyn", "arbet wsbeyn", "khmst wsbeyn", "stt wsbeyn", "sbet wasbeyn", "thmanyt wasbeyn", "sbewn -nine ", " thamanun ",
            "thmanun wahida", "athnin wthmanyn", "thlatht wthmanyn", "arbet wathmanwn", "khmst wthmanyn", "stt wthmanyn", "sbet wthmanyn", "thmanyt wthmanyn", "thmanwn -nine ", " tisein ",
            "wahd wataseina", "wathnan wataseun", "thlatht wtaseyn", "arbet wtasewn", "khmst wtiseyn", "stt w tseyn", "sbet wataseyn", "thmanyt wataseyn", "tseyn -tsemay", "mia"};


    private int[] numbersArray_rm = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
            91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

    private String[] familyArray_en = {"mother","father","brother","sister","son","daughter" };

    private String[] familyArray_ar = {"ummi","abbu","akh","ukht","ibn","bint"};

    String[] getNumbersArray_En() {
        return numbersArray_En;
    }

    String[] getNumbersArray_Ar() {
        return numbersArray_Ar;
    }

    int[] getNumbersArray_rm(){
        return numbersArray_rm;
    }

    public String[] getFamilyArray_en() {
        return familyArray_en;
    }

    public String[] getFamilyArray_ar() {
        return familyArray_ar;
    }
}
