package com.kubi.share.lib.knb;

import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.share.lib.utils.ShareExtKt;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import z10.C46646a;

/* JADX INFO: compiled from: KCHybridBridgeShare.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.share.lib.knb.KCHybridBridgeShare$saveShareImage$1", m90122f = "KCHybridBridgeShare.kt", m90123i = {1}, m90124l = {215, 221}, m90125m = "invokeSuspend", m90126n = {"hasPermission"}, m90127s = {"Z$0"})
@SourceDebugExtension({"SMAP\nKCHybridBridgeShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeShare.kt\ncom/kubi/share/lib/knb/KCHybridBridgeShare$saveShareImage$1\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,242:1\n47#2,4:243\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeShare.kt\ncom/kubi/share/lib/knb/KCHybridBridgeShare$saveShareImage$1\n*L\n221#1:243,4\n*E\n"})
public final class KCHybridBridgeShare$saveShareImage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $imgData;
    boolean Z$0;
    int label;
    final /* synthetic */ KCHybridBridgeShare this$0;

    /* JADX INFO: renamed from: com.kubi.share.lib.knb.KCHybridBridgeShare$saveShareImage$1$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KCHybridBridgeShare.kt\ncom/kubi/share/lib/knb/KCHybridBridgeShare$saveShareImage$1\n+ 3 ShareIssue.kt\ncom/kubi/share/lib/exception/ShareIssueKt\n*L\n1#1,49:1\n222#2:50\n223#2,2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeShare.kt\ncom/kubi/share/lib/knb/KCHybridBridgeShare$saveShareImage$1\n*L\n222#1:51,4\n*E\n"})
    public static final class C24563a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f49384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24563a(CoroutineExceptionHandler.Companion companion, Function2 function2) {
            super(companion);
            this.f49384b = function2;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C46646a.m102888b(exception, "ShareExt");
            }
            this.f49384b.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, exception, null, false, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCHybridBridgeShare$saveShareImage$1(BaseActivity baseActivity, Function2<? super Boolean, ? super ProtocolException, Unit> function2, KCHybridBridgeShare kCHybridBridgeShare, String str, Continuation<? super KCHybridBridgeShare$saveShareImage$1> continuation) {
        super(2, continuation);
        this.$activity = baseActivity;
        this.$callback = function2;
        this.this$0 = kCHybridBridgeShare;
        this.$imgData = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCHybridBridgeShare$saveShareImage$1(this.$activity, this.$callback, this.this$0, this.$imgData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCHybridBridgeShare$saveShareImage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r9 == r0) goto L19;
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
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.$callback.invoke(Boxing.boxBoolean(((Boolean) obj).booleanValue()), null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        BaseActivity baseActivity = this.$activity;
        this.label = 1;
        obj = ShareExtKt.m59841N(baseActivity, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("no permission"), null, false, 8, null));
            return Unit.INSTANCE;
        }
        CoroutineContext coroutineContextPlus = C42911a.m94120b().plus(new C24563a(CoroutineExceptionHandler.INSTANCE, this.$callback));
        KCHybridBridgeShare$saveShareImage$1$success$2 kCHybridBridgeShare$saveShareImage$1$success$2 = new KCHybridBridgeShare$saveShareImage$1$success$2(this.this$0, this.$imgData, this.$activity, null);
        this.Z$0 = zBooleanValue;
        this.label = 2;
        obj = C41686h.m91049g(coroutineContextPlus, kCHybridBridgeShare$saveShareImage$1$success$2, this);
    }
}
