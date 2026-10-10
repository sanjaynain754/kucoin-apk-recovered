package com.kubi.payment.channel.fiat;

import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27024b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchFiatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.fiat.SearchFiatViewModel$getHistoryList$2", m90122f = "SearchFiatViewModel.kt", m90123i = {0, 0, 0}, m90124l = {169}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nSearchFiatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$getHistoryList$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n196#2,3:167\n827#3:170\n855#3,2:171\n*S KotlinDebug\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$getHistoryList$2\n*L\n94#1:167,3\n96#1:170\n96#1:171,2\n*E\n"})
public final class SearchFiatViewModel$getHistoryList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<FiatInfoEntity.FiatInfo>>, Object> {
    final /* synthetic */ List<FiatInfoEntity.FiatInfo> $data;
    final /* synthetic */ String $historyFiatJson;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiatViewModel$getHistoryList$2(String str, List<FiatInfoEntity.FiatInfo> list, Continuation<? super SearchFiatViewModel$getHistoryList$2> continuation) {
        super(2, continuation);
        this.$historyFiatJson = str;
        this.$data = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFiatViewModel$getHistoryList$2(this.$historyFiatJson, this.$data, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<FiatInfoEntity.FiatInfo>> continuation) {
        return ((SearchFiatViewModel$getHistoryList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C27099x c27099x = C27099x.f54458a;
            String str = this.$historyFiatJson;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C20329xd440798a(str, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$1 = SpillingKt.nullOutSpilledVariable(str);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) C27024b.m66560c((List) obj));
        List<FiatInfoEntity.FiatInfo> list = this.$data;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : mutableList) {
            if (!list.contains((FiatInfoEntity.FiatInfo) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            mutableList.removeAll(arrayList);
        }
        return mutableList;
    }
}
