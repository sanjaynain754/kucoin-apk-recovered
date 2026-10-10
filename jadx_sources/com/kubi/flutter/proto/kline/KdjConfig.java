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
public final class KdjConfig extends GeneratedMessageLite<KdjConfig, C12666b> implements MessageLiteOrBuilder {
    private static final KdjConfig DEFAULT_INSTANCE;
    public static final int D_FIELD_NUMBER = 5;
    public static final int J_FIELD_NUMBER = 6;
    public static final int K_FIELD_NUMBER = 4;
    public static final int MAPERIOD1_FIELD_NUMBER = 2;
    public static final int MAPERIOD2_FIELD_NUMBER = 3;
    private static volatile Parser<KdjConfig> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 1;

    /* JADX INFO: renamed from: d_ */
    private LineConfig f22112d_;

    /* JADX INFO: renamed from: j_ */
    private LineConfig f22113j_;

    /* JADX INFO: renamed from: k_ */
    private LineConfig f22114k_;
    private int maPeriod1_;
    private int maPeriod2_;
    private int period_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.KdjConfig$b */
    public static final class C12666b extends GeneratedMessageLite.Builder<KdjConfig, C12666b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12666b(C12665a c12665a) {
            this();
        }

        public C12666b() {
            super(KdjConfig.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD() {
        this.f22112d_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJ() {
        this.f22113j_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearK() {
        this.f22114k_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaPeriod1() {
        this.maPeriod1_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaPeriod2() {
        this.maPeriod2_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = 0;
    }

    public static C12666b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KdjConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KdjConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KdjConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.KdjConfig$a */
    public static /* synthetic */ class C12665a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22115a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22115a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22115a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22115a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22115a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22115a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22115a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22115a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        KdjConfig kdjConfig = new KdjConfig();
        DEFAULT_INSTANCE = kdjConfig;
        GeneratedMessageLite.registerDefaultInstance(KdjConfig.class, kdjConfig);
    }

    public static KdjConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12666b newBuilder(KdjConfig kdjConfig) {
        return DEFAULT_INSTANCE.createBuilder(kdjConfig);
    }

    public static KdjConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KdjConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KdjConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<KdjConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaPeriod1(int i11) {
        this.maPeriod1_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaPeriod2(int i11) {
        this.maPeriod2_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriod(int i11) {
        this.period_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12665a c12665a = null;
        switch (C12665a.f22115a[methodToInvoke.ordinal()]) {
            case 1:
                return new KdjConfig();
            case 2:
                return new C12666b(c12665a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\t\u0005\t\u0006\t", new Object[]{"period_", "maPeriod1_", "maPeriod2_", "k_", "d_", "j_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KdjConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (KdjConfig.class) {
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

    public LineConfig getD() {
        LineConfig lineConfig = this.f22112d_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public LineConfig getJ() {
        LineConfig lineConfig = this.f22113j_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public LineConfig getK() {
        LineConfig lineConfig = this.f22114k_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public int getMaPeriod1() {
        return this.maPeriod1_;
    }

    public int getMaPeriod2() {
        return this.maPeriod2_;
    }

    public int getPeriod() {
        return this.period_;
    }

    public boolean hasD() {
        return this.f22112d_ != null;
    }

    public boolean hasJ() {
        return this.f22113j_ != null;
    }

    public boolean hasK() {
        return this.f22114k_ != null;
    }

    private KdjConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeD(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.f22112d_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.f22112d_ = LineConfig.newBuilder(this.f22112d_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.f22112d_ = lineConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJ(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.f22113j_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.f22113j_ = LineConfig.newBuilder(this.f22113j_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.f22113j_ = lineConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeK(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.f22114k_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.f22114k_ = LineConfig.newBuilder(this.f22114k_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.f22114k_ = lineConfig;
        }
    }

    public static KdjConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD(LineConfig lineConfig) {
        lineConfig.getClass();
        this.f22112d_ = lineConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJ(LineConfig lineConfig) {
        lineConfig.getClass();
        this.f22113j_ = lineConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setK(LineConfig lineConfig) {
        lineConfig.getClass();
        this.f22114k_ = lineConfig;
    }

    public static KdjConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KdjConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KdjConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KdjConfig parseFrom(InputStream inputStream) throws IOException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KdjConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KdjConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KdjConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KdjConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
