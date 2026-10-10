package com.trtc.uikit.livekit.features.audiencecontainer.view.settings;

import com.kubi.utils.ToastCompat;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.livestream.VideoLiveKit;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import ne0.C42817b;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AudienceSettingsListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.settings.AudienceSettingsListAdapter$handleBlock$1$1$1", m90122f = "AudienceSettingsListAdapter.kt", m90123i = {}, m90124l = {196}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAudienceSettingsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudienceSettingsListAdapter.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$handleBlock$1$1$1\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,230:1\n43#2,4:231\n*S KotlinDebug\n*F\n+ 1 AudienceSettingsListAdapter.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$handleBlock$1$1$1\n*L\n208#1:231,4\n*E\n"})
public final class AudienceSettingsListAdapter$handleBlock$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AudienceSettingsListAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceSettingsListAdapter$handleBlock$1$1$1(AudienceSettingsListAdapter audienceSettingsListAdapter, Continuation<? super AudienceSettingsListAdapter$handleBlock$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = audienceSettingsListAdapter;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudienceSettingsListAdapter$handleBlock$1$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AudienceSettingsListAdapter$handleBlock$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
                AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
                AudienceSettingsListAdapter$handleBlock$1$1$1$result$1 audienceSettingsListAdapter$handleBlock$1$1$1$result$1 = new AudienceSettingsListAdapter$handleBlock$1$1$1$result$1(this.this$0, null);
                this.label = 1;
                obj = C41686h.m91049g(abstractC41697j0M91392b, audienceSettingsListAdapter$handleBlock$1$1$1$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                ToastCompat.m66437C(R$string.platform_live_block_dialog_toast);
                VideoLiveKit.f79324a.createInstance(this.this$0.f78955i).mo81736a(null);
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C42817b.m93883b(e11, "AudienceSettingsListAdapter#handleBlock");
            }
        }
        return Unit.INSTANCE;
    }
}
