package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p852kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

/* JADX INFO: compiled from: JvmPackageScope.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n+ 2 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n92#2,14:110\n60#2,5:124\n60#2,5:129\n60#2,5:134\n10557#3,5:139\n10557#3,5:144\n1617#4,9:149\n1869#4:158\n1870#4:160\n1626#4:161\n1#5:159\n37#6:162\n36#6,3:163\n*S KotlinDebug\n*F\n+ 1 JvmPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/JvmPackageScope\n*L\n58#1:110,14\n63#1:124,5\n68#1:129,5\n74#1:134,5\n76#1:139,5\n80#1:144,5\n46#1:149,9\n46#1:158\n46#1:160\n46#1:161\n46#1:159\n49#1:162\n49#1:163,3\n*E\n"})
public final class JvmPackageScope implements MemberScope {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: c */
    @NotNull
    private final LazyJavaResolverContext f91366c;

    @NotNull
    private final LazyJavaPackageScope javaScope;

    @NotNull
    private final NotNullLazyValue kotlinScopes$delegate;

    @NotNull
    private final LazyJavaPackageFragment packageFragment;

    public JvmPackageScope(@NotNull LazyJavaResolverContext c11, @NotNull JavaPackage jPackage, @NotNull LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f91366c = c11;
        this.packageFragment = packageFragment;
        this.javaScope = new LazyJavaPackageScope(c11, jPackage, packageFragment);
        this.kotlinScopes$delegate = c11.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$$Lambda$0
            private final JvmPackageScope arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmPackageScope.kotlinScopes_delegate$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    private final MemberScope[] getKotlinScopes() {
        return (MemberScope[]) StorageKt.getValue(this.kotlinScopes$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope[] kotlinScopes_delegate$lambda$1(JvmPackageScope jvmPackageScope) {
        Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.packageFragment.getBinaryClasses$descriptors_jvm().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            MemberScope memberScopeCreateKotlinPackagePartScope = jvmPackageScope.f91366c.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(jvmPackageScope.packageFragment, (KotlinJvmBinaryClass) it.next());
            if (memberScopeCreateKotlinPackagePartScope != null) {
                arrayList.add(memberScopeCreateKotlinPackagePartScope);
            }
        }
        return (MemberScope[]) ScopeUtilsKt.listOfNonEmptyScopes(arrayList).toArray(new MemberScope[0]);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo105128getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo105132recordLookup(name, location);
        ClassDescriptor classDescriptorMo105128getContributedClassifier = this.javaScope.mo105128getContributedClassifier(name, location);
        if (classDescriptorMo105128getContributedClassifier != null) {
            return classDescriptorMo105128getContributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : getKotlinScopes()) {
            ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier = memberScope.mo105128getContributedClassifier(name, location);
            if (classifierDescriptorMo105128getContributedClassifier != null) {
                if (!(classifierDescriptorMo105128getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo105128getContributedClassifier).isExpect()) {
                    return classifierDescriptorMo105128getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo105128getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection<DeclarationDescriptor> contributedDescriptors = lazyJavaPackageScope.getContributedDescriptors(kindFilter, nameFilter);
        for (MemberScope memberScope : kotlinScopes) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return contributedDescriptors == null ? SetsKt.emptySet() : contributedDescriptors;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo105132recordLookup(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = lazyJavaPackageScope.getContributedFunctions(name, location);
        int length = kotlinScopes.length;
        int i11 = 0;
        Collection collection = contributedFunctions;
        while (i11 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, kotlinScopes[i11].getContributedFunctions(name, location));
            i11++;
            collection = collectionConcat;
        }
        return collection == null ? SetsKt.emptySet() : collection;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo105132recordLookup(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection<? extends PropertyDescriptor> contributedVariables = lazyJavaPackageScope.getContributedVariables(name, location);
        int length = kotlinScopes.length;
        int i11 = 0;
        Collection collection = contributedVariables;
        while (i11 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, kotlinScopes[i11].getContributedVariables(name, location));
            i11++;
            collection = collectionConcat;
        }
        return collection == null ? SetsKt.emptySet() : collection;
    }

    @NotNull
    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.javaScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo105132recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        UtilsKt.record(this.f91366c.getComponents().getLookupTracker(), location, this.packageFragment, name);
    }

    @NotNull
    public String toString() {
        return "scope for " + this.packageFragment;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        Set<Name> setFlatMapClassifierNamesOrNull = MemberScopeKt.flatMapClassifierNamesOrNull(ArraysKt.asIterable(getKotlinScopes()));
        if (setFlatMapClassifierNamesOrNull != null) {
            setFlatMapClassifierNamesOrNull.addAll(this.javaScope.getClassifierNames());
            return setFlatMapClassifierNamesOrNull;
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        MemberScope[] kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : kotlinScopes) {
            CollectionsKt.addAll(linkedHashSet, memberScope.getFunctionNames());
        }
        linkedHashSet.addAll(this.javaScope.getFunctionNames());
        return linkedHashSet;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        MemberScope[] kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : kotlinScopes) {
            CollectionsKt.addAll(linkedHashSet, memberScope.getVariableNames());
        }
        linkedHashSet.addAll(this.javaScope.getVariableNames());
        return linkedHashSet;
    }
}
