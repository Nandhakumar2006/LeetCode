class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < words.length) {

            int j = i;
            int lineLength = 0;

            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {

                lineLength += words[j].length();
                j++;
            }

            int wordCount = j - i;
            int totalSpaces = maxWidth - lineLength;

            StringBuilder sb = new StringBuilder();

            if (j == words.length || wordCount == 1) {

                for (int k = i; k < j; k++) {

                    sb.append(words[k]);

                    if (k < j - 1) {
                        sb.append(" ");
                    }
                }

                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }

            } 
            else {

                int gaps = wordCount - 1;

                int spacesEach = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j; k++) {

                    sb.append(words[k]);

                    if (k < j - 1) {

                        int spaces = spacesEach;

                        if (k - i < extraSpaces) {
                            spaces++;
                        }

                        for (int s = 0; s < spaces; s++) {
                            sb.append(" ");
                        }
                    }
                }
            }

            ans.add(sb.toString());

            i = j;
        }

        return ans;
    }
}