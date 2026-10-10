package com.kubi.payment.channel.fiat;

import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.payment.util.PaymentStorageId;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import y70.StorageId;

/* JADX INFO: compiled from: SearchFiatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.fiat.SearchFiatViewModel$addToHistory$1", m90122f = "SearchFiatViewModel.kt", m90123i = {0, 0}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "invokeSuspend", m90126n = {"list", "historyList"}, m90127s = {"L$0", "L$1"})
public final class SearchFiatViewModel$addToHistory$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FiatInfoEntity.FiatInfo $item;
    final /* synthetic */ String $type;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SearchFiatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiatViewModel$addToHistory$1(SearchFiatViewModel searchFiatViewModel, FiatInfoEntity.FiatInfo fiatInfo, String str, Continuation<? super SearchFiatViewModel$addToHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = searchFiatViewModel;
        this.$item = fiatInfo;
        this.$type = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFiatViewModel$addToHistory$1(this.this$0, this.$item, this.$type, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchFiatViewModel$addToHistory$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ArrayList arrayList = new ArrayList();
            List list = (List) this.this$0.f38273b0.getValue();
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(list);
            }
            if (arrayList.contains(this.$item)) {
                arrayList.remove(this.$item);
            }
            arrayList.add(0, this.$item);
            if (arrayList.size() > 6) {
                CollectionsKt.removeLastOrNull(arrayList);
            }
            SearchFiatViewModel searchFiatViewModel = this.this$0;
            StorageId<String> storageIdM49846x = PaymentStorageId.f40364a.m49846x(this.$type);
            this.L$0 = SpillingKt.nullOutSpilledVariable(arrayList);
            this.L$1 = SpillingKt.nullOutSpilledVariable(list);
            this.label = 1;
            if (searchFiatViewModel.m45834I(storageIdM49846x, arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
