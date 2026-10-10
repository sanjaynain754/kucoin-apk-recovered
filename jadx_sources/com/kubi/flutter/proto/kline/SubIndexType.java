package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum SubIndexType implements Internal.EnumLite {
    VOL(0),
    MACD(1),
    RSI(2),
    KDJ(3),
    UNRECOGNIZED(-1);

    public static final int KDJ_VALUE = 3;
    public static final int MACD_VALUE = 1;
    public static final int RSI_VALUE = 2;
    public static final int VOL_VALUE = 0;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<SubIndexType> f22194b = new Internal.EnumLiteMap<SubIndexType>() { // from class: com.kubi.flutter.proto.kline.SubIndexType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SubIndexType findValueByNumber(int i11) {
            return SubIndexType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SubIndexType$b */
    public static final class C12718b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22196a = new C12718b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (SubIndexType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static SubIndexType forNumber(int i11) {
        if (i11 == 0) {
            return VOL;
        }
        if (i11 == 1) {
            return MACD;
        }
        if (i11 == 2) {
            return RSI;
        }
        if (i11 != 3) {
            return null;
        }
        return KDJ;
    }

    public static Internal.EnumLiteMap<SubIndexType> internalGetValueMap() {
        return f22194b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12718b.f22196a;
    }

    @Deprecated
    public static SubIndexType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    SubIndexType(int i11) {
        this.value = i11;
    }
}
