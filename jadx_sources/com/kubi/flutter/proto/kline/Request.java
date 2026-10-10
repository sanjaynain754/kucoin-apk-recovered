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
public final class Request extends GeneratedMessageLite<Request, C12703b> implements MessageLiteOrBuilder {
    public static final int CANDLELIST_FIELD_NUMBER = 2;
    private static final Request DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 3;
    public static final int ORDERLIST_FIELD_NUMBER = 4;
    private static volatile Parser<Request> PARSER = null;
    public static final int VIEWCONTROL_FIELD_NUMBER = 1;
    private int bodyCase_ = 0;
    private Object body_;

    public enum BodyCase {
        VIEWCONTROL(1),
        CANDLELIST(2),
        EVENT(3),
        ORDERLIST(4),
        BODY_NOT_SET(0);

        private final int value;

        public static BodyCase forNumber(int i11) {
            if (i11 == 0) {
                return BODY_NOT_SET;
            }
            if (i11 == 1) {
                return VIEWCONTROL;
            }
            if (i11 == 2) {
                return CANDLELIST;
            }
            if (i11 == 3) {
                return EVENT;
            }
            if (i11 != 4) {
                return null;
            }
            return ORDERLIST;
        }

        @Deprecated
        public static BodyCase valueOf(int i11) {
            return forNumber(i11);
        }

        public int getNumber() {
            return this.value;
        }

        BodyCase(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.Request$b */
    public static final class C12703b extends GeneratedMessageLite.Builder<Request, C12703b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12703b(C12702a c12702a) {
            this();
        }

        public C12703b() {
            super(Request.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12703b m24008a(CandleList candleList) {
            copyOnWrite();
            ((Request) this.instance).setCandleList(candleList);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12703b m24009b(OrderList orderList) {
            copyOnWrite();
            ((Request) this.instance).setOrderList(orderList);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12703b m24010c(ViewControl viewControl) {
            copyOnWrite();
            ((Request) this.instance).setViewControl(viewControl);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.bodyCase_ = 0;
        this.body_ = null;
    }

    public static C12703b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Request) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.Request$a */
    public static /* synthetic */ class C12702a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22172a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22172a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22172a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22172a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22172a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22172a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22172a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22172a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Request request = new Request();
        DEFAULT_INSTANCE = request;
        GeneratedMessageLite.registerDefaultInstance(Request.class, request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCandleList() {
        if (this.bodyCase_ == 2) {
            this.bodyCase_ = 0;
            this.body_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        if (this.bodyCase_ == 3) {
            this.bodyCase_ = 0;
            this.body_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderList() {
        if (this.bodyCase_ == 4) {
            this.bodyCase_ = 0;
            this.body_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewControl() {
        if (this.bodyCase_ == 1) {
            this.bodyCase_ = 0;
            this.body_ = null;
        }
    }

    public static Request getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12703b newBuilder(Request request) {
        return DEFAULT_INSTANCE.createBuilder(request);
    }

    public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Request) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Request> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12702a c12702a = null;
        switch (C12702a.f22172a[methodToInvoke.ordinal()]) {
            case 1:
                return new Request();
            case 2:
                return new C12703b(c12702a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"body_", "bodyCase_", ViewControl.class, CandleList.class, EventMessage.class, OrderList.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Request> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Request.class) {
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

    public BodyCase getBodyCase() {
        return BodyCase.forNumber(this.bodyCase_);
    }

    public CandleList getCandleList() {
        return this.bodyCase_ == 2 ? (CandleList) this.body_ : CandleList.getDefaultInstance();
    }

    public EventMessage getEvent() {
        return this.bodyCase_ == 3 ? (EventMessage) this.body_ : EventMessage.getDefaultInstance();
    }

    public OrderList getOrderList() {
        return this.bodyCase_ == 4 ? (OrderList) this.body_ : OrderList.getDefaultInstance();
    }

    public ViewControl getViewControl() {
        return this.bodyCase_ == 1 ? (ViewControl) this.body_ : ViewControl.getDefaultInstance();
    }

    public boolean hasCandleList() {
        return this.bodyCase_ == 2;
    }

    public boolean hasEvent() {
        return this.bodyCase_ == 3;
    }

    public boolean hasOrderList() {
        return this.bodyCase_ == 4;
    }

    public boolean hasViewControl() {
        return this.bodyCase_ == 1;
    }

    private Request() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCandleList(CandleList candleList) {
        candleList.getClass();
        if (this.bodyCase_ == 2 && this.body_ != CandleList.getDefaultInstance()) {
            this.body_ = CandleList.newBuilder((CandleList) this.body_).mergeFrom(candleList).buildPartial();
        } else {
            this.body_ = candleList;
        }
        this.bodyCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(EventMessage eventMessage) {
        eventMessage.getClass();
        if (this.bodyCase_ == 3 && this.body_ != EventMessage.getDefaultInstance()) {
            this.body_ = EventMessage.newBuilder((EventMessage) this.body_).mergeFrom(eventMessage).buildPartial();
        } else {
            this.body_ = eventMessage;
        }
        this.bodyCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrderList(OrderList orderList) {
        orderList.getClass();
        if (this.bodyCase_ == 4 && this.body_ != OrderList.getDefaultInstance()) {
            this.body_ = OrderList.newBuilder((OrderList) this.body_).mergeFrom(orderList).buildPartial();
        } else {
            this.body_ = orderList;
        }
        this.bodyCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewControl(ViewControl viewControl) {
        viewControl.getClass();
        if (this.bodyCase_ == 1 && this.body_ != ViewControl.getDefaultInstance()) {
            this.body_ = ViewControl.newBuilder((ViewControl) this.body_).mergeFrom(viewControl).buildPartial();
        } else {
            this.body_ = viewControl;
        }
        this.bodyCase_ = 1;
    }

    public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCandleList(CandleList candleList) {
        candleList.getClass();
        this.body_ = candleList;
        this.bodyCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(EventMessage eventMessage) {
        eventMessage.getClass();
        this.body_ = eventMessage;
        this.bodyCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderList(OrderList orderList) {
        orderList.getClass();
        this.body_ = orderList;
        this.bodyCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewControl(ViewControl viewControl) {
        viewControl.getClass();
        this.body_ = viewControl;
        this.bodyCase_ = 1;
    }

    public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Request parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Request parseFrom(InputStream inputStream) throws IOException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Request parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
