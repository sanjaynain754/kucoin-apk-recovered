package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
        public /* synthetic */ Builder(C24211 c24211) {
            this();
        }

        private Builder() {
            super(FieldMask.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public String getPaths(int i11) {
            return ((FieldMask) this.instance).getPaths(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public ByteString getPathsBytes(int i11) {
            return ((FieldMask) this.instance).getPathsBytes(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
            return ((FieldMask) this.instance).getPathsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public List<String> getPathsList() {
            return Collections.unmodifiableList(((FieldMask) this.instance).getPathsList());
        }

        public Builder addAllPaths(Iterable<String> iterable) {
            copyOnWrite();
            ((FieldMask) this.instance).addAllPaths(iterable);
            return this;
        }

        public Builder addPaths(String str) {
            copyOnWrite();
            ((FieldMask) this.instance).addPaths(str);
            return this;
        }

        public Builder addPathsBytes(ByteString byteString) {
            copyOnWrite();
            ((FieldMask) this.instance).addPathsBytes(byteString);
            return this;
        }

        public Builder clearPaths() {
            copyOnWrite();
            ((FieldMask) this.instance).clearPaths();
            return this;
        }

        public Builder setPaths(int i11, String str) {
            copyOnWrite();
            ((FieldMask) this.instance).setPaths(i11, str);
            return this;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldMask$1 */
    public static /* synthetic */ class C24211 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f2671xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f2671xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2671xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2671xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2671xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2671xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2671xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2671xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        GeneratedMessageLite.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private void ensurePathsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.paths_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paths_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(FieldMask fieldMask) {
        return DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<FieldMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C24211 c24211 = null;
        switch (C24211.f2671xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FieldMask();
            case 2:
                return new Builder(c24211);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FieldMask> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FieldMask.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public String getPaths(int i11) {
        return this.paths_.get(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public ByteString getPathsBytes(int i11) {
        return ByteString.copyFromUtf8(this.paths_.get(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public List<String> getPathsList() {
        return this.paths_;
    }

    private FieldMask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        AbstractMessageLite.addAll(iterable, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePathsIsMutable();
        this.paths_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static FieldMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int i11, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i11, str);
    }

    public static FieldMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FieldMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
