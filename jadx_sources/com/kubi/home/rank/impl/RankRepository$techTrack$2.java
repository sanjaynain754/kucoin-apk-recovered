package com.kubi.home.rank.impl;

import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RankRepository.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankRepository$techTrack$2", m90122f = "RankRepository.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRankRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankRepository.kt\ncom/kubi/home/rank/impl/RankRepository$techTrack$2\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n71#2,2:334\n73#2,2:337\n1#3:336\n*S KotlinDebug\n*F\n+ 1 RankRepository.kt\ncom/kubi/home/rank/impl/RankRepository$techTrack$2\n*L\n325#1:334,2\n325#1:337,2\n*E\n"})
public final class RankRepository$techTrack$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ int $type;
    int label;
    final /* synthetic */ RankRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankRepository$techTrack$2(RankRepository rankRepository, int i11, String str, String str2, Continuation<? super RankRepository$techTrack$2> continuation) {
        super(2, continuation);
        this.this$0 = rankRepository;
        this.$type = i11;
        this.$category = str;
        this.$errorMessage = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankRepository$techTrack$2(this.this$0, this.$type, this.$category, this.$errorMessage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RankRepository$techTrack$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            RankRepository rankRepository = this.this$0;
            int i11 = this.$type;
            String str = this.$category;
            String str2 = this.$errorMessage;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("type", rankRepository.m29868e(i11));
            eventParametersBuilderAcquire.m42393d("category", str);
            eventParametersBuilderAcquire.m42393d(Constants.BIZ, "kucoins");
            if (str2 != null) {
                eventParametersBuilderAcquire.m42393d("error_message", str2);
            }
            TechnologyEvent.m42388d("home_rank", eventParametersBuilderAcquire);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
