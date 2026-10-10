package p852kotlin.reflect.full;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty1;
import p852kotlin.reflect.KProperty2;
import p852kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: compiled from: KProperties.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0007\u001a/\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"getExtensionDelegate", "", "Lkotlin/reflect/KProperty1;", "D", "Lkotlin/reflect/KProperty2;", "receiver", "(Lkotlin/reflect/KProperty2;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "KProperties")
public final class KProperties {
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Object getExtensionDelegate(@NotNull KProperty1<?, ?> kProperty1) {
        Intrinsics.checkNotNullParameter(kProperty1, "<this>");
        return kProperty1.getDelegate(KPropertyImpl.INSTANCE.getEXTENSION_PROPERTY_DELEGATE());
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final <D> Object getExtensionDelegate(@NotNull KProperty2<D, ?, ?> kProperty2, D d11) {
        Intrinsics.checkNotNullParameter(kProperty2, "<this>");
        return kProperty2.getDelegate(d11, KPropertyImpl.INSTANCE.getEXTENSION_PROPERTY_DELEGATE());
    }
}
