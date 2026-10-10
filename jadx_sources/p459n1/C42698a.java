package p459n1;

import p852kotlin.text.Typography;

/* JADX INFO: renamed from: n1.a */
/* JADX INFO: compiled from: JsonScope.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C42698a {
    /* JADX INFO: renamed from: a */
    public static String m93586a(int i11, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Typography.dollar);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = strArr[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }
}
