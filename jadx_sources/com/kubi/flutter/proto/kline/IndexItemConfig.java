package com.kubi.flutter.proto.kline;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p312hg.InterfaceC38195b;

/* JADX INFO: loaded from: classes13.dex */
public final class IndexItemConfig extends GeneratedMessageLite<IndexItemConfig, C12662b> implements InterfaceC38195b {
    private static final IndexItemConfig DEFAULT_INSTANCE;
    public static final int LINE_FIELD_NUMBER = 2;
    private static volatile Parser<IndexItemConfig> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 1;
    private LineConfig line_;
    private int period_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.IndexItemConfig$b */
    public static final class C12662b extends GeneratedMessageLite.Builder<IndexItemConfig, C12662b> implements InterfaceC38195b {
        public /* synthetic */ C12662b(C12661a c12661a) {
            this();
        }

        public C12662b() {
            super(IndexItemConfig.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLine() {
        this.line_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = 0;
    }

    public static C12662b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IndexItemConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IndexItemConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IndexItemConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.IndexItemConfig$a */
    public static /* synthetic */ class C12661a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22106a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22106a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22106a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22106a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22106a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22106a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22106a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22106a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        IndexItemConfig indexItemConfig = new IndexItemConfig();
        DEFAULT_INSTANCE = indexItemConfig;
        GeneratedMessageLite.registerDefaultInstance(IndexItemConfig.class, indexItemConfig);
    }

    public static IndexItemConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12662b newBuilder(IndexItemConfig indexItemConfig) {
        return DEFAULT_INSTANCE.createBuilder(indexItemConfig);
    }

    public static IndexItemConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IndexItemConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IndexItemConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<IndexItemConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriod(int i11) {
        this.period_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12661a c12661a = null;
        switch (C12661a.f22106a[methodToInvoke.ordinal()]) {
            case 1:
                return new IndexItemConfig();
            case 2:
                return new C12662b(c12661a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"period_", "line_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IndexItemConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IndexItemConfig.class) {
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

    public LineConfig getLine() {
        LineConfig lineConfig = this.line_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public int getPeriod() {
        return this.period_;
    }

    public boolean hasLine() {
        return this.line_ != null;
    }

    private IndexItemConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLine(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.line_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.line_ = LineConfig.newBuilder(this.line_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.line_ = lineConfig;
        }
    }

    public static IndexItemConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLine(LineConfig lineConfig) {
        lineConfig.getClass();
        this.line_ = lineConfig;
    }

    public static IndexItemConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IndexItemConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IndexItemConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IndexItemConfig parseFrom(InputStream inputStream) throws IOException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IndexItemConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IndexItemConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IndexItemConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IndexItemConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
