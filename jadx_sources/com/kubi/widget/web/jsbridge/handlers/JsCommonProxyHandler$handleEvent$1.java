package com.kubi.widget.web.jsbridge.handlers;

import com.kubi.sdk.web.jsapi.InterfaceC24316a;
import com.kubi.sdk.web.jsapi.JsBridgeEvent;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsCommonProxyHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.jsbridge.handlers.JsCommonProxyHandler$handleEvent$1", m90122f = "JsCommonProxyHandler.kt", m90123i = {}, m90124l = {51, 56}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class JsCommonProxyHandler$handleEvent$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC24316a $callback;
    final /* synthetic */ JsBridgeEvent $event;
    final /* synthetic */ String $method;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ JsCommonProxyHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsCommonProxyHandler$handleEvent$1(String str, JsCommonProxyHandler jsCommonProxyHandler, String str2, JsBridgeEvent jsBridgeEvent, InterfaceC24316a interfaceC24316a, Continuation<? super JsCommonProxyHandler$handleEvent$1> continuation) {
        super(2, continuation);
        this.$method = str;
        this.this$0 = jsCommonProxyHandler;
        this.$url = str2;
        this.$event = jsBridgeEvent;
        this.$callback = interfaceC24316a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JsCommonProxyHandler$handleEvent$1(this.$method, this.this$0, this.$url, this.$event, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((JsCommonProxyHandler$handleEvent$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC24316a interfaceC24316a = this.$callback;
                    String string = ((JSONObject) obj).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    interfaceC24316a.mo58745a(string);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC24316a interfaceC24316a2 = this.$callback;
                String string2 = ((JSONObject) obj).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                interfaceC24316a2.mo58745a(string2);
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str = this.$method;
            if (Intrinsics.areEqual(str, "get")) {
                JsCommonProxyHandler jsCommonProxyHandler = this.this$0;
                String str2 = this.$url;
                Map<String, Object> mapM58751f = this.$event.m58751f();
                this.label = 1;
                obj = jsCommonProxyHandler.m67334h(str2, mapM58751f, this);
            } else if (Intrinsics.areEqual(str, "post")) {
                JsCommonProxyHandler jsCommonProxyHandler2 = this.this$0;
                String str3 = this.$url;
                Map<String, Object> mapM58751f2 = this.$event.m58751f();
                this.label = 2;
                obj = jsCommonProxyHandler2.m67335i(str3, mapM58751f2, this);
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
