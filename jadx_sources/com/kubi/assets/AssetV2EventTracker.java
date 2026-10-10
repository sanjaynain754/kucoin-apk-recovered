package com.kubi.assets;

import android.os.Bundle;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.mvi.common.MviExKt;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.assets.l0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetV2EventTracker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u001c\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u001c\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u0005*\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J+\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0002\b\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u0005*\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0002¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/AssetV2EventTracker;", "", "<init>", "()V", "trackStep1", "", "subOverLimit", "", "throwable", "", "trackStep2", "trackStep3", "trackApiError", "apiPath", "", "trackCoinConfigMissing", FirebaseAnalytics.Param.CURRENCY, "trackError", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "track", "openLog", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "printLog", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2EventTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2EventTracker.kt\ncom/kubi/assets/AssetV2EventTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n2756#2:136\n1#3:137\n*S KotlinDebug\n*F\n+ 1 AssetV2EventTracker.kt\ncom/kubi/assets/AssetV2EventTracker\n*L\n124#1:136\n124#1:137\n*E\n"})
public final class AssetV2EventTracker {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetV2EventTracker f17857a = new AssetV2EventTracker();

    /* JADX INFO: renamed from: e */
    public static final Unit m17547e(TechnologyEvent.EventParametersBuilder eventParametersBuilder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Bundle first = eventParametersBuilder.m42390a().getFirst();
        for (String str : first.keySet()) {
            if (!Intrinsics.areEqual(str, "app_is_foreground")) {
                jSONObject.put(str, first.get(str));
            }
        }
        C44128b.m97259c("mvi_event_tracker", jSONObject.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m17548g(AssetV2EventTracker assetV2EventTracker, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        assetV2EventTracker.m17554f(z11, function1);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m17549l(AssetV2EventTracker assetV2EventTracker, boolean z11, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        assetV2EventTracker.m17558k(z11, th2);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17550m(boolean z11, Throwable th2, TechnologyEvent.EventParametersBuilder track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.m42393d("type", "step1");
        track.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, z11 ? "1" : "0");
        f17857a.m17557j(track, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m17551o(AssetV2EventTracker assetV2EventTracker, boolean z11, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        assetV2EventTracker.m17559n(z11, th2);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m17552p(boolean z11, Throwable th2, TechnologyEvent.EventParametersBuilder track) {
        Intrinsics.checkNotNullParameter(track, "$this$track");
        track.m42393d("type", "step3");
        track.m42393d(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, z11 ? "1" : "0");
        f17857a.m17557j(track, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m17553d(final TechnologyEvent.EventParametersBuilder eventParametersBuilder, boolean z11) {
        MviExKt.m42509e(z11, new Function0() { // from class: com.kubi.assets.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2EventTracker.m17547e(eventParametersBuilder);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m17554f(boolean z11, Function1<? super TechnologyEvent.EventParametersBuilder, Unit> function1) {
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("category", "TotalBalance");
        function1.invoke(eventParametersBuilderAcquire);
        TechnologyEvent.m42388d("technology_event", eventParametersBuilderAcquire);
        f17857a.m17553d(eventParametersBuilderAcquire, z11);
    }

    /* JADX INFO: renamed from: h */
    public final void m17555h(@NotNull String apiPath, @Nullable Throwable th2) throws JSONException {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        JSONObject jSONObject = new JSONObject();
        String strB = com.kubi.user.api.p.b(th2);
        if (strB == null) {
            strB = "-200";
        }
        jSONObject.put("code", strB);
        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, C27041f.m66668h(th2 != null ? th2.getMessage() : null));
        jSONObject.put("url", apiPath);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("asset_api_request", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "1", jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public final void m17556i(@NotNull String currency) throws JSONException {
        Intrinsics.checkNotNullParameter(currency, "currency");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "-300");
        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "coin config not found for currency: " + currency);
        jSONObject.put("url", "local/coin-config-missing");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("asset_api_request", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "1", jSONObject);
    }

    /* JADX INFO: renamed from: j */
    public final void m17557j(TechnologyEvent.EventParametersBuilder eventParametersBuilder, Throwable th2) {
        if (th2 == null) {
            eventParametersBuilder.m42393d("code", "200");
            return;
        }
        eventParametersBuilder.m42393d("error_message", C27041f.m66668h(th2.getMessage()));
        if (!(th2 instanceof ApiException)) {
            eventParametersBuilder.m42393d("code", "-200");
            return;
        }
        String code = ((ApiException) th2).code;
        Intrinsics.checkNotNullExpressionValue(code, "code");
        eventParametersBuilder.m42393d("code", code);
    }

    /* JADX INFO: renamed from: k */
    public final void m17558k(final boolean z11, @Nullable final Throwable th2) {
        m17548g(this, false, new Function1() { // from class: com.kubi.assets.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2EventTracker.m17550m(z11, th2, (TechnologyEvent.EventParametersBuilder) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m17559n(final boolean z11, @Nullable final Throwable th2) {
        m17548g(this, false, new Function1() { // from class: com.kubi.assets.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2EventTracker.m17552p(z11, th2, (TechnologyEvent.EventParametersBuilder) obj);
            }
        }, 1, null);
    }
}
