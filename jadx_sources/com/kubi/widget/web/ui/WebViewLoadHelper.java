package com.kubi.widget.web.ui;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.messaging.Constants;
import com.kubi.C11352b;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.utils.extensions.C27046k;
import com.kubi.widget.web.R$color;
import com.kubi.widget.web.R$id;
import com.kubi.widget.web.R$layout;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.ui.i0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WebViewLoadHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/widget/web/ui/WebViewLoadHelper;", "", "<init>", "()V", "loading", "Landroid/view/View;", "context", "Landroid/content/Context;", "loadingType", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onReload", "Lkotlin/Function0;", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WebViewLoadHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WebViewLoadHelper f55331a = new WebViewLoadHelper();

    /* JADX INFO: renamed from: c */
    public static final Unit m67556c(Function0 function0) {
        C24329b.f48558a.m58864d("reloadPage", "click reloadPage on error page");
        function0.invoke();
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m67557b(@NotNull Context context, @NotNull final Function0<Unit> onReload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onReload, "onReload");
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.kweb_layout_webview_error, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R$id.btn_reload);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.widget.web.ui.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebViewLoadHelper.m67556c(onReload);
            }
        }, 1, null);
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m67558d(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i11 != 2) {
            ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
            progressBar.getProgressDrawable().setColorFilter(ContextCompat.getColor(context, R$color.primary), PorterDuff.Mode.SRC_ATOP);
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, 8));
            return progressBar;
        }
        ImageView imageView = new ImageView(context);
        C11352b.m20197a(imageView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C5275i0.m6236a(40.0f), C5275i0.m6236a(40.0f));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
