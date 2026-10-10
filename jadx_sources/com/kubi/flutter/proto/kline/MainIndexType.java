package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum MainIndexType implements Internal.EnumLite {
    MA(0),
    EMA(1),
    BOLL(2),
    UNRECOGNIZED(-1);

    public static final int BOLL_VALUE = 2;
    public static final int EMA_VALUE = 1;
    public static final int MA_VALUE = 0;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<MainIndexType> f22131b = new Internal.EnumLiteMap<MainIndexType>() { // from class: com.kubi.flutter.proto.kline.MainIndexType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MainIndexType findValueByNumber(int i11) {
            return MainIndexType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MainIndexType$b */
    public static final class C12676b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22133a = new C12676b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (MainIndexType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static MainIndexType forNumber(int i11) {
        if (i11 == 0) {
            return MA;
        }
        if (i11 == 1) {
            return EMA;
        }
        if (i11 != 2) {
            return null;
        }
        return BOLL;
    }

    public static Internal.EnumLiteMap<MainIndexType> internalGetValueMap() {
        return f22131b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12676b.f22133a;
    }

    @Deprecated
    public static MainIndexType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    MainIndexType(int i11) {
        this.value = i11;
    }
}
