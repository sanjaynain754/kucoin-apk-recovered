package com.kubi.utils.extensions.core;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.e */
/* JADX INFO: compiled from: DialogEx.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Landroid/app/Dialog;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/app/Dialog;)V", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27031e {
    /* JADX INFO: renamed from: a */
    public static final void m66609a(@NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "<this>");
        Context context = dialog.getContext();
        Activity activity = null;
        Activity activity2 = context instanceof Activity ? (Activity) context : null;
        if (activity2 == null) {
            Context context2 = dialog.getContext();
            ContextThemeWrapper contextThemeWrapper = context2 instanceof ContextThemeWrapper ? (ContextThemeWrapper) context2 : null;
            Context baseContext = contextThemeWrapper != null ? contextThemeWrapper.getBaseContext() : null;
            if (baseContext instanceof Activity) {
                activity = (Activity) baseContext;
            }
        } else {
            activity = activity2;
        }
        if (activity == null) {
            dialog.show();
        } else {
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            dialog.show();
        }
    }
}
