package com.futures.tradebiz.core.model.p063pb;

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

/* JADX INFO: loaded from: classes45.dex */
public final class TradeStatisticsPb extends GeneratedMessageLite<TradeStatisticsPb, C6653b> implements MessageLiteOrBuilder {
    private static final TradeStatisticsPb DEFAULT_INSTANCE;
    public static final int FUNDING_RATE_FIELD_NUMBER = 7;
    public static final int HIGH_PRICE_FIELD_NUMBER = 6;
    public static final int LAST_PRICE_FIELD_NUMBER = 4;
    public static final int LOW_PRICE_FIELD_NUMBER = 5;
    private static volatile Parser<TradeStatisticsPb> PARSER = null;
    public static final int PRICE_CHG_FIELD_NUMBER = 10;
    public static final int PRICE_CHG_PCT_FIELD_NUMBER = 9;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    public static final int TS_FIELD_NUMBER = 8;
    public static final int TURNOVER_FIELD_NUMBER = 3;
    public static final int VOLUME_FIELD_NUMBER = 2;
    private long ts_;
    private String symbol_ = "";
    private String volume_ = "";
    private String turnover_ = "";
    private String lastPrice_ = "";
    private String lowPrice_ = "";
    private String highPrice_ = "";
    private String fundingRate_ = "";
    private String priceChgPct_ = "";
    private String priceChg_ = "";

    /* JADX INFO: renamed from: com.futures.tradebiz.core.model.pb.TradeStatisticsPb$b */
    public static final class C6653b extends GeneratedMessageLite.Builder<TradeStatisticsPb, C6653b> implements MessageLiteOrBuilder {
        public /* synthetic */ C6653b(C6652a c6652a) {
            this();
        }

        public C6653b() {
            super(TradeStatisticsPb.DEFAULT_INSTANCE);
        }
    }

    public static C6653b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TradeStatisticsPb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TradeStatisticsPb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.futures.tradebiz.core.model.pb.TradeStatisticsPb$a */
    public static /* synthetic */ class C6652a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11106a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11106a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11106a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11106a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11106a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11106a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11106a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11106a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        TradeStatisticsPb tradeStatisticsPb = new TradeStatisticsPb();
        DEFAULT_INSTANCE = tradeStatisticsPb;
        GeneratedMessageLite.registerDefaultInstance(TradeStatisticsPb.class, tradeStatisticsPb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTs() {
        this.ts_ = 0L;
    }

    public static TradeStatisticsPb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6653b newBuilder(TradeStatisticsPb tradeStatisticsPb) {
        return DEFAULT_INSTANCE.createBuilder(tradeStatisticsPb);
    }

    public static TradeStatisticsPb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TradeStatisticsPb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<TradeStatisticsPb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTs(long j11) {
        this.ts_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C6652a c6652a = null;
        switch (C6652a.f11106a[methodToInvoke.ordinal()]) {
            case 1:
                return new TradeStatisticsPb();
            case 2:
                return new C6653b(c6652a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0002\tȈ\nȈ", new Object[]{"symbol_", "volume_", "turnover_", "lastPrice_", "lowPrice_", "highPrice_", "fundingRate_", "ts_", "priceChgPct_", "priceChg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TradeStatisticsPb> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TradeStatisticsPb.class) {
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

    public String getFundingRate() {
        return this.fundingRate_;
    }

    public ByteString getFundingRateBytes() {
        return ByteString.copyFromUtf8(this.fundingRate_);
    }

    public String getHighPrice() {
        return this.highPrice_;
    }

    public ByteString getHighPriceBytes() {
        return ByteString.copyFromUtf8(this.highPrice_);
    }

    public String getLastPrice() {
        return this.lastPrice_;
    }

    public ByteString getLastPriceBytes() {
        return ByteString.copyFromUtf8(this.lastPrice_);
    }

    public String getLowPrice() {
        return this.lowPrice_;
    }

    public ByteString getLowPriceBytes() {
        return ByteString.copyFromUtf8(this.lowPrice_);
    }

    public String getPriceChg() {
        return this.priceChg_;
    }

    public ByteString getPriceChgBytes() {
        return ByteString.copyFromUtf8(this.priceChg_);
    }

    public String getPriceChgPct() {
        return this.priceChgPct_;
    }

    public ByteString getPriceChgPctBytes() {
        return ByteString.copyFromUtf8(this.priceChgPct_);
    }

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    public long getTs() {
        return this.ts_;
    }

    public String getTurnover() {
        return this.turnover_;
    }

    public ByteString getTurnoverBytes() {
        return ByteString.copyFromUtf8(this.turnover_);
    }

    public String getVolume() {
        return this.volume_;
    }

    public ByteString getVolumeBytes() {
        return ByteString.copyFromUtf8(this.volume_);
    }

    private TradeStatisticsPb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFundingRate() {
        this.fundingRate_ = getDefaultInstance().getFundingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighPrice() {
        this.highPrice_ = getDefaultInstance().getHighPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPrice() {
        this.lastPrice_ = getDefaultInstance().getLastPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowPrice() {
        this.lowPrice_ = getDefaultInstance().getLowPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceChg() {
        this.priceChg_ = getDefaultInstance().getPriceChg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceChgPct() {
        this.priceChgPct_ = getDefaultInstance().getPriceChgPct();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnover() {
        this.turnover_ = getDefaultInstance().getTurnover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVolume() {
        this.volume_ = getDefaultInstance().getVolume();
    }

    public static TradeStatisticsPb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFundingRate(String str) {
        str.getClass();
        this.fundingRate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFundingRateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fundingRate_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighPrice(String str) {
        str.getClass();
        this.highPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.highPrice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPrice(String str) {
        str.getClass();
        this.lastPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastPrice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowPrice(String str) {
        str.getClass();
        this.lowPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lowPrice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceChg(String str) {
        str.getClass();
        this.priceChg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceChgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.priceChg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceChgPct(String str) {
        str.getClass();
        this.priceChgPct_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceChgPctBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.priceChgPct_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnover(String str) {
        str.getClass();
        this.turnover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.turnover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolume(String str) {
        str.getClass();
        this.volume_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolumeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.volume_ = byteString.toStringUtf8();
    }

    public static TradeStatisticsPb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TradeStatisticsPb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TradeStatisticsPb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TradeStatisticsPb parseFrom(InputStream inputStream) throws IOException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TradeStatisticsPb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TradeStatisticsPb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TradeStatisticsPb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TradeStatisticsPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
