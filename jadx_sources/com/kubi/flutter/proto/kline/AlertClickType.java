package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum AlertClickType implements Internal.EnumLite {
    CANCEL(0),
    CONFIRM(1),
    UNRECOGNIZED(-1);

    public static final int CANCEL_VALUE = 0;
    public static final int CONFIRM_VALUE = 1;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<AlertClickType> f22063b = new Internal.EnumLiteMap<AlertClickType>() { // from class: com.kubi.flutter.proto.kline.AlertClickType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlertClickType findValueByNumber(int i11) {
            return AlertClickType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.AlertClickType$b */
    public static final class C12634b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22065a = new C12634b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (AlertClickType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static AlertClickType forNumber(int i11) {
        if (i11 == 0) {
            return CANCEL;
        }
        if (i11 != 1) {
            return null;
        }
        return CONFIRM;
    }

    public static Internal.EnumLiteMap<AlertClickType> internalGetValueMap() {
        return f22063b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12634b.f22065a;
    }

    @Deprecated
    public static AlertClickType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    AlertClickType(int i11) {
        this.value = i11;
    }
}
