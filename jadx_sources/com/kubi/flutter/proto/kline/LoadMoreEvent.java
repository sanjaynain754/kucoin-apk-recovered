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
public final class LoadMoreEvent extends GeneratedMessageLite<LoadMoreEvent, C12670b> implements MessageLiteOrBuilder {
    private static final LoadMoreEvent DEFAULT_INSTANCE;
    public static final int FIRSTTIME_FIELD_NUMBER = 2;
    private static volatile Parser<LoadMoreEvent> PARSER;
    private long firstTime_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.LoadMoreEvent$b */
    public static final class C12670b extends GeneratedMessageLite.Builder<LoadMoreEvent, C12670b> implements MessageLiteOrBuilder {
        public /* synthetic */ C12670b(C12669a c12669a) {
            this();
        }

        public C12670b() {
            super(LoadMoreEvent.DEFAULT_INSTANCE);
        }
    }

    public static C12670b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LoadMoreEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LoadMoreEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadMoreEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.LoadMoreEvent$a */
    public static /* synthetic */ class C12669a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22121a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22121a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22121a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22121a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22121a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22121a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22121a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22121a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        LoadMoreEvent loadMoreEvent = new LoadMoreEvent();
        DEFAULT_INSTANCE = loadMoreEvent;
        GeneratedMessageLite.registerDefaultInstance(LoadMoreEvent.class, loadMoreEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstTime() {
        this.firstTime_ = 0L;
    }

    public static LoadMoreEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12670b newBuilder(LoadMoreEvent loadMoreEvent) {
        return DEFAULT_INSTANCE.createBuilder(loadMoreEvent);
    }

    public static LoadMoreEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoadMoreEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LoadMoreEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<LoadMoreEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstTime(long j11) {
        this.firstTime_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12669a c12669a = null;
        switch (C12669a.f22121a[methodToInvoke.ordinal()]) {
            case 1:
                return new LoadMoreEvent();
            case 2:
                return new C12670b(c12669a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0003", new Object[]{"firstTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LoadMoreEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LoadMoreEvent.class) {
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

    public long getFirstTime() {
        return this.firstTime_;
    }

    private LoadMoreEvent() {
    }

    public static LoadMoreEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LoadMoreEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LoadMoreEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LoadMoreEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LoadMoreEvent parseFrom(InputStream inputStream) throws IOException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LoadMoreEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LoadMoreEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LoadMoreEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoadMoreEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
