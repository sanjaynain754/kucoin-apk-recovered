package com.kubi.payment.fasttradev2;

import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadHistoryCurrencyList$1", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadHistoryCurrencyList$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,748:1\n1#2:749\n774#3:750\n865#3,2:751\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadHistoryCurrencyList$1\n*L\n615#1:750\n615#1:751,2\n*E\n"})
public final class FastTradeViewModel$loadHistoryCurrencyList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, String> $condition;
    final /* synthetic */ List<String> $currencyTitles;
    final /* synthetic */ MutableLiveData<List<T>> $historyListData;
    final /* synthetic */ StorageId<List<T>> $key;
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FastTradeViewModel$loadHistoryCurrencyList$1(FastTradeViewModel fastTradeViewModel, StorageId<List<T>> storageId, List<String> list, MutableLiveData<List<T>> mutableLiveData, Function1<? super T, String> function1, Continuation<? super FastTradeViewModel$loadHistoryCurrencyList$1> continuation) {
        super(2, continuation);
        this.this$0 = fastTradeViewModel;
        this.$key = storageId;
        this.$currencyTitles = list;
        this.$historyListData = mutableLiveData;
        this.$condition = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$loadHistoryCurrencyList$1(this.this$0, this.$key, this.$currencyTitles, this.$historyListData, this.$condition, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$loadHistoryCurrencyList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
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
            FastTradeViewModel fastTradeViewModel = this.this$0;
            StorageId<List<T>> storageId = this.$key;
            this.label = 1;
            obj = fastTradeViewModel.m47317x0(storageId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<String> list2 = this.$currencyTitles;
            if (list2 != null) {
                Function1<T, String> function1 = this.$condition;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (list2.contains(function1.invoke((T) ((Parcelable) obj2)))) {
                        arrayList2.add(obj2);
                    }
                }
                list = arrayList2;
            }
            arrayList.addAll(list);
            this.$historyListData.setValue(arrayList);
        } else {
            this.$historyListData.setValue(new ArrayList());
        }
        return Unit.INSTANCE;
    }
}
