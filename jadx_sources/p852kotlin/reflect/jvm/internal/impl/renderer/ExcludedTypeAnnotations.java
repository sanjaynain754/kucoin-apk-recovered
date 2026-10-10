package p852kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.SetsKt;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ExcludedTypeAnnotations {

    @NotNull
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();

    @NotNull
    private static final Set<FqName> internalAnnotationsForResolve = SetsKt.setOf((Object[]) new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});

    @NotNull
    public final Set<FqName> getInternalAnnotationsForResolve() {
        return internalAnnotationsForResolve;
    }

    private ExcludedTypeAnnotations() {
    }
}
