package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: compiled from: ClassicTypeCheckerState.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ClassicTypeCheckerStateKt {
    public static /* synthetic */ TypeCheckerState createClassicTypeCheckerState$default(boolean z11, boolean z12, ClassicTypeSystemContext classicTypeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            classicTypeSystemContext = SimpleClassicTypeSystemContext.INSTANCE;
        }
        if ((i11 & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.Default.INSTANCE;
        }
        if ((i11 & 16) != 0) {
            kotlinTypeRefiner = KotlinTypeRefiner.Default.INSTANCE;
        }
        return createClassicTypeCheckerState(z11, z12, classicTypeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    @NotNull
    public static final TypeCheckerState createClassicTypeCheckerState(boolean z11, boolean z12, @NotNull ClassicTypeSystemContext typeSystemContext, @NotNull KotlinTypePreparator kotlinTypePreparator, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new TypeCheckerState(z11, z12, false, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
