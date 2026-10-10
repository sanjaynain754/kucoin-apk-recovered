package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.SetsKt;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectKotlinClassKt {

    @NotNull
    private static final Set<Class<?>> TYPES_ELIGIBLE_FOR_SIMPLE_VISIT = SetsKt.setOf((Object[]) new Class[]{Integer.class, Character.class, Byte.class, Long.class, Short.class, Boolean.class, Double.class, Float.class, int[].class, char[].class, byte[].class, long[].class, short[].class, boolean[].class, double[].class, float[].class, Class.class, String.class});
}
