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
public final class ViewControl extends GeneratedMessageLite<ViewControl, C12733b> implements MessageLiteOrBuilder {
    private static final ViewControl DEFAULT_INSTANCE;
    public static final int PAINTCONFIG_FIELD_NUMBER = 4;
    private static volatile Parser<ViewControl> PARSER = null;
    public static final int SETUPCONFIG_FIELD_NUMBER = 2;
    public static final int SOURCECONFIG_FIELD_NUMBER = 1;
    public static final int VIEWCONFIG_FIELD_NUMBER = 3;
    private PaintViewConfig paintConfig_;
    private ChartSetupConfig setupConfig_;
    private DataSourceConfig sourceConfig_;
    private ChartViewConfig viewConfig_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ViewControl$b */
    public static final class C12733b extends GeneratedMessageLite.Builder<ViewControl, C12733b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12733b(C12732a c12732a) {
            this();
        }

        public C12733b() {
            super(ViewControl.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12733b m24052a(PaintViewConfig paintViewConfig) {
            copyOnWrite();
            ((ViewControl) this.instance).setPaintConfig(paintViewConfig);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12733b m24053b(ChartSetupConfig chartSetupConfig) {
            copyOnWrite();
            ((ViewControl) this.instance).setSetupConfig(chartSetupConfig);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12733b m24054c(DataSourceConfig dataSourceConfig) {
            copyOnWrite();
            ((ViewControl) this.instance).setSourceConfig(dataSourceConfig);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12733b m24055d(ChartViewConfig chartViewConfig) {
            copyOnWrite();
            ((ViewControl) this.instance).setViewConfig(chartViewConfig);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaintConfig() {
        this.paintConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetupConfig() {
        this.setupConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceConfig() {
        this.sourceConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewConfig() {
        this.viewConfig_ = null;
    }

    public static C12733b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ViewControl$a */
    public static /* synthetic */ class C12732a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22216a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22216a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22216a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22216a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22216a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22216a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22216a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22216a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ViewControl viewControl = new ViewControl();
        DEFAULT_INSTANCE = viewControl;
        GeneratedMessageLite.registerDefaultInstance(ViewControl.class, viewControl);
    }

    public static ViewControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12733b newBuilder(ViewControl viewControl) {
        return DEFAULT_INSTANCE.createBuilder(viewControl);
    }

    public static ViewControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ViewControl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12732a c12732a = null;
        switch (C12732a.f22216a[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewControl();
            case 2:
                return new C12733b(c12732a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"sourceConfig_", "setupConfig_", "viewConfig_", "paintConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewControl> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ViewControl.class) {
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

    public PaintViewConfig getPaintConfig() {
        PaintViewConfig paintViewConfig = this.paintConfig_;
        return paintViewConfig == null ? PaintViewConfig.getDefaultInstance() : paintViewConfig;
    }

    public ChartSetupConfig getSetupConfig() {
        ChartSetupConfig chartSetupConfig = this.setupConfig_;
        return chartSetupConfig == null ? ChartSetupConfig.getDefaultInstance() : chartSetupConfig;
    }

    public DataSourceConfig getSourceConfig() {
        DataSourceConfig dataSourceConfig = this.sourceConfig_;
        return dataSourceConfig == null ? DataSourceConfig.getDefaultInstance() : dataSourceConfig;
    }

    public ChartViewConfig getViewConfig() {
        ChartViewConfig chartViewConfig = this.viewConfig_;
        return chartViewConfig == null ? ChartViewConfig.getDefaultInstance() : chartViewConfig;
    }

    public boolean hasPaintConfig() {
        return this.paintConfig_ != null;
    }

    public boolean hasSetupConfig() {
        return this.setupConfig_ != null;
    }

    public boolean hasSourceConfig() {
        return this.sourceConfig_ != null;
    }

    public boolean hasViewConfig() {
        return this.viewConfig_ != null;
    }

    private ViewControl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePaintConfig(PaintViewConfig paintViewConfig) {
        paintViewConfig.getClass();
        PaintViewConfig paintViewConfig2 = this.paintConfig_;
        if (paintViewConfig2 != null && paintViewConfig2 != PaintViewConfig.getDefaultInstance()) {
            this.paintConfig_ = PaintViewConfig.newBuilder(this.paintConfig_).mergeFrom(paintViewConfig).buildPartial();
        } else {
            this.paintConfig_ = paintViewConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetupConfig(ChartSetupConfig chartSetupConfig) {
        chartSetupConfig.getClass();
        ChartSetupConfig chartSetupConfig2 = this.setupConfig_;
        if (chartSetupConfig2 != null && chartSetupConfig2 != ChartSetupConfig.getDefaultInstance()) {
            this.setupConfig_ = ChartSetupConfig.newBuilder(this.setupConfig_).mergeFrom(chartSetupConfig).buildPartial();
        } else {
            this.setupConfig_ = chartSetupConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceConfig(DataSourceConfig dataSourceConfig) {
        dataSourceConfig.getClass();
        DataSourceConfig dataSourceConfig2 = this.sourceConfig_;
        if (dataSourceConfig2 != null && dataSourceConfig2 != DataSourceConfig.getDefaultInstance()) {
            this.sourceConfig_ = DataSourceConfig.newBuilder(this.sourceConfig_).mergeFrom(dataSourceConfig).buildPartial();
        } else {
            this.sourceConfig_ = dataSourceConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewConfig(ChartViewConfig chartViewConfig) {
        chartViewConfig.getClass();
        ChartViewConfig chartViewConfig2 = this.viewConfig_;
        if (chartViewConfig2 != null && chartViewConfig2 != ChartViewConfig.getDefaultInstance()) {
            this.viewConfig_ = ChartViewConfig.newBuilder(this.viewConfig_).mergeFrom(chartViewConfig).buildPartial();
        } else {
            this.viewConfig_ = chartViewConfig;
        }
    }

    public static ViewControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintConfig(PaintViewConfig paintViewConfig) {
        paintViewConfig.getClass();
        this.paintConfig_ = paintViewConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetupConfig(ChartSetupConfig chartSetupConfig) {
        chartSetupConfig.getClass();
        this.setupConfig_ = chartSetupConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceConfig(DataSourceConfig dataSourceConfig) {
        dataSourceConfig.getClass();
        this.sourceConfig_ = dataSourceConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewConfig(ChartViewConfig chartViewConfig) {
        chartViewConfig.getClass();
        this.viewConfig_ = chartViewConfig;
    }

    public static ViewControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewControl parseFrom(InputStream inputStream) throws IOException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewControl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
