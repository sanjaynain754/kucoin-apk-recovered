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
public final class ConfirmAlerEvent extends GeneratedMessageLite<ConfirmAlerEvent, C12656b> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final ConfirmAlerEvent DEFAULT_INSTANCE;
    private static volatile Parser<ConfirmAlerEvent> PARSER;
    private String content_ = "";

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ConfirmAlerEvent$b */
    public static final class C12656b extends GeneratedMessageLite.Builder<ConfirmAlerEvent, C12656b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12656b(C12655a c12655a) {
            this();
        }

        public C12656b() {
            super(ConfirmAlerEvent.DEFAULT_INSTANCE);
        }
    }

    public static C12656b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfirmAlerEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfirmAlerEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ConfirmAlerEvent$a */
    public static /* synthetic */ class C12655a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22096a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22096a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22096a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22096a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22096a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22096a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22096a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22096a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ConfirmAlerEvent confirmAlerEvent = new ConfirmAlerEvent();
        DEFAULT_INSTANCE = confirmAlerEvent;
        GeneratedMessageLite.registerDefaultInstance(ConfirmAlerEvent.class, confirmAlerEvent);
    }

    public static ConfirmAlerEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12656b newBuilder(ConfirmAlerEvent confirmAlerEvent) {
        return DEFAULT_INSTANCE.createBuilder(confirmAlerEvent);
    }

    public static ConfirmAlerEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfirmAlerEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ConfirmAlerEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12655a c12655a = null;
        switch (C12655a.f22096a[methodToInvoke.ordinal()]) {
            case 1:
                return new ConfirmAlerEvent();
            case 2:
                return new C12656b(c12655a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ConfirmAlerEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ConfirmAlerEvent.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    private ConfirmAlerEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    public static ConfirmAlerEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    public static ConfirmAlerEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConfirmAlerEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfirmAlerEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ConfirmAlerEvent parseFrom(InputStream inputStream) throws IOException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfirmAlerEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfirmAlerEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConfirmAlerEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfirmAlerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
