package com.kucoin.discover.alpha;

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
import x80.C46100a;

/* JADX INFO: loaded from: classes59.dex */
public final class AlphaTickerOuterClass$AlphaTicker extends GeneratedMessageLite<AlphaTickerOuterClass$AlphaTicker, C27265a> implements MessageLiteOrBuilder {
    public static final int CLOSEPRICE_FIELD_NUMBER = 2;
    private static final AlphaTickerOuterClass$AlphaTicker DEFAULT_INSTANCE;
    private static volatile Parser<AlphaTickerOuterClass$AlphaTicker> PARSER = null;
    public static final int RATE_FIELD_NUMBER = 3;
    public static final int TOKENBRIDGEID_FIELD_NUMBER = 1;
    public static final int TRADINGVOLUME_FIELD_NUMBER = 4;
    private float rate_;
    private long tokenBridgeId_;
    private String closePrice_ = "";
    private String tradingVolume_ = "";

    /* JADX INFO: renamed from: com.kucoin.discover.alpha.AlphaTickerOuterClass$AlphaTicker$a */
    public static final class C27265a extends GeneratedMessageLite.Builder<AlphaTickerOuterClass$AlphaTicker, C27265a> implements MessageLiteOrBuilder {
        public /* synthetic */ C27265a(C46100a c46100a) {
            this();
        }

        public C27265a() {
            super(AlphaTickerOuterClass$AlphaTicker.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRate() {
        this.rate_ = 0.0f;
    }

    public static C27265a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AlphaTickerOuterClass$AlphaTicker parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        AlphaTickerOuterClass$AlphaTicker alphaTickerOuterClass$AlphaTicker = new AlphaTickerOuterClass$AlphaTicker();
        DEFAULT_INSTANCE = alphaTickerOuterClass$AlphaTicker;
        GeneratedMessageLite.registerDefaultInstance(AlphaTickerOuterClass$AlphaTicker.class, alphaTickerOuterClass$AlphaTicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTokenBridgeId() {
        this.tokenBridgeId_ = 0L;
    }

    public static AlphaTickerOuterClass$AlphaTicker getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27265a newBuilder(AlphaTickerOuterClass$AlphaTicker alphaTickerOuterClass$AlphaTicker) {
        return DEFAULT_INSTANCE.createBuilder(alphaTickerOuterClass$AlphaTicker);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<AlphaTickerOuterClass$AlphaTicker> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRate(float f11) {
        this.rate_ = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBridgeId(long j11) {
        this.tokenBridgeId_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C46100a c46100a = null;
        switch (C46100a.f103556a[methodToInvoke.ordinal()]) {
            case 1:
                return new AlphaTickerOuterClass$AlphaTicker();
            case 2:
                return new C27265a(c46100a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0001\u0004Ȉ", new Object[]{"tokenBridgeId_", "closePrice_", "rate_", "tradingVolume_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AlphaTickerOuterClass$AlphaTicker> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AlphaTickerOuterClass$AlphaTicker.class) {
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

    public String getClosePrice() {
        return this.closePrice_;
    }

    public ByteString getClosePriceBytes() {
        return ByteString.copyFromUtf8(this.closePrice_);
    }

    public float getRate() {
        return this.rate_;
    }

    public long getTokenBridgeId() {
        return this.tokenBridgeId_;
    }

    public String getTradingVolume() {
        return this.tradingVolume_;
    }

    public ByteString getTradingVolumeBytes() {
        return ByteString.copyFromUtf8(this.tradingVolume_);
    }

    private AlphaTickerOuterClass$AlphaTicker() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosePrice() {
        this.closePrice_ = getDefaultInstance().getClosePrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTradingVolume() {
        this.tradingVolume_ = getDefaultInstance().getTradingVolume();
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePrice(String str) {
        str.getClass();
        this.closePrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.closePrice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTradingVolume(String str) {
        str.getClass();
        this.tradingVolume_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTradingVolumeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tradingVolume_ = byteString.toStringUtf8();
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(InputStream inputStream) throws IOException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AlphaTickerOuterClass$AlphaTicker parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaTickerOuterClass$AlphaTicker) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
