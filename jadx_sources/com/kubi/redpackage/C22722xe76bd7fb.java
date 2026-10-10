package com.kubi.redpackage;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.redpackage.RedPackageHelperKt$getRedPacketInner$1$invokeSuspend$$inlined$bindFlowEvent$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$2"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.redpackage.RedPackageHelperKt$getRedPacketInner$1$invokeSuspend$$inlined$bindFlowEvent$1", m90122f = "RedPackageHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$2\n+ 2 RedPackageHelper.kt\ncom/kubi/redpackage/RedPackageHelperKt$getRedPacketInner$1\n*L\n1#1,187:1\n82#2:188\n*E\n"})
public final class C22722xe76bd7fb extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ Function1 $result$inlined;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22722xe76bd7fb(String str, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.$key = str;
        this.$result$inlined = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C22722xe76bd7fb c22722xe76bd7fb = new C22722xe76bd7fb(this.$key, continuation, this.$result$inlined);
        c22722xe76bd7fb.L$0 = obj;
        return c22722xe76bd7fb;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C22722xe76bd7fb) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key)) {
                    C44128b.m97259c("FlowEventBus", Intrinsics.stringPlus("bindFlowEvent:", this.$key));
                    if (c43460a.getData() instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) c43460a.getData();
                        Function1 function1 = this.$result$inlined;
                        if (function1 != null) {
                            function1.invoke(jSONObject);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
