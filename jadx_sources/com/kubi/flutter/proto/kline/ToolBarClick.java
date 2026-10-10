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

/* JADX INFO: loaded from: classes13.dex */
public final class ToolBarClick extends GeneratedMessageLite<ToolBarClick, C12729b> implements MessageLiteOrBuilder {
    private static final ToolBarClick DEFAULT_INSTANCE;
    private static volatile Parser<ToolBarClick> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    public enum ToolBarItemType implements Internal.EnumLite {
        BAR_ITEM_SEGMENT(0),
        BAR_ITEM_STRAIGHT(1),
        BAR_ITEM_RECT(2),
        BAR_ITEM_EYE(3),
        BAR_ITEM_DROP(4),
        BAR_ITEM_LOCK(5),
        BAR_ITEM_Enter(6),
        BAR_ITEM_Exit(7),
        UNRECOGNIZED(-1);

        public static final int BAR_ITEM_DROP_VALUE = 4;
        public static final int BAR_ITEM_EYE_VALUE = 3;
        public static final int BAR_ITEM_Enter_VALUE = 6;
        public static final int BAR_ITEM_Exit_VALUE = 7;
        public static final int BAR_ITEM_LOCK_VALUE = 5;
        public static final int BAR_ITEM_RECT_VALUE = 2;
        public static final int BAR_ITEM_SEGMENT_VALUE = 0;
        public static final int BAR_ITEM_STRAIGHT_VALUE = 1;

        /* JADX INFO: renamed from: b */
        public static final Internal.EnumLiteMap<ToolBarItemType> f22207b = new C12726a();
        private final int value;

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ToolBarClick$ToolBarItemType$a */
        public class C12726a implements Internal.EnumLiteMap<ToolBarItemType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ToolBarItemType findValueByNumber(int i11) {
                return ToolBarItemType.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ToolBarClick$ToolBarItemType$b */
        public static final class C12727b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a */
            public static final Internal.EnumVerifier f22209a = new C12727b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                if (ToolBarItemType.forNumber(i11) != null) {
                    return true;
                }
                return false;
            }
        }

        public static Internal.EnumLiteMap<ToolBarItemType> internalGetValueMap() {
            return f22207b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C12727b.f22209a;
        }

        @Deprecated
        public static ToolBarItemType valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        ToolBarItemType(int i11) {
            this.value = i11;
        }

        public static ToolBarItemType forNumber(int i11) {
            switch (i11) {
                case 0:
                    return BAR_ITEM_SEGMENT;
                case 1:
                    return BAR_ITEM_STRAIGHT;
                case 2:
                    return BAR_ITEM_RECT;
                case 3:
                    return BAR_ITEM_EYE;
                case 4:
                    return BAR_ITEM_DROP;
                case 5:
                    return BAR_ITEM_LOCK;
                case 6:
                    return BAR_ITEM_Enter;
                case 7:
                    return BAR_ITEM_Exit;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ToolBarClick$b */
    public static final class C12729b extends GeneratedMessageLite.Builder<ToolBarClick, C12729b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12729b(C12728a c12728a) {
            this();
        }

        public C12729b() {
            super(ToolBarClick.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12729b m24047a(ToolBarItemType toolBarItemType) {
            copyOnWrite();
            ((ToolBarClick) this.instance).setType(toolBarItemType);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static C12729b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ToolBarClick parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ToolBarClick) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ToolBarClick parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ToolBarClick$a */
    public static /* synthetic */ class C12728a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22210a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22210a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22210a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22210a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22210a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22210a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22210a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22210a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ToolBarClick toolBarClick = new ToolBarClick();
        DEFAULT_INSTANCE = toolBarClick;
        GeneratedMessageLite.registerDefaultInstance(ToolBarClick.class, toolBarClick);
    }

    public static ToolBarClick getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12729b newBuilder(ToolBarClick toolBarClick) {
        return DEFAULT_INSTANCE.createBuilder(toolBarClick);
    }

    public static ToolBarClick parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ToolBarClick) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ToolBarClick parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ToolBarClick> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i11) {
        this.type_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12728a c12728a = null;
        switch (C12728a.f22210a[methodToInvoke.ordinal()]) {
            case 1:
                return new ToolBarClick();
            case 2:
                return new C12729b(c12728a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ToolBarClick> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ToolBarClick.class) {
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

    public ToolBarItemType getType() {
        ToolBarItemType toolBarItemTypeForNumber = ToolBarItemType.forNumber(this.type_);
        return toolBarItemTypeForNumber == null ? ToolBarItemType.UNRECOGNIZED : toolBarItemTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    private ToolBarClick() {
    }

    public static ToolBarClick parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ToolBarItemType toolBarItemType) {
        this.type_ = toolBarItemType.getNumber();
    }

    public static ToolBarClick parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ToolBarClick parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ToolBarClick parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ToolBarClick parseFrom(InputStream inputStream) throws IOException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ToolBarClick parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ToolBarClick parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ToolBarClick parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ToolBarClick) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
