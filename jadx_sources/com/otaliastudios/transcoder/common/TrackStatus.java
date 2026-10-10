package com.otaliastudios.transcoder.common;

/* JADX INFO: loaded from: classes59.dex */
public enum TrackStatus {
    ABSENT,
    REMOVING,
    PASS_THROUGH,
    COMPRESSING;

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.common.TrackStatus$a */
    public static /* synthetic */ class C27331a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55613a;

        static {
            int[] iArr = new int[TrackStatus.values().length];
            f55613a = iArr;
            try {
                iArr[TrackStatus.PASS_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55613a[TrackStatus.COMPRESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55613a[TrackStatus.REMOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55613a[TrackStatus.ABSENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean isTranscoding() {
        int i11 = C27331a.f55613a[ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        throw new RuntimeException("Unexpected track status: " + this);
    }
}
