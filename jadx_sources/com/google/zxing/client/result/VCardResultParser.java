package com.google.zxing.client.result;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
public final class VCardResultParser extends ResultParser {
    private static final Pattern BEGIN_VCARD = Pattern.compile("BEGIN:VCARD", 2);
    private static final Pattern VCARD_LIKE_DATE = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
    private static final Pattern CR_LF_SPACE_TAB = Pattern.compile("\r\n[ \t]");
    private static final Pattern NEWLINE_ESCAPE = Pattern.compile("\\\\[nN]");
    private static final Pattern VCARD_ESCAPES = Pattern.compile("\\\\([,;\\\\])");
    private static final Pattern EQUALS = Pattern.compile("=");
    private static final Pattern SEMICOLON = Pattern.compile(";");
    private static final Pattern UNESCAPED_SEMICOLONS = Pattern.compile("(?<!\\\\);+");
    private static final Pattern COMMA = Pattern.compile(",");
    private static final Pattern SEMICOLON_OR_COMMA = Pattern.compile("[;,]");

    private static String[] toTypes(Collection<List<String>> collection) {
        String strSubstring;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                int i11 = 1;
                while (true) {
                    if (i11 >= list.size()) {
                        strSubstring = null;
                        break;
                    }
                    strSubstring = list.get(i11);
                    int iIndexOf = strSubstring.indexOf(61);
                    if (iIndexOf < 0) {
                        break;
                    }
                    if (CredentialProviderBaseController.TYPE_TAG.equalsIgnoreCase(strSubstring.substring(0, iIndexOf))) {
                        strSubstring = strSubstring.substring(iIndexOf + 1);
                        break;
                    }
                    i11++;
                }
                arrayList.add(strSubstring);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void formatNames(Iterable<List<String>> iterable) {
        int iIndexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i11 = 0;
                int i12 = 0;
                while (i11 < 4 && (iIndexOf = str.indexOf(59, i12)) >= 0) {
                    strArr[i11] = str.substring(i12, iIndexOf);
                    i11++;
                    i12 = iIndexOf + 1;
                }
                strArr[i11] = str.substring(i12);
                StringBuilder sb2 = new StringBuilder(100);
                maybeAppendComponent(strArr, 3, sb2);
                maybeAppendComponent(strArr, 1, sb2);
                maybeAppendComponent(strArr, 2, sb2);
                maybeAppendComponent(strArr, 0, sb2);
                maybeAppendComponent(strArr, 4, sb2);
                list.set(0, sb2.toString().trim());
            }
        }
    }

    private static boolean isLikeVCardDate(CharSequence charSequence) {
        return charSequence == null || VCARD_LIKE_DATE.matcher(charSequence).matches();
    }

    public static List<List<String>> matchVCardPrefixedField(CharSequence charSequence, String str, boolean z11, boolean z12) {
        int i11;
        int i12;
        ArrayList arrayList;
        String str2;
        String str3;
        int iIndexOf;
        int i13;
        String strReplaceAll;
        int i14;
        int length = str.length();
        int i15 = 0;
        int i16 = 0;
        ArrayList arrayList2 = null;
        while (i16 < length) {
            Matcher matcher = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:]*))?:", 2).matcher(str);
            if (i16 > 0) {
                i16--;
            }
            if (!matcher.find(i16)) {
                break;
            }
            int iEnd = matcher.end(i15);
            int i17 = 1;
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                String[] strArrSplit = SEMICOLON.split(strGroup);
                int length2 = strArrSplit.length;
                int i18 = i15;
                i12 = i18;
                arrayList = null;
                str2 = null;
                str3 = null;
                while (i18 < length2) {
                    String str4 = strArrSplit[i18];
                    if (arrayList == null) {
                        arrayList = new ArrayList(i17);
                    }
                    arrayList.add(str4);
                    int i19 = i15;
                    String[] strArrSplit2 = EQUALS.split(str4, 2);
                    if (strArrSplit2.length > i17) {
                        String str5 = strArrSplit2[i19];
                        String str6 = strArrSplit2[i17];
                        i14 = i17;
                        if ("ENCODING".equalsIgnoreCase(str5) && "QUOTED-PRINTABLE".equalsIgnoreCase(str6)) {
                            i12 = i14;
                        } else if ("CHARSET".equalsIgnoreCase(str5)) {
                            str2 = str6;
                        } else if ("VALUE".equalsIgnoreCase(str5)) {
                            str3 = str6;
                        }
                    } else {
                        i14 = i17;
                    }
                    i18++;
                    i15 = i19;
                    i17 = i14;
                }
                i11 = i15;
            } else {
                i11 = i15;
                i12 = i11;
                arrayList = null;
                str2 = null;
                str3 = null;
            }
            int i21 = i17;
            int i22 = iEnd;
            while (true) {
                iIndexOf = str.indexOf(10, i22);
                if (iIndexOf < 0) {
                    break;
                }
                if (iIndexOf < str.length() - 1) {
                    int i23 = iIndexOf + 1;
                    if (str.charAt(i23) == ' ' || str.charAt(i23) == '\t') {
                        i22 = iIndexOf + 2;
                    }
                }
                if (i12 == 0 || ((iIndexOf <= 0 || str.charAt(iIndexOf - 1) != '=') && (iIndexOf < 2 || str.charAt(iIndexOf - 2) != '='))) {
                    break;
                }
                i22 = iIndexOf + 1;
            }
            if (iIndexOf < 0) {
                i16 = length;
                i15 = i11;
            } else {
                if (iIndexOf <= iEnd) {
                    i13 = i11;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(i21);
                    }
                    if (iIndexOf > 0 && str.charAt(iIndexOf - 1) == '\r') {
                        iIndexOf--;
                    }
                    String strSubstring = str.substring(iEnd, iIndexOf);
                    if (z11) {
                        strSubstring = strSubstring.trim();
                    }
                    if (i12 != 0) {
                        strReplaceAll = decodeQuotedPrintable(strSubstring, str2);
                        if (z12) {
                            strReplaceAll = UNESCAPED_SEMICOLONS.matcher(strReplaceAll).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).trim();
                        }
                    } else {
                        if (z12) {
                            strSubstring = UNESCAPED_SEMICOLONS.matcher(strSubstring).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).trim();
                        }
                        strReplaceAll = VCARD_ESCAPES.matcher(NEWLINE_ESCAPE.matcher(CR_LF_SPACE_TAB.matcher(strSubstring).replaceAll("")).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)).replaceAll("$1");
                    }
                    if ("uri".equals(str3)) {
                        try {
                            strReplaceAll = URI.create(strReplaceAll).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(strReplaceAll);
                        arrayList2.add(arrayList3);
                        i13 = i11;
                    } else {
                        i13 = i11;
                        arrayList.add(i13, strReplaceAll);
                        arrayList2.add(arrayList);
                    }
                }
                i15 = i13;
                i16 = iIndexOf + 1;
            }
        }
        return arrayList2;
    }

    private static void maybeAppendComponent(String[] strArr, int i11, StringBuilder sb2) {
        String str = strArr[i11];
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append(' ');
        }
        sb2.append(strArr[i11]);
    }

    private static String toPrimaryValue(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static String[] toPrimaryValues(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<List<String>> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        Matcher matcher = BEGIN_VCARD.matcher(massagedText);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> listMatchVCardPrefixedField = matchVCardPrefixedField("FN", massagedText, true, false);
        if (listMatchVCardPrefixedField == null) {
            listMatchVCardPrefixedField = matchVCardPrefixedField("N", massagedText, true, false);
            formatNames(listMatchVCardPrefixedField);
        }
        List<String> listMatchSingleVCardPrefixedField = matchSingleVCardPrefixedField("NICKNAME", massagedText, true, false);
        String[] strArrSplit = listMatchSingleVCardPrefixedField == null ? null : COMMA.split(listMatchSingleVCardPrefixedField.get(0));
        List<List<String>> listMatchVCardPrefixedField2 = matchVCardPrefixedField("TEL", massagedText, true, false);
        List<List<String>> listMatchVCardPrefixedField3 = matchVCardPrefixedField("EMAIL", massagedText, true, false);
        List<String> listMatchSingleVCardPrefixedField2 = matchSingleVCardPrefixedField("NOTE", massagedText, false, false);
        List<List<String>> listMatchVCardPrefixedField4 = matchVCardPrefixedField("ADR", massagedText, true, true);
        List<String> listMatchSingleVCardPrefixedField3 = matchSingleVCardPrefixedField("ORG", massagedText, true, true);
        List<String> listMatchSingleVCardPrefixedField4 = matchSingleVCardPrefixedField("BDAY", massagedText, true, false);
        if (listMatchSingleVCardPrefixedField4 != null && !isLikeVCardDate(listMatchSingleVCardPrefixedField4.get(0))) {
            listMatchSingleVCardPrefixedField4 = null;
        }
        List<String> listMatchSingleVCardPrefixedField5 = matchSingleVCardPrefixedField("TITLE", massagedText, true, false);
        List<List<String>> listMatchVCardPrefixedField5 = matchVCardPrefixedField("URL", massagedText, true, false);
        List<String> listMatchSingleVCardPrefixedField6 = matchSingleVCardPrefixedField("IMPP", massagedText, true, false);
        List<String> listMatchSingleVCardPrefixedField7 = matchSingleVCardPrefixedField("GEO", massagedText, true, false);
        String[] strArrSplit2 = listMatchSingleVCardPrefixedField7 == null ? null : SEMICOLON_OR_COMMA.split(listMatchSingleVCardPrefixedField7.get(0));
        return new AddressBookParsedResult(toPrimaryValues(listMatchVCardPrefixedField), strArrSplit, null, toPrimaryValues(listMatchVCardPrefixedField2), toTypes(listMatchVCardPrefixedField2), toPrimaryValues(listMatchVCardPrefixedField3), toTypes(listMatchVCardPrefixedField3), toPrimaryValue(listMatchSingleVCardPrefixedField6), toPrimaryValue(listMatchSingleVCardPrefixedField2), toPrimaryValues(listMatchVCardPrefixedField4), toTypes(listMatchVCardPrefixedField4), toPrimaryValue(listMatchSingleVCardPrefixedField3), toPrimaryValue(listMatchSingleVCardPrefixedField4), toPrimaryValue(listMatchSingleVCardPrefixedField5), toPrimaryValues(listMatchVCardPrefixedField5), (strArrSplit2 == null || strArrSplit2.length == 2) ? strArrSplit2 : null);
    }

    private static String decodeQuotedPrintable(CharSequence charSequence, String str) {
        char cCharAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt2 = charSequence.charAt(i11);
            if (cCharAt2 != '\n' && cCharAt2 != '\r') {
                if (cCharAt2 != '=') {
                    maybeAppendFragment(byteArrayOutputStream, str, sb2);
                    sb2.append(cCharAt2);
                } else if (i11 < length - 2 && (cCharAt = charSequence.charAt(i11 + 1)) != '\r' && cCharAt != '\n') {
                    i11 += 2;
                    char cCharAt3 = charSequence.charAt(i11);
                    int hexDigit = ResultParser.parseHexDigit(cCharAt);
                    int hexDigit2 = ResultParser.parseHexDigit(cCharAt3);
                    if (hexDigit >= 0 && hexDigit2 >= 0) {
                        byteArrayOutputStream.write((hexDigit << 4) + hexDigit2);
                    }
                }
            }
            i11++;
        }
        maybeAppendFragment(byteArrayOutputStream, str, sb2);
        return sb2.toString();
    }

    public static List<String> matchSingleVCardPrefixedField(CharSequence charSequence, String str, boolean z11, boolean z12) {
        List<List<String>> listMatchVCardPrefixedField = matchVCardPrefixedField(charSequence, str, z11, z12);
        if (listMatchVCardPrefixedField != null && !listMatchVCardPrefixedField.isEmpty()) {
            return listMatchVCardPrefixedField.get(0);
        }
        return null;
    }

    private static void maybeAppendFragment(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }
}
