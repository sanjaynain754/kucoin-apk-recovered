package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Substitutable.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface Substitutable<T extends DeclarationDescriptorNonRoot> {
    @NotNull
    T substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
