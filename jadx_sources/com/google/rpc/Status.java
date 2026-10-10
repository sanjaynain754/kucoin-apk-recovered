package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Status> PARSER;
    private int code_;
    private String message_ = "";
    private Internal.ProtobufList<Any> details_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Status, Builder> implements StatusOrBuilder {
        public /* synthetic */ Builder(C91261 c91261) {
            this();
        }

        public Builder addDetails(Any any) {
            copyOnWrite();
            ((Status) this.instance).addDetails(any);
            return this;
        }

        public Builder setDetails(int i11, Any any) {
            copyOnWrite();
            ((Status) this.instance).setDetails(i11, any);
            return this;
        }

        private Builder() {
            super(Status.DEFAULT_INSTANCE);
        }

        @Override // com.google.rpc.StatusOrBuilder
        public int getCode() {
            return ((Status) this.instance).getCode();
        }

        @Override // com.google.rpc.StatusOrBuilder
        public Any getDetails(int i11) {
            return ((Status) this.instance).getDetails(i11);
        }

        @Override // com.google.rpc.StatusOrBuilder
        public int getDetailsCount() {
            return ((Status) this.instance).getDetailsCount();
        }

        @Override // com.google.rpc.StatusOrBuilder
        public List<Any> getDetailsList() {
            return Collections.unmodifiableList(((Status) this.instance).getDetailsList());
        }

        @Override // com.google.rpc.StatusOrBuilder
        public String getMessage() {
            return ((Status) this.instance).getMessage();
        }

        @Override // com.google.rpc.StatusOrBuilder
        public ByteString getMessageBytes() {
            return ((Status) this.instance).getMessageBytes();
        }

        public Builder addAllDetails(Iterable<? extends Any> iterable) {
            copyOnWrite();
            ((Status) this.instance).addAllDetails(iterable);
            return this;
        }

        public Builder addDetails(int i11, Any any) {
            copyOnWrite();
            ((Status) this.instance).addDetails(i11, any);
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((Status) this.instance).clearCode();
            return this;
        }

        public Builder clearDetails() {
            copyOnWrite();
            ((Status) this.instance).clearDetails();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((Status) this.instance).clearMessage();
            return this;
        }

        public Builder removeDetails(int i11) {
            copyOnWrite();
            ((Status) this.instance).removeDetails(i11);
            return this;
        }

        public Builder setCode(int i11) {
            copyOnWrite();
            ((Status) this.instance).setCode(i11);
            return this;
        }

        public Builder setDetails(int i11, Any.Builder builder) {
            copyOnWrite();
            ((Status) this.instance).setDetails(i11, builder.build());
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((Status) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((Status) this.instance).setMessageBytes(byteString);
            return this;
        }

        public Builder addDetails(Any.Builder builder) {
            copyOnWrite();
            ((Status) this.instance).addDetails(builder.build());
            return this;
        }

        public Builder addDetails(int i11, Any.Builder builder) {
            copyOnWrite();
            ((Status) this.instance).addDetails(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.add(any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.rpc.Status$1 */
    public static /* synthetic */ class C91261 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12767xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12767xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12767xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12767xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12767xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12767xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12767xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12767xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        GeneratedMessageLite.registerDefaultInstance(Status.class, status);
    }

    private void ensureDetailsIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.details_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.details_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Status status) {
        return DEFAULT_INSTANCE.createBuilder(status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Status> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i11) {
        this.code_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C91261 c91261 = null;
        switch (C91261.f12767xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Status();
            case 2:
                return new Builder(c91261);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Status> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Status.class) {
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

    @Override // com.google.rpc.StatusOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.google.rpc.StatusOrBuilder
    public Any getDetails(int i11) {
        return this.details_.get(i11);
    }

    @Override // com.google.rpc.StatusOrBuilder
    public int getDetailsCount() {
        return this.details_.size();
    }

    @Override // com.google.rpc.StatusOrBuilder
    public List<Any> getDetailsList() {
        return this.details_;
    }

    public AnyOrBuilder getDetailsOrBuilder(int i11) {
        return this.details_.get(i11);
    }

    public List<? extends AnyOrBuilder> getDetailsOrBuilderList() {
        return this.details_;
    }

    @Override // com.google.rpc.StatusOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.google.rpc.StatusOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    private Status() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends Any> iterable) {
        ensureDetailsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetails(int i11) {
        ensureDetailsIsMutable();
        this.details_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(int i11, Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i11, any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(int i11, Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i11, any);
    }

    public static Status parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Status parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Status parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
