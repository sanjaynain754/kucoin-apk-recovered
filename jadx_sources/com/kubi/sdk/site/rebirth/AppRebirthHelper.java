package com.kubi.sdk.site.rebirth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.kubi.sdk.site.exception.SiteException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AppRebirthHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/AppRebirthHelper;", "", "<init>", "()V", "startLauncher", "", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "startRebirthActivity", "startLauncherService", "startClearService", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppRebirthHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRebirthHelper.kt\ncom/kubi/sdk/site/rebirth/AppRebirthHelper\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,81:1\n45#2,3:82\n*S KotlinDebug\n*F\n+ 1 AppRebirthHelper.kt\ncom/kubi/sdk/site/rebirth/AppRebirthHelper\n*L\n42#1:82,3\n*E\n"})
public final class AppRebirthHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppRebirthHelper f47948a = new AppRebirthHelper();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58194b(AppRebirthHelper appRebirthHelper, Context context, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        appRebirthHelper.m58195a(context, bundle);
    }

    /* JADX INFO: renamed from: a */
    public final void m58195a(@NotNull Context context, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) AppRebirthClearService.class);
            intent.setPackage(context.getPackageName());
            C44128b.m97266j("SiteConfig::AppRebirth", "start AppRebirthClearService");
            context.startService(intent);
        } catch (Throwable th2) {
            C44128b.m97263g("SiteConfig::AppRebirth", th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58196c(@NotNull Context context, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("com.kubi.action.REBIRTH");
        intent.setPackage(context.getPackageName());
        C44128b.m97266j("SiteConfig::AppRebirth", "AppRebirthLauncherService " + intent);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("app_rebirth", true);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: d */
    public final void m58197d(@NotNull Context context, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) AppRebirthLauncherService.class);
            intent.setPackage(context.getPackageName());
            C44128b.m97266j("SiteConfig::AppRebirth", "start AppRebirthLauncherService " + intent);
            if (bundle != null) {
                bundle.remove("app_rebirth_main_process_pid");
                intent.putExtras(bundle);
            }
            context.startService(intent);
        } catch (Throwable th2) {
            C44128b.m97263g("SiteConfig::AppRebirth", th2);
            m58196c(context, bundle);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58198e(@NotNull Context context, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        try {
            Intent intent = new Intent(context, (Class<?>) ProcessRebirthActivity.class);
            intent.addFlags(268435456);
            intent.putExtras(bundle);
            context.startActivity(intent);
        } catch (Throwable th2) {
            C44128b.m97262f("SiteConfig::AppRebirth", "startRebirth failed", th2);
            C44128b.m97263g("SiteConfig::AppRebirth", th2);
            C43846g.m96568c(new SiteException(th2, "SiteConfig::AppRebirth", false, null, 8, null), null, 2, null);
        }
    }
}
