package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import p852kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final SimpleType original;
    private final boolean useCorrectedNullabilityForTypeParameters;

    /* JADX INFO: compiled from: SpecialTypes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DefinitelyNotNullType makeDefinitelyNotNull$default(Companion companion, UnwrappedType unwrappedType, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return companion.makeDefinitelyNotNull(unwrappedType, z11, z12);
        }

        private final boolean canHaveUndefinedNullability(UnwrappedType unwrappedType) {
            if (!(unwrappedType.getConstructor() instanceof NewTypeVariableConstructor) && !(unwrappedType.getConstructor().mo105126getDeclarationDescriptor() instanceof TypeParameterDescriptor) && !(unwrappedType instanceof NewCapturedType) && !(unwrappedType instanceof StubTypeForBuilderInference)) {
                return false;
            }
            return true;
        }

        private final boolean makesSenseToBeDefinitelyNotNull(UnwrappedType unwrappedType, boolean z11) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl;
            if (!canHaveUndefinedNullability(unwrappedType)) {
                return false;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return TypeUtils.isNullableType(unwrappedType);
            }
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = unwrappedType.getConstructor().mo105126getDeclarationDescriptor();
            if (classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptorImpl) {
                typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) classifierDescriptorMo105126getDeclarationDescriptor;
            } else {
                typeParameterDescriptorImpl = null;
            }
            if (typeParameterDescriptorImpl != null && !typeParameterDescriptorImpl.isInitialized()) {
                return true;
            }
            if (z11 && (unwrappedType.getConstructor().mo105126getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
                return TypeUtils.isNullableType(unwrappedType);
            }
            return !NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType);
        }

        @JvmOverloads
        @Nullable
        public final DefinitelyNotNullType makeDefinitelyNotNull(@NotNull UnwrappedType type, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z12 && !makesSenseToBeDefinitelyNotNull(type, z11)) {
                return null;
            }
            if (type instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) type;
                Intrinsics.areEqual(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.lowerIfFlexible(type).makeNullableAsSpecified(false), z11, defaultConstructorMarker);
        }
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    private DefinitelyNotNullType(SimpleType simpleType, boolean z11) {
        this.original = simpleType;
        this.useCorrectedNullabilityForTypeParameters = z11;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.original;
    }

    @NotNull
    public final SimpleType getOriginal() {
        return this.original;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z11) {
        return z11 ? getDelegate().makeNullableAsSpecified(z11) : this;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(getDelegate().replaceAttributes(newAttributes), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public DefinitelyNotNullType replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new DefinitelyNotNullType(delegate, this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(replacement.unwrap(), this.useCorrectedNullabilityForTypeParameters);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return getDelegate() + " & Any";
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        if (!(getDelegate().getConstructor() instanceof NewTypeVariableConstructor) && !(getDelegate().getConstructor().mo105126getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
            return false;
        }
        return true;
    }
}
