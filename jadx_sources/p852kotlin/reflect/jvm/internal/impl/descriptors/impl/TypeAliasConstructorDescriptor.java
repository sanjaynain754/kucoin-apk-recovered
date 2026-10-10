package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

/* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface TypeAliasConstructorDescriptor extends ConstructorDescriptor {
    @NotNull
    ClassConstructorDescriptor getUnderlyingConstructorDescriptor();
}
