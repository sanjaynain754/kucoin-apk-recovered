package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes61.dex */
public interface VariableDescriptor extends ValueDescriptor {
    @Nullable
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    ConstantValue<?> mo105118getCompileTimeInitializer();

    boolean isConst();

    boolean isLateInit();

    boolean isVar();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    VariableDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
