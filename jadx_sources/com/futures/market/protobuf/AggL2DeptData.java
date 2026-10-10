package com.futures.market.protobuf;

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
import p655u7.InterfaceC45128a;

/* JADX INFO: loaded from: classes45.dex */
public final class AggL2DeptData extends GeneratedMessageLite<AggL2DeptData, C6645b> implements MessageLiteOrBuilder {
    public static final int ASKS_FIELD_NUMBER = 3;
    public static final int BIDS_FIELD_NUMBER = 4;
    private static final AggL2DeptData DEFAULT_INSTANCE;
    private static volatile Parser<AggL2DeptData> PARSER = null;
    public static final int SEQUENCE_FIELD_NUMBER = 2;
    public static final int TS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<PriceLevel> asks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<PriceLevel> bids_ = GeneratedMessageLite.emptyProtobufList();
    private long sequence_;
    private long ts_;

    /* JADX INFO: renamed from: com.futures.market.protobuf.AggL2DeptData$b */
    public static final class C6645b extends GeneratedMessageLite.Builder<AggL2DeptData, C6645b> implements MessageLiteOrBuilder {
        public /* synthetic */ C6645b(C6644a c6644a) {
            this();
        }

        public C6645b() {
            super(AggL2DeptData.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAsks(PriceLevel priceLevel) {
        priceLevel.getClass();
        ensureAsksIsMutable();
        this.asks_.add(priceLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBids(PriceLevel priceLevel) {
        priceLevel.getClass();
        ensureBidsIsMutable();
        this.bids_.add(priceLevel);
    }

    public static C6645b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AggL2DeptData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AggL2DeptData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggL2DeptData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.futures.market.protobuf.AggL2DeptData$a */
    public static /* synthetic */ class C6644a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11102a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11102a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11102a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11102a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11102a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11102a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11102a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11102a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AggL2DeptData aggL2DeptData = new AggL2DeptData();
        DEFAULT_INSTANCE = aggL2DeptData;
        GeneratedMessageLite.registerDefaultInstance(AggL2DeptData.class, aggL2DeptData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSequence() {
        this.sequence_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTs() {
        this.ts_ = 0L;
    }

    private void ensureAsksIsMutable() {
        Internal.ProtobufList<PriceLevel> protobufList = this.asks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.asks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureBidsIsMutable() {
        Internal.ProtobufList<PriceLevel> protobufList = this.bids_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bids_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AggL2DeptData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6645b newBuilder(AggL2DeptData aggL2DeptData) {
        return DEFAULT_INSTANCE.createBuilder(aggL2DeptData);
    }

    public static AggL2DeptData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggL2DeptData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AggL2DeptData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<AggL2DeptData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequence(long j11) {
        this.sequence_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTs(long j11) {
        this.ts_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C6644a c6644a = null;
        switch (C6644a.f11102a[methodToInvoke.ordinal()]) {
            case 1:
                return new AggL2DeptData();
            case 2:
                return new C6645b(c6644a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0002\u0002\u0002\u0003\u001b\u0004\u001b", new Object[]{"ts_", "sequence_", "asks_", PriceLevel.class, "bids_", PriceLevel.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AggL2DeptData> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AggL2DeptData.class) {
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

    public PriceLevel getAsks(int i11) {
        return this.asks_.get(i11);
    }

    public int getAsksCount() {
        return this.asks_.size();
    }

    public List<PriceLevel> getAsksList() {
        return this.asks_;
    }

    public InterfaceC45128a getAsksOrBuilder(int i11) {
        return this.asks_.get(i11);
    }

    public List<? extends InterfaceC45128a> getAsksOrBuilderList() {
        return this.asks_;
    }

    public PriceLevel getBids(int i11) {
        return this.bids_.get(i11);
    }

    public int getBidsCount() {
        return this.bids_.size();
    }

    public List<PriceLevel> getBidsList() {
        return this.bids_;
    }

    public InterfaceC45128a getBidsOrBuilder(int i11) {
        return this.bids_.get(i11);
    }

    public List<? extends InterfaceC45128a> getBidsOrBuilderList() {
        return this.bids_;
    }

    public long getSequence() {
        return this.sequence_;
    }

    public long getTs() {
        return this.ts_;
    }

    private AggL2DeptData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAsks(Iterable<? extends PriceLevel> iterable) {
        ensureAsksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.asks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBids(Iterable<? extends PriceLevel> iterable) {
        ensureBidsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsks() {
        this.asks_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBids() {
        this.bids_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static AggL2DeptData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAsks(int i11) {
        ensureAsksIsMutable();
        this.asks_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBids(int i11) {
        ensureBidsIsMutable();
        this.bids_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAsks(int i11, PriceLevel priceLevel) {
        priceLevel.getClass();
        ensureAsksIsMutable();
        this.asks_.set(i11, priceLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBids(int i11, PriceLevel priceLevel) {
        priceLevel.getClass();
        ensureBidsIsMutable();
        this.bids_.set(i11, priceLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAsks(int i11, PriceLevel priceLevel) {
        priceLevel.getClass();
        ensureAsksIsMutable();
        this.asks_.add(i11, priceLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBids(int i11, PriceLevel priceLevel) {
        priceLevel.getClass();
        ensureBidsIsMutable();
        this.bids_.add(i11, priceLevel);
    }

    public static AggL2DeptData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AggL2DeptData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AggL2DeptData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AggL2DeptData parseFrom(InputStream inputStream) throws IOException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggL2DeptData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AggL2DeptData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AggL2DeptData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggL2DeptData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
