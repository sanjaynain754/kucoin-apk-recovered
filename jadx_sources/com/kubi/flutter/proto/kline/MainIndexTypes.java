package com.kubi.flutter.proto.kline;

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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class MainIndexTypes extends GeneratedMessageLite<MainIndexTypes, C12679c> implements MessageLiteOrBuilder {
    private static final MainIndexTypes DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<MainIndexTypes> PARSER;
    private static final Internal.ListAdapter.Converter<Integer, MainIndexType> items_converter_ = new C12677a();
    private int itemsMemoizedSerializedSize;
    private Internal.IntList items_ = GeneratedMessageLite.emptyIntList();

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MainIndexTypes$c */
    public static final class C12679c extends GeneratedMessageLite.Builder<MainIndexTypes, C12679c> implements MessageLiteOrBuilder {
        public /* synthetic */ C12679c(C12677a c12677a) {
            this();
        }

        public C12679c() {
            super(MainIndexTypes.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: b */
        public List<MainIndexType> m23956b() {
            return ((MainIndexTypes) this.instance).getItemsList();
        }

        /* JADX INFO: renamed from: a */
        public C12679c m23955a(Iterable<? extends MainIndexType> iterable) {
            copyOnWrite();
            ((MainIndexTypes) this.instance).addAllItems(iterable);
            return this;
        }
    }

    public static C12679c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MainIndexTypes parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MainIndexTypes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainIndexTypes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MainIndexTypes$a */
    public class C12677a implements Internal.ListAdapter.Converter<Integer, MainIndexType> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MainIndexType convert(Integer num) {
            MainIndexType mainIndexTypeForNumber = MainIndexType.forNumber(num.intValue());
            if (mainIndexTypeForNumber == null) {
                return MainIndexType.UNRECOGNIZED;
            }
            return mainIndexTypeForNumber;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.MainIndexTypes$b */
    public static /* synthetic */ class C12678b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22134a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22134a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22134a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22134a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22134a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22134a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22134a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22134a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        MainIndexTypes mainIndexTypes = new MainIndexTypes();
        DEFAULT_INSTANCE = mainIndexTypes;
        GeneratedMessageLite.registerDefaultInstance(MainIndexTypes.class, mainIndexTypes);
    }

    private void ensureItemsIsMutable() {
        Internal.IntList intList = this.items_;
        if (intList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static MainIndexTypes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12679c newBuilder(MainIndexTypes mainIndexTypes) {
        return DEFAULT_INSTANCE.createBuilder(mainIndexTypes);
    }

    public static MainIndexTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainIndexTypes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MainIndexTypes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<MainIndexTypes> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12677a c12677a = null;
        switch (C12678b.f22134a[methodToInvoke.ordinal()]) {
            case 1:
                return new MainIndexTypes();
            case 2:
                return new C12679c(c12677a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"items_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MainIndexTypes> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MainIndexTypes.class) {
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

    public MainIndexType getItems(int i11) {
        MainIndexType mainIndexTypeForNumber = MainIndexType.forNumber(this.items_.getInt(i11));
        return mainIndexTypeForNumber == null ? MainIndexType.UNRECOGNIZED : mainIndexTypeForNumber;
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<MainIndexType> getItemsList() {
        return new Internal.ListAdapter(this.items_, items_converter_);
    }

    public int getItemsValue(int i11) {
        return this.items_.getInt(i11);
    }

    public List<Integer> getItemsValueList() {
        return this.items_;
    }

    private MainIndexTypes() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends MainIndexType> iterable) {
        ensureItemsIsMutable();
        Iterator<? extends MainIndexType> it = iterable.iterator();
        while (it.hasNext()) {
            this.items_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemsValue(Iterable<Integer> iterable) {
        ensureItemsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.items_.addInt(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(MainIndexType mainIndexType) {
        mainIndexType.getClass();
        ensureItemsIsMutable();
        this.items_.addInt(mainIndexType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemsValue(int i11) {
        ensureItemsIsMutable();
        this.items_.addInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyIntList();
    }

    public static MainIndexTypes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, MainIndexType mainIndexType) {
        mainIndexType.getClass();
        ensureItemsIsMutable();
        this.items_.setInt(i11, mainIndexType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemsValue(int i11, int i12) {
        ensureItemsIsMutable();
        this.items_.setInt(i11, i12);
    }

    public static MainIndexTypes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MainIndexTypes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MainIndexTypes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MainIndexTypes parseFrom(InputStream inputStream) throws IOException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MainIndexTypes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MainIndexTypes parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MainIndexTypes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MainIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
