package com.kubi.quotefacade.tradechance.utils;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import p294gz.C38057a;
import p321hv.InterfaceC38359i;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.utils.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeChanceRemoteConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\f\u0010\n\u001a\u00020\u0005*\u00020\u000bH\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/utils/TradeChanceRemoteConfig;", "", "<init>", "()V", "enablePlate", "", "enableGemBox", "enableMarketChange", "enableWhale", "enableHotRank", "isBizControlOpen", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeChanceRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeChanceRemoteConfig.kt\ncom/kubi/quotefacade/tradechance/utils/TradeChanceRemoteConfig\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,53:1\n17#2,2:54\n17#2,2:56\n*S KotlinDebug\n*F\n+ 1 TradeChanceRemoteConfig.kt\ncom/kubi/quotefacade/tradechance/utils/TradeChanceRemoteConfig\n*L\n28#1:54,2\n36#1:56,2\n*E\n"})
public final class TradeChanceRemoteConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeChanceRemoteConfig f42699a = new TradeChanceRemoteConfig();

    /* JADX INFO: renamed from: a */
    public final boolean m53251a() {
        return m53255e(4);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m53253c() {
        return m53255e(0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m53252b() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38359i.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h != null ? ((InterfaceC38359i) objM56186h).mo86556b() : false) && m53255e(2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m53254d() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38359i.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h != null ? ((InterfaceC38359i) objM56186h).mo86555a() : false) && m53255e(3);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m53255e(int i11) {
        return C38057a.f85671a.m85928a(C43852m.m96601m("B5TradeChance", "Tab", String.valueOf(i11)), true);
    }
}
