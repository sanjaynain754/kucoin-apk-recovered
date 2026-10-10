package com.google.api;

import com.google.protobuf.AbstractMessageLite;
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
public final class SystemParameterRule extends GeneratedMessageLite<SystemParameterRule, Builder> implements SystemParameterRuleOrBuilder {
    private static final SystemParameterRule DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile Parser<SystemParameterRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private Internal.ProtobufList<SystemParameter> parameters_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<SystemParameterRule, Builder> implements SystemParameterRuleOrBuilder {
        public /* synthetic */ Builder(C78981 c78981) {
            this();
        }

        public Builder addParameters(SystemParameter systemParameter) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters(systemParameter);
            return this;
        }

        public Builder setParameters(int i11, SystemParameter systemParameter) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setParameters(i11, systemParameter);
            return this;
        }

        private Builder() {
            super(SystemParameterRule.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public SystemParameter getParameters(int i11) {
            return ((SystemParameterRule) this.instance).getParameters(i11);
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public int getParametersCount() {
            return ((SystemParameterRule) this.instance).getParametersCount();
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public List<SystemParameter> getParametersList() {
            return Collections.unmodifiableList(((SystemParameterRule) this.instance).getParametersList());
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public String getSelector() {
            return ((SystemParameterRule) this.instance).getSelector();
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public ByteString getSelectorBytes() {
            return ((SystemParameterRule) this.instance).getSelectorBytes();
        }

        public Builder addAllParameters(Iterable<? extends SystemParameter> iterable) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addAllParameters(iterable);
            return this;
        }

        public Builder addParameters(int i11, SystemParameter systemParameter) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters(i11, systemParameter);
            return this;
        }

        public Builder clearParameters() {
            copyOnWrite();
            ((SystemParameterRule) this.instance).clearParameters();
            return this;
        }

        public Builder clearSelector() {
            copyOnWrite();
            ((SystemParameterRule) this.instance).clearSelector();
            return this;
        }

        public Builder removeParameters(int i11) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).removeParameters(i11);
            return this;
        }

        public Builder setParameters(int i11, SystemParameter.Builder builder) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setParameters(i11, builder.build());
            return this;
        }

        public Builder setSelector(String str) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setSelector(str);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).setSelectorBytes(byteString);
            return this;
        }

        public Builder addParameters(SystemParameter.Builder builder) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters(builder.build());
            return this;
        }

        public Builder addParameters(int i11, SystemParameter.Builder builder) {
            copyOnWrite();
            ((SystemParameterRule) this.instance).addParameters(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(systemParameter);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.SystemParameterRule$1 */
    public static /* synthetic */ class C78981 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12168xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12168xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12168xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12168xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12168xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12168xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12168xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12168xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        SystemParameterRule systemParameterRule = new SystemParameterRule();
        DEFAULT_INSTANCE = systemParameterRule;
        GeneratedMessageLite.registerDefaultInstance(SystemParameterRule.class, systemParameterRule);
    }

    private void ensureParametersIsMutable() {
        Internal.ProtobufList<SystemParameter> protobufList = this.parameters_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.parameters_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SystemParameterRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(SystemParameterRule systemParameterRule) {
        return DEFAULT_INSTANCE.createBuilder(systemParameterRule);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<SystemParameterRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78981 c78981 = null;
        switch (C78981.f12168xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SystemParameterRule();
            case 2:
                return new Builder(c78981);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", SystemParameter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SystemParameterRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SystemParameterRule.class) {
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

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public SystemParameter getParameters(int i11) {
        return this.parameters_.get(i11);
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public int getParametersCount() {
        return this.parameters_.size();
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public List<SystemParameter> getParametersList() {
        return this.parameters_;
    }

    public SystemParameterOrBuilder getParametersOrBuilder(int i11) {
        return this.parameters_.get(i11);
    }

    public List<? extends SystemParameterOrBuilder> getParametersOrBuilderList() {
        return this.parameters_;
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public String getSelector() {
        return this.selector_;
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    private SystemParameterRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParameters(Iterable<? extends SystemParameter> iterable) {
        ensureParametersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.parameters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameters() {
        this.parameters_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static SystemParameterRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParameters(int i11) {
        ensureParametersIsMutable();
        this.parameters_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameters(int i11, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.set(i11, systemParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selector_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(int i11, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(i11, systemParameter);
    }

    public static SystemParameterRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameterRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
