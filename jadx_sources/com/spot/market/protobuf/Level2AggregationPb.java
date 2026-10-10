package com.spot.market.protobuf;

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
import nb0.InterfaceC42793a;

/* JADX INFO: loaded from: classes59.dex */
public final class Level2AggregationPb extends GeneratedMessageLite<Level2AggregationPb, C27780b> implements MessageLiteOrBuilder {
    public static final int ASKS_FIELD_NUMBER = 2;
    public static final int BIDS_FIELD_NUMBER = 3;
    private static final Level2AggregationPb DEFAULT_INSTANCE;
    private static volatile Parser<Level2AggregationPb> PARSER = null;
    public static final int SEQUENCE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Level2Entry> asks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Level2Entry> bids_ = GeneratedMessageLite.emptyProtobufList();
    private String sequence_ = "";
    private long timestamp_;

    /* JADX INFO: renamed from: com.spot.market.protobuf.Level2AggregationPb$b */
    public static final class C27780b extends GeneratedMessageLite.Builder<Level2AggregationPb, C27780b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27780b(C27779a c27779a) {
            this();
        }

        public C27780b() {
            super(Level2AggregationPb.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAsks(Level2Entry level2Entry) {
        level2Entry.getClass();
        ensureAsksIsMutable();
        this.asks_.add(level2Entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBids(Level2Entry level2Entry) {
        level2Entry.getClass();
        ensureBidsIsMutable();
        this.bids_.add(level2Entry);
    }

    public static C27780b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Level2AggregationPb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Level2AggregationPb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Level2AggregationPb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.spot.market.protobuf.Level2AggregationPb$a */
    public static /* synthetic */ class C27779a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56537a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56537a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56537a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56537a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56537a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56537a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56537a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56537a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Level2AggregationPb level2AggregationPb = new Level2AggregationPb();
        DEFAULT_INSTANCE = level2AggregationPb;
        GeneratedMessageLite.registerDefaultInstance(Level2AggregationPb.class, level2AggregationPb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    private void ensureAsksIsMutable() {
        Internal.ProtobufList<Level2Entry> protobufList = this.asks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.asks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureBidsIsMutable() {
        Internal.ProtobufList<Level2Entry> protobufList = this.bids_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bids_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Level2AggregationPb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27780b newBuilder(Level2AggregationPb level2AggregationPb) {
        return DEFAULT_INSTANCE.createBuilder(level2AggregationPb);
    }

    public static Level2AggregationPb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Level2AggregationPb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Level2AggregationPb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Level2AggregationPb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j11) {
        this.timestamp_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27779a c27779a = null;
        switch (C27779a.f56537a[methodToInvoke.ordinal()]) {
            case 1:
                return new Level2AggregationPb();
            case 2:
                return new C27780b(c27779a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0002\u0002\u001b\u0003\u001b\u0004Ȉ", new Object[]{"timestamp_", "asks_", Level2Entry.class, "bids_", Level2Entry.class, "sequence_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Level2AggregationPb> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Level2AggregationPb.class) {
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

    public Level2Entry getAsks(int i11) {
        return this.asks_.get(i11);
    }

    public int getAsksCount() {
        return this.asks_.size();
    }

    public List<Level2Entry> getAsksList() {
        return this.asks_;
    }

    public InterfaceC42793a getAsksOrBuilder(int i11) {
        return this.asks_.get(i11);
    }

    public List<? extends InterfaceC42793a> getAsksOrBuilderList() {
        return this.asks_;
    }

    public Level2Entry getBids(int i11) {
        return this.bids_.get(i11);
    }

    public int getBidsCount() {
        return this.bids_.size();
    }

    public List<Level2Entry> getBidsList() {
        return this.bids_;
    }

    public InterfaceC42793a getBidsOrBuilder(int i11) {
        return this.bids_.get(i11);
    }

    public List<? extends InterfaceC42793a> getBidsOrBuilderList() {
        return this.bids_;
    }

    public String getSequence() {
        return this.sequence_;
    }

    public ByteString getSequenceBytes() {
        return ByteString.copyFromUtf8(this.sequence_);
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    private Level2AggregationPb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAsks(Iterable<? extends Level2Entry> iterable) {
        ensureAsksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.asks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBids(Iterable<? extends Level2Entry> iterable) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSequence() {
        this.sequence_ = getDefaultInstance().getSequence();
    }

    public static Level2AggregationPb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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
    public void setAsks(int i11, Level2Entry level2Entry) {
        level2Entry.getClass();
        ensureAsksIsMutable();
        this.asks_.set(i11, level2Entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBids(int i11, Level2Entry level2Entry) {
        level2Entry.getClass();
        ensureBidsIsMutable();
        this.bids_.set(i11, level2Entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequence(String str) {
        str.getClass();
        this.sequence_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequenceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sequence_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAsks(int i11, Level2Entry level2Entry) {
        level2Entry.getClass();
        ensureAsksIsMutable();
        this.asks_.add(i11, level2Entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBids(int i11, Level2Entry level2Entry) {
        level2Entry.getClass();
        ensureBidsIsMutable();
        this.bids_.add(i11, level2Entry);
    }

    public static Level2AggregationPb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Level2AggregationPb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Level2AggregationPb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Level2AggregationPb parseFrom(InputStream inputStream) throws IOException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Level2AggregationPb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Level2AggregationPb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Level2AggregationPb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Level2AggregationPb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
