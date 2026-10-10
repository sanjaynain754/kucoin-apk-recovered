package com.kucoin.discover.rankings;

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
import java.util.List;
import y80.InterfaceC46403c;

/* JADX INFO: loaded from: classes59.dex */
public final class FuturesRankingItemApp extends GeneratedMessageLite<FuturesRankingItemApp, C27275b> implements InterfaceC46403c {
    public static final int CRYPTO_FIELD_NUMBER = 1;
    private static final FuturesRankingItemApp DEFAULT_INSTANCE;
    public static final int FUTURESMARKS_FIELD_NUMBER = 7;
    public static final int LAST24HOURRATE_FIELD_NUMBER = 5;
    public static final int LAST24HOURTRADINGVOLUME_FIELD_NUMBER = 6;
    public static final int LASTPRICE_FIELD_NUMBER = 4;
    public static final int OPENAT_FIELD_NUMBER = 8;
    private static volatile Parser<FuturesRankingItemApp> PARSER = null;
    public static final int QUOTECRYPTO_FIELD_NUMBER = 2;
    public static final int SYMBOL_FIELD_NUMBER = 3;
    private float last24HourRate_;
    private double last24HourTradingVolume_;
    private long openAt_;
    private String crypto_ = "";
    private String quoteCrypto_ = "";
    private String symbol_ = "";
    private String lastPrice_ = "";
    private Internal.ProtobufList<String> futuresMarks_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.FuturesRankingItemApp$b */
    public static final class C27275b extends GeneratedMessageLite.Builder<FuturesRankingItemApp, C27275b> implements InterfaceC46403c {
        public /* synthetic */ C27275b(C27274a c27274a) {
            this();
        }

        public C27275b() {
            super(FuturesRankingItemApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLast24HourRate() {
        this.last24HourRate_ = 0.0f;
    }

    public static C27275b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FuturesRankingItemApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FuturesRankingItemApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.FuturesRankingItemApp$a */
    public static /* synthetic */ class C27274a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55356a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55356a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55356a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55356a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55356a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55356a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55356a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55356a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        FuturesRankingItemApp futuresRankingItemApp = new FuturesRankingItemApp();
        DEFAULT_INSTANCE = futuresRankingItemApp;
        GeneratedMessageLite.registerDefaultInstance(FuturesRankingItemApp.class, futuresRankingItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLast24HourTradingVolume() {
        this.last24HourTradingVolume_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenAt() {
        this.openAt_ = 0L;
    }

    private void ensureFuturesMarksIsMutable() {
        Internal.ProtobufList<String> protobufList = this.futuresMarks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.futuresMarks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FuturesRankingItemApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27275b newBuilder(FuturesRankingItemApp futuresRankingItemApp) {
        return DEFAULT_INSTANCE.createBuilder(futuresRankingItemApp);
    }

    public static FuturesRankingItemApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FuturesRankingItemApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<FuturesRankingItemApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLast24HourRate(float f11) {
        this.last24HourRate_ = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLast24HourTradingVolume(double d11) {
        this.last24HourTradingVolume_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenAt(long j11) {
        this.openAt_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27274a c27274a = null;
        switch (C27274a.f55356a[methodToInvoke.ordinal()]) {
            case 1:
                return new FuturesRankingItemApp();
            case 2:
                return new C27275b(c27274a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0001\u0006\u0000\u0007Ț\b\u0002", new Object[]{"crypto_", "quoteCrypto_", "symbol_", "lastPrice_", "last24HourRate_", "last24HourTradingVolume_", "futuresMarks_", "openAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FuturesRankingItemApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FuturesRankingItemApp.class) {
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

    public String getCrypto() {
        return this.crypto_;
    }

    public ByteString getCryptoBytes() {
        return ByteString.copyFromUtf8(this.crypto_);
    }

    public String getFuturesMarks(int i11) {
        return this.futuresMarks_.get(i11);
    }

    public ByteString getFuturesMarksBytes(int i11) {
        return ByteString.copyFromUtf8(this.futuresMarks_.get(i11));
    }

    public int getFuturesMarksCount() {
        return this.futuresMarks_.size();
    }

    public List<String> getFuturesMarksList() {
        return this.futuresMarks_;
    }

    public float getLast24HourRate() {
        return this.last24HourRate_;
    }

    public double getLast24HourTradingVolume() {
        return this.last24HourTradingVolume_;
    }

    public String getLastPrice() {
        return this.lastPrice_;
    }

    public ByteString getLastPriceBytes() {
        return ByteString.copyFromUtf8(this.lastPrice_);
    }

    public long getOpenAt() {
        return this.openAt_;
    }

    public String getQuoteCrypto() {
        return this.quoteCrypto_;
    }

    public ByteString getQuoteCryptoBytes() {
        return ByteString.copyFromUtf8(this.quoteCrypto_);
    }

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    private FuturesRankingItemApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFuturesMarks(Iterable<String> iterable) {
        ensureFuturesMarksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.futuresMarks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFuturesMarks(String str) {
        str.getClass();
        ensureFuturesMarksIsMutable();
        this.futuresMarks_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFuturesMarksBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureFuturesMarksIsMutable();
        this.futuresMarks_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrypto() {
        this.crypto_ = getDefaultInstance().getCrypto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFuturesMarks() {
        this.futuresMarks_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPrice() {
        this.lastPrice_ = getDefaultInstance().getLastPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuoteCrypto() {
        this.quoteCrypto_ = getDefaultInstance().getQuoteCrypto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    public static FuturesRankingItemApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrypto(String str) {
        str.getClass();
        this.crypto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCryptoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.crypto_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFuturesMarks(int i11, String str) {
        str.getClass();
        ensureFuturesMarksIsMutable();
        this.futuresMarks_.set(i11, str);
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
    public void setQuoteCrypto(String str) {
        str.getClass();
        this.quoteCrypto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuoteCryptoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.quoteCrypto_ = byteString.toStringUtf8();
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

    public static FuturesRankingItemApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FuturesRankingItemApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FuturesRankingItemApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FuturesRankingItemApp parseFrom(InputStream inputStream) throws IOException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FuturesRankingItemApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FuturesRankingItemApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FuturesRankingItemApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FuturesRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
