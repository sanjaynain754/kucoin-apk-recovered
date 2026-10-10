package com.kubi.chat.proto;

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
public final class ImProtocol$ProtocolFrame extends GeneratedMessageLite<ImProtocol$ProtocolFrame, C11390a> implements MessageLiteOrBuilder {
    private static final ImProtocol$ProtocolFrame DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int INSTRUMENT_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<ImProtocol$ProtocolFrame> PARSER;
    private int bodyCase_ = 0;
    private Object body_;
    private ImProtocol$ProtocolHeader header_;

    public enum BodyCase {
        MESSAGE(2),
        INSTRUMENT(3),
        BODY_NOT_SET(0);

        private final int value;

        public static BodyCase forNumber(int i11) {
            if (i11 == 0) {
                return BODY_NOT_SET;
            }
            if (i11 == 2) {
                return MESSAGE;
            }
            if (i11 != 3) {
                return null;
            }
            return INSTRUMENT;
        }

        @Deprecated
        public static BodyCase valueOf(int i11) {
            return forNumber(i11);
        }

        public int getNumber() {
            return this.value;
        }

        BodyCase(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$ProtocolFrame$a */
    public static final class C11390a extends GeneratedMessageLite.Builder<ImProtocol$ProtocolFrame, C11390a> implements MessageLiteOrBuilder {
        public /* synthetic */ C11390a(C44374a c44374a) {
            this();
        }

        public C11390a() {
            super(ImProtocol$ProtocolFrame.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C11390a m20351a(ImProtocol$ProtocolHeader imProtocol$ProtocolHeader) {
            copyOnWrite();
            ((ImProtocol$ProtocolFrame) this.instance).setHeader(imProtocol$ProtocolHeader);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C11390a m20352b(ImProtocol$Instrument imProtocol$Instrument) {
            copyOnWrite();
            ((ImProtocol$ProtocolFrame) this.instance).setInstrument(imProtocol$Instrument);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C11390a m20353c(ImProtocol$Message imProtocol$Message) {
            copyOnWrite();
            ((ImProtocol$ProtocolFrame) this.instance).setMessage(imProtocol$Message);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.bodyCase_ = 0;
        this.body_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeader() {
        this.header_ = null;
    }

    public static C11390a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ImProtocol$ProtocolFrame parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$ProtocolFrame parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        ImProtocol$ProtocolFrame imProtocol$ProtocolFrame = new ImProtocol$ProtocolFrame();
        DEFAULT_INSTANCE = imProtocol$ProtocolFrame;
        GeneratedMessageLite.registerDefaultInstance(ImProtocol$ProtocolFrame.class, imProtocol$ProtocolFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstrument() {
        if (this.bodyCase_ == 3) {
            this.bodyCase_ = 0;
            this.body_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        if (this.bodyCase_ == 2) {
            this.bodyCase_ = 0;
            this.body_ = null;
        }
    }

    public static ImProtocol$ProtocolFrame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11390a newBuilder(ImProtocol$ProtocolFrame imProtocol$ProtocolFrame) {
        return DEFAULT_INSTANCE.createBuilder(imProtocol$ProtocolFrame);
    }

    public static ImProtocol$ProtocolFrame parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolFrame parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ImProtocol$ProtocolFrame> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C44374a c44374a = null;
        switch (C44374a.f98034a[methodToInvoke.ordinal()]) {
            case 1:
                return new ImProtocol$ProtocolFrame();
            case 2:
                return new C11390a(c44374a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000", new Object[]{"body_", "bodyCase_", "header_", ImProtocol$Message.class, ImProtocol$Instrument.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ImProtocol$ProtocolFrame> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ImProtocol$ProtocolFrame.class) {
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

    public BodyCase getBodyCase() {
        return BodyCase.forNumber(this.bodyCase_);
    }

    public ImProtocol$ProtocolHeader getHeader() {
        ImProtocol$ProtocolHeader imProtocol$ProtocolHeader = this.header_;
        return imProtocol$ProtocolHeader == null ? ImProtocol$ProtocolHeader.getDefaultInstance() : imProtocol$ProtocolHeader;
    }

    public ImProtocol$Instrument getInstrument() {
        return this.bodyCase_ == 3 ? (ImProtocol$Instrument) this.body_ : ImProtocol$Instrument.getDefaultInstance();
    }

    public ImProtocol$Message getMessage() {
        return this.bodyCase_ == 2 ? (ImProtocol$Message) this.body_ : ImProtocol$Message.getDefaultInstance();
    }

    public boolean hasHeader() {
        return this.header_ != null;
    }

    public boolean hasInstrument() {
        return this.bodyCase_ == 3;
    }

    public boolean hasMessage() {
        return this.bodyCase_ == 2;
    }

    private ImProtocol$ProtocolFrame() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeader(ImProtocol$ProtocolHeader imProtocol$ProtocolHeader) {
        imProtocol$ProtocolHeader.getClass();
        ImProtocol$ProtocolHeader imProtocol$ProtocolHeader2 = this.header_;
        if (imProtocol$ProtocolHeader2 != null && imProtocol$ProtocolHeader2 != ImProtocol$ProtocolHeader.getDefaultInstance()) {
            this.header_ = ImProtocol$ProtocolHeader.newBuilder(this.header_).mergeFrom(imProtocol$ProtocolHeader).buildPartial();
        } else {
            this.header_ = imProtocol$ProtocolHeader;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstrument(ImProtocol$Instrument imProtocol$Instrument) {
        imProtocol$Instrument.getClass();
        if (this.bodyCase_ == 3 && this.body_ != ImProtocol$Instrument.getDefaultInstance()) {
            this.body_ = ImProtocol$Instrument.newBuilder((ImProtocol$Instrument) this.body_).mergeFrom(imProtocol$Instrument).buildPartial();
        } else {
            this.body_ = imProtocol$Instrument;
        }
        this.bodyCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessage(ImProtocol$Message imProtocol$Message) {
        imProtocol$Message.getClass();
        if (this.bodyCase_ == 2 && this.body_ != ImProtocol$Message.getDefaultInstance()) {
            this.body_ = ImProtocol$Message.newBuilder((ImProtocol$Message) this.body_).mergeFrom(imProtocol$Message).buildPartial();
        } else {
            this.body_ = imProtocol$Message;
        }
        this.bodyCase_ = 2;
    }

    public static ImProtocol$ProtocolFrame parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(ImProtocol$ProtocolHeader imProtocol$ProtocolHeader) {
        imProtocol$ProtocolHeader.getClass();
        this.header_ = imProtocol$ProtocolHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstrument(ImProtocol$Instrument imProtocol$Instrument) {
        imProtocol$Instrument.getClass();
        this.body_ = imProtocol$Instrument;
        this.bodyCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(ImProtocol$Message imProtocol$Message) {
        imProtocol$Message.getClass();
        this.body_ = imProtocol$Message;
        this.bodyCase_ = 2;
    }

    public static ImProtocol$ProtocolFrame parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolFrame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImProtocol$ProtocolFrame parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolFrame parseFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$ProtocolFrame parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolFrame parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ImProtocol$ProtocolFrame parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$ProtocolFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
