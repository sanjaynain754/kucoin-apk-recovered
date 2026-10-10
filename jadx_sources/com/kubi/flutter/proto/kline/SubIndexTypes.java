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
public final class SubIndexTypes extends GeneratedMessageLite<SubIndexTypes, C12721c> implements MessageLiteOrBuilder {
    private static final SubIndexTypes DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile Parser<SubIndexTypes> PARSER;
    private static final Internal.ListAdapter.Converter<Integer, SubIndexType> items_converter_ = new C12719a();
    private int itemsMemoizedSerializedSize;
    private Internal.IntList items_ = GeneratedMessageLite.emptyIntList();

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SubIndexTypes$c */
    public static final class C12721c extends GeneratedMessageLite.Builder<SubIndexTypes, C12721c> implements MessageLiteOrBuilder {
        public /* synthetic */ C12721c(C12719a c12719a) {
            this();
        }

        public C12721c() {
            super(SubIndexTypes.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: b */
        public List<SubIndexType> m24039b() {
            return ((SubIndexTypes) this.instance).getItemsList();
        }

        /* JADX INFO: renamed from: a */
        public C12721c m24038a(Iterable<? extends SubIndexType> iterable) {
            copyOnWrite();
            ((SubIndexTypes) this.instance).addAllItems(iterable);
            return this;
        }
    }

    public static C12721c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SubIndexTypes parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SubIndexTypes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubIndexTypes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SubIndexTypes$a */
    public class C12719a implements Internal.ListAdapter.Converter<Integer, SubIndexType> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SubIndexType convert(Integer num) {
            SubIndexType subIndexTypeForNumber = SubIndexType.forNumber(num.intValue());
            if (subIndexTypeForNumber == null) {
                return SubIndexType.UNRECOGNIZED;
            }
            return subIndexTypeForNumber;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SubIndexTypes$b */
    public static /* synthetic */ class C12720b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22197a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22197a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22197a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22197a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22197a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22197a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22197a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22197a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        SubIndexTypes subIndexTypes = new SubIndexTypes();
        DEFAULT_INSTANCE = subIndexTypes;
        GeneratedMessageLite.registerDefaultInstance(SubIndexTypes.class, subIndexTypes);
    }

    private void ensureItemsIsMutable() {
        Internal.IntList intList = this.items_;
        if (intList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static SubIndexTypes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12721c newBuilder(SubIndexTypes subIndexTypes) {
        return DEFAULT_INSTANCE.createBuilder(subIndexTypes);
    }

    public static SubIndexTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubIndexTypes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubIndexTypes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<SubIndexTypes> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12719a c12719a = null;
        switch (C12720b.f22197a[methodToInvoke.ordinal()]) {
            case 1:
                return new SubIndexTypes();
            case 2:
                return new C12721c(c12719a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"items_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SubIndexTypes> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SubIndexTypes.class) {
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

    public SubIndexType getItems(int i11) {
        SubIndexType subIndexTypeForNumber = SubIndexType.forNumber(this.items_.getInt(i11));
        return subIndexTypeForNumber == null ? SubIndexType.UNRECOGNIZED : subIndexTypeForNumber;
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<SubIndexType> getItemsList() {
        return new Internal.ListAdapter(this.items_, items_converter_);
    }

    public int getItemsValue(int i11) {
        return this.items_.getInt(i11);
    }

    public List<Integer> getItemsValueList() {
        return this.items_;
    }

    private SubIndexTypes() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends SubIndexType> iterable) {
        ensureItemsIsMutable();
        Iterator<? extends SubIndexType> it = iterable.iterator();
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
    public void addItems(SubIndexType subIndexType) {
        subIndexType.getClass();
        ensureItemsIsMutable();
        this.items_.addInt(subIndexType.getNumber());
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

    public static SubIndexTypes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, SubIndexType subIndexType) {
        subIndexType.getClass();
        ensureItemsIsMutable();
        this.items_.setInt(i11, subIndexType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemsValue(int i11, int i12) {
        ensureItemsIsMutable();
        this.items_.setInt(i11, i12);
    }

    public static SubIndexTypes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SubIndexTypes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubIndexTypes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SubIndexTypes parseFrom(InputStream inputStream) throws IOException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubIndexTypes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubIndexTypes parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SubIndexTypes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubIndexTypes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
