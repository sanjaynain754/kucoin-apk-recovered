package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: compiled from: SupertypeLoopChecker.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface SupertypeLoopChecker {

    /* JADX INFO: compiled from: SupertypeLoopChecker.kt */
    public static final class EMPTY implements SupertypeLoopChecker {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        @NotNull
        public Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor currentTypeConstructor, @NotNull Collection<? extends KotlinType> superTypes, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> neighbors, @NotNull Function1<? super KotlinType, Unit> reportLoop) {
            Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(superTypes, "superTypes");
            Intrinsics.checkNotNullParameter(neighbors, "neighbors");
            Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
            return superTypes;
        }

        private EMPTY() {
        }
    }

    @NotNull
    Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function2);
}
