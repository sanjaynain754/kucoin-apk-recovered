package com.kubi.sdk.protocol.jsapi;

import android.content.Context;
import com.kubi.sdk.protocol.ProtocolException;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCJSApiProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$exec$1", m90122f = "KCJSApiProtocolManager.kt", m90123i = {}, m90124l = {151}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJSApiProtocolManager$exec$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Object, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $method;
    final /* synthetic */ String $module;
    final /* synthetic */ Map<String, Object> $param;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJSApiProtocolManager$exec$1(Context context, String str, String str2, String str3, Map<String, ? extends Object> map, Function2<Object, ? super ProtocolException, Unit> function2, Continuation<? super KCJSApiProtocolManager$exec$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$source = str;
        this.$module = str2;
        this.$method = str3;
        this.$param = map;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new KCJSApiProtocolManager$exec$1(this.$ctx, this.$source, this.$module, this.$method, this.$param, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((KCJSApiProtocolManager$exec$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
            KCJSApiProtocolManager kCJSApiProtocolManager = KCJSApiProtocolManager.f47500a;
            Context context = this.$ctx;
            String str = this.$source;
            String str2 = this.$module;
            String str3 = this.$method;
            Map<String, ? extends Object> map = this.$param;
            Function2<Object, ProtocolException, Unit> function2 = this.$callback;
            this.label = 1;
            if (kCJSApiProtocolManager.m57894b(context, str, str2, str3, map, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
