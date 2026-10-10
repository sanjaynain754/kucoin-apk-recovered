package com.kubi.chat.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum ImProtocol$ProtocolType implements Internal.EnumLite {
    UNKNOWN(0),
    INSTRUMENT(1),
    MESSAGE(2),
    UNRECOGNIZED(-1);

    public static final int INSTRUMENT_VALUE = 1;
    public static final int MESSAGE_VALUE = 2;
    public static final int UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<ImProtocol$ProtocolType> f19384b = new Internal.EnumLiteMap<ImProtocol$ProtocolType>() { // from class: com.kubi.chat.proto.ImProtocol$ProtocolType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImProtocol$ProtocolType findValueByNumber(int i11) {
            return ImProtocol$ProtocolType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$ProtocolType$b */
    public static final class C11394b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f19386a = new C11394b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (ImProtocol$ProtocolType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static ImProtocol$ProtocolType forNumber(int i11) {
        if (i11 == 0) {
            return UNKNOWN;
        }
        if (i11 == 1) {
            return INSTRUMENT;
        }
        if (i11 != 2) {
            return null;
        }
        return MESSAGE;
    }

    public static Internal.EnumLiteMap<ImProtocol$ProtocolType> internalGetValueMap() {
        return f19384b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C11394b.f19386a;
    }

    @Deprecated
    public static ImProtocol$ProtocolType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    ImProtocol$ProtocolType(int i11) {
        this.value = i11;
    }
}
