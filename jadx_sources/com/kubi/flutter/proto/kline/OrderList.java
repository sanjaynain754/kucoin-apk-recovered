package com.kubi.flutter.proto.kline;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class OrderList extends GeneratedMessageLite<OrderList, C12691b> implements MessageLiteOrBuilder {
    private static final OrderList DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    public static final int ORDERTYPE_FIELD_NUMBER = 1;
    private static volatile Parser<OrderList> PARSER;
    private Internal.ProtobufList<OrderItem> items_ = GeneratedMessageLite.emptyProtobufList();
    private int orderType_;

    public enum OrderType implements Internal.EnumLite {
        ORDER_HISTORY(0),
        ORDER_ACTIVE(1),
        UNRECOGNIZED(-1);

        public static final int ORDER_ACTIVE_VALUE = 1;
        public static final int ORDER_HISTORY_VALUE = 0;

        /* JADX INFO: renamed from: b */
        public static final Internal.EnumLiteMap<OrderType> f22150b = new C12688a();
        private final int value;

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderList$OrderType$a */
        public class C12688a implements Internal.EnumLiteMap<OrderType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public OrderType findValueByNumber(int i11) {
                return OrderType.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderList$OrderType$b */
        public static final class C12689b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a */
            public static final Internal.EnumVerifier f22152a = new C12689b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                if (OrderType.forNumber(i11) != null) {
                    return true;
                }
                return false;
            }
        }

        public static OrderType forNumber(int i11) {
            if (i11 == 0) {
                return ORDER_HISTORY;
            }
            if (i11 != 1) {
                return null;
            }
            return ORDER_ACTIVE;
        }

        public static Internal.EnumLiteMap<OrderType> internalGetValueMap() {
            return f22150b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C12689b.f22152a;
        }

        @Deprecated
        public static OrderType valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        OrderType(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderList$b */
    public static final class C12691b extends GeneratedMessageLite.Builder<OrderList, C12691b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12691b(C12690a c12690a) {
            this();
        }

        public C12691b() {
            super(OrderList.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: b */
        public List<OrderItem> m23985b() {
            return Collections.unmodifiableList(((OrderList) this.instance).getItemsList());
        }

        /* JADX INFO: renamed from: a */
        public C12691b m23984a(Iterable<? extends OrderItem> iterable) {
            copyOnWrite();
            ((OrderList) this.instance).addAllItems(iterable);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12691b m23986c(OrderType orderType) {
            copyOnWrite();
            ((OrderList) this.instance).setOrderType(orderType);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(OrderItem orderItem) {
        orderItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(orderItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderType() {
        this.orderType_ = 0;
    }

    public static C12691b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OrderList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OrderList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OrderList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderList$a */
    public static /* synthetic */ class C12690a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22153a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22153a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22153a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22153a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22153a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22153a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22153a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22153a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        OrderList orderList = new OrderList();
        DEFAULT_INSTANCE = orderList;
        GeneratedMessageLite.registerDefaultInstance(OrderList.class, orderList);
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<OrderItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static OrderList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12691b newBuilder(OrderList orderList) {
        return DEFAULT_INSTANCE.createBuilder(orderList);
    }

    public static OrderList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OrderList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<OrderList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderTypeValue(int i11) {
        this.orderType_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12690a c12690a = null;
        switch (C12690a.f22153a[methodToInvoke.ordinal()]) {
            case 1:
                return new OrderList();
            case 2:
                return new C12691b(c12690a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"orderType_", "items_", OrderItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OrderList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OrderList.class) {
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

    public OrderItem getItems(int i11) {
        return this.items_.get(i11);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<OrderItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC12736a getItemsOrBuilder(int i11) {
        return this.items_.get(i11);
    }

    public List<? extends InterfaceC12736a> getItemsOrBuilderList() {
        return this.items_;
    }

    public OrderType getOrderType() {
        OrderType orderTypeForNumber = OrderType.forNumber(this.orderType_);
        return orderTypeForNumber == null ? OrderType.UNRECOGNIZED : orderTypeForNumber;
    }

    public int getOrderTypeValue() {
        return this.orderType_;
    }

    private OrderList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends OrderItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static OrderList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i11) {
        ensureItemsIsMutable();
        this.items_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, OrderItem orderItem) {
        orderItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i11, orderItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderType(OrderType orderType) {
        this.orderType_ = orderType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i11, OrderItem orderItem) {
        orderItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i11, orderItem);
    }

    public static OrderList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OrderList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OrderList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OrderList parseFrom(InputStream inputStream) throws IOException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OrderList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OrderList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OrderList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
