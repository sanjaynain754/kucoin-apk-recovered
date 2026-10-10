package p852kotlin.reflect.jvm.internal.impl.p409km;

import com.tencent.bugly.proguard.C33978va;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ClassName.kt */
/* JADX INFO: loaded from: classes61.dex */
@JvmName(name = "ClassNameKt")
public final class ClassNameKt {
    public static final boolean isLocalClassName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith$default(str, C33978va.f72339h, false, 2, (Object) null);
    }
}
