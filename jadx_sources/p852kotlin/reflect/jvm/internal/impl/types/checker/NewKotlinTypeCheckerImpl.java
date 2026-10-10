package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    @NotNull
    private final KotlinTypePreparator kotlinTypePreparator;

    @NotNull
    private final KotlinTypeRefiner kotlinTypeRefiner;

    @NotNull
    private final OverridingUtil overridingUtil;

    public NewKotlinTypeCheckerImpl(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.kotlinTypeRefiner = kotlinTypeRefiner;
        this.kotlinTypePreparator = kotlinTypePreparator;
        OverridingUtil overridingUtilCreateWithTypeRefiner = OverridingUtil.createWithTypeRefiner(getKotlinTypeRefiner());
        Intrinsics.checkNotNullExpressionValue(overridingUtilCreateWithTypeRefiner, "createWithTypeRefiner(...)");
        this.overridingUtil = overridingUtilCreateWithTypeRefiner;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean equalTypes(@NotNull KotlinType a11, @NotNull KotlinType b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return equalTypes(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(false, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), a11.unwrap(), b11.unwrap());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean isSubtypeOf(@NotNull KotlinType subtype, @NotNull KotlinType supertype) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        return isSubtypeOf(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(true, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), subtype.unwrap(), supertype.unwrap());
    }

    @NotNull
    public KotlinTypePreparator getKotlinTypePreparator() {
        return this.kotlinTypePreparator;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    public KotlinTypeRefiner getKotlinTypeRefiner() {
        return this.kotlinTypeRefiner;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    @NotNull
    public OverridingUtil getOverridingUtil() {
        return this.overridingUtil;
    }

    public final boolean equalTypes(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType a11, @NotNull UnwrappedType b11) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, a11, b11);
    }

    public final boolean isSubtypeOf(@NotNull TypeCheckerState typeCheckerState, @NotNull UnwrappedType subType, @NotNull UnwrappedType superType) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, typeCheckerState, subType, superType, false, 8, null);
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i11 & 2) != 0 ? KotlinTypePreparator.Default.INSTANCE : kotlinTypePreparator);
    }
}
