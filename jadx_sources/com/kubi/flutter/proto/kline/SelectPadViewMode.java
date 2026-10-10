package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum SelectPadViewMode implements Internal.EnumLite {
    FLOAT_PAD(0),
    NONE_PAD(1),
    TOP_PAD(2),
    UNRECOGNIZED(-1);

    public static final int FLOAT_PAD_VALUE = 0;
    public static final int NONE_PAD_VALUE = 1;
    public static final int TOP_PAD_VALUE = 2;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<SelectPadViewMode> f22185b = new Internal.EnumLiteMap<SelectPadViewMode>() { // from class: com.kubi.flutter.proto.kline.SelectPadViewMode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SelectPadViewMode findValueByNumber(int i11) {
            return SelectPadViewMode.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SelectPadViewMode$b */
    public static final class C12712b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22187a = new C12712b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (SelectPadViewMode.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static SelectPadViewMode forNumber(int i11) {
        if (i11 == 0) {
            return FLOAT_PAD;
        }
        if (i11 == 1) {
            return NONE_PAD;
        }
        if (i11 != 2) {
            return null;
        }
        return TOP_PAD;
    }

    public static Internal.EnumLiteMap<SelectPadViewMode> internalGetValueMap() {
        return f22185b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12712b.f22187a;
    }

    @Deprecated
    public static SelectPadViewMode valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    SelectPadViewMode(int i11) {
        this.value = i11;
    }
}
