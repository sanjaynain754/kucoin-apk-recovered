package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
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
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public final class BadRequest extends GeneratedMessageLite<BadRequest, Builder> implements BadRequestOrBuilder {
    private static final BadRequest DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<BadRequest> PARSER;
    private Internal.ProtobufList<FieldViolation> fieldViolations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<BadRequest, Builder> implements BadRequestOrBuilder {
        public /* synthetic */ Builder(C91151 c91151) {
            this();
        }

        public Builder addFieldViolations(FieldViolation fieldViolation) {
            copyOnWrite();
            ((BadRequest) this.instance).addFieldViolations(fieldViolation);
            return this;
        }

        public Builder setFieldViolations(int i11, FieldViolation fieldViolation) {
            copyOnWrite();
            ((BadRequest) this.instance).setFieldViolations(i11, fieldViolation);
            return this;
        }

        private Builder() {
            super(BadRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.rpc.BadRequestOrBuilder
        public FieldViolation getFieldViolations(int i11) {
            return ((BadRequest) this.instance).getFieldViolations(i11);
        }

        @Override // com.google.rpc.BadRequestOrBuilder
        public int getFieldViolationsCount() {
            return ((BadRequest) this.instance).getFieldViolationsCount();
        }

        @Override // com.google.rpc.BadRequestOrBuilder
        public List<FieldViolation> getFieldViolationsList() {
            return Collections.unmodifiableList(((BadRequest) this.instance).getFieldViolationsList());
        }

        public Builder addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
            copyOnWrite();
            ((BadRequest) this.instance).addAllFieldViolations(iterable);
            return this;
        }

        public Builder addFieldViolations(int i11, FieldViolation fieldViolation) {
            copyOnWrite();
            ((BadRequest) this.instance).addFieldViolations(i11, fieldViolation);
            return this;
        }

        public Builder clearFieldViolations() {
            copyOnWrite();
            ((BadRequest) this.instance).clearFieldViolations();
            return this;
        }

        public Builder removeFieldViolations(int i11) {
            copyOnWrite();
            ((BadRequest) this.instance).removeFieldViolations(i11);
            return this;
        }

        public Builder setFieldViolations(int i11, FieldViolation.Builder builder) {
            copyOnWrite();
            ((BadRequest) this.instance).setFieldViolations(i11, builder.build());
            return this;
        }

        public Builder addFieldViolations(FieldViolation.Builder builder) {
            copyOnWrite();
            ((BadRequest) this.instance).addFieldViolations(builder.build());
            return this;
        }

        public Builder addFieldViolations(int i11, FieldViolation.Builder builder) {
            copyOnWrite();
            ((BadRequest) this.instance).addFieldViolations(i11, builder.build());
            return this;
        }
    }

    public static final class FieldViolation extends GeneratedMessageLite<FieldViolation, Builder> implements FieldViolationOrBuilder {
        private static final FieldViolation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<FieldViolation> PARSER;
        private String field_ = "";
        private String description_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FieldViolation, Builder> implements FieldViolationOrBuilder {
            public /* synthetic */ Builder(C91151 c91151) {
                this();
            }

            private Builder() {
                super(FieldViolation.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public String getDescription() {
                return ((FieldViolation) this.instance).getDescription();
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public ByteString getDescriptionBytes() {
                return ((FieldViolation) this.instance).getDescriptionBytes();
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public String getField() {
                return ((FieldViolation) this.instance).getField();
            }

            @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
            public ByteString getFieldBytes() {
                return ((FieldViolation) this.instance).getFieldBytes();
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((FieldViolation) this.instance).clearDescription();
                return this;
            }

            public Builder clearField() {
                copyOnWrite();
                ((FieldViolation) this.instance).clearField();
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((FieldViolation) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldViolation) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setField(String str) {
                copyOnWrite();
                ((FieldViolation) this.instance).setField(str);
                return this;
            }

            public Builder setFieldBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldViolation) this.instance).setFieldBytes(byteString);
                return this;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            FieldViolation fieldViolation = new FieldViolation();
            DEFAULT_INSTANCE = fieldViolation;
            GeneratedMessageLite.registerDefaultInstance(FieldViolation.class, fieldViolation);
        }

        public static FieldViolation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(FieldViolation fieldViolation) {
            return DEFAULT_INSTANCE.createBuilder(fieldViolation);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Parser<FieldViolation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            C91151 c91151 = null;
            switch (C91151.f12756xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldViolation();
                case 2:
                    return new Builder(c91151);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldViolation> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FieldViolation.class) {
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

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public String getDescription() {
            return this.description_;
        }

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public String getField() {
            return this.field_;
        }

        @Override // com.google.rpc.BadRequest.FieldViolationOrBuilder
        public ByteString getFieldBytes() {
            return ByteString.copyFromUtf8(this.field_);
        }

        private FieldViolation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = getDefaultInstance().getField();
        }

        public static FieldViolation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(String str) {
            str.getClass();
            this.field_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.field_ = byteString.toStringUtf8();
        }

        public static FieldViolation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FieldViolation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldViolation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FieldViolation parseFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface FieldViolationOrBuilder extends MessageLiteOrBuilder {
        String getDescription();

        ByteString getDescriptionBytes();

        String getField();

        ByteString getFieldBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldViolations(FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(fieldViolation);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.rpc.BadRequest$1 */
    public static /* synthetic */ class C91151 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12756xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12756xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12756xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12756xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12756xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12756xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12756xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12756xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        BadRequest badRequest = new BadRequest();
        DEFAULT_INSTANCE = badRequest;
        GeneratedMessageLite.registerDefaultInstance(BadRequest.class, badRequest);
    }

    private void ensureFieldViolationsIsMutable() {
        Internal.ProtobufList<FieldViolation> protobufList = this.fieldViolations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fieldViolations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static BadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(BadRequest badRequest) {
        return DEFAULT_INSTANCE.createBuilder(badRequest);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<BadRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C91151 c91151 = null;
        switch (C91151.f12756xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BadRequest();
            case 2:
                return new Builder(c91151);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", FieldViolation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BadRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BadRequest.class) {
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

    @Override // com.google.rpc.BadRequestOrBuilder
    public FieldViolation getFieldViolations(int i11) {
        return this.fieldViolations_.get(i11);
    }

    @Override // com.google.rpc.BadRequestOrBuilder
    public int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    @Override // com.google.rpc.BadRequestOrBuilder
    public List<FieldViolation> getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public FieldViolationOrBuilder getFieldViolationsOrBuilder(int i11) {
        return this.fieldViolations_.get(i11);
    }

    public List<? extends FieldViolationOrBuilder> getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }

    private BadRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
        ensureFieldViolationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fieldViolations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldViolations() {
        this.fieldViolations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static BadRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldViolations(int i11) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldViolations(int i11, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(i11, fieldViolation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldViolations(int i11, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(i11, fieldViolation);
    }

    public static BadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BadRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BadRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BadRequest parseFrom(InputStream inputStream) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
