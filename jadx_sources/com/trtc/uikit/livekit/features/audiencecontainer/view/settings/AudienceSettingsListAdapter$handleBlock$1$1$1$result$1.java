package com.trtc.uikit.livekit.features.audiencecontainer.view.settings;

import com.kubi.utils.extensions.C27025c;
import com.trtc.uikit.livekit.p180kc.data.entity.BlockUser;
import je0.C40397b;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AudienceSettingsListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.settings.AudienceSettingsListAdapter$handleBlock$1$1$1$result$1", m90122f = "AudienceSettingsListAdapter.kt", m90123i = {0}, m90124l = {200}, m90125m = "invokeSuspend", m90126n = {"roomId"}, m90127s = {"L$0"})
public final class AudienceSettingsListAdapter$handleBlock$1$1$1$result$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AudienceSettingsListAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceSettingsListAdapter$handleBlock$1$1$1$result$1(AudienceSettingsListAdapter audienceSettingsListAdapter, Continuation<? super AudienceSettingsListAdapter$handleBlock$1$1$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = audienceSettingsListAdapter;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudienceSettingsListAdapter$handleBlock$1$1$1$result$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((AudienceSettingsListAdapter$handleBlock$1$1$1$result$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
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
            String liveID = this.this$0.f78956j.getF82419a().getLiveState().getCurrentLive().getValue().getLiveID();
            InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
            BlockUser.Request request = new BlockUser.Request(liveID);
            this.L$0 = SpillingKt.nullOutSpilledVariable(liveID);
            this.label = 1;
            obj = interfaceC42178aM89024b.m92627o(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Boxing.boxBoolean(C27025c.m66566d((Boolean) obj));
    }
}
