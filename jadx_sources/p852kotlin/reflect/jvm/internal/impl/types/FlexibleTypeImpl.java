package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: flexibleTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;
    private boolean assertionsDone;

    /* JADX INFO: compiled from: flexibleTypes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    private final void runAssertions() {
        if (!RUN_SLOW_ASSERTIONS || this.assertionsDone) {
            return;
        }
        this.assertionsDone = true;
        FlexibleTypesKt.isFlexible(getLowerBound());
        FlexibleTypesKt.isFlexible(getUpperBound());
        Intrinsics.areEqual(getLowerBound(), getUpperBound());
        KotlinTypeChecker.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String render(@NotNull DescriptorRenderer renderer, @NotNull DescriptorRendererOptions options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!options.getDebugMode()) {
            return renderer.renderFlexibleType(renderer.renderType(getLowerBound()), renderer.renderType(getUpperBound()), TypeUtilsKt.getBuiltIns(this));
        }
        return '(' + renderer.renderType(getLowerBound()) + ".." + renderer.renderType(getUpperBound()) + ')';
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return KotlinTypeFactory.flexibleType(getLowerBound().replaceAttributes(newAttributes), getUpperBound().replaceAttributes(newAttributes));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType replacement) {
        UnwrappedType unwrappedTypeFlexibleType;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            unwrappedTypeFlexibleType = unwrappedTypeUnwrap;
        } else {
            if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
            unwrappedTypeFlexibleType = KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeFlexibleType, unwrappedTypeUnwrap);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return '(' + getLowerBound() + ".." + getUpperBound() + ')';
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        runAssertions();
        return getLowerBound();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        if ((getLowerBound().getConstructor().mo105126getDeclarationDescriptor() instanceof TypeParameterDescriptor) && Intrinsics.areEqual(getLowerBound().getConstructor(), getUpperBound().getConstructor())) {
            return true;
        }
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType makeNullableAsSpecified(boolean z11) {
        return KotlinTypeFactory.flexibleType(getLowerBound().makeNullableAsSpecified(z11), getUpperBound().makeNullableAsSpecified(z11));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public FlexibleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new FlexibleTypeImpl((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2);
    }
}
