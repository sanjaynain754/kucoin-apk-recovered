package com.futures.market.protobuf;

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
public final class ContractMarketTicker extends GeneratedMessageLite<ContractMarketTicker, C6649b> implements MessageLiteOrBuilder {
    public static final int BEST_ASK_PRICE_FIELD_NUMBER = 7;
    public static final int BEST_ASK_SIZE_FIELD_NUMBER = 8;
    public static final int BEST_BID_PRICE_FIELD_NUMBER = 9;
    public static final int BEST_BID_SIZE_FIELD_NUMBER = 10;
    private static final ContractMarketTicker DEFAULT_INSTANCE;
    private static volatile Parser<ContractMarketTicker> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 4;
    public static final int SEQUENCE_FIELD_NUMBER = 2;
    public static final int SIDE_FIELD_NUMBER = 3;
    public static final int SIZE_FIELD_NUMBER = 5;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    public static final int TRADE_ID_FIELD_NUMBER = 6;
    public static final int TS_FIELD_NUMBER = 11;
    private long bestAskSize_;
    private long bestBidSize_;
    private long sequence_;
    private long size_;
    private long ts_;
    private String symbol_ = "";
    private String side_ = "";
    private String price_ = "";
    private String tradeId_ = "";
    private String bestAskPrice_ = "";
    private String bestBidPrice_ = "";

    /* JADX INFO: renamed from: com.futures.market.protobuf.ContractMarketTicker$b */
    public static final class C6649b extends GeneratedMessageLite.Builder<ContractMarketTicker, C6649b> implements MessageLiteOrBuilder {
        public /* synthetic */ C6649b(C6648a c6648a) {
            this();
        }

        public C6649b() {
            super(ContractMarketTicker.DEFAULT_INSTANCE);
        }
    }

    public static C6649b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContractMarketTicker parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContractMarketTicker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractMarketTicker parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.futures.market.protobuf.ContractMarketTicker$a */
    public static /* synthetic */ class C6648a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11104a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11104a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11104a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11104a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11104a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11104a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11104a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11104a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ContractMarketTicker contractMarketTicker = new ContractMarketTicker();
        DEFAULT_INSTANCE = contractMarketTicker;
        GeneratedMessageLite.registerDefaultInstance(ContractMarketTicker.class, contractMarketTicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBestAskSize() {
        this.bestAskSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBestBidSize() {
        this.bestBidSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSequence() {
        this.sequence_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTs() {
        this.ts_ = 0L;
    }

    public static ContractMarketTicker getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6649b newBuilder(ContractMarketTicker contractMarketTicker) {
        return DEFAULT_INSTANCE.createBuilder(contractMarketTicker);
    }

    public static ContractMarketTicker parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractMarketTicker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractMarketTicker parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ContractMarketTicker> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBestAskSize(long j11) {
        this.bestAskSize_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBestBidSize(long j11) {
        this.bestBidSize_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequence(long j11) {
        this.sequence_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j11) {
        this.size_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTs(long j11) {
        this.ts_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C6648a c6648a = null;
        switch (C6648a.f11104a[methodToInvoke.ordinal()]) {
            case 1:
                return new ContractMarketTicker();
            case 2:
                return new C6649b(c6648a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006Ȉ\u0007Ȉ\b\u0002\tȈ\n\u0002\u000b\u0002", new Object[]{"symbol_", "sequence_", "side_", "price_", "size_", "tradeId_", "bestAskPrice_", "bestAskSize_", "bestBidPrice_", "bestBidSize_", "ts_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContractMarketTicker> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ContractMarketTicker.class) {
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

    public String getBestAskPrice() {
        return this.bestAskPrice_;
    }

    public ByteString getBestAskPriceBytes() {
        return ByteString.copyFromUtf8(this.bestAskPrice_);
    }

    public long getBestAskSize() {
        return this.bestAskSize_;
    }

    public String getBestBidPrice() {
        return this.bestBidPrice_;
    }

    public ByteString getBestBidPriceBytes() {
        return ByteString.copyFromUtf8(this.bestBidPrice_);
    }

    public long getBestBidSize() {
        return this.bestBidSize_;
    }

    public String getPrice() {
        return this.price_;
    }

    public ByteString getPriceBytes() {
        return ByteString.copyFromUtf8(this.price_);
    }

    public long getSequence() {
        return this.sequence_;
    }

    public String getSide() {
        return this.side_;
    }

    public ByteString getSideBytes() {
        return ByteString.copyFromUtf8(this.side_);
    }

    public long getSize() {
        return this.size_;
    }

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    public String getTradeId() {
        return this.tradeId_;
    }

    public ByteString getTradeIdBytes() {
        return ByteString.copyFromUtf8(this.tradeId_);
    }

    public long getTs() {
        return this.ts_;
    }

    private ContractMarketTicker() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBestAskPrice() {
        this.bestAskPrice_ = getDefaultInstance().getBestAskPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBestBidPrice() {
        this.bestBidPrice_ = getDefaultInstance().getBestBidPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = getDefaultInstance().getPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSide() {
        this.side_ = getDefaultInstance().getSide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTradeId() {
        this.tradeId_ = getDefaultInstance().getTradeId();
    }

    public static ContractMarketTicker parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBestAskPrice(String str) {
        str.getClass();
        this.bestAskPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBestAskPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bestAskPrice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBestBidPrice(String str) {
        str.getClass();
        this.bestBidPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBestBidPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bestBidPrice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(String str) {
        str.getClass();
        this.price_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.price_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSide(String str) {
        str.getClass();
        this.side_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSideBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.side_ = byteString.toStringUtf8();
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
    public void setTradeId(String str) {
        str.getClass();
        this.tradeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTradeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tradeId_ = byteString.toStringUtf8();
    }

    public static ContractMarketTicker parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContractMarketTicker parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContractMarketTicker parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContractMarketTicker parseFrom(InputStream inputStream) throws IOException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractMarketTicker parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractMarketTicker parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContractMarketTicker parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractMarketTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
