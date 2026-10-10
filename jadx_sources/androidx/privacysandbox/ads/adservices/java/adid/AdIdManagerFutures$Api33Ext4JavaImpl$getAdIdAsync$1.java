package androidx.privacysandbox.ads.adservices.java.adid;

import androidx.privacysandbox.ads.adservices.adid.AdId;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AdIdManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Landroidx/privacysandbox/ads/adservices/adid/AdId;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", m90122f = "AdIdManagerFutures.kt", m90123i = {}, m90124l = {54}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AdId>, Object> {
    int label;
    final /* synthetic */ AdIdManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(AdIdManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, Continuation<? super AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AdId> continuation) {
        return ((AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AdIdManager adIdManager = this.this$0.mAdIdManager;
        this.label = 1;
        Object adId = adIdManager.getAdId(this);
        if (adId == coroutine_suspended) {
            return coroutine_suspended;
        }
        return adId;
    }
}
