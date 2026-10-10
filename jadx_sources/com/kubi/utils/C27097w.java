package com.kubi.utils;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utils.w */
/* JADX INFO: compiled from: FragmentStateFixer.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/utils/w;", "", "<init>", "()V", "Lcom/kubi/utils/Condition;", "condition", "", "b", "(Lcom/kubi/utils/Condition;)V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "bundle", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Landroid/os/Bundle;)Z", "Lcom/kubi/utils/Condition;", "sCondition", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFragmentStateFixer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentStateFixer.kt\ncom/kubi/utils/FragmentStateFixer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1855#2,2:46\n*S KotlinDebug\n*F\n+ 1 FragmentStateFixer.kt\ncom/kubi/utils/FragmentStateFixer\n*L\n29#1:46,2\n*E\n"})
public final class C27097w {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27097w f54454a = new C27097w();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Condition sCondition = new Condition(null, 1, null);

    /* JADX INFO: renamed from: a */
    public final boolean m66909a(@NotNull Context context, @Nullable Bundle bundle) {
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(context, "context");
        if (bundle == null || !sCondition.check()) {
            return false;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 == null || (setKeySet = bundle2.keySet()) == null) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            Object obj = bundle2.get((String) it.next());
            Bundle bundle3 = obj instanceof Bundle ? (Bundle) obj : null;
            if (bundle3 != null) {
                bundle3.setClassLoader(context.getClass().getClassLoader());
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m66910b(@NotNull Condition condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        sCondition = condition;
    }
}
