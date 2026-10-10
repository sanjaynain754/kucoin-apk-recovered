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
public final class Authentication extends GeneratedMessageLite<Authentication, Builder> implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE;
    private static volatile Parser<Authentication> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private Internal.ProtobufList<AuthenticationRule> rules_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<AuthProvider> providers_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Authentication, Builder> implements AuthenticationOrBuilder {
        public /* synthetic */ Builder(C78501 c78501) {
            this();
        }

        public Builder addProviders(AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(authProvider);
            return this;
        }

        public Builder addRules(AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(authenticationRule);
            return this;
        }

        public Builder setProviders(int i11, AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).setProviders(i11, authProvider);
            return this;
        }

        public Builder setRules(int i11, AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).setRules(i11, authenticationRule);
            return this;
        }

        private Builder() {
            super(Authentication.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthProvider getProviders(int i11) {
            return ((Authentication) this.instance).getProviders(i11);
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getProvidersCount() {
            return ((Authentication) this.instance).getProvidersCount();
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthProvider> getProvidersList() {
            return Collections.unmodifiableList(((Authentication) this.instance).getProvidersList());
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public AuthenticationRule getRules(int i11) {
            return ((Authentication) this.instance).getRules(i11);
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public int getRulesCount() {
            return ((Authentication) this.instance).getRulesCount();
        }

        @Override // com.google.api.AuthenticationOrBuilder
        public List<AuthenticationRule> getRulesList() {
            return Collections.unmodifiableList(((Authentication) this.instance).getRulesList());
        }

        public Builder addAllProviders(Iterable<? extends AuthProvider> iterable) {
            copyOnWrite();
            ((Authentication) this.instance).addAllProviders(iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends AuthenticationRule> iterable) {
            copyOnWrite();
            ((Authentication) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addProviders(int i11, AuthProvider authProvider) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(i11, authProvider);
            return this;
        }

        public Builder addRules(int i11, AuthenticationRule authenticationRule) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(i11, authenticationRule);
            return this;
        }

        public Builder clearProviders() {
            copyOnWrite();
            ((Authentication) this.instance).clearProviders();
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Authentication) this.instance).clearRules();
            return this;
        }

        public Builder removeProviders(int i11) {
            copyOnWrite();
            ((Authentication) this.instance).removeProviders(i11);
            return this;
        }

        public Builder removeRules(int i11) {
            copyOnWrite();
            ((Authentication) this.instance).removeRules(i11);
            return this;
        }

        public Builder setProviders(int i11, AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).setProviders(i11, builder.build());
            return this;
        }

        public Builder setRules(int i11, AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).setRules(i11, builder.build());
            return this;
        }

        public Builder addProviders(AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(builder.build());
            return this;
        }

        public Builder addRules(AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(builder.build());
            return this;
        }

        public Builder addProviders(int i11, AuthProvider.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addProviders(i11, builder.build());
            return this;
        }

        public Builder addRules(int i11, AuthenticationRule.Builder builder) {
            copyOnWrite();
            ((Authentication) this.instance).addRules(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(authenticationRule);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.Authentication$1 */
    public static /* synthetic */ class C78501 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12128xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12128xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12128xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12128xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12128xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12128xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12128xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12128xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        GeneratedMessageLite.registerDefaultInstance(Authentication.class, authentication);
    }

    private void ensureProvidersIsMutable() {
        Internal.ProtobufList<AuthProvider> protobufList = this.providers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.providers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<AuthenticationRule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Authentication authentication) {
        return DEFAULT_INSTANCE.createBuilder(authentication);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Authentication> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78501 c78501 = null;
        switch (C78501.f12128xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Authentication();
            case 2:
                return new Builder(c78501);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Authentication> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Authentication.class) {
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

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthProvider getProviders(int i11) {
        return this.providers_.get(i11);
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getProvidersCount() {
        return this.providers_.size();
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public AuthProviderOrBuilder getProvidersOrBuilder(int i11) {
        return this.providers_.get(i11);
    }

    public List<? extends AuthProviderOrBuilder> getProvidersOrBuilderList() {
        return this.providers_;
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public AuthenticationRule getRules(int i11) {
        return this.rules_.get(i11);
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.AuthenticationOrBuilder
    public List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public AuthenticationRuleOrBuilder getRulesOrBuilder(int i11) {
        return this.rules_.get(i11);
    }

    public List<? extends AuthenticationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    private Authentication() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        ensureProvidersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.providers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviders() {
        this.providers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Authentication parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProviders(int i11) {
        ensureProvidersIsMutable();
        this.providers_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i11) {
        ensureRulesIsMutable();
        this.rules_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviders(int i11, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.set(i11, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i11, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i11, authenticationRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(int i11, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(i11, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i11, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i11, authenticationRule);
    }

    public static Authentication parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Authentication parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Authentication parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
