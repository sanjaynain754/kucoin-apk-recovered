package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class StrictEqualityTypeChecker {

    @NotNull
    public static final StrictEqualityTypeChecker INSTANCE = new StrictEqualityTypeChecker();

    public final boolean strictEqualTypes(@NotNull UnwrappedType a11, @NotNull UnwrappedType b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(SimpleClassicTypeSystemContext.INSTANCE, a11, b11);
    }

    private StrictEqualityTypeChecker() {
    }
}
