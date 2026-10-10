package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    @NotNull
    private final AnnotationDeserializer annotationDeserializer;

    @NotNull
    private MetadataVersion metadataVersion;

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final NotFoundClasses notFoundClasses;

    /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public abstract void visitArrayValue(@Nullable Name name, @NotNull ArrayList<ConstantValue<?>> arrayList);

        public abstract void visitConstantValue(@Nullable Name name, @NotNull ConstantValue<?> constantValue);

        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(@Nullable Name name, @Nullable Object obj) {
            visitConstantValue(name, BinaryClassAnnotationAndConstantLoaderImpl.this.createConstant(name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable final Name name, @NotNull ClassId classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            final ArrayList arrayList = new ArrayList();
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorLoadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, NO_SOURCE, arrayList);
            Intrinsics.checkNotNull(annotationArgumentVisitorLoadAnnotation);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1
                private final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor $$delegate_0;
                final /* synthetic */ ArrayList<AnnotationDescriptor> $list;
                final /* synthetic */ Name $name;
                final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor this$0;

                {
                    this.this$0 = this;
                    this.$name = name;
                    this.$list = arrayList;
                    this.$$delegate_0 = this.$visitor;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visit(Name name2, Object obj) {
                    this.$$delegate_0.visit(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name2, ClassId classId2) {
                    Intrinsics.checkNotNullParameter(classId2, "classId");
                    return this.$$delegate_0.visitAnnotation(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name2) {
                    return this.$$delegate_0.visitArray(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    this.$visitor.visitEnd();
                    this.this$0.visitConstantValue(this.$name, new AnnotationValue((AnnotationDescriptor) CollectionsKt.single((List) this.$list)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnum(Name name2, ClassId enumClassId, Name enumEntryName) {
                    Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                    Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                    this.$$delegate_0.visitEnum(name2, enumClassId, enumEntryName);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitClassLiteral(Name name2, ClassLiteralValue value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.visitClassLiteral(name2, value);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name) {
            return new C41331x4262547b(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(@Nullable Name name, @NotNull ClassId enumClassId, @NotNull Name enumEntryName) {
            Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
            Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
            visitConstantValue(name, new EnumValue(enumClassId, enumEntryName));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue value) {
            Intrinsics.checkNotNullParameter(value, "value");
            visitConstantValue(name, new KClassValue(value));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.module = module;
        this.notFoundClasses = notFoundClasses;
        this.annotationDeserializer = new AnnotationDeserializer(module, notFoundClasses);
        this.metadataVersion = MetadataVersion.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstantValue<?> createConstant(Name name, Object obj) {
        ConstantValue<?> constantValueCreateConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj, this.module);
        if (constantValueCreateConstantValue != null) {
            return constantValueCreateConstantValue;
        }
        return ErrorValue.Companion.create("Unsupported annotation argument: " + name);
    }

    private final ClassDescriptor resolveClass(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    public MetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public AnnotationDescriptor loadAnnotation(@NotNull ProtoBuf.Annotation proto, @NotNull NameResolver nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return this.annotationDeserializer.deserializeAnnotation(proto, nameResolver);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> loadConstant(@NotNull String desc, @NotNull Object initializer) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        if (StringsKt.contains$default((CharSequence) "ZBCS", (CharSequence) desc, false, 2, (Object) null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals(ExifInterface.LATITUDE_SOUTH)) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(initializer, this.module);
    }

    public void setMetadataVersion(@NotNull MetadataVersion metadataVersion) {
        Intrinsics.checkNotNullParameter(metadataVersion, "<set-?>");
        this.metadataVersion = metadataVersion;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> transformToUnsignedConstant(@NotNull ConstantValue<?> constant) {
        Intrinsics.checkNotNullParameter(constant, "constant");
        if (constant instanceof ByteValue) {
            return new UByteValue(((ByteValue) constant).getValue().byteValue());
        }
        if (constant instanceof ShortValue) {
            return new UShortValue(((ShortValue) constant).getValue().shortValue());
        }
        if (constant instanceof IntValue) {
            return new UIntValue(((IntValue) constant).getValue().intValue());
        }
        return constant instanceof LongValue ? new ULongValue(((LongValue) constant).getValue().longValue()) : constant;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @Nullable
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(@NotNull final ClassId annotationClassId, @NotNull final SourceElement source, @NotNull final List<AnnotationDescriptor> result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        final ClassDescriptor classDescriptorResolveClass = resolveClass(annotationClassId);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.1
            private final HashMap<Name, ConstantValue<?>> arguments;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.arguments = new HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitArrayValue(Name name, ArrayList<ConstantValue<?>> elements) {
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, classDescriptorResolveClass);
                if (annotationParameterByName != null) {
                    HashMap<Name, ConstantValue<?>> map = this.arguments;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> listCompact = p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(elements);
                    KotlinType type = annotationParameterByName.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    map.put(name, constantValueFactory.createArrayValue(listCompact, type));
                    return;
                }
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(annotationClassId) && Intrinsics.areEqual(name.asString(), "value")) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : elements) {
                        if (obj instanceof AnnotationValue) {
                            arrayList.add(obj);
                        }
                    }
                    List<AnnotationDescriptor> list = result;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((AnnotationValue) it.next()).getValue());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.isRepeatableWithImplicitContainer(annotationClassId, this.arguments) || BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(annotationClassId)) {
                    return;
                }
                result.add(new AnnotationDescriptorImpl(classDescriptorResolveClass.getDefaultType(), this.arguments, source));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitConstantValue(Name name, ConstantValue<?> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (name != null) {
                    this.arguments.put(name, value);
                }
            }
        };
    }
}
