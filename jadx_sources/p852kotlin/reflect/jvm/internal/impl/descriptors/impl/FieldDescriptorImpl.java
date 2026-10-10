package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: compiled from: FieldDescriptorImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    @NotNull
    private final PropertyDescriptor correspondingProperty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(@NotNull Annotations annotations, @NotNull PropertyDescriptor correspondingProperty) {
        super(annotations);
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(correspondingProperty, "correspondingProperty");
        this.correspondingProperty = correspondingProperty;
    }
}
