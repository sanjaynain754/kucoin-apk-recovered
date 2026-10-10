package com.kubi.quotefacade.favorites.all;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FavAllViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllViewModel$pinFavDataTop$2", m90122f = "FavAllViewModel.kt", m90123i = {}, m90124l = {92}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FavAllViewModel$pinFavDataTop$2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FavAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavAllViewModel$pinFavDataTop$2(FavAllViewModel favAllViewModel, Continuation<? super FavAllViewModel$pinFavDataTop$2> continuation) {
        super(2, continuation);
        this.this$0 = favAllViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m51531f(UIState uIState) {
        return UIState.copy$default(uIState, null, null, new Object(), 3, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavAllViewModel$pinFavDataTop$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((FavAllViewModel$pinFavDataTop$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.favorites.all.p0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FavAllViewModel$pinFavDataTop$2.m51531f((UIState) obj2);
                }
            });
            FavAllViewModel favAllViewModel = this.this$0;
            this.label = 1;
            if (FavAllViewModel.m51496D(favAllViewModel, false, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
