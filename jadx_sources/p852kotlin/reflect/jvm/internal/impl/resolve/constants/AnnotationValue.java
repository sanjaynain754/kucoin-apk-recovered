package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class AnnotationValue extends ConstantValue<AnnotationDescriptor> {
    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return getValue().getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationValue(@NotNull AnnotationDescriptor value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
