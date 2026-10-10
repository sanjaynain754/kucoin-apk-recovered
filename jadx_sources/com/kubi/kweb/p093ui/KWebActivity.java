package com.kubi.kweb.p093ui;

import android.content.Intent;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.web.KWebView;
import com.kubi.widget.web.helper.ImageFileChooser;
import com.kubi.widget.web.helper.OutFileChooser;
import com.kubi.widget.web.helper.WebPermissionsHelper;
import com.kubi.widget.web.ui.KWebBaseActivity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KWebActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kweb/ui/KWebActivity;", "Lcom/kubi/widget/web/ui/KWebBaseActivity;", "<init>", "()V", "initWebView", "", "webView", "Lcom/kubi/sdk/web/KWebView;", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class KWebActivity extends KWebBaseActivity {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f31029t = 0;

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: u0 */
    public void mo14853u0(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        super.mo14853u0(webView);
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        webView.setWebPermission(new WebPermissionsHelper(this, StringsKt.contains$default((CharSequence) stringExtra, (CharSequence) "/support/meeting/", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) stringExtra, (CharSequence) "/agora/", false, 2, (Object) null)));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        webView.setFileChooser(RouteExKt.m56248g(intent, "is_out_file", false) ? new OutFileChooser(this) : new ImageFileChooser(this));
        m67451l0().m67499x(this);
    }

    public KWebActivity() {
        setPageId("page_h5");
    }
}
