package com.google.firebase.perf.p070v1;

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

/* JADX INFO: loaded from: classes.dex */
public final class GaugeMetric extends GeneratedMessageLite<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<GaugeMetric> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";
    private Internal.ProtobufList<CpuMetricReading> cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<AndroidMemoryReading> androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: loaded from: classes56.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GaugeMetric, Builder> implements GaugeMetricOrBuilder {
        public /* synthetic */ Builder(C88211 c88211) {
            this();
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(androidMemoryReading);
            return this;
        }

        public Builder addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(cpuMetricReading);
            return this;
        }

        public Builder setAndroidMemoryReadings(int i11, AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setAndroidMemoryReadings(i11, androidMemoryReading);
            return this;
        }

        public Builder setCpuMetricReadings(int i11, CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setCpuMetricReadings(i11, cpuMetricReading);
            return this;
        }

        public Builder setGaugeMetadata(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setGaugeMetadata(gaugeMetadata);
            return this;
        }

        private Builder() {
            super(GaugeMetric.DEFAULT_INSTANCE);
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public AndroidMemoryReading getAndroidMemoryReadings(int i11) {
            return ((GaugeMetric) this.instance).getAndroidMemoryReadings(i11);
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public int getAndroidMemoryReadingsCount() {
            return ((GaugeMetric) this.instance).getAndroidMemoryReadingsCount();
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.instance).getAndroidMemoryReadingsList());
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public CpuMetricReading getCpuMetricReadings(int i11) {
            return ((GaugeMetric) this.instance).getCpuMetricReadings(i11);
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public int getCpuMetricReadingsCount() {
            return ((GaugeMetric) this.instance).getCpuMetricReadingsCount();
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public List<CpuMetricReading> getCpuMetricReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.instance).getCpuMetricReadingsList());
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public GaugeMetadata getGaugeMetadata() {
            return ((GaugeMetric) this.instance).getGaugeMetadata();
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public String getSessionId() {
            return ((GaugeMetric) this.instance).getSessionId();
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public ByteString getSessionIdBytes() {
            return ((GaugeMetric) this.instance).getSessionIdBytes();
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public boolean hasGaugeMetadata() {
            return ((GaugeMetric) this.instance).hasGaugeMetadata();
        }

        @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
        public boolean hasSessionId() {
            return ((GaugeMetric) this.instance).hasSessionId();
        }

        public Builder addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAllAndroidMemoryReadings(iterable);
            return this;
        }

        public Builder addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAllCpuMetricReadings(iterable);
            return this;
        }

        public Builder addAndroidMemoryReadings(int i11, AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(i11, androidMemoryReading);
            return this;
        }

        public Builder addCpuMetricReadings(int i11, CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(i11, cpuMetricReading);
            return this;
        }

        public Builder clearAndroidMemoryReadings() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearAndroidMemoryReadings();
            return this;
        }

        public Builder clearCpuMetricReadings() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearCpuMetricReadings();
            return this;
        }

        public Builder clearGaugeMetadata() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearGaugeMetadata();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((GaugeMetric) this.instance).clearSessionId();
            return this;
        }

        public Builder mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).mergeGaugeMetadata(gaugeMetadata);
            return this;
        }

        public Builder removeAndroidMemoryReadings(int i11) {
            copyOnWrite();
            ((GaugeMetric) this.instance).removeAndroidMemoryReadings(i11);
            return this;
        }

        public Builder removeCpuMetricReadings(int i11) {
            copyOnWrite();
            ((GaugeMetric) this.instance).removeCpuMetricReadings(i11);
            return this;
        }

        public Builder setAndroidMemoryReadings(int i11, AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setAndroidMemoryReadings(i11, builder.build());
            return this;
        }

        public Builder setCpuMetricReadings(int i11, CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setCpuMetricReadings(i11, builder.build());
            return this;
        }

        public Builder setGaugeMetadata(GaugeMetadata.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setGaugeMetadata(builder.build());
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder addAndroidMemoryReadings(AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(builder.build());
            return this;
        }

        public Builder addCpuMetricReadings(CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(builder.build());
            return this;
        }

        public Builder addAndroidMemoryReadings(int i11, AndroidMemoryReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(i11, builder.build());
            return this;
        }

        public Builder addCpuMetricReadings(int i11, CpuMetricReading.Builder builder) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.v1.GaugeMetric$1 */
    /* JADX INFO: loaded from: classes56.dex */
    public static /* synthetic */ class C88211 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12639xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12639xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12639xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12639xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12639xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        GeneratedMessageLite.registerDefaultInstance(GaugeMetric.class, gaugeMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        Internal.ProtobufList<AndroidMemoryReading> protobufList = this.androidMemoryReadings_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCpuMetricReadingsIsMutable() {
        Internal.ProtobufList<CpuMetricReading> protobufList = this.cpuMetricReadings_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GaugeMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(GaugeMetric gaugeMetric) {
        return DEFAULT_INSTANCE.createBuilder(gaugeMetric);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<GaugeMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C88211 c88211 = null;
        switch (C88211.f12639xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GaugeMetric();
            case 2:
                return new Builder(c88211);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GaugeMetric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (GaugeMetric.class) {
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

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public AndroidMemoryReading getAndroidMemoryReadings(int i11) {
        return this.androidMemoryReadings_.get(i11);
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public AndroidMemoryReadingOrBuilder getAndroidMemoryReadingsOrBuilder(int i11) {
        return this.androidMemoryReadings_.get(i11);
    }

    public List<? extends AndroidMemoryReadingOrBuilder> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public CpuMetricReading getCpuMetricReadings(int i11) {
        return this.cpuMetricReadings_.get(i11);
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public List<CpuMetricReading> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public CpuMetricReadingOrBuilder getCpuMetricReadingsOrBuilder(int i11) {
        return this.cpuMetricReadings_.get(i11);
    }

    public List<? extends CpuMetricReadingOrBuilder> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public GaugeMetadata getGaugeMetadata() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        return gaugeMetadata == null ? GaugeMetadata.getDefaultInstance() : gaugeMetadata;
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public boolean hasGaugeMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.p070v1.GaugeMetricOrBuilder
    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    private GaugeMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.androidMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
        ensureCpuMetricReadingsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cpuMetricReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        GaugeMetadata gaugeMetadata2 = this.gaugeMetadata_;
        if (gaugeMetadata2 != null && gaugeMetadata2 != GaugeMetadata.getDefaultInstance()) {
            this.gaugeMetadata_ = GaugeMetadata.newBuilder(this.gaugeMetadata_).mergeFrom(gaugeMetadata).buildPartial();
        } else {
            this.gaugeMetadata_ = gaugeMetadata;
        }
        this.bitField0_ |= 2;
    }

    public static GaugeMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAndroidMemoryReadings(int i11) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCpuMetricReadings(int i11) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i11, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i11, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuMetricReadings(int i11, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i11, cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        this.gaugeMetadata_ = gaugeMetadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        this.sessionId_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i11, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i11, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(int i11, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i11, cpuMetricReading);
    }

    public static GaugeMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GaugeMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GaugeMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
