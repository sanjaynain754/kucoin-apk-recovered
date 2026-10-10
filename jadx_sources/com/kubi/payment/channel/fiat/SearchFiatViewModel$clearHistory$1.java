package com.kubi.payment.channel.fiat;

import com.kubi.payment.util.PaymentStorageId;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: SearchFiatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.fiat.SearchFiatViewModel$clearHistory$1", m90122f = "SearchFiatViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSearchFiatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$clearHistory$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,166:1\n15#2:167\n*S KotlinDebug\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$clearHistory$1\n*L\n162#1:167\n*E\n"})
public final class SearchFiatViewModel$clearHistory$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ SearchFiatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiatViewModel$clearHistory$1(String str, SearchFiatViewModel searchFiatViewModel, Continuation<? super SearchFiatViewModel$clearHistory$1> continuation) {
        super(2, continuation);
        this.$type = str;
        this.this$0 = searchFiatViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFiatViewModel$clearHistory$1(this.$type, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchFiatViewModel$clearHistory$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C46392a.m102335r(PaymentStorageId.f40364a.m49846x(this.$type));
            List list = (List) this.this$0.f38273b0.getValue();
            if (list != null) {
                list.clear();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
