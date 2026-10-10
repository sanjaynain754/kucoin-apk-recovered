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
public final class ContractInstrumentFundingRateMessage extends GeneratedMessageLite<ContractInstrumentFundingRateMessage, C27290b> implements MessageLiteOrBuilder {
    private static final ContractInstrumentFundingRateMessage DEFAULT_INSTANCE;
    public static final int FUNDING_RATE_FIELD_NUMBER = 2;
    public static final int GRANULARITY_FIELD_NUMBER = 1;
    private static volatile Parser<ContractInstrumentFundingRateMessage> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private String fundingRate_ = "";
    private long granularity_;
    private int period_;
    private long timestamp_;

    /* JADX INFO: renamed from: com.kumex.index.pb.ContractInstrumentFundingRateMessage$b */
    public static final class C27290b extends GeneratedMessageLite.Builder<ContractInstrumentFundingRateMessage, C27290b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27290b(C27289a c27289a) {
            this();
        }

        public C27290b() {
            super(ContractInstrumentFundingRateMessage.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = 0;
    }

    public static C27290b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContractInstrumentFundingRateMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kumex.index.pb.ContractInstrumentFundingRateMessage$a */
    public static /* synthetic */ class C27289a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55367a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55367a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55367a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55367a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55367a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55367a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55367a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55367a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ContractInstrumentFundingRateMessage contractInstrumentFundingRateMessage = new ContractInstrumentFundingRateMessage();
        DEFAULT_INSTANCE = contractInstrumentFundingRateMessage;
        GeneratedMessageLite.registerDefaultInstance(ContractInstrumentFundingRateMessage.class, contractInstrumentFundingRateMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGranularity() {
        this.granularity_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static ContractInstrumentFundingRateMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27290b newBuilder(ContractInstrumentFundingRateMessage contractInstrumentFundingRateMessage) {
        return DEFAULT_INSTANCE.createBuilder(contractInstrumentFundingRateMessage);
    }

    public static ContractInstrumentFundingRateMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ContractInstrumentFundingRateMessage> parser() {
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
        C27289a c27289a = null;
        switch (C27289a.f55367a[methodToInvoke.ordinal()]) {
            case 1:
                return new ContractInstrumentFundingRateMessage();
            case 2:
                return new C27290b(c27289a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002\u0004\u0004", new Object[]{"granularity_", "fundingRate_", "timestamp_", "period_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContractInstrumentFundingRateMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ContractInstrumentFundingRateMessage.class) {
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

    public long getTimestamp() {
        return this.timestamp_;
    }

    private ContractInstrumentFundingRateMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFundingRate() {
        this.fundingRate_ = getDefaultInstance().getFundingRate();
    }

    public static ContractInstrumentFundingRateMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static ContractInstrumentFundingRateMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(InputStream inputStream) throws IOException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContractInstrumentFundingRateMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentFundingRateMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
