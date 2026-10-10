package com.tencentcloudapi.cls.android.cls;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import ic0.C38516a;
import ic0.InterfaceC38517b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Cls$LogGroupList extends GeneratedMessageLite<Cls$LogGroupList, C35858a> implements MessageLiteOrBuilder {
    private static final Cls$LogGroupList DEFAULT_INSTANCE;
    public static final int LOGGROUPLIST_FIELD_NUMBER = 1;
    private static volatile Parser<Cls$LogGroupList> PARSER;
    private byte memoizedIsInitialized = 2;
    private Internal.ProtobufList<Cls$LogGroup> logGroupList_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.tencentcloudapi.cls.android.cls.Cls$LogGroupList$a */
    public static final class C35858a extends GeneratedMessageLite.Builder<Cls$LogGroupList, C35858a> implements MessageLiteOrBuilder {
        public /* synthetic */ C35858a(C38516a c38516a) {
            this();
        }

        public C35858a() {
            super(Cls$LogGroupList.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C35858a m79345a(Cls$LogGroup.C35857a c35857a) {
            copyOnWrite();
            ((Cls$LogGroupList) this.instance).addLogGroupList(c35857a.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogGroupList(Cls$LogGroup cls$LogGroup) {
        cls$LogGroup.getClass();
        ensureLogGroupListIsMutable();
        this.logGroupList_.add(cls$LogGroup);
    }

    public static C35858a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cls$LogGroupList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$LogGroupList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        Cls$LogGroupList cls$LogGroupList = new Cls$LogGroupList();
        DEFAULT_INSTANCE = cls$LogGroupList;
        GeneratedMessageLite.registerDefaultInstance(Cls$LogGroupList.class, cls$LogGroupList);
    }

    private void ensureLogGroupListIsMutable() {
        Internal.ProtobufList<Cls$LogGroup> protobufList = this.logGroupList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.logGroupList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Cls$LogGroupList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C35858a newBuilder(Cls$LogGroupList cls$LogGroupList) {
        return DEFAULT_INSTANCE.createBuilder(cls$LogGroupList);
    }

    public static Cls$LogGroupList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$LogGroupList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Cls$LogGroupList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C38516a c38516a = null;
        switch (C38516a.f86478a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cls$LogGroupList();
            case 2:
                return new C35858a(c38516a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"logGroupList_", Cls$LogGroup.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cls$LogGroupList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cls$LogGroupList.class) {
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

    public Cls$LogGroup getLogGroupList(int i11) {
        return this.logGroupList_.get(i11);
    }

    public int getLogGroupListCount() {
        return this.logGroupList_.size();
    }

    public List<Cls$LogGroup> getLogGroupListList() {
        return this.logGroupList_;
    }

    public InterfaceC38517b getLogGroupListOrBuilder(int i11) {
        return this.logGroupList_.get(i11);
    }

    public List<? extends InterfaceC38517b> getLogGroupListOrBuilderList() {
        return this.logGroupList_;
    }

    private Cls$LogGroupList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogGroupList(Iterable<? extends Cls$LogGroup> iterable) {
        ensureLogGroupListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logGroupList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogGroupList() {
        this.logGroupList_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Cls$LogGroupList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogGroupList(int i11) {
        ensureLogGroupListIsMutable();
        this.logGroupList_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogGroupList(int i11, Cls$LogGroup cls$LogGroup) {
        cls$LogGroup.getClass();
        ensureLogGroupListIsMutable();
        this.logGroupList_.set(i11, cls$LogGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogGroupList(int i11, Cls$LogGroup cls$LogGroup) {
        cls$LogGroup.getClass();
        ensureLogGroupListIsMutable();
        this.logGroupList_.add(i11, cls$LogGroup);
    }

    public static Cls$LogGroupList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cls$LogGroupList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cls$LogGroupList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cls$LogGroupList parseFrom(InputStream inputStream) throws IOException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$LogGroupList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$LogGroupList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cls$LogGroupList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$LogGroupList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
