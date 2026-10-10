package com.kubi.core.biz.callauction;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.utils.extensions.C27025c;
import gf.C37890n;
import io.reactivex.subjects.PublishSubject;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.core.biz.callauction.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CallAuctionSwitch.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\b\u0010\u0019\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u000b¨\u0006 "}, m90084d2 = {"Lcom/kubi/core/biz/callauction/CallAuctionSwitch;", "", "<init>", "()V", "subject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "symbol", "", "isThirdStopTrade", "()Z", "setThirdStopTrade", "(Z)V", "symbolInCallAuction", "getSymbolInCallAuction", "setSymbolInCallAuction", "getSymbolCallAuctionObs", "inCallAuctionState", "isMargin", "auction", "getAuction", "auction$delegate", "Lkotlin/Lazy;", "callAuctionRemoteConfig", "getCurrentSymbol", "changeAuction", "", "isSymbolCallAuction", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "useCache", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionSwitch.kt\ncom/kubi/core/biz/callauction/CallAuctionSwitch\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,67:1\n35#2,4:68\n39#2:74\n44#3,2:72\n*S KotlinDebug\n*F\n+ 1 CallAuctionSwitch.kt\ncom/kubi/core/biz/callauction/CallAuctionSwitch\n*L\n33#1:68,4\n33#1:74\n33#1:72,2\n*E\n"})
public final class CallAuctionSwitch {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CallAuctionSwitch f20317a = new CallAuctionSwitch();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final PublishSubject<Boolean> f20318b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static String f20319c;

    /* JADX INFO: renamed from: d */
    public static boolean f20320d;

    /* JADX INFO: renamed from: e */
    public static boolean f20321e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy f20322f;

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.j$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: j */
    public final boolean m21643j(@Nullable TradeItemBean tradeItemBean, boolean z11) {
        if (tradeItemBean == null) {
            return false;
        }
        return m21637c() && (z11 ? C27025c.m66566d(tradeItemBean.getSymbolInfoEntity().getEnableAuctionTrade()) : C27025c.m66566d(Boolean.valueOf(tradeItemBean.isEnableAuctionTrade())));
    }

    static {
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        f20318b = publishSubjectCreate;
        f20320d = true;
        f20322f = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.callauction.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CallAuctionSwitch.m21635b());
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m21635b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_call_auction_visible", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return Intrinsics.areEqual(objM20457a, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m21636i(CallAuctionSwitch callAuctionSwitch, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return callAuctionSwitch.m21642h(z11);
    }

    /* JADX INFO: renamed from: d */
    public final void m21638d(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        f20319c = symbol;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(symbol);
        boolean z11 = false;
        if (symbolInfoEntityM85601B != null && f20317a.m21637c() && C27025c.m66566d(symbolInfoEntityM85601B.getEnableAuctionTrade())) {
            z11 = true;
        }
        f20321e = z11;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21639e() {
        return ((Boolean) f20322f.getValue()).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m21640f() {
        return f20319c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final PublishSubject<Boolean> m21641g() {
        return f20318b;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21644k() {
        return f20320d;
    }

    /* JADX INFO: renamed from: l */
    public final void m21645l(boolean z11) {
        f20320d = z11;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21637c() {
        return m21639e();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m21642h(boolean z11) {
        if (m21637c() && f20321e && !z11) {
            return true;
        }
        return false;
    }
}
