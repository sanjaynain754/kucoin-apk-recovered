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
public final class Quota extends GeneratedMessageLite<Quota, Builder> implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile Parser<Quota> PARSER;
    private Internal.ProtobufList<QuotaLimit> limits_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<MetricRule> metricRules_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Quota, Builder> implements QuotaOrBuilder {
        public /* synthetic */ Builder(C78901 c78901) {
            this();
        }

        public Builder addLimits(QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(quotaLimit);
            return this;
        }

        public Builder addMetricRules(MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(metricRule);
            return this;
        }

        public Builder setLimits(int i11, QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).setLimits(i11, quotaLimit);
            return this;
        }

        public Builder setMetricRules(int i11, MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).setMetricRules(i11, metricRule);
            return this;
        }

        private Builder() {
            super(Quota.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.QuotaOrBuilder
        public QuotaLimit getLimits(int i11) {
            return ((Quota) this.instance).getLimits(i11);
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getLimitsCount() {
            return ((Quota) this.instance).getLimitsCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<QuotaLimit> getLimitsList() {
            return Collections.unmodifiableList(((Quota) this.instance).getLimitsList());
        }

        @Override // com.google.api.QuotaOrBuilder
        public MetricRule getMetricRules(int i11) {
            return ((Quota) this.instance).getMetricRules(i11);
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getMetricRulesCount() {
            return ((Quota) this.instance).getMetricRulesCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<MetricRule> getMetricRulesList() {
            return Collections.unmodifiableList(((Quota) this.instance).getMetricRulesList());
        }

        public Builder addAllLimits(Iterable<? extends QuotaLimit> iterable) {
            copyOnWrite();
            ((Quota) this.instance).addAllLimits(iterable);
            return this;
        }

        public Builder addAllMetricRules(Iterable<? extends MetricRule> iterable) {
            copyOnWrite();
            ((Quota) this.instance).addAllMetricRules(iterable);
            return this;
        }

        public Builder addLimits(int i11, QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(i11, quotaLimit);
            return this;
        }

        public Builder addMetricRules(int i11, MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(i11, metricRule);
            return this;
        }

        public Builder clearLimits() {
            copyOnWrite();
            ((Quota) this.instance).clearLimits();
            return this;
        }

        public Builder clearMetricRules() {
            copyOnWrite();
            ((Quota) this.instance).clearMetricRules();
            return this;
        }

        public Builder removeLimits(int i11) {
            copyOnWrite();
            ((Quota) this.instance).removeLimits(i11);
            return this;
        }

        public Builder removeMetricRules(int i11) {
            copyOnWrite();
            ((Quota) this.instance).removeMetricRules(i11);
            return this;
        }

        public Builder setLimits(int i11, QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).setLimits(i11, builder.build());
            return this;
        }

        public Builder setMetricRules(int i11, MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).setMetricRules(i11, builder.build());
            return this;
        }

        public Builder addLimits(QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(builder.build());
            return this;
        }

        public Builder addMetricRules(MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(builder.build());
            return this;
        }

        public Builder addLimits(int i11, QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(i11, builder.build());
            return this;
        }

        public Builder addMetricRules(int i11, MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(metricRule);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.Quota$1 */
    public static /* synthetic */ class C78901 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12161xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12161xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12161xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12161xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12161xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12161xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12161xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12161xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Quota quota = new Quota();
        DEFAULT_INSTANCE = quota;
        GeneratedMessageLite.registerDefaultInstance(Quota.class, quota);
    }

    private void ensureLimitsIsMutable() {
        Internal.ProtobufList<QuotaLimit> protobufList = this.limits_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.limits_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMetricRulesIsMutable() {
        Internal.ProtobufList<MetricRule> protobufList = this.metricRules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.metricRules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Quota quota) {
        return DEFAULT_INSTANCE.createBuilder(quota);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Quota> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78901 c78901 = null;
        switch (C78901.f12161xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Quota();
            case 2:
                return new Builder(c78901);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Quota> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Quota.class) {
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

    @Override // com.google.api.QuotaOrBuilder
    public QuotaLimit getLimits(int i11) {
        return this.limits_.get(i11);
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getLimitsCount() {
        return this.limits_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public QuotaLimitOrBuilder getLimitsOrBuilder(int i11) {
        return this.limits_.get(i11);
    }

    public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
        return this.limits_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public MetricRule getMetricRules(int i11) {
        return this.metricRules_.get(i11);
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public MetricRuleOrBuilder getMetricRulesOrBuilder(int i11) {
        return this.metricRules_.get(i11);
    }

    public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    private Quota() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        ensureLimitsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.limits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        ensureMetricRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.metricRules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimits() {
        this.limits_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricRules() {
        this.metricRules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Quota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLimits(int i11) {
        ensureLimitsIsMutable();
        this.limits_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetricRules(int i11) {
        ensureMetricRulesIsMutable();
        this.metricRules_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimits(int i11, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.set(i11, quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricRules(int i11, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.set(i11, metricRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(int i11, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(i11, quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(int i11, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(i11, metricRule);
    }

    public static Quota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Quota parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quota parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
