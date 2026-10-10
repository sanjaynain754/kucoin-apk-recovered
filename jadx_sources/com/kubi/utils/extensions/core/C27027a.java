package com.kubi.utils.extensions.core;

import android.R;
import android.app.Activity;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.utils.R$id;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.a */
/* JADX INFO: compiled from: ActivityExt.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Landroid/app/Activity;", "", "key", "", "value", "", "b", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/Object;", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27027a {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m66596a(@NotNull Activity activity, @NotNull String key) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        View viewFindViewById = activity.findViewById(R.id.content);
        Object tag = viewFindViewById != null ? viewFindViewById.getTag(R$id.activity_tag) : null;
        Map map = tag instanceof Map ? (Map) tag : null;
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m66597b(@NotNull Activity activity, @NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        View viewFindViewById = activity.findViewById(R.id.content);
        int i11 = R$id.activity_tag;
        Object tag = viewFindViewById.getTag(i11);
        if (tag == null) {
            tag = new HashMap();
            viewFindViewById.setTag(i11, tag);
        }
        ((HashMap) tag).put(key, obj);
    }
}
