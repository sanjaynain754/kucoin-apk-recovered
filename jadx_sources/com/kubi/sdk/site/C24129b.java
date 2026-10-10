package com.kubi.sdk.site;

import android.annotation.SuppressLint;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.site.config.SiteConfigManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.site.b */
/* JADX INFO: compiled from: SiteConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u001a\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u000bH\u0007¨\u0006\f"}, m90084d2 = {"stringConfig", "", "Lcom/kubi/sdk/site/SiteBizConfigKey;", "isVisible", "", "Lcom/kubi/sdk/site/SiteVisibleConfigKey;", ViewProps.VISIBLE, "", "block", "Lkotlin/Function0;", "inVisible", "Lcom/kubi/sdk/site/SiteExtConfigKey;", "LSiteConfig_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24129b {
    /* JADX INFO: renamed from: a */
    public static final void m58029a(@NotNull SiteVisibleConfigKey siteVisibleConfigKey, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(siteVisibleConfigKey, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (m58030b(siteVisibleConfigKey)) {
            return;
        }
        block.invoke();
    }

    @SuppressLint({"VisibleForTests"})
    /* JADX INFO: renamed from: b */
    public static final boolean m58030b(@NotNull SiteVisibleConfigKey siteVisibleConfigKey) {
        Intrinsics.checkNotNullParameter(siteVisibleConfigKey, "<this>");
        return SiteConfigManager.f47884a.m58042i(siteVisibleConfigKey);
    }

    @SuppressLint({"VisibleForTests"})
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m58031c(@NotNull SiteBizConfigKey siteBizConfigKey) {
        Intrinsics.checkNotNullParameter(siteBizConfigKey, "<this>");
        return SiteConfigManager.f47884a.m58046m(siteBizConfigKey);
    }

    @SuppressLint({"VisibleForTests"})
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m58032d(@NotNull SiteExtConfigKey siteExtConfigKey) {
        Intrinsics.checkNotNullParameter(siteExtConfigKey, "<this>");
        return SiteConfigManager.f47884a.m58044k(siteExtConfigKey);
    }

    /* JADX INFO: renamed from: e */
    public static final void m58033e(@NotNull SiteVisibleConfigKey siteVisibleConfigKey, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(siteVisibleConfigKey, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (m58030b(siteVisibleConfigKey)) {
            block.invoke();
        }
    }
}
