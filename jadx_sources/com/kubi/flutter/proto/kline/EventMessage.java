package com.kubi.flutter.proto.kline;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class EventMessage extends GeneratedMessageLite<EventMessage, C12660b> implements MessageLiteOrBuilder {
    public static final int CONFIRMALERTEVENT_FIELD_NUMBER = 4;
    private static final EventMessage DEFAULT_INSTANCE;
    public static final int JUMPEVENT_FIELD_NUMBER = 3;
    public static final int LOADMORE_FIELD_NUMBER = 2;
    public static final int PAINTGUIDE_FIELD_NUMBER = 6;
    private static volatile Parser<EventMessage> PARSER = null;
    public static final int QUITEVENT_FIELD_NUMBER = 7;
    public static final int STATEEVENT_FIELD_NUMBER = 1;
    public static final int TOASTEVENT_FIELD_NUMBER = 5;
    public static final int TOOLBARMODE_FIELD_NUMBER = 8;
    private int eventTypeCase_ = 0;
    private Object eventType_;

    public enum EventTypeCase {
        STATEEVENT(1),
        LOADMORE(2),
        JUMPEVENT(3),
        CONFIRMALERTEVENT(4),
        TOASTEVENT(5),
        PAINTGUIDE(6),
        QUITEVENT(7),
        TOOLBARMODE(8),
        EVENTTYPE_NOT_SET(0);

        private final int value;

        @Deprecated
        public static EventTypeCase valueOf(int i11) {
            return forNumber(i11);
        }

        public int getNumber() {
            return this.value;
        }

        EventTypeCase(int i11) {
            this.value = i11;
        }

        public static EventTypeCase forNumber(int i11) {
            switch (i11) {
                case 0:
                    return EVENTTYPE_NOT_SET;
                case 1:
                    return STATEEVENT;
                case 2:
                    return LOADMORE;
                case 3:
                    return JUMPEVENT;
                case 4:
                    return CONFIRMALERTEVENT;
                case 5:
                    return TOASTEVENT;
                case 6:
                    return PAINTGUIDE;
                case 7:
                    return QUITEVENT;
                case 8:
                    return TOOLBARMODE;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.EventMessage$b */
    public static final class C12660b extends GeneratedMessageLite.Builder<EventMessage, C12660b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12660b(C12659a c12659a) {
            this();
        }

        public C12660b() {
            super(EventMessage.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        this.eventTypeCase_ = 0;
        this.eventType_ = null;
    }

    public static C12660b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EventMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateEventValue(int i11) {
        this.eventTypeCase_ = 1;
        this.eventType_ = Integer.valueOf(i11);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.EventMessage$a */
    public static /* synthetic */ class C12659a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22103a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22103a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22103a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22103a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22103a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22103a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22103a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22103a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EventMessage eventMessage = new EventMessage();
        DEFAULT_INSTANCE = eventMessage;
        GeneratedMessageLite.registerDefaultInstance(EventMessage.class, eventMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfirmAlertEvent() {
        if (this.eventTypeCase_ == 4) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpEvent() {
        if (this.eventTypeCase_ == 3) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadMore() {
        if (this.eventTypeCase_ == 2) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaintGuide() {
        if (this.eventTypeCase_ == 6) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuitEvent() {
        if (this.eventTypeCase_ == 7) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateEvent() {
        if (this.eventTypeCase_ == 1) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastEvent() {
        if (this.eventTypeCase_ == 5) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToolBarMode() {
        if (this.eventTypeCase_ == 8) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    public static EventMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12660b newBuilder(EventMessage eventMessage) {
        return DEFAULT_INSTANCE.createBuilder(eventMessage);
    }

    public static EventMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EventMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<EventMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12659a c12659a = null;
        switch (C12659a.f22103a[methodToInvoke.ordinal()]) {
            case 1:
                return new EventMessage();
            case 2:
                return new C12660b(c12659a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"eventType_", "eventTypeCase_", LoadMoreEvent.class, JumpOrderEvent.class, ConfirmAlerEvent.class, ToastEvent.class, PaintGuideEvent.class, QuitLandscapeEvent.class, ChangeToolBarModeEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EventMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (EventMessage.class) {
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

    public ConfirmAlerEvent getConfirmAlertEvent() {
        return this.eventTypeCase_ == 4 ? (ConfirmAlerEvent) this.eventType_ : ConfirmAlerEvent.getDefaultInstance();
    }

    public EventTypeCase getEventTypeCase() {
        return EventTypeCase.forNumber(this.eventTypeCase_);
    }

    public JumpOrderEvent getJumpEvent() {
        return this.eventTypeCase_ == 3 ? (JumpOrderEvent) this.eventType_ : JumpOrderEvent.getDefaultInstance();
    }

    public LoadMoreEvent getLoadMore() {
        return this.eventTypeCase_ == 2 ? (LoadMoreEvent) this.eventType_ : LoadMoreEvent.getDefaultInstance();
    }

    public PaintGuideEvent getPaintGuide() {
        return this.eventTypeCase_ == 6 ? (PaintGuideEvent) this.eventType_ : PaintGuideEvent.getDefaultInstance();
    }

    public QuitLandscapeEvent getQuitEvent() {
        return this.eventTypeCase_ == 7 ? (QuitLandscapeEvent) this.eventType_ : QuitLandscapeEvent.getDefaultInstance();
    }

    public StateEventType getStateEvent() {
        if (this.eventTypeCase_ != 1) {
            return StateEventType.VIEW_LOADED;
        }
        StateEventType stateEventTypeForNumber = StateEventType.forNumber(((Integer) this.eventType_).intValue());
        return stateEventTypeForNumber == null ? StateEventType.UNRECOGNIZED : stateEventTypeForNumber;
    }

    public int getStateEventValue() {
        if (this.eventTypeCase_ == 1) {
            return ((Integer) this.eventType_).intValue();
        }
        return 0;
    }

    public ToastEvent getToastEvent() {
        return this.eventTypeCase_ == 5 ? (ToastEvent) this.eventType_ : ToastEvent.getDefaultInstance();
    }

    public ChangeToolBarModeEvent getToolBarMode() {
        return this.eventTypeCase_ == 8 ? (ChangeToolBarModeEvent) this.eventType_ : ChangeToolBarModeEvent.getDefaultInstance();
    }

    public boolean hasConfirmAlertEvent() {
        return this.eventTypeCase_ == 4;
    }

    public boolean hasJumpEvent() {
        return this.eventTypeCase_ == 3;
    }

    public boolean hasLoadMore() {
        return this.eventTypeCase_ == 2;
    }

    public boolean hasPaintGuide() {
        return this.eventTypeCase_ == 6;
    }

    public boolean hasQuitEvent() {
        return this.eventTypeCase_ == 7;
    }

    public boolean hasStateEvent() {
        return this.eventTypeCase_ == 1;
    }

    public boolean hasToastEvent() {
        return this.eventTypeCase_ == 5;
    }

    public boolean hasToolBarMode() {
        return this.eventTypeCase_ == 8;
    }

    private EventMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfirmAlertEvent(ConfirmAlerEvent confirmAlerEvent) {
        confirmAlerEvent.getClass();
        if (this.eventTypeCase_ == 4 && this.eventType_ != ConfirmAlerEvent.getDefaultInstance()) {
            this.eventType_ = ConfirmAlerEvent.newBuilder((ConfirmAlerEvent) this.eventType_).mergeFrom(confirmAlerEvent).buildPartial();
        } else {
            this.eventType_ = confirmAlerEvent;
        }
        this.eventTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJumpEvent(JumpOrderEvent jumpOrderEvent) {
        jumpOrderEvent.getClass();
        if (this.eventTypeCase_ == 3 && this.eventType_ != JumpOrderEvent.getDefaultInstance()) {
            this.eventType_ = JumpOrderEvent.newBuilder((JumpOrderEvent) this.eventType_).mergeFrom(jumpOrderEvent).buildPartial();
        } else {
            this.eventType_ = jumpOrderEvent;
        }
        this.eventTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLoadMore(LoadMoreEvent loadMoreEvent) {
        loadMoreEvent.getClass();
        if (this.eventTypeCase_ == 2 && this.eventType_ != LoadMoreEvent.getDefaultInstance()) {
            this.eventType_ = LoadMoreEvent.newBuilder((LoadMoreEvent) this.eventType_).mergeFrom(loadMoreEvent).buildPartial();
        } else {
            this.eventType_ = loadMoreEvent;
        }
        this.eventTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePaintGuide(PaintGuideEvent paintGuideEvent) {
        paintGuideEvent.getClass();
        if (this.eventTypeCase_ == 6 && this.eventType_ != PaintGuideEvent.getDefaultInstance()) {
            this.eventType_ = PaintGuideEvent.newBuilder((PaintGuideEvent) this.eventType_).mergeFrom(paintGuideEvent).buildPartial();
        } else {
            this.eventType_ = paintGuideEvent;
        }
        this.eventTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuitEvent(QuitLandscapeEvent quitLandscapeEvent) {
        quitLandscapeEvent.getClass();
        if (this.eventTypeCase_ == 7 && this.eventType_ != QuitLandscapeEvent.getDefaultInstance()) {
            this.eventType_ = QuitLandscapeEvent.newBuilder((QuitLandscapeEvent) this.eventType_).mergeFrom(quitLandscapeEvent).buildPartial();
        } else {
            this.eventType_ = quitLandscapeEvent;
        }
        this.eventTypeCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToastEvent(ToastEvent toastEvent) {
        toastEvent.getClass();
        if (this.eventTypeCase_ == 5 && this.eventType_ != ToastEvent.getDefaultInstance()) {
            this.eventType_ = ToastEvent.newBuilder((ToastEvent) this.eventType_).mergeFrom(toastEvent).buildPartial();
        } else {
            this.eventType_ = toastEvent;
        }
        this.eventTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToolBarMode(ChangeToolBarModeEvent changeToolBarModeEvent) {
        changeToolBarModeEvent.getClass();
        if (this.eventTypeCase_ == 8 && this.eventType_ != ChangeToolBarModeEvent.getDefaultInstance()) {
            this.eventType_ = ChangeToolBarModeEvent.newBuilder((ChangeToolBarModeEvent) this.eventType_).mergeFrom(changeToolBarModeEvent).buildPartial();
        } else {
            this.eventType_ = changeToolBarModeEvent;
        }
        this.eventTypeCase_ = 8;
    }

    public static EventMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfirmAlertEvent(ConfirmAlerEvent confirmAlerEvent) {
        confirmAlerEvent.getClass();
        this.eventType_ = confirmAlerEvent;
        this.eventTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpEvent(JumpOrderEvent jumpOrderEvent) {
        jumpOrderEvent.getClass();
        this.eventType_ = jumpOrderEvent;
        this.eventTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadMore(LoadMoreEvent loadMoreEvent) {
        loadMoreEvent.getClass();
        this.eventType_ = loadMoreEvent;
        this.eventTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintGuide(PaintGuideEvent paintGuideEvent) {
        paintGuideEvent.getClass();
        this.eventType_ = paintGuideEvent;
        this.eventTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuitEvent(QuitLandscapeEvent quitLandscapeEvent) {
        quitLandscapeEvent.getClass();
        this.eventType_ = quitLandscapeEvent;
        this.eventTypeCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateEvent(StateEventType stateEventType) {
        this.eventType_ = Integer.valueOf(stateEventType.getNumber());
        this.eventTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastEvent(ToastEvent toastEvent) {
        toastEvent.getClass();
        this.eventType_ = toastEvent;
        this.eventTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolBarMode(ChangeToolBarModeEvent changeToolBarModeEvent) {
        changeToolBarModeEvent.getClass();
        this.eventType_ = changeToolBarModeEvent;
        this.eventTypeCase_ = 8;
    }

    public static EventMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EventMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EventMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EventMessage parseFrom(InputStream inputStream) throws IOException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EventMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EventMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
