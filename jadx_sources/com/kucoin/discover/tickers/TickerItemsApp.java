package com.kucoin.discover.tickers;

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
import z80.InterfaceC46733a;

/* JADX INFO: loaded from: classes59.dex */
public final class TickerItemsApp extends GeneratedMessageLite<TickerItemsApp, C27281b> implements MessageLiteOrBuilder {
    private static final TickerItemsApp DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<TickerItemsApp> PARSER;
    private Internal.ProtobufList<TickerItemApp> items_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.kucoin.discover.tickers.TickerItemsApp$b */
    public static final class C27281b extends GeneratedMessageLite.Builder<TickerItemsApp, C27281b> implements MessageLiteOrBuilder {
        public /* synthetic */ C27281b(C27280a c27280a) {
            this();
        }

        public C27281b() {
            super(TickerItemsApp.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(TickerItemApp tickerItemApp) {
        tickerItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(tickerItemApp);
    }

    public static C27281b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TickerItemsApp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TickerItemsApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TickerItemsApp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kucoin.discover.tickers.TickerItemsApp$a */
    public static /* synthetic */ class C27280a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55359a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f55359a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55359a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55359a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55359a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55359a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55359a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55359a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        TickerItemsApp tickerItemsApp = new TickerItemsApp();
        DEFAULT_INSTANCE = tickerItemsApp;
        GeneratedMessageLite.registerDefaultInstance(TickerItemsApp.class, tickerItemsApp);
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<TickerItemApp> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TickerItemsApp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C27281b newBuilder(TickerItemsApp tickerItemsApp) {
        return DEFAULT_INSTANCE.createBuilder(tickerItemsApp);
    }

    public static TickerItemsApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TickerItemsApp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TickerItemsApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<TickerItemsApp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C27280a c27280a = null;
        switch (C27280a.f55359a[methodToInvoke.ordinal()]) {
            case 1:
                return new TickerItemsApp();
            case 2:
                return new C27281b(c27280a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", TickerItemApp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TickerItemsApp> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TickerItemsApp.class) {
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

    public TickerItemApp getItems(int i11) {
        return this.items_.get(i11);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<TickerItemApp> getItemsList() {
        return this.items_;
    }

    public InterfaceC46733a getItemsOrBuilder(int i11) {
        return this.items_.get(i11);
    }

    public List<? extends InterfaceC46733a> getItemsOrBuilderList() {
        return this.items_;
    }

    private TickerItemsApp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends TickerItemApp> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static TickerItemsApp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i11) {
        ensureItemsIsMutable();
        this.items_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, TickerItemApp tickerItemApp) {
        tickerItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.set(i11, tickerItemApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i11, TickerItemApp tickerItemApp) {
        tickerItemApp.getClass();
        ensureItemsIsMutable();
        this.items_.add(i11, tickerItemApp);
    }

    public static TickerItemsApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TickerItemsApp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TickerItemsApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TickerItemsApp parseFrom(InputStream inputStream) throws IOException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TickerItemsApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TickerItemsApp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TickerItemsApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TickerItemsApp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
