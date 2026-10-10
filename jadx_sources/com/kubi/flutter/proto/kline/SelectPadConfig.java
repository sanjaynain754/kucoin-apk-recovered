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
public final class SelectPadConfig extends GeneratedMessageLite<SelectPadConfig, C12708c> implements MessageLiteOrBuilder {
    private static final SelectPadConfig DEFAULT_INSTANCE;
    public static final int ITEMTYPES_FIELD_NUMBER = 2;
    private static volatile Parser<SelectPadConfig> PARSER = null;
    public static final int VIEWMODE_FIELD_NUMBER = 1;
    private static final Internal.ListAdapter.Converter<Integer, SelectPadItemType> itemTypes_converter_ = new C12706a();
    private int itemTypesMemoizedSerializedSize;
    private Internal.IntList itemTypes_ = GeneratedMessageLite.emptyIntList();
    private int viewMode_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SelectPadConfig$c */
    public static final class C12708c extends GeneratedMessageLite.Builder<SelectPadConfig, C12708c> implements MessageLiteOrBuilder {
        public /* synthetic */ C12708c(C12706a c12706a) {
            this();
        }

        public C12708c() {
            super(SelectPadConfig.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: b */
        public List<SelectPadItemType> m24023b() {
            return ((SelectPadConfig) this.instance).getItemTypesList();
        }

        /* JADX INFO: renamed from: a */
        public C12708c m24022a(Iterable<? extends SelectPadItemType> iterable) {
            copyOnWrite();
            ((SelectPadConfig) this.instance).addAllItemTypes(iterable);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12708c m24024c(SelectPadViewMode selectPadViewMode) {
            copyOnWrite();
            ((SelectPadConfig) this.instance).setViewMode(selectPadViewMode);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewMode() {
        this.viewMode_ = 0;
    }

    public static C12708c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SelectPadConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SelectPadConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SelectPadConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SelectPadConfig$a */
    public class C12706a implements Internal.ListAdapter.Converter<Integer, SelectPadItemType> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SelectPadItemType convert(Integer num) {
            SelectPadItemType selectPadItemTypeForNumber = SelectPadItemType.forNumber(num.intValue());
            if (selectPadItemTypeForNumber == null) {
                return SelectPadItemType.UNRECOGNIZED;
            }
            return selectPadItemTypeForNumber;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.SelectPadConfig$b */
    public static /* synthetic */ class C12707b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22179a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22179a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22179a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22179a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22179a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22179a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22179a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22179a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        SelectPadConfig selectPadConfig = new SelectPadConfig();
        DEFAULT_INSTANCE = selectPadConfig;
        GeneratedMessageLite.registerDefaultInstance(SelectPadConfig.class, selectPadConfig);
    }

    private void ensureItemTypesIsMutable() {
        Internal.IntList intList = this.itemTypes_;
        if (intList.isModifiable()) {
            return;
        }
        this.itemTypes_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static SelectPadConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12708c newBuilder(SelectPadConfig selectPadConfig) {
        return DEFAULT_INSTANCE.createBuilder(selectPadConfig);
    }

    public static SelectPadConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SelectPadConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SelectPadConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<SelectPadConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewModeValue(int i11) {
        this.viewMode_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12706a c12706a = null;
        switch (C12707b.f22179a[methodToInvoke.ordinal()]) {
            case 1:
                return new SelectPadConfig();
            case 2:
                return new C12708c(c12706a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"viewMode_", "itemTypes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SelectPadConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SelectPadConfig.class) {
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

    public SelectPadItemType getItemTypes(int i11) {
        SelectPadItemType selectPadItemTypeForNumber = SelectPadItemType.forNumber(this.itemTypes_.getInt(i11));
        return selectPadItemTypeForNumber == null ? SelectPadItemType.UNRECOGNIZED : selectPadItemTypeForNumber;
    }

    public int getItemTypesCount() {
        return this.itemTypes_.size();
    }

    public List<SelectPadItemType> getItemTypesList() {
        return new Internal.ListAdapter(this.itemTypes_, itemTypes_converter_);
    }

    public int getItemTypesValue(int i11) {
        return this.itemTypes_.getInt(i11);
    }

    public List<Integer> getItemTypesValueList() {
        return this.itemTypes_;
    }

    public SelectPadViewMode getViewMode() {
        SelectPadViewMode selectPadViewModeForNumber = SelectPadViewMode.forNumber(this.viewMode_);
        return selectPadViewModeForNumber == null ? SelectPadViewMode.UNRECOGNIZED : selectPadViewModeForNumber;
    }

    public int getViewModeValue() {
        return this.viewMode_;
    }

    private SelectPadConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemTypes(Iterable<? extends SelectPadItemType> iterable) {
        ensureItemTypesIsMutable();
        Iterator<? extends SelectPadItemType> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemTypes_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemTypesValue(Iterable<Integer> iterable) {
        ensureItemTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemTypes_.addInt(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemTypes(SelectPadItemType selectPadItemType) {
        selectPadItemType.getClass();
        ensureItemTypesIsMutable();
        this.itemTypes_.addInt(selectPadItemType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemTypesValue(int i11) {
        ensureItemTypesIsMutable();
        this.itemTypes_.addInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemTypes() {
        this.itemTypes_ = GeneratedMessageLite.emptyIntList();
    }

    public static SelectPadConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemTypes(int i11, SelectPadItemType selectPadItemType) {
        selectPadItemType.getClass();
        ensureItemTypesIsMutable();
        this.itemTypes_.setInt(i11, selectPadItemType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemTypesValue(int i11, int i12) {
        ensureItemTypesIsMutable();
        this.itemTypes_.setInt(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewMode(SelectPadViewMode selectPadViewMode) {
        this.viewMode_ = selectPadViewMode.getNumber();
    }

    public static SelectPadConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SelectPadConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SelectPadConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SelectPadConfig parseFrom(InputStream inputStream) throws IOException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SelectPadConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SelectPadConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SelectPadConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SelectPadConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
