package com.kubi;

import android.widget.ImageView;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.util.C24277v;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.b */
/* JADX INFO: compiled from: LoadingView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m90084d2 = {"withLoading", "", "Landroid/widget/ImageView;", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11352b {
    /* JADX INFO: renamed from: a */
    public static final void m20197a(@Nullable ImageView imageView) {
        if (imageView == null) {
            return;
        }
        C24277v.m58539d(imageView.getContext(), R$drawable.kc_loading, imageView);
    }
}
