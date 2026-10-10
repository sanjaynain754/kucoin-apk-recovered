package com.kubi.jsbridge.impl.network;

import com.kubi.sdk.protocol.ProtocolException;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.MultipartBody;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.network.KCJsBridgeNetwork$uploadFile$1", m90122f = "KCJsBridgeNetwork.kt", m90123i = {}, m90124l = {310}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJsBridgeNetwork$uploadFile$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Map<String, ? extends Object>, ProtocolException, Unit> $callback;
    final /* synthetic */ List<MultipartBody.Part> $parts;
    final /* synthetic */ Map<String, String> $reqHeaders;
    final /* synthetic */ String $uploadUrl;
    int label;
    final /* synthetic */ KCJsBridgeNetwork this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeNetwork$uploadFile$1(String str, Map<String, String> map, List<MultipartBody.Part> list, KCJsBridgeNetwork kCJsBridgeNetwork, Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeNetwork$uploadFile$1> continuation) {
        super(2, continuation);
        this.$uploadUrl = str;
        this.$reqHeaders = map;
        this.$parts = list;
        this.this$0 = kCJsBridgeNetwork;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJsBridgeNetwork$uploadFile$1(this.$uploadUrl, this.$reqHeaders, this.$parts, this.this$0, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeNetwork$uploadFile$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KCJsBridgeNetwork.InterfaceC15261a interfaceC15261aM31796c = KCJsBridgeNetwork.f27452a.m31796c();
                String str = this.$uploadUrl;
                Map<String, String> map = this.$reqHeaders;
                List<MultipartBody.Part> list = this.$parts;
                this.label = 1;
                obj = interfaceC15261aM31796c.m31800d(str, map, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.this$0.m31769R(this.$uploadUrl, obj, this.$callback);
        } catch (Throwable th2) {
            this.this$0.m31791j0(th2);
            this.this$0.m31768Q(this.$uploadUrl, th2, this.$callback);
        }
        return Unit.INSTANCE;
    }
}
