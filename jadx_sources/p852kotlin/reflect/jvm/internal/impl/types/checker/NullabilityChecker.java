package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext$$Util;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NullabilityChecker {

    @NotNull
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    private NullabilityChecker() {
    }

    public final boolean isSubtypeOfAny(@NotNull UnwrappedType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(TypeCheckerProviderContext$$Util.newTypeCheckerState$default(SimpleClassicTypeSystemContext.INSTANCE, false, true, false, 4, null), FlexibleTypesKt.lowerIfFlexible(type), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
