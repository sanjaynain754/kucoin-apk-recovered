package p852kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {

    /* JADX INFO: compiled from: KotlinTypeRefiner.kt */
    public static final class Default extends KotlinTypeRefiner {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        public ClassDescriptor refineDescriptor(@NotNull DeclarationDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return null;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        public ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            return null;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public <S extends MemberScope> S getOrPutScopeForClass(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> compute) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(compute, "compute");
            return compute.invoke();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForModule(@NotNull ModuleDescriptor moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public Collection<KotlinType> refineSupertypes(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Collection<KotlinType> collectionMo105127getSupertypes = classDescriptor.getTypeConstructor().mo105127getSupertypes();
            Intrinsics.checkNotNullExpressionValue(collectionMo105127getSupertypes, "getSupertypes(...)");
            return collectionMo105127getSupertypes;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        @NotNull
        public KotlinType refineType(@NotNull KotlinTypeMarker type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return (KotlinType) type;
        }

        private Default() {
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor typeConstructor) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            return false;
        }
    }

    @Nullable
    public abstract ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId classId);

    @NotNull
    public abstract <S extends MemberScope> S getOrPutScopeForClass(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> function0);

    public abstract boolean isRefinementNeededForModule(@NotNull ModuleDescriptor moduleDescriptor);

    public abstract boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor typeConstructor);

    @Nullable
    public abstract ClassifierDescriptor refineDescriptor(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    public abstract Collection<KotlinType> refineSupertypes(@NotNull ClassDescriptor classDescriptor);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    @NotNull
    public abstract KotlinType refineType(@NotNull KotlinTypeMarker kotlinTypeMarker);
}
