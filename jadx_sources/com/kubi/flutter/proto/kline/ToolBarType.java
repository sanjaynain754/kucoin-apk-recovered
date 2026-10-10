package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum ToolBarType implements Internal.EnumLite {
    BAR_KLINE(0),
    BAR_PAINT(1),
    UNRECOGNIZED(-1);

    public static final int BAR_KLINE_VALUE = 0;
    public static final int BAR_PAINT_VALUE = 1;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<ToolBarType> f22213b = new Internal.EnumLiteMap<ToolBarType>() { // from class: com.kubi.flutter.proto.kline.ToolBarType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ToolBarType findValueByNumber(int i11) {
            return ToolBarType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ToolBarType$b */
    public static final class C12731b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22215a = new C12731b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (ToolBarType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static ToolBarType forNumber(int i11) {
        if (i11 == 0) {
            return BAR_KLINE;
        }
        if (i11 != 1) {
            return null;
        }
        return BAR_PAINT;
    }

    public static Internal.EnumLiteMap<ToolBarType> internalGetValueMap() {
        return f22213b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12731b.f22215a;
    }

    @Deprecated
    public static ToolBarType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    ToolBarType(int i11) {
        this.value = i11;
    }
}
