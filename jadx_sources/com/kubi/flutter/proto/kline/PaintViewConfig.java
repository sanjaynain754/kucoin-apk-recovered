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
public final class PaintViewConfig extends GeneratedMessageLite<PaintViewConfig, C12699b> implements MessageLiteOrBuilder {
    public static final int COINPAIRCODE_FIELD_NUMBER = 4;
    private static final PaintViewConfig DEFAULT_INSTANCE;
    public static final int DROPSHAPETYPE_FIELD_NUMBER = 3;
    public static final int FROMTYPE_FIELD_NUMBER = 1;
    private static volatile Parser<PaintViewConfig> PARSER = null;
    public static final int TOOBARCLICK_FIELD_NUMBER = 2;
    private String coinPairCode_ = "";
    private int dropShapeType_;
    private int fromType_;
    private ToolBarClick tooBarClick_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.PaintViewConfig$b */
    public static final class C12699b extends GeneratedMessageLite.Builder<PaintViewConfig, C12699b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12699b(C12698a c12698a) {
            this();
        }

        public C12699b() {
            super(PaintViewConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12699b m23998a(String str) {
            copyOnWrite();
            ((PaintViewConfig) this.instance).setCoinPairCode(str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12699b m23999b(AlertClickType alertClickType) {
            copyOnWrite();
            ((PaintViewConfig) this.instance).setDropShapeType(alertClickType);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12699b m24000c(PaintFromType paintFromType) {
            copyOnWrite();
            ((PaintViewConfig) this.instance).setFromType(paintFromType);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12699b m24001d(ToolBarClick toolBarClick) {
            copyOnWrite();
            ((PaintViewConfig) this.instance).setTooBarClick(toolBarClick);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDropShapeType() {
        this.dropShapeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromType() {
        this.fromType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTooBarClick() {
        this.tooBarClick_ = null;
    }

    public static C12699b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PaintViewConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PaintViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaintViewConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.PaintViewConfig$a */
    public static /* synthetic */ class C12698a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22165a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22165a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22165a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22165a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22165a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22165a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22165a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22165a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        PaintViewConfig paintViewConfig = new PaintViewConfig();
        DEFAULT_INSTANCE = paintViewConfig;
        GeneratedMessageLite.registerDefaultInstance(PaintViewConfig.class, paintViewConfig);
    }

    public static PaintViewConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12699b newBuilder(PaintViewConfig paintViewConfig) {
        return DEFAULT_INSTANCE.createBuilder(paintViewConfig);
    }

    public static PaintViewConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaintViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaintViewConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<PaintViewConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDropShapeTypeValue(int i11) {
        this.dropShapeType_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromTypeValue(int i11) {
        this.fromType_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12698a c12698a = null;
        switch (C12698a.f22165a[methodToInvoke.ordinal()]) {
            case 1:
                return new PaintViewConfig();
            case 2:
                return new C12699b(c12698a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\t\u0003\f\u0004Ȉ", new Object[]{"fromType_", "tooBarClick_", "dropShapeType_", "coinPairCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PaintViewConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PaintViewConfig.class) {
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

    public String getCoinPairCode() {
        return this.coinPairCode_;
    }

    public ByteString getCoinPairCodeBytes() {
        return ByteString.copyFromUtf8(this.coinPairCode_);
    }

    public AlertClickType getDropShapeType() {
        AlertClickType alertClickTypeForNumber = AlertClickType.forNumber(this.dropShapeType_);
        return alertClickTypeForNumber == null ? AlertClickType.UNRECOGNIZED : alertClickTypeForNumber;
    }

    public int getDropShapeTypeValue() {
        return this.dropShapeType_;
    }

    public PaintFromType getFromType() {
        PaintFromType paintFromTypeForNumber = PaintFromType.forNumber(this.fromType_);
        return paintFromTypeForNumber == null ? PaintFromType.UNRECOGNIZED : paintFromTypeForNumber;
    }

    public int getFromTypeValue() {
        return this.fromType_;
    }

    public ToolBarClick getTooBarClick() {
        ToolBarClick toolBarClick = this.tooBarClick_;
        return toolBarClick == null ? ToolBarClick.getDefaultInstance() : toolBarClick;
    }

    public boolean hasTooBarClick() {
        return this.tooBarClick_ != null;
    }

    private PaintViewConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoinPairCode() {
        this.coinPairCode_ = getDefaultInstance().getCoinPairCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTooBarClick(ToolBarClick toolBarClick) {
        toolBarClick.getClass();
        ToolBarClick toolBarClick2 = this.tooBarClick_;
        if (toolBarClick2 != null && toolBarClick2 != ToolBarClick.getDefaultInstance()) {
            this.tooBarClick_ = ToolBarClick.newBuilder(this.tooBarClick_).mergeFrom(toolBarClick).buildPartial();
        } else {
            this.tooBarClick_ = toolBarClick;
        }
    }

    public static PaintViewConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinPairCode(String str) {
        str.getClass();
        this.coinPairCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoinPairCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coinPairCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDropShapeType(AlertClickType alertClickType) {
        this.dropShapeType_ = alertClickType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromType(PaintFromType paintFromType) {
        this.fromType_ = paintFromType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTooBarClick(ToolBarClick toolBarClick) {
        toolBarClick.getClass();
        this.tooBarClick_ = toolBarClick;
    }

    public static PaintViewConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PaintViewConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PaintViewConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PaintViewConfig parseFrom(InputStream inputStream) throws IOException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaintViewConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaintViewConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PaintViewConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaintViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
