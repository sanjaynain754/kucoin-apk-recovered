package com.kubi.quotefacade.widgets.gembox;

import com.kubi.quotefacade.entity.ChanceGemBoxCurrency;
import com.kubi.quotefacade.widgets.QuoteWidgetsRepo;
import kotlinx.coroutines.C41713n0;
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

/* JADX INFO: compiled from: GemboxWidgetVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.gembox.GemboxWidgetVM$startWsPush$1", m90122f = "GemboxWidgetVM.kt", m90123i = {}, m90124l = {68}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class GemboxWidgetVM$startWsPush$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $topic;
    int label;
    final /* synthetic */ GemboxWidgetVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GemboxWidgetVM$startWsPush$1(GemboxWidgetVM gemboxWidgetVM, String str, Continuation<? super GemboxWidgetVM$startWsPush$1> continuation) {
        super(2, continuation);
        this.this$0 = gemboxWidgetVM;
        this.$topic = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GemboxWidgetVM$startWsPush$1(this.this$0, this.$topic, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GemboxWidgetVM$startWsPush$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m53579g(GemboxWidgetVM gemboxWidgetVM, final ChanceGemBoxCurrency chanceGemBoxCurrency) {
        if (C41713n0.m91132h(gemboxWidgetVM.f42865a0)) {
            gemboxWidgetVM.updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.gembox.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GemboxWidgetVM$startWsPush$1.m53580h(chanceGemBoxCurrency, (UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m53580h(ChanceGemBoxCurrency chanceGemBoxCurrency, UIState uIState) {
        return uIState.copy(chanceGemBoxCurrency);
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
            QuoteWidgetsRepo quoteWidgetsRepo = this.this$0.f42862X;
            String str = this.$topic;
            final GemboxWidgetVM gemboxWidgetVM = this.this$0;
            Function1<? super ChanceGemBoxCurrency, Unit> function1 = new Function1() { // from class: com.kubi.quotefacade.widgets.gembox.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return GemboxWidgetVM$startWsPush$1.m53579g(gemboxWidgetVM, (ChanceGemBoxCurrency) obj2);
                }
            };
            this.label = 1;
            if (quoteWidgetsRepo.m53346o(str, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
