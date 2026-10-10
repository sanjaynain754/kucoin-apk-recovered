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
public final class JumpOrderEvent extends GeneratedMessageLite<JumpOrderEvent, C12664b> implements MessageLiteOrBuilder {
    private static final JumpOrderEvent DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile Parser<JumpOrderEvent> PARSER;
    private OrderItem item_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.JumpOrderEvent$b */
    public static final class C12664b extends GeneratedMessageLite.Builder<JumpOrderEvent, C12664b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12664b(C12663a c12663a) {
            this();
        }

        public C12664b() {
            super(JumpOrderEvent.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.item_ = null;
    }

    public static C12664b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static JumpOrderEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JumpOrderEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JumpOrderEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.JumpOrderEvent$a */
    public static /* synthetic */ class C12663a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22109a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22109a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22109a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22109a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22109a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22109a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22109a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22109a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        JumpOrderEvent jumpOrderEvent = new JumpOrderEvent();
        DEFAULT_INSTANCE = jumpOrderEvent;
        GeneratedMessageLite.registerDefaultInstance(JumpOrderEvent.class, jumpOrderEvent);
    }

    public static JumpOrderEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12664b newBuilder(JumpOrderEvent jumpOrderEvent) {
        return DEFAULT_INSTANCE.createBuilder(jumpOrderEvent);
    }

    public static JumpOrderEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JumpOrderEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JumpOrderEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<JumpOrderEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12663a c12663a = null;
        switch (C12663a.f22109a[methodToInvoke.ordinal()]) {
            case 1:
                return new JumpOrderEvent();
            case 2:
                return new C12664b(c12663a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"item_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JumpOrderEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (JumpOrderEvent.class) {
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

    public OrderItem getItem() {
        OrderItem orderItem = this.item_;
        return orderItem == null ? OrderItem.getDefaultInstance() : orderItem;
    }

    public boolean hasItem() {
        return this.item_ != null;
    }

    private JumpOrderEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeItem(OrderItem orderItem) {
        orderItem.getClass();
        OrderItem orderItem2 = this.item_;
        if (orderItem2 != null && orderItem2 != OrderItem.getDefaultInstance()) {
            this.item_ = OrderItem.newBuilder(this.item_).mergeFrom(orderItem).buildPartial();
        } else {
            this.item_ = orderItem;
        }
    }

    public static JumpOrderEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItem(OrderItem orderItem) {
        orderItem.getClass();
        this.item_ = orderItem;
    }

    public static JumpOrderEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static JumpOrderEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JumpOrderEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static JumpOrderEvent parseFrom(InputStream inputStream) throws IOException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JumpOrderEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static JumpOrderEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static JumpOrderEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JumpOrderEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
