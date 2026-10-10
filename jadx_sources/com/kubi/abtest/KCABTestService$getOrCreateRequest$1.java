package com.kubi.abtest;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KCABTestService.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.abtest.KCABTestService", m90122f = "KCABTestService.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_MIN}, m90125m = "getOrCreateRequest", m90126n = {"cacheKey", RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "defaultValue", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "$this$withLock_u24default$iv", "$i$f$withLock"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
public final class KCABTestService$getOrCreateRequest$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KCABTestService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCABTestService$getOrCreateRequest$1(KCABTestService kCABTestService, Continuation<? super KCABTestService$getOrCreateRequest$1> continuation) {
        super(continuation);
        this.this$0 = kCABTestService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m14638l(null, null, null, null, this);
    }
}
