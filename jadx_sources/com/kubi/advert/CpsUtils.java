package com.kubi.advert;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.advert.t, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CpsUtils.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/advert/CpsUtils;", "", "<init>", "()V", "TAG", "", "APP_INSTANCE_ID", "UTM_MEDIUM", "UTM_SOURCE", "UTM_CAMPAIGN", "AD_CLICK_ID", "getAppInstanceId", "setAppInstanceId", "", RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, "getUtmMedium", "setUtmMedium", "utmMedium", "getUtmSource", "setUtmSource", "utmSource", "getUtmCampaign", "setUtmCampaign", "utmCampaign", "getAdClickId", "setAdClickId", "clickId", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CpsUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CpsUtils f15167a = new CpsUtils();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f15168b = "";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f15169c = "";

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f15170d = "";

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f15171e = "";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static String f15172f = "";

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m14809a() {
        return f15172f;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m14810b() {
        return f15168b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m14811c() {
        return f15171e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m14812d() {
        return f15169c;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m14813e() {
        return f15170d;
    }

    /* JADX INFO: renamed from: f */
    public final void m14814f(@NotNull String clickId) {
        Intrinsics.checkNotNullParameter(clickId, "clickId");
        f15172f = clickId;
    }

    /* JADX INFO: renamed from: g */
    public final void m14815g(@NotNull String appInstanceId) {
        Intrinsics.checkNotNullParameter(appInstanceId, "appInstanceId");
        f15168b = appInstanceId;
    }

    /* JADX INFO: renamed from: h */
    public final void m14816h(@NotNull String utmCampaign) {
        Intrinsics.checkNotNullParameter(utmCampaign, "utmCampaign");
        f15171e = utmCampaign;
    }

    /* JADX INFO: renamed from: i */
    public final void m14817i(@NotNull String utmMedium) {
        Intrinsics.checkNotNullParameter(utmMedium, "utmMedium");
        f15169c = utmMedium;
    }

    /* JADX INFO: renamed from: j */
    public final void m14818j(@NotNull String utmSource) {
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        f15170d = utmSource;
    }
}
