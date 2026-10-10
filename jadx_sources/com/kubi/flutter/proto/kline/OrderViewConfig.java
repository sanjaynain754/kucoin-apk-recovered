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
public final class OrderViewConfig extends GeneratedMessageLite<OrderViewConfig, C12693b> implements MessageLiteOrBuilder {
    public static final int ACTIVE_FIELD_NUMBER = 2;
    private static final OrderViewConfig DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 1;
    private static volatile Parser<OrderViewConfig> PARSER;
    private int active_;
    private int history_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderViewConfig$b */
    public static final class C12693b extends GeneratedMessageLite.Builder<OrderViewConfig, C12693b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12693b(C12692a c12692a) {
            this();
        }

        public C12693b() {
            super(OrderViewConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12693b m23991a(SwitchType switchType) {
            copyOnWrite();
            ((OrderViewConfig) this.instance).setActive(switchType);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12693b m23992b(SwitchType switchType) {
            copyOnWrite();
            ((OrderViewConfig) this.instance).setHistory(switchType);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        this.active_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = 0;
    }

    public static C12693b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OrderViewConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OrderViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OrderViewConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderViewConfig$a */
    public static /* synthetic */ class C12692a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22156a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22156a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22156a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22156a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22156a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22156a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22156a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22156a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        OrderViewConfig orderViewConfig = new OrderViewConfig();
        DEFAULT_INSTANCE = orderViewConfig;
        GeneratedMessageLite.registerDefaultInstance(OrderViewConfig.class, orderViewConfig);
    }

    public static OrderViewConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12693b newBuilder(OrderViewConfig orderViewConfig) {
        return DEFAULT_INSTANCE.createBuilder(orderViewConfig);
    }

    public static OrderViewConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderViewConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OrderViewConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<OrderViewConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveValue(int i11) {
        this.active_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoryValue(int i11) {
        this.history_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12692a c12692a = null;
        switch (C12692a.f22156a[methodToInvoke.ordinal()]) {
            case 1:
                return new OrderViewConfig();
            case 2:
                return new C12693b(c12692a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"history_", "active_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OrderViewConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OrderViewConfig.class) {
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

    public SwitchType getActive() {
        SwitchType switchTypeForNumber = SwitchType.forNumber(this.active_);
        return switchTypeForNumber == null ? SwitchType.UNRECOGNIZED : switchTypeForNumber;
    }

    public int getActiveValue() {
        return this.active_;
    }

    public SwitchType getHistory() {
        SwitchType switchTypeForNumber = SwitchType.forNumber(this.history_);
        return switchTypeForNumber == null ? SwitchType.UNRECOGNIZED : switchTypeForNumber;
    }

    public int getHistoryValue() {
        return this.history_;
    }

    private OrderViewConfig() {
    }

    public static OrderViewConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(SwitchType switchType) {
        this.active_ = switchType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(SwitchType switchType) {
        this.history_ = switchType.getNumber();
    }

    public static OrderViewConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OrderViewConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OrderViewConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OrderViewConfig parseFrom(InputStream inputStream) throws IOException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OrderViewConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OrderViewConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OrderViewConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderViewConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
