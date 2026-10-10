package p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: PlatformDependentDeclarationFilter.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class PlatformDependentDeclarationFilterKt {

    @NotNull
    private static final FqName PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME = StandardNames.FqNames.platformDependent;

    @NotNull
    public static final FqName getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME() {
        return PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME;
    }
}
