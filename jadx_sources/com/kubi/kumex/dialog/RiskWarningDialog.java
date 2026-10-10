package com.kubi.kumex.dialog;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36872y0;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: RiskWarningDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/dialog/RiskWarningDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogRiskWarningBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogRiskWarningBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRiskWarningDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiskWarningDialog.kt\ncom/kubi/kumex/dialog/RiskWarningDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,133:1\n143#2,20:134\n*S KotlinDebug\n*F\n+ 1 RiskWarningDialog.kt\ncom/kubi/kumex/dialog/RiskWarningDialog\n*L\n80#1:134,20\n*E\n"})
public final class RiskWarningDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f28867q0 = C45681e.m100799e(this, new Function1<RiskWarningDialog, C36872y0>() { // from class: com.kubi.kumex.dialog.RiskWarningDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36872y0 invoke(@NotNull RiskWarningDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36872y0.m82612a(fragment.requireView());
        }
    }, new Function1<C36872y0, Unit>() { // from class: com.kubi.kumex.dialog.RiskWarningDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36872y0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36872y0 c36872y0) {
            invoke(c36872y0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f28866s0 = {Reflection.property1(new PropertyReference1Impl(RiskWarningDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogRiskWarningBinding;", 0))};

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f28865r0 = new Companion(null);

    /* JADX INFO: compiled from: RiskWarningDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kumex/dialog/RiskWarningDialog$Companion;", "", "<init>", "()V", "newInstance", "Landroidx/fragment/app/DialogFragment;", "showIfNeeded", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "hasShownRiskWarning", "markRiskWarningAsShown", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRiskWarningDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiskWarningDialog.kt\ncom/kubi/kumex/dialog/RiskWarningDialog$Companion\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,133:1\n136#2:134\n126#2,2:135\n*S KotlinDebug\n*F\n+ 1 RiskWarningDialog.kt\ncom/kubi/kumex/dialog/RiskWarningDialog$Companion\n*L\n68#1:134\n76#1:135,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m33555a() {
            return C46392a.m102322d(C46894j.f104736a.m103251P(), false);
        }

        /* JADX INFO: renamed from: b */
        public final void m33556b() {
            C46392a.m102328k(C46894j.f104736a.m103251P(), true);
        }

        @NotNull
        public final DialogFragment newInstance() {
            return new RiskWarningDialog();
        }

        public final boolean showIfNeeded(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            if (m33555a()) {
                return false;
            }
            m33556b();
            newInstance().show(fragmentManager, "RiskWarningDialog");
            return true;
        }
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m33551n4(TextView textView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setColor(ContextCompat.getColor(textView.getContext(), R$color.emphasis));
        ds2.setUnderlineText(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m33552o4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/support/48142946141603", null, null, null, null, null, null, 126, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: m4 */
    public final C36872y0 m33554m4() {
        return (C36872y0) this.f28867q0.getValue(this, f28866s0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_risk_warning, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R$id.tvTitle);
        final TextView textView2 = (TextView) view.findViewById(R$id.tvContent);
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) view.findViewById(R$id.confirm);
        if (m33554m4() == null) {
            dismissAllowingStateLoss();
            return;
        }
        textView.setText(getString(R$string.danger_tips));
        textView2.setText(getString(R$string.kc_futures_us_stock_tips, getString(R$string.kc_futures_us_stock_tips_rue)));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView2);
        highlightTextHelper.m54120f(textView2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.kumex.dialog.k2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiskWarningDialog.m33551n4(textView2, (TextPaint) obj);
            }
        }, new View.OnClickListener() { // from class: com.kubi.kumex.dialog.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RiskWarningDialog.m33552o4(view2);
            }
        })));
        kcPrimaryButton.setText(getString(R$string.already_know));
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kumex.dialog.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiskWarningDialog.m33553p4(this.f28948b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m33553p4(RiskWarningDialog riskWarningDialog) {
        riskWarningDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
