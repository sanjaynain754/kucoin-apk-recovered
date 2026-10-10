package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface NewTypeVariableConstructor extends TypeConstructor {
    @Nullable
    TypeParameterDescriptor getOriginalTypeParameter();
}
