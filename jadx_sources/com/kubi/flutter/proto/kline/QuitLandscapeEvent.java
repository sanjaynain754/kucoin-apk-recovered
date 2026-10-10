package com.kubi.flutter.proto.kline;

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
public final class QuitLandscapeEvent extends GeneratedMessageLite<QuitLandscapeEvent, C12701b> implements MessageLiteOrBuilder {
    private static final QuitLandscapeEvent DEFAULT_INSTANCE;
    private static volatile Parser<QuitLandscapeEvent> PARSER;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.QuitLandscapeEvent$b */
    public static final class C12701b extends GeneratedMessageLite.Builder<QuitLandscapeEvent, C12701b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12701b(C12700a c12700a) {
            this();
        }

        public C12701b() {
            super(QuitLandscapeEvent.DEFAULT_INSTANCE);
        }
    }

    public static C12701b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QuitLandscapeEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuitLandscapeEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.QuitLandscapeEvent$a */
    public static /* synthetic */ class C12700a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22168a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22168a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22168a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22168a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22168a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22168a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22168a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22168a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        QuitLandscapeEvent quitLandscapeEvent = new QuitLandscapeEvent();
        DEFAULT_INSTANCE = quitLandscapeEvent;
        GeneratedMessageLite.registerDefaultInstance(QuitLandscapeEvent.class, quitLandscapeEvent);
    }

    public static QuitLandscapeEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12701b newBuilder(QuitLandscapeEvent quitLandscapeEvent) {
        return DEFAULT_INSTANCE.createBuilder(quitLandscapeEvent);
    }

    public static QuitLandscapeEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuitLandscapeEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<QuitLandscapeEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12700a c12700a = null;
        switch (C12700a.f22168a[methodToInvoke.ordinal()]) {
            case 1:
                return new QuitLandscapeEvent();
            case 2:
                return new C12701b(c12700a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QuitLandscapeEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (QuitLandscapeEvent.class) {
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

    private QuitLandscapeEvent() {
    }

    public static QuitLandscapeEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QuitLandscapeEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QuitLandscapeEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QuitLandscapeEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QuitLandscapeEvent parseFrom(InputStream inputStream) throws IOException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuitLandscapeEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QuitLandscapeEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QuitLandscapeEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuitLandscapeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
