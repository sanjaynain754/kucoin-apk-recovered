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
public final class DataSourceConfig extends GeneratedMessageLite<DataSourceConfig, C12658b> implements MessageLiteOrBuilder {
    private static final DataSourceConfig DEFAULT_INSTANCE;
    private static volatile Parser<DataSourceConfig> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 1;
    public static final int PRECISION_FIELD_NUMBER = 2;
    private int period_;
    private int precision_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.DataSourceConfig$b */
    public static final class C12658b extends GeneratedMessageLite.Builder<DataSourceConfig, C12658b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12658b(C12657a c12657a) {
            this();
        }

        public C12658b() {
            super(DataSourceConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12658b m23946a(int i11) {
            copyOnWrite();
            ((DataSourceConfig) this.instance).setPeriod(i11);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12658b m23947b(int i11) {
            copyOnWrite();
            ((DataSourceConfig) this.instance).setPrecision(i11);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrecision() {
        this.precision_ = 0;
    }

    public static C12658b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataSourceConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataSourceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataSourceConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.DataSourceConfig$a */
    public static /* synthetic */ class C12657a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22099a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22099a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22099a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22099a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22099a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22099a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22099a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22099a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        DEFAULT_INSTANCE = dataSourceConfig;
        GeneratedMessageLite.registerDefaultInstance(DataSourceConfig.class, dataSourceConfig);
    }

    public static DataSourceConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12658b newBuilder(DataSourceConfig dataSourceConfig) {
        return DEFAULT_INSTANCE.createBuilder(dataSourceConfig);
    }

    public static DataSourceConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataSourceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataSourceConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<DataSourceConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriod(int i11) {
        this.period_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecision(int i11) {
        this.precision_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12657a c12657a = null;
        switch (C12657a.f22099a[methodToInvoke.ordinal()]) {
            case 1:
                return new DataSourceConfig();
            case 2:
                return new C12658b(c12657a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"period_", "precision_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataSourceConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (DataSourceConfig.class) {
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

    public int getPeriod() {
        return this.period_;
    }

    public int getPrecision() {
        return this.precision_;
    }

    private DataSourceConfig() {
    }

    public static DataSourceConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataSourceConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataSourceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataSourceConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataSourceConfig parseFrom(InputStream inputStream) throws IOException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataSourceConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataSourceConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataSourceConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataSourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
