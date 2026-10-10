package com.trtc.uikit.livekit.features.anchorboardcast;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.view.settings.SettingsPanelDialog;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveEntranceConfigEntity;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchorView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.AnchorView$initSettingsPanel$1$1$1", m90122f = "AnchorView.kt", m90123i = {}, m90124l = {864}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AnchorView$initSettingsPanel$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnchorStore $it;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ AnchorView this$0;

    /* JADX INFO: renamed from: f */
    public static final void m80149f(View view, DialogInterface dialogInterface) {
        view.setEnabled(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorView$initSettingsPanel$1$1$1(AnchorView anchorView, View view, AnchorStore anchorStore, Continuation<? super AnchorView$initSettingsPanel$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = anchorView;
        this.$view = view;
        this.$it = anchorStore;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnchorView$initSettingsPanel$1$1$1(this.this$0, this.$view, this.$it, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AnchorView$initSettingsPanel$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            AnchorView anchorView = this.this$0;
            this.label = 1;
            obj = anchorView.m80086J1(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        LiveEntranceConfigEntity liveEntranceConfigEntity = (LiveEntranceConfigEntity) obj;
        if (!this.this$0.f78037R) {
            Context f78197b = this.this$0.getF78197b();
            AnchorStore anchorStore = this.$it;
            LiveCoreView liveCoreView = this.this$0.f78050q;
            if (liveCoreView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveCoreView");
                liveCoreView = null;
            }
            SettingsPanelDialog settingsPanelDialog = new SettingsPanelDialog(f78197b, anchorStore, liveCoreView, liveEntranceConfigEntity);
            final View view = this.$view;
            settingsPanelDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.j0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AnchorView$initSettingsPanel$1$1$1.m80149f(view, dialogInterface);
                }
            });
            settingsPanelDialog.show();
            return Unit.INSTANCE;
        }
        this.$view.setEnabled(true);
        return Unit.INSTANCE;
    }
}
