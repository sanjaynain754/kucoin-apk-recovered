package p852kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: InnerClassesScopeWrapper.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nInnerClassesScopeWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n808#2,11:56\n*S KotlinDebug\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n*L\n35#1:56,11\n*E\n"})
public final class InnerClassesScopeWrapper extends MemberScopeImpl {

    @NotNull
    private final MemberScope workerScope;

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo105128getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier = this.workerScope.mo105128getContributedClassifier(name, location);
        if (classifierDescriptorMo105128getContributedClassifier != null) {
            ClassDescriptor classDescriptor = classifierDescriptorMo105128getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            if (classifierDescriptorMo105128getContributedClassifier instanceof TypeAliasDescriptor) {
                return (TypeAliasDescriptor) classifierDescriptorMo105128getContributedClassifier;
            }
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public List<ClassifierDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        DescriptorKindFilter descriptorKindFilterRestrictedToKindsOrNull = kindFilter.restrictedToKindsOrNull(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK());
        if (descriptorKindFilterRestrictedToKindsOrNull == null) {
            return CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> contributedDescriptors = this.workerScope.getContributedDescriptors(descriptorKindFilterRestrictedToKindsOrNull, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo105132recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        this.workerScope.mo105132recordLookup(name, location);
    }

    @NotNull
    public String toString() {
        return "Classes from " + this.workerScope;
    }

    public InnerClassesScopeWrapper(@NotNull MemberScope workerScope) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        this.workerScope = workerScope;
    }
}
