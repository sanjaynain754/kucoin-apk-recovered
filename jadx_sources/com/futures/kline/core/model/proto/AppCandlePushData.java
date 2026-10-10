package com.futures.kline.core.model.proto;

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

/* JADX INFO: loaded from: classes45.dex */
public final class AppCandlePushData extends GeneratedMessageLite<AppCandlePushData, C6641b> implements MessageLiteOrBuilder {
    public static final int CANDLES_FIELD_NUMBER = 3;
    private static final AppCandlePushData DEFAULT_INSTANCE;
    private static volatile Parser<AppCandlePushData> PARSER = null;
    public static final int SYMBOL_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 1;
    private long time_;
    private String symbol_ = "";
    private Internal.ProtobufList<String> candles_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.futures.kline.core.model.proto.AppCandlePushData$b */
    public static final class C6641b extends GeneratedMessageLite.Builder<AppCandlePushData, C6641b> implements MessageLiteOrBuilder {
        public /* synthetic */ C6641b(C6640a c6640a) {
            this();
        }

        public C6641b() {
            super(AppCandlePushData.DEFAULT_INSTANCE);
        }
    }

    public static C6641b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AppCandlePushData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AppCandlePushData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppCandlePushData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.futures.kline.core.model.proto.AppCandlePushData$a */
    public static /* synthetic */ class C6640a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11100a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11100a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11100a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11100a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11100a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11100a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11100a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11100a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AppCandlePushData appCandlePushData = new AppCandlePushData();
        DEFAULT_INSTANCE = appCandlePushData;
        GeneratedMessageLite.registerDefaultInstance(AppCandlePushData.class, appCandlePushData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    private void ensureCandlesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.candles_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.candles_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AppCandlePushData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6641b newBuilder(AppCandlePushData appCandlePushData) {
        return DEFAULT_INSTANCE.createBuilder(appCandlePushData);
    }

    public static AppCandlePushData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AppCandlePushData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AppCandlePushData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<AppCandlePushData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j11) {
        this.time_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C6640a c6640a = null;
        switch (C6640a.f11100a[methodToInvoke.ordinal()]) {
            case 1:
                return new AppCandlePushData();
            case 2:
                return new C6641b(c6640a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003Ț", new Object[]{"time_", "symbol_", "candles_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AppCandlePushData> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AppCandlePushData.class) {
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

    public long getTime() {
        return this.time_;
    }

    private AppCandlePushData() {
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

    public static AppCandlePushData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static AppCandlePushData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AppCandlePushData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AppCandlePushData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AppCandlePushData parseFrom(InputStream inputStream) throws IOException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppCandlePushData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AppCandlePushData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AppCandlePushData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AppCandlePushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
