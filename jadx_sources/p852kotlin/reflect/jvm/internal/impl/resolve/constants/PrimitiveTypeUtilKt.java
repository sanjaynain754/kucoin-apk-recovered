package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: PrimitiveTypeUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class PrimitiveTypeUtilKt {
    @NotNull
    public static final Collection<KotlinType> getAllSignedLiteralTypes(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        return CollectionsKt.listOf((Object[]) new SimpleType[]{moduleDescriptor.getBuiltIns().getIntType(), moduleDescriptor.getBuiltIns().getLongType(), moduleDescriptor.getBuiltIns().getByteType(), moduleDescriptor.getBuiltIns().getShortType()});
    }
}
