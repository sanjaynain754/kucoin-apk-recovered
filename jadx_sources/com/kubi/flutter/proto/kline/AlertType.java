package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum AlertType implements Internal.EnumLite {
    ALERT_SHOW(0),
    ALERT_HIDE(1),
    UNRECOGNIZED(-1);

    public static final int ALERT_HIDE_VALUE = 1;
    public static final int ALERT_SHOW_VALUE = 0;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<AlertType> f22066b = new Internal.EnumLiteMap<AlertType>() { // from class: com.kubi.flutter.proto.kline.AlertType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlertType findValueByNumber(int i11) {
            return AlertType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.AlertType$b */
    public static final class C12636b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22068a = new C12636b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (AlertType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static AlertType forNumber(int i11) {
        if (i11 == 0) {
            return ALERT_SHOW;
        }
        if (i11 != 1) {
            return null;
        }
        return ALERT_HIDE;
    }

    public static Internal.EnumLiteMap<AlertType> internalGetValueMap() {
        return f22066b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12636b.f22068a;
    }

    @Deprecated
    public static AlertType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    AlertType(int i11) {
        this.value = i11;
    }
}
