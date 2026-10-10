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
public final class ChartSetupConfig extends GeneratedMessageLite<ChartSetupConfig, C12652b> implements MessageLiteOrBuilder {
    public static final int CANDLEVIEW_FIELD_NUMBER = 1;
    private static final ChartSetupConfig DEFAULT_INSTANCE;
    public static final int MAININDEX_FIELD_NUMBER = 2;
    public static final int ORDERVIEW_FIELD_NUMBER = 6;
    private static volatile Parser<ChartSetupConfig> PARSER = null;
    public static final int SELECTPAD_FIELD_NUMBER = 5;
    public static final int SUBINDEX_FIELD_NUMBER = 4;
    public static final int VOLUME_FIELD_NUMBER = 3;
    private CandleViewConfig candleView_;
    private MainIndexConfig mainIndex_;
    private OrderViewConfig orderView_;
    private SelectPadConfig selectPad_;
    private SubIndexConfig subIndex_;
    private VolumeConfig volume_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChartSetupConfig$b */
    public static final class C12652b extends GeneratedMessageLite.Builder<ChartSetupConfig, C12652b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12652b(C12651a c12651a) {
            this();
        }

        public C12652b() {
            super(ChartSetupConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12652b m23930a(CandleViewConfig candleViewConfig) {
            copyOnWrite();
            ((ChartSetupConfig) this.instance).setCandleView(candleViewConfig);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12652b m23931b(OrderViewConfig orderViewConfig) {
            copyOnWrite();
            ((ChartSetupConfig) this.instance).setOrderView(orderViewConfig);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12652b m23932c(SelectPadConfig selectPadConfig) {
            copyOnWrite();
            ((ChartSetupConfig) this.instance).setSelectPad(selectPadConfig);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12652b m23933d(VolumeConfig volumeConfig) {
            copyOnWrite();
            ((ChartSetupConfig) this.instance).setVolume(volumeConfig);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCandleView() {
        this.candleView_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainIndex() {
        this.mainIndex_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderView() {
        this.orderView_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectPad() {
        this.selectPad_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubIndex() {
        this.subIndex_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVolume() {
        this.volume_ = null;
    }

    public static C12652b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChartSetupConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChartSetupConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChartSetupConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChartSetupConfig$a */
    public static /* synthetic */ class C12651a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22090a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22090a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22090a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22090a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22090a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22090a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22090a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22090a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ChartSetupConfig chartSetupConfig = new ChartSetupConfig();
        DEFAULT_INSTANCE = chartSetupConfig;
        GeneratedMessageLite.registerDefaultInstance(ChartSetupConfig.class, chartSetupConfig);
    }

    public static ChartSetupConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12652b newBuilder(ChartSetupConfig chartSetupConfig) {
        return DEFAULT_INSTANCE.createBuilder(chartSetupConfig);
    }

    public static ChartSetupConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChartSetupConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChartSetupConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ChartSetupConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12651a c12651a = null;
        switch (C12651a.f22090a[methodToInvoke.ordinal()]) {
            case 1:
                return new ChartSetupConfig();
            case 2:
                return new C12652b(c12651a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t", new Object[]{"candleView_", "mainIndex_", "volume_", "subIndex_", "selectPad_", "orderView_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChartSetupConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ChartSetupConfig.class) {
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

    public CandleViewConfig getCandleView() {
        CandleViewConfig candleViewConfig = this.candleView_;
        return candleViewConfig == null ? CandleViewConfig.getDefaultInstance() : candleViewConfig;
    }

    public MainIndexConfig getMainIndex() {
        MainIndexConfig mainIndexConfig = this.mainIndex_;
        return mainIndexConfig == null ? MainIndexConfig.getDefaultInstance() : mainIndexConfig;
    }

    public OrderViewConfig getOrderView() {
        OrderViewConfig orderViewConfig = this.orderView_;
        return orderViewConfig == null ? OrderViewConfig.getDefaultInstance() : orderViewConfig;
    }

    public SelectPadConfig getSelectPad() {
        SelectPadConfig selectPadConfig = this.selectPad_;
        return selectPadConfig == null ? SelectPadConfig.getDefaultInstance() : selectPadConfig;
    }

    public SubIndexConfig getSubIndex() {
        SubIndexConfig subIndexConfig = this.subIndex_;
        return subIndexConfig == null ? SubIndexConfig.getDefaultInstance() : subIndexConfig;
    }

    public VolumeConfig getVolume() {
        VolumeConfig volumeConfig = this.volume_;
        return volumeConfig == null ? VolumeConfig.getDefaultInstance() : volumeConfig;
    }

    public boolean hasCandleView() {
        return this.candleView_ != null;
    }

    public boolean hasMainIndex() {
        return this.mainIndex_ != null;
    }

    public boolean hasOrderView() {
        return this.orderView_ != null;
    }

    public boolean hasSelectPad() {
        return this.selectPad_ != null;
    }

    public boolean hasSubIndex() {
        return this.subIndex_ != null;
    }

    public boolean hasVolume() {
        return this.volume_ != null;
    }

    private ChartSetupConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCandleView(CandleViewConfig candleViewConfig) {
        candleViewConfig.getClass();
        CandleViewConfig candleViewConfig2 = this.candleView_;
        if (candleViewConfig2 != null && candleViewConfig2 != CandleViewConfig.getDefaultInstance()) {
            this.candleView_ = CandleViewConfig.newBuilder(this.candleView_).mergeFrom(candleViewConfig).buildPartial();
        } else {
            this.candleView_ = candleViewConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainIndex(MainIndexConfig mainIndexConfig) {
        mainIndexConfig.getClass();
        MainIndexConfig mainIndexConfig2 = this.mainIndex_;
        if (mainIndexConfig2 != null && mainIndexConfig2 != MainIndexConfig.getDefaultInstance()) {
            this.mainIndex_ = MainIndexConfig.newBuilder(this.mainIndex_).mergeFrom(mainIndexConfig).buildPartial();
        } else {
            this.mainIndex_ = mainIndexConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrderView(OrderViewConfig orderViewConfig) {
        orderViewConfig.getClass();
        OrderViewConfig orderViewConfig2 = this.orderView_;
        if (orderViewConfig2 != null && orderViewConfig2 != OrderViewConfig.getDefaultInstance()) {
            this.orderView_ = OrderViewConfig.newBuilder(this.orderView_).mergeFrom(orderViewConfig).buildPartial();
        } else {
            this.orderView_ = orderViewConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectPad(SelectPadConfig selectPadConfig) {
        selectPadConfig.getClass();
        SelectPadConfig selectPadConfig2 = this.selectPad_;
        if (selectPadConfig2 != null && selectPadConfig2 != SelectPadConfig.getDefaultInstance()) {
            this.selectPad_ = SelectPadConfig.newBuilder(this.selectPad_).mergeFrom(selectPadConfig).buildPartial();
        } else {
            this.selectPad_ = selectPadConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubIndex(SubIndexConfig subIndexConfig) {
        subIndexConfig.getClass();
        SubIndexConfig subIndexConfig2 = this.subIndex_;
        if (subIndexConfig2 != null && subIndexConfig2 != SubIndexConfig.getDefaultInstance()) {
            this.subIndex_ = SubIndexConfig.newBuilder(this.subIndex_).mergeFrom(subIndexConfig).buildPartial();
        } else {
            this.subIndex_ = subIndexConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVolume(VolumeConfig volumeConfig) {
        volumeConfig.getClass();
        VolumeConfig volumeConfig2 = this.volume_;
        if (volumeConfig2 != null && volumeConfig2 != VolumeConfig.getDefaultInstance()) {
            this.volume_ = VolumeConfig.newBuilder(this.volume_).mergeFrom(volumeConfig).buildPartial();
        } else {
            this.volume_ = volumeConfig;
        }
    }

    public static ChartSetupConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandleView(CandleViewConfig candleViewConfig) {
        candleViewConfig.getClass();
        this.candleView_ = candleViewConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainIndex(MainIndexConfig mainIndexConfig) {
        mainIndexConfig.getClass();
        this.mainIndex_ = mainIndexConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderView(OrderViewConfig orderViewConfig) {
        orderViewConfig.getClass();
        this.orderView_ = orderViewConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectPad(SelectPadConfig selectPadConfig) {
        selectPadConfig.getClass();
        this.selectPad_ = selectPadConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubIndex(SubIndexConfig subIndexConfig) {
        subIndexConfig.getClass();
        this.subIndex_ = subIndexConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolume(VolumeConfig volumeConfig) {
        volumeConfig.getClass();
        this.volume_ = volumeConfig;
    }

    public static ChartSetupConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChartSetupConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChartSetupConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChartSetupConfig parseFrom(InputStream inputStream) throws IOException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChartSetupConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChartSetupConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChartSetupConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChartSetupConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
