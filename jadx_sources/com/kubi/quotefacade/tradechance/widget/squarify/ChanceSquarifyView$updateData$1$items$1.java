package com.kubi.quotefacade.tradechance.widget.squarify;

import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.utils.C27099x;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChanceSquarifyView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.widget.squarify.ChanceSquarifyView$updateData$1$items$1", m90122f = "ChanceSquarifyView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nChanceSquarifyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceSquarifyView.kt\ncom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyView$updateData$1$items$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class ChanceSquarifyView$updateData$1$items$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends ChancePlateItem>>, Object> {
    final /* synthetic */ List<ChancePlateItem> $plateItems;
    int label;
    final /* synthetic */ ChanceSquarifyView this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends ChancePlateItem>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<ChancePlateItem>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceSquarifyView$updateData$1$items$1(ChanceSquarifyView chanceSquarifyView, List<ChancePlateItem> list, Continuation<? super ChanceSquarifyView$updateData$1$items$1> continuation) {
        super(2, continuation);
        this.this$0 = chanceSquarifyView;
        this.$plateItems = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChanceSquarifyView$updateData$1$items$1(this.this$0, this.$plateItems, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<ChancePlateItem>> continuation) {
        return ((ChanceSquarifyView$updateData$1$items$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.f42719m.length() > 0 && Intrinsics.areEqual(this.this$0.f42719m, C27099x.m66919i(this.$plateItems, false, 2, null))) {
                return null;
            }
            List<ChancePlateItem> listEmptyList = this.$plateItems;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.this$0.f42719m = C27099x.m66919i(this.$plateItems, false, 2, null);
            return listEmptyList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
