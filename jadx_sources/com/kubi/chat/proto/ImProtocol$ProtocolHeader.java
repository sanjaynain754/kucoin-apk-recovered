package com.kubi.chat.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
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
import java.util.List;
import java.util.Map;
import sb.C44374a;

/* JADX INFO: loaded from: classes6.dex */
public final class ImProtocol$ProtocolHeader extends GeneratedMessageLite<ImProtocol$ProtocolHeader, C11391a> implements MessageLiteOrBuilder {
    private static final ImProtocol$ProtocolHeader DEFAULT_INSTANCE;
    public static final int DEVICEID_FIELD_NUMBER = 10;
    public static final int METADATA_FIELD_NUMBER = 6;
    private static volatile Parser<ImProtocol$ProtocolHeader> PARSER = null;
    public static final int ROUTERPATH_FIELD_NUMBER = 7;
    public static final int SEQID_FIELD_NUMBER = 8;
    public static final int SID_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int UID_FIELD_NUMBER = 3;
    public static final int UNIQUEID_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private long seqId_;
    private long timestamp_;
    private int type_;
    private int version_;
    private MapFieldLite<String, String> metadata_ = MapFieldLite.emptyMapField();
    private String uniqueId_ = "";
    private String uid_ = "";
    private String sid_ = "";
    private Internal.ProtobufList<String> routerPath_ = GeneratedMessageLite.emptyProtobufList();
    private String deviceId_ = "";

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$ProtocolHeader$a */
    public static final class C11391a extends GeneratedMessageLite.Builder<ImProtocol$ProtocolHeader, C11391a> implements MessageLiteOrBuilder {
        public /* synthetic */ C11391a(C44374a c44374a) {
            this();
        }

        public C11391a() {
            super(ImProtocol$ProtocolHeader.DEFAULT_INSTANCE);
        }

        public Map<String, String> getMetadataMap() {
            return Collections.unmodifiableMap(((ImProtocol$ProtocolHeader) this.instance).getMetadataMap());
        }

        /* JADX INFO: renamed from: a */
        public C11391a m20354a(Map<String, String> map) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).getMutableMetadataMap().putAll(map);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C11391a m20355b(String str) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setDeviceId(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C11391a m20356c(long j11) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setSeqId(j11);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11391a m20357d(String str) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setSid(str);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C11391a m20358e(long j11) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setTimestamp(j11);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C11391a m20359f(ImProtocol$ProtocolType imProtocol$ProtocolType) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setType(imProtocol$ProtocolType);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C11391a m20360g(String str) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setUid(str);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C11391a m20361h(String str) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setUniqueId(str);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C11391a m20362i(int i11) {
            copyOnWrite();
            ((ImProtocol$ProtocolHeader) this.instance).setVersion(i11);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.kubi.chat.proto.ImProtocol$ProtocolHeader$b */
    public static final class C11392b {

        /* JADX INFO: renamed from: a */
        public static final MapEntryLite<String, String> f19383a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f19383a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static C11391a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ImProtocol$ProtocolHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$ProtocolHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        ImProtocol$ProtocolHeader imProtocol$ProtocolHeader = new ImProtocol$ProtocolHeader();
        DEFAULT_INSTANCE = imProtocol$ProtocolHeader;
        GeneratedMessageLite.registerDefaultInstance(ImProtocol$ProtocolHeader.class, imProtocol$ProtocolHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.bitField0_ &= -5;
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeqId() {
        this.seqId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.bitField0_ &= -3;
        this.sid_ = getDefaultInstance().getSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.bitField0_ &= -2;
        this.uid_ = getDefaultInstance().getUid();
    }

    private void ensureRouterPathIsMutable() {
        Internal.ProtobufList<String> protobufList = this.routerPath_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.routerPath_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ImProtocol$ProtocolHeader getDefaultInstance() {
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

    public static C11391a newBuilder(ImProtocol$ProtocolHeader imProtocol$ProtocolHeader) {
        return DEFAULT_INSTANCE.createBuilder(imProtocol$ProtocolHeader);
    }

    public static ImProtocol$ProtocolHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ImProtocol$ProtocolHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeqId(long j11) {
        this.seqId_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j11) {
        this.timestamp_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i11) {
        this.type_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i11) {
        this.version_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C44374a c44374a = null;
        switch (C44374a.f98034a[methodToInvoke.ordinal()]) {
            case 1:
                return new ImProtocol$ProtocolHeader();
            case 2:
                return new C11391a(c44374a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0001\u0001\u0000\u0001\u0004\u0002Ȉ\u0003ለ\u0000\u0004ለ\u0001\u0005\f\u00062\u0007Ț\b\u0002\t\u0002\nለ\u0002", new Object[]{"bitField0_", "version_", "uniqueId_", "uid_", "sid_", "type_", "metadata_", C11392b.f19383a, "routerPath_", "seqId_", "timestamp_", "deviceId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ImProtocol$ProtocolHeader> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ImProtocol$ProtocolHeader.class) {
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

    public String getDeviceId() {
        return this.deviceId_;
    }

    public ByteString getDeviceIdBytes() {
        return ByteString.copyFromUtf8(this.deviceId_);
    }

    public String getRouterPath(int i11) {
        return this.routerPath_.get(i11);
    }

    public ByteString getRouterPathBytes(int i11) {
        return ByteString.copyFromUtf8(this.routerPath_.get(i11));
    }

    public int getRouterPathCount() {
        return this.routerPath_.size();
    }

    public List<String> getRouterPathList() {
        return this.routerPath_;
    }

    public long getSeqId() {
        return this.seqId_;
    }

    public String getSid() {
        return this.sid_;
    }

    public ByteString getSidBytes() {
        return ByteString.copyFromUtf8(this.sid_);
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public ImProtocol$ProtocolType getType() {
        ImProtocol$ProtocolType imProtocol$ProtocolTypeForNumber = ImProtocol$ProtocolType.forNumber(this.type_);
        return imProtocol$ProtocolTypeForNumber == null ? ImProtocol$ProtocolType.UNRECOGNIZED : imProtocol$ProtocolTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public String getUid() {
        return this.uid_;
    }

    public ByteString getUidBytes() {
        return ByteString.copyFromUtf8(this.uid_);
    }

    public String getUniqueId() {
        return this.uniqueId_;
    }

    public ByteString getUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.uniqueId_);
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasDeviceId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSid() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUid() {
        return (this.bitField0_ & 1) != 0;
    }

    private ImProtocol$ProtocolHeader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouterPath(Iterable<String> iterable) {
        ensureRouterPathIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.routerPath_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouterPath(String str) {
        str.getClass();
        ensureRouterPathIsMutable();
        this.routerPath_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouterPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureRouterPathIsMutable();
        this.routerPath_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouterPath() {
        this.routerPath_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUniqueId() {
        this.uniqueId_ = getDefaultInstance().getUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    public static ImProtocol$ProtocolHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceId_ = byteString.toStringUtf8();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouterPath(int i11, String str) {
        str.getClass();
        ensureRouterPathIsMutable();
        this.routerPath_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sid_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ImProtocol$ProtocolType imProtocol$ProtocolType) {
        this.type_ = imProtocol$ProtocolType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.uid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uid_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueId(String str) {
        str.getClass();
        this.uniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uniqueId_ = byteString.toStringUtf8();
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

    public static ImProtocol$ProtocolHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImProtocol$ProtocolHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolHeader parseFrom(InputStream inputStream) throws IOException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImProtocol$ProtocolHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImProtocol$ProtocolHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ImProtocol$ProtocolHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImProtocol$ProtocolHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
