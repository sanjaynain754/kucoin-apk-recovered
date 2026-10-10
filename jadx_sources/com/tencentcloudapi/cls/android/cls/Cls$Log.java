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
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import ic0.C38516a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Cls$Log extends GeneratedMessageLite<Cls$Log, C35855a> implements InterfaceC35860a {
    public static final int COLLECTTIME_FIELD_NUMBER = 3;
    public static final int CONTENTS_FIELD_NUMBER = 2;
    private static final Cls$Log DEFAULT_INSTANCE;
    private static volatile Parser<Cls$Log> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private long collectTime_;
    private long time_;
    private byte memoizedIsInitialized = 2;
    private Internal.ProtobufList<Content> contents_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Content extends GeneratedMessageLite<Content, C35854a> implements InterfaceC35856b {
        private static final Content DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile Parser<Content> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String key_ = "";
        private String value_ = "";

        /* JADX INFO: renamed from: com.tencentcloudapi.cls.android.cls.Cls$Log$Content$a */
        public static final class C35854a extends GeneratedMessageLite.Builder<Content, C35854a> implements InterfaceC35856b {
            public /* synthetic */ C35854a(C38516a c38516a) {
                this();
            }

            public C35854a() {
                super(Content.DEFAULT_INSTANCE);
            }

            /* JADX INFO: renamed from: a */
            public C35854a m79336a(String str) {
                copyOnWrite();
                ((Content) this.instance).setKey(str);
                return this;
            }

            /* JADX INFO: renamed from: b */
            public C35854a m79337b(String str) {
                copyOnWrite();
                ((Content) this.instance).setValue(str);
                return this;
            }
        }

        public static C35854a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            Content content = new Content();
            DEFAULT_INSTANCE = content;
            GeneratedMessageLite.registerDefaultInstance(Content.class, content);
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

        public static Content getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C35854a newBuilder(Content content) {
            return DEFAULT_INSTANCE.createBuilder(content);
        }

        public static Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Parser<Content> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            C38516a c38516a = null;
            switch (C38516a.f86478a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Content();
                case 2:
                    return new C35854a(c38516a);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"bitField0_", AbstractC28133l.UNIQUE_KEY_PREFIX, "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Content> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Content.class) {
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

        public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

        public static Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Content parseFrom(InputStream inputStream) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Content parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: renamed from: com.tencentcloudapi.cls.android.cls.Cls$Log$a */
    public static final class C35855a extends GeneratedMessageLite.Builder<Cls$Log, C35855a> implements InterfaceC35860a {
        public /* synthetic */ C35855a(C38516a c38516a) {
            this();
        }

        public C35855a() {
            super(Cls$Log.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: b */
        public List<Content> m79339b() {
            return Collections.unmodifiableList(((Cls$Log) this.instance).getContentsList());
        }

        /* JADX INFO: renamed from: a */
        public C35855a m79338a(Content.C35854a c35854a) {
            copyOnWrite();
            ((Cls$Log) this.instance).addContents(c35854a.build());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C35855a m79340c(long j11) {
            copyOnWrite();
            ((Cls$Log) this.instance).setTime(j11);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.tencentcloudapi.cls.android.cls.Cls$Log$b */
    public interface InterfaceC35856b extends MessageLiteOrBuilder {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContents(Content content) {
        content.getClass();
        ensureContentsIsMutable();
        this.contents_.add(content);
    }

    public static C35855a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cls$Log parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cls$Log) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$Log parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    static {
        Cls$Log cls$Log = new Cls$Log();
        DEFAULT_INSTANCE = cls$Log;
        GeneratedMessageLite.registerDefaultInstance(Cls$Log.class, cls$Log);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectTime() {
        this.bitField0_ &= -3;
        this.collectTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.bitField0_ &= -2;
        this.time_ = 0L;
    }

    private void ensureContentsIsMutable() {
        Internal.ProtobufList<Content> protobufList = this.contents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.contents_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Cls$Log getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C35855a newBuilder(Cls$Log cls$Log) {
        return DEFAULT_INSTANCE.createBuilder(cls$Log);
    }

    public static Cls$Log parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$Log) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$Log parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Cls$Log> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectTime(long j11) {
        this.bitField0_ |= 2;
        this.collectTime_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j11) {
        this.bitField0_ |= 1;
        this.time_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C38516a c38516a = null;
        switch (C38516a.f86478a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cls$Log();
            case 2:
                return new C35855a(c38516a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔂ\u0000\u0002Л\u0003ဂ\u0001", new Object[]{"bitField0_", "time_", "contents_", Content.class, "collectTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cls$Log> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cls$Log.class) {
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

    public long getCollectTime() {
        return this.collectTime_;
    }

    public Content getContents(int i11) {
        return this.contents_.get(i11);
    }

    public int getContentsCount() {
        return this.contents_.size();
    }

    public List<Content> getContentsList() {
        return this.contents_;
    }

    public InterfaceC35856b getContentsOrBuilder(int i11) {
        return this.contents_.get(i11);
    }

    public List<? extends InterfaceC35856b> getContentsOrBuilderList() {
        return this.contents_;
    }

    public long getTime() {
        return this.time_;
    }

    public boolean hasCollectTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 1) != 0;
    }

    private Cls$Log() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllContents(Iterable<? extends Content> iterable) {
        ensureContentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.contents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContents() {
        this.contents_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Cls$Log parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeContents(int i11) {
        ensureContentsIsMutable();
        this.contents_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContents(int i11, Content content) {
        content.getClass();
        ensureContentsIsMutable();
        this.contents_.set(i11, content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContents(int i11, Content content) {
        content.getClass();
        ensureContentsIsMutable();
        this.contents_.add(i11, content);
    }

    public static Cls$Log parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cls$Log parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cls$Log parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cls$Log parseFrom(InputStream inputStream) throws IOException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cls$Log parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cls$Log parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cls$Log parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cls$Log) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
