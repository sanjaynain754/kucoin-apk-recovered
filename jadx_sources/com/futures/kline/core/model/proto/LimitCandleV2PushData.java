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
public final class LimitCandleV2PushData extends GeneratedMessageLite<LimitCandleV2PushData, C6643b> implements MessageLiteOrBuilder {
    public static final int CANDLES_FIELD_NUMBER = 3;
    private static final LimitCandleV2PushData DEFAULT_INSTANCE;
    private static volatile Parser<LimitCandleV2PushData> PARSER = null;
    public static final int SYMBOL_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 1;
    private long time_;
    private String symbol_ = "";
    private Internal.ProtobufList<String> candles_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.futures.kline.core.model.proto.LimitCandleV2PushData$b */
    public static final class C6643b extends GeneratedMessageLite.Builder<LimitCandleV2PushData, C6643b> implements MessageLiteOrBuilder {
        public /* synthetic */ C6643b(C6642a c6642a) {
            this();
        }

        public C6643b() {
            super(LimitCandleV2PushData.DEFAULT_INSTANCE);
        }
    }

    public static C6643b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LimitCandleV2PushData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LimitCandleV2PushData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.futures.kline.core.model.proto.LimitCandleV2PushData$a */
    public static /* synthetic */ class C6642a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11101a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11101a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11101a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11101a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11101a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11101a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11101a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11101a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        LimitCandleV2PushData limitCandleV2PushData = new LimitCandleV2PushData();
        DEFAULT_INSTANCE = limitCandleV2PushData;
        GeneratedMessageLite.registerDefaultInstance(LimitCandleV2PushData.class, limitCandleV2PushData);
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

    public static LimitCandleV2PushData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6643b newBuilder(LimitCandleV2PushData limitCandleV2PushData) {
        return DEFAULT_INSTANCE.createBuilder(limitCandleV2PushData);
    }

    public static LimitCandleV2PushData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LimitCandleV2PushData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<LimitCandleV2PushData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j11) {
        this.time_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C6642a c6642a = null;
        switch (C6642a.f11101a[methodToInvoke.ordinal()]) {
            case 1:
                return new LimitCandleV2PushData();
            case 2:
                return new C6643b(c6642a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003Ț", new Object[]{"time_", "symbol_", "candles_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LimitCandleV2PushData> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LimitCandleV2PushData.class) {
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

    private LimitCandleV2PushData() {
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

    public static LimitCandleV2PushData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static LimitCandleV2PushData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LimitCandleV2PushData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LimitCandleV2PushData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LimitCandleV2PushData parseFrom(InputStream inputStream) throws IOException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LimitCandleV2PushData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LimitCandleV2PushData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LimitCandleV2PushData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LimitCandleV2PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
