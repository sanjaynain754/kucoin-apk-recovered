package com.kucoin.discover.rankings;

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
import y80.InterfaceC46401a;

/* JADX INFO: loaded from: classes59.dex */
public final class AlphaRankingItemsApp extends GeneratedMessageLite<AlphaRankingItemsApp, C27269b> implements MessageLiteOrBuilder {
    private static final AlphaRankingItemsApp DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<AlphaRankingItemsApp> PARSER;
    private Internal.ProtobufList<AlphaRankingItemApp> items_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.AlphaRankingItemsApp$b */
    public static final class C27269b extends GeneratedMessageLite.Builder<AlphaRankingItemsApp, C27269b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27269b(C27268a c27268a) {
            this();
        }

        public C27269b() {
            super(AlphaRankingItemsApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(AlphaRankingItemApp alphaRankingItemApp) {
        alphaRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(alphaRankingItemApp);
    }

    public static C27269b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AlphaRankingItemsApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlphaRankingItemsApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.AlphaRankingItemsApp$a */
    public static /* synthetic */ class C27268a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55353a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55353a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55353a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55353a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55353a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55353a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55353a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55353a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AlphaRankingItemsApp alphaRankingItemsApp = new AlphaRankingItemsApp();
        DEFAULT_INSTANCE = alphaRankingItemsApp;
        GeneratedMessageLite.registerDefaultInstance(AlphaRankingItemsApp.class, alphaRankingItemsApp);
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<AlphaRankingItemApp> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static AlphaRankingItemsApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27269b newBuilder(AlphaRankingItemsApp alphaRankingItemsApp) {
        return DEFAULT_INSTANCE.createBuilder(alphaRankingItemsApp);
    }

    public static AlphaRankingItemsApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlphaRankingItemsApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<AlphaRankingItemsApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27268a c27268a = null;
        switch (C27268a.f55353a[methodToInvoke.ordinal()]) {
            case 1:
                return new AlphaRankingItemsApp();
            case 2:
                return new C27269b(c27268a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", AlphaRankingItemApp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AlphaRankingItemsApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AlphaRankingItemsApp.class) {
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
            default:
                throw null;
        }
    }

    public AlphaRankingItemApp getItems(int i11) {
        return this.items_.get(i11);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<AlphaRankingItemApp> getItemsList() {
        return this.items_;
    }

    public InterfaceC46401a getItemsOrBuilder(int i11) {
        return this.items_.get(i11);
    }

    public List<? extends InterfaceC46401a> getItemsOrBuilderList() {
        return this.items_;
    }

    private AlphaRankingItemsApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends AlphaRankingItemApp> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static AlphaRankingItemsApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i11) {
        ensureItemsIsMutable();
        this.items_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, AlphaRankingItemApp alphaRankingItemApp) {
        alphaRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.set(i11, alphaRankingItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i11, AlphaRankingItemApp alphaRankingItemApp) {
        alphaRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(i11, alphaRankingItemApp);
    }

    public static AlphaRankingItemsApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AlphaRankingItemsApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlphaRankingItemsApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AlphaRankingItemsApp parseFrom(InputStream inputStream) throws IOException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlphaRankingItemsApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlphaRankingItemsApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AlphaRankingItemsApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlphaRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
