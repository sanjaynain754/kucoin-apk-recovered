package p852kotlin.reflect.jvm.internal.impl.renderer;

import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes61.dex */
public enum AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    AnnotationArgumentsRenderingPolicy(boolean z11, boolean z12) {
        this.includeAnnotationArguments = z11;
        this.includeEmptyAnnotationArguments = z12;
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ AnnotationArgumentsRenderingPolicy(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
