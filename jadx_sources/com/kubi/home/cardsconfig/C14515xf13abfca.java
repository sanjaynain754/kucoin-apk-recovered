package com.kubi.home.cardsconfig;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.p021ts.PsExtractor;
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

/* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$onViewCreated$lambda$7$lambda$6$$inlined$flatMapLatest$1 */
/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m90084d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.cardsconfig.CardsConfigFragment$onViewCreated$lambda$7$lambda$6$$inlined$flatMapLatest$1", m90122f = "CardsConfigFragment.kt", m90123i = {0, 0}, m90124l = {PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {"$this$transformLatest", "it"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 CardsConfigFragment.kt\ncom/kubi/home/cardsconfig/CardsConfigFragment\n*L\n1#1,189:1\n146#2:190\n*E\n"})
public final class C14515xf13abfca extends SuspendLambda implements Function3<InterfaceC41635f<? super Unit>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CardsConfigFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14515xf13abfca(Continuation continuation, CardsConfigFragment cardsConfigFragment) {
        super(3, continuation);
        this.this$0 = cardsConfigFragment;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super Unit> interfaceC41635f, Boolean bool, Continuation<? super Unit> continuation) {
        C14515xf13abfca c14515xf13abfca = new C14515xf13abfca(continuation, this.this$0);
        c14515xf13abfca.L$0 = interfaceC41635f;
        c14515xf13abfca.L$1 = bool;
        return c14515xf13abfca.invokeSuspend(Unit.INSTANCE);
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
            ((Boolean) obj2).getClass();
            InterfaceC41634e interfaceC41634eM90887K = C41636g.m90887K(new CardsConfigFragment$onViewCreated$3$1$3$1(this.this$0, null));
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
            this.L$1 = SpillingKt.nullOutSpilledVariable(obj2);
            this.label = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90887K, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
