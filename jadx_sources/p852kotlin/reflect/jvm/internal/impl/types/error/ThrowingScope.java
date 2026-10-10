package p852kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* JADX INFO: compiled from: ThrowingScope.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ThrowingScope extends ErrorScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrowingScope(@NotNull ErrorScopeKind kind, @NotNull String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        throw new IllegalStateException();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo105128getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(getDebugMessage() + ", required name: " + name);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(getDebugMessage());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Set<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(getDebugMessage() + ", required name: " + name);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(getDebugMessage() + ", required name: " + name);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        throw new IllegalStateException();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        throw new IllegalStateException();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: recordLookup, reason: merged with bridge method [inline-methods] */
    public Void mo105132recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public String toString() {
        return "ThrowingScope{" + getDebugMessage() + '}';
    }
}
