package p852kotlin.reflect.jvm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: compiled from: KClassesJvm.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"jvmName", "", "Lkotlin/reflect/KClass;", "getJvmName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "KClassesJvm")
public final class KClassesJvm {
    @NotNull
    public static final String getJvmName(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String name = ((KClassImpl) kClass).getJClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
