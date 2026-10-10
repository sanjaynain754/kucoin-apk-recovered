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
import java.util.Collections;
import java.util.List;
import p312hg.InterfaceC38194a;

/* JADX INFO: loaded from: classes13.dex */
public final class CandleList extends GeneratedMessageLite<CandleList, C12644b> implements MessageLiteOrBuilder {
    private static final CandleList DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile Parser<CandleList> PARSER = null;
    public static final int UPDATETYPE_FIELD_NUMBER = 1;
    private Internal.ProtobufList<CandleItem> items_ = GeneratedMessageLite.emptyProtobufList();
    private int updateType_;

    public enum UpdateType implements Internal.EnumLite {
        UPDATE_BY_PULL(0),
        UPDATE_BY_PUSH(1),
        LOAD_PAGE(2),
        UNRECOGNIZED(-1);

        public static final int LOAD_PAGE_VALUE = 2;
        public static final int UPDATE_BY_PULL_VALUE = 0;
        public static final int UPDATE_BY_PUSH_VALUE = 1;

        /* JADX INFO: renamed from: b */
        public static final Internal.EnumLiteMap<UpdateType> f22075b = new C12641a();
        private final int value;

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleList$UpdateType$a */
        public class C12641a implements Internal.EnumLiteMap<UpdateType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public UpdateType findValueByNumber(int i11) {
                return UpdateType.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleList$UpdateType$b */
        public static final class C12642b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a */
            public static final Internal.EnumVerifier f22077a = new C12642b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                if (UpdateType.forNumber(i11) != null) {
                    return true;
                }
                return false;
            }
        }

        public static UpdateType forNumber(int i11) {
            if (i11 == 0) {
                return UPDATE_BY_PULL;
            }
            if (i11 == 1) {
                return UPDATE_BY_PUSH;
            }
            if (i11 != 2) {
                return null;
            }
            return LOAD_PAGE;
        }

        public static Internal.EnumLiteMap<UpdateType> internalGetValueMap() {
            return f22075b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C12642b.f22077a;
        }

        @Deprecated
        public static UpdateType valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        UpdateType(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleList$b */
    public static final class C12644b extends GeneratedMessageLite.Builder<CandleList, C12644b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12644b(C12643a c12643a) {
            this();
        }

        public C12644b() {
            super(CandleList.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: b */
        public List<CandleItem> m23913b() {
            return Collections.unmodifiableList(((CandleList) this.instance).getItemsList());
        }

        /* JADX INFO: renamed from: a */
        public C12644b m23912a(Iterable<? extends CandleItem> iterable) {
            copyOnWrite();
            ((CandleList) this.instance).addAllItems(iterable);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12644b m23914c(UpdateType updateType) {
            copyOnWrite();
            ((CandleList) this.instance).setUpdateType(updateType);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(CandleItem candleItem) {
        candleItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(candleItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateType() {
        this.updateType_ = 0;
    }

    public static C12644b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CandleList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CandleList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleList$a */
    public static /* synthetic */ class C12643a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22078a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22078a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22078a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22078a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22078a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22078a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22078a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22078a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CandleList candleList = new CandleList();
        DEFAULT_INSTANCE = candleList;
        GeneratedMessageLite.registerDefaultInstance(CandleList.class, candleList);
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<CandleItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CandleList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12644b newBuilder(CandleList candleList) {
        return DEFAULT_INSTANCE.createBuilder(candleList);
    }

    public static CandleList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CandleList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTypeValue(int i11) {
        this.updateType_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12643a c12643a = null;
        switch (C12643a.f22078a[methodToInvoke.ordinal()]) {
            case 1:
                return new CandleList();
            case 2:
                return new C12644b(c12643a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"updateType_", "items_", CandleItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CandleList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CandleList.class) {
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

    public CandleItem getItems(int i11) {
        return this.items_.get(i11);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<CandleItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC38194a getItemsOrBuilder(int i11) {
        return this.items_.get(i11);
    }

    public List<? extends InterfaceC38194a> getItemsOrBuilderList() {
        return this.items_;
    }

    public UpdateType getUpdateType() {
        UpdateType updateTypeForNumber = UpdateType.forNumber(this.updateType_);
        return updateTypeForNumber == null ? UpdateType.UNRECOGNIZED : updateTypeForNumber;
    }

    public int getUpdateTypeValue() {
        return this.updateType_;
    }

    private CandleList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends CandleItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static CandleList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i11) {
        ensureItemsIsMutable();
        this.items_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i11, CandleItem candleItem) {
        candleItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i11, candleItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateType(UpdateType updateType) {
        this.updateType_ = updateType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i11, CandleItem candleItem) {
        candleItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i11, candleItem);
    }

    public static CandleList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CandleList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CandleList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CandleList parseFrom(InputStream inputStream) throws IOException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CandleList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
