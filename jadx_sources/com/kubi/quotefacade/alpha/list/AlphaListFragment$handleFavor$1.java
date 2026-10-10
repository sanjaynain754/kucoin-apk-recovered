package com.kubi.quotefacade.alpha.list;

import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.utils.extensions.C27025c;
import cv.C36544a;
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

/* JADX INFO: compiled from: AlphaListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.list.AlphaListFragment$handleFavor$1", m90122f = "AlphaListFragment.kt", m90123i = {}, m90124l = {397}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AlphaListFragment$handleFavor$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AlphaItemEntity $item;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ AlphaListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaListFragment$handleFavor$1(AlphaItemEntity alphaItemEntity, AlphaListFragment alphaListFragment, int i11, Continuation<? super AlphaListFragment$handleFavor$1> continuation) {
        super(2, continuation);
        this.$item = alphaItemEntity;
        this.this$0 = alphaListFragment;
        this.$position = i11;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m50645f(AlphaItemEntity alphaItemEntity, AlphaListFragment alphaListFragment, int i11, boolean z11) {
        if (z11) {
            if (alphaItemEntity != null) {
                alphaItemEntity.setFavoritePersonal(!C27025c.m66566d(Boolean.valueOf(C36544a.m81808a(alphaItemEntity))));
            }
            alphaListFragment.m50637n4().notifyItemChanged(i11);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlphaListFragment$handleFavor$1(this.$item, this.this$0, this.$position, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AlphaListFragment$handleFavor$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            FavAlphaCacheManager favAlphaCacheManager = FavAlphaCacheManager.f41929a;
            final AlphaItemEntity alphaItemEntity = this.$item;
            final AlphaListFragment alphaListFragment = this.this$0;
            final int i12 = this.$position;
            Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.alpha.list.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AlphaListFragment$handleFavor$1.m50645f(alphaItemEntity, alphaListFragment, i12, ((Boolean) obj2).booleanValue());
                }
            };
            this.label = 1;
            if (FavAlphaCacheManager.m51808p(favAlphaCacheManager, alphaItemEntity, false, function1, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
