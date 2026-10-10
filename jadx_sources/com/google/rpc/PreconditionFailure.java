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
public final class PreconditionFailure extends GeneratedMessageLite<PreconditionFailure, Builder> implements PreconditionFailureOrBuilder {
    private static final PreconditionFailure DEFAULT_INSTANCE;
    private static volatile Parser<PreconditionFailure> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Violation> violations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<PreconditionFailure, Builder> implements PreconditionFailureOrBuilder {
        public /* synthetic */ Builder(C91211 c91211) {
            this();
        }

        public Builder addViolations(Violation violation) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).addViolations(violation);
            return this;
        }

        public Builder setViolations(int i11, Violation violation) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).setViolations(i11, violation);
            return this;
        }

        private Builder() {
            super(PreconditionFailure.DEFAULT_INSTANCE);
        }

        @Override // com.google.rpc.PreconditionFailureOrBuilder
        public Violation getViolations(int i11) {
            return ((PreconditionFailure) this.instance).getViolations(i11);
        }

        @Override // com.google.rpc.PreconditionFailureOrBuilder
        public int getViolationsCount() {
            return ((PreconditionFailure) this.instance).getViolationsCount();
        }

        @Override // com.google.rpc.PreconditionFailureOrBuilder
        public List<Violation> getViolationsList() {
            return Collections.unmodifiableList(((PreconditionFailure) this.instance).getViolationsList());
        }

        public Builder addAllViolations(Iterable<? extends Violation> iterable) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).addAllViolations(iterable);
            return this;
        }

        public Builder addViolations(int i11, Violation violation) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).addViolations(i11, violation);
            return this;
        }

        public Builder clearViolations() {
            copyOnWrite();
            ((PreconditionFailure) this.instance).clearViolations();
            return this;
        }

        public Builder removeViolations(int i11) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).removeViolations(i11);
            return this;
        }

        public Builder setViolations(int i11, Violation.Builder builder) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).setViolations(i11, builder.build());
            return this;
        }

        public Builder addViolations(Violation.Builder builder) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).addViolations(builder.build());
            return this;
        }

        public Builder addViolations(int i11, Violation.Builder builder) {
            copyOnWrite();
            ((PreconditionFailure) this.instance).addViolations(i11, builder.build());
            return this;
        }
    }

    public static final class Violation extends GeneratedMessageLite<Violation, Builder> implements ViolationOrBuilder {
        private static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile Parser<Violation> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String type_ = "";
        private String subject_ = "";
        private String description_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Violation, Builder> implements ViolationOrBuilder {
            public /* synthetic */ Builder(C91211 c91211) {
                this();
            }

            private Builder() {
                super(Violation.DEFAULT_INSTANCE);
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public String getDescription() {
                return ((Violation) this.instance).getDescription();
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public ByteString getDescriptionBytes() {
                return ((Violation) this.instance).getDescriptionBytes();
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public String getSubject() {
                return ((Violation) this.instance).getSubject();
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public ByteString getSubjectBytes() {
                return ((Violation) this.instance).getSubjectBytes();
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public String getType() {
                return ((Violation) this.instance).getType();
            }

            @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
            public ByteString getTypeBytes() {
                return ((Violation) this.instance).getTypeBytes();
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((Violation) this.instance).clearDescription();
                return this;
            }

            public Builder clearSubject() {
                copyOnWrite();
                ((Violation) this.instance).clearSubject();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Violation) this.instance).clearType();
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((Violation) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((Violation) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setSubject(String str) {
                copyOnWrite();
                ((Violation) this.instance).setSubject(str);
                return this;
            }

            public Builder setSubjectBytes(ByteString byteString) {
                copyOnWrite();
                ((Violation) this.instance).setSubjectBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Violation) this.instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Violation) this.instance).setTypeBytes(byteString);
                return this;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Violation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            Violation violation = new Violation();
            DEFAULT_INSTANCE = violation;
            GeneratedMessageLite.registerDefaultInstance(Violation.class, violation);
        }

        public static Violation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Violation violation) {
            return DEFAULT_INSTANCE.createBuilder(violation);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Parser<Violation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            C91211 c91211 = null;
            switch (C91211.f12762xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Violation();
                case 2:
                    return new Builder(c91211);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Violation> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Violation.class) {
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

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public String getDescription() {
            return this.description_;
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public String getSubject() {
            return this.subject_;
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public ByteString getSubjectBytes() {
            return ByteString.copyFromUtf8(this.subject_);
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.google.rpc.PreconditionFailure.ViolationOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        private Violation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubject() {
            this.subject_ = getDefaultInstance().getSubject();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Violation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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
        public void setSubject(String str) {
            str.getClass();
            this.subject_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubjectBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.subject_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        public static Violation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Violation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Violation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Violation parseFrom(InputStream inputStream) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Violation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Violation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ViolationOrBuilder extends MessageLiteOrBuilder {
        String getDescription();

        ByteString getDescriptionBytes();

        String getSubject();

        ByteString getSubjectBytes();

        String getType();

        ByteString getTypeBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(violation);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.rpc.PreconditionFailure$1 */
    public static /* synthetic */ class C91211 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12762xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12762xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12762xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12762xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12762xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12762xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12762xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12762xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        PreconditionFailure preconditionFailure = new PreconditionFailure();
        DEFAULT_INSTANCE = preconditionFailure;
        GeneratedMessageLite.registerDefaultInstance(PreconditionFailure.class, preconditionFailure);
    }

    private void ensureViolationsIsMutable() {
        Internal.ProtobufList<Violation> protobufList = this.violations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.violations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PreconditionFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(PreconditionFailure preconditionFailure) {
        return DEFAULT_INSTANCE.createBuilder(preconditionFailure);
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<PreconditionFailure> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C91211 c91211 = null;
        switch (C91211.f12762xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PreconditionFailure();
            case 2:
                return new Builder(c91211);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", Violation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PreconditionFailure> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PreconditionFailure.class) {
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

    @Override // com.google.rpc.PreconditionFailureOrBuilder
    public Violation getViolations(int i11) {
        return this.violations_.get(i11);
    }

    @Override // com.google.rpc.PreconditionFailureOrBuilder
    public int getViolationsCount() {
        return this.violations_.size();
    }

    @Override // com.google.rpc.PreconditionFailureOrBuilder
    public List<Violation> getViolationsList() {
        return this.violations_;
    }

    public ViolationOrBuilder getViolationsOrBuilder(int i11) {
        return this.violations_.get(i11);
    }

    public List<? extends ViolationOrBuilder> getViolationsOrBuilderList() {
        return this.violations_;
    }

    private PreconditionFailure() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViolations(Iterable<? extends Violation> iterable) {
        ensureViolationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.violations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViolations() {
        this.violations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static PreconditionFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeViolations(int i11) {
        ensureViolationsIsMutable();
        this.violations_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViolations(int i11, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.set(i11, violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(int i11, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(i11, violation);
    }

    public static PreconditionFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreconditionFailure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreconditionFailure parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PreconditionFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
