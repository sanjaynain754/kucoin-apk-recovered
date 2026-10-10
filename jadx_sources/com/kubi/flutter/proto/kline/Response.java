package com.kubi.flutter.proto.kline;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class Response extends GeneratedMessageLite<Response, C12705b> implements MessageLiteOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Response DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Response> PARSER;
    private int bodyCase_ = 0;
    private Object body_;
    private int code_;

    public enum BodyCase {
        MESSAGE(2),
        BODY_NOT_SET(0);

        private final int value;

        public static BodyCase forNumber(int i11) {
            if (i11 == 0) {
                return BODY_NOT_SET;
            }
            if (i11 != 2) {
                return null;
            }
            return MESSAGE;
        }

        @Deprecated
        public static BodyCase valueOf(int i11) {
            return forNumber(i11);
        }

        public int getNumber() {
            return this.value;
        }

        BodyCase(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.Response$b */
    public static final class C12705b extends GeneratedMessageLite.Builder<Response, C12705b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12705b(C12704a c12704a) {
            this();
        }

        public C12705b() {
            super(Response.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12705b m24016a(int i11) {
            copyOnWrite();
            ((Response) this.instance).setCode(i11);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12705b m24017b(String str) {
            copyOnWrite();
            ((Response) this.instance).setMessage(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.bodyCase_ = 0;
        this.body_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static C12705b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.Response$a */
    public static /* synthetic */ class C12704a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22176a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22176a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22176a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22176a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22176a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22176a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22176a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22176a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Response response = new Response();
        DEFAULT_INSTANCE = response;
        GeneratedMessageLite.registerDefaultInstance(Response.class, response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        if (this.bodyCase_ == 2) {
            this.bodyCase_ = 0;
            this.body_ = null;
        }
    }

    public static Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12705b newBuilder(Response response) {
        return DEFAULT_INSTANCE.createBuilder(response);
    }

    public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Response> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i11) {
        this.code_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12704a c12704a = null;
        switch (C12704a.f22176a[methodToInvoke.ordinal()]) {
            case 1:
                return new Response();
            case 2:
                return new C12705b(c12704a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȼ\u0000", new Object[]{"body_", "bodyCase_", "code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Response> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Response.class) {
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

    public BodyCase getBodyCase() {
        return BodyCase.forNumber(this.bodyCase_);
    }

    public int getCode() {
        return this.code_;
    }

    public String getMessage() {
        return this.bodyCase_ == 2 ? (String) this.body_ : "";
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.bodyCase_ == 2 ? (String) this.body_ : "");
    }

    public boolean hasMessage() {
        return this.bodyCase_ == 2;
    }

    private Response() {
    }

    public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.bodyCase_ = 2;
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.body_ = byteString.toStringUtf8();
        this.bodyCase_ = 2;
    }

    public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Response parseFrom(InputStream inputStream) throws IOException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Response parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
