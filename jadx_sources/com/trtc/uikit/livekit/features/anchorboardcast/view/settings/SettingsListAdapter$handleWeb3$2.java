package com.trtc.uikit.livekit.features.anchorboardcast.view.settings;

import androidx.appcompat.app.AppCompatActivity;
import com.trtc.uikit.livekit.p180kc.web3.KCWeb3CardDialog;
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
import ro.C44128b;

/* JADX INFO: compiled from: SettingsListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.settings.SettingsListAdapter$handleWeb3$2", m90122f = "SettingsListAdapter.kt", m90123i = {}, m90124l = {316}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSettingsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsListAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$handleWeb3$2\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,348:1\n43#2,4:349\n*S KotlinDebug\n*F\n+ 1 SettingsListAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$handleWeb3$2\n*L\n330#1:349,4\n*E\n"})
public final class SettingsListAdapter$handleWeb3$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppCompatActivity $activity;
    final /* synthetic */ String $roomId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsListAdapter$handleWeb3$2(String str, AppCompatActivity appCompatActivity, Continuation<? super SettingsListAdapter$handleWeb3$2> continuation) {
        super(2, continuation);
        this.$roomId = str;
        this.$activity = appCompatActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsListAdapter$handleWeb3$2(this.$roomId, this.$activity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SettingsListAdapter$handleWeb3$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1 settingsListAdapter$handleWeb3$2$isWeb3CardMounted$1 = new SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1(this.$roomId, null);
                this.label = 1;
                obj = C41686h.m91049g(abstractC41697j0M91392b, settingsListAdapter$handleWeb3$2$isWeb3CardMounted$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C44128b.m97266j("Live", "SettingsListAdapter: load web3 card info success - roomId=" + this.$roomId + ", isWeb3CardMounted=" + zBooleanValue);
            KCWeb3CardDialog.f79194v0.show(this.$activity, this.$roomId, zBooleanValue);
        } catch (Exception e11) {
            C44128b.m97261e("Live", "SettingsListAdapter: load web3 card info failed - " + e11.getMessage());
            if (!C42899b.m94075e(e11)) {
                C42817b.m93883b(e11, "SettingsListAdapter#handleWeb3");
            }
        }
        return Unit.INSTANCE;
    }
}
