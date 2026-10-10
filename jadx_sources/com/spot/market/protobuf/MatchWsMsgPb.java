package com.spot.market.protobuf;

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

/* JADX INFO: loaded from: classes59.dex */
public final class MatchWsMsgPb extends GeneratedMessageLite<MatchWsMsgPb, C27786b> implements MessageLiteOrBuilder {
    private static final MatchWsMsgPb DEFAULT_INSTANCE;
    public static final int MAKERORDERID_FIELD_NUMBER = 9;
    private static volatile Parser<MatchWsMsgPb> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 5;
    public static final int SEQUENCE_FIELD_NUMBER = 1;
    public static final int SIDE_FIELD_NUMBER = 4;
    public static final int SIZE_FIELD_NUMBER = 6;
    public static final int SYMBOL_FIELD_NUMBER = 3;
    public static final int TAKERORDERID_FIELD_NUMBER = 8;
    public static final int TIME_FIELD_NUMBER = 10;
    public static final int TRADEID_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String sequence_ = "";
    private String type_ = "";
    private String symbol_ = "";
    private String side_ = "";
    private String price_ = "";
    private String size_ = "";
    private String tradeId_ = "";
    private String takerOrderId_ = "";
    private String makerOrderId_ = "";
    private String time_ = "";

    /* JADX INFO: renamed from: com.spot.market.protobuf.MatchWsMsgPb$b */
    public static final class C27786b extends GeneratedMessageLite.Builder<MatchWsMsgPb, C27786b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27786b(C27785a c27785a) {
            this();
        }

        public C27786b() {
            super(MatchWsMsgPb.DEFAULT_INSTANCE);
        }
    }

    public static C27786b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MatchWsMsgPb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MatchWsMsgPb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.spot.market.protobuf.MatchWsMsgPb$a */
    public static /* synthetic */ class C27785a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56540a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56540a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56540a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56540a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56540a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56540a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56540a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56540a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        MatchWsMsgPb matchWsMsgPb = new MatchWsMsgPb();
        DEFAULT_INSTANCE = matchWsMsgPb;
        GeneratedMessageLite.registerDefaultInstance(MatchWsMsgPb.class, matchWsMsgPb);
    }

    public static MatchWsMsgPb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27786b newBuilder(MatchWsMsgPb matchWsMsgPb) {
        return DEFAULT_INSTANCE.createBuilder(matchWsMsgPb);
    }

    public static MatchWsMsgPb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MatchWsMsgPb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<MatchWsMsgPb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27785a c27785a = null;
        switch (C27785a.f56540a[methodToInvoke.ordinal()]) {
            case 1:
                return new MatchWsMsgPb();
            case 2:
                return new C27786b(c27785a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"sequence_", "type_", "symbol_", "side_", "price_", "size_", "tradeId_", "takerOrderId_", "makerOrderId_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MatchWsMsgPb> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MatchWsMsgPb.class) {
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

    public String getSequence() {
        return this.sequence_;
    }

    public ByteString getSequenceBytes() {
        return ByteString.copyFromUtf8(this.sequence_);
    }

    public String getSide() {
        return this.side_;
    }

    public ByteString getSideBytes() {
        return ByteString.copyFromUtf8(this.side_);
    }

    public String getSize() {
        return this.size_;
    }

    public ByteString getSizeBytes() {
        return ByteString.copyFromUtf8(this.size_);
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

    public String getTime() {
        return this.time_;
    }

    public ByteString getTimeBytes() {
        return ByteString.copyFromUtf8(this.time_);
    }

    public String getTradeId() {
        return this.tradeId_;
    }

    public ByteString getTradeIdBytes() {
        return ByteString.copyFromUtf8(this.tradeId_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    private MatchWsMsgPb() {
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
    public void clearSequence() {
        this.sequence_ = getDefaultInstance().getSequence();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSide() {
        this.side_ = getDefaultInstance().getSide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = getDefaultInstance().getSize();
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
    public void clearTime() {
        this.time_ = getDefaultInstance().getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTradeId() {
        this.tradeId_ = getDefaultInstance().getTradeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static MatchWsMsgPb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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
    public void setSequence(String str) {
        str.getClass();
        this.sequence_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequenceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sequence_ = byteString.toStringUtf8();
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
    public void setSize(String str) {
        str.getClass();
        this.size_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSizeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.size_ = byteString.toStringUtf8();
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
    public void setTime(String str) {
        str.getClass();
        this.time_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.time_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    public static MatchWsMsgPb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MatchWsMsgPb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MatchWsMsgPb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MatchWsMsgPb parseFrom(InputStream inputStream) throws IOException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MatchWsMsgPb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MatchWsMsgPb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MatchWsMsgPb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MatchWsMsgPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
