package com.futures.market.protobuf;

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
import p655u7.InterfaceC45128a;

/* JADX INFO: loaded from: classes45.dex */
public final class PriceLevel extends GeneratedMessageLite<PriceLevel, C6651b> implements InterfaceC45128a {
    private static final PriceLevel DEFAULT_INSTANCE;
    private static volatile Parser<PriceLevel> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 1;
    public static final int SIZE_FIELD_NUMBER = 2;
    private String price_ = "";
    private long size_;

    /* JADX INFO: renamed from: com.futures.market.protobuf.PriceLevel$b */
    public static final class C6651b extends GeneratedMessageLite.Builder<PriceLevel, C6651b> implements InterfaceC45128a {
        public /* synthetic */ C6651b(C6650a c6650a) {
            this();
        }

        public C6651b() {
            super(PriceLevel.DEFAULT_INSTANCE);
        }
    }

    public static C6651b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PriceLevel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PriceLevel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PriceLevel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.futures.market.protobuf.PriceLevel$a */
    public static /* synthetic */ class C6650a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11105a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11105a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11105a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11105a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11105a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11105a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11105a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11105a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        PriceLevel priceLevel = new PriceLevel();
        DEFAULT_INSTANCE = priceLevel;
        GeneratedMessageLite.registerDefaultInstance(PriceLevel.class, priceLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    public static PriceLevel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6651b newBuilder(PriceLevel priceLevel) {
        return DEFAULT_INSTANCE.createBuilder(priceLevel);
    }

    public static PriceLevel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PriceLevel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PriceLevel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<PriceLevel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j11) {
        this.size_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C6650a c6650a = null;
        switch (C6650a.f11105a[methodToInvoke.ordinal()]) {
            case 1:
                return new PriceLevel();
            case 2:
                return new C6651b(c6650a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"price_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PriceLevel> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PriceLevel.class) {
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

    public String getPrice() {
        return this.price_;
    }

    public ByteString getPriceBytes() {
        return ByteString.copyFromUtf8(this.price_);
    }

    public long getSize() {
        return this.size_;
    }

    private PriceLevel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = getDefaultInstance().getPrice();
    }

    public static PriceLevel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(String str) {
        str.getClass();
        this.price_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.price_ = byteString.toStringUtf8();
    }

    public static PriceLevel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PriceLevel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PriceLevel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PriceLevel parseFrom(InputStream inputStream) throws IOException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PriceLevel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PriceLevel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PriceLevel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PriceLevel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
