package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.platform.model.TradingNoticeParamsEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.settings.vm.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradingConfirmAgainViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/settings/vm/TradingConfirmAgainViewModel;", "Landroidx/lifecycle/ViewModel;", "featureType", "", "<init>", "(Ljava/lang/String;)V", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "requesting", "", "submitCallback", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "getSubmitCallback", "()Landroidx/lifecycle/MutableLiveData;", "submitTradingNotice", "", "type", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "doSubmitData", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/platform/model/TradingNoticeParamsEntity;", "settings", "trackClick", "isChecked", "getLocationId", "onCleared", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingConfirmAgainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingConfirmAgainViewModel.kt\ncom/kubi/futures/settings/vm/TradingConfirmAgainViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,180:1\n216#2,2:181\n216#2,2:183\n216#2,2:185\n216#2,2:187\n216#2,2:189\n*S KotlinDebug\n*F\n+ 1 TradingConfirmAgainViewModel.kt\ncom/kubi/futures/settings/vm/TradingConfirmAgainViewModel\n*L\n62#1:181,2\n78#1:183,2\n83#1:185,2\n113#1:187,2\n117#1:189,2\n*E\n"})
public final class TradingConfirmAgainViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f23539V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CompositeDisposable f23540W;

    /* JADX INFO: renamed from: X */
    public boolean f23541X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<TradingNoticeEntity> f23542Y;

    /* JADX INFO: renamed from: j */
    public static final void m26470j(TradingConfirmAgainViewModel tradingConfirmAgainViewModel, TradingNoticeParamsEntity tradingNoticeParamsEntity, TradingNoticeEntity tradingNoticeEntity, Object obj) {
        tradingConfirmAgainViewModel.f23541X = false;
        if (Intrinsics.areEqual(tradingNoticeParamsEntity.getType(), "CONFIRM_CONFIG")) {
            HashMap<String, Boolean> confirmConfig = tradingNoticeEntity.getConfirmConfig();
            if (confirmConfig != null) {
                for (Map.Entry<String, Boolean> entry : confirmConfig.entrySet()) {
                    HashMap<String, Boolean> confirmConfig2 = tradingNoticeEntity.getConfirmConfig();
                    if (confirmConfig2 != null) {
                        confirmConfig2.put(entry.getKey(), Boolean.valueOf(tradingNoticeParamsEntity.getConfigs().contains(entry.getKey())));
                    }
                }
            }
        } else {
            HashMap<String, Boolean> webNoticeConfig = tradingNoticeEntity.getWebNoticeConfig();
            if (webNoticeConfig != null) {
                for (Map.Entry<String, Boolean> entry2 : webNoticeConfig.entrySet()) {
                    HashMap<String, Boolean> webNoticeConfig2 = tradingNoticeEntity.getWebNoticeConfig();
                    if (webNoticeConfig2 != null) {
                        webNoticeConfig2.put(entry2.getKey(), Boolean.valueOf(tradingNoticeParamsEntity.getConfigs().contains(entry2.getKey())));
                    }
                }
            }
        }
        RepositoryServiceLocator.f19236a.m20290i().mo99982c(tradingNoticeEntity);
        tradingConfirmAgainViewModel.f23542Y.setValue(tradingNoticeEntity);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m26471k(TradingConfirmAgainViewModel tradingConfirmAgainViewModel, Throwable th2) {
        tradingConfirmAgainViewModel.f23541X = false;
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    public TradingConfirmAgainViewModel(@NotNull String featureType) {
        Intrinsics.checkNotNullParameter(featureType, "featureType");
        this.f23539V = featureType;
        this.f23540W = new CompositeDisposable();
        this.f23542Y = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: i */
    public static final Object m26469i(TradingNoticeParamsEntity tradingNoticeParamsEntity) throws Throwable {
        Object objMo99976l = RepositoryServiceLocator.f19236a.m20290i().mo99976l(tradingNoticeParamsEntity);
        return objMo99976l == null ? new Object() : objMo99976l;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m26472q(TradingConfirmAgainViewModel tradingConfirmAgainViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = TtmlNode.COMBINE_ALL;
        }
        tradingConfirmAgainViewModel.m26476p(str, z11);
    }

    /* JADX INFO: renamed from: g */
    public final void m26473g(final TradingNoticeParamsEntity tradingNoticeParamsEntity, final TradingNoticeEntity tradingNoticeEntity) {
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.futures.settings.vm.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingConfirmAgainViewModel.m26469i(tradingNoticeParamsEntity);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.settings.vm.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradingConfirmAgainViewModel.m26470j(this.f23532b, tradingNoticeParamsEntity, tradingNoticeEntity, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingConfirmAgainViewModel.m26471k(this.f23537b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.settings.vm.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradingConfirmAgainViewModel.m26468h(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f23540W);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final MutableLiveData<TradingNoticeEntity> m26475o() {
        return this.f23542Y;
    }

    /* JADX INFO: renamed from: p */
    public final void m26476p(@NotNull String type, boolean z11) {
        HashMap<String, Boolean> webNoticeConfig;
        HashMap<String, Boolean> webNoticeConfig2;
        HashMap<String, Boolean> confirmConfig;
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f23541X) {
            return;
        }
        this.f23541X = true;
        m26477r(type, z11);
        TradingNoticeEntity tradingNoticeEntityMo99985g = RepositoryServiceLocator.f19236a.m20290i().mo99985g();
        HashMap<String, Boolean> confirmConfig2 = tradingNoticeEntityMo99985g.getConfirmConfig();
        boolean zM66566d = C27025c.m66566d(confirmConfig2 != null ? Boolean.valueOf(confirmConfig2.containsKey(type)) : null);
        HashMap<String, Boolean> webNoticeConfig3 = tradingNoticeEntityMo99985g.getWebNoticeConfig();
        boolean zM66566d2 = C27025c.m66566d(webNoticeConfig3 != null ? Boolean.valueOf(webNoticeConfig3.containsKey(type)) : null);
        if (zM66566d || zM66566d2) {
            TradingNoticeParamsEntity tradingNoticeParamsEntity = new TradingNoticeParamsEntity();
            tradingNoticeParamsEntity.setType(zM66566d ? "CONFIRM_CONFIG" : "WEB_NOTICE_CONFIG");
            if (zM66566d) {
                tradingNoticeParamsEntity.setType("CONFIRM_CONFIG");
                webNoticeConfig = tradingNoticeEntityMo99985g.getConfirmConfig();
            } else {
                tradingNoticeParamsEntity.setType("WEB_NOTICE_CONFIG");
                webNoticeConfig = tradingNoticeEntityMo99985g.getWebNoticeConfig();
            }
            if (webNoticeConfig != null) {
                for (Map.Entry<String, Boolean> entry : webNoticeConfig.entrySet()) {
                    if (Intrinsics.areEqual(entry.getKey(), type) && z11 && !C27025c.m66566d(entry.getValue())) {
                        tradingNoticeParamsEntity.getConfigs().add(entry.getKey());
                    }
                    if (!Intrinsics.areEqual(entry.getKey(), type) && C27025c.m66566d(entry.getValue())) {
                        tradingNoticeParamsEntity.getConfigs().add(entry.getKey());
                    }
                }
            }
            m26473g(tradingNoticeParamsEntity, tradingNoticeEntityMo99985g);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z11) {
            if (Intrinsics.areEqual(this.f23539V, "confirm-again") && (confirmConfig = tradingNoticeEntityMo99985g.getConfirmConfig()) != null) {
                Iterator<Map.Entry<String, Boolean>> it = confirmConfig.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getKey());
                }
            }
            if (Intrinsics.areEqual(this.f23539V, "notification") && (webNoticeConfig2 = tradingNoticeEntityMo99985g.getWebNoticeConfig()) != null) {
                Iterator<Map.Entry<String, Boolean>> it2 = webNoticeConfig2.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getKey());
                }
            }
        }
        if (Intrinsics.areEqual(this.f23539V, "confirm-again")) {
            TradingNoticeParamsEntity tradingNoticeParamsEntity2 = new TradingNoticeParamsEntity();
            tradingNoticeParamsEntity2.setType("CONFIRM_CONFIG");
            tradingNoticeParamsEntity2.setConfigs(arrayList);
            m26473g(tradingNoticeParamsEntity2, tradingNoticeEntityMo99985g);
            return;
        }
        TradingNoticeParamsEntity tradingNoticeParamsEntity3 = new TradingNoticeParamsEntity();
        tradingNoticeParamsEntity3.setType("WEB_NOTICE_CONFIG");
        tradingNoticeParamsEntity3.setConfigs(arrayList2);
        m26473g(tradingNoticeParamsEntity3, tradingNoticeEntityMo99985g);
    }

    /* JADX INFO: renamed from: r */
    public final void m26477r(String str, boolean z11) {
        String str2 = Intrinsics.areEqual(this.f23539V, "notification") ? "MorePreferencesNotifications" : "MorePreferencesSecondaryConfirmaiton";
        String strM26474n = m26474n(str);
        if (strM26474n != null) {
            C43852m.m96590b(C17060n0.m36552b(), str2, strM26474n, TuplesKt.m90091to("status", z11 ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close"));
        } else {
            C43852m.m96590b(C17060n0.m36552b(), str2, z11 ? "1" : "2", TuplesKt.m90091to("status", z11 ? TtmlNode.TEXT_EMPHASIS_MARK_OPEN : "close"));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m26468h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public final String m26474n(String str) {
        switch (str) {
            case "AUTO_APPEND_MARGIN":
                return "8";
            case "MARKET":
                return "4";
            case "DEPOSIT":
                return "10";
            case "STOP_TRIGGER":
                return "5";
            case "LIQUIDATION":
                return TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO;
            case "FFL":
                return "4";
            case "PFL":
                return "3";
            case "MISOPERATION":
                return "6";
            case "LIMIT":
                return "3";
            case "LIMIT_CLOSE":
                return TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO;
            case "OPTIONAL":
                return "5";
            case "APPEND_MARGIN":
                return "8";
            case "AUTO_CLOSE":
                return "9";
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f23540W.clear();
    }
}
