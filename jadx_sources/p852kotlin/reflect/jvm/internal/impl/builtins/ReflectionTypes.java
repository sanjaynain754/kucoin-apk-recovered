package p852kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* JADX INFO: compiled from: ReflectionTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1563#2:226\n1634#2,3:227\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n*L\n94#1:226\n94#1:227,3\n*E\n"})
public final class ReflectionTypes {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.property1(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ClassLookup kClass$delegate;

    @NotNull
    private final ClassLookup kMutableProperty0$delegate;

    @NotNull
    private final ClassLookup kMutableProperty1$delegate;

    @NotNull
    private final ClassLookup kMutableProperty2$delegate;

    @NotNull
    private final ClassLookup kProperty$delegate;

    @NotNull
    private final ClassLookup kProperty0$delegate;

    @NotNull
    private final ClassLookup kProperty1$delegate;

    @NotNull
    private final ClassLookup kProperty2$delegate;

    @NotNull
    private final Lazy kotlinReflectScope$delegate;

    @NotNull
    private final NotFoundClasses notFoundClasses;

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    @SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1761#2,3:226\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n*L\n122#1:226,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final KotlinType createKPropertyStarType(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.kProperty);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return null;
            }
            TypeAttributes empty = TypeAttributes.Companion.getEmpty();
            List<TypeParameterDescriptor> parameters = classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            Object objSingle = CollectionsKt.single((List<? extends Object>) parameters);
            Intrinsics.checkNotNullExpressionValue(objSingle, "single(...)");
            return KotlinTypeFactory.simpleNotNullType(empty, classDescriptorFindClassAcrossModuleDependencies, CollectionsKt.listOf(new StarProjectionImpl((TypeParameterDescriptor) objSingle)));
        }
    }

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class ClassLookup {
        private final int numberOfTypeParameters;

        public ClassLookup(int i11) {
            this.numberOfTypeParameters = i11;
        }

        @NotNull
        public final ClassDescriptor getValue(@NotNull ReflectionTypes types, @NotNull KProperty<?> property) {
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(property, "property");
            return types.find(CapitalizeDecapitalizeKt.capitalizeAsciiOnly(property.getName()), this.numberOfTypeParameters);
        }
    }

    public ReflectionTypes(@NotNull final ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.notFoundClasses = notFoundClasses;
        this.kotlinReflectScope$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(module) { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$$Lambda$0
            private final ModuleDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return ReflectionTypes.kotlinReflectScope_delegate$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = module;
            }
        });
        this.kClass$delegate = new ClassLookup(1);
        this.kProperty$delegate = new ClassLookup(1);
        this.kProperty0$delegate = new ClassLookup(1);
        this.kProperty1$delegate = new ClassLookup(2);
        this.kProperty2$delegate = new ClassLookup(3);
        this.kMutableProperty0$delegate = new ClassLookup(1);
        this.kMutableProperty1$delegate = new ClassLookup(2);
        this.kMutableProperty2$delegate = new ClassLookup(3);
    }

    private final MemberScope getKotlinReflectScope() {
        return (MemberScope) this.kotlinReflectScope$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope kotlinReflectScope_delegate$lambda$0(ModuleDescriptor moduleDescriptor) {
        return moduleDescriptor.getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
    }

    @NotNull
    public final ClassDescriptor getKClass() {
        return this.kClass$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor find(String str, int i11) {
        ClassDescriptor classDescriptor;
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier = getKotlinReflectScope().mo105128getContributedClassifier(nameIdentifier, NoLookupLocation.FROM_REFLECTION);
        if (classifierDescriptorMo105128getContributedClassifier instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor == null) {
            return this.notFoundClasses.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, nameIdentifier), CollectionsKt.listOf(Integer.valueOf(i11)));
        }
        return classDescriptor;
    }
}
