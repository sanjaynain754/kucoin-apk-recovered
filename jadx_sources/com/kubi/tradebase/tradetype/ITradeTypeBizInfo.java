package com.kubi.tradebase.tradetype;

import android.view.View;
import com.kubi.host.HostManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46815o0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.tradebase.tradetype.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeTypeBizInfo.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "displayView", "Landroid/view/View;", "displayTitle", "", "tabChangeTrackEvent", "Lkotlin/Pair;", "", "moreJumpUrl", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nITradeTypeBizInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ITradeTypeBizInfo.kt\ncom/kubi/tradebase/tradetype/ITradeTypeBizInfo\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,72:1\n17#2,2:73\n*S KotlinDebug\n*F\n+ 1 ITradeTypeBizInfo.kt\ncom/kubi/tradebase/tradetype/ITradeTypeBizInfo\n*L\n65#1:73,2\n*E\n"})
public interface ITradeTypeBizInfo extends ITradeTypePlatform {
    @NotNull
    /* JADX INFO: renamed from: b */
    CharSequence mo63385b();

    @NotNull
    /* JADX INFO: renamed from: c */
    View mo63386c();

    @NotNull
    /* JADX INFO: renamed from: d */
    Pair<String, String> mo63387d();

    @NotNull
    /* JADX INFO: renamed from: h */
    default String m63388h() {
        boolean zMo102977a;
        if (mo63364f()) {
            return HostManager.a.m() + "/support/26686562304793?appNeedLang=true";
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zMo102977a = ((InterfaceC46815o0) objM56186h).mo102977a();
        } else {
            zMo102977a = false;
        }
        if (zMo102977a) {
            return HostManager.a.m() + "/en-eu/support/31880934641561?appNeedLang=true";
        }
        return HostManager.a.m() + "/support/31880934641561?appNeedLang=true";
    }
}
