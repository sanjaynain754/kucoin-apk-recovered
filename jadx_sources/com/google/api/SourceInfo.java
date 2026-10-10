package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public final class SourceInfo extends GeneratedMessageLite<SourceInfo, Builder> implements SourceInfoOrBuilder {
    private static final SourceInfo DEFAULT_INSTANCE;
    private static volatile Parser<SourceInfo> PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Any> sourceFiles_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<SourceInfo, Builder> implements SourceInfoOrBuilder {
        public /* synthetic */ Builder(C78961 c78961) {
            this();
        }

        public Builder addSourceFiles(Any any) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles(any);
            return this;
        }

        public Builder setSourceFiles(int i11, Any any) {
            copyOnWrite();
            ((SourceInfo) this.instance).setSourceFiles(i11, any);
            return this;
        }

        private Builder() {
            super(SourceInfo.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public Any getSourceFiles(int i11) {
            return ((SourceInfo) this.instance).getSourceFiles(i11);
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public int getSourceFilesCount() {
            return ((SourceInfo) this.instance).getSourceFilesCount();
        }

        @Override // com.google.api.SourceInfoOrBuilder
        public List<Any> getSourceFilesList() {
            return Collections.unmodifiableList(((SourceInfo) this.instance).getSourceFilesList());
        }

        public Builder addAllSourceFiles(Iterable<? extends Any> iterable) {
            copyOnWrite();
            ((SourceInfo) this.instance).addAllSourceFiles(iterable);
            return this;
        }

        public Builder addSourceFiles(int i11, Any any) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles(i11, any);
            return this;
        }

        public Builder clearSourceFiles() {
            copyOnWrite();
            ((SourceInfo) this.instance).clearSourceFiles();
            return this;
        }

        public Builder removeSourceFiles(int i11) {
            copyOnWrite();
            ((SourceInfo) this.instance).removeSourceFiles(i11);
            return this;
        }

        public Builder setSourceFiles(int i11, Any.Builder builder) {
            copyOnWrite();
            ((SourceInfo) this.instance).setSourceFiles(i11, builder.build());
            return this;
        }

        public Builder addSourceFiles(Any.Builder builder) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles(builder.build());
            return this;
        }

        public Builder addSourceFiles(int i11, Any.Builder builder) {
            copyOnWrite();
            ((SourceInfo) this.instance).addSourceFiles(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(Any any) {
        any.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(any);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.SourceInfo$1 */
    public static /* synthetic */ class C78961 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12166xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12166xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12166xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12166xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12166xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12166xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12166xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12166xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        SourceInfo sourceInfo = new SourceInfo();
        DEFAULT_INSTANCE = sourceInfo;
        GeneratedMessageLite.registerDefaultInstance(SourceInfo.class, sourceInfo);
    }

    private void ensureSourceFilesIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.sourceFiles_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sourceFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(SourceInfo sourceInfo) {
        return DEFAULT_INSTANCE.createBuilder(sourceInfo);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<SourceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78961 c78961 = null;
        switch (C78961.f12166xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SourceInfo();
            case 2:
                return new Builder(c78961);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sourceFiles_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SourceInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SourceInfo.class) {
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

    @Override // com.google.api.SourceInfoOrBuilder
    public Any getSourceFiles(int i11) {
        return this.sourceFiles_.get(i11);
    }

    @Override // com.google.api.SourceInfoOrBuilder
    public int getSourceFilesCount() {
        return this.sourceFiles_.size();
    }

    @Override // com.google.api.SourceInfoOrBuilder
    public List<Any> getSourceFilesList() {
        return this.sourceFiles_;
    }

    public AnyOrBuilder getSourceFilesOrBuilder(int i11) {
        return this.sourceFiles_.get(i11);
    }

    public List<? extends AnyOrBuilder> getSourceFilesOrBuilderList() {
        return this.sourceFiles_;
    }

    private SourceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceFiles(Iterable<? extends Any> iterable) {
        ensureSourceFilesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sourceFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceFiles() {
        this.sourceFiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static SourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSourceFiles(int i11) {
        ensureSourceFilesIsMutable();
        this.sourceFiles_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceFiles(int i11, Any any) {
        any.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.set(i11, any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(int i11, Any any) {
        any.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(i11, any);
    }

    public static SourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
