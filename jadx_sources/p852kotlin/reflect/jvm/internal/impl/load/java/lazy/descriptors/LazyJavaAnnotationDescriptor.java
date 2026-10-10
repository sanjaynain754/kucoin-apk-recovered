package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1563#2:125\n1634#2,3:126\n1617#2,9:130\n1869#2:139\n1870#2:141\n1626#2:142\n1#3:129\n1#3:140\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n*L\n94#1:125\n94#1:126,3\n62#1:130,9\n62#1:139\n62#1:141\n62#1:142\n62#1:140\n*E\n"})
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), Reflection.property1(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.property1(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    @NotNull
    private final NotNullLazyValue allValueArguments$delegate;

    /* JADX INFO: renamed from: c */
    @NotNull
    private final LazyJavaResolverContext f91367c;

    @NotNull
    private final NullableLazyValue fqName$delegate;
    private final boolean isFreshlySupportedTypeUseAnnotation;
    private final boolean isIdeExternalAnnotation;

    @NotNull
    private final JavaAnnotation javaAnnotation;

    @NotNull
    private final JavaSourceElement source;

    @NotNull
    private final NotNullLazyValue type$delegate;

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext c11, @NotNull JavaAnnotation javaAnnotation, boolean z11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f91367c = c11;
        this.javaAnnotation = javaAnnotation;
        this.fqName$delegate = c11.getStorageManager().createNullableLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$0
            private final LazyJavaAnnotationDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaAnnotationDescriptor.fqName_delegate$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        this.type$delegate = c11.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$1
            private final LazyJavaAnnotationDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaAnnotationDescriptor.type_delegate$lambda$2(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        this.source = c11.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.allValueArguments$delegate = c11.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$$Lambda$2
            private final LazyJavaAnnotationDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaAnnotationDescriptor.allValueArguments_delegate$lambda$5(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        this.isIdeExternalAnnotation = javaAnnotation.isIdeExternalAnnotation();
        this.isFreshlySupportedTypeUseAnnotation = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$5(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.javaAnnotation.getArguments();
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            ConstantValue<?> constantValueResolveAnnotationArgument = lazyJavaAnnotationDescriptor.resolveAnnotationArgument(javaAnnotationArgument);
            Pair pairM90091to = constantValueResolveAnnotationArgument != null ? TuplesKt.m90091to(name, constantValueResolveAnnotationArgument) : null;
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    private final ClassDescriptor createTypeForMissingDependencies(FqName fqName) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.f91367c.getModule(), ClassId.Companion.topLevel(fqName), this.f91367c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName fqName_delegate$lambda$0(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        ClassId classId = lazyJavaAnnotationDescriptor.javaAnnotation.getClassId();
        if (classId != null) {
            return classId.asSingleFqName();
        }
        return null;
    }

    private final ConstantValue<?> resolveAnnotationArgument(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.createConstantValue$default(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return resolveFromEnumValue(javaEnumValueAnnotationArgument.getEnumClassId(), javaEnumValueAnnotationArgument.getEntryName());
        }
        if (!(javaAnnotationArgument instanceof JavaArrayAnnotationArgument)) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return resolveFromAnnotation(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return resolveFromJavaClassObjectType(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType());
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
        }
        Intrinsics.checkNotNull(name);
        return resolveFromArray(name, javaArrayAnnotationArgument.getElements());
    }

    private final ConstantValue<?> resolveFromAnnotation(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f91367c, javaAnnotation, false, 4, null));
    }

    private final ConstantValue<?> resolveFromEnumValue(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    private final ConstantValue<?> resolveFromJavaClassObjectType(JavaType javaType) {
        return KClassValue.Companion.create(this.f91367c.getTypeResolver().transformJavaType(javaType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.fqName$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public JavaSourceElement getSource() {
        return this.source;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.isFreshlySupportedTypeUseAnnotation;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    private final ConstantValue<?> resolveFromArray(Name name, List<? extends JavaAnnotationArgument> list) {
        KotlinType arrayType;
        if (KotlinTypeKt.isError(getType())) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(this);
        Intrinsics.checkNotNull(annotationClass);
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = this.f91367c.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            Intrinsics.checkNotNullExpressionValue(arrayType, "getArrayType(...)");
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ConstantValue<?> constantValueResolveAnnotationArgument = resolveAnnotationArgument((JavaAnnotationArgument) it.next());
            if (constantValueResolveAnnotationArgument == null) {
                constantValueResolveAnnotationArgument = new NullValue();
            }
            arrayList.add(constantValueResolveAnnotationArgument);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType type_delegate$lambda$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
        if (fqName == null) {
            return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, lazyJavaAnnotationDescriptor.javaAnnotation.toString());
        }
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaAnnotationDescriptor.f91367c.getModule().getBuiltIns(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            JavaClass javaClassResolve = lazyJavaAnnotationDescriptor.javaAnnotation.resolve();
            if (javaClassResolve != null) {
                classDescriptorMapJavaToKotlin$default = lazyJavaAnnotationDescriptor.f91367c.getComponents().getModuleClassResolver().resolveClass(javaClassResolve);
            } else {
                classDescriptorMapJavaToKotlin$default = null;
            }
            if (classDescriptorMapJavaToKotlin$default == null) {
                classDescriptorMapJavaToKotlin$default = lazyJavaAnnotationDescriptor.createTypeForMissingDependencies(fqName);
            }
        }
        return classDescriptorMapJavaToKotlin$default.getDefaultType();
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i11 & 4) != 0 ? false : z11);
    }
}
