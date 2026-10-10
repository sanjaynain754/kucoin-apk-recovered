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
public final class ContractInstrumentMarkIndexPriceMessage extends GeneratedMessageLite<ContractInstrumentMarkIndexPriceMessage, C27292b> implements MessageLiteOrBuilder {
    private static final ContractInstrumentMarkIndexPriceMessage DEFAULT_INSTANCE;
    public static final int GRANULARITY_FIELD_NUMBER = 1;
    public static final int INDEX_PRICE_FIELD_NUMBER = 3;
    public static final int MARK_PRICE_FIELD_NUMBER = 2;
    private static volatile Parser<ContractInstrumentMarkIndexPriceMessage> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private long granularity_;
    private long timestamp_;
    private String markPrice_ = "";
    private String indexPrice_ = "";

    /* JADX INFO: renamed from: com.kumex.index.pb.ContractInstrumentMarkIndexPriceMessage$b */
    public static final class C27292b extends GeneratedMessageLite.Builder<ContractInstrumentMarkIndexPriceMessage, C27292b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27292b(C27291a c27291a) {
            this();
        }

        public C27292b() {
            super(ContractInstrumentMarkIndexPriceMessage.DEFAULT_INSTANCE);
        }
    }

    public static C27292b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContractInstrumentMarkIndexPriceMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kumex.index.pb.ContractInstrumentMarkIndexPriceMessage$a */
    public static /* synthetic */ class C27291a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55368a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55368a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55368a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55368a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55368a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55368a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55368a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55368a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ContractInstrumentMarkIndexPriceMessage contractInstrumentMarkIndexPriceMessage = new ContractInstrumentMarkIndexPriceMessage();
        DEFAULT_INSTANCE = contractInstrumentMarkIndexPriceMessage;
        GeneratedMessageLite.registerDefaultInstance(ContractInstrumentMarkIndexPriceMessage.class, contractInstrumentMarkIndexPriceMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGranularity() {
        this.granularity_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static ContractInstrumentMarkIndexPriceMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27292b newBuilder(ContractInstrumentMarkIndexPriceMessage contractInstrumentMarkIndexPriceMessage) {
        return DEFAULT_INSTANCE.createBuilder(contractInstrumentMarkIndexPriceMessage);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ContractInstrumentMarkIndexPriceMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGranularity(long j11) {
        this.granularity_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j11) {
        this.timestamp_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27291a c27291a = null;
        switch (C27291a.f55368a[methodToInvoke.ordinal()]) {
            case 1:
                return new ContractInstrumentMarkIndexPriceMessage();
            case 2:
                return new C27292b(c27291a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004\u0002", new Object[]{"granularity_", "markPrice_", "indexPrice_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContractInstrumentMarkIndexPriceMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ContractInstrumentMarkIndexPriceMessage.class) {
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

    public long getGranularity() {
        return this.granularity_;
    }

    public String getIndexPrice() {
        return this.indexPrice_;
    }

    public ByteString getIndexPriceBytes() {
        return ByteString.copyFromUtf8(this.indexPrice_);
    }

    public String getMarkPrice() {
        return this.markPrice_;
    }

    public ByteString getMarkPriceBytes() {
        return ByteString.copyFromUtf8(this.markPrice_);
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    private ContractInstrumentMarkIndexPriceMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndexPrice() {
        this.indexPrice_ = getDefaultInstance().getIndexPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkPrice() {
        this.markPrice_ = getDefaultInstance().getMarkPrice();
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndexPrice(String str) {
        str.getClass();
        this.indexPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndexPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.indexPrice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkPrice(String str) {
        str.getClass();
        this.markPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.markPrice_ = byteString.toStringUtf8();
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(InputStream inputStream) throws IOException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContractInstrumentMarkIndexPriceMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractInstrumentMarkIndexPriceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
