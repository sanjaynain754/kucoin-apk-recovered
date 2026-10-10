package com.facebook.common.util;

/* JADX INFO: loaded from: classes34.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? UNSET : NO;
        }
        return YES;
    }

    public boolean asBoolean() {
        int i11 = C5566a.f8167a[ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    /* JADX INFO: renamed from: com.facebook.common.util.TriState$a */
    public static /* synthetic */ class C5566a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8167a;

        static {
            int[] iArr = new int[TriState.values().length];
            f8167a = iArr;
            try {
                iArr[TriState.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8167a[TriState.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8167a[TriState.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static TriState valueOf(boolean z11) {
        return z11 ? YES : NO;
    }

    public Boolean asBooleanObject() {
        int i11 = C5566a.f8167a[ordinal()];
        if (i11 == 1) {
            return Boolean.TRUE;
        }
        if (i11 == 2) {
            return Boolean.FALSE;
        }
        if (i11 == 3) {
            return null;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public int getDbValue() {
        int i11 = C5566a.f8167a[ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return 3;
            }
        }
        return i12;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public boolean asBoolean(boolean z11) {
        int i11 = C5566a.f8167a[ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        if (i11 == 3) {
            return z11;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }
}
