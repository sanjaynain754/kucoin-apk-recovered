package com.kubi.transfer.search.symbol;

import androidx.lifecycle.MutableLiveData;
import com.kubi.utils.C27099x;
import g60.C37825a;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchSymbolViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.search.symbol.SearchSymbolViewModel$historyList$2$1$1", m90122f = "SearchSymbolViewModel.kt", m90123i = {}, m90124l = {47}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchSymbolViewModel$historyList$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<List<String>> $this_apply;
    int label;

    /* JADX INFO: renamed from: com.kubi.transfer.search.symbol.SearchSymbolViewModel$historyList$2$1$1$1 */
    /* JADX INFO: compiled from: SearchSymbolViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.transfer.search.symbol.SearchSymbolViewModel$historyList$2$1$1$1", m90122f = "SearchSymbolViewModel.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {88}, m90125m = "invokeSuspend", m90126n = {"$this$invokeSuspend_u24lambda_u240", "this_$iv", "json$iv", "$completion$iv", "$i$a$-apply-SearchSymbolViewModel$historyList$2$1$1$1$1", "$i$f$fromJsonOrNull"}, m90127s = {"L$1", "L$2", "L$3", "L$4", "I$0", "I$1"})
    @SourceDebugExtension({"SMAP\nSearchSymbolViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchSymbolViewModel.kt\ncom/kubi/transfer/search/symbol/SearchSymbolViewModel$historyList$2$1$1$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,85:1\n196#2,3:86\n*S KotlinDebug\n*F\n+ 1 SearchSymbolViewModel.kt\ncom/kubi/transfer/search/symbol/SearchSymbolViewModel$historyList$2$1$1$1\n*L\n49#1:86,3\n*E\n"})
    public static final class C264041 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<List<String>> $this_apply;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C264041(MutableLiveData<List<String>> mutableLiveData, Continuation<? super C264041> continuation) {
            super(2, continuation);
            this.$this_apply = mutableLiveData;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C264041(this.$this_apply, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C264041) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    mutableLiveData = (MutableLiveData) this.L$5;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String strM85378b = C37825a.m85378b("symbol_history", null, 2, null);
                MutableLiveData<List<String>> mutableLiveData2 = this.$this_apply;
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26405x45035c52(strM85378b, null)), C42911a.m94120b());
                this.L$0 = strM85378b;
                this.L$1 = SpillingKt.nullOutSpilledVariable(strM85378b);
                this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$3 = SpillingKt.nullOutSpilledVariable(strM85378b);
                this.L$4 = SpillingKt.nullOutSpilledVariable(this);
                this.L$5 = mutableLiveData2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData2;
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSymbolViewModel$historyList$2$1$1(MutableLiveData<List<String>> mutableLiveData, Continuation<? super SearchSymbolViewModel$historyList$2$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = mutableLiveData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchSymbolViewModel$historyList$2$1$1(this.$this_apply, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchSymbolViewModel$historyList$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C264041 c264041 = new C264041(this.$this_apply, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c264041, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
