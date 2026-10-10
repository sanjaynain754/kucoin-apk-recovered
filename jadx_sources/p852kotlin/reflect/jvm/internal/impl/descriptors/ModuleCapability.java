package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModuleCapability.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ModuleCapability<T> {

    @NotNull
    private final String name;

    public ModuleCapability(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    @NotNull
    public String toString() {
        return this.name;
    }
}
