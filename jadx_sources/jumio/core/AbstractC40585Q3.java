package jumio.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: jumio.core.Q3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40585Q3 {
    /* JADX INFO: renamed from: a */
    public static String m89226a(String str, String regex, int i11) {
        String strM89225a;
        Intrinsics.checkNotNullParameter(regex, "regex");
        if (str == null || (strM89225a = m89225a(i11, str)) == null || !Pattern.compile(regex).matcher(strM89225a).matches()) {
            return null;
        }
        return strM89225a;
    }

    /* JADX INFO: renamed from: a */
    public static String m89227a(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb2 = new StringBuilder(data.length * 2);
        for (byte b11 : data) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m89228a(String hex) {
        Intrinsics.checkNotNullParameter(hex, "hex");
        int length = hex.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (Character.digit(hex.charAt(i12 + 1), 16) + (Character.digit(hex.charAt(i12), 16) << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static String m89225a(int i11, String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length) {
            boolean z12 = Intrinsics.compare((int) str.charAt(!z11 ? i12 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length--;
            } else if (z12) {
                i12++;
            } else {
                z11 = true;
            }
        }
        String string = str.subSequence(i12, length + 1).toString();
        if (i11 <= 0 || string.length() <= i11) {
            return string;
        }
        String strSubstring = string.substring(0, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
