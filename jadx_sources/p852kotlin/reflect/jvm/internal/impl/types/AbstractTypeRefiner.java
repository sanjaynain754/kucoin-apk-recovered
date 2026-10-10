package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: AbstractTypeRefiner.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractTypeRefiner {
    @NotNull
    public abstract KotlinTypeMarker refineType(@NotNull KotlinTypeMarker kotlinTypeMarker);
}
