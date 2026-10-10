package com.kubi.core.biz.menu;

import com.kubi.core.spot.entity.SpotInformationEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SpotInformationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/SpotInformationEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.menu.SpotInformationVM$handleSpotInformation$2", m90122f = "SpotInformationVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SpotInformationVM$handleSpotInformation$2 extends SuspendLambda implements Function2<SpotInformationEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SpotInformationVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(SpotInformationEntity spotInformationEntity, Continuation<? super Unit> continuation) {
        return ((SpotInformationVM$handleSpotInformation$2) create(spotInformationEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotInformationVM$handleSpotInformation$2(SpotInformationVM spotInformationVM, Continuation<? super SpotInformationVM$handleSpotInformation$2> continuation) {
        super(2, continuation);
        this.this$0 = spotInformationVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotInformationVM$handleSpotInformation$2 spotInformationVM$handleSpotInformation$2 = new SpotInformationVM$handleSpotInformation$2(this.this$0, continuation);
        spotInformationVM$handleSpotInformation$2.L$0 = obj;
        return spotInformationVM$handleSpotInformation$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final SpotInformationEntity spotInformationEntity = (SpotInformationEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.core.biz.menu.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SpotInformationVM$handleSpotInformation$2.m21970f(spotInformationEntity, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m21970f(SpotInformationEntity spotInformationEntity, UIState uIState) {
        return uIState.copy(spotInformationEntity);
    }
}
