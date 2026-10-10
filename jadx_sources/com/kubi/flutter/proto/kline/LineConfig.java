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
public final class LineConfig extends GeneratedMessageLite<LineConfig, C12668b> implements MessageLiteOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final LineConfig DEFAULT_INSTANCE;
    private static volatile Parser<LineConfig> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int color_;
    private int width_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.LineConfig$b */
    public static final class C12668b extends GeneratedMessageLite.Builder<LineConfig, C12668b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12668b(C12667a c12667a) {
            this();
        }

        public C12668b() {
            super(LineConfig.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static C12668b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LineConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LineConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LineConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.LineConfig$a */
    public static /* synthetic */ class C12667a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22118a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22118a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22118a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22118a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22118a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22118a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22118a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22118a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        LineConfig lineConfig = new LineConfig();
        DEFAULT_INSTANCE = lineConfig;
        GeneratedMessageLite.registerDefaultInstance(LineConfig.class, lineConfig);
    }

    public static LineConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12668b newBuilder(LineConfig lineConfig) {
        return DEFAULT_INSTANCE.createBuilder(lineConfig);
    }

    public static LineConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LineConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LineConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<LineConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i11) {
        this.color_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i11) {
        this.width_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12667a c12667a = null;
        switch (C12667a.f22118a[methodToInvoke.ordinal()]) {
            case 1:
                return new LineConfig();
            case 2:
                return new C12668b(c12667a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0004", new Object[]{"color_", "width_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LineConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LineConfig.class) {
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

    public int getColor() {
        return this.color_;
    }

    public int getWidth() {
        return this.width_;
    }

    private LineConfig() {
    }

    public static LineConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LineConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LineConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LineConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LineConfig parseFrom(InputStream inputStream) throws IOException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LineConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LineConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LineConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LineConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
