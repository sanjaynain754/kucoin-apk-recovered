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
public final class BollConfig extends GeneratedMessageLite<BollConfig, C12638b> implements MessageLiteOrBuilder {
    public static final int BANDWIDTH_FIELD_NUMBER = 2;
    private static final BollConfig DEFAULT_INSTANCE;
    public static final int DN_FIELD_NUMBER = 5;
    public static final int MB_FIELD_NUMBER = 4;
    private static volatile Parser<BollConfig> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 1;
    public static final int UP_FIELD_NUMBER = 3;
    private int bandWidth_;
    private LineConfig dn_;
    private LineConfig mb_;
    private int period_;
    private LineConfig up_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.BollConfig$b */
    public static final class C12638b extends GeneratedMessageLite.Builder<BollConfig, C12638b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12638b(C12637a c12637a) {
            this();
        }

        public C12638b() {
            super(BollConfig.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBandWidth() {
        this.bandWidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDn() {
        this.dn_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMb() {
        this.mb_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUp() {
        this.up_ = null;
    }

    public static C12638b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BollConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BollConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BollConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.BollConfig$a */
    public static /* synthetic */ class C12637a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22069a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22069a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22069a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22069a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22069a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22069a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22069a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22069a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        BollConfig bollConfig = new BollConfig();
        DEFAULT_INSTANCE = bollConfig;
        GeneratedMessageLite.registerDefaultInstance(BollConfig.class, bollConfig);
    }

    public static BollConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12638b newBuilder(BollConfig bollConfig) {
        return DEFAULT_INSTANCE.createBuilder(bollConfig);
    }

    public static BollConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BollConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BollConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<BollConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBandWidth(int i11) {
        this.bandWidth_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriod(int i11) {
        this.period_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12637a c12637a = null;
        switch (C12637a.f22069a[methodToInvoke.ordinal()]) {
            case 1:
                return new BollConfig();
            case 2:
                return new C12638b(c12637a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\t\u0004\t\u0005\t", new Object[]{"period_", "bandWidth_", "up_", "mb_", "dn_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BollConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BollConfig.class) {
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

    public int getBandWidth() {
        return this.bandWidth_;
    }

    public LineConfig getDn() {
        LineConfig lineConfig = this.dn_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public LineConfig getMb() {
        LineConfig lineConfig = this.mb_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public int getPeriod() {
        return this.period_;
    }

    public LineConfig getUp() {
        LineConfig lineConfig = this.up_;
        return lineConfig == null ? LineConfig.getDefaultInstance() : lineConfig;
    }

    public boolean hasDn() {
        return this.dn_ != null;
    }

    public boolean hasMb() {
        return this.mb_ != null;
    }

    public boolean hasUp() {
        return this.up_ != null;
    }

    private BollConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDn(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.dn_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.dn_ = LineConfig.newBuilder(this.dn_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.dn_ = lineConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMb(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.mb_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.mb_ = LineConfig.newBuilder(this.mb_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.mb_ = lineConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUp(LineConfig lineConfig) {
        lineConfig.getClass();
        LineConfig lineConfig2 = this.up_;
        if (lineConfig2 != null && lineConfig2 != LineConfig.getDefaultInstance()) {
            this.up_ = LineConfig.newBuilder(this.up_).mergeFrom(lineConfig).buildPartial();
        } else {
            this.up_ = lineConfig;
        }
    }

    public static BollConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDn(LineConfig lineConfig) {
        lineConfig.getClass();
        this.dn_ = lineConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMb(LineConfig lineConfig) {
        lineConfig.getClass();
        this.mb_ = lineConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUp(LineConfig lineConfig) {
        lineConfig.getClass();
        this.up_ = lineConfig;
    }

    public static BollConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BollConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BollConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BollConfig parseFrom(InputStream inputStream) throws IOException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BollConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BollConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BollConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BollConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
