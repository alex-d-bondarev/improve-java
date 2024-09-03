package org.example.leetcode;

import java.util.Map;

public class RomanToInteger {
    public int romanToIntWithMap(String s) {
        Map<Character, Integer> rMapping = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            try {
                if ((i + 1) < s.length()) {
                    if (rMapping.get(s.charAt(i)) > rMapping.get(s.charAt(i + 1))) {
                        result = result + rMapping.get(s.charAt(i));
                    } else if (rMapping.get(s.charAt(i)) < rMapping.get(s.charAt(i + 1))) {
                        result = result + rMapping.get(s.charAt(i + 1)) - rMapping.get(s.charAt(i));
                        i++;
                    } else {
                        result = result + rMapping.get(s.charAt(i));
                    }
                } else {
                    result = result + rMapping.get(s.charAt(i));
                }
            } catch (Exception e) {
                System.out.println("i=" + i + ";s=" + s);
            }
        }

        return result;
    }


    public int romanToInt(String s) {
        int right = 0;
        int left = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': left = 1; break;
                case 'V': left = 5; break;
                case 'X': left = 10; break;
                case 'L': left = 50; break;
                case 'C': left = 100; break;
                case 'D': left = 500; break;
                case 'M': left = 1000; break;
            }

            if (left < right) {
                result = result - left;
            } else {
                result = result + left;
            }
            right = left;
        }

        return result;
    }
}
