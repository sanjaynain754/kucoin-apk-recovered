package com.kucoin.push.client.proto;

import c90.C4917a;
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
public final class MessagePayloadProto$MessagePayload extends GeneratedMessageLite<MessagePayloadProto$MessagePayload, C27282a> implements MessageLiteOrBuilder {
    public static final int CHANNELTYPE_FIELD_NUMBER = 6;
    public static final int DATA_FIELD_NUMBER = 8;
    private static final MessagePayloadProto$MessagePayload DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 4;
    private static volatile Parser<MessagePayloadProto$MessagePayload> PARSER = null;
    public static final int SN_FIELD_NUMBER = 7;
    public static final int SUBJECT_FIELD_NUMBER = 2;
    public static final int TOPIC_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USERID_FIELD_NUMBER = 5;
    private long sn_;
    private String topic_ = "";
    private String subject_ = "";
    private String type_ = "";
    private String id_ = "";
    private String userId_ = "";
    private String channelType_ = "";
    private ByteString data_ = ByteString.EMPTY;

    /* JADX INFO: renamed from: com.kucoin.push.client.proto.MessagePayloadProto$MessagePayload$a */
    public static final class C27282a extends GeneratedMessageLite.Builder<MessagePayloadProto$MessagePayload, C27282a> implements MessageLiteOrBuilder {
        public /* synthetic */ C27282a(C4917a c4917a) {
            this();
        }

        public C27282a() {
            super(MessagePayloadProto$MessagePayload.DEFAULT_INSTANCE);
        }
    }

    public static C27282a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagePayloadProto$MessagePayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        MessagePayloadProto$MessagePayload messagePayloadProto$MessagePayload = new MessagePayloadProto$MessagePayload();
        DEFAULT_INSTANCE = messagePayloadProto$MessagePayload;
        GeneratedMessageLite.registerDefaultInstance(MessagePayloadProto$MessagePayload.class, messagePayloadProto$MessagePayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSn() {
        this.sn_ = 0L;
    }

    public static MessagePayloadProto$MessagePayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27282a newBuilder(MessagePayloadProto$MessagePayload messagePayloadProto$MessagePayload) {
        return DEFAULT_INSTANCE.createBuilder(messagePayloadProto$MessagePayload);
    }

    public static MessagePayloadProto$MessagePayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<MessagePayloadProto$MessagePayload> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSn(long j11) {
        this.sn_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C4917a c4917a = null;
        switch (C4917a.f5456a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessagePayloadProto$MessagePayload();
            case 2:
                return new C27282a(c4917a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0002\b\n", new Object[]{"topic_", "subject_", "type_", "id_", "userId_", "channelType_", "sn_", "data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagePayloadProto$MessagePayload> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagePayloadProto$MessagePayload.class) {
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

    public String getChannelType() {
        return this.channelType_;
    }

    public ByteString getChannelTypeBytes() {
        return ByteString.copyFromUtf8(this.channelType_);
    }

    public ByteString getData() {
        return this.data_;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public long getSn() {
        return this.sn_;
    }

    public String getSubject() {
        return this.subject_;
    }

    public ByteString getSubjectBytes() {
        return ByteString.copyFromUtf8(this.subject_);
    }

    public String getTopic() {
        return this.topic_;
    }

    public ByteString getTopicBytes() {
        return ByteString.copyFromUtf8(this.topic_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public String getUserId() {
        return this.userId_;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.userId_);
    }

    private MessagePayloadProto$MessagePayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannelType() {
        this.channelType_ = getDefaultInstance().getChannelType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubject() {
        this.subject_ = getDefaultInstance().getSubject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopic() {
        this.topic_ = getDefaultInstance().getTopic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    public static MessagePayloadProto$MessagePayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelType(String str) {
        str.getClass();
        this.channelType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.channelType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubject(String str) {
        str.getClass();
        this.subject_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subject_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopic(String str) {
        str.getClass();
        this.topic_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topic_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        str.getClass();
        this.userId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userId_ = byteString.toStringUtf8();
    }

    public static MessagePayloadProto$MessagePayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(InputStream inputStream) throws IOException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagePayloadProto$MessagePayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagePayloadProto$MessagePayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
