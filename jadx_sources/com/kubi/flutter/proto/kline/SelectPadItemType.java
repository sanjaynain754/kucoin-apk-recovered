package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum SelectPadItemType implements Internal.EnumLite {
    TIME_DATA(0),
    OPEN_DATA(1),
    HIGH_DATA(2),
    LOW_DATA(3),
    CLOSE_DATA(4),
    VOL_DATA(5),
    CHANGE_AMOUNT_DATA(6),
    CHANGE_RATIO_DATA(7),
    AMPLITUDE_DATA(8),
    UNRECOGNIZED(-1);

    public static final int AMPLITUDE_DATA_VALUE = 8;
    public static final int CHANGE_AMOUNT_DATA_VALUE = 6;
    public static final int CHANGE_RATIO_DATA_VALUE = 7;
    public static final int CLOSE_DATA_VALUE = 4;
    public static final int HIGH_DATA_VALUE = 2;
    public static final int LOW_DATA_VALUE = 3;
    public static final int OPEN_DATA_VALUE = 1;
    public static final int TIME_DATA_VALUE = 0;
    public static final int VOL_DATA_VALUE = 5;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<SelectPadItemType> f22182b = new Internal.EnumLiteMap<SelectPadItemType>() { // from class: com.kubi.flutter.proto.kline.SelectPadItemType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SelectPadItemType findValueByNumber(int i11) {
            return SelectPadItemType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SelectPadItemType$b */
    public static final class C12710b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22184a = new C12710b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (SelectPadItemType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static Internal.EnumLiteMap<SelectPadItemType> internalGetValueMap() {
        return f22182b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12710b.f22184a;
    }

    @Deprecated
    public static SelectPadItemType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    SelectPadItemType(int i11) {
        this.value = i11;
    }

    public static SelectPadItemType forNumber(int i11) {
        switch (i11) {
            case 0:
                return TIME_DATA;
            case 1:
                return OPEN_DATA;
            case 2:
                return HIGH_DATA;
            case 3:
                return LOW_DATA;
            case 4:
                return CLOSE_DATA;
            case 5:
                return VOL_DATA;
            case 6:
                return CHANGE_AMOUNT_DATA;
            case 7:
                return CHANGE_RATIO_DATA;
            case 8:
                return AMPLITUDE_DATA;
            default:
                return null;
        }
    }
}
