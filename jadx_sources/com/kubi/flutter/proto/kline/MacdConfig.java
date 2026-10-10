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
public final class MacdConfig extends GeneratedMessageLite<MacdConfig, C12672b> implements MessageLiteOrBuilder {
    public static final int DEA_FIELD_NUMBER = 5;
    private static final MacdConfig DEFAULT_INSTANCE;
    public static final int DIF_FIELD_NUMBER = 4;
    public static final int LONGPERIOD_FIELD_NUMBER = 2;
    public static final int MAPERIOD_FIELD_NUMBER = 3;
    private static volatile Parser<MacdConfig> PARSER = null;
    public static final int SHORTPERIOD_FIELD_NUMBER = 1;
    private LineConfig dea_;
    private LineConfig dif_;
    private int longPeriod_;
    private int maPeriod_;
    private int shortPeriod_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MacdConfig$b */
    public static final class C12672b extends GeneratedMessageLite.Builder<MacdConfig, C12672b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12672b(C12671a c12671a) {
            this();
        }

        public C12672b() {
            super(MacdConfig.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDea() {
        this.dea_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDif() {
        this.dif_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongPeriod() {
        this.longPeriod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaPeriod() {
        this.maPeriod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortPeriod() {
        this.shortPeriod_ = 0;
    }

    public static C12672b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MacdConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MacdConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MacdConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MacdConfig$a */
    public static /* synthetic */ class C12671a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22124a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22124a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22124a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22124a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22124a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22124a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22124a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22124a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        MacdConfig macdConfig = new MacdConfig();
        DEFAULT_INSTANCE = macdConfig;
        GeneratedMessageLite.registerDefaultInstance(MacdConfig.class, macdConfig);
    }

    public static MacdConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12672b newBuilder(MacdConfig macdConfig) {
        return DEFAULT_INSTANCE.createBuilder(macdConfig);
    }

    public static MacdConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MacdConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MacdConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<MacdConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongPeriod(int i11) {
        this.longPeriod_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaPeriod(int i11) {
        this.maPeriod_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortPeriod(int i11) {
        this.shortPeriod_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12671a c12671a = null;
        switch (C12671a.f22124a[methodToInvoke.ordinal()]) {
            case 1:
                return new MacdConfig();
            case 2:
                return new C12672b(c12671a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\t\u0005\t", new Object[]{"shortPeriod_", "longPeriod_", "maPeriod_", "dif_", "dea_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MacdConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MacdConfig.class) {
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

    public LineConfig getDea() {
        LineConfig lineConfig = this.dea_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public LineConfig getDif() {
        LineConfig lineConfig = this.dif_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public int getLongPeriod() {
        return this.longPeriod_;
    }

    public int getMaPeriod() {
        return this.maPeriod_;
    }

    public int getShortPeriod() {
        return this.shortPeriod_;
    }

    public boolean hasDea() {
        return this.dea_ != null;
    }

    public boolean hasDif() {
        return this.dif_ != null;
    }

    private MacdConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDea(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.dea_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.dea_ = LineConfig.newBuilder(this.dea_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.dea_ = lineConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDif(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.dif_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.dif_ = LineConfig.newBuilder(this.dif_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.dif_ = lineConfig;
        }
    }

    public static MacdConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDea(LineConfig lineConfig) {
        lineConfig.getClass();
        this.dea_ = lineConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDif(LineConfig lineConfig) {
        lineConfig.getClass();
        this.dif_ = lineConfig;
    }

    public static MacdConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MacdConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MacdConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MacdConfig parseFrom(InputStream inputStream) throws IOException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MacdConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MacdConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MacdConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MacdConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
