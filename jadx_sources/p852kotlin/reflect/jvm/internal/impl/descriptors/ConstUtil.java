package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: ConstUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ConstUtil {

    @NotNull
    public static final ConstUtil INSTANCE = new ConstUtil();

    private ConstUtil() {
    }

    @JvmStatic
    public static final boolean canBeUsedForConstVal(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return ConstUtilKt.canBeUsedForConstVal(type);
    }
}
