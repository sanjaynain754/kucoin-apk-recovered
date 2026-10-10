package com.kubi.widget.web.jsbridge.handlers;

import com.google.gson.internal.LinkedTreeMap;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.web.jsapi.JsBridgeEvent;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.exception.KWebWidgetMessage;
import com.kubi.widget.web.jsbridge.api.IWebApi;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: JsCommonProxyHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lorg/json/JSONObject;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.jsbridge.handlers.JsCommonProxyHandler$proxyPost$2", m90122f = "JsCommonProxyHandler.kt", m90123i = {}, m90124l = {105}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nJsCommonProxyHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsCommonProxyHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$proxyPost$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n*L\n1#1,129:1\n216#2,2:130\n54#3,2:132\n46#3,6:134\n*S KotlinDebug\n*F\n+ 1 JsCommonProxyHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/JsCommonProxyHandler$proxyPost$2\n*L\n109#1:130,2\n113#1:132,2\n122#1:134,6\n*E\n"})
public final class JsCommonProxyHandler$proxyPost$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super JSONObject>, Object> {
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ JsCommonProxyHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsCommonProxyHandler$proxyPost$2(String str, Map<String, ? extends Object> map, JsCommonProxyHandler jsCommonProxyHandler, Continuation<? super JsCommonProxyHandler$proxyPost$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$params = map;
        this.this$0 = jsCommonProxyHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JsCommonProxyHandler$proxyPost$2(this.$url, this.$params, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super JSONObject> continuation) {
        return ((JsCommonProxyHandler$proxyPost$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objProxyPost;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                IWebApi iWebApiM67337a = JsCommonProxyHandler.f55211b.m67337a();
                String str = this.$url;
                Map<String, Object> map = this.$params;
                this.label = 1;
                objProxyPost = iWebApiM67337a.proxyPost(str, map, this);
                if (objProxyPost == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objProxyPost = obj;
            }
            if (!(objProxyPost instanceof LinkedTreeMap)) {
                JsCommonProxyHandler.m67333k(this.this$0, this.$url, "post", false, null, 8, null);
                C43846g.m96568c(new KWebWidgetMessage("proxyPost return empty", "HybridProxyHandler", false, 4, null), null, 2, null);
                return JsBridgeEvent.Companion.jsonOrEmpty$default(JsBridgeEvent.INSTANCE, null, -1, null, false, 13, null);
            }
            JsCommonProxyHandler.m67333k(this.this$0, this.$url, "post", true, null, 8, null);
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) objProxyPost).entrySet()) {
                Object key = entry.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                jSONObject.put((String) key, entry.getValue());
            }
            return jSONObject;
        } catch (Throwable th2) {
            this.this$0.m67336j(this.$url, "post", false, th2);
            C19331c.m42836c(th2, null, 2, null);
            if (C42899b.m94075e(th2)) {
                C44128b.m97264h(th2);
            } else {
                C43846g.m96568c(new KWebWidgetException(th2, "proxyPost error", false, null, 8, null), null, 2, null);
            }
            return JsBridgeEvent.Companion.jsonOrEmpty$default(JsBridgeEvent.INSTANCE, null, -1, null, false, 13, null);
        }
    }
}
