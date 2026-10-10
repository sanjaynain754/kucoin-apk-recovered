package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p852kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p852kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* JADX INFO: compiled from: LazyJavaPackageScope.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1634#2,3:189\n1625#2:192\n1869#2:193\n1870#2:195\n1626#2:196\n774#2:197\n865#2,2:198\n1#3:194\n1#3:200\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope\n*L\n159#1:189,3\n161#1:192\n161#1:193\n161#1:195\n161#1:196\n184#1:197\n184#1:198,2\n161#1:194\n*E\n"})
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    @NotNull
    private final MemoizedFunctionToNullable<FindClassRequest, ClassDescriptor> classes;

    @NotNull
    private final JavaPackage jPackage;

    @NotNull
    private final NullableLazyValue<Set<String>> knownClassNamesInPackage;

    @NotNull
    private final LazyJavaPackageFragment ownerDescriptor;

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static final class FindClassRequest {

        @Nullable
        private final JavaClass javaClass;

        @NotNull
        private final Name name;

        public FindClassRequest(@NotNull Name name, @Nullable JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.javaClass = javaClass;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof FindClassRequest) && Intrinsics.areEqual(this.name, ((FindClassRequest) obj).name);
        }

        @Nullable
        public final JavaClass getJavaClass() {
            return this.javaClass;
        }

        @NotNull
        public final Name getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }
    }

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static abstract class KotlinClassLookupResult {

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class Found extends KotlinClassLookupResult {

            @NotNull
            private final ClassDescriptor descriptor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(@NotNull ClassDescriptor descriptor) {
                super(null);
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                this.descriptor = descriptor;
            }

            @NotNull
            public final ClassDescriptor getDescriptor() {
                return this.descriptor;
            }
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class NotFound extends KotlinClassLookupResult {

            @NotNull
            public static final NotFound INSTANCE = new NotFound();

            private NotFound() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class SyntheticClass extends KotlinClassLookupResult {

            @NotNull
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private KotlinClassLookupResult() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(@NotNull final LazyJavaResolverContext c11, @NotNull JavaPackage jPackage, @NotNull LazyJavaPackageFragment ownerDescriptor) {
        super(c11);
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.jPackage = jPackage;
        this.ownerDescriptor = ownerDescriptor;
        this.knownClassNamesInPackage = c11.getStorageManager().createNullableLazyValue(new Function0(c11, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$$Lambda$0
            private final LazyJavaResolverContext arg$0;
            private final LazyJavaPackageScope arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaPackageScope.knownClassNamesInPackage$lambda$0(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = c11;
                this.arg$1 = this;
            }
        });
        this.classes = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this, c11) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$$Lambda$1
            private final LazyJavaPackageScope arg$0;
            private final LazyJavaResolverContext arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaPackageScope.classes$lambda$1(this.arg$0, this.arg$1, (LazyJavaPackageScope.FindClassRequest) obj);
            }

            {
                this.arg$0 = this;
                this.arg$1 = c11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor classes$lambda$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext, FindClassRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ClassId classId = new ClassId(lazyJavaPackageScope.getOwnerDescriptor().getFqName(), request.getName());
        KotlinClassFinder.Result resultFindKotlinClassOrContent = request.getJavaClass() != null ? lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(request.getJavaClass(), lazyJavaPackageScope.getMetadataVersion()) : lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId, lazyJavaPackageScope.getMetadataVersion());
        KotlinJvmBinaryClass kotlinJvmBinaryClass = resultFindKotlinClassOrContent != null ? resultFindKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
        ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
            return null;
        }
        KotlinClassLookupResult kotlinClassLookupResultResolveKotlinBinaryClass = lazyJavaPackageScope.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
        if (kotlinClassLookupResultResolveKotlinBinaryClass instanceof KotlinClassLookupResult.Found) {
            return ((KotlinClassLookupResult.Found) kotlinClassLookupResultResolveKotlinBinaryClass).getDescriptor();
        }
        if (kotlinClassLookupResultResolveKotlinBinaryClass instanceof KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (!(kotlinClassLookupResultResolveKotlinBinaryClass instanceof KotlinClassLookupResult.NotFound)) {
            throw new NoWhenBranchMatchedException();
        }
        JavaClass javaClass = request.getJavaClass();
        if (javaClass == null) {
            JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
            KotlinClassFinder.Result.ClassFileContent classFileContent = resultFindKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultFindKotlinClassOrContent : null;
            javaClass = finder.findClass(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
        }
        JavaClass javaClass2 = javaClass;
        if ((javaClass2 != null ? javaClass2.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
            FqName fqName = javaClass2 != null ? javaClass2.getFqName() : null;
            if (fqName == null || fqName.isRoot() || !Intrinsics.areEqual(fqName.parent(), lazyJavaPackageScope.getOwnerDescriptor().getFqName())) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaPackageScope.getOwnerDescriptor(), javaClass2, null, 8, null);
            lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass2 + "\nClassId: " + classId + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), javaClass2, lazyJavaPackageScope.getMetadataVersion()) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), classId, lazyJavaPackageScope.getMetadataVersion()) + '\n');
    }

    private final ClassDescriptor findClassifier(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.isSafeIdentifier(name)) {
            return null;
        }
        Set<String> setInvoke = this.knownClassNamesInPackage.invoke();
        if (javaClass != null || setInvoke == null || setInvoke.contains(name.asString())) {
            return this.classes.invoke(new FindClassRequest(name, javaClass));
        }
        return null;
    }

    private final KotlinClassLookupResult resolveKotlinBinaryClass(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() != KotlinClassHeader.Kind.CLASS) {
            return KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        ClassDescriptor classDescriptorResolveClass = getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
        return classDescriptorResolveClass != null ? new KotlinClassLookupResult.Found(classDescriptorResolveClass) : KotlinClassLookupResult.NotFound.INSTANCE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return SetsKt.emptySet();
        }
        Set<String> setInvoke = this.knownClassNamesInPackage.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.identifier((String) it.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.jPackage;
        if (function1 == null) {
            function1 = FunctionsKt.alwaysTrue();
        }
        Collection<JavaClass> classes = javaPackage.getClasses(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            Name name = javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return SetsKt.emptySet();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return SetsKt.emptySet();
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return findClassifier(javaClass.getName(), javaClass);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassDescriptor mo105128getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return findClassifier(name, null);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!kindFilter.acceptsKinds(companion.getNON_SINGLETON_CLASSIFIERS_MASK() | companion.getCLASSIFIERS_MASK())) {
            return CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> collectionInvoke = getAllDescriptors().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public LazyJavaPackageFragment getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    private final MetadataVersion getMetadataVersion() {
        return getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set knownClassNamesInPackage$lambda$0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        return lazyJavaResolverContext.getComponents().getFinder().knownClassNamesInPackage(lazyJavaPackageScope.getOwnerDescriptor().getFqName());
    }
}
