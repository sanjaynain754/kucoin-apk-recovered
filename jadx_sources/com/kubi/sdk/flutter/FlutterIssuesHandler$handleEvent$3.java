package com.kubi.sdk.flutter;

import com.kubi.monitor.TechnologyEvent;
import io.flutter.plugin.common.MethodCall;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlutterIssuesHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.flutter.FlutterIssuesHandler$handleEvent$3", m90122f = "FlutterIssuesHandler.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlutterIssuesHandler$handleEvent$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MethodCall $call;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterIssuesHandler$handleEvent$3(MethodCall methodCall, Continuation<? super FlutterIssuesHandler$handleEvent$3> continuation) {
        super(2, continuation);
        this.$call = methodCall;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlutterIssuesHandler$handleEvent$3(this.$call, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlutterIssuesHandler$handleEvent$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$call.arguments;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Pair pairM56667f = FlutterIssuesHandler.m56667f((Map) obj2);
            String str = (String) pairM56667f.getFirst();
            TechnologyEvent.EventParametersBuilder eventParametersBuilder = (TechnologyEvent.EventParametersBuilder) pairM56667f.getSecond();
            if (eventParametersBuilder != null) {
                TechnologyEvent.m42388d(str, eventParametersBuilder);
            } else {
                TechnologyEvent.m42386b(str);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
