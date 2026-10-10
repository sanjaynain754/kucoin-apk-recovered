package com.google.api;

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
public final class Control extends GeneratedMessageLite<Control, Builder> implements ControlOrBuilder {
    private static final Control DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile Parser<Control> PARSER;
    private String environment_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Control, Builder> implements ControlOrBuilder {
        public /* synthetic */ Builder(C78601 c78601) {
            this();
        }

        private Builder() {
            super(Control.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.ControlOrBuilder
        public String getEnvironment() {
            return ((Control) this.instance).getEnvironment();
        }

        @Override // com.google.api.ControlOrBuilder
        public ByteString getEnvironmentBytes() {
            return ((Control) this.instance).getEnvironmentBytes();
        }

        public Builder clearEnvironment() {
            copyOnWrite();
            ((Control) this.instance).clearEnvironment();
            return this;
        }

        public Builder setEnvironment(String str) {
            copyOnWrite();
            ((Control) this.instance).setEnvironment(str);
            return this;
        }

        public Builder setEnvironmentBytes(ByteString byteString) {
            copyOnWrite();
            ((Control) this.instance).setEnvironmentBytes(byteString);
            return this;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Control parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Control) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.Control$1 */
    public static /* synthetic */ class C78601 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12136xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12136xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12136xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12136xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12136xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12136xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12136xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12136xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Control control = new Control();
        DEFAULT_INSTANCE = control;
        GeneratedMessageLite.registerDefaultInstance(Control.class, control);
    }

    public static Control getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Control control) {
        return DEFAULT_INSTANCE.createBuilder(control);
    }

    public static Control parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Control parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Control> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78601 c78601 = null;
        switch (C78601.f12136xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Control();
            case 2:
                return new Builder(c78601);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"environment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Control> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Control.class) {
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

    @Override // com.google.api.ControlOrBuilder
    public String getEnvironment() {
        return this.environment_;
    }

    @Override // com.google.api.ControlOrBuilder
    public ByteString getEnvironmentBytes() {
        return ByteString.copyFromUtf8(this.environment_);
    }

    private Control() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnvironment() {
        this.environment_ = getDefaultInstance().getEnvironment();
    }

    public static Control parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironment(String str) {
        str.getClass();
        this.environment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironmentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.environment_ = byteString.toStringUtf8();
    }

    public static Control parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Control parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Control parseFrom(InputStream inputStream) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Control parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Control parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
