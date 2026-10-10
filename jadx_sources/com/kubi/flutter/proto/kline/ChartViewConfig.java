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
public final class ChartViewConfig extends GeneratedMessageLite<ChartViewConfig, C12654b> implements MessageLiteOrBuilder {
    private static final ChartViewConfig DEFAULT_INSTANCE;
    public static final int ISLINEVIEW_FIELD_NUMBER = 1;
    public static final int MAINVIEW_FIELD_NUMBER = 2;
    private static volatile Parser<ChartViewConfig> PARSER = null;
    public static final int SUBVIEW_FIELD_NUMBER = 3;
    private int isLineView_;
    private MainIndexTypes mainView_;
    private SubIndexTypes subView_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChartViewConfig$b */
    public static final class C12654b extends GeneratedMessageLite.Builder<ChartViewConfig, C12654b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12654b(C12653a c12653a) {
            this();
        }

        public C12654b() {
            super(ChartViewConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12654b m23939a(SwitchType switchType) {
            copyOnWrite();
            ((ChartViewConfig) this.instance).setIsLineView(switchType);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12654b m23940b(MainIndexTypes mainIndexTypes) {
            copyOnWrite();
            ((ChartViewConfig) this.instance).setMainView(mainIndexTypes);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12654b m23941c(SubIndexTypes subIndexTypes) {
            copyOnWrite();
            ((ChartViewConfig) this.instance).setSubView(subIndexTypes);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLineView() {
        this.isLineView_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainView() {
        this.mainView_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubView() {
        this.subView_ = null;
    }

    public static C12654b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChartViewConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChartViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChartViewConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChartViewConfig$a */
    public static /* synthetic */ class C12653a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22093a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22093a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22093a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22093a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22093a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22093a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22093a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22093a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ChartViewConfig chartViewConfig = new ChartViewConfig();
        DEFAULT_INSTANCE = chartViewConfig;
        GeneratedMessageLite.registerDefaultInstance(ChartViewConfig.class, chartViewConfig);
    }

    public static ChartViewConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12654b newBuilder(ChartViewConfig chartViewConfig) {
        return DEFAULT_INSTANCE.createBuilder(chartViewConfig);
    }

    public static ChartViewConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChartViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChartViewConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ChartViewConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLineViewValue(int i11) {
        this.isLineView_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12653a c12653a = null;
        switch (C12653a.f22093a[methodToInvoke.ordinal()]) {
            case 1:
                return new ChartViewConfig();
            case 2:
                return new C12654b(c12653a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"isLineView_", "mainView_", "subView_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChartViewConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ChartViewConfig.class) {
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

    public SwitchType getIsLineView() {
        SwitchType switchTypeForNumber = SwitchType.forNumber(this.isLineView_);
        return switchTypeForNumber == null ? SwitchType.UNRECOGNIZED : switchTypeForNumber;
    }

    public int getIsLineViewValue() {
        return this.isLineView_;
    }

    public MainIndexTypes getMainView() {
        MainIndexTypes mainIndexTypes = this.mainView_;
        return mainIndexTypes == null ? MainIndexTypes.getDefaultInstance() : mainIndexTypes;
    }

    public SubIndexTypes getSubView() {
        SubIndexTypes subIndexTypes = this.subView_;
        return subIndexTypes == null ? SubIndexTypes.getDefaultInstance() : subIndexTypes;
    }

    public boolean hasMainView() {
        return this.mainView_ != null;
    }

    public boolean hasSubView() {
        return this.subView_ != null;
    }

    private ChartViewConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainView(MainIndexTypes mainIndexTypes) {
        mainIndexTypes.getClass();
        MainIndexTypes mainIndexTypes2 = this.mainView_;
        if (mainIndexTypes2 != null && mainIndexTypes2 != MainIndexTypes.getDefaultInstance()) {
            this.mainView_ = MainIndexTypes.newBuilder(this.mainView_).mergeFrom(mainIndexTypes).buildPartial();
        } else {
            this.mainView_ = mainIndexTypes;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubView(SubIndexTypes subIndexTypes) {
        subIndexTypes.getClass();
        SubIndexTypes subIndexTypes2 = this.subView_;
        if (subIndexTypes2 != null && subIndexTypes2 != SubIndexTypes.getDefaultInstance()) {
            this.subView_ = SubIndexTypes.newBuilder(this.subView_).mergeFrom(subIndexTypes).buildPartial();
        } else {
            this.subView_ = subIndexTypes;
        }
    }

    public static ChartViewConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLineView(SwitchType switchType) {
        this.isLineView_ = switchType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainView(MainIndexTypes mainIndexTypes) {
        mainIndexTypes.getClass();
        this.mainView_ = mainIndexTypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubView(SubIndexTypes subIndexTypes) {
        subIndexTypes.getClass();
        this.subView_ = subIndexTypes;
    }

    public static ChartViewConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChartViewConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChartViewConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChartViewConfig parseFrom(InputStream inputStream) throws IOException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChartViewConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChartViewConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChartViewConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChartViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
