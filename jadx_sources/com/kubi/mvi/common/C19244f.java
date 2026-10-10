package com.kubi.mvi.common;

import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mvi.common.f */
/* JADX INFO: compiled from: MviViewEx.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Landroid/view/View;", "", "isShow", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/View;Z)V", "MVI_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C19244f {
    /* JADX INFO: renamed from: a */
    public static final void m42542a(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            ViewExtKt.m66594y(view);
        } else {
            ViewExtKt.m66577h(view);
        }
    }
}
