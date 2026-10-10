package com.kucoin.discover.tickers;

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
import z80.InterfaceC46733a;

/* JADX INFO: loaded from: classes59.dex */
public final class TickerItemApp extends GeneratedMessageLite<TickerItemApp, C27279b> implements InterfaceC46733a {
    private static final TickerItemApp DEFAULT_INSTANCE;
    public static final int LAST24HOURPRICECHANGE_FIELD_NUMBER = 4;
    public static final int LAST24HOURRATE_FIELD_NUMBER = 3;
    public static final int LAST24HOURTRADINGVOLUME_FIELD_NUMBER = 5;
    public static final int LASTPRICE_FIELD_NUMBER = 2;
    private static volatile Parser<TickerItemApp> PARSER = null;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    private float last24HourPriceChange_;
    private float last24HourRate_;
    private double last24HourTradingVolume_;
    private String symbol_ = "";
    private String lastPrice_ = "";

    /* JADX INFO: renamed from: com.kucoin.discover.tickers.TickerItemApp$b */
    public static final class C27279b extends GeneratedMessageLite.Builder<TickerItemApp, C27279b> implements InterfaceC46733a {
        public /* synthetic */ C27279b(C27278a c27278a) {
            this();
        }

        public C27279b() {
            super(TickerItemApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLast24HourPriceChange() {
        this.last24HourPriceChange_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLast24HourRate() {
        this.last24HourRate_ = 0.0f;
    }

    public static C27279b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TickerItemApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TickerItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TickerItemApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.tickers.TickerItemApp$a */
    public static /* synthetic */ class C27278a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55358a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55358a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55358a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55358a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55358a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55358a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55358a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55358a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        TickerItemApp tickerItemApp = new TickerItemApp();
        DEFAULT_INSTANCE = tickerItemApp;
        GeneratedMessageLite.registerDefaultInstance(TickerItemApp.class, tickerItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLast24HourTradingVolume() {
        this.last24HourTradingVolume_ = 0.0d;
    }

    public static TickerItemApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27279b newBuilder(TickerItemApp tickerItemApp) {
        return DEFAULT_INSTANCE.createBuilder(tickerItemApp);
    }

    public static TickerItemApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TickerItemApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TickerItemApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<TickerItemApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLast24HourPriceChange(float f11) {
        this.last24HourPriceChange_ = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLast24HourRate(float f11) {
        this.last24HourRate_ = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLast24HourTradingVolume(double d11) {
        this.last24HourTradingVolume_ = d11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27278a c27278a = null;
        switch (C27278a.f55358a[methodToInvoke.ordinal()]) {
            case 1:
                return new TickerItemApp();
            case 2:
                return new C27279b(c27278a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004\u0001\u0005\u0000", new Object[]{"symbol_", "lastPrice_", "last24HourRate_", "last24HourPriceChange_", "last24HourTradingVolume_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TickerItemApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TickerItemApp.class) {
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

    public float getLast24HourPriceChange() {
        return this.last24HourPriceChange_;
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

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    private TickerItemApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPrice() {
        this.lastPrice_ = getDefaultInstance().getLastPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    public static TickerItemApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static TickerItemApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TickerItemApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TickerItemApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TickerItemApp parseFrom(InputStream inputStream) throws IOException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TickerItemApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TickerItemApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TickerItemApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TickerItemApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
