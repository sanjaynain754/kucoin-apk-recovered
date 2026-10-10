package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: NotFoundClasses.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NotFoundClasses {

    @NotNull
    private final MemoizedFunctionToNotNull<ClassRequest, ClassDescriptor> classes;

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> packageFragments;

    @NotNull
    private final StorageManager storageManager;

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class ClassRequest {

        @NotNull
        private final ClassId classId;

        @NotNull
        private final List<Integer> typeParametersCount;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.areEqual(this.classId, classRequest.classId) && Intrinsics.areEqual(this.typeParametersCount, classRequest.typeParametersCount);
        }

        public ClassRequest(@NotNull ClassId classId, @NotNull List<Integer> typeParametersCount) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
            this.classId = classId;
            this.typeParametersCount = typeParametersCount;
        }

        @NotNull
        public final ClassId component1() {
            return this.classId;
        }

        @NotNull
        public final List<Integer> component2() {
            return this.typeParametersCount;
        }

        public int hashCode() {
            return (this.classId.hashCode() * 31) + this.typeParametersCount.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClassRequest(classId=" + this.classId + ", typeParametersCount=" + this.typeParametersCount + ')';
        }
    }

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    @SourceDebugExtension({"SMAP\nNotFoundClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1563#2:101\n1634#2,3:102\n*S KotlinDebug\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n*L\n55#1:101\n55#1:102,3\n*E\n"})
    public static final class MockClassDescriptor extends ClassDescriptorBase {

        @NotNull
        private final List<TypeParameterDescriptor> declaredTypeParameters;
        private final boolean isInner;

        @NotNull
        private final ClassTypeConstructorImpl typeConstructor;

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: getCompanionObjectDescriptor */
        public ClassDescriptor mo105115getCompanionObjectDescriptor() {
            return null;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
        public ClassConstructorDescriptor mo105116getUnsubstitutedPrimaryConstructor() {
            return null;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
            return null;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isActual() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isCompanionObject() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isData() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExpect() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExternal() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isFun() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isInline() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isValue() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        @NotNull
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        @NotNull
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.declaredTypeParameters;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        @NotNull
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        @NotNull
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        @NotNull
        public MemberScope.Empty getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
        @NotNull
        public DescriptorVisibility getVisibility() {
            DescriptorVisibility PUBLIC = DescriptorVisibilities.PUBLIC;
            Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public boolean isInner() {
            return this.isInner;
        }

        @NotNull
        public String toString() {
            return "class " + getName() + " (not found)";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor container, @NotNull Name name, boolean z11, int i11) {
            super(storageManager, container, name, SourceElement.NO_SOURCE, false);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(name, "name");
            this.isInner = z11;
            IntRange intRangeUntil = RangesKt.until(0, i11);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Annotations empty = Annotations.Companion.getEMPTY();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, empty, false, variance, Name.identifier(sb2.toString()), iNextInt, storageManager));
            }
            this.declaredTypeParameters = arrayList;
            this.typeConstructor = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), SetsKt.setOf(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return SetsKt.emptySet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor classes$lambda$2(NotFoundClasses notFoundClasses, ClassRequest classRequest) {
        PackageFragmentDescriptor packageFragmentDescriptorInvoke;
        Intrinsics.checkNotNullParameter(classRequest, "<destruct>");
        ClassId classIdComponent1 = classRequest.component1();
        List<Integer> listComponent2 = classRequest.component2();
        if (classIdComponent1.isLocal()) {
            throw new UnsupportedOperationException("Unresolved local class: " + classIdComponent1);
        }
        ClassId outerClassId = classIdComponent1.getOuterClassId();
        if (outerClassId == null || (packageFragmentDescriptorInvoke = notFoundClasses.getClass(outerClassId, CollectionsKt.drop(listComponent2, 1))) == null) {
            packageFragmentDescriptorInvoke = notFoundClasses.packageFragments.invoke(classIdComponent1.getPackageFqName());
        }
        DeclarationDescriptor declarationDescriptor = packageFragmentDescriptorInvoke;
        boolean zIsNestedClass = classIdComponent1.isNestedClass();
        StorageManager storageManager = notFoundClasses.storageManager;
        Name shortClassName = classIdComponent1.getShortClassName();
        Integer num = (Integer) CollectionsKt.firstOrNull((List) listComponent2);
        return new MockClassDescriptor(storageManager, declarationDescriptor, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageFragmentDescriptor packageFragments$lambda$0(NotFoundClasses notFoundClasses, FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return new EmptyPackageFragmentDescriptor(notFoundClasses.module, fqName);
    }

    @NotNull
    public final ClassDescriptor getClass(@NotNull ClassId classId, @NotNull List<Integer> typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return this.classes.invoke(new ClassRequest(classId, typeParametersCount));
    }

    public NotFoundClasses(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.storageManager = storageManager;
        this.module = module;
        this.packageFragments = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$0
            private final NotFoundClasses arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return NotFoundClasses.packageFragments$lambda$0(this.arg$0, (FqName) obj);
            }

            {
                this.arg$0 = this;
            }
        });
        this.classes = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$1
            private final NotFoundClasses arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return NotFoundClasses.classes$lambda$2(this.arg$0, (NotFoundClasses.ClassRequest) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }
}
