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
public final class Context extends GeneratedMessageLite<Context, Builder> implements ContextOrBuilder {
    private static final Context DEFAULT_INSTANCE;
    private static volatile Parser<Context> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ContextRule> rules_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Context, Builder> implements ContextOrBuilder {
        public /* synthetic */ Builder(C78581 c78581) {
            this();
        }

        public Builder addRules(ContextRule contextRule) {
            copyOnWrite();
            ((Context) this.instance).addRules(contextRule);
            return this;
        }

        public Builder setRules(int i11, ContextRule contextRule) {
            copyOnWrite();
            ((Context) this.instance).setRules(i11, contextRule);
            return this;
        }

        private Builder() {
            super(Context.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.ContextOrBuilder
        public ContextRule getRules(int i11) {
            return ((Context) this.instance).getRules(i11);
        }

        @Override // com.google.api.ContextOrBuilder
        public int getRulesCount() {
            return ((Context) this.instance).getRulesCount();
        }

        @Override // com.google.api.ContextOrBuilder
        public List<ContextRule> getRulesList() {
            return Collections.unmodifiableList(((Context) this.instance).getRulesList());
        }

        public Builder addAllRules(Iterable<? extends ContextRule> iterable) {
            copyOnWrite();
            ((Context) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRules(int i11, ContextRule contextRule) {
            copyOnWrite();
            ((Context) this.instance).addRules(i11, contextRule);
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Context) this.instance).clearRules();
            return this;
        }

        public Builder removeRules(int i11) {
            copyOnWrite();
            ((Context) this.instance).removeRules(i11);
            return this;
        }

        public Builder setRules(int i11, ContextRule.Builder builder) {
            copyOnWrite();
            ((Context) this.instance).setRules(i11, builder.build());
            return this;
        }

        public Builder addRules(ContextRule.Builder builder) {
            copyOnWrite();
            ((Context) this.instance).addRules(builder.build());
            return this;
        }

        public Builder addRules(int i11, ContextRule.Builder builder) {
            copyOnWrite();
            ((Context) this.instance).addRules(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(contextRule);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.Context$1 */
    public static /* synthetic */ class C78581 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12134xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12134xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12134xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12134xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12134xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12134xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12134xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12134xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        GeneratedMessageLite.registerDefaultInstance(Context.class, context);
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<ContextRule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Context context) {
        return DEFAULT_INSTANCE.createBuilder(context);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Context> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78581 c78581 = null;
        switch (C78581.f12134xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Context();
            case 2:
                return new Builder(c78581);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", ContextRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Context> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Context.class) {
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

    @Override // com.google.api.ContextOrBuilder
    public ContextRule getRules(int i11) {
        return this.rules_.get(i11);
    }

    @Override // com.google.api.ContextOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.ContextOrBuilder
    public List<ContextRule> getRulesList() {
        return this.rules_;
    }

    public ContextRuleOrBuilder getRulesOrBuilder(int i11) {
        return this.rules_.get(i11);
    }

    public List<? extends ContextRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    private Context() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends ContextRule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i11) {
        ensureRulesIsMutable();
        this.rules_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i11, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i11, contextRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i11, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i11, contextRule);
    }

    public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Context parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Context parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
