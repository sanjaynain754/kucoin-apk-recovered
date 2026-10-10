package com.spot.market.protobuf;

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
import nb0.InterfaceC42793a;

/* JADX INFO: loaded from: classes59.dex */
public final class Level2Entry extends GeneratedMessageLite<Level2Entry, C27782b> implements InterfaceC42793a {
    private static final Level2Entry DEFAULT_INSTANCE;
    private static volatile Parser<Level2Entry> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 1;
    public static final int SIZE_FIELD_NUMBER = 2;
    private String price_ = "";
    private String size_ = "";

    /* JADX INFO: renamed from: com.spot.market.protobuf.Level2Entry$b */
    public static final class C27782b extends GeneratedMessageLite.Builder<Level2Entry, C27782b> implements InterfaceC42793a {
        public /* synthetic */ C27782b(C27781a c27781a) {
            this();
        }

        public C27782b() {
            super(Level2Entry.DEFAULT_INSTANCE);
        }
    }

    public static C27782b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Level2Entry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Level2Entry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Level2Entry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.spot.market.protobuf.Level2Entry$a */
    public static /* synthetic */ class C27781a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56538a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f56538a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56538a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56538a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56538a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56538a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56538a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56538a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Level2Entry level2Entry = new Level2Entry();
        DEFAULT_INSTANCE = level2Entry;
        GeneratedMessageLite.registerDefaultInstance(Level2Entry.class, level2Entry);
    }

    public static Level2Entry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27782b newBuilder(Level2Entry level2Entry) {
        return DEFAULT_INSTANCE.createBuilder(level2Entry);
    }

    public static Level2Entry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Level2Entry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Level2Entry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Level2Entry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27781a c27781a = null;
        switch (C27781a.f56538a[methodToInvoke.ordinal()]) {
            case 1:
                return new Level2Entry();
            case 2:
                return new C27782b(c27781a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"price_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Level2Entry> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Level2Entry.class) {
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

    public String getSize() {
        return this.size_;
    }

    public ByteString getSizeBytes() {
        return ByteString.copyFromUtf8(this.size_);
    }

    private Level2Entry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = getDefaultInstance().getPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = getDefaultInstance().getSize();
    }

    public static Level2Entry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(String str) {
        str.getClass();
        this.size_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSizeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.size_ = byteString.toStringUtf8();
    }

    public static Level2Entry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Level2Entry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Level2Entry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Level2Entry parseFrom(InputStream inputStream) throws IOException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Level2Entry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Level2Entry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Level2Entry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Level2Entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
