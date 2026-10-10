package p852kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class AnnotationsKt {
    @NotNull
    public static final Annotations composeAnnotations(@NotNull Annotations first, @NotNull Annotations second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
