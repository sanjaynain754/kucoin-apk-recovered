package com.trtc.uikit.livekit.p180kc.web3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.widget.LiveSmallSwitchButton;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import vd0.C45515b;

/* JADX INFO: compiled from: KCWeb3CardDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\nH\u0002J\u001a\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\fH\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\fH\u0002J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/web3/KCWeb3CardDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "_binding", "Lcom/trtc/uikit/livekit/databinding/LiveKcDialogWeb3CardBinding;", "binding", "getBinding", "()Lcom/trtc/uikit/livekit/databinding/LiveKcDialogWeb3CardBinding;", "roomId", "", "isWeb3CardMounted", "", "isUpdatingSwitchState", "saveCardJob", "Lkotlinx/coroutines/Job;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "initData", "onDisplaySwitchChanged", "checked", "preCheckAndMountWeb3Card", "showUpdateCardConfirmDialog", "tips", "saveWeb3Card", "mount", "cancelPrevious", "rollbackSwitchState", "updateSwitchChecked", "setSwitchEnabled", "enabled", "onDestroyView", "isBottomSheet", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCWeb3CardDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCWeb3CardDialog.kt\ncom/trtc/uikit/livekit/kc/web3/KCWeb3CardDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,239:1\n1#2:240\n*E\n"})
public final class KCWeb3CardDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f79194v0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public C45515b f79195q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public String f79196r0 = "";

    /* JADX INFO: renamed from: s0 */
    public boolean f79197s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f79198t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public InterfaceC41775x1 f79199u0;

    /* JADX INFO: compiled from: KCWeb3CardDialog.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/web3/KCWeb3CardDialog$Companion;", "", "<init>", "()V", "TAG", "", "KEY_IS_WEB3_CARD_MOUNTED", TIMPushProvider.f75062n, "", "activity", "Landroidx/fragment/app/FragmentActivity;", "roomId", "isWeb3CardMounted", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@Nullable FragmentActivity activity, @Nullable String roomId, boolean isWeb3CardMounted) {
            KCWeb3CardDialog kCWeb3CardDialog = new KCWeb3CardDialog();
            Bundle bundle = new Bundle();
            bundle.putString("roomId", roomId);
            bundle.putBoolean("isWeb3CardMounted", isWeb3CardMounted);
            kCWeb3CardDialog.setArguments(bundle);
            kCWeb3CardDialog.m54194t3(activity, "Live_KCWeb3CardDialog");
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m81582G4(KCWeb3CardDialog kCWeb3CardDialog) {
        m81581D4(kCWeb3CardDialog, true, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public final void m81601C4(boolean z11, boolean z12) {
        InterfaceC41775x1 interfaceC41775x1;
        if (z12 && (interfaceC41775x1 = this.f79199u0) != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f79199u0 = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KCWeb3CardDialog$saveWeb3Card$1(this, z11, null), 3, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ void m81581D4(KCWeb3CardDialog kCWeb3CardDialog, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        kCWeb3CardDialog.m81601C4(z11, z12);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m81596w4(KCWeb3CardDialog kCWeb3CardDialog, CompoundButton compoundButton, boolean z11) {
        if (kCWeb3CardDialog.f79198t0) {
            return;
        }
        kCWeb3CardDialog.m81606z4(z11);
    }

    /* JADX INFO: renamed from: A4 */
    public final void m81599A4() {
        InterfaceC41775x1 interfaceC41775x1 = this.f79199u0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f79199u0 = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KCWeb3CardDialog$preCheckAndMountWeb3Card$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m81600B4() {
        m81604I4(this.f79197s0);
        m81602E4(true);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m81603F4(String str) {
        if (KCWeb3UpdateCardConfirmDialog.f79202u0.show(getActivity(), str, new Function0() { // from class: com.trtc.uikit.livekit.kc.web3.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCWeb3CardDialog.m81582G4(this.f79209b);
            }
        }, new Function0() { // from class: com.trtc.uikit.livekit.kc.web3.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCWeb3CardDialog.m81583H4(this.f79210b);
            }
        })) {
            return;
        }
        C44128b.m97261e("Live", "KCWeb3CardDialog: show update card confirm dialog failed");
        m81600B4();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f79195q0 = C45515b.m100500c(inflater, container, false);
        C45515b f79195q0 = getF79195q0();
        if (f79195q0 != null) {
            return f79195q0.getRoot();
        }
        return null;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC41775x1 interfaceC41775x1 = this.f79199u0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f79199u0 = null;
        this.f79195q0 = null;
        super.onDestroyView();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m81597x4();
        m81595v4();
    }

    /* JADX INFO: renamed from: u4, reason: from getter */
    public final C45515b getF79195q0() {
        return this.f79195q0;
    }

    /* JADX INFO: renamed from: z4 */
    public final void m81606z4(boolean z11) {
        if (z11 == this.f79197s0) {
            return;
        }
        if (z11) {
            m81599A4();
        } else {
            m81581D4(this, false, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m81583H4(KCWeb3CardDialog kCWeb3CardDialog) {
        kCWeb3CardDialog.m81600B4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    private final void m81595v4() {
        String string;
        LiveSmallSwitchButton liveSmallSwitchButton;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("roomId");
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        this.f79196r0 = string;
        if (StringsKt.isBlank(string)) {
            C44128b.m97261e("Live", "KCWeb3CardDialog: init display state failed - roomId is blank");
            dismiss();
            return;
        }
        Bundle arguments2 = getArguments();
        boolean z11 = false;
        if (arguments2 != null) {
            z11 = arguments2.getBoolean("isWeb3CardMounted", false);
        }
        this.f79197s0 = z11;
        m81604I4(z11);
        C45515b f79195q0 = getF79195q0();
        if (f79195q0 != null && (liveSmallSwitchButton = f79195q0.f102555e) != null) {
            liveSmallSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.trtc.uikit.livekit.kc.web3.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    KCWeb3CardDialog.m81596w4(this.f79207b, compoundButton, z12);
                }
            });
        }
        C44128b.m97266j("Live", "KCWeb3CardDialog: init display state success - roomId=" + this.f79196r0 + ", isWeb3CardMounted=" + this.f79197s0);
    }

    /* JADX INFO: renamed from: x4 */
    private final void m81597x4() {
        C45515b f79195q0 = getF79195q0();
        if (f79195q0 == null) {
            return;
        }
        f79195q0.f102552b.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.kc.web3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KCWeb3CardDialog.m81598y4(this.f79208b, view);
            }
        });
        ImageView previewCardBackground = f79195q0.f102559i;
        Intrinsics.checkNotNullExpressionValue(previewCardBackground, "previewCardBackground");
        KCWeb3PreviewCardUi.f79211a.m81621a(previewCardBackground);
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m81598y4(KCWeb3CardDialog kCWeb3CardDialog, View view) {
        kCWeb3CardDialog.dismiss();
    }

    /* JADX INFO: renamed from: E4 */
    public final void m81602E4(boolean z11) {
        LiveSmallSwitchButton liveSmallSwitchButton;
        C45515b f79195q0 = getF79195q0();
        if (f79195q0 != null && (liveSmallSwitchButton = f79195q0.f102555e) != null) {
            liveSmallSwitchButton.setEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final void m81604I4(boolean z11) {
        LiveSmallSwitchButton liveSmallSwitchButton;
        C45515b f79195q0 = getF79195q0();
        if (f79195q0 != null && (liveSmallSwitchButton = f79195q0.f102555e) != null) {
            this.f79198t0 = true;
            liveSmallSwitchButton.setChecked(z11);
            this.f79198t0 = false;
        }
    }
}
