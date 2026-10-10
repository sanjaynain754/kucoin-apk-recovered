package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes61.dex */
final class SignatureSerializer {

    @NotNull
    public static final SignatureSerializer INSTANCE = new SignatureSerializer();

    @NotNull
    public final String constructorDesc(@NotNull Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator it = ArrayIteratorKt.iterator(constructor.getParameterTypes());
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Intrinsics.checkNotNull(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String fieldDesc(@NotNull Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return ReflectClassUtilKt.getDesc(type);
    }

    @NotNull
    public final String methodDesc(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator it = ArrayIteratorKt.iterator(method.getParameterTypes());
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Intrinsics.checkNotNull(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(returnType));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private SignatureSerializer() {
    }
}
