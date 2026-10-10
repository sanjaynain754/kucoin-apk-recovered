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
public final class Usage extends GeneratedMessageLite<Usage, Builder> implements UsageOrBuilder {
    private static final Usage DEFAULT_INSTANCE;
    private static volatile Parser<Usage> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private Internal.ProtobufList<String> requirements_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<UsageRule> rules_ = GeneratedMessageLite.emptyProtobufList();
    private String producerNotificationChannel_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Usage, Builder> implements UsageOrBuilder {
        public /* synthetic */ Builder(C79001 c79001) {
            this();
        }

        public Builder addRules(UsageRule usageRule) {
            copyOnWrite();
            ((Usage) this.instance).addRules(usageRule);
            return this;
        }

        public Builder setRules(int i11, UsageRule usageRule) {
            copyOnWrite();
            ((Usage) this.instance).setRules(i11, usageRule);
            return this;
        }

        private Builder() {
            super(Usage.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.UsageOrBuilder
        public String getProducerNotificationChannel() {
            return ((Usage) this.instance).getProducerNotificationChannel();
        }

        @Override // com.google.api.UsageOrBuilder
        public ByteString getProducerNotificationChannelBytes() {
            return ((Usage) this.instance).getProducerNotificationChannelBytes();
        }

        @Override // com.google.api.UsageOrBuilder
        public String getRequirements(int i11) {
            return ((Usage) this.instance).getRequirements(i11);
        }

        @Override // com.google.api.UsageOrBuilder
        public ByteString getRequirementsBytes(int i11) {
            return ((Usage) this.instance).getRequirementsBytes(i11);
        }

        @Override // com.google.api.UsageOrBuilder
        public int getRequirementsCount() {
            return ((Usage) this.instance).getRequirementsCount();
        }

        @Override // com.google.api.UsageOrBuilder
        public List<String> getRequirementsList() {
            return Collections.unmodifiableList(((Usage) this.instance).getRequirementsList());
        }

        @Override // com.google.api.UsageOrBuilder
        public UsageRule getRules(int i11) {
            return ((Usage) this.instance).getRules(i11);
        }

        @Override // com.google.api.UsageOrBuilder
        public int getRulesCount() {
            return ((Usage) this.instance).getRulesCount();
        }

        @Override // com.google.api.UsageOrBuilder
        public List<UsageRule> getRulesList() {
            return Collections.unmodifiableList(((Usage) this.instance).getRulesList());
        }

        public Builder addAllRequirements(Iterable<String> iterable) {
            copyOnWrite();
            ((Usage) this.instance).addAllRequirements(iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends UsageRule> iterable) {
            copyOnWrite();
            ((Usage) this.instance).addAllRules(iterable);
            return this;
        }

        public Builder addRequirements(String str) {
            copyOnWrite();
            ((Usage) this.instance).addRequirements(str);
            return this;
        }

        public Builder addRequirementsBytes(ByteString byteString) {
            copyOnWrite();
            ((Usage) this.instance).addRequirementsBytes(byteString);
            return this;
        }

        public Builder addRules(int i11, UsageRule usageRule) {
            copyOnWrite();
            ((Usage) this.instance).addRules(i11, usageRule);
            return this;
        }

        public Builder clearProducerNotificationChannel() {
            copyOnWrite();
            ((Usage) this.instance).clearProducerNotificationChannel();
            return this;
        }

        public Builder clearRequirements() {
            copyOnWrite();
            ((Usage) this.instance).clearRequirements();
            return this;
        }

        public Builder clearRules() {
            copyOnWrite();
            ((Usage) this.instance).clearRules();
            return this;
        }

        public Builder removeRules(int i11) {
            copyOnWrite();
            ((Usage) this.instance).removeRules(i11);
            return this;
        }

        public Builder setProducerNotificationChannel(String str) {
            copyOnWrite();
            ((Usage) this.instance).setProducerNotificationChannel(str);
            return this;
        }

        public Builder setProducerNotificationChannelBytes(ByteString byteString) {
            copyOnWrite();
            ((Usage) this.instance).setProducerNotificationChannelBytes(byteString);
            return this;
        }

        public Builder setRequirements(int i11, String str) {
            copyOnWrite();
            ((Usage) this.instance).setRequirements(i11, str);
            return this;
        }

        public Builder setRules(int i11, UsageRule.Builder builder) {
            copyOnWrite();
            ((Usage) this.instance).setRules(i11, builder.build());
            return this;
        }

        public Builder addRules(UsageRule.Builder builder) {
            copyOnWrite();
            ((Usage) this.instance).addRules(builder.build());
            return this;
        }

        public Builder addRules(int i11, UsageRule.Builder builder) {
            copyOnWrite();
            ((Usage) this.instance).addRules(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(usageRule);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Usage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.Usage$1 */
    public static /* synthetic */ class C79001 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12170xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12170xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12170xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12170xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12170xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12170xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12170xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12170xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Usage usage = new Usage();
        DEFAULT_INSTANCE = usage;
        GeneratedMessageLite.registerDefaultInstance(Usage.class, usage);
    }

    private void ensureRequirementsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.requirements_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.requirements_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<UsageRule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Usage usage) {
        return DEFAULT_INSTANCE.createBuilder(usage);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Usage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C79001 c79001 = null;
        switch (C79001.f12170xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Usage();
            case 2:
                return new Builder(c79001);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", UsageRule.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Usage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Usage.class) {
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

    @Override // com.google.api.UsageOrBuilder
    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    @Override // com.google.api.UsageOrBuilder
    public ByteString getProducerNotificationChannelBytes() {
        return ByteString.copyFromUtf8(this.producerNotificationChannel_);
    }

    @Override // com.google.api.UsageOrBuilder
    public String getRequirements(int i11) {
        return this.requirements_.get(i11);
    }

    @Override // com.google.api.UsageOrBuilder
    public ByteString getRequirementsBytes(int i11) {
        return ByteString.copyFromUtf8(this.requirements_.get(i11));
    }

    @Override // com.google.api.UsageOrBuilder
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override // com.google.api.UsageOrBuilder
    public List<String> getRequirementsList() {
        return this.requirements_;
    }

    @Override // com.google.api.UsageOrBuilder
    public UsageRule getRules(int i11) {
        return this.rules_.get(i11);
    }

    @Override // com.google.api.UsageOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.UsageOrBuilder
    public List<UsageRule> getRulesList() {
        return this.rules_;
    }

    public UsageRuleOrBuilder getRulesOrBuilder(int i11) {
        return this.rules_.get(i11);
    }

    public List<? extends UsageRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    private Usage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequirements(Iterable<String> iterable) {
        ensureRequirementsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends UsageRule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirementsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureRequirementsIsMutable();
        this.requirements_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = getDefaultInstance().getProducerNotificationChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Usage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i11) {
        ensureRulesIsMutable();
        this.rules_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerNotificationChannel(String str) {
        str.getClass();
        this.producerNotificationChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerNotificationChannelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.producerNotificationChannel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirements(int i11, String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i11, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i11, usageRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i11, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i11, usageRule);
    }

    public static Usage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Usage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Usage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Usage parseFrom(InputStream inputStream) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
