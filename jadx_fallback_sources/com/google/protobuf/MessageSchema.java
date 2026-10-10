package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.protobuf.CheckReturnValue
final class MessageSchema<T> implements com.google.protobuf.Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final sun.misc.Unsafe UNSAFE = null;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final com.google.protobuf.MessageLite defaultInstance;
    private final com.google.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final com.google.protobuf.ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final com.google.protobuf.MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final com.google.protobuf.NewInstanceSchema newInstanceSchema;
    private final java.lang.Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final com.google.protobuf.ProtoSyntax syntax;
    private final com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1 */
    /* JADX INFO: loaded from: classes56.dex */
    public static /* synthetic */ class C90811 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                return
        }
    }

    static {
            r0 = 0
            int[] r0 = new int[r0]
            com.google.protobuf.MessageSchema.EMPTY_INT_ARRAY = r0
            sun.misc.Unsafe r0 = com.google.protobuf.UnsafeUtil.getUnsafe()
            com.google.protobuf.MessageSchema.UNSAFE = r0
            return
    }

    private MessageSchema(int[] r1, java.lang.Object[] r2, int r3, int r4, com.google.protobuf.MessageLite r5, com.google.protobuf.ProtoSyntax r6, boolean r7, int[] r8, int r9, int r10, com.google.protobuf.NewInstanceSchema r11, com.google.protobuf.ListFieldSchema r12, com.google.protobuf.UnknownFieldSchema<?, ?> r13, com.google.protobuf.ExtensionSchema<?> r14, com.google.protobuf.MapFieldSchema r15) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            r0.objects = r2
            r0.minFieldNumber = r3
            r0.maxFieldNumber = r4
            boolean r1 = r5 instanceof com.google.protobuf.GeneratedMessageLite
            r0.lite = r1
            r0.syntax = r6
            if (r14 == 0) goto L1b
            boolean r1 = r14.hasExtensions(r5)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.hasExtensions = r1
            r0.useCachedSizeField = r7
            r0.intArray = r8
            r0.checkInitializedCount = r9
            r0.repeatedFieldOffsetStart = r10
            r0.newInstanceSchema = r11
            r0.listFieldSchema = r12
            r0.unknownFieldSchema = r13
            r0.extensionSchema = r14
            r0.defaultInstance = r5
            r1 = r15
            r0.mapFieldSchema = r1
            return
    }

    private boolean arePresentForEquals(T r1, T r2, int r3) {
            r0 = this;
            boolean r1 = r0.isFieldPresent(r1, r3)
            boolean r2 = r0.isFieldPresent(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static <T> boolean booleanAt(T r0, long r1) {
            boolean r0 = com.google.protobuf.UnsafeUtil.getBoolean(r0, r1)
            return r0
    }

    private static void checkMutable(java.lang.Object r3) {
            boolean r0 = isMutable(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Mutating immutable message: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private <K, V> int decodeMapEntry(byte[] r11, int r12, int r13, com.google.protobuf.MapEntryLite.Metadata<K, V> r14, java.util.Map<K, V> r15, com.google.protobuf.ArrayDecoders.Registers r16) throws java.io.IOException {
            r10 = this;
            r6 = r16
            int r12 = com.google.protobuf.ArrayDecoders.decodeVarint32(r11, r12, r6)
            int r0 = r6.int1
            if (r0 < 0) goto L6f
            int r1 = r13 - r12
            if (r0 > r1) goto L6f
            int r7 = r12 + r0
            K r0 = r14.defaultKey
            V r1 = r14.defaultValue
            r8 = r0
            r9 = r1
        L16:
            if (r12 >= r7) goto L64
            int r0 = r12 + 1
            r12 = r11[r12]
            if (r12 >= 0) goto L24
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint32(r12, r11, r0, r6)
            int r12 = r6.int1
        L24:
            r2 = r0
            int r0 = r12 >>> 3
            r1 = r12 & 7
            r3 = 1
            if (r0 == r3) goto L4a
            r3 = 2
            if (r0 == r3) goto L30
            goto L5f
        L30:
            com.google.protobuf.WireFormat$FieldType r0 = r14.valueType
            int r0 = r0.getWireType()
            if (r1 != r0) goto L5f
            com.google.protobuf.WireFormat$FieldType r4 = r14.valueType
            V r12 = r14.defaultValue
            java.lang.Class r5 = r12.getClass()
            r0 = r10
            r1 = r11
            r3 = r13
            int r12 = r0.decodeMapEntryValue(r1, r2, r3, r4, r5, r6)
            java.lang.Object r9 = r6.object1
            goto L16
        L4a:
            com.google.protobuf.WireFormat$FieldType r0 = r14.keyType
            int r0 = r0.getWireType()
            if (r1 != r0) goto L5f
            com.google.protobuf.WireFormat$FieldType r4 = r14.keyType
            r5 = 0
            r0 = r10
            r1 = r11
            r3 = r13
            int r12 = r0.decodeMapEntryValue(r1, r2, r3, r4, r5, r6)
            java.lang.Object r8 = r6.object1
            goto L16
        L5f:
            int r12 = com.google.protobuf.ArrayDecoders.skipField(r12, r11, r2, r13, r6)
            goto L16
        L64:
            if (r12 != r7) goto L6a
            r15.put(r8, r9)
            return r7
        L6a:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
        L6f:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r11
    }

    private int decodeMapEntryValue(byte[] r2, int r3, int r4, com.google.protobuf.WireFormat.FieldType r5, java.lang.Class<?> r6, com.google.protobuf.ArrayDecoders.Registers r7) throws java.io.IOException {
            r1 = this;
            int[] r0 = com.google.protobuf.MessageSchema.C90811.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L9b;
                case 2: goto L96;
                case 3: goto L89;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L6f;
                case 7: goto L6f;
                case 8: goto L62;
                case 9: goto L55;
                case 10: goto L55;
                case 11: goto L55;
                case 12: goto L48;
                case 13: goto L48;
                case 14: goto L3b;
                case 15: goto L2a;
                case 16: goto L19;
                case 17: goto L14;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L14:
            int r2 = com.google.protobuf.ArrayDecoders.decodeStringRequireUtf8(r2, r3, r7)
            return r2
        L19:
            int r2 = com.google.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r3 = r7.long1
            long r3 = com.google.protobuf.CodedInputStream.decodeZigZag64(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.object1 = r3
            return r2
        L2a:
            int r2 = com.google.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r7)
            int r3 = r7.int1
            int r3 = com.google.protobuf.CodedInputStream.decodeZigZag32(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.object1 = r3
            return r2
        L3b:
            com.google.protobuf.Protobuf r5 = com.google.protobuf.Protobuf.getInstance()
            com.google.protobuf.Schema r5 = r5.schemaFor(r6)
            int r2 = com.google.protobuf.ArrayDecoders.decodeMessageField(r5, r2, r3, r4, r7)
            return r2
        L48:
            int r2 = com.google.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r3 = r7.long1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.object1 = r3
            return r2
        L55:
            int r2 = com.google.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r7)
            int r3 = r7.int1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.object1 = r3
            return r2
        L62:
            float r2 = com.google.protobuf.ArrayDecoders.decodeFloat(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.object1 = r2
            int r3 = r3 + 4
            return r3
        L6f:
            long r4 = com.google.protobuf.ArrayDecoders.decodeFixed64(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.object1 = r2
            int r3 = r3 + 8
            return r3
        L7c:
            int r2 = com.google.protobuf.ArrayDecoders.decodeFixed32(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.object1 = r2
            int r3 = r3 + 4
            return r3
        L89:
            double r4 = com.google.protobuf.ArrayDecoders.decodeDouble(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.object1 = r2
            int r3 = r3 + 8
            return r3
        L96:
            int r2 = com.google.protobuf.ArrayDecoders.decodeBytes(r2, r3, r7)
            return r2
        L9b:
            int r2 = com.google.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r3 = r7.long1
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto La9
            r3 = 1
            goto Laa
        La9:
            r3 = 0
        Laa:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.object1 = r3
            return r2
    }

    private static <T> double doubleAt(T r0, long r1) {
            double r0 = com.google.protobuf.UnsafeUtil.getDouble(r0, r1)
            return r0
    }

    private boolean equals(T r8, T r9, int r10) {
            r7 = this;
            int r0 = r7.typeAndOffsetAt(r10)
            long r1 = offset(r0)
            int r0 = type(r0)
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L196;
                case 1: goto L17c;
                case 2: goto L168;
                case 3: goto L154;
                case 4: goto L142;
                case 5: goto L12e;
                case 6: goto L11c;
                case 7: goto L10a;
                case 8: goto Lf4;
                case 9: goto Lde;
                case 10: goto Lc8;
                case 11: goto Lb6;
                case 12: goto La4;
                case 13: goto L92;
                case 14: goto L7e;
                case 15: goto L6c;
                case 16: goto L58;
                case 17: goto L42;
                case 18: goto L35;
                case 19: goto L35;
                case 20: goto L35;
                case 21: goto L35;
                case 22: goto L35;
                case 23: goto L35;
                case 24: goto L35;
                case 25: goto L35;
                case 26: goto L35;
                case 27: goto L35;
                case 28: goto L35;
                case 29: goto L35;
                case 30: goto L35;
                case 31: goto L35;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L35;
                case 35: goto L35;
                case 36: goto L35;
                case 37: goto L35;
                case 38: goto L35;
                case 39: goto L35;
                case 40: goto L35;
                case 41: goto L35;
                case 42: goto L35;
                case 43: goto L35;
                case 44: goto L35;
                case 45: goto L35;
                case 46: goto L35;
                case 47: goto L35;
                case 48: goto L35;
                case 49: goto L35;
                case 50: goto L28;
                case 51: goto L12;
                case 52: goto L12;
                case 53: goto L12;
                case 54: goto L12;
                case 55: goto L12;
                case 56: goto L12;
                case 57: goto L12;
                case 58: goto L12;
                case 59: goto L12;
                case 60: goto L12;
                case 61: goto L12;
                case 62: goto L12;
                case 63: goto L12;
                case 64: goto L12;
                case 65: goto L12;
                case 66: goto L12;
                case 67: goto L12;
                case 68: goto L12;
                default: goto L11;
            }
        L11:
            return r4
        L12:
            boolean r10 = r7.isOneofCaseEqual(r8, r9, r10)
            if (r10 == 0) goto L27
            java.lang.Object r8 = com.google.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L27
            return r4
        L27:
            return r3
        L28:
            java.lang.Object r8 = com.google.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.protobuf.SchemaUtil.safeEquals(r8, r9)
            return r8
        L35:
            java.lang.Object r8 = com.google.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.protobuf.SchemaUtil.safeEquals(r8, r9)
            return r8
        L42:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L57
            java.lang.Object r8 = com.google.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L57
            return r4
        L57:
            return r3
        L58:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L6b
            long r5 = com.google.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L6b
            return r4
        L6b:
            return r3
        L6c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L7d
            int r8 = com.google.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L7d
            return r4
        L7d:
            return r3
        L7e:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L91
            long r5 = com.google.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L91
            return r4
        L91:
            return r3
        L92:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto La3
            int r8 = com.google.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto La3
            return r4
        La3:
            return r3
        La4:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lb5
            int r8 = com.google.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto Lb5
            return r4
        Lb5:
            return r3
        Lb6:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lc7
            int r8 = com.google.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto Lc7
            return r4
        Lc7:
            return r3
        Lc8:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Ldd
            java.lang.Object r8 = com.google.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto Ldd
            return r4
        Ldd:
            return r3
        Lde:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lf3
            java.lang.Object r8 = com.google.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto Lf3
            return r4
        Lf3:
            return r3
        Lf4:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L109
            java.lang.Object r8 = com.google.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = com.google.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L109
            return r4
        L109:
            return r3
        L10a:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L11b
            boolean r8 = com.google.protobuf.UnsafeUtil.getBoolean(r8, r1)
            boolean r9 = com.google.protobuf.UnsafeUtil.getBoolean(r9, r1)
            if (r8 != r9) goto L11b
            return r4
        L11b:
            return r3
        L11c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L12d
            int r8 = com.google.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L12d
            return r4
        L12d:
            return r3
        L12e:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L141
            long r5 = com.google.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L141
            return r4
        L141:
            return r3
        L142:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L153
            int r8 = com.google.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = com.google.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L153
            return r4
        L153:
            return r3
        L154:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L167
            long r5 = com.google.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L167
            return r4
        L167:
            return r3
        L168:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L17b
            long r5 = com.google.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = com.google.protobuf.UnsafeUtil.getLong(r9, r1)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L17b
            return r4
        L17b:
            return r3
        L17c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L195
            float r8 = com.google.protobuf.UnsafeUtil.getFloat(r8, r1)
            int r8 = java.lang.Float.floatToIntBits(r8)
            float r9 = com.google.protobuf.UnsafeUtil.getFloat(r9, r1)
            int r9 = java.lang.Float.floatToIntBits(r9)
            if (r8 != r9) goto L195
            return r4
        L195:
            return r3
        L196:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L1b1
            double r5 = com.google.protobuf.UnsafeUtil.getDouble(r8, r1)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            double r8 = com.google.protobuf.UnsafeUtil.getDouble(r9, r1)
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L1b1
            return r4
        L1b1:
            return r3
    }

    private <UT, UB> UB filterMapUnknownEnumValues(java.lang.Object r9, int r10, UB r11, com.google.protobuf.UnknownFieldSchema<UT, UB> r12, java.lang.Object r13) {
            r8 = this;
            int r2 = r8.numberAt(r10)
            int r0 = r8.typeAndOffsetAt(r10)
            long r0 = offset(r0)
            java.lang.Object r9 = com.google.protobuf.UnsafeUtil.getObject(r9, r0)
            if (r9 != 0) goto L13
            goto L19
        L13:
            com.google.protobuf.Internal$EnumVerifier r4 = r8.getEnumFieldVerifier(r10)
            if (r4 != 0) goto L1a
        L19:
            return r11
        L1a:
            com.google.protobuf.MapFieldSchema r0 = r8.mapFieldSchema
            java.util.Map r3 = r0.forMutableMapData(r9)
            r0 = r8
            r1 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r9 = r0.filterUnknownEnumMap(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int r5, int r6, java.util.Map<K, V> r7, com.google.protobuf.Internal.EnumVerifier r8, UB r9, com.google.protobuf.UnknownFieldSchema<UT, UB> r10, java.lang.Object r11) {
            r4 = this;
            com.google.protobuf.MapFieldSchema r0 = r4.mapFieldSchema
            java.lang.Object r5 = r4.getMapFieldDefaultEntry(r5)
            com.google.protobuf.MapEntryLite$Metadata r5 = r0.forMapMetadata(r5)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L12:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r8.isInRange(r1)
            if (r1 != 0) goto L12
            if (r9 != 0) goto L34
            java.lang.Object r9 = r10.getBuilderFromMessage(r11)
        L34:
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            int r1 = com.google.protobuf.MapEntryLite.computeSerializedSize(r5, r1, r2)
            com.google.protobuf.ByteString$CodedBuilder r1 = com.google.protobuf.ByteString.newCodedBuilder(r1)
            com.google.protobuf.CodedOutputStream r2 = r1.getCodedOutput()
            java.lang.Object r3 = r0.getKey()     // Catch: java.io.IOException -> L5e
            java.lang.Object r0 = r0.getValue()     // Catch: java.io.IOException -> L5e
            com.google.protobuf.MapEntryLite.writeTo(r2, r5, r3, r0)     // Catch: java.io.IOException -> L5e
            com.google.protobuf.ByteString r0 = r1.build()
            r10.addLengthDelimited(r9, r6, r0)
            r7.remove()
            goto L12
        L5e:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L65:
            return r9
    }

    private static <T> float floatAt(T r0, long r1) {
            float r0 = com.google.protobuf.UnsafeUtil.getFloat(r0, r1)
            return r0
    }

    private com.google.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            int r2 = r2 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            com.google.protobuf.Internal$EnumVerifier r2 = (com.google.protobuf.Internal.EnumVerifier) r2
            return r2
    }

    private java.lang.Object getMapFieldDefaultEntry(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            int r2 = r2 / 3
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    private com.google.protobuf.Schema getMessageFieldSchema(int r4) {
            r3 = this;
            int r4 = r4 / 3
            int r4 = r4 * 2
            java.lang.Object[] r0 = r3.objects
            r0 = r0[r4]
            com.google.protobuf.Schema r0 = (com.google.protobuf.Schema) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.google.protobuf.Protobuf r0 = com.google.protobuf.Protobuf.getInstance()
            java.lang.Object[] r1 = r3.objects
            int r2 = r4 + 1
            r1 = r1[r2]
            java.lang.Class r1 = (java.lang.Class) r1
            com.google.protobuf.Schema r0 = r0.schemaFor(r1)
            java.lang.Object[] r1 = r3.objects
            r1[r4] = r0
            return r0
    }

    public static com.google.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object r2) {
            com.google.protobuf.GeneratedMessageLite r2 = (com.google.protobuf.GeneratedMessageLite) r2
            com.google.protobuf.UnknownFieldSetLite r0 = r2.unknownFields
            com.google.protobuf.UnknownFieldSetLite r1 = com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r0 != r1) goto L10
            com.google.protobuf.UnknownFieldSetLite r0 = com.google.protobuf.UnknownFieldSetLite.newInstance()
            r2.unknownFields = r0
        L10:
            return r0
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.protobuf.UnknownFieldSchema<UT, UB> r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            int r1 = r1.getSerializedSize(r2)
            return r1
    }

    private static <T> int intAt(T r0, long r1) {
            int r0 = com.google.protobuf.UnsafeUtil.getInt(r0, r1)
            return r0
    }

    private static boolean isEnforceUtf8(int r1) {
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private boolean isFieldPresent(T r7, int r8) {
            r6 = this;
            int r0 = r6.presenceMaskAndOffsetAt(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r1 = (long) r1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r3 != 0) goto Le8
            int r8 = r6.typeAndOffsetAt(r8)
            long r0 = offset(r8)
            int r8 = type(r8)
            r2 = 0
            switch(r8) {
                case 0: goto Lda;
                case 1: goto Lce;
                case 2: goto Lc4;
                case 3: goto Lba;
                case 4: goto Lb2;
                case 5: goto La8;
                case 6: goto La0;
                case 7: goto L9b;
                case 8: goto L79;
                case 9: goto L71;
                case 10: goto L65;
                case 11: goto L5d;
                case 12: goto L55;
                case 13: goto L4d;
                case 14: goto L43;
                case 15: goto L3b;
                case 16: goto L31;
                case 17: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L29:
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r0)
            if (r7 == 0) goto L30
            return r5
        L30:
            return r4
        L31:
            long r7 = com.google.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L42
            return r5
        L42:
            return r4
        L43:
            long r7 = com.google.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L4c
            return r5
        L4c:
            return r4
        L4d:
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L54
            return r5
        L54:
            return r4
        L55:
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L5c
            return r5
        L5c:
            return r4
        L5d:
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto L64
            return r5
        L64:
            return r4
        L65:
            com.google.protobuf.ByteString r8 = com.google.protobuf.ByteString.EMPTY
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r0)
            boolean r7 = r8.equals(r7)
            r7 = r7 ^ r5
            return r7
        L71:
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r0)
            if (r7 == 0) goto L78
            return r5
        L78:
            return r4
        L79:
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r0)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L89
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r5
            return r7
        L89:
            boolean r8 = r7 instanceof com.google.protobuf.ByteString
            if (r8 == 0) goto L95
            com.google.protobuf.ByteString r8 = com.google.protobuf.ByteString.EMPTY
            boolean r7 = r8.equals(r7)
            r7 = r7 ^ r5
            return r7
        L95:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L9b:
            boolean r7 = com.google.protobuf.UnsafeUtil.getBoolean(r7, r0)
            return r7
        La0:
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto La7
            return r5
        La7:
            return r4
        La8:
            long r7 = com.google.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lb1
            return r5
        Lb1:
            return r4
        Lb2:
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r0)
            if (r7 == 0) goto Lb9
            return r5
        Lb9:
            return r4
        Lba:
            long r7 = com.google.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lc3
            return r5
        Lc3:
            return r4
        Lc4:
            long r7 = com.google.protobuf.UnsafeUtil.getLong(r7, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lcd
            return r5
        Lcd:
            return r4
        Lce:
            float r7 = com.google.protobuf.UnsafeUtil.getFloat(r7, r0)
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            if (r7 == 0) goto Ld9
            return r5
        Ld9:
            return r4
        Lda:
            double r7 = com.google.protobuf.UnsafeUtil.getDouble(r7, r0)
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Le7
            return r5
        Le7:
            return r4
        Le8:
            int r8 = r0 >>> 20
            int r8 = r5 << r8
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r1)
            r7 = r7 & r8
            if (r7 == 0) goto Lf4
            return r5
        Lf4:
            return r4
    }

    private boolean isFieldPresent(T r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r2 = r1.isFieldPresent(r2, r3)
            return r2
        La:
            r2 = r5 & r6
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private static boolean isInitialized(java.lang.Object r2, int r3, com.google.protobuf.Schema r4) {
            long r0 = offset(r3)
            java.lang.Object r2 = com.google.protobuf.UnsafeUtil.getObject(r2, r0)
            boolean r2 = r4.isInitialized(r2)
            return r2
    }

    private static boolean isLegacyEnumIsClosed(int r1) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private <N> boolean isListInitialized(java.lang.Object r4, int r5, int r6) {
            r3 = this;
            long r0 = offset(r5)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r4, r0)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            r0 = 1
            if (r5 == 0) goto L12
            return r0
        L12:
            com.google.protobuf.Schema r5 = r3.getMessageFieldSchema(r6)
            r6 = 0
            r1 = r6
        L18:
            int r2 = r4.size()
            if (r1 >= r2) goto L2c
            java.lang.Object r2 = r4.get(r1)
            boolean r2 = r5.isInitialized(r2)
            if (r2 != 0) goto L29
            return r6
        L29:
            int r1 = r1 + 1
            goto L18
        L2c:
            return r0
    }

    private boolean isMapInitialized(T r4, int r5, int r6) {
            r3 = this;
            com.google.protobuf.MapFieldSchema r0 = r3.mapFieldSchema
            long r1 = offset(r5)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r4, r1)
            java.util.Map r4 = r0.forMapData(r4)
            boolean r5 = r4.isEmpty()
            r0 = 1
            if (r5 == 0) goto L16
            return r0
        L16:
            java.lang.Object r5 = r3.getMapFieldDefaultEntry(r6)
            com.google.protobuf.MapFieldSchema r6 = r3.mapFieldSchema
            com.google.protobuf.MapEntryLite$Metadata r5 = r6.forMapMetadata(r5)
            com.google.protobuf.WireFormat$FieldType r5 = r5.valueType
            com.google.protobuf.WireFormat$JavaType r5 = r5.getJavaType()
            com.google.protobuf.WireFormat$JavaType r6 = com.google.protobuf.WireFormat.JavaType.MESSAGE
            if (r5 == r6) goto L2b
            return r0
        L2b:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L34:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r4.next()
            if (r5 != 0) goto L4c
            com.google.protobuf.Protobuf r5 = com.google.protobuf.Protobuf.getInstance()
            java.lang.Class r1 = r6.getClass()
            com.google.protobuf.Schema r5 = r5.schemaFor(r1)
        L4c:
            boolean r6 = r5.isInitialized(r6)
            if (r6 != 0) goto L34
            r4 = 0
            return r4
        L54:
            return r0
    }

    private static boolean isMutable(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof com.google.protobuf.GeneratedMessageLite
            if (r0 == 0) goto Lf
            com.google.protobuf.GeneratedMessageLite r1 = (com.google.protobuf.GeneratedMessageLite) r1
            boolean r1 = r1.isMutable()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private boolean isOneofCaseEqual(T r3, T r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r3, r0)
            int r4 = com.google.protobuf.UnsafeUtil.getInt(r4, r0)
            if (r3 != r4) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    private boolean isOneofPresent(T r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r3, r0)
            if (r3 != r4) goto L11
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
    }

    private static boolean isRequired(int r1) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private static <T> long longAt(T r0, long r1) {
            long r0 = com.google.protobuf.UnsafeUtil.getLong(r0, r1)
            return r0
    }

    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
            r17 = this;
            r1 = r17
            r4 = r22
            r0 = 0
            r5 = 0
        L6:
            int r2 = r21.getFieldNumber()     // Catch: java.lang.Throwable -> L744
            int r3 = r1.positionForFieldNumber(r2)     // Catch: java.lang.Throwable -> L744
            r9 = 0
            if (r3 >= 0) goto Ld4
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L3f
            int r0 = r1.checkInitializedCount
            r4 = r5
        L19:
            int r2 = r1.repeatedFieldOffsetStart
            if (r0 >= r2) goto L32
            int[] r2 = r1.intArray
            r3 = r2[r0]
            r6 = r20
            r5 = r18
            r2 = r20
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r10 = r1
            r1 = r2
            r6 = r5
            int r0 = r0 + 1
            r1 = r10
            goto L19
        L32:
            r6 = r18
            r10 = r1
            r1 = r20
            if (r4 == 0) goto L3c
            r6.setBuilderToMessage(r1, r4)
        L3c:
            r1 = r10
            goto L740
        L3f:
            r6 = r18
            r10 = r1
            r1 = r20
            boolean r3 = r10.hasExtensions     // Catch: java.lang.Throwable -> Lcc
            if (r3 != 0) goto L4c
            r7 = r19
            r3 = 0
            goto L55
        L4c:
            com.google.protobuf.MessageLite r3 = r10.defaultInstance     // Catch: java.lang.Throwable -> Lcc
            r7 = r19
            java.lang.Object r2 = r7.findExtensionByNumber(r4, r3, r2)     // Catch: java.lang.Throwable -> Lcc
            r3 = r2
        L55:
            if (r3 == 0) goto L81
            if (r0 != 0) goto L5d
            com.google.protobuf.FieldSet r0 = r19.getMutableExtensions(r20)     // Catch: java.lang.Throwable -> L65
        L5d:
            r2 = r5
            r5 = r0
            r0 = r7
            r7 = r6
            r6 = r2
            r2 = r21
            goto L6b
        L65:
            r0 = move-exception
            r2 = r1
            r12 = r6
            r1 = r10
            goto L74a
        L6b:
            java.lang.Object r3 = r0.parseExtension(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L78
            r6 = r4
            r0 = r5
            r5 = r7
            r4 = r2
            r2 = r1
            r5 = r3
            r4 = r6
            r1 = r10
            goto L6
        L78:
            r0 = move-exception
            r2 = r1
            r11 = r6
            r5 = r7
        L7c:
            r12 = r5
            r1 = r10
        L7e:
            r5 = r11
            goto L74a
        L81:
            r2 = r1
            r11 = r5
            r5 = r6
            r6 = r4
            r4 = r21
            boolean r1 = r5.shouldDiscardUnknownFields(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L9a
            boolean r1 = r4.skipField()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto La8
        L93:
            r4 = r6
            r1 = r10
            r5 = r11
            goto L6
        L98:
            r0 = move-exception
            goto L7c
        L9a:
            if (r11 != 0) goto La1
            java.lang.Object r1 = r5.getBuilderFromMessage(r2)     // Catch: java.lang.Throwable -> L98
            r11 = r1
        La1:
            boolean r1 = r5.mergeOneFieldFrom(r11, r4, r9)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto La8
            goto L93
        La8:
            int r0 = r10.checkInitializedCount
            r4 = r11
        Lab:
            int r1 = r10.repeatedFieldOffsetStart
            if (r0 >= r1) goto Lbe
            int[] r1 = r10.intArray
            r3 = r1[r0]
            r6 = r20
            r1 = r10
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r7 = r2
            int r0 = r0 + 1
            goto Lab
        Lbe:
            r7 = r2
            r1 = r10
            if (r4 == 0) goto L740
            r5.setBuilderToMessage(r7, r4)
            goto L740
        Lc7:
            r0 = move-exception
            r7 = r2
            r1 = r10
            r12 = r5
            goto L7e
        Lcc:
            r0 = move-exception
            r7 = r1
            r11 = r5
            r5 = r6
            r1 = r10
        Ld1:
            r12 = r5
        Ld2:
            r2 = r7
            goto L7e
        Ld4:
            r7 = r20
            r6 = r4
            r11 = r5
            r5 = r18
            r4 = r21
            int r10 = r1.typeAndOffsetAt(r3)     // Catch: java.lang.Throwable -> Lef
            int r12 = type(r10)     // Catch: java.lang.Throwable -> Lef com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf1
            switch(r12) {
                case 0: goto L6de;
                case 1: goto L6cb;
                case 2: goto L6b8;
                case 3: goto L6a5;
                case 4: goto L692;
                case 5: goto L67f;
                case 6: goto L66c;
                case 7: goto L659;
                case 8: goto L64e;
                case 9: goto L63a;
                case 10: goto L627;
                case 11: goto L614;
                case 12: goto L5ed;
                case 13: goto L5da;
                case 14: goto L5c7;
                case 15: goto L5b4;
                case 16: goto L5a1;
                case 17: goto L58d;
                case 18: goto L57b;
                case 19: goto L569;
                case 20: goto L557;
                case 21: goto L545;
                case 22: goto L533;
                case 23: goto L521;
                case 24: goto L50f;
                case 25: goto L4fd;
                case 26: goto L4f5;
                case 27: goto L4dc;
                case 28: goto L4ca;
                case 29: goto L4ae;
                case 30: goto L473;
                case 31: goto L460;
                case 32: goto L44d;
                case 33: goto L43a;
                case 34: goto L427;
                case 35: goto L414;
                case 36: goto L401;
                case 37: goto L3ef;
                case 38: goto L3dd;
                case 39: goto L3cb;
                case 40: goto L3b9;
                case 41: goto L3a7;
                case 42: goto L395;
                case 43: goto L376;
                case 44: goto L33b;
                case 45: goto L328;
                case 46: goto L315;
                case 47: goto L302;
                case 48: goto L2e5;
                case 49: goto L2b7;
                case 50: goto L296;
                case 51: goto L281;
                case 52: goto L26c;
                case 53: goto L257;
                case 54: goto L242;
                case 55: goto L22d;
                case 56: goto L218;
                case 57: goto L203;
                case 58: goto L1ee;
                case 59: goto L1e5;
                case 60: goto L1d2;
                case 61: goto L1c1;
                case 62: goto L1ac;
                case 63: goto L183;
                case 64: goto L16f;
                case 65: goto L15b;
                case 66: goto L147;
                case 67: goto L133;
                case 68: goto L11f;
                default: goto Le7;
            }     // Catch: java.lang.Throwable -> Lef com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf1
        Le7:
            if (r11 != 0) goto Lf6
            java.lang.Object r2 = r5.getBuilderFromMessage(r7)     // Catch: java.lang.Throwable -> Lef com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf1
            r11 = r2
            goto Lf6
        Lef:
            r0 = move-exception
            goto Ld1
        Lf1:
            r12 = r5
        Lf2:
            r2 = r7
        Lf3:
            r5 = r11
            goto L6f1
        Lf6:
            boolean r2 = r5.mergeOneFieldFrom(r11, r4, r9)     // Catch: java.lang.Throwable -> Lef com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf1
            if (r2 != 0) goto L11a
            int r0 = r1.checkInitializedCount
            r4 = r11
        Lff:
            int r2 = r1.repeatedFieldOffsetStart
            if (r0 >= r2) goto L112
            int[] r2 = r1.intArray
            r3 = r2[r0]
            r6 = r20
            r2 = r7
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r12 = r5
            int r0 = r0 + 1
            goto Lff
        L112:
            r12 = r5
            if (r4 == 0) goto L740
            r12.setBuilderToMessage(r7, r4)
            goto L740
        L11a:
            r12 = r5
        L11b:
            r2 = r7
        L11c:
            r5 = r11
            goto L741
        L11f:
            r12 = r5
            java.lang.Object r5 = r1.mutableOneofMessageFieldForMerge(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.MessageLite r5 = (com.google.protobuf.MessageLite) r5     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.Schema r10 = r1.getMessageFieldSchema(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r4.mergeGroupField(r5, r10, r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.storeOneofMessageField(r7, r2, r3, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L131:
            r0 = move-exception
            goto Ld2
        L133:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.readSInt64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L147:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.readSInt32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L15b:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.readSFixed64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L16f:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.readSFixed32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L183:
            r12 = r5
            int r5 = r4.readEnum()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.Internal$EnumVerifier r13 = r1.getEnumFieldVerifier(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            if (r13 == 0) goto L19c
            boolean r13 = r13.isInRange(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            if (r13 == 0) goto L195
            goto L19c
        L195:
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.storeUnknownEnum(r7, r2, r5, r11, r12)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r2 = r7
            goto L741
        L19c:
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1ac:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.readUInt32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1c1:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.ByteString r5 = r4.readBytes()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1d2:
            r12 = r5
            java.lang.Object r5 = r1.mutableOneofMessageFieldForMerge(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.MessageLite r5 = (com.google.protobuf.MessageLite) r5     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.Schema r10 = r1.getMessageFieldSchema(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r4.mergeMessageField(r5, r10, r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.storeOneofMessageField(r7, r2, r3, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1e5:
            r12 = r5
            r1.readString(r7, r10, r4)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1ee:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            boolean r5 = r4.readBool()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L203:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.readFixed32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L218:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.readFixed64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L22d:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.readInt32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L242:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.readUInt64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L257:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.readInt64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L26c:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            float r5 = r4.readFloat()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L281:
            r12 = r5
            long r13 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            double r15 = r4.readDouble()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            java.lang.Double r5 = java.lang.Double.valueOf(r15)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            com.google.protobuf.UnsafeUtil.putObject(r7, r13, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            r1.setOneofPresent(r7, r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L296:
            r12 = r5
            java.lang.Object r4 = r1.getMapFieldDefaultEntry(r3)     // Catch: java.lang.Throwable -> L2aa com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2af
            r5 = r6
            r2 = r7
            r6 = r21
            r1.mergeMap(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2aa com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2af
            r2 = r20
            r4 = r21
            r6 = r22
            goto L11c
        L2aa:
            r0 = move-exception
            r2 = r20
            goto L7e
        L2af:
            r2 = r20
            r4 = r21
            r6 = r22
            goto Lf3
        L2b7:
            r12 = r5
            long r4 = offset(r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2af java.lang.Throwable -> L2df
            com.google.protobuf.Schema r6 = r1.getMessageFieldSchema(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2af java.lang.Throwable -> L2df
            r2 = r20
            r7 = r22
            r3 = r4
            r5 = r21
            r1.readGroupList(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d4 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2da
            r7 = r1
            r1 = r2
            r13 = r5
        L2cd:
            r6 = r22
            r2 = r1
        L2d0:
            r1 = r7
            r4 = r13
            goto L11c
        L2d4:
            r0 = move-exception
            r7 = r1
            r1 = r2
        L2d7:
            r1 = r7
            goto L7e
        L2da:
            r6 = r22
            r4 = r5
            goto Lf3
        L2df:
            r0 = move-exception
            r7 = r1
            r1 = r20
        L2e3:
            r2 = r1
            goto L2d7
        L2e5:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.protobuf.ListFieldSchema r2 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            java.util.List r2 = r2.mutableListAt(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            r13.readSInt64List(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            goto L2cd
        L2f8:
            r0 = move-exception
            goto L2e3
        L2fa:
            r6 = r22
            r2 = r1
        L2fd:
            r1 = r7
            r5 = r11
        L2ff:
            r4 = r13
            goto L6f1
        L302:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.protobuf.ListFieldSchema r2 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            java.util.List r2 = r2.mutableListAt(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            r13.readSInt32List(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            goto L2cd
        L315:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.protobuf.ListFieldSchema r2 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            java.util.List r2 = r2.mutableListAt(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            r13.readSFixed64List(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            goto L2cd
        L328:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.protobuf.ListFieldSchema r2 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            java.util.List r2 = r2.mutableListAt(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            r13.readSFixed32List(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2fa
            goto L2cd
        L33b:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.protobuf.ListFieldSchema r4 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L370 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L374
            long r5 = offset(r10)     // Catch: java.lang.Throwable -> L370 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L374
            java.util.List r4 = r4.mutableListAt(r1, r5)     // Catch: java.lang.Throwable -> L370 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L374
            r13.readEnumList(r4)     // Catch: java.lang.Throwable -> L370 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L374
            r5 = r4
            com.google.protobuf.Internal$EnumVerifier r4 = r7.getEnumFieldVerifier(r3)     // Catch: java.lang.Throwable -> L370 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L374
            r3 = r5
            r5 = r11
            r6 = r12
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L362 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L369
            r2 = r1
            r12 = r18
        L35c:
            r6 = r22
            r1 = r7
            r4 = r13
            goto L741
        L362:
            r0 = move-exception
            r2 = r1
        L364:
            r12 = r18
        L366:
            r1 = r7
            goto L74a
        L369:
            r12 = r18
        L36b:
            r6 = r22
            r2 = r1
        L36e:
            r1 = r7
            goto L2ff
        L370:
            r0 = move-exception
            r2 = r1
            r5 = r11
            goto L364
        L374:
            r5 = r11
            goto L369
        L376:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readUInt32List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
        L387:
            r12 = r18
            r6 = r22
            r11 = r5
            goto L2d0
        L38e:
            r0 = move-exception
            goto L364
        L390:
            r12 = r18
        L392:
            r6 = r22
            goto L36e
        L395:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readBoolList(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L3a7:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readFixed32List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L3b9:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readFixed64List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L3cb:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readInt32List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L3dd:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readUInt64List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L3ef:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readInt64List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L401:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readFloatList(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L414:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readDoubleList(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L427:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readSInt64List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L43a:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readSInt32List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L44d:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readSFixed64List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L460:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            r13.readSFixed32List(r1)     // Catch: java.lang.Throwable -> L38e com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L390
            goto L387
        L473:
            r5 = r7
            r7 = r1
            r1 = r2
            r2 = r5
            r13 = r4
            r5 = r11
            com.google.protobuf.ListFieldSchema r4 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L4a3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4a9
            long r10 = offset(r10)     // Catch: java.lang.Throwable -> L4a3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4a9
            java.util.List r4 = r4.mutableListAt(r2, r10)     // Catch: java.lang.Throwable -> L4a3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4a9
            r13.readEnumList(r4)     // Catch: java.lang.Throwable -> L4a3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4a9
            r6 = r4
            com.google.protobuf.Internal$EnumVerifier r4 = r7.getEnumFieldVerifier(r3)     // Catch: java.lang.Throwable -> L4a3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4a9
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r6
            r6 = r18
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L499 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L49f
            r2 = r1
            r12 = r6
            goto L35c
        L499:
            r0 = move-exception
            r2 = r1
            r11 = r5
            r12 = r6
            goto L366
        L49f:
            r11 = r5
            r12 = r6
            goto L36b
        L4a3:
            r0 = move-exception
            r12 = r18
            r11 = r5
            goto L366
        L4a9:
            r12 = r18
            r11 = r5
            goto L392
        L4ae:
            r13 = r4
            r12 = r5
            r2 = r7
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
            r13.readUInt32List(r1)     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
        L4bf:
            r6 = r22
            goto L2d0
        L4c3:
            r0 = move-exception
            goto L2d7
        L4c6:
            r6 = r22
            goto L2fd
        L4ca:
            r13 = r4
            r12 = r5
            r2 = r7
            r7 = r1
            com.google.protobuf.ListFieldSchema r1 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
            long r3 = offset(r10)     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
            java.util.List r1 = r1.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
            r13.readBytesList(r1)     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c6
            goto L4bf
        L4dc:
            r13 = r4
            r12 = r5
            r2 = r7
            r7 = r1
            com.google.protobuf.Schema r5 = r7.getMessageFieldSchema(r3)     // Catch: java.lang.Throwable -> L4c3 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4ef
            r6 = r22
            r3 = r10
            r1.readMessageList(r2, r3, r4, r5, r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L4ec:
            r0 = move-exception
            goto L7e
        L4ef:
            r6 = r22
            r1 = r7
            r4 = r13
            goto Lf3
        L4f5:
            r12 = r5
            r2 = r7
            r5 = r10
            r1.readStringList(r2, r5, r4)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L4fd:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readBoolList(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L50f:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readFixed32List(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L521:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readFixed64List(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L533:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readInt32List(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L545:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readUInt64List(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L557:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readInt64List(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L569:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readFloatList(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L57b:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.protobuf.ListFieldSchema r3 = r1.listFieldSchema     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mutableListAt(r2, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.readDoubleList(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L58d:
            r12 = r5
            r2 = r7
            java.lang.Object r5 = r1.mutableMessageFieldForMerge(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.MessageLite r5 = (com.google.protobuf.MessageLite) r5     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.Schema r7 = r1.getMessageFieldSchema(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.mergeGroupField(r5, r7, r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.storeMessageField(r2, r3, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5a1:
            r12 = r5
            r2 = r7
            r5 = r10
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r8 = r4.readSInt64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putLong(r2, r13, r8)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5b4:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.readSInt32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putInt(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5c7:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.readSFixed64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putLong(r2, r8, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5da:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.readSFixed32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putInt(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5ed:
            r8 = r2
            r12 = r5
            r2 = r7
            r5 = r10
            int r9 = r4.readEnum()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.Internal$EnumVerifier r13 = r1.getEnumFieldVerifier(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            if (r13 == 0) goto L608
            boolean r13 = r13.isInRange(r9)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            if (r13 == 0) goto L602
            goto L608
        L602:
            java.lang.Object r5 = com.google.protobuf.SchemaUtil.storeUnknownEnum(r2, r8, r9, r11, r12)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L741
        L608:
            long r13 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putInt(r2, r13, r9)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L614:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.readUInt32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putInt(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L627:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.ByteString r5 = r4.readBytes()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putObject(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L63a:
            r12 = r5
            r2 = r7
            java.lang.Object r5 = r1.mutableMessageFieldForMerge(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.MessageLite r5 = (com.google.protobuf.MessageLite) r5     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.Schema r8 = r1.getMessageFieldSchema(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r4.mergeMessageField(r5, r8, r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.storeMessageField(r2, r3, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L64e:
            r12 = r5
            r2 = r7
            r5 = r10
            r1.readString(r2, r5, r4)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L659:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            boolean r5 = r4.readBool()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putBoolean(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L66c:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.readFixed32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putInt(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L67f:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.readFixed64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putLong(r2, r8, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L692:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.readInt32()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putInt(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6a5:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.readUInt64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putLong(r2, r8, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6b8:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.readInt64()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putLong(r2, r8, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6cb:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            float r5 = r4.readFloat()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putFloat(r2, r8, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6de:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = offset(r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            double r13 = r4.readDouble()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            com.google.protobuf.UnsafeUtil.putDouble(r2, r8, r13)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            r1.setFieldPresent(r2, r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6f1:
            boolean r3 = r12.shouldDiscardUnknownFields(r4)     // Catch: java.lang.Throwable -> L718
            if (r3 == 0) goto L71a
            boolean r3 = r4.skipField()     // Catch: java.lang.Throwable -> L718
            if (r3 != 0) goto L741
            int r0 = r1.checkInitializedCount
            r4 = r5
        L700:
            int r3 = r1.repeatedFieldOffsetStart
            if (r0 >= r3) goto L712
            int[] r3 = r1.intArray
            r3 = r3[r0]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L700
        L712:
            if (r4 == 0) goto L740
        L714:
            r12.setBuilderToMessage(r2, r4)
            goto L740
        L718:
            r0 = move-exception
            goto L74a
        L71a:
            if (r5 != 0) goto L721
            java.lang.Object r3 = r12.getBuilderFromMessage(r2)     // Catch: java.lang.Throwable -> L718
            r5 = r3
        L721:
            r7 = 0
            boolean r3 = r12.mergeOneFieldFrom(r5, r4, r7)     // Catch: java.lang.Throwable -> L718
            if (r3 != 0) goto L741
            int r0 = r1.checkInitializedCount
            r4 = r5
        L72b:
            int r3 = r1.repeatedFieldOffsetStart
            if (r0 >= r3) goto L73d
            int[] r3 = r1.intArray
            r3 = r3[r0]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L72b
        L73d:
            if (r4 == 0) goto L740
            goto L714
        L740:
            return
        L741:
            r4 = r6
            goto L6
        L744:
            r0 = move-exception
            r12 = r18
            r2 = r20
            r11 = r5
        L74a:
            int r3 = r1.checkInitializedCount
            r7 = r3
            r4 = r5
        L74e:
            int r3 = r1.repeatedFieldOffsetStart
            if (r7 >= r3) goto L762
            int[] r3 = r1.intArray
            r3 = r3[r7]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            r1 = r17
            goto L74e
        L762:
            r5 = r12
            if (r4 == 0) goto L768
            r5.setBuilderToMessage(r2, r4)
        L768:
            throw r0
    }

    private final <K, V> void mergeMap(java.lang.Object r5, int r6, java.lang.Object r7, com.google.protobuf.ExtensionRegistryLite r8, com.google.protobuf.Reader r9) throws java.io.IOException {
            r4 = this;
            int r6 = r4.typeAndOffsetAt(r6)
            long r0 = offset(r6)
            java.lang.Object r6 = com.google.protobuf.UnsafeUtil.getObject(r5, r0)
            if (r6 != 0) goto L18
            com.google.protobuf.MapFieldSchema r6 = r4.mapFieldSchema
            java.lang.Object r6 = r6.newMapField(r7)
            com.google.protobuf.UnsafeUtil.putObject(r5, r0, r6)
            goto L2f
        L18:
            com.google.protobuf.MapFieldSchema r2 = r4.mapFieldSchema
            boolean r2 = r2.isImmutable(r6)
            if (r2 == 0) goto L2f
            com.google.protobuf.MapFieldSchema r2 = r4.mapFieldSchema
            java.lang.Object r2 = r2.newMapField(r7)
            com.google.protobuf.MapFieldSchema r3 = r4.mapFieldSchema
            r3.mergeFrom(r2, r6)
            com.google.protobuf.UnsafeUtil.putObject(r5, r0, r2)
            r6 = r2
        L2f:
            com.google.protobuf.MapFieldSchema r5 = r4.mapFieldSchema
            java.util.Map r5 = r5.forMutableMapData(r6)
            com.google.protobuf.MapFieldSchema r6 = r4.mapFieldSchema
            com.google.protobuf.MapEntryLite$Metadata r6 = r6.forMapMetadata(r7)
            r9.readMap(r5, r6, r8)
            return
    }

    private void mergeMessage(T r6, T r7, int r8) {
            r5 = this;
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.typeAndOffsetAt(r8)
            long r0 = offset(r0)
            sun.misc.Unsafe r2 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r2.getObject(r7, r0)
            if (r3 == 0) goto L52
            com.google.protobuf.Schema r7 = r5.getMessageFieldSchema(r8)
            boolean r4 = r5.isFieldPresent(r6, r8)
            if (r4 != 0) goto L39
            boolean r4 = isMutable(r3)
            if (r4 != 0) goto L2b
            r2.putObject(r6, r0, r3)
            goto L35
        L2b:
            java.lang.Object r4 = r7.newInstance()
            r7.mergeFrom(r4, r3)
            r2.putObject(r6, r0, r4)
        L35:
            r5.setFieldPresent(r6, r8)
            return
        L39:
            java.lang.Object r8 = r2.getObject(r6, r0)
            boolean r4 = isMutable(r8)
            if (r4 != 0) goto L4e
            java.lang.Object r4 = r7.newInstance()
            r7.mergeFrom(r4, r8)
            r2.putObject(r6, r0, r4)
            r8 = r4
        L4e:
            r7.mergeFrom(r8, r3)
            return
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Source subfield "
            r0.append(r1)
            int r8 = r5.numberAt(r8)
            r0.append(r8)
            java.lang.String r8 = " is present but null: "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    private void mergeOneofMessage(T r7, T r8, int r9) {
            r6 = this;
            int r0 = r6.numberAt(r9)
            boolean r1 = r6.isOneofPresent(r8, r0, r9)
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = r6.typeAndOffsetAt(r9)
            long r1 = offset(r1)
            sun.misc.Unsafe r3 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r4 = r3.getObject(r8, r1)
            if (r4 == 0) goto L56
            com.google.protobuf.Schema r8 = r6.getMessageFieldSchema(r9)
            boolean r5 = r6.isOneofPresent(r7, r0, r9)
            if (r5 != 0) goto L3d
            boolean r5 = isMutable(r4)
            if (r5 != 0) goto L2f
            r3.putObject(r7, r1, r4)
            goto L39
        L2f:
            java.lang.Object r5 = r8.newInstance()
            r8.mergeFrom(r5, r4)
            r3.putObject(r7, r1, r5)
        L39:
            r6.setOneofPresent(r7, r0, r9)
            return
        L3d:
            java.lang.Object r9 = r3.getObject(r7, r1)
            boolean r0 = isMutable(r9)
            if (r0 != 0) goto L52
            java.lang.Object r0 = r8.newInstance()
            r8.mergeFrom(r0, r9)
            r3.putObject(r7, r1, r0)
            r9 = r0
        L52:
            r8.mergeFrom(r9, r4)
            return
        L56:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Source subfield "
            r0.append(r1)
            int r9 = r6.numberAt(r9)
            r0.append(r9)
            java.lang.String r9 = " is present but null: "
            r0.append(r9)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    private void mergeSingleField(T r6, T r7, int r8) {
            r5 = this;
            int r0 = r5.typeAndOffsetAt(r8)
            long r1 = offset(r0)
            int r3 = r5.numberAt(r8)
            int r0 = type(r0)
            switch(r0) {
                case 0: goto L152;
                case 1: goto L141;
                case 2: goto L130;
                case 3: goto L11f;
                case 4: goto L10e;
                case 5: goto Lfd;
                case 6: goto Lec;
                case 7: goto Ldb;
                case 8: goto Lca;
                case 9: goto Lc6;
                case 10: goto Lb5;
                case 11: goto La4;
                case 12: goto L93;
                case 13: goto L82;
                case 14: goto L71;
                case 15: goto L60;
                case 16: goto L4f;
                case 17: goto L4b;
                case 18: goto L45;
                case 19: goto L45;
                case 20: goto L45;
                case 21: goto L45;
                case 22: goto L45;
                case 23: goto L45;
                case 24: goto L45;
                case 25: goto L45;
                case 26: goto L45;
                case 27: goto L45;
                case 28: goto L45;
                case 29: goto L45;
                case 30: goto L45;
                case 31: goto L45;
                case 32: goto L45;
                case 33: goto L45;
                case 34: goto L45;
                case 35: goto L45;
                case 36: goto L45;
                case 37: goto L45;
                case 38: goto L45;
                case 39: goto L45;
                case 40: goto L45;
                case 41: goto L45;
                case 42: goto L45;
                case 43: goto L45;
                case 44: goto L45;
                case 45: goto L45;
                case 46: goto L45;
                case 47: goto L45;
                case 48: goto L45;
                case 49: goto L45;
                case 50: goto L3f;
                case 51: goto L2e;
                case 52: goto L2e;
                case 53: goto L2e;
                case 54: goto L2e;
                case 55: goto L2e;
                case 56: goto L2e;
                case 57: goto L2e;
                case 58: goto L2e;
                case 59: goto L2e;
                case 60: goto L2a;
                case 61: goto L19;
                case 62: goto L19;
                case 63: goto L19;
                case 64: goto L19;
                case 65: goto L19;
                case 66: goto L19;
                case 67: goto L19;
                case 68: goto L15;
                default: goto L13;
            }
        L13:
            goto L162
        L15:
            r5.mergeOneofMessage(r6, r7, r8)
            return
        L19:
            boolean r0 = r5.isOneofPresent(r7, r3, r8)
            if (r0 == 0) goto L162
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setOneofPresent(r6, r3, r8)
            return
        L2a:
            r5.mergeOneofMessage(r6, r7, r8)
            return
        L2e:
            boolean r0 = r5.isOneofPresent(r7, r3, r8)
            if (r0 == 0) goto L162
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setOneofPresent(r6, r3, r8)
            return
        L3f:
            com.google.protobuf.MapFieldSchema r8 = r5.mapFieldSchema
            com.google.protobuf.SchemaUtil.mergeMap(r8, r6, r7, r1)
            return
        L45:
            com.google.protobuf.ListFieldSchema r8 = r5.listFieldSchema
            r8.mergeListsAt(r6, r7, r1)
            return
        L4b:
            r5.mergeMessage(r6, r7, r8)
            return
        L4f:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            return
        L60:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        L71:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            return
        L82:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        L93:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        La4:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        Lb5:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        Lc6:
            r5.mergeMessage(r6, r7, r8)
            return
        Lca:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            java.lang.Object r7 = com.google.protobuf.UnsafeUtil.getObject(r7, r1)
            com.google.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        Ldb:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            boolean r7 = com.google.protobuf.UnsafeUtil.getBoolean(r7, r1)
            com.google.protobuf.UnsafeUtil.putBoolean(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        Lec:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        Lfd:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            return
        L10e:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            int r7 = com.google.protobuf.UnsafeUtil.getInt(r7, r1)
            com.google.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        L11f:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            return
        L130:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r7, r1)
            com.google.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            return
        L141:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            float r7 = com.google.protobuf.UnsafeUtil.getFloat(r7, r1)
            com.google.protobuf.UnsafeUtil.putFloat(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            return
        L152:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L162
            double r3 = com.google.protobuf.UnsafeUtil.getDouble(r7, r1)
            com.google.protobuf.UnsafeUtil.putDouble(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
        L162:
            return
    }

    private java.lang.Object mutableMessageFieldForMerge(T r4, int r5) {
            r3 = this;
            com.google.protobuf.Schema r0 = r3.getMessageFieldSchema(r5)
            int r1 = r3.typeAndOffsetAt(r5)
            long r1 = offset(r1)
            boolean r5 = r3.isFieldPresent(r4, r5)
            if (r5 != 0) goto L17
            java.lang.Object r4 = r0.newInstance()
            return r4
        L17:
            sun.misc.Unsafe r5 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = isMutable(r4)
            if (r5 == 0) goto L24
            return r4
        L24:
            java.lang.Object r5 = r0.newInstance()
            if (r4 == 0) goto L2d
            r0.mergeFrom(r5, r4)
        L2d:
            return r5
    }

    private java.lang.Object mutableOneofMessageFieldForMerge(T r4, int r5, int r6) {
            r3 = this;
            com.google.protobuf.Schema r0 = r3.getMessageFieldSchema(r6)
            boolean r5 = r3.isOneofPresent(r4, r5, r6)
            if (r5 != 0) goto Lf
            java.lang.Object r4 = r0.newInstance()
            return r4
        Lf:
            sun.misc.Unsafe r5 = com.google.protobuf.MessageSchema.UNSAFE
            int r6 = r3.typeAndOffsetAt(r6)
            long r1 = offset(r6)
            java.lang.Object r4 = r5.getObject(r4, r1)
            boolean r5 = isMutable(r4)
            if (r5 == 0) goto L24
            return r4
        L24:
            java.lang.Object r5 = r0.newInstance()
            if (r4 == 0) goto L2d
            r0.mergeFrom(r5, r4)
        L2d:
            return r5
    }

    public static <T> com.google.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> r0, com.google.protobuf.MessageInfo r1, com.google.protobuf.NewInstanceSchema r2, com.google.protobuf.ListFieldSchema r3, com.google.protobuf.UnknownFieldSchema<?, ?> r4, com.google.protobuf.ExtensionSchema<?> r5, com.google.protobuf.MapFieldSchema r6) {
            boolean r0 = r1 instanceof com.google.protobuf.RawMessageInfo
            if (r0 == 0) goto Lb
            com.google.protobuf.RawMessageInfo r1 = (com.google.protobuf.RawMessageInfo) r1
            com.google.protobuf.MessageSchema r0 = newSchemaForRawMessageInfo(r1, r2, r3, r4, r5, r6)
            return r0
        Lb:
            com.google.protobuf.StructuralMessageInfo r1 = (com.google.protobuf.StructuralMessageInfo) r1
            com.google.protobuf.MessageSchema r0 = newSchemaForMessageInfo(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static <T> com.google.protobuf.MessageSchema<T> newSchemaForMessageInfo(com.google.protobuf.StructuralMessageInfo r20, com.google.protobuf.NewInstanceSchema r21, com.google.protobuf.ListFieldSchema r22, com.google.protobuf.UnknownFieldSchema<?, ?> r23, com.google.protobuf.ExtensionSchema<?> r24, com.google.protobuf.MapFieldSchema r25) {
            com.google.protobuf.FieldInfo[] r0 = r20.getFields()
            int r1 = r0.length
            r2 = 0
            if (r1 != 0) goto Lb
            r7 = r2
            r8 = r7
            goto L1c
        Lb:
            r1 = r0[r2]
            int r1 = r1.getFieldNumber()
            int r3 = r0.length
            int r3 = r3 + (-1)
            r3 = r0[r3]
            int r3 = r3.getFieldNumber()
            r7 = r1
            r8 = r3
        L1c:
            int r1 = r0.length
            int r3 = r1 * 3
            int[] r5 = new int[r3]
            int r1 = r1 * 2
            java.lang.Object[] r6 = new java.lang.Object[r1]
            int r1 = r0.length
            r3 = r2
            r4 = r3
            r9 = r4
        L29:
            r10 = 49
            r11 = 18
            if (r3 >= r1) goto L55
            r12 = r0[r3]
            com.google.protobuf.FieldType r13 = r12.getType()
            com.google.protobuf.FieldType r14 = com.google.protobuf.FieldType.MAP
            if (r13 != r14) goto L3c
            int r4 = r4 + 1
            goto L52
        L3c:
            com.google.protobuf.FieldType r13 = r12.getType()
            int r13 = r13.m13892id()
            if (r13 < r11) goto L52
            com.google.protobuf.FieldType r11 = r12.getType()
            int r11 = r11.m13892id()
            if (r11 > r10) goto L52
            int r9 = r9 + 1
        L52:
            int r3 = r3 + 1
            goto L29
        L55:
            r1 = 0
            if (r4 <= 0) goto L5b
            int[] r3 = new int[r4]
            goto L5c
        L5b:
            r3 = r1
        L5c:
            if (r9 <= 0) goto L60
            int[] r1 = new int[r9]
        L60:
            int[] r4 = r20.getCheckInitialized()
            if (r4 != 0) goto L68
            int[] r4 = com.google.protobuf.MessageSchema.EMPTY_INT_ARRAY
        L68:
            r9 = r2
            r12 = r9
            r13 = r12
            r14 = r13
            r15 = r14
        L6d:
            int r2 = r0.length
            if (r9 >= r2) goto Lc6
            r2 = r0[r9]
            int r10 = r2.getFieldNumber()
            storeFieldData(r2, r5, r12, r6)
            int r11 = r4.length
            if (r13 >= r11) goto L85
            r11 = r4[r13]
            if (r11 != r10) goto L85
            int r10 = r13 + 1
            r4[r13] = r12
            r13 = r10
        L85:
            com.google.protobuf.FieldType r10 = r2.getType()
            com.google.protobuf.FieldType r11 = com.google.protobuf.FieldType.MAP
            if (r10 != r11) goto L95
            int r2 = r14 + 1
            r3[r14] = r12
            r14 = r2
        L92:
            r17 = r12
            goto Lbd
        L95:
            com.google.protobuf.FieldType r10 = r2.getType()
            int r10 = r10.m13892id()
            r11 = 18
            if (r10 < r11) goto L92
            com.google.protobuf.FieldType r10 = r2.getType()
            int r10 = r10.m13892id()
            r11 = 49
            if (r10 > r11) goto L92
            int r10 = r15 + 1
            java.lang.reflect.Field r2 = r2.getField()
            r17 = r12
            long r11 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r2 = (int) r11
            r1[r15] = r2
            r15 = r10
        Lbd:
            int r9 = r9 + 1
            int r12 = r17 + 3
            r10 = 49
            r11 = 18
            goto L6d
        Lc6:
            if (r3 != 0) goto Lca
            int[] r3 = com.google.protobuf.MessageSchema.EMPTY_INT_ARRAY
        Lca:
            if (r1 != 0) goto Lce
            int[] r1 = com.google.protobuf.MessageSchema.EMPTY_INT_ARRAY
        Lce:
            int r0 = r4.length
            int r2 = r3.length
            int r0 = r0 + r2
            int r2 = r1.length
            int r0 = r0 + r2
            int[] r12 = new int[r0]
            int r0 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r12, r2, r0)
            int r0 = r4.length
            int r9 = r3.length
            java.lang.System.arraycopy(r3, r2, r12, r0, r9)
            int r0 = r4.length
            int r9 = r3.length
            int r0 = r0 + r9
            int r9 = r1.length
            java.lang.System.arraycopy(r1, r2, r12, r0, r9)
            com.google.protobuf.MessageSchema r0 = new com.google.protobuf.MessageSchema
            com.google.protobuf.MessageLite r9 = r20.getDefaultInstance()
            com.google.protobuf.ProtoSyntax r10 = r20.getSyntax()
            int r13 = r4.length
            int r1 = r4.length
            int r2 = r3.length
            int r14 = r1 + r2
            r11 = 1
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r24
            r19 = r25
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r4
    }

    public static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo r33, com.google.protobuf.NewInstanceSchema r34, com.google.protobuf.ListFieldSchema r35, com.google.protobuf.UnknownFieldSchema<?, ?> r36, com.google.protobuf.ExtensionSchema<?> r37, com.google.protobuf.MapFieldSchema r38) {
            java.lang.String r0 = r33.getStringInfo()
            int r1 = r0.length()
            r2 = 0
            char r3 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L1d
            r3 = 1
        L13:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L1e
            r3 = r6
            goto L13
        L1d:
            r6 = 1
        L1e:
            int r3 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L3d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L2a:
            int r9 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L3a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r8
            r6 = r6 | r3
            int r8 = r8 + 13
            r3 = r9
            goto L2a
        L3a:
            int r3 = r3 << r8
            r6 = r6 | r3
            r3 = r9
        L3d:
            if (r6 != 0) goto L4e
            int[] r6 = com.google.protobuf.MessageSchema.EMPTY_INT_ARRAY
            r8 = r2
            r10 = r8
            r11 = r10
            r12 = r11
            r15 = r12
            r17 = r15
            r16 = r6
            r6 = r17
            goto L15a
        L4e:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L6d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L5a:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L6a
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r3 = r3 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L5a
        L6a:
            int r6 = r6 << r8
            r3 = r3 | r6
            r6 = r9
        L6d:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L8c
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L79:
            int r10 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L89
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L79
        L89:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r10
        L8c:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto Lab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L98:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto La8
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L98
        La8:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r11
        Lab:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto Lca
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        Lb7:
            int r12 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto Lc7
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto Lb7
        Lc7:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        Lca:
            int r11 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto Le9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Ld6:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto Le6
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Ld6
        Le6:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        Le9:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L108
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Lf5:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L105
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Lf5
        L105:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L108:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L127
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L114:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L124
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L114
        L124:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L127:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L148
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L133:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L144
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L133
        L144:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L148:
            int r15 = r13 + r11
            int r15 = r15 + r12
            int[] r12 = new int[r15]
            int r15 = r3 * 2
            int r15 = r15 + r6
            r6 = r11
            r11 = r8
            r8 = r6
            r6 = r3
            r16 = r12
            r17 = r13
            r3 = r14
            r12 = r9
        L15a:
            sun.misc.Unsafe r9 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object[] r13 = r33.getObjects()
            com.google.protobuf.MessageLite r14 = r33.getDefaultInstance()
            java.lang.Class r14 = r14.getClass()
            int r2 = r10 * 3
            int[] r2 = new int[r2]
            int r10 = r10 * 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r8 = r17 + r8
            r22 = r8
            r21 = r17
            r19 = 0
            r20 = 0
        L17a:
            if (r3 >= r1) goto L3d0
            int r23 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L1a4
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
            r24 = 1
        L18c:
            int r25 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L19e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r3 = r3 | r4
            int r23 = r23 + 13
            r4 = r25
            goto L18c
        L19e:
            int r4 = r4 << r23
            r3 = r3 | r4
            r4 = r25
            goto L1a8
        L1a4:
            r24 = 1
            r4 = r23
        L1a8:
            int r23 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L1ce
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = r23
            r23 = 13
        L1b6:
            int r26 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L1c8
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r23
            r4 = r4 | r7
            int r23 = r23 + 13
            r7 = r26
            goto L1b6
        L1c8:
            int r7 = r7 << r23
            r4 = r4 | r7
            r7 = r26
            goto L1d0
        L1ce:
            r7 = r23
        L1d0:
            r5 = r4 & 255(0xff, float:3.57E-43)
            r26 = r1
            r1 = r4 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L1de
            int r1 = r19 + 1
            r16[r19] = r20
            r19 = r1
        L1de:
            r1 = 51
            r29 = r2
            if (r5 < r1) goto L287
            int r1 = r7 + 1
            char r7 = r0.charAt(r7)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r2) goto L20d
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L1f3:
            int r32 = r1 + 1
            char r1 = r0.charAt(r1)
            if (r1 < r2) goto L208
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r31
            r7 = r7 | r1
            int r31 = r31 + 13
            r1 = r32
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L1f3
        L208:
            int r1 = r1 << r31
            r7 = r7 | r1
            r1 = r32
        L20d:
            int r2 = r5 + (-51)
            r31 = r1
            r1 = 9
            if (r2 == r1) goto L23c
            r1 = 17
            if (r2 != r1) goto L21a
            goto L23c
        L21a:
            r1 = 12
            if (r2 != r1) goto L249
            com.google.protobuf.ProtoSyntax r1 = r33.getSyntax()
            com.google.protobuf.ProtoSyntax r2 = com.google.protobuf.ProtoSyntax.PROTO2
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L22e
            r1 = r4 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L249
        L22e:
            int r1 = r20 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            int r2 = r15 + 1
            r15 = r13[r15]
            r10[r1] = r15
        L23a:
            r15 = r2
            goto L249
        L23c:
            int r1 = r20 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            int r2 = r15 + 1
            r15 = r13[r15]
            r10[r1] = r15
            goto L23a
        L249:
            int r7 = r7 * 2
            r1 = r13[r7]
            boolean r2 = r1 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L254
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            goto L25c
        L254:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = reflectField(r14, r1)
            r13[r7] = r1
        L25c:
            long r1 = r9.objectFieldOffset(r1)
            int r1 = (int) r1
            int r7 = r7 + 1
            r2 = r13[r7]
            r27 = r1
            boolean r1 = r2 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L26e
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto L276
        L26e:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = reflectField(r14, r2)
            r13[r7] = r2
        L276:
            long r1 = r9.objectFieldOffset(r2)
            int r1 = (int) r1
            r30 = r0
            r0 = r1
            r1 = r27
            r7 = 0
            r27 = r3
            r3 = r31
            goto L392
        L287:
            int r1 = r15 + 1
            r2 = r13[r15]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = reflectField(r14, r2)
            r31 = r1
            r1 = 9
            if (r5 == r1) goto L29b
            r1 = 17
            if (r5 != r1) goto L29f
        L29b:
            r27 = r3
            goto L30f
        L29f:
            r1 = 27
            if (r5 == r1) goto L2a7
            r1 = 49
            if (r5 != r1) goto L2aa
        L2a7:
            r27 = r3
            goto L302
        L2aa:
            r1 = 12
            if (r5 == r1) goto L2e6
            r1 = 30
            if (r5 == r1) goto L2e6
            r1 = 44
            if (r5 != r1) goto L2b7
            goto L2e6
        L2b7:
            r1 = 50
            if (r5 != r1) goto L2e3
            int r1 = r21 + 1
            r16[r21] = r20
            int r21 = r20 / 3
            int r21 = r21 * 2
            int r27 = r15 + 2
            r28 = r13[r31]
            r10[r21] = r28
            r28 = r1
            r1 = r4 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2dc
            int r21 = r21 + 1
            int r1 = r15 + 3
            r15 = r13[r27]
            r10[r21] = r15
            r27 = r3
            r21 = r28
            goto L31d
        L2dc:
            r1 = r27
            r21 = r28
            r27 = r3
            goto L31d
        L2e3:
            r27 = r3
            goto L31b
        L2e6:
            com.google.protobuf.ProtoSyntax r1 = r33.getSyntax()
            r27 = r3
            com.google.protobuf.ProtoSyntax r3 = com.google.protobuf.ProtoSyntax.PROTO2
            if (r1 == r3) goto L2f4
            r1 = r4 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L31b
        L2f4:
            int r1 = r20 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            int r15 = r15 + 2
            r3 = r13[r31]
            r10[r1] = r3
        L300:
            r1 = r15
            goto L31d
        L302:
            int r1 = r20 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            int r15 = r15 + 2
            r3 = r13[r31]
            r10[r1] = r3
            goto L300
        L30f:
            int r1 = r20 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            java.lang.Class r3 = r2.getType()
            r10[r1] = r3
        L31b:
            r1 = r31
        L31d:
            long r2 = r9.objectFieldOffset(r2)
            int r2 = (int) r2
            r3 = r4 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L375
            r3 = 17
            if (r5 > r3) goto L375
            int r3 = r7 + 1
            char r7 = r0.charAt(r7)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r15) goto L34f
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L339:
            int r28 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r15) goto L34b
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r23
            r7 = r7 | r3
            int r23 = r23 + 13
            r3 = r28
            goto L339
        L34b:
            int r3 = r3 << r23
            r7 = r7 | r3
            goto L351
        L34f:
            r28 = r3
        L351:
            int r3 = r6 * 2
            int r23 = r7 / 32
            int r3 = r3 + r23
            r15 = r13[r3]
            r30 = r0
            boolean r0 = r15 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L363
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
        L361:
            r3 = r1
            goto L36c
        L363:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = reflectField(r14, r15)
            r13[r3] = r15
            goto L361
        L36c:
            long r0 = r9.objectFieldOffset(r15)
            int r0 = (int) r0
            int r7 = r7 % 32
        L373:
            r1 = r0
            goto L37f
        L375:
            r30 = r0
            r3 = r1
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r7
            r7 = 0
            goto L373
        L37f:
            r0 = 18
            if (r5 < r0) goto L38d
            r0 = 49
            if (r5 > r0) goto L38d
            int r0 = r22 + 1
            r16[r22] = r2
            r22 = r0
        L38d:
            r0 = r1
            r1 = r2
            r15 = r3
            r3 = r28
        L392:
            int r2 = r20 + 1
            r29[r20] = r27
            int r27 = r20 + 2
            r28 = r0
            r0 = r4 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3a1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L3a2
        L3a1:
            r0 = 0
        L3a2:
            r31 = r0
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3ab
            r0 = 268435456(0x10000000, float:2.524355E-29)
            goto L3ac
        L3ab:
            r0 = 0
        L3ac:
            r0 = r31 | r0
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L3b5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3b6
        L3b5:
            r4 = 0
        L3b6:
            r0 = r0 | r4
            int r4 = r5 << 20
            r0 = r0 | r4
            r0 = r0 | r1
            r29[r2] = r0
            int r20 = r20 + 3
            int r0 = r7 << 20
            r0 = r0 | r28
            r29[r27] = r0
            r1 = r26
            r2 = r29
            r0 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L17a
        L3d0:
            r29 = r2
            com.google.protobuf.MessageSchema r0 = new com.google.protobuf.MessageSchema
            com.google.protobuf.MessageLite r13 = r33.getDefaultInstance()
            com.google.protobuf.ProtoSyntax r14 = r33.getSyntax()
            r15 = 0
            r19 = r34
            r20 = r35
            r21 = r36
            r22 = r37
            r23 = r38
            r18 = r8
            r9 = r29
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r8
    }

    private int numberAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            r2 = r0[r2]
            return r2
    }

    private static long offset(int r2) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r0 = (long) r2
            return r0
    }

    private static <T> boolean oneofBooleanAt(T r0, long r1) {
            java.lang.Object r0 = com.google.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static <T> double oneofDoubleAt(T r0, long r1) {
            java.lang.Object r0 = com.google.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    private static <T> float oneofFloatAt(T r0, long r1) {
            java.lang.Object r0 = com.google.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    private static <T> int oneofIntAt(T r0, long r1) {
            java.lang.Object r0 = com.google.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private static <T> long oneofLongAt(T r0, long r1) {
            java.lang.Object r0 = com.google.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private <K, V> int parseMapField(T r10, byte[] r11, int r12, int r13, int r14, long r15, com.google.protobuf.ArrayDecoders.Registers r17) throws java.io.IOException {
            r9 = this;
            r2 = r15
            sun.misc.Unsafe r4 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r9.getMapFieldDefaultEntry(r14)
            java.lang.Object r6 = r4.getObject(r10, r2)
            com.google.protobuf.MapFieldSchema r7 = r9.mapFieldSchema
            boolean r7 = r7.isImmutable(r6)
            if (r7 == 0) goto L22
            com.google.protobuf.MapFieldSchema r7 = r9.mapFieldSchema
            java.lang.Object r7 = r7.newMapField(r5)
            com.google.protobuf.MapFieldSchema r8 = r9.mapFieldSchema
            r8.mergeFrom(r7, r6)
            r4.putObject(r10, r2, r7)
            r6 = r7
        L22:
            com.google.protobuf.MapFieldSchema r1 = r9.mapFieldSchema
            com.google.protobuf.MapEntryLite$Metadata r4 = r1.forMapMetadata(r5)
            com.google.protobuf.MapFieldSchema r1 = r9.mapFieldSchema
            java.util.Map r5 = r1.forMutableMapData(r6)
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r17
            int r1 = r0.decodeMapEntry(r1, r2, r3, r4, r5, r6)
            return r1
    }

    private int parseOneofField(T r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23, int r25, com.google.protobuf.ArrayDecoders.Registers r26) throws java.io.IOException {
            r13 = this;
            r7 = r19
            r1 = r20
            r2 = r23
            r8 = r25
            sun.misc.Unsafe r4 = com.google.protobuf.MessageSchema.UNSAFE
            int[] r5 = r13.buffer
            int r6 = r8 + 2
            r5 = r5[r6]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r6
            long r5 = (long) r5
            r9 = 5
            r10 = 1
            r11 = 2
            switch(r22) {
                case 51: goto L19a;
                case 52: goto L185;
                case 53: goto L16e;
                case 54: goto L16e;
                case 55: goto L157;
                case 56: goto L142;
                case 57: goto L12d;
                case 58: goto L10e;
                case 59: goto Ld7;
                case 60: goto Lbb;
                case 61: goto La8;
                case 62: goto L157;
                case 63: goto L75;
                case 64: goto L12d;
                case 65: goto L142;
                case 66: goto L5a;
                case 67: goto L3f;
                case 68: goto L1f;
                default: goto L1b;
            }
        L1b:
            r0 = r16
            goto L1ae
        L1f:
            r2 = 3
            if (r1 != r2) goto L1b
            r9 = r18
            java.lang.Object r0 = r13.mutableOneofMessageFieldForMerge(r14, r7, r8)
            r1 = r9 & (-8)
            r5 = r1 | 4
            com.google.protobuf.Schema r1 = r13.getMessageFieldSchema(r8)
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r26
            int r1 = com.google.protobuf.ArrayDecoders.mergeGroupField(r0, r1, r2, r3, r4, r5, r6)
            r13.storeOneofMessageField(r14, r7, r8, r0)
            return r1
        L3f:
            r0 = r16
            r12 = r26
            if (r1 != 0) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint64(r15, r0, r12)
            long r8 = r12.long1
            long r8 = com.google.protobuf.CodedInputStream.decodeZigZag64(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r4.putObject(r14, r2, r1)
            r4.putInt(r14, r5, r7)
            return r0
        L5a:
            r0 = r16
            r12 = r26
            if (r1 != 0) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint32(r15, r0, r12)
            int r1 = r12.int1
            int r1 = com.google.protobuf.CodedInputStream.decodeZigZag32(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.putObject(r14, r2, r1)
            r4.putInt(r14, r5, r7)
            return r0
        L75:
            r0 = r16
            r9 = r18
            r12 = r26
            if (r1 != 0) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint32(r15, r0, r12)
            int r1 = r12.int1
            com.google.protobuf.Internal$EnumVerifier r8 = r13.getEnumFieldVerifier(r8)
            if (r8 == 0) goto L9d
            boolean r8 = r8.isInRange(r1)
            if (r8 == 0) goto L90
            goto L9d
        L90:
            com.google.protobuf.UnknownFieldSetLite r14 = getMutableUnknownFields(r14)
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r14.storeField(r9, r1)
            return r0
        L9d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.putObject(r14, r2, r1)
            r4.putInt(r14, r5, r7)
            return r0
        La8:
            r0 = r16
            r12 = r26
            if (r1 != r11) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeBytes(r15, r0, r12)
            java.lang.Object r1 = r12.object1
            r4.putObject(r14, r2, r1)
            r4.putInt(r14, r5, r7)
            return r0
        Lbb:
            r0 = r16
            r12 = r26
            if (r1 != r11) goto L1ae
            java.lang.Object r0 = r13.mutableOneofMessageFieldForMerge(r14, r7, r8)
            com.google.protobuf.Schema r1 = r13.getMessageFieldSchema(r8)
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r12
            int r1 = com.google.protobuf.ArrayDecoders.mergeMessageField(r0, r1, r2, r3, r4, r5)
            r13.storeOneofMessageField(r14, r7, r8, r0)
            return r1
        Ld7:
            r0 = r16
            r12 = r26
            if (r1 != r11) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint32(r15, r0, r12)
            int r1 = r12.int1
            if (r1 != 0) goto Leb
            java.lang.String r1 = ""
            r4.putObject(r14, r2, r1)
            goto L10a
        Leb:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r9 = r21 & r9
            if (r9 == 0) goto Lff
            int r9 = r0 + r1
            boolean r9 = com.google.protobuf.Utf8.isValidUtf8(r15, r0, r9)
            if (r9 == 0) goto Lfa
            goto Lff
        Lfa:
            com.google.protobuf.InvalidProtocolBufferException r14 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r14
        Lff:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.protobuf.Internal.UTF_8
            r9.<init>(r15, r0, r1, r10)
            r4.putObject(r14, r2, r9)
            int r0 = r0 + r1
        L10a:
            r4.putInt(r14, r5, r7)
            return r0
        L10e:
            r0 = r16
            r12 = r26
            if (r1 != 0) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint64(r15, r0, r12)
            long r8 = r12.long1
            r11 = 0
            int r1 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r1 == 0) goto L121
            goto L122
        L121:
            r10 = 0
        L122:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r4.putObject(r14, r2, r1)
            r4.putInt(r14, r5, r7)
            return r0
        L12d:
            r0 = r16
            if (r1 != r9) goto L1ae
            int r1 = com.google.protobuf.ArrayDecoders.decodeFixed32(r15, r16)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.putObject(r14, r2, r1)
            int r0 = r0 + 4
            r4.putInt(r14, r5, r7)
            return r0
        L142:
            r0 = r16
            if (r1 != r10) goto L1ae
            long r8 = com.google.protobuf.ArrayDecoders.decodeFixed64(r15, r16)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r4.putObject(r14, r2, r1)
            int r0 = r0 + 8
            r4.putInt(r14, r5, r7)
            return r0
        L157:
            r0 = r16
            r12 = r26
            if (r1 != 0) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint32(r15, r0, r12)
            int r1 = r12.int1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.putObject(r14, r2, r1)
            r4.putInt(r14, r5, r7)
            return r0
        L16e:
            r0 = r16
            r12 = r26
            if (r1 != 0) goto L1ae
            int r0 = com.google.protobuf.ArrayDecoders.decodeVarint64(r15, r0, r12)
            long r8 = r12.long1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r4.putObject(r14, r2, r1)
            r4.putInt(r14, r5, r7)
            return r0
        L185:
            r0 = r16
            if (r1 != r9) goto L1ae
            float r1 = com.google.protobuf.ArrayDecoders.decodeFloat(r15, r16)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4.putObject(r14, r2, r1)
            int r0 = r0 + 4
            r4.putInt(r14, r5, r7)
            return r0
        L19a:
            r0 = r16
            if (r1 != r10) goto L1ae
            double r8 = com.google.protobuf.ArrayDecoders.decodeDouble(r15, r16)
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            r4.putObject(r14, r2, r1)
            int r0 = r0 + 8
            r4.putInt(r14, r5, r7)
        L1ae:
            return r0
    }

    private int parseRepeatedField(T r9, byte[] r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17, int r19, long r20, com.google.protobuf.ArrayDecoders.Registers r22) throws java.io.IOException {
            r8 = this;
            r1 = r16
            r2 = r20
            sun.misc.Unsafe r4 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r4.getObject(r9, r2)
            com.google.protobuf.Internal$ProtobufList r5 = (com.google.protobuf.Internal.ProtobufList) r5
            boolean r6 = r5.isModifiable()
            r7 = 2
            if (r6 != 0) goto L24
            int r6 = r5.size()
            if (r6 != 0) goto L1c
            r6 = 10
            goto L1d
        L1c:
            int r6 = r6 * r7
        L1d:
            com.google.protobuf.Internal$ProtobufList r5 = r5.mutableCopyWithCapacity(r6)
            r4.putObject(r9, r2, r5)
        L24:
            r6 = r5
            r2 = 1
            r3 = 5
            switch(r19) {
                case 18: goto L18f;
                case 19: goto L175;
                case 20: goto L15b;
                case 21: goto L15b;
                case 22: goto L141;
                case 23: goto L127;
                case 24: goto L10d;
                case 25: goto Lf3;
                case 26: goto Lc8;
                case 27: goto Lb2;
                case 28: goto La1;
                case 29: goto L141;
                case 30: goto L77;
                case 31: goto L10d;
                case 32: goto L127;
                case 33: goto L5d;
                case 34: goto L43;
                case 35: goto L18f;
                case 36: goto L175;
                case 37: goto L15b;
                case 38: goto L15b;
                case 39: goto L141;
                case 40: goto L127;
                case 41: goto L10d;
                case 42: goto Lf3;
                case 43: goto L141;
                case 44: goto L77;
                case 45: goto L10d;
                case 46: goto L127;
                case 47: goto L5d;
                case 48: goto L43;
                case 49: goto L2c;
                default: goto L2a;
            }
        L2a:
            goto L1a9
        L2c:
            r9 = 3
            if (r15 != r9) goto L1a9
            com.google.protobuf.Schema r14 = r8.getMessageFieldSchema(r1)
            r16 = r10
            r17 = r11
            r18 = r12
            r15 = r13
            r20 = r22
            r19 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeGroupList(r14, r15, r16, r17, r18, r19, r20)
            return r9
        L43:
            r9 = r22
            if (r15 != r7) goto L4c
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedSInt64List(r10, r11, r6, r9)
            return r9
        L4c:
            if (r15 != 0) goto L1a9
            r19 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeSInt64List(r14, r15, r16, r17, r18, r19)
            return r9
        L5d:
            r9 = r22
            if (r15 != r7) goto L66
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedSInt32List(r10, r11, r6, r9)
            return r9
        L66:
            if (r15 != 0) goto L1a9
            r19 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeSInt32List(r14, r15, r16, r17, r18, r19)
            return r9
        L77:
            r2 = r22
            if (r15 != r7) goto L80
            int r10 = com.google.protobuf.ArrayDecoders.decodePackedVarint32List(r10, r11, r6, r2)
            goto L8b
        L80:
            if (r15 != 0) goto L1a9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r2
            r2 = r13
            int r10 = com.google.protobuf.ArrayDecoders.decodeVarint32List(r2, r3, r4, r5, r6, r7)
        L8b:
            com.google.protobuf.Internal$EnumVerifier r11 = r8.getEnumFieldVerifier(r1)
            r12 = 0
            com.google.protobuf.UnknownFieldSchema<?, ?> r13 = r8.unknownFieldSchema
            r15 = r9
            r18 = r11
            r19 = r12
            r20 = r13
            r16 = r14
            r17 = r6
            com.google.protobuf.SchemaUtil.filterUnknownEnumList(r15, r16, r17, r18, r19, r20)
            return r10
        La1:
            if (r15 != r7) goto L1a9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r19 = r22
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeBytesList(r14, r15, r16, r17, r18, r19)
            return r9
        Lb2:
            if (r15 != r7) goto L1a9
            com.google.protobuf.Schema r14 = r8.getMessageFieldSchema(r1)
            r16 = r10
            r17 = r11
            r18 = r12
            r15 = r13
            r20 = r22
            r19 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeMessageList(r14, r15, r16, r17, r18, r19, r20)
            return r9
        Lc8:
            if (r15 != r7) goto L1a9
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            long r0 = r17 & r0
            r2 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto Le4
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r19 = r22
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeStringList(r14, r15, r16, r17, r18, r19)
            return r9
        Le4:
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r19 = r22
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeStringListRequireUtf8(r14, r15, r16, r17, r18, r19)
            return r9
        Lf3:
            r9 = r22
            if (r15 != r7) goto Lfc
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedBoolList(r10, r11, r6, r9)
            return r9
        Lfc:
            if (r15 != 0) goto L1a9
            r19 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeBoolList(r14, r15, r16, r17, r18, r19)
            return r9
        L10d:
            r2 = r22
            if (r15 != r7) goto L116
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedFixed32List(r10, r11, r6, r2)
            return r9
        L116:
            if (r15 != r3) goto L1a9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r19 = r2
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeFixed32List(r14, r15, r16, r17, r18, r19)
            return r9
        L127:
            r9 = r22
            if (r15 != r7) goto L130
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedFixed64List(r10, r11, r6, r9)
            return r9
        L130:
            if (r15 != r2) goto L1a9
            r19 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeFixed64List(r14, r15, r16, r17, r18, r19)
            return r9
        L141:
            r9 = r22
            if (r15 != r7) goto L14a
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedVarint32List(r10, r11, r6, r9)
            return r9
        L14a:
            if (r15 != 0) goto L1a9
            r19 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeVarint32List(r14, r15, r16, r17, r18, r19)
            return r9
        L15b:
            r9 = r22
            if (r15 != r7) goto L164
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedVarint64List(r10, r11, r6, r9)
            return r9
        L164:
            if (r15 != 0) goto L1a9
            r19 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeVarint64List(r14, r15, r16, r17, r18, r19)
            return r9
        L175:
            r2 = r22
            if (r15 != r7) goto L17e
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedFloatList(r10, r11, r6, r2)
            return r9
        L17e:
            if (r15 != r3) goto L1a9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r19 = r2
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeFloatList(r14, r15, r16, r17, r18, r19)
            return r9
        L18f:
            r9 = r22
            if (r15 != r7) goto L198
            int r9 = com.google.protobuf.ArrayDecoders.decodePackedDoubleList(r10, r11, r6, r9)
            return r9
        L198:
            if (r15 != r2) goto L1a9
            r19 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r14 = r13
            r18 = r6
            int r9 = com.google.protobuf.ArrayDecoders.decodeDoubleList(r14, r15, r16, r17, r18, r19)
            return r9
        L1a9:
            return r11
    }

    private int positionForFieldNumber(int r2) {
            r1 = this;
            int r0 = r1.minFieldNumber
            if (r2 < r0) goto Le
            int r0 = r1.maxFieldNumber
            if (r2 > r0) goto Le
            r0 = 0
            int r2 = r1.slowPositionForFieldNumber(r2, r0)
            return r2
        Le:
            r2 = -1
            return r2
    }

    private int positionForFieldNumber(int r2, int r3) {
            r1 = this;
            int r0 = r1.minFieldNumber
            if (r2 < r0) goto Ld
            int r0 = r1.maxFieldNumber
            if (r2 > r0) goto Ld
            int r2 = r1.slowPositionForFieldNumber(r2, r3)
            return r2
        Ld:
            r2 = -1
            return r2
    }

    private int presenceMaskAndOffsetAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    private <E> void readGroupList(java.lang.Object r2, long r3, com.google.protobuf.Reader r5, com.google.protobuf.Schema<E> r6, com.google.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r1 = this;
            com.google.protobuf.ListFieldSchema r0 = r1.listFieldSchema
            java.util.List r2 = r0.mutableListAt(r2, r3)
            r5.readGroupList(r2, r6, r7)
            return
    }

    private <E> void readMessageList(java.lang.Object r3, int r4, com.google.protobuf.Reader r5, com.google.protobuf.Schema<E> r6, com.google.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r2 = this;
            long r0 = offset(r4)
            com.google.protobuf.ListFieldSchema r4 = r2.listFieldSchema
            java.util.List r3 = r4.mutableListAt(r3, r0)
            r5.readMessageList(r3, r6, r7)
            return
    }

    private void readString(java.lang.Object r3, int r4, com.google.protobuf.Reader r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = isEnforceUtf8(r4)
            if (r0 == 0) goto L12
            long r0 = offset(r4)
            java.lang.String r4 = r5.readStringRequireUtf8()
            com.google.protobuf.UnsafeUtil.putObject(r3, r0, r4)
            return
        L12:
            boolean r0 = r2.lite
            if (r0 == 0) goto L22
            long r0 = offset(r4)
            java.lang.String r4 = r5.readString()
            com.google.protobuf.UnsafeUtil.putObject(r3, r0, r4)
            return
        L22:
            long r0 = offset(r4)
            com.google.protobuf.ByteString r4 = r5.readBytes()
            com.google.protobuf.UnsafeUtil.putObject(r3, r0, r4)
            return
    }

    private void readStringList(java.lang.Object r4, int r5, com.google.protobuf.Reader r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = isEnforceUtf8(r5)
            if (r0 == 0) goto L14
            com.google.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r4 = r0.mutableListAt(r4, r1)
            r6.readStringListRequireUtf8(r4)
            return
        L14:
            com.google.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r4 = r0.mutableListAt(r4, r1)
            r6.readStringList(r4)
            return
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class<?> r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Field "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " for "
            r2.append(r6)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = " not found. Known fields are "
            r2.append(r5)
            java.lang.String r5 = java.util.Arrays.toString(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    private void setFieldPresent(T r5, int r6) {
            r4 = this;
            int r6 = r4.presenceMaskAndOffsetAt(r6)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r0 = (long) r0
            r2 = 1048575(0xfffff, double:5.18065E-318)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L11
            return
        L11:
            int r6 = r6 >>> 20
            r2 = 1
            int r6 = r2 << r6
            int r2 = com.google.protobuf.UnsafeUtil.getInt(r5, r0)
            r6 = r6 | r2
            com.google.protobuf.UnsafeUtil.putInt(r5, r0, r6)
            return
    }

    private void setOneofPresent(T r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            com.google.protobuf.UnsafeUtil.putInt(r3, r0, r4)
            return
    }

    private int slowPositionForFieldNumber(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.buffer
            int r0 = r0.length
            int r0 = r0 / 3
            int r0 = r0 + (-1)
        L7:
            if (r6 > r0) goto L20
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            int r2 = r1 * 3
            int r3 = r4.numberAt(r2)
            if (r5 != r3) goto L16
            return r2
        L16:
            if (r5 >= r3) goto L1c
            int r1 = r1 + (-1)
            r0 = r1
            goto L7
        L1c:
            int r1 = r1 + 1
            r6 = r1
            goto L7
        L20:
            r5 = -1
            return r5
    }

    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
            com.google.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.m13892id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.m13892id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Laf:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            return
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Lc9:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
    }

    private void storeMessageField(T r4, int r5, java.lang.Object r6) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.protobuf.MessageSchema.UNSAFE
            int r1 = r3.typeAndOffsetAt(r5)
            long r1 = offset(r1)
            r0.putObject(r4, r1, r6)
            r3.setFieldPresent(r4, r5)
            return
    }

    private void storeOneofMessageField(T r4, int r5, int r6, java.lang.Object r7) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.protobuf.MessageSchema.UNSAFE
            int r1 = r3.typeAndOffsetAt(r6)
            long r1 = offset(r1)
            r0.putObject(r4, r1, r7)
            r3.setOneofPresent(r4, r5, r6)
            return
    }

    private static int type(int r1) {
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r1 = r1 >>> 20
            return r1
    }

    private int typeAndOffsetAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    private void writeFieldsInAscendingOrder(T r19, com.google.protobuf.Writer r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            r6 = r20
            boolean r2 = r0.hasExtensions
            if (r2 == 0) goto L22
            com.google.protobuf.ExtensionSchema<?> r2 = r0.extensionSchema
            com.google.protobuf.FieldSet r2 = r2.getExtensions(r1)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L22
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r8 = r2
            goto L24
        L22:
            r3 = 0
            r8 = 0
        L24:
            int[] r2 = r0.buffer
            int r9 = r2.length
            sun.misc.Unsafe r10 = com.google.protobuf.MessageSchema.UNSAFE
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r11
            r2 = 0
            r5 = 0
        L2f:
            if (r2 >= r9) goto L4e4
            int r13 = r0.typeAndOffsetAt(r2)
            int r14 = r0.numberAt(r2)
            int r15 = type(r13)
            r7 = 17
            if (r15 > r7) goto L64
            int[] r7 = r0.buffer
            int r16 = r2 + 2
            r7 = r7[r16]
            r16 = 1
            r12 = r7 & r11
            if (r12 == r4) goto L58
            if (r12 != r11) goto L51
            r5 = 0
            goto L57
        L51:
            long r4 = (long) r12
            int r4 = r10.getInt(r1, r4)
            r5 = r4
        L57:
            r4 = r12
        L58:
            int r7 = r7 >>> 20
            int r7 = r16 << r7
            r17 = r7
            r7 = r3
            r3 = r4
            r4 = r5
            r5 = r17
            goto L6a
        L64:
            r16 = 1
            r7 = r3
            r3 = r4
            r4 = r5
            r5 = 0
        L6a:
            if (r7 == 0) goto L88
            com.google.protobuf.ExtensionSchema<?> r12 = r0.extensionSchema
            int r12 = r12.extensionNumber(r7)
            if (r12 > r14) goto L88
            com.google.protobuf.ExtensionSchema<?> r12 = r0.extensionSchema
            r12.serializeExtension(r6, r7)
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r8.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            goto L6a
        L86:
            r7 = 0
            goto L6a
        L88:
            long r12 = offset(r13)
            switch(r15) {
                case 0: goto L4cf;
                case 1: goto L4bf;
                case 2: goto L4af;
                case 3: goto L49f;
                case 4: goto L48f;
                case 5: goto L47f;
                case 6: goto L46f;
                case 7: goto L45f;
                case 8: goto L44f;
                case 9: goto L43b;
                case 10: goto L42a;
                case 11: goto L41b;
                case 12: goto L40c;
                case 13: goto L3fd;
                case 14: goto L3ee;
                case 15: goto L3df;
                case 16: goto L3cd;
                case 17: goto L3b9;
                case 18: goto L3a9;
                case 19: goto L399;
                case 20: goto L389;
                case 21: goto L379;
                case 22: goto L369;
                case 23: goto L359;
                case 24: goto L349;
                case 25: goto L339;
                case 26: goto L32a;
                case 27: goto L317;
                case 28: goto L308;
                case 29: goto L2f9;
                case 30: goto L2ea;
                case 31: goto L2db;
                case 32: goto L2cc;
                case 33: goto L2bd;
                case 34: goto L2ac;
                case 35: goto L29b;
                case 36: goto L28a;
                case 37: goto L279;
                case 38: goto L268;
                case 39: goto L257;
                case 40: goto L246;
                case 41: goto L235;
                case 42: goto L224;
                case 43: goto L213;
                case 44: goto L202;
                case 45: goto L1f1;
                case 46: goto L1e0;
                case 47: goto L1cf;
                case 48: goto L1be;
                case 49: goto L1ab;
                case 50: goto L1a2;
                case 51: goto L193;
                case 52: goto L184;
                case 53: goto L175;
                case 54: goto L166;
                case 55: goto L157;
                case 56: goto L148;
                case 57: goto L139;
                case 58: goto L12a;
                case 59: goto L11b;
                case 60: goto L108;
                case 61: goto Lf8;
                case 62: goto Lea;
                case 63: goto Ldc;
                case 64: goto Lce;
                case 65: goto Lc0;
                case 66: goto Lb2;
                case 67: goto La4;
                case 68: goto L92;
                default: goto L8f;
            }
        L8f:
            r15 = 0
            goto L4dd
        L92:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.protobuf.Schema r12 = r0.getMessageFieldSchema(r2)
            r6.writeGroup(r14, r5, r12)
            goto L8f
        La4:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            long r12 = oneofLongAt(r1, r12)
            r6.writeSInt64(r14, r12)
            goto L8f
        Lb2:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            int r5 = oneofIntAt(r1, r12)
            r6.writeSInt32(r14, r5)
            goto L8f
        Lc0:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            long r12 = oneofLongAt(r1, r12)
            r6.writeSFixed64(r14, r12)
            goto L8f
        Lce:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            int r5 = oneofIntAt(r1, r12)
            r6.writeSFixed32(r14, r5)
            goto L8f
        Ldc:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            int r5 = oneofIntAt(r1, r12)
            r6.writeEnum(r14, r5)
            goto L8f
        Lea:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            int r5 = oneofIntAt(r1, r12)
            r6.writeUInt32(r14, r5)
            goto L8f
        Lf8:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
            r6.writeBytes(r14, r5)
            goto L8f
        L108:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.protobuf.Schema r12 = r0.getMessageFieldSchema(r2)
            r6.writeMessage(r14, r5, r12)
            goto L8f
        L11b:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r10.getObject(r1, r12)
            r0.writeString(r14, r5, r6)
            goto L8f
        L12a:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            boolean r5 = oneofBooleanAt(r1, r12)
            r6.writeBool(r14, r5)
            goto L8f
        L139:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            int r5 = oneofIntAt(r1, r12)
            r6.writeFixed32(r14, r5)
            goto L8f
        L148:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            long r12 = oneofLongAt(r1, r12)
            r6.writeFixed64(r14, r12)
            goto L8f
        L157:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            int r5 = oneofIntAt(r1, r12)
            r6.writeInt32(r14, r5)
            goto L8f
        L166:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            long r12 = oneofLongAt(r1, r12)
            r6.writeUInt64(r14, r12)
            goto L8f
        L175:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            long r12 = oneofLongAt(r1, r12)
            r6.writeInt64(r14, r12)
            goto L8f
        L184:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            float r5 = oneofFloatAt(r1, r12)
            r6.writeFloat(r14, r5)
            goto L8f
        L193:
            boolean r5 = r0.isOneofPresent(r1, r14, r2)
            if (r5 == 0) goto L8f
            double r12 = oneofDoubleAt(r1, r12)
            r6.writeDouble(r14, r12)
            goto L8f
        L1a2:
            java.lang.Object r5 = r10.getObject(r1, r12)
            r0.writeMapHelper(r6, r14, r5, r2)
            goto L8f
        L1ab:
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.Schema r13 = r0.getMessageFieldSchema(r2)
            com.google.protobuf.SchemaUtil.writeGroupList(r5, r12, r6, r13)
            goto L8f
        L1be:
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            r14 = r16
            com.google.protobuf.SchemaUtil.writeSInt64List(r5, r12, r6, r14)
            goto L8f
        L1cf:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeSInt32List(r5, r12, r6, r14)
            goto L8f
        L1e0:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeSFixed64List(r5, r12, r6, r14)
            goto L8f
        L1f1:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeSFixed32List(r5, r12, r6, r14)
            goto L8f
        L202:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeEnumList(r5, r12, r6, r14)
            goto L8f
        L213:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeUInt32List(r5, r12, r6, r14)
            goto L8f
        L224:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeBoolList(r5, r12, r6, r14)
            goto L8f
        L235:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeFixed32List(r5, r12, r6, r14)
            goto L8f
        L246:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeFixed64List(r5, r12, r6, r14)
            goto L8f
        L257:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeInt32List(r5, r12, r6, r14)
            goto L8f
        L268:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeUInt64List(r5, r12, r6, r14)
            goto L8f
        L279:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeInt64List(r5, r12, r6, r14)
            goto L8f
        L28a:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeFloatList(r5, r12, r6, r14)
            goto L8f
        L29b:
            r14 = r16
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeDoubleList(r5, r12, r6, r14)
            goto L8f
        L2ac:
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            r14 = 0
            com.google.protobuf.SchemaUtil.writeSInt64List(r5, r12, r6, r14)
        L2ba:
            r15 = r14
            goto L4dd
        L2bd:
            r14 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeSInt32List(r5, r12, r6, r14)
            goto L2ba
        L2cc:
            r14 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeSFixed64List(r5, r12, r6, r14)
            goto L2ba
        L2db:
            r14 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeSFixed32List(r5, r12, r6, r14)
            goto L2ba
        L2ea:
            r14 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeEnumList(r5, r12, r6, r14)
            goto L2ba
        L2f9:
            r14 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeUInt32List(r5, r12, r6, r14)
            goto L2ba
        L308:
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeBytesList(r5, r12, r6)
            goto L8f
        L317:
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.Schema r13 = r0.getMessageFieldSchema(r2)
            com.google.protobuf.SchemaUtil.writeMessageList(r5, r12, r6, r13)
            goto L8f
        L32a:
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeStringList(r5, r12, r6)
            goto L8f
        L339:
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            r15 = 0
            com.google.protobuf.SchemaUtil.writeBoolList(r5, r12, r6, r15)
            goto L4dd
        L349:
            r15 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeFixed32List(r5, r12, r6, r15)
            goto L4dd
        L359:
            r15 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeFixed64List(r5, r12, r6, r15)
            goto L4dd
        L369:
            r15 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeInt32List(r5, r12, r6, r15)
            goto L4dd
        L379:
            r15 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeUInt64List(r5, r12, r6, r15)
            goto L4dd
        L389:
            r15 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeInt64List(r5, r12, r6, r15)
            goto L4dd
        L399:
            r15 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeFloatList(r5, r12, r6, r15)
            goto L4dd
        L3a9:
            r15 = 0
            int r5 = r0.numberAt(r2)
            java.lang.Object r12 = r10.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.protobuf.SchemaUtil.writeDoubleList(r5, r12, r6, r15)
            goto L4dd
        L3b9:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4dd
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.protobuf.Schema r12 = r0.getMessageFieldSchema(r2)
            r6.writeGroup(r14, r5, r12)
            goto L4dd
        L3cd:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            long r12 = r10.getLong(r1, r12)
            r6.writeSInt64(r14, r12)
        L3db:
            r0 = r18
            goto L4dd
        L3df:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            int r0 = r10.getInt(r1, r12)
            r6.writeSInt32(r14, r0)
            goto L3db
        L3ee:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            long r12 = r10.getLong(r1, r12)
            r6.writeSFixed64(r14, r12)
            goto L3db
        L3fd:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            int r0 = r10.getInt(r1, r12)
            r6.writeSFixed32(r14, r0)
            goto L3db
        L40c:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            int r0 = r10.getInt(r1, r12)
            r6.writeEnum(r14, r0)
            goto L3db
        L41b:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            int r0 = r10.getInt(r1, r12)
            r6.writeUInt32(r14, r0)
            goto L3db
        L42a:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            java.lang.Object r0 = r10.getObject(r1, r12)
            com.google.protobuf.ByteString r0 = (com.google.protobuf.ByteString) r0
            r6.writeBytes(r14, r0)
            goto L3db
        L43b:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4dd
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.protobuf.Schema r12 = r0.getMessageFieldSchema(r2)
            r6.writeMessage(r14, r5, r12)
            goto L4dd
        L44f:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4dd
            java.lang.Object r5 = r10.getObject(r1, r12)
            r0.writeString(r14, r5, r6)
            goto L4dd
        L45f:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            boolean r0 = booleanAt(r1, r12)
            r6.writeBool(r14, r0)
            goto L3db
        L46f:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            int r0 = r10.getInt(r1, r12)
            r6.writeFixed32(r14, r0)
            goto L3db
        L47f:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            long r12 = r10.getLong(r1, r12)
            r6.writeFixed64(r14, r12)
            goto L3db
        L48f:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            int r0 = r10.getInt(r1, r12)
            r6.writeInt32(r14, r0)
            goto L3db
        L49f:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            long r12 = r10.getLong(r1, r12)
            r6.writeUInt64(r14, r12)
            goto L3db
        L4af:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            long r12 = r10.getLong(r1, r12)
            r6.writeInt64(r14, r12)
            goto L3db
        L4bf:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L3db
            float r0 = floatAt(r1, r12)
            r6.writeFloat(r14, r0)
            goto L3db
        L4cf:
            r15 = 0
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L4dd
            double r12 = doubleAt(r1, r12)
            r6.writeDouble(r14, r12)
        L4dd:
            int r2 = r2 + 3
            r5 = r4
            r4 = r3
            r3 = r7
            goto L2f
        L4e4:
            if (r3 == 0) goto L4fb
            com.google.protobuf.ExtensionSchema<?> r2 = r0.extensionSchema
            r2.serializeExtension(r6, r3)
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L4f9
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = r2
            goto L4e4
        L4f9:
            r3 = 0
            goto L4e4
        L4fb:
            com.google.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            r0.writeUnknownInMessageTo(r2, r1, r6)
            return
    }

    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.Writer r12) throws java.io.IOException {
            r10 = this;
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r10.unknownFieldSchema
            r10.writeUnknownInMessageTo(r0, r11, r12)
            boolean r0 = r10.hasExtensions
            r1 = 0
            if (r0 == 0) goto L21
            com.google.protobuf.ExtensionSchema<?> r0 = r10.extensionSchema
            com.google.protobuf.FieldSet r0 = r0.getExtensions(r11)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L21
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L23
        L21:
            r0 = r1
            r2 = r0
        L23:
            int[] r3 = r10.buffer
            int r3 = r3.length
            int r3 = r3 + (-3)
        L28:
            if (r3 < 0) goto L58c
            int r4 = r10.typeAndOffsetAt(r3)
            int r5 = r10.numberAt(r3)
        L32:
            if (r2 == 0) goto L50
            com.google.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            int r6 = r6.extensionNumber(r2)
            if (r6 <= r5) goto L50
            com.google.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            r6.serializeExtension(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L32
        L4e:
            r2 = r1
            goto L32
        L50:
            int r6 = type(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L577;
                case 1: goto L565;
                case 2: goto L553;
                case 3: goto L541;
                case 4: goto L52f;
                case 5: goto L51d;
                case 6: goto L50b;
                case 7: goto L4f8;
                case 8: goto L4e5;
                case 9: goto L4ce;
                case 10: goto L4b9;
                case 11: goto L4a6;
                case 12: goto L493;
                case 13: goto L480;
                case 14: goto L46d;
                case 15: goto L45a;
                case 16: goto L447;
                case 17: goto L430;
                case 18: goto L41d;
                case 19: goto L40a;
                case 20: goto L3f7;
                case 21: goto L3e4;
                case 22: goto L3d1;
                case 23: goto L3be;
                case 24: goto L3ab;
                case 25: goto L398;
                case 26: goto L385;
                case 27: goto L36e;
                case 28: goto L35b;
                case 29: goto L348;
                case 30: goto L335;
                case 31: goto L322;
                case 32: goto L30f;
                case 33: goto L2fc;
                case 34: goto L2e9;
                case 35: goto L2d6;
                case 36: goto L2c3;
                case 37: goto L2b0;
                case 38: goto L29d;
                case 39: goto L28a;
                case 40: goto L277;
                case 41: goto L264;
                case 42: goto L251;
                case 43: goto L23e;
                case 44: goto L22b;
                case 45: goto L218;
                case 46: goto L205;
                case 47: goto L1f2;
                case 48: goto L1df;
                case 49: goto L1c8;
                case 50: goto L1bb;
                case 51: goto L1a8;
                case 52: goto L195;
                case 53: goto L182;
                case 54: goto L16f;
                case 55: goto L15c;
                case 56: goto L149;
                case 57: goto L136;
                case 58: goto L123;
                case 59: goto L110;
                case 60: goto Lf9;
                case 61: goto Le4;
                case 62: goto Ld1;
                case 63: goto Lbe;
                case 64: goto Lab;
                case 65: goto L98;
                case 66: goto L85;
                case 67: goto L72;
                case 68: goto L5b;
                default: goto L59;
            }
        L59:
            goto L588
        L5b:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeGroup(r5, r4, r6)
            goto L588
        L72:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L588
        L85:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L588
        L98:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L588
        Lab:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L588
        Lbe:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeEnum(r5, r4)
            goto L588
        Ld1:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L588
        Le4:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.writeBytes(r5, r4)
            goto L588
        Lf9:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeMessage(r5, r4, r6)
            goto L588
        L110:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r4, r12)
            goto L588
        L123:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            boolean r4 = oneofBooleanAt(r11, r6)
            r12.writeBool(r5, r4)
            goto L588
        L136:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L588
        L149:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L588
        L15c:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeInt32(r5, r4)
            goto L588
        L16f:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L588
        L182:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L588
        L195:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            float r4 = oneofFloatAt(r11, r6)
            r12.writeFloat(r5, r4)
            goto L588
        L1a8:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            double r6 = oneofDoubleAt(r11, r6)
            r12.writeDouble(r5, r6)
            goto L588
        L1bb:
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeMapHelper(r12, r5, r4, r3)
            goto L588
        L1c8:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            com.google.protobuf.SchemaUtil.writeGroupList(r5, r4, r12, r6)
            goto L588
        L1df:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSInt64List(r5, r4, r12, r8)
            goto L588
        L1f2:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSInt32List(r5, r4, r12, r8)
            goto L588
        L205:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSFixed64List(r5, r4, r12, r8)
            goto L588
        L218:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSFixed32List(r5, r4, r12, r8)
            goto L588
        L22b:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeEnumList(r5, r4, r12, r8)
            goto L588
        L23e:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeUInt32List(r5, r4, r12, r8)
            goto L588
        L251:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeBoolList(r5, r4, r12, r8)
            goto L588
        L264:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeFixed32List(r5, r4, r12, r8)
            goto L588
        L277:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeFixed64List(r5, r4, r12, r8)
            goto L588
        L28a:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeInt32List(r5, r4, r12, r8)
            goto L588
        L29d:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeUInt64List(r5, r4, r12, r8)
            goto L588
        L2b0:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeInt64List(r5, r4, r12, r8)
            goto L588
        L2c3:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeFloatList(r5, r4, r12, r8)
            goto L588
        L2d6:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeDoubleList(r5, r4, r12, r8)
            goto L588
        L2e9:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSInt64List(r5, r4, r12, r7)
            goto L588
        L2fc:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSInt32List(r5, r4, r12, r7)
            goto L588
        L30f:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSFixed64List(r5, r4, r12, r7)
            goto L588
        L322:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeSFixed32List(r5, r4, r12, r7)
            goto L588
        L335:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeEnumList(r5, r4, r12, r7)
            goto L588
        L348:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeUInt32List(r5, r4, r12, r7)
            goto L588
        L35b:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeBytesList(r5, r4, r12)
            goto L588
        L36e:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            com.google.protobuf.SchemaUtil.writeMessageList(r5, r4, r12, r6)
            goto L588
        L385:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeStringList(r5, r4, r12)
            goto L588
        L398:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeBoolList(r5, r4, r12, r7)
            goto L588
        L3ab:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeFixed32List(r5, r4, r12, r7)
            goto L588
        L3be:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeFixed64List(r5, r4, r12, r7)
            goto L588
        L3d1:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeInt32List(r5, r4, r12, r7)
            goto L588
        L3e4:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeUInt64List(r5, r4, r12, r7)
            goto L588
        L3f7:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeInt64List(r5, r4, r12, r7)
            goto L588
        L40a:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeFloatList(r5, r4, r12, r7)
            goto L588
        L41d:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.SchemaUtil.writeDoubleList(r5, r4, r12, r7)
            goto L588
        L430:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeGroup(r5, r4, r6)
            goto L588
        L447:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L588
        L45a:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L588
        L46d:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L588
        L480:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L588
        L493:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeEnum(r5, r4)
            goto L588
        L4a6:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L588
        L4b9:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.writeBytes(r5, r4)
            goto L588
        L4ce:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeMessage(r5, r4, r6)
            goto L588
        L4e5:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = com.google.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r4, r12)
            goto L588
        L4f8:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            boolean r4 = booleanAt(r11, r6)
            r12.writeBool(r5, r4)
            goto L588
        L50b:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L588
        L51d:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L588
        L52f:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeInt32(r5, r4)
            goto L588
        L541:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L588
        L553:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L588
        L565:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            float r4 = floatAt(r11, r6)
            r12.writeFloat(r5, r4)
            goto L588
        L577:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            double r6 = doubleAt(r11, r6)
            r12.writeDouble(r5, r6)
        L588:
            int r3 = r3 + (-3)
            goto L28
        L58c:
            if (r2 == 0) goto L5a3
            com.google.protobuf.ExtensionSchema<?> r11 = r10.extensionSchema
            r11.serializeExtension(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L5a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L58c
        L5a1:
            r2 = r1
            goto L58c
        L5a3:
            return
    }

    private <K, V> void writeMapHelper(com.google.protobuf.Writer r2, int r3, java.lang.Object r4, int r5) throws java.io.IOException {
            r1 = this;
            if (r4 == 0) goto L15
            com.google.protobuf.MapFieldSchema r0 = r1.mapFieldSchema
            java.lang.Object r5 = r1.getMapFieldDefaultEntry(r5)
            com.google.protobuf.MapEntryLite$Metadata r5 = r0.forMapMetadata(r5)
            com.google.protobuf.MapFieldSchema r0 = r1.mapFieldSchema
            java.util.Map r4 = r0.forMapData(r4)
            r2.writeMap(r3, r5, r4)
        L15:
            return
    }

    private void writeString(int r2, java.lang.Object r3, com.google.protobuf.Writer r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto La
            java.lang.String r3 = (java.lang.String) r3
            r4.writeString(r2, r3)
            return
        La:
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            r4.writeBytes(r2, r3)
            return
    }

    private <UT, UB> void writeUnknownInMessageTo(com.google.protobuf.UnknownFieldSchema<UT, UB> r1, T r2, com.google.protobuf.Writer r3) throws java.io.IOException {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            r1.writeTo(r2, r3)
            return
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T r5, T r6) {
            r4 = this;
            int[] r0 = r4.buffer
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L11
            boolean r3 = r4.equals(r5, r6, r2)
            if (r3 != 0) goto Le
            return r1
        Le:
            int r2 = r2 + 3
            goto L5
        L11:
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r4.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r5)
            com.google.protobuf.UnknownFieldSchema<?, ?> r2 = r4.unknownFieldSchema
            java.lang.Object r2 = r2.getFromMessage(r6)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L24
            return r1
        L24:
            boolean r0 = r4.hasExtensions
            if (r0 == 0) goto L39
            com.google.protobuf.ExtensionSchema<?> r0 = r4.extensionSchema
            com.google.protobuf.FieldSet r5 = r0.getExtensions(r5)
            com.google.protobuf.ExtensionSchema<?> r0 = r4.extensionSchema
            com.google.protobuf.FieldSet r6 = r0.getExtensions(r6)
            boolean r5 = r5.equals(r6)
            return r5
        L39:
            r5 = 1
            return r5
    }

    public int getSchemaSize() {
            r1 = this;
            int[] r0 = r1.buffer
            int r0 = r0.length
            int r0 = r0 * 3
            return r0
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r6 = com.google.protobuf.MessageSchema.UNSAFE
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r7
            r4 = r2
            r9 = r4
            r3 = r8
        Le:
            int[] r5 = r0.buffer
            int r5 = r5.length
            if (r2 >= r5) goto L55b
            int r5 = r0.typeAndOffsetAt(r2)
            int r10 = type(r5)
            int r11 = r0.numberAt(r2)
            int[] r12 = r0.buffer
            int r13 = r2 + 2
            r12 = r12[r13]
            r13 = r12 & r8
            r14 = 17
            r15 = 1
            if (r10 > r14) goto L40
            if (r13 == r3) goto L39
            if (r13 != r8) goto L32
            r4 = r7
            goto L38
        L32:
            long r3 = (long) r13
            int r3 = r6.getInt(r1, r3)
            r4 = r3
        L38:
            r3 = r13
        L39:
            int r12 = r12 >>> 20
            int r12 = r15 << r12
        L3d:
            r16 = r9
            goto L42
        L40:
            r12 = r7
            goto L3d
        L42:
            long r8 = offset(r5)
            com.google.protobuf.FieldType r5 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r5 = r5.m13892id()
            if (r10 < r5) goto L57
            com.google.protobuf.FieldType r5 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r5 = r5.m13892id()
            if (r10 > r5) goto L57
            goto L58
        L57:
            r13 = r7
        L58:
            r5 = 0
            r14 = 0
            switch(r10) {
                case 0: goto L543;
                case 1: goto L535;
                case 2: goto L524;
                case 3: goto L513;
                case 4: goto L502;
                case 5: goto L4f5;
                case 6: goto L4e8;
                case 7: goto L4da;
                case 8: goto L4bb;
                case 9: goto L4a6;
                case 10: goto L494;
                case 11: goto L484;
                case 12: goto L474;
                case 13: goto L468;
                case 14: goto L44f;
                case 15: goto L43f;
                case 16: goto L426;
                case 17: goto L40f;
                case 18: goto L403;
                case 19: goto L3f7;
                case 20: goto L3eb;
                case 21: goto L3df;
                case 22: goto L3d3;
                case 23: goto L3c7;
                case 24: goto L3bb;
                case 25: goto L3af;
                case 26: goto L3a3;
                case 27: goto L393;
                case 28: goto L387;
                case 29: goto L37b;
                case 30: goto L36f;
                case 31: goto L363;
                case 32: goto L357;
                case 33: goto L34b;
                case 34: goto L33f;
                case 35: goto L321;
                case 36: goto L303;
                case 37: goto L2e5;
                case 38: goto L2c7;
                case 39: goto L2a9;
                case 40: goto L28b;
                case 41: goto L26d;
                case 42: goto L24f;
                case 43: goto L231;
                case 44: goto L214;
                case 45: goto L1f7;
                case 46: goto L1da;
                case 47: goto L1bd;
                case 48: goto L19b;
                case 49: goto L18b;
                case 50: goto L17b;
                case 51: goto L16d;
                case 52: goto L161;
                case 53: goto L151;
                case 54: goto L141;
                case 55: goto L131;
                case 56: goto L125;
                case 57: goto L119;
                case 58: goto L10c;
                case 59: goto Lee;
                case 60: goto Ldb;
                case 61: goto Lca;
                case 62: goto Lbb;
                case 63: goto Lac;
                case 64: goto La1;
                case 65: goto L96;
                case 66: goto L87;
                case 67: goto L78;
                case 68: goto L60;
                default: goto L5e;
            }
        L5e:
            goto L552
        L60:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.protobuf.MessageLite r5 = (com.google.protobuf.MessageLite) r5
            com.google.protobuf.Schema r8 = r0.getMessageFieldSchema(r2)
            int r5 = com.google.protobuf.CodedOutputStream.computeGroupSize(r11, r5, r8)
        L74:
            int r9 = r16 + r5
            goto L554
        L78:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            long r8 = oneofLongAt(r1, r8)
            int r5 = com.google.protobuf.CodedOutputStream.computeSInt64Size(r11, r8)
            goto L74
        L87:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = oneofIntAt(r1, r8)
            int r5 = com.google.protobuf.CodedOutputStream.computeSInt32Size(r11, r5)
            goto L74
        L96:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = com.google.protobuf.CodedOutputStream.computeSFixed64Size(r11, r14)
            goto L74
        La1:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = com.google.protobuf.CodedOutputStream.computeSFixed32Size(r11, r7)
            goto L74
        Lac:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = oneofIntAt(r1, r8)
            int r5 = com.google.protobuf.CodedOutputStream.computeEnumSize(r11, r5)
            goto L74
        Lbb:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = oneofIntAt(r1, r8)
            int r5 = com.google.protobuf.CodedOutputStream.computeUInt32Size(r11, r5)
            goto L74
        Lca:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
            int r5 = com.google.protobuf.CodedOutputStream.computeBytesSize(r11, r5)
            goto L74
        Ldb:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.getMessageFieldSchema(r2)
            int r5 = com.google.protobuf.SchemaUtil.computeSizeMessage(r11, r5, r8)
            goto L74
        Lee:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            java.lang.Object r5 = r6.getObject(r1, r8)
            boolean r8 = r5 instanceof com.google.protobuf.ByteString
            if (r8 == 0) goto L104
            com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
            int r5 = com.google.protobuf.CodedOutputStream.computeBytesSize(r11, r5)
            goto L74
        L104:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.protobuf.CodedOutputStream.computeStringSize(r11, r5)
            goto L74
        L10c:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            r5 = 1
            int r5 = com.google.protobuf.CodedOutputStream.computeBoolSize(r11, r5)
            goto L74
        L119:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = com.google.protobuf.CodedOutputStream.computeFixed32Size(r11, r7)
            goto L74
        L125:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = com.google.protobuf.CodedOutputStream.computeFixed64Size(r11, r14)
            goto L74
        L131:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            int r5 = oneofIntAt(r1, r8)
            int r5 = com.google.protobuf.CodedOutputStream.computeInt32Size(r11, r5)
            goto L74
        L141:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            long r8 = oneofLongAt(r1, r8)
            int r5 = com.google.protobuf.CodedOutputStream.computeUInt64Size(r11, r8)
            goto L74
        L151:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            long r8 = oneofLongAt(r1, r8)
            int r5 = com.google.protobuf.CodedOutputStream.computeInt64Size(r11, r8)
            goto L74
        L161:
            boolean r8 = r0.isOneofPresent(r1, r11, r2)
            if (r8 == 0) goto L552
            int r5 = com.google.protobuf.CodedOutputStream.computeFloatSize(r11, r5)
            goto L74
        L16d:
            boolean r5 = r0.isOneofPresent(r1, r11, r2)
            if (r5 == 0) goto L552
            r8 = 0
            int r5 = com.google.protobuf.CodedOutputStream.computeDoubleSize(r11, r8)
            goto L74
        L17b:
            com.google.protobuf.MapFieldSchema r5 = r0.mapFieldSchema
            java.lang.Object r8 = r6.getObject(r1, r8)
            java.lang.Object r9 = r0.getMapFieldDefaultEntry(r2)
            int r5 = r5.getSerializedSize(r11, r8, r9)
            goto L74
        L18b:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            com.google.protobuf.Schema r8 = r0.getMessageFieldSchema(r2)
            int r5 = com.google.protobuf.SchemaUtil.computeSizeGroupList(r11, r5, r8)
            goto L74
        L19b:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeSInt64ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L1af
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L1af:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
        L1b7:
            int r8 = r8 + r9
            int r8 = r8 + r5
            int r9 = r16 + r8
            goto L554
        L1bd:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeSInt32ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L1d1
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L1d1:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L1da:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L1ee
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L1ee:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L1f7:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L20b
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L20b:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L214:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeEnumListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L228
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L228:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L231:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeUInt32ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L245
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L245:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L24f:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeBoolListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L263
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L263:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L26d:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L281
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L281:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L28b:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L29f
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L29f:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L2a9:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeInt32ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L2bd
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L2bd:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L2c7:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeUInt64ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L2db
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L2db:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L2e5:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeInt64ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L2f9
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L2f9:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L303:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L317
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L317:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L321:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r5)
            if (r5 <= 0) goto L552
            boolean r8 = r0.useCachedSizeField
            if (r8 == 0) goto L335
            long r8 = (long) r13
            r6.putInt(r1, r8, r5)
        L335:
            int r8 = com.google.protobuf.CodedOutputStream.computeTagSize(r11)
            int r9 = com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r5)
            goto L1b7
        L33f:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeSInt64List(r11, r5, r7)
            goto L74
        L34b:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeSInt32List(r11, r5, r7)
            goto L74
        L357:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed64List(r11, r5, r7)
            goto L74
        L363:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed32List(r11, r5, r7)
            goto L74
        L36f:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeEnumList(r11, r5, r7)
            goto L74
        L37b:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeUInt32List(r11, r5, r7)
            goto L74
        L387:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeByteStringList(r11, r5)
            goto L74
        L393:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            com.google.protobuf.Schema r8 = r0.getMessageFieldSchema(r2)
            int r5 = com.google.protobuf.SchemaUtil.computeSizeMessageList(r11, r5, r8)
            goto L74
        L3a3:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeStringList(r11, r5)
            goto L74
        L3af:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeBoolList(r11, r5, r7)
            goto L74
        L3bb:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed32List(r11, r5, r7)
            goto L74
        L3c7:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed64List(r11, r5, r7)
            goto L74
        L3d3:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeInt32List(r11, r5, r7)
            goto L74
        L3df:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeUInt64List(r11, r5, r7)
            goto L74
        L3eb:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeInt64List(r11, r5, r7)
            goto L74
        L3f7:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed32List(r11, r5, r7)
            goto L74
        L403:
            java.lang.Object r5 = r6.getObject(r1, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.SchemaUtil.computeSizeFixed64List(r11, r5, r7)
            goto L74
        L40f:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L552
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.protobuf.MessageLite r5 = (com.google.protobuf.MessageLite) r5
            com.google.protobuf.Schema r8 = r0.getMessageFieldSchema(r2)
            int r5 = com.google.protobuf.CodedOutputStream.computeGroupSize(r11, r5, r8)
            goto L74
        L426:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            long r8 = r6.getLong(r1, r8)
            int r0 = com.google.protobuf.CodedOutputStream.computeSInt64Size(r11, r8)
        L435:
            int r9 = r16 + r0
            r0 = r17
            goto L554
        L43b:
            r0 = r17
            goto L552
        L43f:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            int r0 = r6.getInt(r1, r8)
            int r0 = com.google.protobuf.CodedOutputStream.computeSInt32Size(r11, r0)
            goto L435
        L44f:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L462
            int r0 = com.google.protobuf.CodedOutputStream.computeSFixed64Size(r11, r14)
        L45a:
            int r9 = r16 + r0
            r0 = r17
            r1 = r18
            goto L554
        L462:
            r0 = r17
            r1 = r18
            goto L552
        L468:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L462
            int r0 = com.google.protobuf.CodedOutputStream.computeSFixed32Size(r11, r7)
            goto L45a
        L474:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            int r0 = r6.getInt(r1, r8)
            int r0 = com.google.protobuf.CodedOutputStream.computeEnumSize(r11, r0)
            goto L435
        L484:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            int r0 = r6.getInt(r1, r8)
            int r0 = com.google.protobuf.CodedOutputStream.computeUInt32Size(r11, r0)
            goto L435
        L494:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            java.lang.Object r0 = r6.getObject(r1, r8)
            com.google.protobuf.ByteString r0 = (com.google.protobuf.ByteString) r0
            int r0 = com.google.protobuf.CodedOutputStream.computeBytesSize(r11, r0)
            goto L435
        L4a6:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L552
            java.lang.Object r5 = r6.getObject(r1, r8)
            com.google.protobuf.Schema r8 = r0.getMessageFieldSchema(r2)
            int r5 = com.google.protobuf.SchemaUtil.computeSizeMessage(r11, r5, r8)
            goto L74
        L4bb:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            java.lang.Object r0 = r6.getObject(r1, r8)
            boolean r5 = r0 instanceof com.google.protobuf.ByteString
            if (r5 == 0) goto L4d2
            com.google.protobuf.ByteString r0 = (com.google.protobuf.ByteString) r0
            int r0 = com.google.protobuf.CodedOutputStream.computeBytesSize(r11, r0)
            goto L435
        L4d2:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.protobuf.CodedOutputStream.computeStringSize(r11, r0)
            goto L435
        L4da:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L462
            r5 = 1
            int r0 = com.google.protobuf.CodedOutputStream.computeBoolSize(r11, r5)
            goto L45a
        L4e8:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L462
            int r0 = com.google.protobuf.CodedOutputStream.computeFixed32Size(r11, r7)
            goto L45a
        L4f5:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L462
            int r0 = com.google.protobuf.CodedOutputStream.computeFixed64Size(r11, r14)
            goto L45a
        L502:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            int r0 = r6.getInt(r1, r8)
            int r0 = com.google.protobuf.CodedOutputStream.computeInt32Size(r11, r0)
            goto L435
        L513:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            long r8 = r6.getLong(r1, r8)
            int r0 = com.google.protobuf.CodedOutputStream.computeUInt64Size(r11, r8)
            goto L435
        L524:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43b
            long r8 = r6.getLong(r1, r8)
            int r0 = com.google.protobuf.CodedOutputStream.computeInt64Size(r11, r8)
            goto L435
        L535:
            r8 = r5
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L462
            int r0 = com.google.protobuf.CodedOutputStream.computeFloatSize(r11, r8)
            goto L45a
        L543:
            r5 = r12
            boolean r5 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L552
            r8 = 0
            int r5 = com.google.protobuf.CodedOutputStream.computeDoubleSize(r11, r8)
            goto L74
        L552:
            r9 = r16
        L554:
            int r2 = r2 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto Le
        L55b:
            r16 = r9
            com.google.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            int r2 = r0.getUnknownFieldsSerializedSize(r2, r1)
            int r9 = r16 + r2
            boolean r2 = r0.hasExtensions
            if (r2 == 0) goto L574
            com.google.protobuf.ExtensionSchema<?> r2 = r0.extensionSchema
            com.google.protobuf.FieldSet r1 = r2.getExtensions(r1)
            int r1 = r1.getSerializedSize()
            int r9 = r9 + r1
        L574:
            return r9
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T r9) {
            r8 = this;
            int[] r0 = r8.buffer
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r1 >= r0) goto L22d
            int r3 = r8.typeAndOffsetAt(r1)
            int r4 = r8.numberAt(r1)
            long r5 = offset(r3)
            int r3 = type(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L219;
                case 1: goto L20d;
                case 2: goto L201;
                case 3: goto L1f5;
                case 4: goto L1ed;
                case 5: goto L1e1;
                case 6: goto L1d9;
                case 7: goto L1cd;
                case 8: goto L1bf;
                case 9: goto L1b4;
                case 10: goto L1a8;
                case 11: goto L1a0;
                case 12: goto L198;
                case 13: goto L190;
                case 14: goto L184;
                case 15: goto L17c;
                case 16: goto L170;
                case 17: goto L161;
                case 18: goto L155;
                case 19: goto L155;
                case 20: goto L155;
                case 21: goto L155;
                case 22: goto L155;
                case 23: goto L155;
                case 24: goto L155;
                case 25: goto L155;
                case 26: goto L155;
                case 27: goto L155;
                case 28: goto L155;
                case 29: goto L155;
                case 30: goto L155;
                case 31: goto L155;
                case 32: goto L155;
                case 33: goto L155;
                case 34: goto L155;
                case 35: goto L155;
                case 36: goto L155;
                case 37: goto L155;
                case 38: goto L155;
                case 39: goto L155;
                case 40: goto L155;
                case 41: goto L155;
                case 42: goto L155;
                case 43: goto L155;
                case 44: goto L155;
                case 45: goto L155;
                case 46: goto L155;
                case 47: goto L155;
                case 48: goto L155;
                case 49: goto L155;
                case 50: goto L149;
                case 51: goto L133;
                case 52: goto L121;
                case 53: goto L10f;
                case 54: goto Lfd;
                case 55: goto Lef;
                case 56: goto Ldd;
                case 57: goto Lcf;
                case 58: goto Lbd;
                case 59: goto La9;
                case 60: goto L98;
                case 61: goto L87;
                case 62: goto L7a;
                case 63: goto L6d;
                case 64: goto L60;
                case 65: goto L4f;
                case 66: goto L42;
                case 67: goto L31;
                case 68: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L229
        L1e:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L2e:
            int r2 = r2 + r3
            goto L229
        L31:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L42:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L2e
        L4f:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L60:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L2e
        L6d:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L2e
        L7a:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L2e
        L87:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L2e
        L98:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L2e
        La9:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L2e
        Lbd:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            boolean r3 = oneofBooleanAt(r9, r5)
            int r3 = com.google.protobuf.Internal.hashBoolean(r3)
            goto L2e
        Lcf:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L2e
        Ldd:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        Lef:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L2e
        Lfd:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L10f:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L121:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            float r3 = oneofFloatAt(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L2e
        L133:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L229
            int r2 = r2 * 53
            double r3 = oneofDoubleAt(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L149:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L2e
        L155:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L2e
        L161:
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            if (r3 == 0) goto L16b
            int r7 = r3.hashCode()
        L16b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L229
        L170:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L17c:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L2e
        L184:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L190:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L2e
        L198:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L2e
        L1a0:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L2e
        L1a8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L2e
        L1b4:
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            if (r3 == 0) goto L16b
            int r7 = r3.hashCode()
            goto L16b
        L1bf:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.UnsafeUtil.getObject(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L2e
        L1cd:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.UnsafeUtil.getBoolean(r9, r5)
            int r3 = com.google.protobuf.Internal.hashBoolean(r3)
            goto L2e
        L1d9:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L2e
        L1e1:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L1ed:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L2e
        L1f5:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L20d:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.UnsafeUtil.getFloat(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L2e
        L219:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.UnsafeUtil.getDouble(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.Internal.hashLong(r3)
            goto L2e
        L229:
            int r1 = r1 + 3
            goto L5
        L22d:
            int r2 = r2 * 53
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r8.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.hasExtensions
            if (r0 == 0) goto L24b
            int r2 = r2 * 53
            com.google.protobuf.ExtensionSchema<?> r0 = r8.extensionSchema
            com.google.protobuf.FieldSet r9 = r0.getExtensions(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L24b:
            return r2
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T r15) {
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.checkInitializedCount
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.intArray
            r9 = r5[r2]
            int r5 = r14.numberAt(r9)
            int r13 = r14.typeAndOffsetAt(r9)
            int[] r7 = r14.buffer
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = com.google.protobuf.MessageSchema.UNSAFE
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = isRequired(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = type(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.isMapInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.isOneofPresent(r8, r5, r9)
            if (r15 == 0) goto L94
            com.google.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.isListInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            com.google.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.hasExtensions
            if (r15 == 0) goto Lae
            com.google.protobuf.ExtensionSchema<?> r15 = r7.extensionSchema
            com.google.protobuf.FieldSet r15 = r15.getExtensions(r8)
            boolean r15 = r15.isInitialized()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T r8) {
            r7 = this;
            boolean r0 = isMutable(r8)
            if (r0 != 0) goto L8
            goto L8e
        L8:
            boolean r0 = r8 instanceof com.google.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L18
            r0 = r8
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r7.buffer
            int r0 = r0.length
            r1 = 0
        L1c:
            if (r1 >= r0) goto L80
            int r2 = r7.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r2 = type(r2)
            r5 = 9
            if (r2 == r5) goto L6a
            r5 = 60
            if (r2 == r5) goto L52
            r5 = 68
            if (r2 == r5) goto L52
            switch(r2) {
                case 17: goto L6a;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7d
        L3a:
            sun.misc.Unsafe r2 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7d
            com.google.protobuf.MapFieldSchema r6 = r7.mapFieldSchema
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L7d
        L4c:
            com.google.protobuf.ListFieldSchema r2 = r7.listFieldSchema
            r2.makeImmutableListAt(r8, r3)
            goto L7d
        L52:
            int r2 = r7.numberAt(r1)
            boolean r2 = r7.isOneofPresent(r8, r2, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.Schema r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
            goto L7d
        L6a:
            boolean r2 = r7.isFieldPresent(r8, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.Schema r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L7d:
            int r1 = r1 + 3
            goto L1c
        L80:
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r7.unknownFieldSchema
            r0.makeImmutable(r8)
            boolean r0 = r7.hasExtensions
            if (r0 == 0) goto L8e
            com.google.protobuf.ExtensionSchema<?> r0 = r7.extensionSchema
            r0.makeImmutable(r8)
        L8e:
            return
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T r7, com.google.protobuf.Reader r8, com.google.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            r9.getClass()
            checkMutable(r7)
            com.google.protobuf.UnknownFieldSchema<?, ?> r1 = r6.unknownFieldSchema
            com.google.protobuf.ExtensionSchema<?> r2 = r6.extensionSchema
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.mergeFromHelper(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T r3, T r4) {
            r2 = this;
            checkMutable(r3)
            r4.getClass()
            r0 = 0
        L7:
            int[] r1 = r2.buffer
            int r1 = r1.length
            if (r0 >= r1) goto L12
            r2.mergeSingleField(r3, r4, r0)
            int r0 = r0 + 3
            goto L7
        L12:
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            com.google.protobuf.SchemaUtil.mergeUnknownFields(r0, r3, r4)
            boolean r0 = r2.hasExtensions
            if (r0 == 0) goto L20
            com.google.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            com.google.protobuf.SchemaUtil.mergeExtensions(r0, r3, r4)
        L20:
            return
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T r8, byte[] r9, int r10, int r11, com.google.protobuf.ArrayDecoders.Registers r12) throws java.io.IOException {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.parseMessage(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
            r2 = this;
            com.google.protobuf.NewInstanceSchema r0 = r2.newInstanceSchema
            com.google.protobuf.MessageLite r1 = r2.defaultInstance
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    @com.google.protobuf.CanIgnoreReturnValue
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r15 = r31
            r7 = r32
            checkMutable(r1)
            sun.misc.Unsafe r9 = com.google.protobuf.MessageSchema.UNSAFE
            r16 = 0
            r11 = -1
            r3 = r29
            r5 = r11
            r6 = r16
            r12 = r6
            r13 = r12
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L1e:
            if (r3 >= r4) goto L45b
            int r13 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L2c
            int r13 = com.google.protobuf.ArrayDecoders.decodeVarint32(r3, r2, r13, r7)
            int r3 = r7.int1
        L2c:
            r25 = r13
            r13 = r3
            r3 = r25
            int r14 = r13 >>> 3
            r7 = r13 & 7
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 3
            if (r14 <= r5) goto L41
            int r6 = r6 / r10
            int r5 = r0.positionForFieldNumber(r14, r6)
            goto L45
        L41:
            int r5 = r0.positionForFieldNumber(r14)
        L45:
            if (r5 != r11) goto L58
            r2 = r3
            r17 = r8
            r24 = r9
            r19 = r11
            r21 = r14
            r8 = r16
            r9 = r0
            r0 = r13
        L54:
            r13 = r32
            goto L40e
        L58:
            int[] r6 = r0.buffer
            int r18 = r5 + 1
            r6 = r6[r18]
            r18 = r11
            int r11 = type(r6)
            r19 = r3
            long r3 = offset(r6)
            r10 = 17
            if (r11 > r10) goto L2f5
            int[] r10 = r0.buffer
            int r20 = r5 + 2
            r10 = r10[r20]
            int r20 = r10 >>> 20
            r2 = 1
            int r20 = r2 << r20
            r10 = r10 & r17
            if (r10 == r8) goto L95
            r21 = r14
            r14 = r17
            r22 = r3
            if (r8 == r14) goto L89
            long r2 = (long) r8
            r9.putInt(r1, r2, r12)
        L89:
            if (r10 != r14) goto L8e
            r2 = r16
            goto L93
        L8e:
            long r2 = (long) r10
            int r2 = r9.getInt(r1, r2)
        L93:
            r12 = r2
            goto L9c
        L95:
            r22 = r3
            r21 = r14
            r14 = r17
            r10 = r8
        L9c:
            r2 = 5
            switch(r11) {
                case 0: goto L2d1;
                case 1: goto L2b5;
                case 2: goto L28a;
                case 3: goto L28a;
                case 4: goto L26c;
                case 5: goto L238;
                case 6: goto L219;
                case 7: goto L1f4;
                case 8: goto L1d2;
                case 9: goto L189;
                case 10: goto L172;
                case 11: goto L26c;
                case 12: goto L13c;
                case 13: goto L219;
                case 14: goto L238;
                case 15: goto L11e;
                case 16: goto Le1;
                case 17: goto Laa;
                default: goto La0;
            }
        La0:
            r8 = r32
            r11 = r5
        La3:
            r3 = r9
            r14 = r19
            r9 = r28
            goto L2e8
        Laa:
            r2 = 3
            if (r7 != r2) goto Ldd
            java.lang.Object r2 = r0.mutableMessageFieldForMerge(r1, r5)
            int r3 = r21 << 3
            r7 = r3 | 4
            com.google.protobuf.Schema r3 = r0.getMessageFieldSchema(r5)
            r4 = r28
            r6 = r30
            r8 = r32
            r11 = r5
            r5 = r19
            int r3 = com.google.protobuf.ArrayDecoders.mergeGroupField(r2, r3, r4, r5, r6, r7, r8)
            r25 = r4
            r4 = r2
            r2 = r8
            r8 = r25
            r0.storeMessageField(r1, r11, r4)
            r12 = r12 | r20
            r4 = r30
            r7 = r2
            r2 = r8
        Ld5:
            r8 = r10
            r6 = r11
            r11 = r18
            r5 = r21
            goto L1e
        Ldd:
            r11 = r5
            r8 = r32
            goto La3
        Le1:
            r8 = r28
            r2 = r32
            r11 = r5
            r3 = r19
            if (r7 != 0) goto L112
            int r7 = com.google.protobuf.ArrayDecoders.decodeVarint64(r8, r3, r2)
            long r3 = r2.long1
            long r5 = com.google.protobuf.CodedInputStream.decodeZigZag64(r3)
            r3 = r2
            r2 = r1
            r1 = r9
            r9 = r3
            r3 = r22
            r1.putLong(r2, r3, r5)
            r25 = r2
            r2 = r1
            r1 = r25
            r12 = r12 | r20
            r4 = r30
            r3 = r7
        L107:
            r7 = r9
            r6 = r11
            r11 = r18
            r5 = r21
            r9 = r2
            r2 = r8
        L10f:
            r8 = r10
            goto L1e
        L112:
            r25 = r9
            r9 = r2
            r2 = r25
        L117:
            r14 = r9
            r9 = r8
            r8 = r14
            r14 = r3
        L11b:
            r3 = r2
            goto L2e8
        L11e:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r4 = r22
            r9 = r32
            if (r7 != 0) goto L117
            int r3 = com.google.protobuf.ArrayDecoders.decodeVarint32(r8, r3, r9)
            int r6 = r9.int1
            int r6 = com.google.protobuf.CodedInputStream.decodeZigZag32(r6)
            r2.putInt(r1, r4, r6)
        L137:
            r12 = r12 | r20
        L139:
            r4 = r30
            goto L107
        L13c:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r4 = r22
            r9 = r32
            if (r7 != 0) goto L117
            int r3 = com.google.protobuf.ArrayDecoders.decodeVarint32(r8, r3, r9)
            int r7 = r9.int1
            com.google.protobuf.Internal$EnumVerifier r14 = r0.getEnumFieldVerifier(r11)
            boolean r6 = isLegacyEnumIsClosed(r6)
            if (r6 == 0) goto L16e
            if (r14 == 0) goto L16e
            boolean r6 = r14.isInRange(r7)
            if (r6 == 0) goto L161
            goto L16e
        L161:
            com.google.protobuf.UnknownFieldSetLite r4 = getMutableUnknownFields(r1)
            long r5 = (long) r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.storeField(r13, r5)
            goto L139
        L16e:
            r2.putInt(r1, r4, r7)
            goto L137
        L172:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r4 = r22
            r14 = 2
            r9 = r32
            if (r7 != r14) goto L117
            int r3 = com.google.protobuf.ArrayDecoders.decodeBytes(r8, r3, r9)
            java.lang.Object r6 = r9.object1
            r2.putObject(r1, r4, r6)
            goto L137
        L189:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r14 = 2
            r9 = r32
            if (r7 != r14) goto L1bf
            r4 = r1
            java.lang.Object r1 = r0.mutableMessageFieldForMerge(r4, r11)
            r5 = r2
            com.google.protobuf.Schema r2 = r0.getMessageFieldSchema(r11)
            r6 = r4
            r4 = r3
            r3 = r8
            r8 = r6
            r6 = r9
            r9 = r5
            r5 = r30
            int r2 = com.google.protobuf.ArrayDecoders.mergeMessageField(r1, r2, r3, r4, r5, r6)
            r4 = r1
            r1 = r3
            r3 = r6
            r0.storeMessageField(r8, r11, r4)
        L1b0:
            r12 = r12 | r20
            r4 = r30
            r7 = r3
            r6 = r11
            r11 = r18
            r5 = r21
            r3 = r2
            r2 = r1
            r1 = r8
            goto L10f
        L1bf:
            r25 = r8
            r8 = r1
            r1 = r25
            r25 = r9
            r9 = r2
            r2 = r3
            r3 = r25
        L1ca:
            r14 = r9
            r9 = r1
            r1 = r8
            r8 = r3
            r3 = r14
            r14 = r2
            goto L2e8
        L1d2:
            r3 = r32
            r8 = r1
            r11 = r5
            r2 = r19
            r4 = r22
            r14 = 2
            r1 = r28
            if (r7 != r14) goto L1ca
            boolean r6 = isEnforceUtf8(r6)
            if (r6 == 0) goto L1ea
            int r2 = com.google.protobuf.ArrayDecoders.decodeStringRequireUtf8(r1, r2, r3)
            goto L1ee
        L1ea:
            int r2 = com.google.protobuf.ArrayDecoders.decodeString(r1, r2, r3)
        L1ee:
            java.lang.Object r6 = r3.object1
            r9.putObject(r8, r4, r6)
            goto L1b0
        L1f4:
            r3 = r32
            r8 = r1
            r11 = r5
            r2 = r19
            r5 = r22
            r1 = r28
            if (r7 != 0) goto L1ca
            int r2 = com.google.protobuf.ArrayDecoders.decodeVarint64(r1, r2, r3)
            r22 = r5
            long r4 = r3.long1
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L212
            r4 = 1
        L20f:
            r5 = r22
            goto L215
        L212:
            r4 = r16
            goto L20f
        L215:
            com.google.protobuf.UnsafeUtil.putBoolean(r8, r5, r4)
            goto L1b0
        L219:
            r3 = r32
            r8 = r1
            r11 = r5
            r14 = r19
            r5 = r22
            r1 = r28
            if (r7 != r2) goto L22f
            int r2 = com.google.protobuf.ArrayDecoders.decodeFixed32(r1, r14)
            r9.putInt(r8, r5, r2)
            int r2 = r14 + 4
            goto L1b0
        L22f:
            r25 = r9
            r9 = r1
            r1 = r8
            r8 = r3
            r3 = r25
            goto L2e8
        L238:
            r3 = r32
            r8 = r1
            r11 = r5
            r14 = r19
            r5 = r22
            r4 = 1
            r1 = r28
            if (r7 != r4) goto L266
            r22 = r5
            long r5 = com.google.protobuf.ArrayDecoders.decodeFixed64(r1, r14)
            r2 = r9
            r9 = r1
            r1 = r2
            r2 = r8
            r8 = r3
            r3 = r22
            r1.putLong(r2, r3, r5)
            r25 = r2
            r2 = r1
            r1 = r25
            int r3 = r14 + 8
            r12 = r12 | r20
            r4 = r9
            r9 = r2
            r2 = r4
        L261:
            r4 = r30
        L263:
            r7 = r8
            goto Ld5
        L266:
            r2 = r9
            r9 = r1
            r1 = r8
            r8 = r3
            goto L11b
        L26c:
            r8 = r32
            r11 = r5
            r2 = r9
            r14 = r19
            r3 = r22
            r9 = r28
            if (r7 != 0) goto L11b
            int r5 = com.google.protobuf.ArrayDecoders.decodeVarint32(r9, r14, r8)
            int r6 = r8.int1
            r2.putInt(r1, r3, r6)
            r12 = r12 | r20
            r3 = r9
            r9 = r2
            r2 = r3
            r4 = r30
            r3 = r5
            goto L263
        L28a:
            r8 = r32
            r11 = r5
            r2 = r9
            r14 = r19
            r3 = r22
            r9 = r28
            if (r7 != 0) goto L11b
            int r7 = com.google.protobuf.ArrayDecoders.decodeVarint64(r9, r14, r8)
            long r5 = r8.long1
            r25 = r2
            r2 = r1
            r1 = r25
            r1.putLong(r2, r3, r5)
            r3 = r1
            r1 = r2
            r12 = r12 | r20
            r4 = r30
            r2 = r9
            r6 = r11
            r11 = r18
            r5 = r21
            r9 = r3
            r3 = r7
            r7 = r8
            goto L10f
        L2b5:
            r8 = r32
            r11 = r5
            r3 = r9
            r14 = r19
            r4 = r22
            r9 = r28
            if (r7 != r2) goto L2e8
            float r2 = com.google.protobuf.ArrayDecoders.decodeFloat(r9, r14)
            com.google.protobuf.UnsafeUtil.putFloat(r1, r4, r2)
            int r2 = r14 + 4
        L2ca:
            r12 = r12 | r20
            r4 = r3
            r3 = r2
            r2 = r9
            r9 = r4
            goto L261
        L2d1:
            r8 = r32
            r11 = r5
            r3 = r9
            r14 = r19
            r4 = r22
            r2 = 1
            r9 = r28
            if (r7 != r2) goto L2e8
            double r6 = com.google.protobuf.ArrayDecoders.decodeDouble(r9, r14)
            com.google.protobuf.UnsafeUtil.putDouble(r1, r4, r6)
            int r2 = r14 + 8
            goto L2ca
        L2e8:
            r9 = r0
            r24 = r3
            r17 = r10
            r0 = r13
            r2 = r14
            r19 = r18
            r13 = r8
            r8 = r11
            goto L40e
        L2f5:
            r10 = r8
            r21 = r14
            r14 = r19
            r8 = r5
            r4 = r3
            r3 = r9
            r9 = r28
            r2 = 27
            if (r11 != r2) goto L351
            r2 = 2
            if (r7 != r2) goto L345
            java.lang.Object r2 = r3.getObject(r1, r4)
            com.google.protobuf.Internal$ProtobufList r2 = (com.google.protobuf.Internal.ProtobufList) r2
            boolean r6 = r2.isModifiable()
            if (r6 != 0) goto L324
            int r6 = r2.size()
            if (r6 != 0) goto L31b
            r6 = 10
            goto L31d
        L31b:
            int r6 = r6 * 2
        L31d:
            com.google.protobuf.Internal$ProtobufList r2 = r2.mutableCopyWithCapacity(r6)
            r3.putObject(r1, r4, r2)
        L324:
            r6 = r2
            com.google.protobuf.Schema r1 = r0.getMessageFieldSchema(r8)
            r2 = r9
            r9 = r3
            r3 = r2
            r5 = r30
            r7 = r32
            r2 = r13
            r4 = r14
            int r1 = com.google.protobuf.ArrayDecoders.decodeMessageList(r1, r2, r3, r4, r5, r6, r7)
            r4 = r30
            r3 = r1
            r6 = r8
            r8 = r10
            r11 = r18
            r5 = r21
            r1 = r27
            r2 = r28
            goto L1e
        L345:
            r9 = r3
            r24 = r9
            r17 = r10
            r3 = r14
            r19 = r18
            r18 = r12
            goto L3d9
        L351:
            r9 = r3
            r2 = r13
            r3 = r14
            r1 = 49
            if (r11 > r1) goto L396
            r1 = r9
            r13 = r10
            long r9 = (long) r6
            r14 = r32
            r24 = r1
            r17 = r13
            r19 = r18
            r6 = r21
            r1 = r27
            r18 = r12
            r12 = r4
            r4 = r30
            r5 = r2
            r2 = r28
            int r7 = r0.parseRepeatedField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r13 = r5
            if (r7 == r3) goto L38e
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r3 = r7
            r6 = r8
            r8 = r17
            r12 = r18
        L384:
            r11 = r19
            r5 = r21
            r9 = r24
            r7 = r32
            goto L1e
        L38e:
            r9 = r26
            r2 = r7
        L391:
            r0 = r13
            r12 = r18
            goto L54
        L396:
            r13 = r2
            r22 = r4
            r24 = r9
            r17 = r10
            r9 = r11
            r19 = r18
            r18 = r12
            r0 = 50
            if (r9 != r0) goto L3dd
            r14 = 2
            if (r7 != r14) goto L3d9
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r5 = r8
            r6 = r22
            r8 = r32
            int r6 = r0.parseMapField(r1, r2, r3, r4, r5, r6, r8)
            r8 = r5
            if (r6 == r3) goto L3d5
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r7 = r32
            r3 = r6
            r6 = r8
            r8 = r17
            r12 = r18
            r11 = r19
            r5 = r21
        L3d1:
            r9 = r24
            goto L1e
        L3d5:
            r9 = r26
            r2 = r6
            goto L391
        L3d9:
            r9 = r26
            r2 = r3
            goto L391
        L3dd:
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r12 = r8
            r5 = r13
            r10 = r22
            r13 = r32
            r8 = r6
            r6 = r21
            int r7 = r0.parseOneofField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r9 = r0
            r0 = r5
            r8 = r12
            if (r7 == r3) goto L40b
            r1 = r27
            r2 = r28
            r4 = r30
            r3 = r7
            r6 = r8
            r7 = r13
            r8 = r17
            r12 = r18
            r11 = r19
            r5 = r21
            r13 = r0
            r0 = r9
            goto L3d1
        L40b:
            r2 = r7
            r12 = r18
        L40e:
            if (r0 != r15) goto L41e
            if (r15 == 0) goto L41e
            r6 = r27
            r7 = r30
            r13 = r0
            r8 = r2
        L418:
            r0 = r17
            r14 = 1048575(0xfffff, float:1.469367E-39)
            goto L466
        L41e:
            boolean r1 = r9.hasExtensions
            if (r1 == 0) goto L43e
            com.google.protobuf.ExtensionRegistryLite r1 = r13.extensionRegistry
            com.google.protobuf.ExtensionRegistryLite r3 = com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            if (r1 == r3) goto L43e
            com.google.protobuf.MessageLite r5 = r9.defaultInstance
            com.google.protobuf.UnknownFieldSchema<?, ?> r6 = r9.unknownFieldSchema
            r4 = r27
            r1 = r28
            r3 = r30
            r7 = r13
            int r2 = com.google.protobuf.ArrayDecoders.decodeExtensionOrUnknownField(r0, r1, r2, r3, r4, r5, r6, r7)
            r6 = r4
            r7 = r30
        L43c:
            r3 = r2
            goto L450
        L43e:
            r6 = r27
            com.google.protobuf.UnknownFieldSetLite r4 = getMutableUnknownFields(r6)
            r1 = r28
            r3 = r30
            r5 = r32
            int r2 = com.google.protobuf.ArrayDecoders.decodeUnknownField(r0, r1, r2, r3, r4, r5)
            r7 = r3
            goto L43c
        L450:
            r2 = r28
            r13 = r0
            r1 = r6
            r4 = r7
            r6 = r8
            r0 = r9
            r8 = r17
            goto L384
        L45b:
            r6 = r1
            r7 = r4
            r17 = r8
            r24 = r9
            r18 = r12
            r9 = r0
            r8 = r3
            goto L418
        L466:
            if (r0 == r14) goto L46e
            long r0 = (long) r0
            r2 = r24
            r2.putInt(r6, r0, r12)
        L46e:
            int r0 = r9.checkInitializedCount
            r1 = 0
            r10 = r0
            r3 = r1
        L473:
            int r0 = r9.repeatedFieldOffsetStart
            if (r10 >= r0) goto L48b
            int[] r0 = r9.intArray
            r2 = r0[r10]
            com.google.protobuf.UnknownFieldSchema<?, ?> r4 = r9.unknownFieldSchema
            r5 = r27
            r1 = r6
            r0 = r9
            java.lang.Object r2 = r0.filterMapUnknownEnumValues(r1, r2, r3, r4, r5)
            r3 = r2
            com.google.protobuf.UnknownFieldSetLite r3 = (com.google.protobuf.UnknownFieldSetLite) r3
            int r10 = r10 + 1
            goto L473
        L48b:
            r1 = r6
            r0 = r9
            if (r3 == 0) goto L494
            com.google.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            r2.setBuilderToMessage(r1, r3)
        L494:
            if (r15 != 0) goto L49e
            if (r8 != r7) goto L499
            goto L4a2
        L499:
            com.google.protobuf.InvalidProtocolBufferException r1 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r1
        L49e:
            if (r8 > r7) goto L4a3
            if (r13 != r15) goto L4a3
        L4a2:
            return r8
        L4a3:
            com.google.protobuf.InvalidProtocolBufferException r1 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r1
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T r3, com.google.protobuf.Writer r4) throws java.io.IOException {
            r2 = this;
            com.google.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            com.google.protobuf.Writer$FieldOrder r1 = com.google.protobuf.Writer.FieldOrder.DESCENDING
            if (r0 != r1) goto Lc
            r2.writeFieldsInDescendingOrder(r3, r4)
            return
        Lc:
            r2.writeFieldsInAscendingOrder(r3, r4)
            return
    }
}
