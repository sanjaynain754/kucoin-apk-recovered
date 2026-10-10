package p852kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeParameterErasureOptions.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class TypeParameterErasureOptions {
    private final boolean intersectUpperBounds;
    private final boolean leaveNonTypeParameterTypes;

    public final boolean getIntersectUpperBounds() {
        return this.intersectUpperBounds;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.leaveNonTypeParameterTypes;
    }

    public TypeParameterErasureOptions(boolean z11, boolean z12) {
        this.leaveNonTypeParameterTypes = z11;
        this.intersectUpperBounds = z12;
    }
}
