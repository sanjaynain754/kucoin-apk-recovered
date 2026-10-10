package androidx.lifecycle.viewmodel.internal;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: CanonicalName.jvm.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"canonicalName", "", "Lkotlin/reflect/KClass;", "getCanonicalName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "lifecycle-viewmodel_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CanonicalName_jvmKt {
    @Nullable
    public static final String getCanonicalName(@Nullable KClass<?> kClass) {
        if (kClass != null) {
            return kClass.getQualifiedName();
        }
        return null;
    }
}
