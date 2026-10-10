package com.kubi.unify;

import com.kubi.host.HostManager;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.unify.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifyConstant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u000e\u0010\u001d\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/unify/UnifyConstant;", "", "<init>", "()V", "UNIFIED_SITE_VISIBLE_CONFIG_KEY", "Lcom/kubi/sdk/site/SiteVisibleConfigKey;", "getUNIFIED_SITE_VISIBLE_CONFIG_KEY", "()Lcom/kubi/sdk/site/SiteVisibleConfigKey;", "KV_NAMESPACE", "", "LOG_TAG", "CLIENT_UNIFIED", "UNIFY_TERM_OF_USE", "getUNIFY_TERM_OF_USE", "()Ljava/lang/String;", "UNIFY_VIP_LEVEL", "getUNIFY_VIP_LEVEL", "UNIFY_ACCOUNT_RISK_MORE_URL", "getUNIFY_ACCOUNT_RISK_MORE_URL", "UNIFY_DEBT_URL", "getUNIFY_DEBT_URL", "UNIFY_MAINT_MARGIN_URL", "getUNIFY_MAINT_MARGIN_URL", "UNIFY_HOLD_MARGIN_URL", "getUNIFY_HOLD_MARGIN_URL", "UNIFY_USEFUL_MARGIN_URL", "getUNIFY_USEFUL_MARGIN_URL", "UNIFY_ADJUSTED_EQUITY_URL", "getUNIFY_ADJUSTED_EQUITY_URL", "OPEN_CHECK_FAILED_CODE", "NOT_EXAM_CODE", "UNIFIED_SPOT_TRADING_PAGE_ID", "UNIFIED_FUTURES_TRADING_PAGE_ID", "UNIFIED_PAGE_ID", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifyConstant {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifyConstant f53295a = new UnifyConstant();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final SiteVisibleConfigKey f53296b = SiteVisibleConfigKey.UNIFIED;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f53297c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f53298d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f53299e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f53300f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final String f53301g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final String f53302h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final String f53303i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final String f53304j;

    static {
        StringBuilder sb2 = new StringBuilder();
        HostManager hostManager = HostManager.a;
        sb2.append(hostManager.q());
        sb2.append("/48142946141363?appNeedLang=true");
        f53297c = sb2.toString();
        f53298d = hostManager.m() + "/vip/privilege?appNeedLang=true";
        f53299e = hostManager.q() + "/48142946141358?appNeedLang=true";
        f53300f = hostManager.q() + "/48142946141360?appNeedLang=true";
        f53301g = hostManager.q() + "/48142946141358?appNeedLang=true";
        f53302h = hostManager.q() + "/48142946141358?appNeedLang=true";
        f53303i = hostManager.q() + "/48142946141358?appNeedLang=true";
        f53304j = hostManager.q() + "/48142946141358?appNeedLang=true";
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SiteVisibleConfigKey m65222a() {
        return f53296b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m65223b() {
        return f53299e;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m65224c() {
        return f53304j;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m65225d() {
        return f53300f;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m65226e() {
        return f53302h;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m65227f() {
        return f53301g;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m65228g() {
        return f53297c;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m65229h() {
        return f53303i;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m65230i() {
        return f53298d;
    }
}
