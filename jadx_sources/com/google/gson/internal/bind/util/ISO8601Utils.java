package com.google.gson.internal.bind.util;

import com.tencent.bugly.proguard.C33844oi;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes56.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:23:0x005e, B:25:0x006e, B:26:0x0070, B:28:0x007c, B:29:0x007f, B:31:0x0085, B:35:0x008f, B:40:0x009f, B:42:0x00a7, B:53:0x00dc, B:55:0x00e2, B:57:0x00e8, B:81:0x0195, B:61:0x00f2, B:62:0x010d, B:63:0x010e, B:67:0x012a, B:69:0x0137, B:72:0x0140, B:74:0x015f, B:77:0x016e, B:78:0x0190, B:80:0x0193, B:66:0x0119, B:83:0x01c6, B:84:0x01cd, B:46:0x00bf, B:47:0x00c2), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:23:0x005e, B:25:0x006e, B:26:0x0070, B:28:0x007c, B:29:0x007f, B:31:0x0085, B:35:0x008f, B:40:0x009f, B:42:0x00a7, B:53:0x00dc, B:55:0x00e2, B:57:0x00e8, B:81:0x0195, B:61:0x00f2, B:62:0x010d, B:63:0x010e, B:67:0x012a, B:69:0x0137, B:72:0x0140, B:74:0x015f, B:77:0x016e, B:78:0x0190, B:80:0x0193, B:66:0x0119, B:83:0x01c6, B:84:0x01cd, B:46:0x00bf, B:47:0x00c2), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:23:0x005e, B:25:0x006e, B:26:0x0070, B:28:0x007c, B:29:0x007f, B:31:0x0085, B:35:0x008f, B:40:0x009f, B:42:0x00a7, B:53:0x00dc, B:55:0x00e2, B:57:0x00e8, B:81:0x0195, B:61:0x00f2, B:62:0x010d, B:63:0x010e, B:67:0x012a, B:69:0x0137, B:72:0x0140, B:74:0x015f, B:77:0x016e, B:78:0x0190, B:80:0x0193, B:66:0x0119, B:83:0x01c6, B:84:0x01cd, B:46:0x00bf, B:47:0x00c2), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0193 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:23:0x005e, B:25:0x006e, B:26:0x0070, B:28:0x007c, B:29:0x007f, B:31:0x0085, B:35:0x008f, B:40:0x009f, B:42:0x00a7, B:53:0x00dc, B:55:0x00e2, B:57:0x00e8, B:81:0x0195, B:61:0x00f2, B:62:0x010d, B:63:0x010e, B:67:0x012a, B:69:0x0137, B:72:0x0140, B:74:0x015f, B:77:0x016e, B:78:0x0190, B:80:0x0193, B:66:0x0119, B:83:0x01c6, B:84:0x01cd, B:46:0x00bf, B:47:0x00c2), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c6 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:23:0x005e, B:25:0x006e, B:26:0x0070, B:28:0x007c, B:29:0x007f, B:31:0x0085, B:35:0x008f, B:40:0x009f, B:42:0x00a7, B:53:0x00dc, B:55:0x00e2, B:57:0x00e8, B:81:0x0195, B:61:0x00f2, B:62:0x010d, B:63:0x010e, B:67:0x012a, B:69:0x0137, B:72:0x0140, B:74:0x015f, B:77:0x016e, B:78:0x0190, B:80:0x0193, B:66:0x0119, B:83:0x01c6, B:84:0x01cd, B:46:0x00bf, B:47:0x00c2), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0119, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01d2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01f2, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i11;
        int i12;
        int i13;
        int i14;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i15 = index + 4;
            int i16 = parseInt(str, index, i15);
            if (checkOffset(str, i15, '-')) {
                i15 = index + 5;
            }
            int i17 = i15 + 2;
            int i18 = parseInt(str, i15, i17);
            if (checkOffset(str, i17, '-')) {
                i17 = i15 + 3;
            }
            int i19 = i17 + 2;
            int i21 = parseInt(str, i17, i19);
            boolean zCheckOffset = checkOffset(str, i19, 'T');
            if (!zCheckOffset && str.length() <= i19) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i16, i18 - 1, i21);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i19);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i22 = i17 + 5;
                int i23 = parseInt(str, i17 + 3, i22);
                if (checkOffset(str, i22, ':')) {
                    i22 = i17 + 6;
                }
                int i24 = i22 + 2;
                int i25 = parseInt(str, i22, i24);
                if (checkOffset(str, i24, ':')) {
                    i24 = i22 + 3;
                }
                if (str.length() <= i24 || (cCharAt2 = str.charAt(i24)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i19 = i24;
                    i11 = i23;
                    i12 = i25;
                } else {
                    int i26 = i24 + 2;
                    i14 = parseInt(str, i24, i26);
                    if (i14 > 59 && i14 < 63) {
                        i14 = 59;
                    }
                    if (checkOffset(str, i26, '.')) {
                        int i27 = i24 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i24 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i24 + 6);
                        int i28 = parseInt(str, i27, iMin);
                        int i29 = iMin - i27;
                        if (i29 == 1) {
                            i28 *= 100;
                        } else if (i29 == 2) {
                            i28 *= 10;
                        }
                        i11 = i23;
                        i19 = iIndexOfNonDigit;
                        i12 = i25;
                        i13 = i28;
                    } else {
                        i11 = i23;
                        i19 = i26;
                        i12 = i25;
                        i13 = 0;
                    }
                }
                if (str.length() > i19) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i19);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i19 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i19);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i19 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str3) && !id2.replace(C33844oi.f71346o, "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i16);
                gregorianCalendar2.set(2, i18 - 1);
                gregorianCalendar2.set(5, i21);
                gregorianCalendar2.set(11, i11);
                gregorianCalendar2.set(12, i12);
                gregorianCalendar2.set(13, i14);
                gregorianCalendar2.set(14, i13);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            if (str.length() > i19) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i19);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i19 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i19);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i19 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i16);
            gregorianCalendar3.set(2, i18 - 1);
            gregorianCalendar3.set(5, i21);
            gregorianCalendar3.set(11, i11);
            gregorianCalendar3.set(12, i12);
            gregorianCalendar3.set(13, i14);
            gregorianCalendar3.set(14, i13);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e12) {
            e = e12;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e13) {
            e = e13;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static String format(Date date, boolean z11) {
        return format(date, z11, TIMEZONE_UTC);
    }

    private static int parseInt(String str, int i11, int i12) throws NumberFormatException {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = -iDigit;
        } else {
            i13 = 0;
            i14 = i11;
        }
        while (i14 < i12) {
            int i15 = i14 + 1;
            int iDigit2 = Character.digit(str.charAt(i14), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = (i13 * 10) - iDigit2;
            i14 = i15;
        }
        return -i13;
    }

    private static boolean checkOffset(String str, int i11, char c11) {
        if (i11 < str.length() && str.charAt(i11) == c11) {
            return true;
        }
        return false;
    }

    public static String format(Date date, boolean z11, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z11 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        if (z11) {
            sb2.append('.');
            padInt(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / 60000;
            int iAbs = Math.abs(i11 / 60);
            int iAbs2 = Math.abs(i11 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            padInt(sb2, iAbs, 2);
            sb2.append(':');
            padInt(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private static int indexOfNonDigit(String str, int i11) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i11++;
            } else {
                return i11;
            }
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i11, int i12) {
        String string = Integer.toString(i11);
        for (int length = i12 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }
}
