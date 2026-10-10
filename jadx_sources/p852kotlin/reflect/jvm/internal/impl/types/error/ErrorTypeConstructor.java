package p852kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: ErrorTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ErrorTypeConstructor implements TypeConstructor {

    @NotNull
    private final String debugText;

    @NotNull
    private final String[] formatParams;

    @NotNull
    private final ErrorTypeKind kind;

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public ErrorTypeConstructor(@NotNull ErrorTypeKind kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.kind = kind;
        this.formatParams = formatParams;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format(debugText, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        this.debugText = str2;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return DefaultBuiltIns.Companion.getInstance();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo105126getDeclarationDescriptor() {
        return ErrorUtils.INSTANCE.getErrorClass();
    }

    @NotNull
    public final ErrorTypeKind getKind() {
        return this.kind;
    }

    @NotNull
    public final String getParam(int i11) {
        return this.formatParams[i11];
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public String toString() {
        return this.debugText;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getSupertypes */
    public Collection<KotlinType> mo105127getSupertypes() {
        return CollectionsKt.emptyList();
    }
}
