package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectJavaLiteralAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaLiteralAnnotationArgument {

    @NotNull
    private final Object value;

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument
    @NotNull
    public Object getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaLiteralAnnotationArgument(@Nullable Name name, @NotNull Object value) {
        super(name, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }
}
