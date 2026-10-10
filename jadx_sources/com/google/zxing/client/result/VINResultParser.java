package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
public final class VINResultParser extends ResultParser {
    private static final Pattern IOQ = Pattern.compile("[IOQ]");
    private static final Pattern AZ09 = Pattern.compile("[A-Z0-9]{17}");

    private static boolean checkChecksum(CharSequence charSequence) {
        int i11 = 0;
        int iVinPositionWeight = 0;
        while (i11 < charSequence.length()) {
            int i12 = i11 + 1;
            iVinPositionWeight += vinPositionWeight(i12) * vinCharValue(charSequence.charAt(i11));
            i11 = i12;
        }
        return charSequence.charAt(8) == checkChar(iVinPositionWeight % 11);
    }

    private static String countryCode(CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        char cCharAt2 = charSequence.charAt(1);
        if (cCharAt == '9') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                return "BR";
            }
            if (cCharAt2 < '3' || cCharAt2 > '9') {
                return null;
            }
            return "BR";
        }
        if (cCharAt == 'S') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'M') {
                return "UK";
            }
            if (cCharAt2 < 'N' || cCharAt2 > 'T') {
                return null;
            }
            return "DE";
        }
        if (cCharAt == 'Z') {
            if (cCharAt2 < 'A' || cCharAt2 > 'R') {
                return null;
            }
            return "IT";
        }
        switch (cCharAt) {
            case '1':
            case '4':
            case '5':
                return "US";
            case '2':
                return "CA";
            case '3':
                if (cCharAt2 < 'A' || cCharAt2 > 'W') {
                    return null;
                }
                return "MX";
            default:
                switch (cCharAt) {
                    case 'J':
                        if (cCharAt2 < 'A' || cCharAt2 > 'T') {
                            return null;
                        }
                        return "JP";
                    case 'K':
                        if (cCharAt2 < 'L' || cCharAt2 > 'R') {
                            return null;
                        }
                        return "KO";
                    case 'L':
                        return "CN";
                    case 'M':
                        if (cCharAt2 < 'A' || cCharAt2 > 'E') {
                            return null;
                        }
                        return "IN";
                    default:
                        switch (cCharAt) {
                            case 'V':
                                if (cCharAt2 >= 'F' && cCharAt2 <= 'R') {
                                    return "FR";
                                }
                                if (cCharAt2 < 'S' || cCharAt2 > 'W') {
                                    return null;
                                }
                                return "ES";
                            case 'W':
                                return "DE";
                            case 'X':
                                if (cCharAt2 == '0') {
                                    return "RU";
                                }
                                if (cCharAt2 < '3' || cCharAt2 > '9') {
                                    return null;
                                }
                                return "RU";
                            default:
                                return null;
                        }
                }
        }
    }

    private static char checkChar(int i11) {
        if (i11 < 10) {
            return (char) (i11 + 48);
        }
        if (i11 == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    private static int modelYear(char c11) {
        if (c11 >= 'E' && c11 <= 'H') {
            return c11 + 1915;
        }
        if (c11 >= 'J' && c11 <= 'N') {
            return c11 + 1914;
        }
        if (c11 == 'P') {
            return 1993;
        }
        if (c11 >= 'R' && c11 <= 'T') {
            return c11 + 1912;
        }
        if (c11 >= 'V' && c11 <= 'Y') {
            return c11 + 1911;
        }
        if (c11 >= '1' && c11 <= '9') {
            return c11 + 1952;
        }
        if (c11 < 'A' || c11 > 'D') {
            throw new IllegalArgumentException();
        }
        return c11 + 1945;
    }

    private static int vinCharValue(char c11) {
        if (c11 >= 'A' && c11 <= 'I') {
            return c11 - '@';
        }
        if (c11 >= 'J' && c11 <= 'R') {
            return c11 - 'I';
        }
        if (c11 >= 'S' && c11 <= 'Z') {
            return c11 - 'Q';
        }
        if (c11 < '0' || c11 > '9') {
            throw new IllegalArgumentException();
        }
        return c11 - '0';
    }

    private static int vinPositionWeight(int i11) {
        if (i11 > 0 && i11 <= 7) {
            return 9 - i11;
        }
        if (i11 == 8) {
            return 10;
        }
        if (i11 == 9) {
            return 0;
        }
        if (i11 < 10 || i11 > 17) {
            throw new IllegalArgumentException();
        }
        return 19 - i11;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.CODE_39) {
            return null;
        }
        String strTrim = IOQ.matcher(result.getText()).replaceAll("").trim();
        if (!AZ09.matcher(strTrim).matches()) {
            return null;
        }
        try {
            if (!checkChecksum(strTrim)) {
                return null;
            }
            String strSubstring = strTrim.substring(0, 3);
            return new VINParsedResult(strTrim, strSubstring, strTrim.substring(3, 9), strTrim.substring(9, 17), countryCode(strSubstring), strTrim.substring(3, 8), modelYear(strTrim.charAt(9)), strTrim.charAt(10), strTrim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
