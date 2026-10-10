package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TypeComponentPosition.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class TypeComponentPositionKt {
    public static final boolean shouldEnhance(@NotNull TypeComponentPosition typeComponentPosition) {
        Intrinsics.checkNotNullParameter(typeComponentPosition, "<this>");
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE;
    }
}
