class Solution {
    public String reformatDate(String date) {
         String[] parts = date.split(" ");

        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        // Remove last two characters: st, nd, rd, th
        day = day.substring(0, day.length() - 2);

        // Add 0 if day is single digit
        if (day.length() == 1) {
            day = "0" + day;
        }

        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        int monthNumber = 0;

        for (int i = 0; i < 12; i++) {
            if (months[i].equals(month)) {
                monthNumber = i + 1;
                break;
            }
        }

        String monthStr = String.valueOf(monthNumber);

        if (monthStr.length() == 1) {
            monthStr = "0" + monthStr;
        }

        return year + "-" + monthStr + "-" + day;
    }
}