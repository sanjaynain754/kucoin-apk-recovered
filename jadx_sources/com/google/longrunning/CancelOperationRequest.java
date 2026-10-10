package com.google.longrunning;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class CancelOperationRequest extends GeneratedMessageLite<CancelOperationRequest, Builder> implements CancelOperationRequestOrBuilder {
    private static final CancelOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<CancelOperationRequest> PARSER;
    private String name_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<CancelOperationRequest, Builder> implements CancelOperationRequestOrBuilder {
        public /* synthetic */ Builder(C90211 c90211) {
            this();
        }

        private Builder() {
            super(CancelOperationRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.longrunning.CancelOperationRequestOrBuilder
        public String getName() {
            return ((CancelOperationRequest) this.instance).getName();
        }

        @Override // com.google.longrunning.CancelOperationRequestOrBuilder
        public ByteString getNameBytes() {
            return ((CancelOperationRequest) this.instance).getNameBytes();
        }

        public Builder clearName() {
            copyOnWrite();
            ((CancelOperationRequest) this.instance).clearName();
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((CancelOperationRequest) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((CancelOperationRequest) this.instance).setNameBytes(byteString);
            return this;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CancelOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CancelOperationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CancelOperationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.longrunning.CancelOperationRequest$1 */
    public static /* synthetic */ class C90211 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12718xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12718xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12718xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12718xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12718xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12718xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12718xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12718xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CancelOperationRequest cancelOperationRequest = new CancelOperationRequest();
        DEFAULT_INSTANCE = cancelOperationRequest;
        GeneratedMessageLite.registerDefaultInstance(CancelOperationRequest.class, cancelOperationRequest);
    }

    public static CancelOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(CancelOperationRequest cancelOperationRequest) {
        return DEFAULT_INSTANCE.createBuilder(cancelOperationRequest);
    }

    public static CancelOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CancelOperationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CancelOperationRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C90211 c90211 = null;
        switch (C90211.f12718xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CancelOperationRequest();
            case 2:
                return new Builder(c90211);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CancelOperationRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CancelOperationRequest.class) {
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

    @Override // com.google.longrunning.CancelOperationRequestOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.longrunning.CancelOperationRequestOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    private CancelOperationRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static CancelOperationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public static CancelOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CancelOperationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(InputStream inputStream) throws IOException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CancelOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CancelOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CancelOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
