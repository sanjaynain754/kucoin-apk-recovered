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
public final class ConfigChange extends GeneratedMessageLite<ConfigChange, Builder> implements ConfigChangeOrBuilder {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<ConfigChange> PARSER;
    private int changeType_;
    private String element_ = "";
    private String oldValue_ = "";
    private String newValue_ = "";
    private Internal.ProtobufList<Advice> advices_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<ConfigChange, Builder> implements ConfigChangeOrBuilder {
        public /* synthetic */ Builder(C78571 c78571) {
            this();
        }

        public Builder addAdvices(Advice advice) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices(advice);
            return this;
        }

        public Builder setAdvices(int i11, Advice advice) {
            copyOnWrite();
            ((ConfigChange) this.instance).setAdvices(i11, advice);
            return this;
        }

        private Builder() {
            super(ConfigChange.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public Advice getAdvices(int i11) {
            return ((ConfigChange) this.instance).getAdvices(i11);
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public int getAdvicesCount() {
            return ((ConfigChange) this.instance).getAdvicesCount();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public List<Advice> getAdvicesList() {
            return Collections.unmodifiableList(((ConfigChange) this.instance).getAdvicesList());
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ChangeType getChangeType() {
            return ((ConfigChange) this.instance).getChangeType();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public int getChangeTypeValue() {
            return ((ConfigChange) this.instance).getChangeTypeValue();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getElement() {
            return ((ConfigChange) this.instance).getElement();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ByteString getElementBytes() {
            return ((ConfigChange) this.instance).getElementBytes();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getNewValue() {
            return ((ConfigChange) this.instance).getNewValue();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ByteString getNewValueBytes() {
            return ((ConfigChange) this.instance).getNewValueBytes();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getOldValue() {
            return ((ConfigChange) this.instance).getOldValue();
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ByteString getOldValueBytes() {
            return ((ConfigChange) this.instance).getOldValueBytes();
        }

        public Builder addAdvices(int i11, Advice advice) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices(i11, advice);
            return this;
        }

        public Builder addAllAdvices(Iterable<? extends Advice> iterable) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAllAdvices(iterable);
            return this;
        }

        public Builder clearAdvices() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearAdvices();
            return this;
        }

        public Builder clearChangeType() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearChangeType();
            return this;
        }

        public Builder clearElement() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearElement();
            return this;
        }

        public Builder clearNewValue() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearNewValue();
            return this;
        }

        public Builder clearOldValue() {
            copyOnWrite();
            ((ConfigChange) this.instance).clearOldValue();
            return this;
        }

        public Builder removeAdvices(int i11) {
            copyOnWrite();
            ((ConfigChange) this.instance).removeAdvices(i11);
            return this;
        }

        public Builder setAdvices(int i11, Advice.Builder builder) {
            copyOnWrite();
            ((ConfigChange) this.instance).setAdvices(i11, builder.build());
            return this;
        }

        public Builder setChangeType(ChangeType changeType) {
            copyOnWrite();
            ((ConfigChange) this.instance).setChangeType(changeType);
            return this;
        }

        public Builder setChangeTypeValue(int i11) {
            copyOnWrite();
            ((ConfigChange) this.instance).setChangeTypeValue(i11);
            return this;
        }

        public Builder setElement(String str) {
            copyOnWrite();
            ((ConfigChange) this.instance).setElement(str);
            return this;
        }

        public Builder setElementBytes(ByteString byteString) {
            copyOnWrite();
            ((ConfigChange) this.instance).setElementBytes(byteString);
            return this;
        }

        public Builder setNewValue(String str) {
            copyOnWrite();
            ((ConfigChange) this.instance).setNewValue(str);
            return this;
        }

        public Builder setNewValueBytes(ByteString byteString) {
            copyOnWrite();
            ((ConfigChange) this.instance).setNewValueBytes(byteString);
            return this;
        }

        public Builder setOldValue(String str) {
            copyOnWrite();
            ((ConfigChange) this.instance).setOldValue(str);
            return this;
        }

        public Builder setOldValueBytes(ByteString byteString) {
            copyOnWrite();
            ((ConfigChange) this.instance).setOldValueBytes(byteString);
            return this;
        }

        public Builder addAdvices(Advice.Builder builder) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices(builder.build());
            return this;
        }

        public Builder addAdvices(int i11, Advice.Builder builder) {
            copyOnWrite();
            ((ConfigChange) this.instance).addAdvices(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(advice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeType() {
        this.changeType_ = 0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.ConfigChange$1 */
    public static /* synthetic */ class C78571 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12133xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12133xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12133xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12133xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12133xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12133xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12133xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12133xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ConfigChange configChange = new ConfigChange();
        DEFAULT_INSTANCE = configChange;
        GeneratedMessageLite.registerDefaultInstance(ConfigChange.class, configChange);
    }

    private void ensureAdvicesIsMutable() {
        Internal.ProtobufList<Advice> protobufList = this.advices_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.advices_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(ConfigChange configChange) {
        return DEFAULT_INSTANCE.createBuilder(configChange);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ConfigChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeTypeValue(int i11) {
        this.changeType_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78571 c78571 = null;
        switch (C78571.f12133xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ConfigChange();
            case 2:
                return new Builder(c78571);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", Advice.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ConfigChange> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ConfigChange.class) {
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

    @Override // com.google.api.ConfigChangeOrBuilder
    public Advice getAdvices(int i11) {
        return this.advices_.get(i11);
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public int getAdvicesCount() {
        return this.advices_.size();
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public List<Advice> getAdvicesList() {
        return this.advices_;
    }

    public AdviceOrBuilder getAdvicesOrBuilder(int i11) {
        return this.advices_.get(i11);
    }

    public List<? extends AdviceOrBuilder> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ChangeType getChangeType() {
        ChangeType changeTypeForNumber = ChangeType.forNumber(this.changeType_);
        return changeTypeForNumber == null ? ChangeType.UNRECOGNIZED : changeTypeForNumber;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public int getChangeTypeValue() {
        return this.changeType_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getElement() {
        return this.element_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ByteString getElementBytes() {
        return ByteString.copyFromUtf8(this.element_);
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getNewValue() {
        return this.newValue_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ByteString getNewValueBytes() {
        return ByteString.copyFromUtf8(this.newValue_);
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getOldValue() {
        return this.oldValue_;
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ByteString getOldValueBytes() {
        return ByteString.copyFromUtf8(this.oldValue_);
    }

    private ConfigChange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdvices(Iterable<? extends Advice> iterable) {
        ensureAdvicesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.advices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvices() {
        this.advices_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElement() {
        this.element_ = getDefaultInstance().getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewValue() {
        this.newValue_ = getDefaultInstance().getNewValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOldValue() {
        this.oldValue_ = getDefaultInstance().getOldValue();
    }

    public static ConfigChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdvices(int i11) {
        ensureAdvicesIsMutable();
        this.advices_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvices(int i11, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.set(i11, advice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeType(ChangeType changeType) {
        this.changeType_ = changeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElement(String str) {
        str.getClass();
        this.element_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElementBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.element_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValue(String str) {
        str.getClass();
        this.newValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.newValue_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValue(String str) {
        str.getClass();
        this.oldValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oldValue_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(int i11, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(i11, advice);
    }

    public static ConfigChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
