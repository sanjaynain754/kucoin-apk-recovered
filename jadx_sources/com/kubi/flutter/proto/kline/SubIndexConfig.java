package com.kubi.flutter.proto.kline;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p312hg.InterfaceC38195b;

/* JADX INFO: loaded from: classes13.dex */
public final class SubIndexConfig extends GeneratedMessageLite<SubIndexConfig, C12716b> implements MessageLiteOrBuilder {
    private static final SubIndexConfig DEFAULT_INSTANCE;
    public static final int KDJ_FIELD_NUMBER = 3;
    public static final int MACD_FIELD_NUMBER = 1;
    private static volatile Parser<SubIndexConfig> PARSER = null;
    public static final int RSI_FIELD_NUMBER = 2;
    private KdjConfig kdj_;
    private MacdConfig macd_;
    private Internal.ProtobufList<IndexItemConfig> rsi_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SubIndexConfig$b */
    public static final class C12716b extends GeneratedMessageLite.Builder<SubIndexConfig, C12716b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12716b(C12715a c12715a) {
            this();
        }

        public C12716b() {
            super(SubIndexConfig.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRsi(IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureRsiIsMutable();
        this.rsi_.add(indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKdj() {
        this.kdj_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMacd() {
        this.macd_ = null;
    }

    public static C12716b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SubIndexConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SubIndexConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubIndexConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SubIndexConfig$a */
    public static /* synthetic */ class C12715a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22191a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22191a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22191a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22191a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22191a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22191a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22191a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22191a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        SubIndexConfig subIndexConfig = new SubIndexConfig();
        DEFAULT_INSTANCE = subIndexConfig;
        GeneratedMessageLite.registerDefaultInstance(SubIndexConfig.class, subIndexConfig);
    }

    private void ensureRsiIsMutable() {
        Internal.ProtobufList<IndexItemConfig> protobufList = this.rsi_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rsi_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SubIndexConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12716b newBuilder(SubIndexConfig subIndexConfig) {
        return DEFAULT_INSTANCE.createBuilder(subIndexConfig);
    }

    public static SubIndexConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubIndexConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubIndexConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<SubIndexConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12715a c12715a = null;
        switch (C12715a.f22191a[methodToInvoke.ordinal()]) {
            case 1:
                return new SubIndexConfig();
            case 2:
                return new C12716b(c12715a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\t", new Object[]{"macd_", "rsi_", IndexItemConfig.class, "kdj_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SubIndexConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SubIndexConfig.class) {
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

    public KdjConfig getKdj() {
        KdjConfig kdjConfig = this.kdj_;
        return kdjConfig == null ? KdjConfig.getDefaultInstance() : kdjConfig;
    }

    public MacdConfig getMacd() {
        MacdConfig macdConfig = this.macd_;
        return macdConfig == null ? MacdConfig.getDefaultInstance() : macdConfig;
    }

    public IndexItemConfig getRsi(int i11) {
        return this.rsi_.get(i11);
    }

    public int getRsiCount() {
        return this.rsi_.size();
    }

    public List<IndexItemConfig> getRsiList() {
        return this.rsi_;
    }

    public InterfaceC38195b getRsiOrBuilder(int i11) {
        return this.rsi_.get(i11);
    }

    public List<? extends InterfaceC38195b> getRsiOrBuilderList() {
        return this.rsi_;
    }

    public boolean hasKdj() {
        return this.kdj_ != null;
    }

    public boolean hasMacd() {
        return this.macd_ != null;
    }

    private SubIndexConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRsi(Iterable<? extends IndexItemConfig> iterable) {
        ensureRsiIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rsi_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRsi() {
        this.rsi_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKdj(KdjConfig kdjConfig) {
        kdjConfig.getClass();
        KdjConfig kdjConfig2 = this.kdj_;
        if (kdjConfig2 != null && kdjConfig2 != KdjConfig.getDefaultInstance()) {
            this.kdj_ = KdjConfig.newBuilder(this.kdj_).mergeFrom(kdjConfig).buildPartial();
        } else {
            this.kdj_ = kdjConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMacd(MacdConfig macdConfig) {
        macdConfig.getClass();
        MacdConfig macdConfig2 = this.macd_;
        if (macdConfig2 != null && macdConfig2 != MacdConfig.getDefaultInstance()) {
            this.macd_ = MacdConfig.newBuilder(this.macd_).mergeFrom(macdConfig).buildPartial();
        } else {
            this.macd_ = macdConfig;
        }
    }

    public static SubIndexConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRsi(int i11) {
        ensureRsiIsMutable();
        this.rsi_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKdj(KdjConfig kdjConfig) {
        kdjConfig.getClass();
        this.kdj_ = kdjConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacd(MacdConfig macdConfig) {
        macdConfig.getClass();
        this.macd_ = macdConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRsi(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureRsiIsMutable();
        this.rsi_.set(i11, indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRsi(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureRsiIsMutable();
        this.rsi_.add(i11, indexItemConfig);
    }

    public static SubIndexConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SubIndexConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubIndexConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SubIndexConfig parseFrom(InputStream inputStream) throws IOException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubIndexConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubIndexConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SubIndexConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
