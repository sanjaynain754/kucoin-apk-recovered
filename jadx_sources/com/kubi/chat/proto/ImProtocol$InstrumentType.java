package com.kubi.chat.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum ImProtocol$InstrumentType implements Internal.EnumLite {
    UNKNOWN_(0),
    HEARTBEAT(1),
    ACK(2),
    MESSAGE_READ(3),
    TEXT_ERROR(4),
    RATE_LIMIT(5),
    UNRECOGNIZED(-1);

    public static final int ACK_VALUE = 2;
    public static final int HEARTBEAT_VALUE = 1;
    public static final int MESSAGE_READ_VALUE = 3;
    public static final int RATE_LIMIT_VALUE = 5;
    public static final int TEXT_ERROR_VALUE = 4;
    public static final int UNKNOWN__VALUE = 0;

    /* JADX INFO: renamed from: b */
    public static final Internal.EnumLiteMap<ImProtocol$InstrumentType> f19375b = new Internal.EnumLiteMap<ImProtocol$InstrumentType>() { // from class: com.kubi.chat.proto.ImProtocol$InstrumentType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImProtocol$InstrumentType findValueByNumber(int i11) {
            return ImProtocol$InstrumentType.forNumber(i11);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$InstrumentType$b */
    public static final class C11385b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a */
        public static final Internal.EnumVerifier f19377a = new C11385b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (ImProtocol$InstrumentType.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static ImProtocol$InstrumentType forNumber(int i11) {
        if (i11 == 0) {
            return UNKNOWN_;
        }
        if (i11 == 1) {
            return HEARTBEAT;
        }
        if (i11 == 2) {
            return ACK;
        }
        if (i11 == 3) {
            return MESSAGE_READ;
        }
        if (i11 == 4) {
            return TEXT_ERROR;
        }
        if (i11 != 5) {
            return null;
        }
        return RATE_LIMIT;
    }

    public static Internal.EnumLiteMap<ImProtocol$InstrumentType> internalGetValueMap() {
        return f19375b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C11385b.f19377a;
    }

    @Deprecated
    public static ImProtocol$InstrumentType valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    ImProtocol$InstrumentType(int i11) {
        this.value = i11;
    }
}
