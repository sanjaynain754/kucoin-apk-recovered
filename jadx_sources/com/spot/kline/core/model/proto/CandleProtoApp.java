package com.spot.kline.core.model.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public final class CandleProtoApp extends GeneratedMessageLite<CandleProtoApp, C27778b> implements MessageLiteOrBuilder {
    public static final int CANDLES_FIELD_NUMBER = 2;
    private static final CandleProtoApp DEFAULT_INSTANCE;
    private static volatile Parser<CandleProtoApp> PARSER = null;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    public static final int TIME_FIELD_NUMBER = 3;
    private String symbol_ = "";
    private Internal.ProtobufList<String> candles_ = GeneratedMessageLite.emptyProtobufList();
    private String time_ = "";

    /* JADX INFO: renamed from: com.spot.kline.core.model.proto.CandleProtoApp$b */
    public static final class C27778b extends GeneratedMessageLite.Builder<CandleProtoApp, C27778b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27778b(C27777a c27777a) {
            this();
        }

        public C27778b() {
            super(CandleProtoApp.DEFAULT_INSTANCE);
        }
    }

    public static C27778b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CandleProtoApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CandleProtoApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleProtoApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.spot.kline.core.model.proto.CandleProtoApp$a */
    public static /* synthetic */ class C27777a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56536a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56536a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56536a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56536a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56536a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56536a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56536a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56536a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CandleProtoApp candleProtoApp = new CandleProtoApp();
        DEFAULT_INSTANCE = candleProtoApp;
        GeneratedMessageLite.registerDefaultInstance(CandleProtoApp.class, candleProtoApp);
    }

    private void ensureCandlesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.candles_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.candles_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CandleProtoApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27778b newBuilder(CandleProtoApp candleProtoApp) {
        return DEFAULT_INSTANCE.createBuilder(candleProtoApp);
    }

    public static CandleProtoApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleProtoApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleProtoApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CandleProtoApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27777a c27777a = null;
        switch (C27777a.f56536a[methodToInvoke.ordinal()]) {
            case 1:
                return new CandleProtoApp();
            case 2:
                return new C27778b(c27777a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ", new Object[]{"symbol_", "candles_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CandleProtoApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CandleProtoApp.class) {
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

    public String getCandles(int i11) {
        return this.candles_.get(i11);
    }

    public ByteString getCandlesBytes(int i11) {
        return ByteString.copyFromUtf8(this.candles_.get(i11));
    }

    public int getCandlesCount() {
        return this.candles_.size();
    }

    public List<String> getCandlesList() {
        return this.candles_;
    }

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    public String getTime() {
        return this.time_;
    }

    public ByteString getTimeBytes() {
        return ByteString.copyFromUtf8(this.time_);
    }

    private CandleProtoApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCandles(Iterable<String> iterable) {
        ensureCandlesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.candles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCandles(String str) {
        str.getClass();
        ensureCandlesIsMutable();
        this.candles_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCandlesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCandlesIsMutable();
        this.candles_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCandles() {
        this.candles_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = getDefaultInstance().getTime();
    }

    public static CandleProtoApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandles(int i11, String str) {
        str.getClass();
        ensureCandlesIsMutable();
        this.candles_.set(i11, str);
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
    public void setTime(String str) {
        str.getClass();
        this.time_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.time_ = byteString.toStringUtf8();
    }

    public static CandleProtoApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CandleProtoApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CandleProtoApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CandleProtoApp parseFrom(InputStream inputStream) throws IOException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleProtoApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleProtoApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CandleProtoApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleProtoApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
