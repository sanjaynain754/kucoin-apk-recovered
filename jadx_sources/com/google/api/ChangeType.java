package com.google.api;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes56.dex */
public enum ChangeType implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final Internal.EnumLiteMap<ChangeType> internalValueMap = new Internal.EnumLiteMap<ChangeType>() { // from class: com.google.api.ChangeType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ChangeType findValueByNumber(int i11) {
            return ChangeType.forNumber(i11);
        }
    };
    private final int value;

    public static final class ChangeTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ChangeTypeVerifier();

        private ChangeTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (ChangeType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static ChangeType forNumber(int i11) {
        if (i11 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i11 == 1) {
            return ADDED;
        }
        if (i11 == 2) {
            return REMOVED;
        }
        if (i11 != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static Internal.EnumLiteMap<ChangeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ChangeTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static ChangeType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    ChangeType(int i11) {
        this.value = i11;
    }
}
