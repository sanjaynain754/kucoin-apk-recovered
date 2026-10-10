package com.kumex.index.p121pb;

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
public final class ContractInstrumentAllFundingRateMessage extends GeneratedMessageLite<ContractInstrumentAllFundingRateMessage, C27286b> implements MessageLiteOrBuilder {
    private static final ContractInstrumentAllFundingRateMessage DEFAULT_INSTANCE;
    public static final int FUNDING_RATE_FIELD_NUMBER = 2;
    public static final int GRANULARITY_FIELD_NUMBER = 1;
    private static volatile Parser<ContractInstrumentAllFundingRateMessage> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 4;
    public static final int SYMBOL_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long granularity_;
    private int period_;
    private long timestamp_;
    private String fundingRate_ = "";
    private String symbol_ = "";

    /* JADX INFO: renamed from: com.kumex.index.pb.ContractInstrumentAllFundingRateMessage$b */
    public static final class C27286b extends GeneratedMessageLite.Builder<ContractInstrumentAllFundingRateMessage, C27286b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27286b(C27285a c27285a) {
            this();
        }

        public C27286b() {
            super(ContractInstrumentAllFundingRateMessage.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = 0;
    }

    public static C27286b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContractInstrumentAllFundingRateMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kumex.index.pb.ContractInstrumentAllFundingRateMessage$a */
    public static /* synthetic */ class C27285a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55365a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55365a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55365a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55365a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55365a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55365a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55365a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55365a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ContractInstrumentAllFundingRateMessage contractInstrumentAllFundingRateMessage = new ContractInstrumentAllFundingRateMessage();
        DEFAULT_INSTANCE = contractInstrumentAllFundingRateMessage;
        GeneratedMessageLite.registerDefaultInstance(ContractInstrumentAllFundingRateMessage.class, contractInstrumentAllFundingRateMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGranularity() {
        this.granularity_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static ContractInstrumentAllFundingRateMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27286b newBuilder(ContractInstrumentAllFundingRateMessage contractInstrumentAllFundingRateMessage) {
        return DEFAULT_INSTANCE.createBuilder(contractInstrumentAllFundingRateMessage);
    }

    public static ContractInstrumentAllFundingRateMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ContractInstrumentAllFundingRateMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGranularity(long j11) {
        this.granularity_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriod(int i11) {
        this.period_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j11) {
        this.timestamp_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27285a c27285a = null;
        switch (C27285a.f55365a[methodToInvoke.ordinal()]) {
            case 1:
                return new ContractInstrumentAllFundingRateMessage();
            case 2:
                return new C27286b(c27285a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002\u0004\u0004\u0005Ȉ", new Object[]{"granularity_", "fundingRate_", "timestamp_", "period_", "symbol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContractInstrumentAllFundingRateMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ContractInstrumentAllFundingRateMessage.class) {
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

    public String getFundingRate() {
        return this.fundingRate_;
    }

    public ByteString getFundingRateBytes() {
        return ByteString.copyFromUtf8(this.fundingRate_);
    }

    public long getGranularity() {
        return this.granularity_;
    }

    public int getPeriod() {
        return this.period_;
    }

    public String getSymbol() {
        return this.symbol_;
    }

    public ByteString getSymbolBytes() {
        return ByteString.copyFromUtf8(this.symbol_);
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    private ContractInstrumentAllFundingRateMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFundingRate() {
        this.fundingRate_ = getDefaultInstance().getFundingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymbol() {
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFundingRate(String str) {
        str.getClass();
        this.fundingRate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFundingRateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fundingRate_ = byteString.toStringUtf8();
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

    public static ContractInstrumentAllFundingRateMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(InputStream inputStream) throws IOException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContractInstrumentAllFundingRateMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentAllFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
