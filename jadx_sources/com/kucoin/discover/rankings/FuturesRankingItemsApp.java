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
import y80.InterfaceC46403c;

/* JADX INFO: loaded from: classes59.dex */
public final class FuturesRankingItemsApp extends GeneratedMessageLite<FuturesRankingItemsApp, C27277b> implements MessageLiteOrBuilder {
    private static final FuturesRankingItemsApp DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<FuturesRankingItemsApp> PARSER;
    private Internal.ProtobufList<FuturesRankingItemApp> items_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.FuturesRankingItemsApp$b */
    public static final class C27277b extends GeneratedMessageLite.Builder<FuturesRankingItemsApp, C27277b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27277b(C27276a c27276a) {
            this();
        }

        public C27277b() {
            super(FuturesRankingItemsApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(FuturesRankingItemApp futuresRankingItemApp) {
        futuresRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(futuresRankingItemApp);
    }

    public static C27277b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FuturesRankingItemsApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FuturesRankingItemsApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.FuturesRankingItemsApp$a */
    public static /* synthetic */ class C27276a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55357a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55357a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55357a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55357a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55357a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55357a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55357a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55357a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        FuturesRankingItemsApp futuresRankingItemsApp = new FuturesRankingItemsApp();
        DEFAULT_INSTANCE = futuresRankingItemsApp;
        GeneratedMessageLite.registerDefaultInstance(FuturesRankingItemsApp.class, futuresRankingItemsApp);
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<FuturesRankingItemApp> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FuturesRankingItemsApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27277b newBuilder(FuturesRankingItemsApp futuresRankingItemsApp) {
        return DEFAULT_INSTANCE.createBuilder(futuresRankingItemsApp);
    }

    public static FuturesRankingItemsApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FuturesRankingItemsApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<FuturesRankingItemsApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27276a c27276a = null;
        switch (C27276a.f55357a[methodToInvoke.ordinal()]) {
            case 1:
                return new FuturesRankingItemsApp();
            case 2:
                return new C27277b(c27276a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", FuturesRankingItemApp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FuturesRankingItemsApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FuturesRankingItemsApp.class) {
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

    public FuturesRankingItemApp getItems(int i11) {
        return this.items_.get(i11);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<FuturesRankingItemApp> getItemsList() {
        return this.items_;
    }

    public InterfaceC46403c getItemsOrBuilder(int i11) {
        return this.items_.get(i11);
    }

    public List<? extends InterfaceC46403c> getItemsOrBuilderList() {
        return this.items_;
    }

    private FuturesRankingItemsApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends FuturesRankingItemApp> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static FuturesRankingItemsApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i11) {
        ensureItemsIsMutable();
        this.items_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, FuturesRankingItemApp futuresRankingItemApp) {
        futuresRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.set(i11, futuresRankingItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i11, FuturesRankingItemApp futuresRankingItemApp) {
        futuresRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(i11, futuresRankingItemApp);
    }

    public static FuturesRankingItemsApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FuturesRankingItemsApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FuturesRankingItemsApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FuturesRankingItemsApp parseFrom(InputStream inputStream) throws IOException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FuturesRankingItemsApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FuturesRankingItemsApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FuturesRankingItemsApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FuturesRankingItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
