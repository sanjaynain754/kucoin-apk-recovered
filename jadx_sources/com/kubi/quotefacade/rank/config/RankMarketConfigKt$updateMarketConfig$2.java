package com.kubi.quotefacade.rank.config;

import com.kubi.quotefacade.helper.QuoteKV;
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
import y70.C46392a;

/* JADX INFO: compiled from: RankMarketConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.config.RankMarketConfigKt$updateMarketConfig$2", m90122f = "RankMarketConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRankMarketConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankMarketConfig.kt\ncom/kubi/quotefacade/rank/config/RankMarketConfigKt$updateMarketConfig$2\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,111:1\n23#2,2:112\n*S KotlinDebug\n*F\n+ 1 RankMarketConfig.kt\ncom/kubi/quotefacade/rank/config/RankMarketConfigKt$updateMarketConfig$2\n*L\n108#1:112,2\n*E\n"})
public final class RankMarketConfigKt$updateMarketConfig$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankMarketConfigKt$updateMarketConfig$2(String str, Continuation<? super RankMarketConfigKt$updateMarketConfig$2> continuation) {
        super(2, continuation);
        this.$result = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankMarketConfigKt$updateMarketConfig$2(this.$result, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RankMarketConfigKt$updateMarketConfig$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C46392a.m102333p(QuoteKV.f42044a.m52055o(), this.$result);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
