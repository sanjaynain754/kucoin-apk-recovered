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
public final class CandleViewConfig extends GeneratedMessageLite<CandleViewConfig, C12646b> implements MessageLiteOrBuilder {
    public static final int BULLISHCOLOR_FIELD_NUMBER = 2;
    private static final CandleViewConfig DEFAULT_INSTANCE;
    public static final int FALLCOLOR_FIELD_NUMBER = 3;
    public static final int HOLLOWCANDLE_FIELD_NUMBER = 1;
    private static volatile Parser<CandleViewConfig> PARSER = null;
    public static final int WATERMARKSTRING_FIELD_NUMBER = 4;
    private int bullishColor_;
    private int fallColor_;
    private int hollowCandle_;
    private String waterMarkString_ = "";

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleViewConfig$b */
    public static final class C12646b extends GeneratedMessageLite.Builder<CandleViewConfig, C12646b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12646b(C12645a c12645a) {
            this();
        }

        public C12646b() {
            super(CandleViewConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12646b m23919a(int i11) {
            copyOnWrite();
            ((CandleViewConfig) this.instance).setBullishColor(i11);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12646b m23920b(int i11) {
            copyOnWrite();
            ((CandleViewConfig) this.instance).setFallColor(i11);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12646b m23921c(SwitchType switchType) {
            copyOnWrite();
            ((CandleViewConfig) this.instance).setHollowCandle(switchType);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12646b m23922d(String str) {
            copyOnWrite();
            ((CandleViewConfig) this.instance).setWaterMarkString(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBullishColor() {
        this.bullishColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFallColor() {
        this.fallColor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHollowCandle() {
        this.hollowCandle_ = 0;
    }

    public static C12646b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CandleViewConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CandleViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleViewConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleViewConfig$a */
    public static /* synthetic */ class C12645a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22081a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22081a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22081a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22081a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22081a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22081a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22081a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22081a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CandleViewConfig candleViewConfig = new CandleViewConfig();
        DEFAULT_INSTANCE = candleViewConfig;
        GeneratedMessageLite.registerDefaultInstance(CandleViewConfig.class, candleViewConfig);
    }

    public static CandleViewConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12646b newBuilder(CandleViewConfig candleViewConfig) {
        return DEFAULT_INSTANCE.createBuilder(candleViewConfig);
    }

    public static CandleViewConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleViewConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CandleViewConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBullishColor(int i11) {
        this.bullishColor_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallColor(int i11) {
        this.fallColor_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHollowCandleValue(int i11) {
        this.hollowCandle_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12645a c12645a = null;
        switch (C12645a.f22081a[methodToInvoke.ordinal()]) {
            case 1:
                return new CandleViewConfig();
            case 2:
                return new C12646b(c12645a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"hollowCandle_", "bullishColor_", "fallColor_", "waterMarkString_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CandleViewConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CandleViewConfig.class) {
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

    public int getBullishColor() {
        return this.bullishColor_;
    }

    public int getFallColor() {
        return this.fallColor_;
    }

    public SwitchType getHollowCandle() {
        SwitchType switchTypeForNumber = SwitchType.forNumber(this.hollowCandle_);
        return switchTypeForNumber == null ? SwitchType.UNRECOGNIZED : switchTypeForNumber;
    }

    public int getHollowCandleValue() {
        return this.hollowCandle_;
    }

    public String getWaterMarkString() {
        return this.waterMarkString_;
    }

    public ByteString getWaterMarkStringBytes() {
        return ByteString.copyFromUtf8(this.waterMarkString_);
    }

    private CandleViewConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaterMarkString() {
        this.waterMarkString_ = getDefaultInstance().getWaterMarkString();
    }

    public static CandleViewConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHollowCandle(SwitchType switchType) {
        this.hollowCandle_ = switchType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaterMarkString(String str) {
        str.getClass();
        this.waterMarkString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaterMarkStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.waterMarkString_ = byteString.toStringUtf8();
    }

    public static CandleViewConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CandleViewConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CandleViewConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CandleViewConfig parseFrom(InputStream inputStream) throws IOException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleViewConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleViewConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CandleViewConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
