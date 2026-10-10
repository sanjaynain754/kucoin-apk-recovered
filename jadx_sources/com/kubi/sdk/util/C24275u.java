package com.kubi.sdk.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blankj.utilcode.util.C5276j;
import com.kubi.utils.ThemisUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.u */
/* JADX INFO: compiled from: GlideRequestsEx.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0006"}, m90084d2 = {"loadCompat", "Lcom/kubi/sdk/function/GlideRequest;", "", "Lcom/kubi/sdk/function/GlideRequests;", TypedValues.Custom.S_STRING, "", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24275u {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C46340c<Object> m58535a(@NotNull C46341d c46341d, @Nullable String str) {
        Intrinsics.checkNotNullParameter(c46341d, "<this>");
        if (C5276j.m6245d() < 26 || ThemisUtils.f54260a.m66413b()) {
            C46340c<Bitmap> c46340cMo6601L0 = c46341d.mo6621d().mo6601L0(str);
            Intrinsics.checkNotNull(c46340cMo6601L0, "null cannot be cast to non-null type com.kubi.sdk.function.GlideRequest<kotlin.Any>");
            return c46340cMo6601L0;
        }
        C46340c<Drawable> c46340cMo6634v = c46341d.mo6634v(str);
        Intrinsics.checkNotNull(c46340cMo6634v, "null cannot be cast to non-null type com.kubi.sdk.function.GlideRequest<kotlin.Any>");
        return c46340cMo6634v;
    }
}
