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
import y80.InterfaceC46402b;

/* JADX INFO: loaded from: classes59.dex */
public final class CryptoRankingListApp extends GeneratedMessageLite<CryptoRankingListApp, C27273b> implements MessageLiteOrBuilder {
    private static final CryptoRankingListApp DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<CryptoRankingListApp> PARSER;
    private Internal.ProtobufList<CryptoRankingItemApp> items_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.CryptoRankingListApp$b */
    public static final class C27273b extends GeneratedMessageLite.Builder<CryptoRankingListApp, C27273b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27273b(C27272a c27272a) {
            this();
        }

        public C27273b() {
            super(CryptoRankingListApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(CryptoRankingItemApp cryptoRankingItemApp) {
        cryptoRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(cryptoRankingItemApp);
    }

    public static C27273b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CryptoRankingListApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CryptoRankingListApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.rankings.CryptoRankingListApp$a */
    public static /* synthetic */ class C27272a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55355a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55355a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55355a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55355a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55355a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55355a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55355a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55355a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CryptoRankingListApp cryptoRankingListApp = new CryptoRankingListApp();
        DEFAULT_INSTANCE = cryptoRankingListApp;
        GeneratedMessageLite.registerDefaultInstance(CryptoRankingListApp.class, cryptoRankingListApp);
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<CryptoRankingItemApp> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CryptoRankingListApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27273b newBuilder(CryptoRankingListApp cryptoRankingListApp) {
        return DEFAULT_INSTANCE.createBuilder(cryptoRankingListApp);
    }

    public static CryptoRankingListApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CryptoRankingListApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CryptoRankingListApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27272a c27272a = null;
        switch (C27272a.f55355a[methodToInvoke.ordinal()]) {
            case 1:
                return new CryptoRankingListApp();
            case 2:
                return new C27273b(c27272a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", CryptoRankingItemApp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CryptoRankingListApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CryptoRankingListApp.class) {
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

    public CryptoRankingItemApp getItems(int i11) {
        return this.items_.get(i11);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<CryptoRankingItemApp> getItemsList() {
        return this.items_;
    }

    public InterfaceC46402b getItemsOrBuilder(int i11) {
        return this.items_.get(i11);
    }

    public List<? extends InterfaceC46402b> getItemsOrBuilderList() {
        return this.items_;
    }

    private CryptoRankingListApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends CryptoRankingItemApp> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static CryptoRankingListApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i11) {
        ensureItemsIsMutable();
        this.items_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, CryptoRankingItemApp cryptoRankingItemApp) {
        cryptoRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.set(i11, cryptoRankingItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i11, CryptoRankingItemApp cryptoRankingItemApp) {
        cryptoRankingItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(i11, cryptoRankingItemApp);
    }

    public static CryptoRankingListApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CryptoRankingListApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CryptoRankingListApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CryptoRankingListApp parseFrom(InputStream inputStream) throws IOException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CryptoRankingListApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CryptoRankingListApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CryptoRankingListApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CryptoRankingListApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
