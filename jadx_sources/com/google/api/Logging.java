package com.google.api;

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
public final class Logging extends GeneratedMessageLite<Logging, Builder> implements LoggingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE;
    private static volatile Parser<Logging> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<LoggingDestination> producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<LoggingDestination> consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Logging, Builder> implements LoggingOrBuilder {
        public /* synthetic */ Builder(C78751 c78751) {
            this();
        }

        public Builder addConsumerDestinations(LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations(loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations(loggingDestination);
            return this;
        }

        public Builder setConsumerDestinations(int i11, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).setConsumerDestinations(i11, loggingDestination);
            return this;
        }

        public Builder setProducerDestinations(int i11, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).setProducerDestinations(i11, loggingDestination);
            return this;
        }

        private Builder() {
            super(Logging.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.LoggingOrBuilder
        public LoggingDestination getConsumerDestinations(int i11) {
            return ((Logging) this.instance).getConsumerDestinations(i11);
        }

        @Override // com.google.api.LoggingOrBuilder
        public int getConsumerDestinationsCount() {
            return ((Logging) this.instance).getConsumerDestinationsCount();
        }

        @Override // com.google.api.LoggingOrBuilder
        public List<LoggingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Logging) this.instance).getConsumerDestinationsList());
        }

        @Override // com.google.api.LoggingOrBuilder
        public LoggingDestination getProducerDestinations(int i11) {
            return ((Logging) this.instance).getProducerDestinations(i11);
        }

        @Override // com.google.api.LoggingOrBuilder
        public int getProducerDestinationsCount() {
            return ((Logging) this.instance).getProducerDestinationsCount();
        }

        @Override // com.google.api.LoggingOrBuilder
        public List<LoggingDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Logging) this.instance).getProducerDestinationsList());
        }

        public Builder addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
            copyOnWrite();
            ((Logging) this.instance).addAllConsumerDestinations(iterable);
            return this;
        }

        public Builder addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
            copyOnWrite();
            ((Logging) this.instance).addAllProducerDestinations(iterable);
            return this;
        }

        public Builder addConsumerDestinations(int i11, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations(i11, loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(int i11, LoggingDestination loggingDestination) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations(i11, loggingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            copyOnWrite();
            ((Logging) this.instance).clearConsumerDestinations();
            return this;
        }

        public Builder clearProducerDestinations() {
            copyOnWrite();
            ((Logging) this.instance).clearProducerDestinations();
            return this;
        }

        public Builder removeConsumerDestinations(int i11) {
            copyOnWrite();
            ((Logging) this.instance).removeConsumerDestinations(i11);
            return this;
        }

        public Builder removeProducerDestinations(int i11) {
            copyOnWrite();
            ((Logging) this.instance).removeProducerDestinations(i11);
            return this;
        }

        public Builder setConsumerDestinations(int i11, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).setConsumerDestinations(i11, builder.build());
            return this;
        }

        public Builder setProducerDestinations(int i11, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).setProducerDestinations(i11, builder.build());
            return this;
        }

        public Builder addConsumerDestinations(LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations(builder.build());
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations(builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int i11, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addConsumerDestinations(i11, builder.build());
            return this;
        }

        public Builder addProducerDestinations(int i11, LoggingDestination.Builder builder) {
            copyOnWrite();
            ((Logging) this.instance).addProducerDestinations(i11, builder.build());
            return this;
        }
    }

    public static final class LoggingDestination extends GeneratedMessageLite<LoggingDestination, Builder> implements LoggingDestinationOrBuilder {
        private static final LoggingDestination DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile Parser<LoggingDestination> PARSER;
        private String monitoredResource_ = "";
        private Internal.ProtobufList<String> logs_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<LoggingDestination, Builder> implements LoggingDestinationOrBuilder {
            public /* synthetic */ Builder(C78751 c78751) {
                this();
            }

            private Builder() {
                super(LoggingDestination.DEFAULT_INSTANCE);
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public String getLogs(int i11) {
                return ((LoggingDestination) this.instance).getLogs(i11);
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public ByteString getLogsBytes(int i11) {
                return ((LoggingDestination) this.instance).getLogsBytes(i11);
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public int getLogsCount() {
                return ((LoggingDestination) this.instance).getLogsCount();
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public List<String> getLogsList() {
                return Collections.unmodifiableList(((LoggingDestination) this.instance).getLogsList());
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public String getMonitoredResource() {
                return ((LoggingDestination) this.instance).getMonitoredResource();
            }

            @Override // com.google.api.Logging.LoggingDestinationOrBuilder
            public ByteString getMonitoredResourceBytes() {
                return ((LoggingDestination) this.instance).getMonitoredResourceBytes();
            }

            public Builder addAllLogs(Iterable<String> iterable) {
                copyOnWrite();
                ((LoggingDestination) this.instance).addAllLogs(iterable);
                return this;
            }

            public Builder addLogs(String str) {
                copyOnWrite();
                ((LoggingDestination) this.instance).addLogs(str);
                return this;
            }

            public Builder addLogsBytes(ByteString byteString) {
                copyOnWrite();
                ((LoggingDestination) this.instance).addLogsBytes(byteString);
                return this;
            }

            public Builder clearLogs() {
                copyOnWrite();
                ((LoggingDestination) this.instance).clearLogs();
                return this;
            }

            public Builder clearMonitoredResource() {
                copyOnWrite();
                ((LoggingDestination) this.instance).clearMonitoredResource();
                return this;
            }

            public Builder setLogs(int i11, String str) {
                copyOnWrite();
                ((LoggingDestination) this.instance).setLogs(i11, str);
                return this;
            }

            public Builder setMonitoredResource(String str) {
                copyOnWrite();
                ((LoggingDestination) this.instance).setMonitoredResource(str);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                copyOnWrite();
                ((LoggingDestination) this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            LoggingDestination loggingDestination = new LoggingDestination();
            DEFAULT_INSTANCE = loggingDestination;
            GeneratedMessageLite.registerDefaultInstance(LoggingDestination.class, loggingDestination);
        }

        private void ensureLogsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.logs_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static LoggingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(LoggingDestination loggingDestination) {
            return DEFAULT_INSTANCE.createBuilder(loggingDestination);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Parser<LoggingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            C78751 c78751 = null;
            switch (C78751.f12149xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new LoggingDestination();
                case 2:
                    return new Builder(c78751);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LoggingDestination> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (LoggingDestination.class) {
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

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public String getLogs(int i11) {
            return this.logs_.get(i11);
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public ByteString getLogsBytes(int i11) {
            return ByteString.copyFromUtf8(this.logs_.get(i11));
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public int getLogsCount() {
            return this.logs_.size();
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public List<String> getLogsList() {
            return this.logs_;
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // com.google.api.Logging.LoggingDestinationOrBuilder
        public ByteString getMonitoredResourceBytes() {
            return ByteString.copyFromUtf8(this.monitoredResource_);
        }

        private LoggingDestination() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogs(Iterable<String> iterable) {
            ensureLogsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.logs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureLogsIsMutable();
            this.logs_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        public static LoggingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogs(int i11, String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.set(i11, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResourceBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.monitoredResource_ = byteString.toStringUtf8();
        }

        public static LoggingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoggingDestination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LoggingDestinationOrBuilder extends MessageLiteOrBuilder {
        String getLogs(int i11);

        ByteString getLogsBytes(int i11);

        int getLogsCount();

        List<String> getLogsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(loggingDestination);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Logging) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.Logging$1 */
    public static /* synthetic */ class C78751 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12149xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12149xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12149xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12149xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12149xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12149xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12149xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12149xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Logging logging = new Logging();
        DEFAULT_INSTANCE = logging;
        GeneratedMessageLite.registerDefaultInstance(Logging.class, logging);
    }

    private void ensureConsumerDestinationsIsMutable() {
        Internal.ProtobufList<LoggingDestination> protobufList = this.consumerDestinations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureProducerDestinationsIsMutable() {
        Internal.ProtobufList<LoggingDestination> protobufList = this.producerDestinations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.producerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(Logging logging) {
        return DEFAULT_INSTANCE.createBuilder(logging);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<Logging> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78751 c78751 = null;
        switch (C78751.f12149xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Logging();
            case 2:
                return new Builder(c78751);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", LoggingDestination.class, "consumerDestinations_", LoggingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Logging> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Logging.class) {
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

    @Override // com.google.api.LoggingOrBuilder
    public LoggingDestination getConsumerDestinations(int i11) {
        return this.consumerDestinations_.get(i11);
    }

    @Override // com.google.api.LoggingOrBuilder
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // com.google.api.LoggingOrBuilder
    public List<LoggingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(int i11) {
        return this.consumerDestinations_.get(i11);
    }

    public List<? extends LoggingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override // com.google.api.LoggingOrBuilder
    public LoggingDestination getProducerDestinations(int i11) {
        return this.producerDestinations_.get(i11);
    }

    @Override // com.google.api.LoggingOrBuilder
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override // com.google.api.LoggingOrBuilder
    public List<LoggingDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(int i11) {
        return this.producerDestinations_.get(i11);
    }

    public List<? extends LoggingDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    private Logging() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static Logging parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsumerDestinations(int i11) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProducerDestinations(int i11) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i11, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i11, loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i11, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i11, loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i11, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i11, loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i11, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i11, loggingDestination);
    }

    public static Logging parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Logging parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Logging parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Logging parseFrom(InputStream inputStream) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
