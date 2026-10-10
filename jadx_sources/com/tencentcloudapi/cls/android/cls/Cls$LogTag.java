package com.tencentcloudapi.cls.android.cls;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import ic0.C38516a;
import ic0.InterfaceC38518c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Cls$LogTag extends GeneratedMessageLite<Cls$LogTag, C35859a> implements InterfaceC38518c {
    private static final Cls$LogTag DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<Cls$LogTag> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String key_ = "";
    private String value_ = "";

    /* JADX INFO: renamed from: com.tencentcloudapi.cls.android.cls.Cls$LogTag$a */
    public static final class C35859a extends GeneratedMessageLite.Builder<Cls$LogTag, C35859a> implements InterfaceC38518c {
        public /* synthetic */ C35859a(C38516a c38516a) {
            this();
        }

        public C35859a() {
            super(Cls$LogTag.DEFAULT_INSTANCE);
        }
    }

    public static C35859a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cls$LogTag parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cls$LogTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$LogTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        Cls$LogTag cls$LogTag = new Cls$LogTag();
        DEFAULT_INSTANCE = cls$LogTag;
        GeneratedMessageLite.registerDefaultInstance(Cls$LogTag.class, cls$LogTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = getDefaultInstance().getValue();
    }

    public static Cls$LogTag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C35859a newBuilder(Cls$LogTag cls$LogTag) {
        return DEFAULT_INSTANCE.createBuilder(cls$LogTag);
    }

    public static Cls$LogTag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$LogTag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Cls$LogTag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C38516a c38516a = null;
        switch (C38516a.f86478a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cls$LogTag();
            case 2:
                return new C35859a(c38516a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"bitField0_", AbstractC28133l.UNIQUE_KEY_PREFIX, "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cls$LogTag> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cls$LogTag.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getKey() {
        return this.key_;
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    public String getValue() {
        return this.value_;
    }

    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    private Cls$LogTag() {
    }

    public static Cls$LogTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        this.key_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(ByteString byteString) {
        this.value_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    public static Cls$LogTag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cls$LogTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cls$LogTag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cls$LogTag parseFrom(InputStream inputStream) throws IOException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$LogTag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$LogTag parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cls$LogTag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
