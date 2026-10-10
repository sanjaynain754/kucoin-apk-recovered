package com.airbnb.lottie;

/* JADX INFO: loaded from: classes.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.airbnb.lottie.RenderMode$a */
    public static /* synthetic */ class C5065a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5928a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f5928a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5928a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5928a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i11, boolean z11, int i12) {
        int i13 = C5065a.f5928a[ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 != 2) {
            return (z11 && i11 < 28) || i12 > 4 || i11 <= 25;
        }
        return true;
    }
}
