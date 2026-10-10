package com.kubi.sdk.protocol.hybrid;

import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeShareGalleryDataEntity;
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

/* JADX INFO: compiled from: KCHybridProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareGalleryDataEntity;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareGalleryDataEntity;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager$_exec$data$1", m90122f = "KCHybridProtocolManager.kt", m90123i = {}, m90124l = {1423}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCHybridProtocolManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridProtocolManager.kt\ncom/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$data$1\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,1414:1\n32#2,3:1415\n1#3:1418\n177#4,5:1419\n*S KotlinDebug\n*F\n+ 1 KCHybridProtocolManager.kt\ncom/kubi/sdk/protocol/hybrid/KCHybridProtocolManager$_exec$data$1\n*L\n824#1:1415,3\n828#1:1419,5\n*E\n"})
public final class KCHybridProtocolManager$_exec$data$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super KCHybridBridgeShareGalleryDataEntity>, Object> {
    final /* synthetic */ Map<String, Object> $arguments;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHybridProtocolManager$_exec$data$1(Map<String, ? extends Object> map, Continuation<? super KCHybridProtocolManager$_exec$data$1> continuation) {
        super(2, continuation);
        this.$arguments = map;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new KCHybridProtocolManager$_exec$data$1(this.$arguments, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super KCHybridBridgeShareGalleryDataEntity> continuation) {
        return ((KCHybridProtocolManager$_exec$data$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Object obj2 = this.$arguments.get("data");
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
                    InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90890N(C41636g.m90887K(new C24001xc8e38f2c(string, null)), C41782z0.m91392b()), new C24002xc8e38f2d(null));
                    this.label = 1;
                    obj = C41636g.m90914f0(interfaceC41634eM90917h, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return null;
        }
        return (KCHybridBridgeShareGalleryDataEntity) obj;
    }
}
