package jumio.camerax;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: jumio.camerax.w */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40497w {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89898a;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        try {
            iArr[Lifecycle.State.DESTROYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f89898a = iArr;
    }
}
