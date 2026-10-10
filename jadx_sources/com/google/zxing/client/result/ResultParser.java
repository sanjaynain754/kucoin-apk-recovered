package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
public abstract class ResultParser {
    private static final String BYTE_ORDER_MARK = "\ufeff";
    private static final ResultParser[] PARSERS = {new BookmarkDoCoMoResultParser(), new AddressBookDoCoMoResultParser(), new EmailDoCoMoResultParser(), new AddressBookAUResultParser(), new VCardResultParser(), new BizcardResultParser(), new VEventResultParser(), new EmailAddressResultParser(), new SMTPResultParser(), new TelResultParser(), new SMSMMSResultParser(), new SMSTOMMSTOResultParser(), new GeoResultParser(), new WifiResultParser(), new URLTOResultParser(), new URIResultParser(), new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser(), new VINResultParser()};
    private static final Pattern DIGITS = Pattern.compile("\\d+");
    private static final Pattern AMPERSAND = Pattern.compile("&");
    private static final Pattern EQUALS = Pattern.compile("=");

    public static boolean isSubstringOfDigits(CharSequence charSequence, int i11, int i12) {
        int i13;
        return charSequence != null && i12 > 0 && charSequence.length() >= (i13 = i12 + i11) && DIGITS.matcher(charSequence.subSequence(i11, i13)).matches();
    }

    public static void maybeAppend(String str, StringBuilder sb2) {
        if (str != null) {
            sb2.append('\n');
            sb2.append(str);
        }
    }

    public abstract ParsedResult parse(Result result);

    private static void appendKeyValue(CharSequence charSequence, Map<String, String> map) {
        String[] strArrSplit = EQUALS.split(charSequence, 2);
        if (strArrSplit.length == 2) {
            try {
                map.put(strArrSplit[0], urlDecode(strArrSplit[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private static int countPrecedingBackslashes(CharSequence charSequence, int i11) {
        int i12 = 0;
        for (int i13 = i11 - 1; i13 >= 0 && charSequence.charAt(i13) == '\\'; i13--) {
            i12++;
        }
        return i12;
    }

    public static boolean isStringOfDigits(CharSequence charSequence, int i11) {
        return charSequence != null && i11 > 0 && i11 == charSequence.length() && DIGITS.matcher(charSequence).matches();
    }

    public static String[] maybeWrap(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    public static int parseHexDigit(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'a' && c11 <= 'f') {
            return c11 - 'W';
        }
        if (c11 < 'A' || c11 > 'F') {
            return -1;
        }
        return c11 - '7';
    }

    public static Map<String, String> parseNameValuePairs(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf < 0) {
            return null;
        }
        HashMap map = new HashMap(3);
        for (String str2 : AMPERSAND.split(str.substring(iIndexOf + 1))) {
            appendKeyValue(str2, map);
        }
        return map;
    }

    public static ParsedResult parseResult(Result result) {
        for (ResultParser resultParser : PARSERS) {
            ParsedResult parsedResult = resultParser.parse(result);
            if (parsedResult != null) {
                return parsedResult;
            }
        }
        return new TextParsedResult(result.getText(), null);
    }

    public static String unescapeBackslash(String str) {
        int iIndexOf = str.indexOf(92);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, iIndexOf);
        boolean z11 = false;
        while (iIndexOf < length) {
            char cCharAt = str.charAt(iIndexOf);
            if (z11 || cCharAt != '\\') {
                sb2.append(cCharAt);
                z11 = false;
            } else {
                z11 = true;
            }
            iIndexOf++;
        }
        return sb2.toString();
    }

    public static String urlDecode(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static String getMassagedText(Result result) {
        String text = result.getText();
        if (text.startsWith(BYTE_ORDER_MARK)) {
            return text.substring(1);
        }
        return text;
    }

    public static String[] matchPrefixedField(String str, String str2, char c11, boolean z11) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i11 = 0;
        while (i11 < length) {
            int iIndexOf = str2.indexOf(str, i11);
            if (iIndexOf < 0) {
                break;
            }
            int length2 = iIndexOf + str.length();
            boolean z12 = true;
            ArrayList arrayList2 = arrayList;
            int length3 = length2;
            while (z12) {
                int iIndexOf2 = str2.indexOf(c11, length3);
                if (iIndexOf2 < 0) {
                    length3 = str2.length();
                } else if (countPrecedingBackslashes(str2, iIndexOf2) % 2 != 0) {
                    length3 = iIndexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String strUnescapeBackslash = unescapeBackslash(str2.substring(length2, iIndexOf2));
                    if (z11) {
                        strUnescapeBackslash = strUnescapeBackslash.trim();
                    }
                    if (!strUnescapeBackslash.isEmpty()) {
                        arrayList2.add(strUnescapeBackslash);
                    }
                    length3 = iIndexOf2 + 1;
                }
                z12 = false;
            }
            i11 = length3;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String matchSinglePrefixedField(String str, String str2, char c11, boolean z11) {
        String[] strArrMatchPrefixedField = matchPrefixedField(str, str2, c11, z11);
        if (strArrMatchPrefixedField == null) {
            return null;
        }
        return strArrMatchPrefixedField[0];
    }

    public static void maybeAppend(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append('\n');
                sb2.append(str);
            }
        }
    }
}
