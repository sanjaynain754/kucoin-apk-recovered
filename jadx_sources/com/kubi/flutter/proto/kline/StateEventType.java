package com.kubi.flutter.proto.kline;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes13.dex */
public enum StateEventType implements Internal.EnumLite {
    VIEW_LOADED(0),
    UNRECOGNIZED(-1);

    public static final int VIEW_LOADED_VALUE = 0;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<StateEventType> f22188b = new Internal.EnumLiteMap<StateEventType>() { // from class: com.kubi.flutter.proto.kline.StateEventType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StateEventType findValueByNumber(int i11) {
            return StateEventType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.StateEventType$b */
    public static final class C12714b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f22190a = new C12714b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (StateEventType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static StateEventType forNumber(int i11) {
        if (i11 != 0) {
            return null;
        }
        return VIEW_LOADED;
    }

    public static Internal.EnumLiteMap<StateEventType> internalGetValueMap() {
        return f22188b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C12714b.f22190a;
    }

    @Deprecated
    public static StateEventType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    StateEventType(int i11) {
        this.value = i11;
    }
}
