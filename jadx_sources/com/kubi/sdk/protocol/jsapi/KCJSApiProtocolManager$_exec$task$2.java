package com.kubi.sdk.protocol.jsapi;

import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSocketJsPollingSocketTaskParams;
import com.kubi.utils.C27099x;
import java.util.Map;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCJSApiProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPollingSocketTaskParams;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSocketJsPollingSocketTaskParams;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager$_exec$task$2", m90122f = "KCJSApiProtocolManager.kt", m90123i = {}, m90124l = {5430}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCJSApiProtocolManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiProtocolManager.kt\ncom/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$task$2\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,5421:1\n32#2,3:5422\n1#3:5425\n177#4,5:5426\n*S KotlinDebug\n*F\n+ 1 KCJSApiProtocolManager.kt\ncom/kubi/sdk/protocol/jsapi/KCJSApiProtocolManager$_exec$task$2\n*L\n4025#1:5422,3\n4029#1:5426,5\n*E\n"})
public final class KCJSApiProtocolManager$_exec$task$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super KCJSApiSocketJsPollingSocketTaskParams>, Object> {
    final /* synthetic */ Map<String, Object> $arguments;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCJSApiProtocolManager$_exec$task$2(Map<String, ? extends Object> map, Continuation<? super KCJSApiProtocolManager$_exec$task$2> continuation) {
        super(2, continuation);
        this.$arguments = map;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new KCJSApiProtocolManager$_exec$task$2(this.$arguments, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super KCJSApiSocketJsPollingSocketTaskParams> continuation) {
        return ((KCJSApiProtocolManager$_exec$task$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String string;
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
            Object obj2 = this.$arguments.get("task");
            if (obj2 != null) {
                if (obj2 instanceof Map) {
                    string = C27099x.m66919i(obj2, false, 2, null);
                    if (string == null) {
                        string = "";
                    }
                } else {
                    string = obj2.toString();
                }
                if (string != null) {
                    C27099x c27099x = C27099x.f54458a;
                    InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90890N(C41636g.m90887K(new C24049x1f393f6b(string, null)), C41782z0.m91392b()), new C24050x1f393f6c(null));
                    this.label = 1;
                    obj = C41636g.m90914f0(interfaceC41634eM90917h, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return null;
        }
        return (KCJSApiSocketJsPollingSocketTaskParams) obj;
    }
}
