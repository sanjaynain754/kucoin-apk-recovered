package com.kubi.flutter.proto.kline;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p312hg.InterfaceC38194a;

/* JADX INFO: loaded from: classes13.dex */
public final class CandleItem extends GeneratedMessageLite<CandleItem, C12640b> implements InterfaceC38194a {
    public static final int CLOSE_FIELD_NUMBER = 4;
    private static final CandleItem DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 5;
    public static final int LOW_FIELD_NUMBER = 6;
    public static final int OPEN_FIELD_NUMBER = 3;
    private static volatile Parser<CandleItem> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    public static final int VOLUME_FIELD_NUMBER = 7;
    private double close_;
    private double high_;
    private double low_;
    private double open_;
    private long time_;
    private double volume_;

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleItem$b */
    public static final class C12640b extends GeneratedMessageLite.Builder<CandleItem, C12640b> implements InterfaceC38194a {
        public /* synthetic */ C12640b(C12639a c12639a) {
            this();
        }

        public C12640b() {
            super(CandleItem.DEFAULT_INSTANCE);
        }

        /* JADX INFO: renamed from: a */
        public C12640b m23897a(double d11) {
            copyOnWrite();
            ((CandleItem) this.instance).setClose(d11);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12640b m23898b(double d11) {
            copyOnWrite();
            ((CandleItem) this.instance).setHigh(d11);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12640b m23899c(double d11) {
            copyOnWrite();
            ((CandleItem) this.instance).setLow(d11);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12640b m23900d(double d11) {
            copyOnWrite();
            ((CandleItem) this.instance).setOpen(d11);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C12640b m23901e(long j11) {
            copyOnWrite();
            ((CandleItem) this.instance).setTime(j11);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C12640b m23902f(double d11) {
            copyOnWrite();
            ((CandleItem) this.instance).setVolume(d11);
            return this;
        }
    }

    public static C12640b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CandleItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CandleItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.kubi.flutter.proto.kline.CandleItem$a */
    public static /* synthetic */ class C12639a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22072a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22072a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22072a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22072a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22072a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22072a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22072a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22072a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CandleItem candleItem = new CandleItem();
        DEFAULT_INSTANCE = candleItem;
        GeneratedMessageLite.registerDefaultInstance(CandleItem.class, candleItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClose() {
        this.close_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHigh() {
        this.high_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLow() {
        this.low_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpen() {
        this.open_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVolume() {
        this.volume_ = 0.0d;
    }

    public static CandleItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12640b newBuilder(CandleItem candleItem) {
        return DEFAULT_INSTANCE.createBuilder(candleItem);
    }

    public static CandleItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<CandleItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClose(double d11) {
        this.close_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHigh(double d11) {
        this.high_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLow(double d11) {
        this.low_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpen(double d11) {
        this.open_ = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j11) {
        this.time_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVolume(double d11) {
        this.volume_ = d11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C12639a c12639a = null;
        switch (C12639a.f22072a[methodToInvoke.ordinal()]) {
            case 1:
                return new CandleItem();
            case 2:
                return new C12640b(c12639a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0003\u0003\u0000\u0004\u0000\u0005\u0000\u0006\u0000\u0007\u0000", new Object[]{"time_", "open_", "close_", "high_", "low_", "volume_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CandleItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CandleItem.class) {
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

    public double getClose() {
        return this.close_;
    }

    public double getHigh() {
        return this.high_;
    }

    public double getLow() {
        return this.low_;
    }

    public double getOpen() {
        return this.open_;
    }

    public long getTime() {
        return this.time_;
    }

    public double getVolume() {
        return this.volume_;
    }

    private CandleItem() {
    }

    public static CandleItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CandleItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CandleItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CandleItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CandleItem parseFrom(InputStream inputStream) throws IOException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandleItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CandleItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CandleItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CandleItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
