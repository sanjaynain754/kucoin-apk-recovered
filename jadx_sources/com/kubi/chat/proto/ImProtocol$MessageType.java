package com.kubi.chat.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum ImProtocol$MessageType implements Internal.EnumLite {
    fallback(0),
    TEXT(1),
    IMAGE(2),
    UNRECOGNIZED(-1);

    public static final int IMAGE_VALUE = 2;
    public static final int TEXT_VALUE = 1;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<ImProtocol$MessageType> f19379b = new Internal.EnumLiteMap<ImProtocol$MessageType>() { // from class: com.kubi.chat.proto.ImProtocol$MessageType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImProtocol$MessageType findValueByNumber(int i11) {
            return ImProtocol$MessageType.forNumber(i11);
        }
    };
    public static final int fallback_VALUE = 0;
    private final int value;

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$MessageType$b */
    public static final class C11389b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f19381a = new C11389b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (ImProtocol$MessageType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static ImProtocol$MessageType forNumber(int i11) {
        if (i11 == 0) {
            return fallback;
        }
        if (i11 == 1) {
            return TEXT;
        }
        if (i11 != 2) {
            return null;
        }
        return IMAGE;
    }

    public static Internal.EnumLiteMap<ImProtocol$MessageType> internalGetValueMap() {
        return f19379b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C11389b.f19381a;
    }

    @Deprecated
    public static ImProtocol$MessageType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    ImProtocol$MessageType(int i11) {
        this.value = i11;
    }
}
