package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NameResolver.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface NameResolver {
    @NotNull
    String getQualifiedClassName(int i11);

    @NotNull
    String getString(int i11);

    boolean isLocalClassName(int i11);
}
