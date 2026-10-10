package com.kucoin.discover.rankings;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y80.InterfaceC46401a;

/* JADX INFO: loaded from: classes59.dex */
public final class AlphaRankingItemApp extends GeneratedMessageLite<AlphaRankingItemApp, C27267b> implements InterfaceC46401a {
    public static final int ALPHAOPENINGAT_FIELD_NUMBER = 8;
    public static final int CHAINICON_FIELD_NUMBER = 7;
    private static final AlphaRankingItemApp DEFAULT_INSTANCE;
    public static final int DISPLAYTOKEN_FIELD_NUMBER = 5;
    private static volatile Parser<AlphaRankingItemApp> PARSER = null;
    public static final int PRICERATE_FIELD_NUMBER = 4;
    public static final int PRICE_FIELD_NUMBER = 3;
    public static final int TOKENBRIDGEID_FIELD_NUMBER = 1;
    public static final int TOKENICON_FIELD_NUMBER = 6;
    public static final int TRADINGVOLUME_FIELD_NUMBER = 2;
    private long alphaOpeningAt_;
    private float priceRate_;
    private long tokenBridgeId_;
    private double tradingVolume_;
    private String price_ = "";
    private String displayToken_ = "";
    private String tokenIcon_ = "";
    private String chainIcon_ = "";

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.AlphaRankingItemApp$b */
    public static final class C27267b extends GeneratedMessageLite.Builder<AlphaRankingItemApp, C27267b> implements InterfaceC46401a {
        public /* synthetic */ C27267b(C27266a c27266a) {
            this();
        }

        public C27267b() {
            super(AlphaRankingItemApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceRate() {
        this.priceRate_ = 0.0f;
    }

    public static C27267b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AlphaRankingItemApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlphaRankingItemApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.AlphaRankingItemApp$a */
    public static /* synthetic */ class C27266a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55352a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55352a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55352a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55352a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55352a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55352a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55352a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55352a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AlphaRankingItemApp alphaRankingItemApp = new AlphaRankingItemApp();
        DEFAULT_INSTANCE = alphaRankingItemApp;
        GeneratedMessageLite.registerDefaultInstance(AlphaRankingItemApp.class, alphaRankingItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlphaOpeningAt() {
        this.alphaOpeningAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTokenBridgeId() {
        this.tokenBridgeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTradingVolume() {
        this.tradingVolume_ = 0.0d;
    }

    public static AlphaRankingItemApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27267b newBuilder(AlphaRankingItemApp alphaRankingItemApp) {
        return DEFAULT_INSTANCE.createBuilder(alphaRankingItemApp);
    }

    public static AlphaRankingItemApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlphaRankingItemApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<AlphaRankingItemApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlphaOpeningAt(long j11) {
        this.alphaOpeningAt_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceRate(float f11) {
        this.priceRate_ = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBridgeId(long j11) {
        this.tokenBridgeId_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTradingVolume(double d11) {
        this.tradingVolume_ = d11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27266a c27266a = null;
        switch (C27266a.f55352a[methodToInvoke.ordinal()]) {
            case 1:
                return new AlphaRankingItemApp();
            case 2:
                return new C27267b(c27266a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0000\u0003Ȉ\u0004\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0002", new Object[]{"tokenBridgeId_", "tradingVolume_", "price_", "priceRate_", "displayToken_", "tokenIcon_", "chainIcon_", "alphaOpeningAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AlphaRankingItemApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AlphaRankingItemApp.class) {
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
            default:
                throw null;
        }
    }

    public long getAlphaOpeningAt() {
        return this.alphaOpeningAt_;
    }

    public String getChainIcon() {
        return this.chainIcon_;
    }

    public ByteString getChainIconBytes() {
        return ByteString.copyFromUtf8(this.chainIcon_);
    }

    public String getDisplayToken() {
        return this.displayToken_;
    }

    public ByteString getDisplayTokenBytes() {
        return ByteString.copyFromUtf8(this.displayToken_);
    }

    public String getPrice() {
        return this.price_;
    }

    public ByteString getPriceBytes() {
        return ByteString.copyFromUtf8(this.price_);
    }

    public float getPriceRate() {
        return this.priceRate_;
    }

    public long getTokenBridgeId() {
        return this.tokenBridgeId_;
    }

    public String getTokenIcon() {
        return this.tokenIcon_;
    }

    public ByteString getTokenIconBytes() {
        return ByteString.copyFromUtf8(this.tokenIcon_);
    }

    public double getTradingVolume() {
        return this.tradingVolume_;
    }

    private AlphaRankingItemApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChainIcon() {
        this.chainIcon_ = getDefaultInstance().getChainIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayToken() {
        this.displayToken_ = getDefaultInstance().getDisplayToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = getDefaultInstance().getPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTokenIcon() {
        this.tokenIcon_ = getDefaultInstance().getTokenIcon();
    }

    public static AlphaRankingItemApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChainIcon(String str) {
        str.getClass();
        this.chainIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChainIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.chainIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayToken(String str) {
        str.getClass();
        this.displayToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.displayToken_ = byteString.toStringUtf8();
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
    public void setTokenIcon(String str) {
        str.getClass();
        this.tokenIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tokenIcon_ = byteString.toStringUtf8();
    }

    public static AlphaRankingItemApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AlphaRankingItemApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlphaRankingItemApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AlphaRankingItemApp parseFrom(InputStream inputStream) throws IOException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlphaRankingItemApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlphaRankingItemApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AlphaRankingItemApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
