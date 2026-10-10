package com.kubi.otc;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.host.HostManager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.helper.C24307c;
import com.kubi.widget.web.helper.ImageFileChooser;
import com.kubi.widget.web.helper.OutFileChooser;
import com.kubi.widget.web.helper.WebPermissionsHelper;
import com.kubi.widget.web.ui.KWebBaseActivity;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PaymentWebActivity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0014¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/otc/PaymentWebActivity;", "Lcom/kubi/widget/web/ui/KWebBaseActivity;", "<init>", "()V", "initWebView", "", "webView", "Lcom/kubi/sdk/web/KWebView;", "startLoad", "onDestroy", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentWebActivity extends KWebBaseActivity {

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Companion f37079t = new Companion(null);

    /* JADX INFO: compiled from: PaymentWebActivity.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010JD\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/otc/PaymentWebActivity$Companion;", "", "<init>", "()V", "KEY_NAV_BAR_VISIBILITY", "", "KEY_SHOW_NOT_FOUND_FAILED_UI", "openHtml", "", "context", "Landroid/content/Context;", "html", "title", "baseUrl", "redirect", "navBarVisibility", "", "openUrl", "url", "isNotFoundShowFailedUi", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentWebActivity.kt\ncom/kubi/otc/PaymentWebActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void openHtml$default(Companion companion, Context context, String str, String str2, String str3, String str4, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            if ((i11 & 16) != 0) {
                str4 = null;
            }
            if ((i11 & 32) != 0) {
                z11 = true;
            }
            companion.openHtml(context, str, str2, str3, str4, z11);
        }

        public static /* synthetic */ void openUrl$default(Companion companion, Context context, String str, String str2, String str3, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            if ((i11 & 16) != 0) {
                z11 = true;
            }
            if ((i11 & 32) != 0) {
                z12 = false;
            }
            companion.openUrl(context, str, str2, str3, z11, z12);
        }

        public final void openHtml(@Nullable Context context, @NotNull String html, @Nullable String title, @Nullable String baseUrl, @Nullable String redirect, boolean navBarVisibility) {
            Intrinsics.checkNotNullParameter(html, "html");
            if (context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PaymentWebActivity.class);
            if (baseUrl == null) {
                baseUrl = HostManager.a.m();
            }
            intent.putExtra("url", baseUrl);
            intent.putExtra("data", html);
            intent.putExtra("navBarVisibility", navBarVisibility);
            if (title != null) {
                intent.putExtra("title", title);
            }
            if (redirect != null) {
                intent.putExtra("redirect_uri", redirect);
            }
            context.startActivity(intent);
        }

        public final void openUrl(@Nullable Context context, @NotNull String url, @Nullable String title, @Nullable String redirect, boolean navBarVisibility, boolean isNotFoundShowFailedUi) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PaymentWebActivity.class);
            intent.putExtra("url", url);
            intent.putExtra("navBarVisibility", navBarVisibility);
            intent.putExtra("isNotFoundShowFailedUi", isNotFoundShowFailedUi);
            if (title != null) {
                intent.putExtra("title", title);
            }
            if (redirect != null) {
                intent.putExtra("redirect_uri", redirect);
            }
            context.startActivity(intent);
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: O0 */
    public void mo14848O0() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean zM56248g = RouteExKt.m56248g(intent, "navBarVisibility", true);
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "startLoad navBarVisibilityExtra=" + zM56248g + " transparentTitle=" + m67451l0().getF55279n().getF55304i() + " url=" + m67451l0().getF55279n().getF55296a());
        if (m67451l0().getF55279n().getF55304i()) {
            C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "startLoad hide navigationBar for transparentTitle=true url=" + m67451l0().getF55279n().getF55296a());
            getNavigationBar().m54692c();
        } else if (zM56248g) {
            getNavigationBar().m54699j();
        } else {
            getNavigationBar().m54692c();
        }
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        if (RouteExKt.m56248g(intent2, "isNotFoundShowFailedUi", false)) {
            m67451l0().m67496r();
        }
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent3, "data");
        if (strM56280w != null && strM56280w.length() != 0) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PaymentWebActivity$startLoad$1(this, strM56280w, null), 3, null);
        } else if (C24307c.f48432a.m58699b(m67451l0().getF55279n().getF55297b())) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PaymentWebActivity$startLoad$2(this, null), 3, null);
        } else {
            super.mo14848O0();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: u0 */
    public void mo14853u0(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        super.mo14853u0(webView);
        webView.setWebPermission(new WebPermissionsHelper(this, false, 2, null));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        webView.setFileChooser(RouteExKt.m56248g(intent, "is_out_file", false) ? new OutFileChooser(this) : new ImageFileChooser(this));
        webView.m58580t();
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
