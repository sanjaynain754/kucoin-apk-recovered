package p852kotlin.reflect.jvm.internal.impl.types.model;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface TypeCheckerProviderContext {
    @NotNull
    TypeCheckerState newTypeCheckerState(boolean z11, boolean z12, boolean z13);
}
