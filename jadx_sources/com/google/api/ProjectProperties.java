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
public final class ProjectProperties extends GeneratedMessageLite<ProjectProperties, Builder> implements ProjectPropertiesOrBuilder {
    private static final ProjectProperties DEFAULT_INSTANCE;
    private static volatile Parser<ProjectProperties> PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Property> properties_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<ProjectProperties, Builder> implements ProjectPropertiesOrBuilder {
        public /* synthetic */ Builder(C78871 c78871) {
            this();
        }

        public Builder addProperties(Property property) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties(property);
            return this;
        }

        public Builder setProperties(int i11, Property property) {
            copyOnWrite();
            ((ProjectProperties) this.instance).setProperties(i11, property);
            return this;
        }

        private Builder() {
            super(ProjectProperties.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public Property getProperties(int i11) {
            return ((ProjectProperties) this.instance).getProperties(i11);
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public int getPropertiesCount() {
            return ((ProjectProperties) this.instance).getPropertiesCount();
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public List<Property> getPropertiesList() {
            return Collections.unmodifiableList(((ProjectProperties) this.instance).getPropertiesList());
        }

        public Builder addAllProperties(Iterable<? extends Property> iterable) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addAllProperties(iterable);
            return this;
        }

        public Builder addProperties(int i11, Property property) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties(i11, property);
            return this;
        }

        public Builder clearProperties() {
            copyOnWrite();
            ((ProjectProperties) this.instance).clearProperties();
            return this;
        }

        public Builder removeProperties(int i11) {
            copyOnWrite();
            ((ProjectProperties) this.instance).removeProperties(i11);
            return this;
        }

        public Builder setProperties(int i11, Property.Builder builder) {
            copyOnWrite();
            ((ProjectProperties) this.instance).setProperties(i11, builder.build());
            return this;
        }

        public Builder addProperties(Property.Builder builder) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties(builder.build());
            return this;
        }

        public Builder addProperties(int i11, Property.Builder builder) {
            copyOnWrite();
            ((ProjectProperties) this.instance).addProperties(i11, builder.build());
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(property);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    /* JADX INFO: renamed from: com.google.api.ProjectProperties$1 */
    public static /* synthetic */ class C78871 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f12159xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f12159xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12159xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12159xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12159xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12159xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12159xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12159xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ProjectProperties projectProperties = new ProjectProperties();
        DEFAULT_INSTANCE = projectProperties;
        GeneratedMessageLite.registerDefaultInstance(ProjectProperties.class, projectProperties);
    }

    private void ensurePropertiesIsMutable() {
        Internal.ProtobufList<Property> protobufList = this.properties_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.properties_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ProjectProperties getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder(ProjectProperties projectProperties) {
        return DEFAULT_INSTANCE.createBuilder(projectProperties);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Parser<ProjectProperties> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        C78871 c78871 = null;
        switch (C78871.f12159xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ProjectProperties();
            case 2:
                return new Builder(c78871);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"properties_", Property.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ProjectProperties> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ProjectProperties.class) {
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

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public Property getProperties(int i11) {
        return this.properties_.get(i11);
    }

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public int getPropertiesCount() {
        return this.properties_.size();
    }

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public List<Property> getPropertiesList() {
        return this.properties_;
    }

    public PropertyOrBuilder getPropertiesOrBuilder(int i11) {
        return this.properties_.get(i11);
    }

    public List<? extends PropertyOrBuilder> getPropertiesOrBuilderList() {
        return this.properties_;
    }

    private ProjectProperties() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProperties(Iterable<? extends Property> iterable) {
        ensurePropertiesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.properties_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProperties() {
        this.properties_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static ProjectProperties parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProperties(int i11) {
        ensurePropertiesIsMutable();
        this.properties_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProperties(int i11, Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.set(i11, property);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProperties(int i11, Property property) {
        property.getClass();
        ensurePropertiesIsMutable();
        this.properties_.add(i11, property);
    }

    public static ProjectProperties parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProjectProperties parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProjectProperties parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
