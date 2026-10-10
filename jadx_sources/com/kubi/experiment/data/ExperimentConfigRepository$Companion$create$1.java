package com.kubi.experiment.data;

import com.kubi.experiment.core.ExperimentConfig;
import java.util.Map;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ExperimentConfigRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/experiment/core/ExperimentConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.experiment.data.ExperimentConfigRepository$Companion$create$1", m90122f = "ExperimentConfigRepository.kt", m90123i = {}, m90124l = {126}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ExperimentConfigRepository$Companion$create$1 extends SuspendLambda implements Function1<Continuation<? super ExperimentConfig>, Object> {
    final /* synthetic */ ExperimentApi $api;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentConfigRepository$Companion$create$1(ExperimentApi experimentApi, Continuation<? super ExperimentConfigRepository$Companion$create$1> continuation) {
        super(1, continuation);
        this.$api = experimentApi;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ExperimentConfigRepository$Companion$create$1(this.$api, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ExperimentConfig> continuation) {
        return ((ExperimentConfigRepository$Companion$create$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            ExperimentApi experimentApi = this.$api;
            this.label = 1;
            obj = experimentApi.m23739a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return new ExperimentConfig(MapsKt.toMap((Map) obj), C45590s.f102687a.m100675Z());
    }
}
