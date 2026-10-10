package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: dynamicTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
