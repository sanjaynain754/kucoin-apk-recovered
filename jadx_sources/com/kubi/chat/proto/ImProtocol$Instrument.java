package com.kubi.chat.proto;

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
import sb.C44374a;

/* JADX INFO: loaded from: classes6.dex */
public final class ImProtocol$Instrument extends GeneratedMessageLite<ImProtocol$Instrument, C11383a> implements MessageLiteOrBuilder {
    private static final ImProtocol$Instrument DEFAULT_INSTANCE;
    public static final int MSG_FIELD_NUMBER = 2;
    private static volatile Parser<ImProtocol$Instrument> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String msg_ = "";
    private int type_;

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$Instrument$a */
    public static final class C11383a extends GeneratedMessageLite.Builder<ImProtocol$Instrument, C11383a> implements MessageLiteOrBuilder {
        public /* synthetic */ C11383a(C44374a c44374a) {
            this();
        }

        public C11383a() {
            super(ImProtocol$Instrument.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C11383a m20344a(ImProtocol$InstrumentType imProtocol$InstrumentType) {
            copyOnWrite();
            ((ImProtocol$Instrument) this.instance).setType(imProtocol$InstrumentType);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static C11383a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ImProtocol$Instrument parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$Instrument parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        ImProtocol$Instrument imProtocol$Instrument = new ImProtocol$Instrument();
        DEFAULT_INSTANCE = imProtocol$Instrument;
        GeneratedMessageLite.registerDefaultInstance(ImProtocol$Instrument.class, imProtocol$Instrument);
    }

    public static ImProtocol$Instrument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11383a newBuilder(ImProtocol$Instrument imProtocol$Instrument) {
        return DEFAULT_INSTANCE.createBuilder(imProtocol$Instrument);
    }

    public static ImProtocol$Instrument parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$Instrument parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ImProtocol$Instrument> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i11) {
        this.type_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C44374a c44374a = null;
        switch (C44374a.f98034a[methodToInvoke.ordinal()]) {
            case 1:
                return new ImProtocol$Instrument();
            case 2:
                return new C11383a(c44374a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "msg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ImProtocol$Instrument> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ImProtocol$Instrument.class) {
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

    public String getMsg() {
        return this.msg_;
    }

    public ByteString getMsgBytes() {
        return ByteString.copyFromUtf8(this.msg_);
    }

    public ImProtocol$InstrumentType getType() {
        ImProtocol$InstrumentType imProtocol$InstrumentTypeForNumber = ImProtocol$InstrumentType.forNumber(this.type_);
        return imProtocol$InstrumentTypeForNumber == null ? ImProtocol$InstrumentType.UNRECOGNIZED : imProtocol$InstrumentTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    private ImProtocol$Instrument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    public static ImProtocol$Instrument parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ImProtocol$InstrumentType imProtocol$InstrumentType) {
        this.type_ = imProtocol$InstrumentType.getNumber();
    }

    public static ImProtocol$Instrument parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ImProtocol$Instrument parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImProtocol$Instrument parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ImProtocol$Instrument parseFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$Instrument parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$Instrument parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ImProtocol$Instrument parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$Instrument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
