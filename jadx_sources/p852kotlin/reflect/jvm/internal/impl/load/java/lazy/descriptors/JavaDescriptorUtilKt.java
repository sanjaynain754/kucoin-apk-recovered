package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: compiled from: JavaDescriptorUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean isJavaField(@NotNull PropertyDescriptor propertyDescriptor) {
        Intrinsics.checkNotNullParameter(propertyDescriptor, "<this>");
        return propertyDescriptor.getGetter() == null;
    }
}
