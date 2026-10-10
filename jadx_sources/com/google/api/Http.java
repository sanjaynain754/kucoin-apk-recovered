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
public final class Http extends GeneratedMessageLite<Http, Builder> implements HttpOrBuilder {
    private static final Http DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile Parser<Http> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private Internal.ProtobufList<HttpRule> rules_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Http, Builder> implements HttpOrBuilder {
        public /* synthetic */ Builder(C78671 c78671) {
            this();
        }

        public Builder addRules(HttpRule httpRule) {
            copyOnWrite();
            ((Http) this.instance).addRules(httpRule);
            return this;
        }

        public Builder setRules(int i11, HttpRule httpRule) {
            copyOnWrite();
            ((Http) this.instance).setRules(i11, httpRule);
            return this;
        }

        private Builder() {
            super(Http.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.HttpOrBuilder
        public boolean getFullyDecodeReservedExpansion() {
            return ((Http) this.instance).getFullyDecodeReservedExpansion();
        }

        @Override // com.google.api.HttpOrBuilder
        public HttpRule getRules(int i11) {
            return ((Http) this.instance).getRules(i11);
        }

        @Override // com.google.api.HttpOrBuilder
        public int getRulesCount() {
            return ((Http) this.instance).getRulesCount();
        }

        @Override // com.google.api.HttpOrBuilder
        public List<HttpRule> getRulesList() {
            return Collections.unmodifiableList(((Http) this.instance).getRulesList());
        }

        public Builder addAllRules(Iterable<? extends HttpRule> iterable) {
            copyOnWrite();
            ((Http) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRules(int i11, HttpRule httpRule) {
            copyOnWrite();
            ((Http) this.instance).addRules(i11, httpRule);
            return this;
        }

        public Builder clearFullyDecodeReservedExpansion() {
            copyOnWrite();
            ((Http) this.instance).clearFullyDecodeReservedExpansion();
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Http) this.instance).clearRules();
            return this;
        }

        public Builder removeRules(int i11) {
            copyOnWrite();
            ((Http) this.instance).removeRules(i11);
            return this;
        }

        public Builder setFullyDecodeReservedExpansion(boolean z11) {
            copyOnWrite();
            ((Http) this.instance).setFullyDecodeReservedExpansion(z11);
            return this;
        }

        public Builder setRules(int i11, HttpRule.Builder builder) {
            copyOnWrite();
            ((Http) this.instance).setRules(i11, builder.build());
            return this;
        }

        public Builder addRules(HttpRule.Builder builder) {
            copyOnWrite();
            ((Http) this.instance).addRules(builder.build());
            return this;
        }

        public Builder addRules(int i11, HttpRule.Builder builder) {
            copyOnWrite();
            ((Http) this.instance).addRules(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullyDecodeReservedExpansion() {
        this.fullyDecodeReservedExpansion_ = false;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Http parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Http) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.Http$1 */
    public static /* synthetic */ class C78671 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12142xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12142xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12142xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12142xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12142xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12142xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12142xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12142xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Http http = new Http();
        DEFAULT_INSTANCE = http;
        GeneratedMessageLite.registerDefaultInstance(Http.class, http);
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<HttpRule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Http getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Http http) {
        return DEFAULT_INSTANCE.createBuilder(http);
    }

    public static Http parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Http parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Http> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullyDecodeReservedExpansion(boolean z11) {
        this.fullyDecodeReservedExpansion_ = z11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78671 c78671 = null;
        switch (C78671.f12142xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Http();
            case 2:
                return new Builder(c78671);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"rules_", HttpRule.class, "fullyDecodeReservedExpansion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Http> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Http.class) {
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

    @Override // com.google.api.HttpOrBuilder
    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
    }

    @Override // com.google.api.HttpOrBuilder
    public HttpRule getRules(int i11) {
        return this.rules_.get(i11);
    }

    @Override // com.google.api.HttpOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.HttpOrBuilder
    public List<HttpRule> getRulesList() {
        return this.rules_;
    }

    public HttpRuleOrBuilder getRulesOrBuilder(int i11) {
        return this.rules_.get(i11);
    }

    public List<? extends HttpRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    private Http() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends HttpRule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Http parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i11) {
        ensureRulesIsMutable();
        this.rules_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i11, HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i11, httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i11, HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i11, httpRule);
    }

    public static Http parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Http parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Http parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Http parseFrom(InputStream inputStream) throws IOException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Http parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Http parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
