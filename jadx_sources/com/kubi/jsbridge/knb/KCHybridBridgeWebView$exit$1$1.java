package com.kubi.jsbridge.knb;

import com.kubi.jsbridge.exception.WebBridgeException;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.widget.web.ui.KWebBaseActivity;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCHybridBridgeWebView.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.knb.KCHybridBridgeWebView$exit$1$1", m90122f = "KCHybridBridgeWebView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCHybridBridgeWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeWebView.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeWebView$exit$1$1\n+ 2 KWebBridgeIssue.kt\ncom/kubi/jsbridge/exception/KWebBridgeIssueKt\n*L\n1#1,173:1\n44#2,2:174\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeWebView.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeWebView$exit$1$1\n*L\n49#1:174,2\n*E\n"})
public final class KCHybridBridgeWebView$exit$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ KWebBaseActivity $activity;
    final /* synthetic */ boolean $appPopAnimated;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeWebView$exit$1$1(KWebBaseActivity kWebBaseActivity, boolean z11, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCHybridBridgeWebView$exit$1$1> continuation) {
        super(2, continuation);
        this.$activity = kWebBaseActivity;
        this.$appPopAnimated = z11;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeWebView$exit$1$1(this.$activity, this.$appPopAnimated, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeWebView$exit$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                this.$activity.finish();
                if (!this.$appPopAnimated) {
                    this.$activity.overridePendingTransition(0, 0);
                }
                this.$callback.invoke(Boxing.boxBoolean(true), null);
            } catch (Throwable th2) {
                C43846g.m96568c(new WebBridgeException(th2, "KCHybridBridgeWebView", false, null, 8, null), null, 2, null);
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
