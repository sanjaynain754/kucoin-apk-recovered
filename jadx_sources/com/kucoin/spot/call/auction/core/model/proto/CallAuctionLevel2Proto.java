package com.kucoin.spot.call.auction.core.model.proto;

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
public final class CallAuctionLevel2Proto extends GeneratedMessageLite<CallAuctionLevel2Proto, C27284b> implements MessageLiteOrBuilder {
    public static final int ASKS_FIELD_NUMBER = 4;
    public static final int BIDS_FIELD_NUMBER = 3;
    private static final CallAuctionLevel2Proto DEFAULT_INSTANCE;
    private static volatile Parser<CallAuctionLevel2Proto> PARSER = null;
    public static final int SEQUENCE_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 1;
    private long sequence_;
    private long time_;
    private Internal.ProtobufList<String> bids_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> asks_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kucoin.spot.call.auction.core.model.proto.CallAuctionLevel2Proto$b */
    public static final class C27284b extends GeneratedMessageLite.Builder<CallAuctionLevel2Proto, C27284b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27284b(C27283a c27283a) {
            this();
        }

        public C27284b() {
            super(CallAuctionLevel2Proto.DEFAULT_INSTANCE);
        }
    }

    public static C27284b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CallAuctionLevel2Proto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CallAuctionLevel2Proto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.spot.call.auction.core.model.proto.CallAuctionLevel2Proto$a */
    public static /* synthetic */ class C27283a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55362a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55362a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55362a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55362a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55362a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55362a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55362a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55362a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CallAuctionLevel2Proto callAuctionLevel2Proto = new CallAuctionLevel2Proto();
        DEFAULT_INSTANCE = callAuctionLevel2Proto;
        GeneratedMessageLite.registerDefaultInstance(CallAuctionLevel2Proto.class, callAuctionLevel2Proto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSequence() {
        this.sequence_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    private void ensureAsksIsMutable() {
        Internal.ProtobufList<String> protobufList = this.asks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.asks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureBidsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.bids_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bids_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CallAuctionLevel2Proto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27284b newBuilder(CallAuctionLevel2Proto callAuctionLevel2Proto) {
        return DEFAULT_INSTANCE.createBuilder(callAuctionLevel2Proto);
    }

    public static CallAuctionLevel2Proto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CallAuctionLevel2Proto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CallAuctionLevel2Proto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequence(long j11) {
        this.sequence_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j11) {
        this.time_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27283a c27283a = null;
        switch (C27283a.f55362a[methodToInvoke.ordinal()]) {
            case 1:
                return new CallAuctionLevel2Proto();
            case 2:
                return new C27284b(c27283a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț", new Object[]{"time_", "sequence_", "bids_", "asks_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CallAuctionLevel2Proto> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CallAuctionLevel2Proto.class) {
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

    public String getAsks(int i11) {
        return this.asks_.get(i11);
    }

    public ByteString getAsksBytes(int i11) {
        return ByteString.copyFromUtf8(this.asks_.get(i11));
    }

    public int getAsksCount() {
        return this.asks_.size();
    }

    public List<String> getAsksList() {
        return this.asks_;
    }

    public String getBids(int i11) {
        return this.bids_.get(i11);
    }

    public ByteString getBidsBytes(int i11) {
        return ByteString.copyFromUtf8(this.bids_.get(i11));
    }

    public int getBidsCount() {
        return this.bids_.size();
    }

    public List<String> getBidsList() {
        return this.bids_;
    }

    public long getSequence() {
        return this.sequence_;
    }

    public long getTime() {
        return this.time_;
    }

    private CallAuctionLevel2Proto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAsks(Iterable<String> iterable) {
        ensureAsksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.asks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBids(Iterable<String> iterable) {
        ensureBidsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAsks(String str) {
        str.getClass();
        ensureAsksIsMutable();
        this.asks_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAsksBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAsksIsMutable();
        this.asks_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBids(String str) {
        str.getClass();
        ensureBidsIsMutable();
        this.bids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBidsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBidsIsMutable();
        this.bids_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsks() {
        this.asks_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBids() {
        this.bids_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static CallAuctionLevel2Proto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAsks(int i11, String str) {
        str.getClass();
        ensureAsksIsMutable();
        this.asks_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBids(int i11, String str) {
        str.getClass();
        ensureBidsIsMutable();
        this.bids_.set(i11, str);
    }

    public static CallAuctionLevel2Proto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CallAuctionLevel2Proto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CallAuctionLevel2Proto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CallAuctionLevel2Proto parseFrom(InputStream inputStream) throws IOException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CallAuctionLevel2Proto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CallAuctionLevel2Proto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CallAuctionLevel2Proto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CallAuctionLevel2Proto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
