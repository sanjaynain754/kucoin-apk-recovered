package com.kubi.futures.trade;

import com.kubi.broker.RepositoryServiceLocator;
import kotlinx.coroutines.InterfaceC41709m0;
import p836zl.C46894j;
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
import y70.C46392a;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFuturesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,408:1\n136#2:409\n84#2:410\n*S KotlinDebug\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1\n*L\n134#1:409\n138#1:410\n*E\n"})
public final class FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FuturesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1(FuturesViewModel futuresViewModel, Continuation<? super FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesViewModel$fetchAndCheckShowCopyTradingGuide$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11;
        Boolean boolMo25030u;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C46894j c46894j = C46894j.f104736a;
            boolean zBooleanValue = false;
            if (C46392a.m102322d(c46894j.m103238C(), false)) {
                i11 = 7;
            } else {
                i11 = 3;
            }
            if (System.currentTimeMillis() - C46392a.m102324f(c46894j.m103237B(), 0L) >= ((long) (i11 * 86400)) * 1000 && (boolMo25030u = RepositoryServiceLocator.f19236a.m20288g().mo25030u()) != null) {
                zBooleanValue = boolMo25030u.booleanValue();
            }
            this.this$0.m26718F().postValue(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
