package com.google.type;

import com.google.protobuf.AbstractMessageLite;
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
public final class Money extends GeneratedMessageLite<Money, Builder> implements MoneyOrBuilder {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final Money DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile Parser<Money> PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    public static final class Builder extends GeneratedMessageLite.Builder<Money, Builder> implements MoneyOrBuilder {
        public /* synthetic */ Builder(C91361 c91361) {
            this();
        }

        private Builder() {
            super(Money.DEFAULT_INSTANCE);
        }

        @Override // com.google.type.MoneyOrBuilder
        public String getCurrencyCode() {
            return ((Money) this.instance).getCurrencyCode();
        }

        @Override // com.google.type.MoneyOrBuilder
        public ByteString getCurrencyCodeBytes() {
            return ((Money) this.instance).getCurrencyCodeBytes();
        }

        @Override // com.google.type.MoneyOrBuilder
        public int getNanos() {
            return ((Money) this.instance).getNanos();
        }

        @Override // com.google.type.MoneyOrBuilder
        public long getUnits() {
            return ((Money) this.instance).getUnits();
        }

        public Builder clearCurrencyCode() {
            copyOnWrite();
            ((Money) this.instance).clearCurrencyCode();
            return this;
        }

        public Builder clearNanos() {
            copyOnWrite();
            ((Money) this.instance).clearNanos();
            return this;
        }

        public Builder clearUnits() {
            copyOnWrite();
            ((Money) this.instance).clearUnits();
            return this;
        }

        public Builder setCurrencyCode(String str) {
            copyOnWrite();
            ((Money) this.instance).setCurrencyCode(str);
            return this;
        }

        public Builder setCurrencyCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((Money) this.instance).setCurrencyCodeBytes(byteString);
            return this;
        }

        public Builder setNanos(int i11) {
            copyOnWrite();
            ((Money) this.instance).setNanos(i11);
            return this;
        }

        public Builder setUnits(long j11) {
            copyOnWrite();
            ((Money) this.instance).setUnits(j11);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Money parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Money) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Money parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.type.Money$1 */
    public static /* synthetic */ class C91361 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12775xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12775xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12775xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12775xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12775xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12775xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12775xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12775xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Money money = new Money();
        DEFAULT_INSTANCE = money;
        GeneratedMessageLite.registerDefaultInstance(Money.class, money);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnits() {
        this.units_ = 0L;
    }

    public static Money getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Money money) {
        return DEFAULT_INSTANCE.createBuilder(money);
    }

    public static Money parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Money parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Money> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i11) {
        this.nanos_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnits(long j11) {
        this.units_ = j11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C91361 c91361 = null;
        switch (C91361.f12775xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Money();
            case 2:
                return new Builder(c91361);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"currencyCode_", "units_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Money> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Money.class) {
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

    @Override // com.google.type.MoneyOrBuilder
    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    @Override // com.google.type.MoneyOrBuilder
    public ByteString getCurrencyCodeBytes() {
        return ByteString.copyFromUtf8(this.currencyCode_);
    }

    @Override // com.google.type.MoneyOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.type.MoneyOrBuilder
    public long getUnits() {
        return this.units_;
    }

    private Money() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrencyCode() {
        this.currencyCode_ = getDefaultInstance().getCurrencyCode();
    }

    public static Money parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCode(String str) {
        str.getClass();
        this.currencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.currencyCode_ = byteString.toStringUtf8();
    }

    public static Money parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Money parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Money parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Money parseFrom(InputStream inputStream) throws IOException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Money parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Money parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Money parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
