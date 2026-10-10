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
public final class ContractMarketExecution extends GeneratedMessageLite<ContractMarketExecution, C6647b> implements MessageLiteOrBuilder {
    private static final ContractMarketExecution DEFAULT_INSTANCE;
    public static final int MAKER_ORDER_ID_FIELD_NUMBER = 8;
    private static volatile Parser<ContractMarketExecution> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 7;
    public static final int SEQUENCE_FIELD_NUMBER = 5;
    public static final int SIDE_FIELD_NUMBER = 2;
    public static final int SIZE_FIELD_NUMBER = 6;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    public static final int TAKER_ORDER_ID_FIELD_NUMBER = 3;
    public static final int TRADE_ID_FIELD_NUMBER = 9;
    public static final int TS_FIELD_NUMBER = 4;
    private long sequence_;
    private long size_;
    private long ts_;
    private String symbol_ = "";
    private String side_ = "";
    private String takerOrderId_ = "";
    private String price_ = "";
    private String makerOrderId_ = "";
    private String tradeId_ = "";

    /* JADX INFO: renamed from: com.futures.market.protobuf.ContractMarketExecution$b */
    public static final class C6647b extends GeneratedMessageLite.Builder<ContractMarketExecution, C6647b> implements MessageLiteOrBuilder {
        public /* synthetic */ C6647b(C6646a c6646a) {
            this();
        }

        public C6647b() {
            super(ContractMarketExecution.DEFAULT_INSTANCE);
        }
    }

    public static C6647b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContractMarketExecution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContractMarketExecution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractMarketExecution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.futures.market.protobuf.ContractMarketExecution$a */
    public static /* synthetic */ class C6646a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11103a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11103a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11103a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11103a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11103a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11103a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11103a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11103a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ContractMarketExecution contractMarketExecution = new ContractMarketExecution();
        DEFAULT_INSTANCE = contractMarketExecution;
        GeneratedMessageLite.registerDefaultInstance(ContractMarketExecution.class, contractMarketExecution);
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

    public static ContractMarketExecution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6647b newBuilder(ContractMarketExecution contractMarketExecution) {
        return DEFAULT_INSTANCE.createBuilder(contractMarketExecution);
    }

    public static ContractMarketExecution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractMarketExecution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractMarketExecution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ContractMarketExecution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
        C6646a c6646a = null;
        switch (C6646a.f11103a[methodToInvoke.ordinal()]) {
            case 1:
                return new ContractMarketExecution();
            case 2:
                return new C6647b(c6646a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ", new Object[]{"symbol_", "side_", "takerOrderId_", "ts_", "sequence_", "size_", "price_", "makerOrderId_", "tradeId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContractMarketExecution> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ContractMarketExecution.class) {
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

    public String getMakerOrderId() {
        return this.makerOrderId_;
    }

    public ByteString getMakerOrderIdBytes() {
        return ByteString.copyFromUtf8(this.makerOrderId_);
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

    public String getTakerOrderId() {
        return this.takerOrderId_;
    }

    public ByteString getTakerOrderIdBytes() {
        return ByteString.copyFromUtf8(this.takerOrderId_);
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

    private ContractMarketExecution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMakerOrderId() {
        this.makerOrderId_ = getDefaultInstance().getMakerOrderId();
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
    public void clearTakerOrderId() {
        this.takerOrderId_ = getDefaultInstance().getTakerOrderId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTradeId() {
        this.tradeId_ = getDefaultInstance().getTradeId();
    }

    public static ContractMarketExecution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakerOrderId(String str) {
        str.getClass();
        this.makerOrderId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakerOrderIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.makerOrderId_ = byteString.toStringUtf8();
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
    public void setTakerOrderId(String str) {
        str.getClass();
        this.takerOrderId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakerOrderIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.takerOrderId_ = byteString.toStringUtf8();
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

    public static ContractMarketExecution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContractMarketExecution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContractMarketExecution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContractMarketExecution parseFrom(InputStream inputStream) throws IOException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractMarketExecution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractMarketExecution parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContractMarketExecution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractMarketExecution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
