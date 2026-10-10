package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: ModuleAwareClassDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ModuleAwareClassDescriptorKt {
    @NotNull
    public static final MemberScope getRefinedMemberScopeIfPossible(@NotNull ClassDescriptor classDescriptor, @NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ModuleAwareClassDescriptor.Companion.getRefinedMemberScopeIfPossible$descriptors(classDescriptor, typeSubstitution, kotlinTypeRefiner);
    }

    @NotNull
    public static final MemberScope getRefinedUnsubstitutedMemberScopeIfPossible(@NotNull ClassDescriptor classDescriptor, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ModuleAwareClassDescriptor.Companion.getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(classDescriptor, kotlinTypeRefiner);
    }
}
