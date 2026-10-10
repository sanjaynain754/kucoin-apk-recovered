package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum SwitchType implements Internal.EnumLite {
    NO_CHANGE(0),
    ON(1),
    OFF(2),
    UNRECOGNIZED(-1);

    public static final int NO_CHANGE_VALUE = 0;
    public static final int OFF_VALUE = 2;
    public static final int ON_VALUE = 1;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<SwitchType> f22201b = new Internal.EnumLiteMap<SwitchType>() { // from class: com.kubi.flutter.proto.kline.SwitchType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SwitchType findValueByNumber(int i11) {
            return SwitchType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SwitchType$b */
    public static final class C12723b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22203a = new C12723b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (SwitchType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static SwitchType forNumber(int i11) {
        if (i11 == 0) {
            return NO_CHANGE;
        }
        if (i11 == 1) {
            return ON;
        }
        if (i11 != 2) {
            return null;
        }
        return OFF;
    }

    public static Internal.EnumLiteMap<SwitchType> internalGetValueMap() {
        return f22201b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12723b.f22203a;
    }

    @Deprecated
    public static SwitchType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    SwitchType(int i11) {
        this.value = i11;
    }
}
