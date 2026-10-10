package com.kubi.payment.fasttradev2;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$addToHistory$1", m90122f = "FastTradeViewModel.kt", m90123i = {0}, m90124l = {679}, m90125m = "invokeSuspend", m90126n = {"list"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$addToHistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,748:1\n1761#2,3:749\n360#2,7:752\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$addToHistory$1\n*L\n670#1:749,3\n671#1:752,7\n*E\n"})
public final class FastTradeViewModel$addToHistory$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ Parcelable $currency;
    final /* synthetic */ List<T> $historyList;
    final /* synthetic */ StorageId<List<T>> $key;
    final /* synthetic */ Function1<T, Boolean> $predicate;
    Object L$0;
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+TT;>;Lkotlin/jvm/functions/Function1<-TT;Ljava/lang/Boolean;>;TT;Lcom/kubi/payment/fasttradev2/FastTradeViewModel;Ly70/g<Ljava/util/List<TT;>;>;Lkotlin/coroutines/Continuation<-Lcom/kubi/payment/fasttradev2/FastTradeViewModel$addToHistory$1;>;)V */
    public FastTradeViewModel$addToHistory$1(List list, Function1 function1, Parcelable parcelable, FastTradeViewModel fastTradeViewModel, StorageId storageId, Continuation continuation) {
        super(2, continuation);
        this.$historyList = list;
        this.$predicate = function1;
        this.$currency = parcelable;
        this.this$0 = fastTradeViewModel;
        this.$key = storageId;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$addToHistory$1(this.$historyList, this.$predicate, this.$currency, this.this$0, this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$addToHistory$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ArrayList arrayList = new ArrayList();
            List<T> list = this.$historyList;
            if (list != 0 && !list.isEmpty()) {
                arrayList.addAll(this.$historyList);
            }
            Function1<T, Boolean> function1 = this.$predicate;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (function1.invoke((T) it.next()).booleanValue()) {
                        Function1<T, Boolean> function2 = this.$predicate;
                        Iterator it2 = arrayList.iterator();
                        int i12 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                if (function2.invoke((T) it2.next()).booleanValue()) {
                                    break;
                                }
                                i12++;
                            } else {
                                i12 = -1;
                                break;
                            }
                        }
                        if (i12 < 0) {
                            break;
                        }
                        arrayList.remove(i12);
                        break;
                    }
                }
            }
            arrayList.add(0, this.$currency);
            FastTradeViewModel fastTradeViewModel = this.this$0;
            StorageId<List<T>> storageId = this.$key;
            this.L$0 = SpillingKt.nullOutSpilledVariable(arrayList);
            this.label = 1;
            if (fastTradeViewModel.m47302b0(storageId, arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
