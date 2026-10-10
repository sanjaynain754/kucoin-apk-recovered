package com.kubi.transfer.search.coin;

import com.kubi.transfer.entity.AccountCoin;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import e60.C37084b;
import java.math.BigDecimal;
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

/* JADX INFO: compiled from: SearchCoinViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.search.coin.SearchCoinViewModel$searchFilter$1", m90122f = "SearchCoinViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchCoinViewModel$searchFilter$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ SearchCoinViewModel this$0;

    /* JADX INFO: renamed from: j */
    public static final BigDecimal m64715j(AccountCoin accountCoin) {
        return DowngradeExKt.m66535e(accountCoin != null ? accountCoin.getAvailableBalance() : null, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCoinViewModel$searchFilter$1(SearchCoinViewModel searchCoinViewModel, String str, Continuation<? super SearchCoinViewModel$searchFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = searchCoinViewModel;
        this.$key = str;
    }

    /* JADX INFO: renamed from: h */
    public static final String m64713h(AccountCoin accountCoin) {
        return C27041f.m66668h(C27041f.m66677q(accountCoin != null ? accountCoin.getCurrencyName() : null));
    }

    /* JADX INFO: renamed from: i */
    public static final String m64714i(AccountCoin accountCoin) {
        return C27041f.m66668h(accountCoin != null ? accountCoin.getCurrencyFullName() : null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoinViewModel$searchFilter$1(this.this$0, this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchCoinViewModel$searchFilter$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m64688A().setValue(C37084b.m83009d(this.this$0.m64689D(), this.$key, new Function1() { // from class: com.kubi.transfer.search.coin.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SearchCoinViewModel$searchFilter$1.m64713h((AccountCoin) obj2);
                }
            }, new Function1() { // from class: com.kubi.transfer.search.coin.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SearchCoinViewModel$searchFilter$1.m64714i((AccountCoin) obj2);
                }
            }, new Function1() { // from class: com.kubi.transfer.search.coin.y
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SearchCoinViewModel$searchFilter$1.m64715j((AccountCoin) obj2);
                }
            }));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
