package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes34.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = new Internal.EnumLiteMap<Syntax>() { // from class: androidx.datastore.preferences.protobuf.Syntax.1
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public Syntax findValueByNumber(int i11) {
            return Syntax.forNumber(i11);
        }
    };
    private final int value;

    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            if (Syntax.forNumber(i11) != null) {
                return true;
            }
            return false;
        }
    }

    public static Syntax forNumber(int i11) {
        if (i11 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i11 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i11 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SyntaxVerifier.INSTANCE;
    }

    @Deprecated
    public static Syntax valueOf(int i11) {
        return forNumber(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    Syntax(int i11) {
        this.value = i11;
    }
}
