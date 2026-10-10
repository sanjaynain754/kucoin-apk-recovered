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
public final class ChangeToolBarModeEvent extends GeneratedMessageLite<ChangeToolBarModeEvent, C12650b> implements MessageLiteOrBuilder {
    private static final ChangeToolBarModeEvent DEFAULT_INSTANCE;
    public static final int ISHIDDEN_FIELD_NUMBER = 2;
    public static final int ISLOCK_FIELD_NUMBER = 3;
    public static final int ISSHOWPAINT_FIELD_NUMBER = 4;
    private static volatile Parser<ChangeToolBarModeEvent> PARSER = null;
    public static final int SELECTTYPE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean isHidden_;
    private boolean isLock_;
    private boolean isShowPaint_;
    private int selectType_;
    private int type_;

    public enum SelectItemType implements Internal.EnumLite {
        SELECT_ITEM_NONE(0),
        SELECT_ITEM_SEGMENT(1),
        SELECT_ITEM_STRAIGHT(2),
        SELECT_ITEM_RECT(3),
        UNRECOGNIZED(-1);

        public static final int SELECT_ITEM_NONE_VALUE = 0;
        public static final int SELECT_ITEM_RECT_VALUE = 3;
        public static final int SELECT_ITEM_SEGMENT_VALUE = 1;
        public static final int SELECT_ITEM_STRAIGHT_VALUE = 2;

        /* JADX INFO: renamed from: b */
        public static final Internal.EnumLiteMap<SelectItemType> f22084b = new C12647a();
        private final int value;

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChangeToolBarModeEvent$SelectItemType$a */
        public class C12647a implements Internal.EnumLiteMap<SelectItemType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SelectItemType findValueByNumber(int i11) {
                return SelectItemType.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChangeToolBarModeEvent$SelectItemType$b */
        public static final class C12648b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a */
            public static final Internal.EnumVerifier f22086a = new C12648b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i11) {
                if (SelectItemType.forNumber(i11) != null) {
                    return true;
                }
                return false;
            }
        }

        public static SelectItemType forNumber(int i11) {
            if (i11 == 0) {
                return SELECT_ITEM_NONE;
            }
            if (i11 == 1) {
                return SELECT_ITEM_SEGMENT;
            }
            if (i11 == 2) {
                return SELECT_ITEM_STRAIGHT;
            }
            if (i11 != 3) {
                return null;
            }
            return SELECT_ITEM_RECT;
        }

        public static Internal.EnumLiteMap<SelectItemType> internalGetValueMap() {
            return f22084b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C12648b.f22086a;
        }

        @Deprecated
        public static SelectItemType valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        SelectItemType(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChangeToolBarModeEvent$b */
    public static final class C12650b extends GeneratedMessageLite.Builder<ChangeToolBarModeEvent, C12650b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12650b(C12649a c12649a) {
            this();
        }

        public C12650b() {
            super(ChangeToolBarModeEvent.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHidden() {
        this.isHidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLock() {
        this.isLock_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsShowPaint() {
        this.isShowPaint_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectType() {
        this.selectType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static C12650b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChangeToolBarModeEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChangeToolBarModeEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.ChangeToolBarModeEvent$a */
    public static /* synthetic */ class C12649a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22087a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22087a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22087a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22087a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22087a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22087a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22087a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22087a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ChangeToolBarModeEvent changeToolBarModeEvent = new ChangeToolBarModeEvent();
        DEFAULT_INSTANCE = changeToolBarModeEvent;
        GeneratedMessageLite.registerDefaultInstance(ChangeToolBarModeEvent.class, changeToolBarModeEvent);
    }

    public static ChangeToolBarModeEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12650b newBuilder(ChangeToolBarModeEvent changeToolBarModeEvent) {
        return DEFAULT_INSTANCE.createBuilder(changeToolBarModeEvent);
    }

    public static ChangeToolBarModeEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChangeToolBarModeEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ChangeToolBarModeEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHidden(boolean z11) {
        this.isHidden_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLock(boolean z11) {
        this.isLock_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsShowPaint(boolean z11) {
        this.isShowPaint_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectTypeValue(int i11) {
        this.selectType_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i11) {
        this.type_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12649a c12649a = null;
        switch (C12649a.f22087a[methodToInvoke.ordinal()]) {
            case 1:
                return new ChangeToolBarModeEvent();
            case 2:
                return new C12650b(c12649a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0007\u0004\u0007\u0005\f", new Object[]{"type_", "isHidden_", "isLock_", "isShowPaint_", "selectType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChangeToolBarModeEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ChangeToolBarModeEvent.class) {
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

    public boolean getIsHidden() {
        return this.isHidden_;
    }

    public boolean getIsLock() {
        return this.isLock_;
    }

    public boolean getIsShowPaint() {
        return this.isShowPaint_;
    }

    public SelectItemType getSelectType() {
        SelectItemType selectItemTypeForNumber = SelectItemType.forNumber(this.selectType_);
        return selectItemTypeForNumber == null ? SelectItemType.UNRECOGNIZED : selectItemTypeForNumber;
    }

    public int getSelectTypeValue() {
        return this.selectType_;
    }

    public ToolBarType getType() {
        ToolBarType toolBarTypeForNumber = ToolBarType.forNumber(this.type_);
        return toolBarTypeForNumber == null ? ToolBarType.UNRECOGNIZED : toolBarTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    private ChangeToolBarModeEvent() {
    }

    public static ChangeToolBarModeEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectType(SelectItemType selectItemType) {
        this.selectType_ = selectItemType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ToolBarType toolBarType) {
        this.type_ = toolBarType.getNumber();
    }

    public static ChangeToolBarModeEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChangeToolBarModeEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChangeToolBarModeEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChangeToolBarModeEvent parseFrom(InputStream inputStream) throws IOException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChangeToolBarModeEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChangeToolBarModeEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChangeToolBarModeEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChangeToolBarModeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
