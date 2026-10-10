package com.kubi.kweb.p093ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.host.HostManager;
import com.kubi.kweb.api.CmsArticle;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.web.KWebView;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.TextShareParam;
import com.kubi.user.api.d;
import com.kubi.utils.extensions.C27023a;
import com.kubi.widget.web.ui.KWebBaseActivity;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KWebTemplateActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u0011J\f\u0010\u0012\u001a\u00020\f*\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kweb/ui/KWebTemplateActivity;", "Lcom/kubi/widget/web/ui/KWebBaseActivity;", "<init>", "()V", "articleRef", "Lcom/kubi/kweb/api/CmsArticle;", "initWebView", "", "webView", "Lcom/kubi/sdk/web/KWebView;", "startLoad", "loadTemplate", "", "path", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertHtml", "article", "(Lcom/kubi/kweb/api/CmsArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replaceCmsHost", "onNavigationBarRightClick", "onShare", "Companion", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebTemplateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebTemplateActivity.kt\ncom/kubi/kweb/ui/KWebTemplateActivity\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,142:1\n216#2,2:143\n*S KotlinDebug\n*F\n+ 1 KWebTemplateActivity.kt\ncom/kubi/kweb/ui/KWebTemplateActivity\n*L\n105#1:143,2\n*E\n"})
public final class KWebTemplateActivity extends KWebBaseActivity {

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Companion f31033u = new Companion(null);

    /* JADX INFO: renamed from: t */
    @Nullable
    public CmsArticle f31034t;

    /* JADX INFO: compiled from: KWebTemplateActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kweb/ui/KWebTemplateActivity$Companion;", "", "<init>", "()V", "TAG", "", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m36754Y0() {
        String f55298c;
        CmsArticle cmsArticle = this.f31034t;
        if (cmsArticle == null || (f55298c = cmsArticle.getTitle()) == null) {
            f55298c = m67451l0().getF55279n().getF55298c();
        }
        HostManager hostManager = HostManager.a;
        String strG = hostManager.g(m67451l0().getF55279n().getF55296a());
        if (!StringsKt.startsWith$default(strG, "http", false, 2, (Object) null)) {
            if (!StringsKt.startsWith$default(strG, "/", false, 2, (Object) null)) {
                strG = '/' + strG;
            }
            strG = d.d(d.a.a(hostManager.m() + strG), false, 2, (Object) null);
        }
        IShareService iShareService = IShareService.f49268a.get();
        TextShareParam textShareParam = new TextShareParam("news_share", null, null, null, 14, null);
        textShareParam.setContent(f55298c);
        textShareParam.setLinkUrl(strG);
        IShareService.m59640c(iShareService, textShareParam, null, 2, null);
        C27023a.m66555b("B2news", FirebaseAnalytics.Event.SHARE, null, null, 12, null);
    }

    /* JADX INFO: renamed from: Z0 */
    public final String m36755Z0(String str) {
        Map mapL = HostManager.a.l();
        if (mapL.isEmpty()) {
            return str;
        }
        String strReplace$default = str;
        for (Map.Entry entry : mapL.entrySet()) {
            strReplace$default = StringsKt.replace$default(StringsKt.replace$default(strReplace$default, "href=\"https://" + ((String) entry.getKey()), "href=\"https://" + ((String) entry.getValue()), false, 4, (Object) null), "href='https://" + ((String) entry.getKey()), "href='https://" + ((String) entry.getValue()), false, 4, (Object) null);
        }
        return strReplace$default;
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: u0 */
    public void mo14853u0(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        super.mo14853u0(webView);
        m67451l0().m67499x(this);
    }

    public KWebTemplateActivity() {
        setPageId("page_h5");
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: C0 */
    public void mo36751C0() {
        Drawable drawable;
        ImageView rightThree = getNavigationBar().getRightThree();
        if (rightThree != null) {
            drawable = rightThree.getDrawable();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            m36754Y0();
        } else {
            super.mo36751C0();
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: O0 */
    public void mo14848O0() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "path");
        if (strM56280w != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KWebTemplateActivity$startLoad$1(this, strM56280w, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final Object m36752W0(CmsArticle cmsArticle, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KWebTemplateActivity$convertHtml$2(this, cmsArticle, null), continuation);
    }

    /* JADX INFO: renamed from: X0 */
    public final Object m36753X0(String str, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KWebTemplateActivity$loadTemplate$2(str, this, null), continuation);
    }
}
