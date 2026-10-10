package p852kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes61.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {
        private ByteString unknownFields = ByteString.EMPTY;

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final ByteString getUnknownFields() {
            return this.unknownFields;
        }

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.unknownFields = byteString;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo105124clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {
        private FieldSet<ExtensionDescriptor> extensions = FieldSet.emptySet();
        private boolean extensionsIsMutable;

        /* JADX INFO: Access modifiers changed from: private */
        public FieldSet<ExtensionDescriptor> buildExtensions() {
            this.extensions.makeImmutable();
            this.extensionsIsMutable = false;
            return this.extensions;
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensionsIsMutable) {
                return;
            }
            this.extensions = this.extensions.clone();
            this.extensionsIsMutable = true;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
            } else {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, Type type) {
            verifyExtensionContainingType(generatedExtension);
            ensureExtensionsIsMutable();
            this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(type));
            return this;
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            ensureExtensionsIsMutable();
            this.extensions.mergeFrom(((ExtendableMessage) messagetype).extensions);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> BuilderType setExtension(GeneratedExtension<MessageType, Type> generatedExtension, Type type) {
            verifyExtensionContainingType(generatedExtension);
            ensureExtensionsIsMutable();
            this.extensions.setField(generatedExtension.descriptor, generatedExtension.toFieldSetType(type));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo105124clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        private final FieldSet<ExtensionDescriptor> extensions;

        public class ExtensionWriter {
            private final Iterator<Map.Entry<ExtensionDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<ExtensionDescriptor, Object> next;

            public /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z11, C413901 c413901) {
                this(z11);
            }

            private ExtensionWriter(boolean z11) {
                Iterator<Map.Entry<ExtensionDescriptor, Object>> it = ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = z11;
            }

            public void writeUntil(int i11, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<ExtensionDescriptor, Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i11) {
                        return;
                    }
                    ExtensionDescriptor key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (MessageLite) this.next.getValue());
                    } else {
                        FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.extensions = FieldSet.newFieldSet();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            Object field = this.extensions.getField(generatedExtension.descriptor);
            return field == null ? generatedExtension.defaultValue : (Type) generatedExtension.fromFieldSetType(field);
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.makeImmutable();
        }

        public ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i11) throws IOException {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i11);
        }

        public ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.extensions = extendableBuilder.buildExtensions();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
            } else {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.getRepeatedFieldCount(generatedExtension.descriptor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.hasField(generatedExtension.descriptor);
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i11) {
            verifyExtensionContainingType(generatedExtension);
            return (Type) generatedExtension.singularFromFieldSetType(this.extensions.getRepeatedField(generatedExtension.descriptor, i11));
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        final Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final WireFormat.FieldType type;

        @Override // java.lang.Comparable
        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }

        public Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }

        public ExtensionDescriptor(Internal.EnumLiteMap<?> enumLiteMap, int i11, WireFormat.FieldType fieldType, boolean z11, boolean z12) {
            this.enumTypeMap = enumLiteMap;
            this.number = i11;
            this.type = fieldType;
            this.isRepeated = z11;
            this.isPacked = z12;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final Method enumValueOf;
        final MessageLite messageDefaultInstance;
        final Class singularType;

        public Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularFromFieldSetType(it.next()));
            }
            return arrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        public int getNumber() {
            return this.descriptor.getNumber();
        }

        public Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.invokeOrDie(this.enumValueOf, null, (Integer) obj) : obj;
        }

        public Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }

        public GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype != null) {
                if (extensionDescriptor.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.containingTypeDefaultInstance = containingtype;
                this.defaultValue = type;
                this.messageDefaultInstance = messageLite;
                this.descriptor = extensionDescriptor;
                this.singularType = cls;
                if (Internal.EnumLite.class.isAssignableFrom(cls)) {
                    this.enumValueOf = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
                    return;
                } else {
                    this.enumValueOf = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public GeneratedMessageLite() {
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i11, WireFormat.FieldType fieldType, boolean z11, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new ExtensionDescriptor(enumLiteMap, i11, fieldType, true, z11), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i11, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new ExtensionDescriptor(enumLiteMap, i11, fieldType, false, false), cls);
    }

    public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i11) throws IOException {
        return codedInputStream.skipField(i11, codedOutputStream);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1 */
    public static /* synthetic */ class C413901 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public GeneratedMessageLite(Builder builder) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends MessageLite> boolean parseUnknownField(FieldSet<ExtensionDescriptor> fieldSet, MessageType messagetype, CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i11) throws IOException {
        boolean z11;
        boolean z12;
        Object objBuild;
        MessageLite messageLite;
        int tagWireType = WireFormat.getTagWireType(i11);
        GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messagetype, WireFormat.getTagFieldNumber(i11));
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            z12 = true;
            z11 = false;
        } else if (tagWireType == FieldSet.getWireFormatForFieldType(generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), false)) {
            z12 = false;
            z11 = false;
        } else {
            ExtensionDescriptor extensionDescriptor = generatedExtensionFindLiteExtensionByNumber.descriptor;
            if (extensionDescriptor.isRepeated && extensionDescriptor.type.isPackable() && tagWireType == FieldSet.getWireFormatForFieldType(generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), true)) {
                z11 = true;
                z12 = false;
            } else {
                z12 = true;
                z11 = false;
            }
        }
        if (z12) {
            return codedInputStream.skipField(i11, codedOutputStream);
        }
        if (z11) {
            int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
            if (generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType() == WireFormat.FieldType.ENUM) {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    Internal.EnumLite enumLiteFindValueByNumber = generatedExtensionFindLiteExtensionByNumber.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                    if (enumLiteFindValueByNumber == null) {
                        return true;
                    }
                    fieldSet.addRepeatedField(generatedExtensionFindLiteExtensionByNumber.descriptor, generatedExtensionFindLiteExtensionByNumber.singularToFieldSetType(enumLiteFindValueByNumber));
                }
            } else {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    fieldSet.addRepeatedField(generatedExtensionFindLiteExtensionByNumber.descriptor, FieldSet.readPrimitiveField(codedInputStream, generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), false));
                }
            }
            codedInputStream.popLimit(iPushLimit);
        } else {
            int i12 = C413901.$SwitchMap$com$google$protobuf$WireFormat$JavaType[generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteJavaType().ordinal()];
            if (i12 == 1) {
                MessageLite.Builder builder = (generatedExtensionFindLiteExtensionByNumber.descriptor.isRepeated() || (messageLite = (MessageLite) fieldSet.getField(generatedExtensionFindLiteExtensionByNumber.descriptor)) == null) ? null : messageLite.toBuilder();
                if (builder == null) {
                    builder = generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
                }
                if (generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType() == WireFormat.FieldType.GROUP) {
                    codedInputStream.readGroup(generatedExtensionFindLiteExtensionByNumber.getNumber(), builder, extensionRegistryLite);
                } else {
                    codedInputStream.readMessage(builder, extensionRegistryLite);
                }
                objBuild = builder.build();
            } else if (i12 != 2) {
                objBuild = FieldSet.readPrimitiveField(codedInputStream, generatedExtensionFindLiteExtensionByNumber.descriptor.getLiteType(), false);
            } else {
                int i13 = codedInputStream.readEnum();
                Internal.EnumLite enumLiteFindValueByNumber2 = generatedExtensionFindLiteExtensionByNumber.descriptor.getEnumType().findValueByNumber(i13);
                if (enumLiteFindValueByNumber2 == null) {
                    codedOutputStream.writeRawVarint32(i11);
                    codedOutputStream.writeUInt32NoTag(i13);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            }
            if (generatedExtensionFindLiteExtensionByNumber.descriptor.isRepeated()) {
                fieldSet.addRepeatedField(generatedExtensionFindLiteExtensionByNumber.descriptor, generatedExtensionFindLiteExtensionByNumber.singularToFieldSetType(objBuild));
            } else {
                fieldSet.setField(generatedExtensionFindLiteExtensionByNumber.descriptor, generatedExtensionFindLiteExtensionByNumber.singularToFieldSetType(objBuild));
            }
        }
        return true;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e11) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public void makeExtensionsImmutable() {
    }
}
