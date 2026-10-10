package com.kubi.quotefacade.tradechance.widget.squarify;

import android.content.Context;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChanceSquarifyView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.widget.squarify.ChanceSquarifyView$updateData$1", m90122f = "ChanceSquarifyView.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChanceSquarifyView$updateData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<ChanceSquarifyNode, Integer, Unit> $onNodeClick;
    final /* synthetic */ List<ChancePlateItem> $plateItems;
    int label;
    final /* synthetic */ ChanceSquarifyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChanceSquarifyView$updateData$1(ChanceSquarifyView chanceSquarifyView, Function2<? super ChanceSquarifyNode, ? super Integer, Unit> function2, List<ChancePlateItem> list, Continuation<? super ChanceSquarifyView$updateData$1> continuation) {
        super(2, continuation);
        this.this$0 = chanceSquarifyView;
        this.$onNodeClick = function2;
        this.$plateItems = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChanceSquarifyView$updateData$1(this.this$0, this.$onNodeClick, this.$plateItems, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChanceSquarifyView$updateData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final void m53287f(ChanceSquarifyView chanceSquarifyView, List list) {
        chanceSquarifyView.getData().clear();
        if (list.isEmpty()) {
            chanceSquarifyView.setBackgroundResource(R$mipmap.quote_img_plate_placeholder);
        } else {
            Context context = chanceSquarifyView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            chanceSquarifyView.setBackgroundColor(C27046k.m66699n(context, R$color.c_transparent));
            chanceSquarifyView.m53276i(list);
        }
        chanceSquarifyView.invalidate();
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
            this.this$0.f42722p = this.$onNodeClick;
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            ChanceSquarifyView$updateData$1$items$1 chanceSquarifyView$updateData$1$items$1 = new ChanceSquarifyView$updateData$1$items$1(this.this$0, this.$plateItems, null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M94120b, chanceSquarifyView$updateData$1$items$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        final List list = (List) obj;
        if (list == null) {
            return Unit.INSTANCE;
        }
        final ChanceSquarifyView chanceSquarifyView = this.this$0;
        chanceSquarifyView.f42718l = new Runnable() { // from class: com.kubi.quotefacade.tradechance.widget.squarify.d
            @Override // java.lang.Runnable
            public final void run() {
                ChanceSquarifyView$updateData$1.m53287f(chanceSquarifyView, list);
            }
        };
        ChanceSquarifyView chanceSquarifyView2 = this.this$0;
        chanceSquarifyView2.post(chanceSquarifyView2.f42718l);
        return Unit.INSTANCE;
    }
}
