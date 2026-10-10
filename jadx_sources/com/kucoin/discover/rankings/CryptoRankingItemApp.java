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
import y80.InterfaceC46402b;

/* JADX INFO: loaded from: classes59.dex */
public final class CryptoRankingItemApp extends GeneratedMessageLite<CryptoRankingItemApp, C27271b> implements InterfaceC46402b {
    private static final CryptoRankingItemApp DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int LAST24HOURRATE_FIELD_NUMBER = 3;
    public static final int LAST24HOURTRADINGVOLUME_FIELD_NUMBER = 5;
    public static final int LASTPRICE_FIELD_NUMBER = 4;
    public static final int OPENAT_FIELD_NUMBER = 6;
    private static volatile Parser<CryptoRankingItemApp> PARSER = null;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    private float last24HourRate_;
    private double last24HourTradingVolume_;
    private long openAt_;
    private String symbol_ = "";
    private String icon_ = "";
    private String lastPrice_ = "";

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.CryptoRankingItemApp$b */
    public static final class C27271b extends GeneratedMessageLite.Builder<CryptoRankingItemApp, C27271b> implements InterfaceC46402b {
        public /* synthetic */ C27271b(C27270a c27270a) {
            this();
        }

        public C27271b() {
            super(CryptoRankingItemApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLast24HourRate() {
        this.last24HourRate_ = 0.0f;
    }

    public static C27271b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CryptoRankingItemApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CryptoRankingItemApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.CryptoRankingItemApp$a */
    public static /* synthetic */ class C27270a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55354a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55354a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55354a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55354a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55354a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55354a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55354a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55354a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CryptoRankingItemApp cryptoRankingItemApp = new CryptoRankingItemApp();
        DEFAULT_INSTANCE = cryptoRankingItemApp;
        GeneratedMessageLite.registerDefaultInstance(CryptoRankingItemApp.class, cryptoRankingItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLast24HourTradingVolume() {
        this.last24HourTradingVolume_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenAt() {
        this.openAt_ = 0L;
    }

    public static CryptoRankingItemApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27271b newBuilder(CryptoRankingItemApp cryptoRankingItemApp) {
        return DEFAULT_INSTANCE.createBuilder(cryptoRankingItemApp);
    }

    public static CryptoRankingItemApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CryptoRankingItemApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CryptoRankingItemApp> parser() {
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
        C27270a c27270a = null;
        switch (C27270a.f55354a[methodToInvoke.ordinal()]) {
            case 1:
                return new CryptoRankingItemApp();
            case 2:
                return new C27271b(c27270a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004Ȉ\u0005\u0000\u0006\u0002", new Object[]{"symbol_", "icon_", "last24HourRate_", "lastPrice_", "last24HourTradingVolume_", "openAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CryptoRankingItemApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CryptoRankingItemApp.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
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

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    private CryptoRankingItemApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPrice() {
        this.lastPrice_ = getDefaultInstance().getLastPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    public static CryptoRankingItemApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
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
    public void setSymbol(String str) {
        str.getClass();
        this.symbol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymbolBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.symbol_ = byteString.toStringUtf8();
    }

    public static CryptoRankingItemApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CryptoRankingItemApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CryptoRankingItemApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CryptoRankingItemApp parseFrom(InputStream inputStream) throws IOException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CryptoRankingItemApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CryptoRankingItemApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CryptoRankingItemApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CryptoRankingItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
