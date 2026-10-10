package com.kubi.mart.sidebar.spot.helper;

import com.kubi.data.entity.TradeItemBean;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ListItemLongPressHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.ListItemLongPressHelper$initPopView$1$2$1", m90122f = "ListItemLongPressHelper.kt", m90123i = {}, m90124l = {93}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ListItemLongPressHelper$initPopView$1$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeItemBean $item;
    final /* synthetic */ Function0<Unit> $onFinish;
    int label;

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.ListItemLongPressHelper$initPopView$1$2$1$1 */
    /* JADX INFO: compiled from: ListItemLongPressHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.helper.ListItemLongPressHelper$initPopView$1$2$1$1", m90122f = "ListItemLongPressHelper.kt", m90123i = {}, m90124l = {93}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C188551 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ TradeItemBean $item;
        final /* synthetic */ Function0<Unit> $onFinish;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188551(TradeItemBean tradeItemBean, Function0<Unit> function0, Continuation<? super C188551> continuation) {
            super(2, continuation);
            this.$item = tradeItemBean;
            this.$onFinish = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188551(this.$item, this.$onFinish, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C188551) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FavoriteChangeHelper favoriteChangeHelper = new FavoriteChangeHelper();
                TradeItemBean tradeItemBean = this.$item;
                Function0<Unit> function0 = this.$onFinish;
                this.label = 1;
                if (favoriteChangeHelper.m41449b(tradeItemBean, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemLongPressHelper$initPopView$1$2$1(TradeItemBean tradeItemBean, Function0<Unit> function0, Continuation<? super ListItemLongPressHelper$initPopView$1$2$1> continuation) {
        super(2, continuation);
        this.$item = tradeItemBean;
        this.$onFinish = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ListItemLongPressHelper$initPopView$1$2$1(this.$item, this.$onFinish, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ListItemLongPressHelper$initPopView$1$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C188551 c188551 = new C188551(this.$item, this.$onFinish, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c188551, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
