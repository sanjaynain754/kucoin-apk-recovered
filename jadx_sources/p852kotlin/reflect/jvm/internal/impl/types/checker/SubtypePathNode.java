package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes61.dex */
final class SubtypePathNode {

    @Nullable
    private final SubtypePathNode previous;

    @NotNull
    private final KotlinType type;

    @Nullable
    public final SubtypePathNode getPrevious() {
        return this.previous;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }

    public SubtypePathNode(@NotNull KotlinType type, @Nullable SubtypePathNode subtypePathNode) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.previous = subtypePathNode;
    }
}
