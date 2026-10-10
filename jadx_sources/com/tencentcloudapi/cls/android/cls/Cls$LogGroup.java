package com.tencentcloudapi.cls.android.cls;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ic0.C38516a;
import ic0.InterfaceC38517b;
import ic0.InterfaceC38518c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Cls$LogGroup extends GeneratedMessageLite<Cls$LogGroup, C35857a> implements InterfaceC38517b {
    public static final int CONTEXTFLOW_FIELD_NUMBER = 2;
    private static final Cls$LogGroup DEFAULT_INSTANCE;
    public static final int FILENAME_FIELD_NUMBER = 3;
    public static final int HOSTNAME_FIELD_NUMBER = 6;
    public static final int LOGS_FIELD_NUMBER = 1;
    public static final int LOGTAGS_FIELD_NUMBER = 5;
    private static volatile Parser<Cls$LogGroup> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private Internal.ProtobufList<Cls$Log> logs_ = GeneratedMessageLite.emptyProtobufList();
    private String contextFlow_ = "";
    private String filename_ = "";
    private String source_ = "";
    private Internal.ProtobufList<Cls$LogTag> logTags_ = GeneratedMessageLite.emptyProtobufList();
    private String hostname_ = "";

    /* JADX INFO: renamed from: com.tencentcloudapi.cls.android.cls.Cls$LogGroup$a */
    public static final class C35857a extends GeneratedMessageLite.Builder<Cls$LogGroup, C35857a> implements InterfaceC38517b {
        public /* synthetic */ C35857a(C38516a c38516a) {
            this();
        }

        public C35857a() {
            super(Cls$LogGroup.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C35857a m79341a(Cls$Log.C35855a c35855a) {
            copyOnWrite();
            ((Cls$LogGroup) this.instance).addLogs(c35855a.build());
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C35857a m79342b(String str) {
            copyOnWrite();
            ((Cls$LogGroup) this.instance).setContextFlow(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C35857a m79343c(String str) {
            copyOnWrite();
            ((Cls$LogGroup) this.instance).setFilename(str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C35857a m79344d(String str) {
            copyOnWrite();
            ((Cls$LogGroup) this.instance).setSource(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogTags(Cls$LogTag cls$LogTag) {
        cls$LogTag.getClass();
        ensureLogTagsIsMutable();
        this.logTags_.add(cls$LogTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(Cls$Log cls$Log) {
        cls$Log.getClass();
        ensureLogsIsMutable();
        this.logs_.add(cls$Log);
    }

    public static C35857a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cls$LogGroup parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cls$LogGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$LogGroup parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        Cls$LogGroup cls$LogGroup = new Cls$LogGroup();
        DEFAULT_INSTANCE = cls$LogGroup;
        GeneratedMessageLite.registerDefaultInstance(Cls$LogGroup.class, cls$LogGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextFlow() {
        this.bitField0_ &= -2;
        this.contextFlow_ = getDefaultInstance().getContextFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilename() {
        this.bitField0_ &= -3;
        this.filename_ = getDefaultInstance().getFilename();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHostname() {
        this.bitField0_ &= -9;
        this.hostname_ = getDefaultInstance().getHostname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -5;
        this.source_ = getDefaultInstance().getSource();
    }

    private void ensureLogTagsIsMutable() {
        Internal.ProtobufList<Cls$LogTag> protobufList = this.logTags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.logTags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureLogsIsMutable() {
        Internal.ProtobufList<Cls$Log> protobufList = this.logs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Cls$LogGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C35857a newBuilder(Cls$LogGroup cls$LogGroup) {
        return DEFAULT_INSTANCE.createBuilder(cls$LogGroup);
    }

    public static Cls$LogGroup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$LogGroup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Cls$LogGroup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C38516a c38516a = null;
        switch (C38516a.f86478a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cls$LogGroup();
            case 2:
                return new C35857a(c38516a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0002\u0001Л\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005Л\u0006ဈ\u0003", new Object[]{"bitField0_", "logs_", Cls$Log.class, "contextFlow_", "filename_", "source_", "logTags_", Cls$LogTag.class, "hostname_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cls$LogGroup> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cls$LogGroup.class) {
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

    public String getContextFlow() {
        return this.contextFlow_;
    }

    public ByteString getContextFlowBytes() {
        return ByteString.copyFromUtf8(this.contextFlow_);
    }

    public String getFilename() {
        return this.filename_;
    }

    public ByteString getFilenameBytes() {
        return ByteString.copyFromUtf8(this.filename_);
    }

    public String getHostname() {
        return this.hostname_;
    }

    public ByteString getHostnameBytes() {
        return ByteString.copyFromUtf8(this.hostname_);
    }

    public Cls$LogTag getLogTags(int i11) {
        return this.logTags_.get(i11);
    }

    public int getLogTagsCount() {
        return this.logTags_.size();
    }

    public List<Cls$LogTag> getLogTagsList() {
        return this.logTags_;
    }

    public InterfaceC38518c getLogTagsOrBuilder(int i11) {
        return this.logTags_.get(i11);
    }

    public List<? extends InterfaceC38518c> getLogTagsOrBuilderList() {
        return this.logTags_;
    }

    public Cls$Log getLogs(int i11) {
        return this.logs_.get(i11);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public List<Cls$Log> getLogsList() {
        return this.logs_;
    }

    public InterfaceC35860a getLogsOrBuilder(int i11) {
        return this.logs_.get(i11);
    }

    public List<? extends InterfaceC35860a> getLogsOrBuilderList() {
        return this.logs_;
    }

    public String getSource() {
        return this.source_;
    }

    public ByteString getSourceBytes() {
        return ByteString.copyFromUtf8(this.source_);
    }

    public boolean hasContextFlow() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFilename() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHostname() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 4) != 0;
    }

    private Cls$LogGroup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogTags(Iterable<? extends Cls$LogTag> iterable) {
        ensureLogTagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logTags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends Cls$Log> iterable) {
        ensureLogsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogTags() {
        this.logTags_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Cls$LogGroup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogTags(int i11) {
        ensureLogTagsIsMutable();
        this.logTags_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i11) {
        ensureLogsIsMutable();
        this.logs_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextFlow(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.contextFlow_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextFlowBytes(ByteString byteString) {
        this.contextFlow_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilename(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.filename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameBytes(ByteString byteString) {
        this.filename_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostname(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.hostname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostnameBytes(ByteString byteString) {
        this.hostname_ = byteString.toStringUtf8();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogTags(int i11, Cls$LogTag cls$LogTag) {
        cls$LogTag.getClass();
        ensureLogTagsIsMutable();
        this.logTags_.set(i11, cls$LogTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i11, Cls$Log cls$Log) {
        cls$Log.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i11, cls$Log);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.source_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceBytes(ByteString byteString) {
        this.source_ = byteString.toStringUtf8();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogTags(int i11, Cls$LogTag cls$LogTag) {
        cls$LogTag.getClass();
        ensureLogTagsIsMutable();
        this.logTags_.add(i11, cls$LogTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i11, Cls$Log cls$Log) {
        cls$Log.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i11, cls$Log);
    }

    public static Cls$LogGroup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cls$LogGroup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cls$LogGroup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cls$LogGroup parseFrom(InputStream inputStream) throws IOException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$LogGroup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$LogGroup parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cls$LogGroup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
