package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes56.dex */
public final class TimeOfDay extends GeneratedMessageLite<TimeOfDay, Builder> implements TimeOfDayOrBuilder {
    private static final TimeOfDay DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile Parser<TimeOfDay> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    public static final class Builder extends GeneratedMessageLite.Builder<TimeOfDay, Builder> implements TimeOfDayOrBuilder {
        public /* synthetic */ Builder(C91391 c91391) {
            this();
        }

        private Builder() {
            super(TimeOfDay.DEFAULT_INSTANCE);
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getHours() {
            return ((TimeOfDay) this.instance).getHours();
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getMinutes() {
            return ((TimeOfDay) this.instance).getMinutes();
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getNanos() {
            return ((TimeOfDay) this.instance).getNanos();
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getSeconds() {
            return ((TimeOfDay) this.instance).getSeconds();
        }

        public Builder clearHours() {
            copyOnWrite();
            ((TimeOfDay) this.instance).clearHours();
            return this;
        }

        public Builder clearMinutes() {
            copyOnWrite();
            ((TimeOfDay) this.instance).clearMinutes();
            return this;
        }

        public Builder clearNanos() {
            copyOnWrite();
            ((TimeOfDay) this.instance).clearNanos();
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            ((TimeOfDay) this.instance).clearSeconds();
            return this;
        }

        public Builder setHours(int i11) {
            copyOnWrite();
            ((TimeOfDay) this.instance).setHours(i11);
            return this;
        }

        public Builder setMinutes(int i11) {
            copyOnWrite();
            ((TimeOfDay) this.instance).setMinutes(i11);
            return this;
        }

        public Builder setNanos(int i11) {
            copyOnWrite();
            ((TimeOfDay) this.instance).setNanos(i11);
            return this;
        }

        public Builder setSeconds(int i11) {
            copyOnWrite();
            ((TimeOfDay) this.instance).setSeconds(i11);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinutes() {
        this.minutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimeOfDay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.type.TimeOfDay$1 */
    public static /* synthetic */ class C91391 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12782xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12782xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12782xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12782xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12782xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12782xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12782xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12782xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        TimeOfDay timeOfDay = new TimeOfDay();
        DEFAULT_INSTANCE = timeOfDay;
        GeneratedMessageLite.registerDefaultInstance(TimeOfDay.class, timeOfDay);
    }

    public static TimeOfDay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(TimeOfDay timeOfDay) {
        return DEFAULT_INSTANCE.createBuilder(timeOfDay);
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeOfDay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<TimeOfDay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(int i11) {
        this.hours_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinutes(int i11) {
        this.minutes_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i11) {
        this.nanos_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(int i11) {
        this.seconds_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C91391 c91391 = null;
        switch (C91391.f12782xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TimeOfDay();
            case 2:
                return new Builder(c91391);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"hours_", "minutes_", "seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TimeOfDay> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TimeOfDay.class) {
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

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getHours() {
        return this.hours_;
    }

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getMinutes() {
        return this.minutes_;
    }

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getSeconds() {
        return this.seconds_;
    }

    private TimeOfDay() {
    }

    public static TimeOfDay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TimeOfDay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TimeOfDay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(InputStream inputStream) throws IOException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeOfDay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeOfDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
