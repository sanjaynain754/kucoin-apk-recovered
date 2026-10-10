package com.kubi.home.v2.card;

import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.R$string;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.utils.ToastCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.CardsViewModelV2$addCard$1", m90122f = "CardsViewModelV2.kt", m90123i = {1, 2}, m90124l = {429, 435, 436}, m90125m = "invokeSuspend", m90126n = {"index", "index"}, m90127s = {"I$0", "I$0"})
@SourceDebugExtension({"SMAP\nCardsViewModelV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$addCard$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n1761#2,3:652\n*S KotlinDebug\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$addCard$1\n*L\n423#1:652,3\n*E\n"})
public final class CardsViewModelV2$addCard$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseCardDataV2 $cardData;
    int I$0;
    int label;
    final /* synthetic */ CardsViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModelV2$addCard$1(BaseCardDataV2 baseCardDataV2, CardsViewModelV2 cardsViewModelV2, Continuation<? super CardsViewModelV2$addCard$1> continuation) {
        super(2, continuation);
        this.$cardData = baseCardDataV2;
        this.this$0 = cardsViewModelV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModelV2$addCard$1(this.$cardData, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModelV2$addCard$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r10.m30772y0(r9) == r0) goto L42;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection data;
        int iM96367s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    iM96367s = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    CardsViewModelV2 cardsViewModelV2 = this.this$0;
                    this.I$0 = iM96367s;
                    this.label = 3;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$cardData.getRepeatable() && (data = this.this$0.m30747X().getData()) != null) {
            BaseCardDataV2 baseCardDataV2 = this.$cardData;
            if (!data.isEmpty()) {
                Iterator it = data.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((BaseCardDataV2) it.next()).getCode(), baseCardDataV2.getCode())) {
                        ToastCompat.m66437C(R$string.homepage_feature_save_failed);
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        RecyclerView f96711w = this.this$0.m30747X().getF96711w();
        if (f96711w != null) {
            f96711w.smoothScrollToPosition(0);
        }
        this.label = 1;
        if (DelayKt.m90350b(300L, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        iM96367s = this.this$0.m30747X().m96367s();
        this.this$0.f26477c0.setValue(this.$cardData);
        List<T> data2 = this.this$0.m30747X().getData();
        if (data2 != 0) {
            data2.add(iM96367s, this.$cardData);
        }
        this.this$0.m30747X().notifyItemInserted(iM96367s);
        if (!this.this$0.f26470V) {
            this.I$0 = iM96367s;
            this.label = 2;
            if (DelayKt.m90350b(300L, this) != coroutine_suspended) {
                CardsViewModelV2 cardsViewModelV3 = this.this$0;
                this.I$0 = iM96367s;
                this.label = 3;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
