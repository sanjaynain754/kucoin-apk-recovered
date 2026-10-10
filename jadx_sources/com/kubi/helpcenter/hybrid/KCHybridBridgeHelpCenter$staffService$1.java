package com.kubi.helpcenter.hybrid;

import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.helpcenter.exception.HelpCenterException;
import com.kubi.helpcenter.exception.HelpCenterMessage;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
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

/* JADX INFO: compiled from: KCHybridBridgeHelpCenter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.helpcenter.hybrid.KCHybridBridgeHelpCenter$staffService$1", m90122f = "KCHybridBridgeHelpCenter.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCHybridBridgeHelpCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeHelpCenter.kt\ncom/kubi/helpcenter/hybrid/KCHybridBridgeHelpCenter$staffService$1\n+ 2 HelpCenterIssue.kt\ncom/kubi/helpcenter/exception/HelpCenterIssueKt\n*L\n1#1,70:1\n48#2,2:71\n44#2,2:73\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeHelpCenter.kt\ncom/kubi/helpcenter/hybrid/KCHybridBridgeHelpCenter$staffService$1\n*L\n55#1:71,2\n59#1:73,2\n*E\n"})
public final class KCHybridBridgeHelpCenter$staffService$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeHelpCenter$staffService$1(String str, BaseActivity baseActivity, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCHybridBridgeHelpCenter$staffService$1> continuation) {
        super(2, continuation);
        this.$source = str;
        this.$activity = baseActivity;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeHelpCenter$staffService$1(this.$source, this.$activity, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeHelpCenter$staffService$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String serviceType;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                CustomerServiceType.Companion companion = CustomerServiceType.INSTANCE;
                String str = this.$source;
                if (str != null && str.length() != 0) {
                    serviceType = this.$source;
                } else {
                    serviceType = CustomerServiceType.H5.getServiceType();
                }
                CustomerServiceType customerServiceTypeFromValue = companion.fromValue(serviceType);
                IHelpCenterService.m28904f(IHelpCenterService.f25326a.get(), this.$activity, null, customerServiceTypeFromValue, null, false, 26, null);
                if (customerServiceTypeFromValue == CustomerServiceType.H5 || customerServiceTypeFromValue == CustomerServiceType.NONE) {
                    C43846g.m96568c(new HelpCenterMessage("h5 ada source is " + this.$source, "KCHybridBridgeHelpCente", false, 4, null), null, 2, null);
                }
                this.$callback.invoke(Boxing.boxBoolean(true), null);
            } catch (Throwable th2) {
                C43846g.m96568c(new HelpCenterException(th2, "KCHybridBridgeHelpCente", false, null, 8, null), null, 2, null);
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
