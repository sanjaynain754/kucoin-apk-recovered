package qf0;

import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;

/* JADX INFO: renamed from: qf0.a */
/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC43726a {
    @ColorInt
    /* JADX INFO: renamed from: a */
    public static int m96336a(@ColorInt int i11, @IntRange(from = 0, m1553to = 255) int i12) {
        return (i11 & 16777215) | (i12 << 24);
    }
}
