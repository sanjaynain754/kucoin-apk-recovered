package p852kotlin.reflect.full;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.jvm.internal.KTypeImpl;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: KTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, m90084d2 = {"withNullability", "Lkotlin/reflect/KType;", "nullable", "", "isSubtypeOf", "other", "isSupertypeOf", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "KTypes")
public final class KTypes {
    @SinceKotlin(version = "1.1")
    public static final boolean isSubtypeOf(@NotNull KType kType, @NotNull KType other) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return TypeUtilsKt.isSubtypeOf(((KTypeImpl) kType).getType(), ((KTypeImpl) other).getType());
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSupertypeOf(@NotNull KType kType, @NotNull KType other) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return isSubtypeOf(other, kType);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final KType withNullability(@NotNull KType kType, boolean z11) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        return ((KTypeImpl) kType).makeNullableAsSpecified$kotlin_reflection(z11);
    }
}
