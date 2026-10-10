package com.kubi.core.spot.business.holder;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.p021ts.PsExtractor;
import com.kubi.unify.api.IUnifyAccountService;
import java.math.BigDecimal;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m90084d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$flatMapLatest$1", m90122f = "SpotDiffHolderImp.kt", m90123i = {0, 0}, m90124l = {PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {"$this$transformLatest", "it"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 SpotDiffHolderImp.kt\ncom/kubi/core/spot/business/holder/SpotDiffHolderImp\n*L\n1#1,189:1\n80#2,5:190\n*E\n"})
public final class SpotDiffHolderImp$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<InterfaceC41635f<? super BigDecimal>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SpotDiffHolderImp$special$$inlined$flatMapLatest$1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super BigDecimal> interfaceC41635f, String str, Continuation<? super Unit> continuation) {
        SpotDiffHolderImp$special$$inlined$flatMapLatest$1 spotDiffHolderImp$special$$inlined$flatMapLatest$1 = new SpotDiffHolderImp$special$$inlined$flatMapLatest$1(continuation);
        spotDiffHolderImp$special$$inlined$flatMapLatest$1.L$0 = interfaceC41635f;
        spotDiffHolderImp$special$$inlined$flatMapLatest$1.L$1 = str;
        return spotDiffHolderImp$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Object obj2 = this.L$1;
            String str = (String) obj2;
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(IUnifyAccountService.f53155a.get().mo64987a(str), new SpotDiffHolderImp$baseAvailableEquity$2$1(str, null));
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
            this.L$1 = SpillingKt.nullOutSpilledVariable(obj2);
            this.label = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90917h, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
