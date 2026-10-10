package com.kubi.assets;

import com.kubi.host.HostManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.assets.b1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UrlConstant.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/UrlConstant;", "", "<init>", "()V", "BASE_H5_URL", "", "DEPOSIT_FAQ_URL", "getDEPOSIT_FAQ_URL", "()Ljava/lang/String;", "WITHDRAW_FAQ_URL", "getWITHDRAW_FAQ_URL", "DEPOSIT_ROLLBACK_FAQ_URL", "getDEPOSIT_ROLLBACK_FAQ_URL", "LIGHTNING_NETWORK_URL", "getLIGHTNING_NETWORK_URL", "MARGIN_PNL_PAGE_CROSS", "getMARGIN_PNL_PAGE_CROSS", "MARGIN_PNL_PAGE_ISOLATED", "getMARGIN_PNL_PAGE_ISOLATED", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UrlConstant {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UrlConstant f16608a = new UrlConstant();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f16609b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f16610c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f16611d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f16612e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f16613f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final String f16614g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final String f16615h;

    static {
        HostManager hostManager = HostManager.a;
        String strM = hostManager.m();
        f16609b = strM;
        f16610c = strM + "/support/categories/900000380926?appNeedLang=true&loading=2";
        f16611d = strM + "/support/categories/900000380926?appNeedLang=true&loading=2";
        f16612e = strM + "/assets/faq?appNeedLang=true&loading=2";
        f16613f = hostManager.q() + "/29373566804377?appNeedLang=true";
        f16614g = strM + "/margin-analysis/cross?appNeedLang=true&loading=2";
        f16615h = strM + "/margin-analysis/isolated?appNeedLang=true&loading=2";
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m15458a() {
        return f16610c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m15459b() {
        return f16612e;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m15460c() {
        return f16613f;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m15461d() {
        return f16614g;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m15462e() {
        return f16615h;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m15463f() {
        return f16611d;
    }
}
