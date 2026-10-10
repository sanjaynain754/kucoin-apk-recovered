package com.kubi.futures.settings;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27025c;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.HashMap;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p663uh.InterfaceC45238b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.settings.j */
/* JADX INFO: compiled from: ContractNoticeFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b\u001a\u0006\u0010\r\u001a\u00020\u000e\u001a\u0006\u0010\u000f\u001a\u00020\u000e\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"fetchNoticePreferences", "", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "time", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", C33864ph.f71456b, "Lkotlin/Function0;", "trackTradingNoticeSettings", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "isOrderPriceDeepBookEnable", "", "isAutoDepositMarginHintEnable", "LIQUIDATION", "STOP_TRIGGER", "AUTO_CLOSE", "PFL", "ORDER_CANCELLED", "APPEND_MARGIN", "DEPOSIT", "FFL", "OPTIONAL", "MARKET", "LIMIT", "AUTO_APPEND_MARGIN", "MISOPERATION", "LIMIT_CLOSE", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C13392j {
    /* JADX INFO: renamed from: f */
    public static final void m26319f(@NotNull final BaseFragment baseFragment, @NotNull final String time, @Nullable final Function1<? super TradingNoticeEntity, Unit> function1, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        Intrinsics.checkNotNullParameter(time, "time");
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.settings.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13392j.m26321h(time);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.settings.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C13392j.m26322i(function1, (TradingNoticeEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.settings.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C13392j.m26323j(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.settings.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C13392j.m26324k(function0, baseFragment, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.settings.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C13392j.m26325l(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, baseFragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m26320g(BaseFragment baseFragment, String str, Function1 function1, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "300000";
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        m26319f(baseFragment, str, function1, function0);
    }

    /* JADX INFO: renamed from: h */
    public static final TradingNoticeEntity m26321h(String str) throws Throwable {
        TradingNoticeEntity tradingNoticeEntityMo99978u = RepositoryServiceLocator.f19236a.m20290i().mo99978u(str);
        return tradingNoticeEntityMo99978u == null ? new TradingNoticeEntity(null, null, 3, null) : tradingNoticeEntityMo99978u;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m26322i(Function1 function1, TradingNoticeEntity tradingNoticeEntity) {
        InterfaceC45238b interfaceC45238bM20290i = RepositoryServiceLocator.f19236a.m20290i();
        Intrinsics.checkNotNull(tradingNoticeEntity);
        interfaceC45238bM20290i.mo99982c(tradingNoticeEntity);
        if (function1 != null) {
            function1.invoke(tradingNoticeEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m26324k(Function0 function0, BaseFragment baseFragment, Throwable th2) {
        if (function0 != null) {
            function0.invoke();
        } else {
            C17058m0.m36550e(baseFragment, th2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m26326m() {
        HashMap<String, Boolean> confirmConfig = RepositoryServiceLocator.f19236a.m20290i().mo99985g().getConfirmConfig();
        return C27025c.m66567e(confirmConfig != null ? confirmConfig.get("AUTO_APPEND_MARGIN") : null, true);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m26327n() {
        HashMap<String, Boolean> confirmConfig = RepositoryServiceLocator.f19236a.m20290i().mo99985g().getConfirmConfig();
        return C27025c.m66567e(confirmConfig != null ? confirmConfig.get("MISOPERATION") : null, true);
    }

    /* JADX INFO: renamed from: o */
    public static final void m26328o(@NotNull TradingNoticeEntity entity) throws JSONException {
        Intrinsics.checkNotNullParameter(entity, "entity");
        JSONObject jSONObject = new JSONObject();
        HashMap<String, Boolean> confirmConfig = entity.getConfirmConfig();
        jSONObject.put("limitNotiStatus", C27025c.m66566d(confirmConfig != null ? confirmConfig.get("LIMIT") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> confirmConfig2 = entity.getConfirmConfig();
        jSONObject.put("marketNotiStatus", C27025c.m66566d(confirmConfig2 != null ? confirmConfig2.get("MARKET") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> confirmConfig3 = entity.getConfirmConfig();
        jSONObject.put("stopNotiStatus", C27025c.m66566d(confirmConfig3 != null ? confirmConfig3.get("OPTIONAL") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> confirmConfig4 = entity.getConfirmConfig();
        jSONObject.put("deepOBNotiStatus", C27025c.m66566d(confirmConfig4 != null ? confirmConfig4.get("MISOPERATION") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> confirmConfig5 = entity.getConfirmConfig();
        jSONObject.put("mpSpreadNotiStatus", C27025c.m66566d(confirmConfig5 != null ? confirmConfig5.get("LIMIT_CLOSE") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> confirmConfig6 = entity.getConfirmConfig();
        jSONObject.put("autoAddMarginPupsStatus", C27025c.m66566d(confirmConfig6 != null ? confirmConfig6.get("AUTO_APPEND_MARGIN") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> webNoticeConfig = entity.getWebNoticeConfig();
        jSONObject.put("partDealNotiStatus", C27025c.m66566d(webNoticeConfig != null ? webNoticeConfig.get("PFL") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> webNoticeConfig2 = entity.getWebNoticeConfig();
        jSONObject.put("allDealNotiStatus", C27025c.m66566d(webNoticeConfig2 != null ? webNoticeConfig2.get("FFL") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> webNoticeConfig3 = entity.getWebNoticeConfig();
        jSONObject.put("stopTriggerNotiStatus", C27025c.m66566d(webNoticeConfig3 != null ? webNoticeConfig3.get("STOP_TRIGGER") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> webNoticeConfig4 = entity.getWebNoticeConfig();
        jSONObject.put("liquidNotiStatus", C27025c.m66566d(webNoticeConfig4 != null ? webNoticeConfig4.get("LIQUIDATION") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> webNoticeConfig5 = entity.getWebNoticeConfig();
        jSONObject.put("adlNotiStatus", C27025c.m66566d(webNoticeConfig5 != null ? webNoticeConfig5.get("AUTO_CLOSE") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> webNoticeConfig6 = entity.getWebNoticeConfig();
        jSONObject.put("transferInNotiStatus", C27025c.m66566d(webNoticeConfig6 != null ? webNoticeConfig6.get("DEPOSIT") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        HashMap<String, Boolean> webNoticeConfig7 = entity.getWebNoticeConfig();
        jSONObject.put("autoAddMarginNotiStatus", C27025c.m66566d(webNoticeConfig7 != null ? webNoticeConfig7.get("APPEND_MARGIN") : null) ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close");
        C43852m.m96605q("notification_status", jSONObject);
    }

    /* JADX INFO: renamed from: j */
    public static final void m26323j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static final void m26325l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
