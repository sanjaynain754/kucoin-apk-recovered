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
public final class MainIndexConfig extends GeneratedMessageLite<MainIndexConfig, C12674b> implements MessageLiteOrBuilder {
    public static final int BOLL_FIELD_NUMBER = 3;
    private static final MainIndexConfig DEFAULT_INSTANCE;
    public static final int EMA_FIELD_NUMBER = 2;
    public static final int MA_FIELD_NUMBER = 1;
    private static volatile Parser<MainIndexConfig> PARSER;
    private BollConfig boll_;
    private Internal.ProtobufList<IndexItemConfig> ma_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<IndexItemConfig> ema_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MainIndexConfig$b */
    public static final class C12674b extends GeneratedMessageLite.Builder<MainIndexConfig, C12674b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12674b(C12673a c12673a) {
            this();
        }

        public C12674b() {
            super(MainIndexConfig.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEma(IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureEmaIsMutable();
        this.ema_.add(indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMa(IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureMaIsMutable();
        this.ma_.add(indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoll() {
        this.boll_ = null;
    }

    public static C12674b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MainIndexConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MainIndexConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainIndexConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MainIndexConfig$a */
    public static /* synthetic */ class C12673a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22127a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22127a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22127a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22127a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22127a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22127a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22127a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22127a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        MainIndexConfig mainIndexConfig = new MainIndexConfig();
        DEFAULT_INSTANCE = mainIndexConfig;
        GeneratedMessageLite.registerDefaultInstance(MainIndexConfig.class, mainIndexConfig);
    }

    private void ensureEmaIsMutable() {
        Internal.ProtobufList<IndexItemConfig> protobufList = this.ema_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.ema_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMaIsMutable() {
        Internal.ProtobufList<IndexItemConfig> protobufList = this.ma_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.ma_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MainIndexConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12674b newBuilder(MainIndexConfig mainIndexConfig) {
        return DEFAULT_INSTANCE.createBuilder(mainIndexConfig);
    }

    public static MainIndexConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainIndexConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MainIndexConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<MainIndexConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12673a c12673a = null;
        switch (C12673a.f22127a[methodToInvoke.ordinal()]) {
            case 1:
                return new MainIndexConfig();
            case 2:
                return new C12674b(c12673a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\t", new Object[]{"ma_", IndexItemConfig.class, "ema_", IndexItemConfig.class, "boll_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MainIndexConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MainIndexConfig.class) {
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

    public BollConfig getBoll() {
        BollConfig bollConfig = this.boll_;
        return bollConfig == null ? BollConfig.getDefaultInstance() : bollConfig;
    }

    public IndexItemConfig getEma(int i11) {
        return this.ema_.get(i11);
    }

    public int getEmaCount() {
        return this.ema_.size();
    }

    public List<IndexItemConfig> getEmaList() {
        return this.ema_;
    }

    public InterfaceC38195b getEmaOrBuilder(int i11) {
        return this.ema_.get(i11);
    }

    public List<? extends InterfaceC38195b> getEmaOrBuilderList() {
        return this.ema_;
    }

    public IndexItemConfig getMa(int i11) {
        return this.ma_.get(i11);
    }

    public int getMaCount() {
        return this.ma_.size();
    }

    public List<IndexItemConfig> getMaList() {
        return this.ma_;
    }

    public InterfaceC38195b getMaOrBuilder(int i11) {
        return this.ma_.get(i11);
    }

    public List<? extends InterfaceC38195b> getMaOrBuilderList() {
        return this.ma_;
    }

    public boolean hasBoll() {
        return this.boll_ != null;
    }

    private MainIndexConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEma(Iterable<? extends IndexItemConfig> iterable) {
        ensureEmaIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ema_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMa(Iterable<? extends IndexItemConfig> iterable) {
        ensureMaIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ma_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEma() {
        this.ema_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMa() {
        this.ma_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBoll(BollConfig bollConfig) {
        bollConfig.getClass();
        BollConfig bollConfig2 = this.boll_;
        if (bollConfig2 != null && bollConfig2 != BollConfig.getDefaultInstance()) {
            this.boll_ = BollConfig.newBuilder(this.boll_).mergeFrom(bollConfig).buildPartial();
        } else {
            this.boll_ = bollConfig;
        }
    }

    public static MainIndexConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEma(int i11) {
        ensureEmaIsMutable();
        this.ema_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMa(int i11) {
        ensureMaIsMutable();
        this.ma_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoll(BollConfig bollConfig) {
        bollConfig.getClass();
        this.boll_ = bollConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEma(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureEmaIsMutable();
        this.ema_.set(i11, indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMa(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureMaIsMutable();
        this.ma_.set(i11, indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEma(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureEmaIsMutable();
        this.ema_.add(i11, indexItemConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMa(int i11, IndexItemConfig indexItemConfig) {
        indexItemConfig.getClass();
        ensureMaIsMutable();
        this.ma_.add(i11, indexItemConfig);
    }

    public static MainIndexConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MainIndexConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MainIndexConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MainIndexConfig parseFrom(InputStream inputStream) throws IOException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainIndexConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MainIndexConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MainIndexConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainIndexConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
