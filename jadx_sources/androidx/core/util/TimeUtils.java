package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TimeUtils {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j11, StringBuilder sb2) {
        synchronized (sFormatSync) {
            sb2.append(sFormatStr, 0, formatDurationLocked(j11, 0));
        }
    }

    private static int accumField(int i11, int i12, boolean z11, int i13) {
        if (i11 > 99 || (z11 && i13 >= 3)) {
            return i12 + 3;
        }
        if (i11 > 9 || (z11 && i13 >= 2)) {
            return i12 + 2;
        }
        if (z11 || i11 > 0) {
            return i12 + 1;
        }
        return 0;
    }

    private static int formatDurationLocked(long j11, int i11) {
        char c11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j12 = j11;
        if (sFormatStr.length < i11) {
            sFormatStr = new char[i11];
        }
        char[] cArr = sFormatStr;
        if (j12 == 0) {
            int i16 = i11 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j12 > 0) {
            c11 = '+';
        } else {
            j12 = -j12;
            c11 = '-';
        }
        int i17 = (int) (j12 % 1000);
        int iFloor = (int) Math.floor(j12 / 1000);
        if (iFloor > 86400) {
            i12 = iFloor / 86400;
            iFloor -= 86400 * i12;
        } else {
            i12 = 0;
        }
        if (iFloor > 3600) {
            i13 = iFloor / 3600;
            iFloor -= i13 * 3600;
        } else {
            i13 = 0;
        }
        if (iFloor > 60) {
            int i18 = iFloor / 60;
            iFloor -= i18 * 60;
            i14 = i18;
        } else {
            i14 = 0;
        }
        if (i11 != 0) {
            int iAccumField = accumField(i12, 1, false, 0);
            int iAccumField2 = iAccumField + accumField(i13, 1, iAccumField > 0, 2);
            int iAccumField3 = iAccumField2 + accumField(i14, 1, iAccumField2 > 0, 2);
            int iAccumField4 = iAccumField3 + accumField(iFloor, 1, iAccumField3 > 0, 2);
            i15 = 0;
            for (int iAccumField5 = iAccumField4 + accumField(i17, 2, true, iAccumField4 > 0 ? 3 : 0) + 1; iAccumField5 < i11; iAccumField5++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c11;
        int i19 = i15 + 1;
        boolean z11 = i11 != 0;
        int iPrintField = printField(cArr, i12, 'd', i19, false, 0);
        int iPrintField2 = printField(cArr, i13, 'h', iPrintField, iPrintField != i19, z11 ? 2 : 0);
        int iPrintField3 = printField(cArr, i14, 'm', iPrintField2, iPrintField2 != i19, z11 ? 2 : 0);
        int iPrintField4 = printField(cArr, iFloor, 's', iPrintField3, iPrintField3 != i19, z11 ? 2 : 0);
        int iPrintField5 = printField(cArr, i17, 'm', iPrintField4, true, (!z11 || iPrintField4 == i19) ? 0 : 3);
        cArr[iPrintField5] = 's';
        return iPrintField5 + 1;
    }

    private static int printField(char[] cArr, int i11, char c11, int i12, boolean z11, int i13) {
        int i14;
        if (!z11 && i11 <= 0) {
            return i12;
        }
        if ((!z11 || i13 < 3) && i11 <= 99) {
            i14 = i12;
        } else {
            int i15 = i11 / 100;
            cArr[i12] = (char) (i15 + 48);
            i14 = i12 + 1;
            i11 -= i15 * 100;
        }
        if ((z11 && i13 >= 2) || i11 > 9 || i12 != i14) {
            int i16 = i11 / 10;
            cArr[i14] = (char) (i16 + 48);
            i14++;
            i11 -= i16 * 10;
        }
        cArr[i14] = (char) (i11 + 48);
        cArr[i14 + 1] = c11;
        return i14 + 2;
    }

    private TimeUtils() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j11, PrintWriter printWriter, int i11) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j11, i11)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j11, PrintWriter printWriter) {
        formatDuration(j11, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j11, long j12, PrintWriter printWriter) {
        if (j11 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j11 - j12, printWriter, 0);
        }
    }
}
