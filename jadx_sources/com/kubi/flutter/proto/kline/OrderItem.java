package com.kubi.flutter.proto.kline;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class OrderItem extends GeneratedMessageLite<OrderItem, C12687b> implements InterfaceC12736a {
    public static final int AMOUNT_FIELD_NUMBER = 3;
    public static final int BIZTYPE_FIELD_NUMBER = 8;
    private static final OrderItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NEEDJUMP_FIELD_NUMBER = 10;
    private static volatile Parser<OrderItem> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 4;
    public static final int SHOWSYMBOL_FIELD_NUMBER = 6;
    public static final int SIDE_FIELD_NUMBER = 7;
    public static final int SPOTPRICETYPE_FIELD_NUMBER = 9;
    public static final int SYMBOL_FIELD_NUMBER = 5;
    public static final int TIME_FIELD_NUMBER = 2;
    private double amount_;
    private int bizType_;
    private boolean needJump_;
    private Object priceType_;
    private double price_;
    private int side_;
    private long time_;
    private int priceTypeCase_ = 0;
    private String id_ = "";
    private String symbol_ = "";
    private String showSymbol_ = "";

    public enum BizType implements Internal.EnumLite {
        BIZ_SPOT(0),
        BIZ_CROSS_MARGIN(1),
        BIZ_ISOLATED_MARGIN(2),
        BIZ_FUTURES(3),
        UNRECOGNIZED(-1);

        public static final int BIZ_CROSS_MARGIN_VALUE = 1;
        public static final int BIZ_FUTURES_VALUE = 3;
        public static final int BIZ_ISOLATED_MARGIN_VALUE = 2;
        public static final int BIZ_SPOT_VALUE = 0;

        /* JADX INFO: renamed from: b */
        public static final Internal.EnumLiteMap<BizType> f22137b = new C12680a();
        private final int value;

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$BizType$a */
        public class C12680a implements Internal.EnumLiteMap<BizType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public BizType findValueByNumber(int i11) {
                return BizType.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$BizType$b */
        public static final class C12681b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a */
            public static final Internal.EnumVerifier f22139a = new C12681b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                if (BizType.forNumber(i11) != null) {
                    return true;
                }
                return false;
            }
        }

        public static BizType forNumber(int i11) {
            if (i11 == 0) {
                return BIZ_SPOT;
            }
            if (i11 == 1) {
                return BIZ_CROSS_MARGIN;
            }
            if (i11 == 2) {
                return BIZ_ISOLATED_MARGIN;
            }
            if (i11 != 3) {
                return null;
            }
            return BIZ_FUTURES;
        }

        public static Internal.EnumLiteMap<BizType> internalGetValueMap() {
            return f22137b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C12681b.f22139a;
        }

        @Deprecated
        public static BizType valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        BizType(int i11) {
            this.value = i11;
        }
    }

    public enum OrderSide implements Internal.EnumLite {
        BUY_LONG(0),
        SELL_SHORT(1),
        UNRECOGNIZED(-1);

        public static final int BUY_LONG_VALUE = 0;
        public static final int SELL_SHORT_VALUE = 1;

        /* JADX INFO: renamed from: b */
        public static final Internal.EnumLiteMap<OrderSide> f22140b = new C12682a();
        private final int value;

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$OrderSide$a */
        public class C12682a implements Internal.EnumLiteMap<OrderSide> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public OrderSide findValueByNumber(int i11) {
                return OrderSide.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$OrderSide$b */
        public static final class C12683b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a */
            public static final Internal.EnumVerifier f22142a = new C12683b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                if (OrderSide.forNumber(i11) != null) {
                    return true;
                }
                return false;
            }
        }

        public static OrderSide forNumber(int i11) {
            if (i11 == 0) {
                return BUY_LONG;
            }
            if (i11 != 1) {
                return null;
            }
            return SELL_SHORT;
        }

        public static Internal.EnumLiteMap<OrderSide> internalGetValueMap() {
            return f22140b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C12683b.f22142a;
        }

        @Deprecated
        public static OrderSide valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        OrderSide(int i11) {
            this.value = i11;
        }
    }

    public enum PriceTypeCase {
        SPOTPRICETYPE(9),
        PRICETYPE_NOT_SET(0);

        private final int value;

        public static PriceTypeCase forNumber(int i11) {
            if (i11 == 0) {
                return PRICETYPE_NOT_SET;
            }
            if (i11 != 9) {
                return null;
            }
            return SPOTPRICETYPE;
        }

        @Deprecated
        public static PriceTypeCase valueOf(int i11) {
            return forNumber(i11);
        }

        public int getNumber() {
            return this.value;
        }

        PriceTypeCase(int i11) {
            this.value = i11;
        }
    }

    public enum SpotPriceType implements Internal.EnumLite {
        SPOT_UNSPECIFIC(0),
        SPOT_LIMIT(1),
        SPOT_MARKET(2),
        SPOT_LIMIT_STOP(3),
        SPOT_MARKET_STOP(4),
        SPOT_LIMIT_OCO(5),
        SPOT_LIMIT_TSO(6),
        UNRECOGNIZED(-1);

        public static final int SPOT_LIMIT_OCO_VALUE = 5;
        public static final int SPOT_LIMIT_STOP_VALUE = 3;
        public static final int SPOT_LIMIT_TSO_VALUE = 6;
        public static final int SPOT_LIMIT_VALUE = 1;
        public static final int SPOT_MARKET_STOP_VALUE = 4;
        public static final int SPOT_MARKET_VALUE = 2;
        public static final int SPOT_UNSPECIFIC_VALUE = 0;

        /* JADX INFO: renamed from: b */
        public static final Internal.EnumLiteMap<SpotPriceType> f22144b = new C12684a();
        private final int value;

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$SpotPriceType$a */
        public class C12684a implements Internal.EnumLiteMap<SpotPriceType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SpotPriceType findValueByNumber(int i11) {
                return SpotPriceType.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$SpotPriceType$b */
        public static final class C12685b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a */
            public static final Internal.EnumVerifier f22146a = new C12685b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                if (SpotPriceType.forNumber(i11) != null) {
                    return true;
                }
                return false;
            }
        }

        public static Internal.EnumLiteMap<SpotPriceType> internalGetValueMap() {
            return f22144b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C12685b.f22146a;
        }

        @Deprecated
        public static SpotPriceType valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        SpotPriceType(int i11) {
            this.value = i11;
        }

        public static SpotPriceType forNumber(int i11) {
            switch (i11) {
                case 0:
                    return SPOT_UNSPECIFIC;
                case 1:
                    return SPOT_LIMIT;
                case 2:
                    return SPOT_MARKET;
                case 3:
                    return SPOT_LIMIT_STOP;
                case 4:
                    return SPOT_MARKET_STOP;
                case 5:
                    return SPOT_LIMIT_OCO;
                case 6:
                    return SPOT_LIMIT_TSO;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$b */
    public static final class C12687b extends GeneratedMessageLite.Builder<OrderItem, C12687b> implements InterfaceC12736a {
        public /* synthetic */ C12687b(C12686a c12686a) {
            this();
        }

        public C12687b() {
            super(OrderItem.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12687b m23967a(double d11) {
            copyOnWrite();
            ((OrderItem) this.instance).setAmount(d11);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12687b m23968b(BizType bizType) {
            copyOnWrite();
            ((OrderItem) this.instance).setBizType(bizType);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12687b m23969c(boolean z11) {
            copyOnWrite();
            ((OrderItem) this.instance).setNeedJump(z11);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12687b m23970d(double d11) {
            copyOnWrite();
            ((OrderItem) this.instance).setPrice(d11);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C12687b m23971e(OrderSide orderSide) {
            copyOnWrite();
            ((OrderItem) this.instance).setSide(orderSide);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C12687b m23972f(String str) {
            copyOnWrite();
            ((OrderItem) this.instance).setSymbol(str);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C12687b m23973g(long j11) {
            copyOnWrite();
            ((OrderItem) this.instance).setTime(j11);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizType() {
        this.bizType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedJump() {
        this.needJump_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceType() {
        this.priceTypeCase_ = 0;
        this.priceType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSide() {
        this.side_ = 0;
    }

    public static C12687b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OrderItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OrderItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OrderItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.OrderItem$a */
    public static /* synthetic */ class C12686a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22147a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22147a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22147a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22147a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22147a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22147a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22147a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22147a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        OrderItem orderItem = new OrderItem();
        DEFAULT_INSTANCE = orderItem;
        GeneratedMessageLite.registerDefaultInstance(OrderItem.class, orderItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmount() {
        this.amount_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpotPriceType() {
        if (this.priceTypeCase_ == 9) {
            this.priceTypeCase_ = 0;
            this.priceType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    public static OrderItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12687b newBuilder(OrderItem orderItem) {
        return DEFAULT_INSTANCE.createBuilder(orderItem);
    }

    public static OrderItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OrderItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<OrderItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmount(double d11) {
        this.amount_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizTypeValue(int i11) {
        this.bizType_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedJump(boolean z11) {
        this.needJump_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(double d11) {
        this.price_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSideValue(int i11) {
        this.side_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpotPriceTypeValue(int i11) {
        this.priceTypeCase_ = 9;
        this.priceType_ = Integer.valueOf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j11) {
        this.time_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12686a c12686a = null;
        switch (C12686a.f22147a[methodToInvoke.ordinal()]) {
            case 1:
                return new OrderItem();
            case 2:
                return new C12687b(c12686a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\u0000\u0004\u0000\u0005Ȉ\u0006Ȉ\u0007\f\b\f\t?\u0000\n\u0007", new Object[]{"priceType_", "priceTypeCase_", "id_", "time_", "amount_", "price_", "symbol_", "showSymbol_", "side_", "bizType_", "needJump_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OrderItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OrderItem.class) {
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

    public double getAmount() {
        return this.amount_;
    }

    public BizType getBizType() {
        BizType bizTypeForNumber = BizType.forNumber(this.bizType_);
        return bizTypeForNumber == null ? BizType.UNRECOGNIZED : bizTypeForNumber;
    }

    public int getBizTypeValue() {
        return this.bizType_;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public boolean getNeedJump() {
        return this.needJump_;
    }

    public double getPrice() {
        return this.price_;
    }

    public PriceTypeCase getPriceTypeCase() {
        return PriceTypeCase.forNumber(this.priceTypeCase_);
    }

    public String getShowSymbol() {
        return this.showSymbol_;
    }

    public ByteString getShowSymbolBytes() {
        return ByteString.copyFromUtf8(this.showSymbol_);
    }

    public OrderSide getSide() {
        OrderSide orderSideForNumber = OrderSide.forNumber(this.side_);
        return orderSideForNumber == null ? OrderSide.UNRECOGNIZED : orderSideForNumber;
    }

    public int getSideValue() {
        return this.side_;
    }

    public SpotPriceType getSpotPriceType() {
        if (this.priceTypeCase_ != 9) {
            return SpotPriceType.SPOT_UNSPECIFIC;
        }
        SpotPriceType spotPriceTypeForNumber = SpotPriceType.forNumber(((Integer) this.priceType_).intValue());
        return spotPriceTypeForNumber == null ? SpotPriceType.UNRECOGNIZED : spotPriceTypeForNumber;
    }

    public int getSpotPriceTypeValue() {
        if (this.priceTypeCase_ == 9) {
            return ((Integer) this.priceType_).intValue();
        }
        return 0;
    }

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    public long getTime() {
        return this.time_;
    }

    public boolean hasSpotPriceType() {
        return this.priceTypeCase_ == 9;
    }

    private OrderItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowSymbol() {
        this.showSymbol_ = getDefaultInstance().getShowSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    public static OrderItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizType(BizType bizType) {
        this.bizType_ = bizType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowSymbol(String str) {
        str.getClass();
        this.showSymbol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowSymbolBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.showSymbol_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSide(OrderSide orderSide) {
        this.side_ = orderSide.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpotPriceType(SpotPriceType spotPriceType) {
        this.priceType_ = Integer.valueOf(spotPriceType.getNumber());
        this.priceTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymbol(String str) {
        str.getClass();
        this.symbol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymbolBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.symbol_ = byteString.toStringUtf8();
    }

    public static OrderItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OrderItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OrderItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OrderItem parseFrom(InputStream inputStream) throws IOException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OrderItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OrderItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OrderItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrderItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
