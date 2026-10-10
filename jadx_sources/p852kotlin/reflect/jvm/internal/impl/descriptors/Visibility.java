package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Visibility.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class Visibility {
    private final boolean isPublicAPI;

    @NotNull
    private final String name;

    public Visibility(@NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.isPublicAPI = z11;
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    @Nullable
    public Integer compareTo(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    @NotNull
    public final String toString() {
        return getInternalDisplayName();
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }
}
