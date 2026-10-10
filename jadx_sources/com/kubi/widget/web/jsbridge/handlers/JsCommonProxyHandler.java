package com.kubi.widget.web.jsbridge.handlers;

import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.jsapi.InterfaceC24316a;
import com.kubi.sdk.web.jsapi.InterfaceC24317b;
import com.kubi.sdk.web.jsapi.JsBridgeEvent;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.widget.web.jsbridge.api.IWebApi;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: JsCommonProxyHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0002\u0010\u0017J*\u0010\u0018\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\u0015H\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler;", "Lcom/kubi/sdk/web/jsapi/JsBridgeEventHandler;", "activity", "Lcom/kubi/sdk/BaseActivity;", "<init>", "(Lcom/kubi/sdk/BaseActivity;)V", "handleEvent", "", "event", "Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "track", "", "url", "", "type", "success", "e", "", "proxyGet", "Lorg/json/JSONObject;", ReportDataTable.COLUMN_PARAMS, "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proxyPost", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsCommonProxyHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsCommonProxyHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler\n+ 2 JsBridgeEventEx.kt\ncom/kubi/widget/web/jsbridge/handlers/JsBridgeEventExKt\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,129:1\n5#2:130\n5#2:131\n71#3,4:132\n*S KotlinDebug\n*F\n+ 1 JsCommonProxyHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler\n*L\n45#1:130\n46#1:131\n66#1:132,4\n*E\n"})
public final class JsCommonProxyHandler implements InterfaceC24317b {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f55211b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<IWebApi> f55212c = LazyKt.lazy(new Function0() { // from class: com.kubi.widget.web.jsbridge.handlers.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JsCommonProxyHandler.m67332g();
        }
    });

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseActivity f55213a;

    /* JADX INFO: compiled from: JsCommonProxyHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$Companion;", "", "<init>", "()V", "PROXY_GET", "", "PROXY_POST", "api", "Lcom/kubi/widget/web/jsbridge/api/IWebApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/widget/web/jsbridge/api/IWebApi;", "api$delegate", "Lkotlin/Lazy;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final IWebApi m67337a() {
            return (IWebApi) JsCommonProxyHandler.f55212c.getValue();
        }
    }

    public JsCommonProxyHandler(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f55213a = activity;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m67333k(JsCommonProxyHandler jsCommonProxyHandler, String str, String str2, boolean z11, Throwable th2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            th2 = null;
        }
        jsCommonProxyHandler.m67336j(str, str2, z11, th2);
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24317b
    /* JADX INFO: renamed from: a */
    public boolean mo58765a(@NotNull JsBridgeEvent event) {
        InterfaceC24316a interfaceC24316a;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.areEqual(event.getType(), "proxy") || (interfaceC24316a = event.getCom.tencent.qcloud.tuicore.TUIConstants.TUIChat.CALL_BACK java.lang.String()) == null) {
            return false;
        }
        Object obj = event.m58751f().get(FirebaseAnalytics.Param.METHOD);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return false;
        }
        Object obj2 = event.m58751f().get("url");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            return false;
        }
        C24329b.f48558a.m58864d("jsInoke", "url: " + str2 + ", method:" + str);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f55213a), C42911a.m94120b(), null, new JsCommonProxyHandler$handleEvent$1(str, this, str2, event, interfaceC24316a, null), 2, null);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m67336j(String str, String str2, boolean z11, Throwable th2) {
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("url", str);
        eventParametersBuilderAcquire.m42393d("type", str2);
        eventParametersBuilderAcquire.m42394e("success", z11);
        if (th2 instanceof ApiException) {
            String code = ((ApiException) th2).code;
            Intrinsics.checkNotNullExpressionValue(code, "code");
            eventParametersBuilderAcquire.m42393d("code", code);
        } else {
            eventParametersBuilderAcquire.m42391b("code", 200);
        }
        TechnologyEvent.m42388d("js_bridge_proxy", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: g */
    public static final IWebApi m67332g() {
        return (IWebApi) C42597a.m93386b().create(IWebApi.class);
    }

    /* JADX INFO: renamed from: h */
    public final Object m67334h(String str, Map<String, ? extends Object> map, Continuation<? super JSONObject> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new JsCommonProxyHandler$proxyGet$2(str, map, this, null), continuation);
    }

    /* JADX INFO: renamed from: i */
    public final Object m67335i(String str, Map<String, ? extends Object> map, Continuation<? super JSONObject> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new JsCommonProxyHandler$proxyPost$2(str, map, this, null), continuation);
    }
}
