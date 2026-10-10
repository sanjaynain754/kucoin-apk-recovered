package p852kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface CapturedTypeConstructor extends TypeConstructor, CapturedTypeConstructorMarker {
    @NotNull
    TypeProjection getProjection();
}
