package com.kubi.spot;

import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BSpotApp.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/spot/BSpotApp;", "", "<init>", "()V", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BSpotApp {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49558a = new Companion(null);

    /* JADX INFO: compiled from: BSpotApp.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/spot/BSpotApp$Companion;", "", "<init>", "()V", "TYPE_SPOT", "", "TYPE_ALPHA", "DISMISS_USER_KYC_ERROR", "", "CLEAR_OUT_GUIDE_ERROR", "ADVANCED_CLEAR_OUT_GUIDE_ERROR", "SPOT_COUPONS", "jumpToH5", "", "path", "parameter", "needLogin", "", "getPlusString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void jumpToH5$default(Companion companion, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            companion.jumpToH5(str, str2, z11);
        }

        @NotNull
        public final String getPlusString(@NotNull String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            return StringsKt.contains$default((CharSequence) path, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?";
        }

        public final void jumpToH5(@NotNull String path, @NotNull String parameter, boolean needLogin) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            String plusString = getPlusString(path);
            InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + path + plusString + "redirect=false&loading=2&needLogin=" + needLogin + "&lang=" + MultiLanguageManager.f46811g.getLocale() + parameter, null, null, null, null, null, null, 126, null);
        }
    }
}
