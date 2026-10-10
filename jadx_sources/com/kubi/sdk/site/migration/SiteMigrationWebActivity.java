package com.kubi.sdk.site.migration;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.kubi.host.HostManager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.helper.ReportHelper;
import com.kubi.widget.web.ui.KWebBaseActivity;
import com.kubi.widget.web.ui.KWebUIConfig;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p813yy.C46611a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SiteMigrationWebActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/SiteMigrationWebActivity;", "Lcom/kubi/widget/web/ui/KWebBaseActivity;", "<init>", "()V", "url", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getWebUIConfig", "Lcom/kubi/widget/web/ui/KWebUIConfig;", "finish", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteMigrationWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteMigrationWebActivity.kt\ncom/kubi/sdk/site/migration/SiteMigrationWebActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,61:1\n29#2:62\n*S KotlinDebug\n*F\n+ 1 SiteMigrationWebActivity.kt\ncom/kubi/sdk/site/migration/SiteMigrationWebActivity\n*L\n52#1:62\n*E\n"})
public final class SiteMigrationWebActivity extends KWebBaseActivity {

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ InterfaceC43175a.a f47928u;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final String f47929t = HostManager.a.m() + "/account/transfer?appNeedLang=true&isMigrationContainer=true";

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("SiteMigrationWebActivity.kt", SiteMigrationWebActivity.class);
        f47928u = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onCreate", "com.kubi.sdk.site.migration.SiteMigrationWebActivity", "android.os.Bundle", "savedInstanceState", "", "void"), 0);
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KWebUIConfig mo14852m0() {
        KWebUIConfig.C27229a c27229a = new KWebUIConfig.C27229a();
        c27229a.m67532c(Uri.parse(this.f47929t));
        return c27229a.m67530a();
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        C46611a.m102764b().m102770h(C36686b.m82123c(f47928u, this, this, savedInstanceState));
        super.onCreate(savedInstanceState);
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "child onCreate activity=" + SiteMigrationWebActivity.class.getName());
        getNavigationBar().m54692c();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (Intrinsics.areEqual(RouteExKt.m56282x(intent, "from", "h5"), "h5")) {
            ReportHelper.f47911a.m58103b(SiteType.INSTANCE.getCurrentSiteType(), "", "h5", "TRANSFERRING");
        }
    }

    static {
        ajc$preClinit();
    }

    @Override // android.app.Activity
    public void finish() {
        super.onPreFinish();
        super.finish();
    }
}
