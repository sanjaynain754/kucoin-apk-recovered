package com.kubi.chat.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import sb.C44374a;

/* JADX INFO: loaded from: classes6.dex */
public final class ImProtocol$Message extends GeneratedMessageLite<ImProtocol$Message, C11386a> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 4;
    private static final ImProtocol$Message DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 5;
    private static volatile Parser<ImProtocol$Message> PARSER = null;
    public static final int TO_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    private MapFieldLite<String, String> metadata_ = MapFieldLite.emptyMapField();
    private String from_ = "";
    private String to_ = "";
    private String content_ = "";

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$Message$a */
    public static final class C11386a extends GeneratedMessageLite.Builder<ImProtocol$Message, C11386a> implements MessageLiteOrBuilder {
        public /* synthetic */ C11386a(C44374a c44374a) {
            this();
        }

        public C11386a() {
            super(ImProtocol$Message.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C11386a m20346a(String str) {
            copyOnWrite();
            ((ImProtocol$Message) this.instance).setContent(str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C11386a m20347b(String str) {
            copyOnWrite();
            ((ImProtocol$Message) this.instance).setFrom(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C11386a m20348c(String str) {
            copyOnWrite();
            ((ImProtocol$Message) this.instance).setTo(str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11386a m20349d(ImProtocol$MessageType imProtocol$MessageType) {
            copyOnWrite();
            ((ImProtocol$Message) this.instance).setType(imProtocol$MessageType);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$Message$b */
    public static final class C11387b {

        /* JADX INFO: renamed from: a */
        public static final MapEntryLite<String, String> f19378a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f19378a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static C11386a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ImProtocol$Message parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$Message parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        ImProtocol$Message imProtocol$Message = new ImProtocol$Message();
        DEFAULT_INSTANCE = imProtocol$Message;
        GeneratedMessageLite.registerDefaultInstance(ImProtocol$Message.class, imProtocol$Message);
    }

    public static ImProtocol$Message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private MapFieldLite<String, String> internalGetMetadata() {
        return this.metadata_;
    }

    private MapFieldLite<String, String> internalGetMutableMetadata() {
        if (!this.metadata_.isMutable()) {
            this.metadata_ = this.metadata_.mutableCopy();
        }
        return this.metadata_;
    }

    public static C11386a newBuilder(ImProtocol$Message imProtocol$Message) {
        return DEFAULT_INSTANCE.createBuilder(imProtocol$Message);
    }

    public static ImProtocol$Message parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$Message parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ImProtocol$Message> parser() {
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
                return new ImProtocol$Message();
            case 2:
                return new C11386a(c44374a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u00052", new Object[]{"from_", "to_", "type_", "content_", "metadata_", C11387b.f19378a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ImProtocol$Message> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ImProtocol$Message.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public String getTo() {
        return this.to_;
    }

    public ByteString getToBytes() {
        return ByteString.copyFromUtf8(this.to_);
    }

    public ImProtocol$MessageType getType() {
        ImProtocol$MessageType imProtocol$MessageTypeForNumber = ImProtocol$MessageType.forNumber(this.type_);
        return imProtocol$MessageTypeForNumber == null ? ImProtocol$MessageType.UNRECOGNIZED : imProtocol$MessageTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    private ImProtocol$Message() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTo() {
        this.to_ = getDefaultInstance().getTo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    public static ImProtocol$Message parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(String str) {
        str.getClass();
        this.to_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.to_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ImProtocol$MessageType imProtocol$MessageType) {
        this.type_ = imProtocol$MessageType.getNumber();
    }

    public boolean containsMetadata(String str) {
        str.getClass();
        return internalGetMetadata().containsKey(str);
    }

    @Deprecated
    public Map<String, String> getMetadata() {
        return getMetadataMap();
    }

    public int getMetadataCount() {
        return internalGetMetadata().size();
    }

    public Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(internalGetMetadata());
    }

    public String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetMetadata = internalGetMetadata();
        if (mapFieldLiteInternalGetMetadata.containsKey(str)) {
            return mapFieldLiteInternalGetMetadata.get(str);
        }
        return str2;
    }

    public String getMetadataOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetMetadata = internalGetMetadata();
        if (mapFieldLiteInternalGetMetadata.containsKey(str)) {
            return mapFieldLiteInternalGetMetadata.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static ImProtocol$Message parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ImProtocol$Message parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImProtocol$Message parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ImProtocol$Message parseFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$Message parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$Message parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ImProtocol$Message parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
