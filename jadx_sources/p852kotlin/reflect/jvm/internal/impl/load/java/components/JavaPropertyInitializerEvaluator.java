package p852kotlin.reflect.jvm.internal.impl.load.java.components;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* JADX INFO: compiled from: JavaPropertyInitializerEvaluator.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaPropertyInitializerEvaluator {

    /* JADX INFO: compiled from: JavaPropertyInitializerEvaluator.kt */
    public static final class DoNothing implements JavaPropertyInitializerEvaluator {

        @NotNull
        public static final DoNothing INSTANCE = new DoNothing();

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        @Nullable
        public ConstantValue<?> getInitializerConstant(@NotNull JavaField field, @NotNull PropertyDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return null;
        }

        private DoNothing() {
        }
    }

    @Nullable
    ConstantValue<?> getInitializerConstant(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);
}
