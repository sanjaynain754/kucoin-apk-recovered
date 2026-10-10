package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.MapsKt;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final NullabilityAnnotationStates EMPTY = new NullabilityAnnotationStatesImpl(MapsKt.emptyMap());

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return EMPTY;
        }

        private Companion() {
        }
    }

    @Nullable
    T get(@NotNull FqName fqName);
}
