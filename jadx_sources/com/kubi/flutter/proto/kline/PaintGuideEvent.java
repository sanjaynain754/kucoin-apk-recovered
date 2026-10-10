package com.kubi.flutter.proto.kline;

import com.google.protobuf.AbstractMessageLite;
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
public final class PaintGuideEvent extends GeneratedMessageLite<PaintGuideEvent, C12697b> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final PaintGuideEvent DEFAULT_INSTANCE;
    private static volatile Parser<PaintGuideEvent> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    private String title_ = "";
    private String content_ = "";

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.PaintGuideEvent$b */
    public static final class C12697b extends GeneratedMessageLite.Builder<PaintGuideEvent, C12697b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12697b(C12696a c12696a) {
            this();
        }

        public C12697b() {
            super(PaintGuideEvent.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static C12697b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PaintGuideEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PaintGuideEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaintGuideEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.PaintGuideEvent$a */
    public static /* synthetic */ class C12696a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22162a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22162a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22162a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22162a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22162a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22162a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22162a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22162a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        PaintGuideEvent paintGuideEvent = new PaintGuideEvent();
        DEFAULT_INSTANCE = paintGuideEvent;
        GeneratedMessageLite.registerDefaultInstance(PaintGuideEvent.class, paintGuideEvent);
    }

    public static PaintGuideEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12697b newBuilder(PaintGuideEvent paintGuideEvent) {
        return DEFAULT_INSTANCE.createBuilder(paintGuideEvent);
    }

    public static PaintGuideEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaintGuideEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaintGuideEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<PaintGuideEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i11) {
        this.type_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12696a c12696a = null;
        switch (C12696a.f22162a[methodToInvoke.ordinal()]) {
            case 1:
                return new PaintGuideEvent();
            case 2:
                return new C12697b(c12696a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "title_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PaintGuideEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PaintGuideEvent.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public AlertType getType() {
        AlertType alertTypeForNumber = AlertType.forNumber(this.type_);
        return alertTypeForNumber == null ? AlertType.UNRECOGNIZED : alertTypeForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    private PaintGuideEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static PaintGuideEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(AlertType alertType) {
        this.type_ = alertType.getNumber();
    }

    public static PaintGuideEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PaintGuideEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PaintGuideEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PaintGuideEvent parseFrom(InputStream inputStream) throws IOException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaintGuideEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaintGuideEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PaintGuideEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaintGuideEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
