package com.kubi.futures.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36812o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p236em.C37214b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: CollectUserExperienceDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/dialog/CollectUserExperienceDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogOpenFuturesTradingGuideBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogOpenFuturesTradingGuideBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "trackConfirm", "showOpenFuturesTradingSuccessDialog", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCollectUserExperienceDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectUserExperienceDialog.kt\ncom/kubi/futures/dialog/CollectUserExperienceDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,84:1\n143#2,20:85\n*S KotlinDebug\n*F\n+ 1 CollectUserExperienceDialog.kt\ncom/kubi/futures/dialog/CollectUserExperienceDialog\n*L\n24#1:85,20\n*E\n"})
public final class CollectUserExperienceDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f22761d0 = {Reflection.property1(new PropertyReference1Impl(CollectUserExperienceDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogOpenFuturesTradingGuideBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f22762c0 = C45681e.m100799e(this, new Function1<CollectUserExperienceDialog, C36812o0>() { // from class: com.kubi.futures.dialog.CollectUserExperienceDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36812o0 invoke(@NotNull CollectUserExperienceDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36812o0.m82485a(fragment.requireView());
        }
    }, new Function1<C36812o0, Unit>() { // from class: com.kubi.futures.dialog.CollectUserExperienceDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36812o0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36812o0 c36812o0) {
            invoke(c36812o0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: B3 */
    public final C36812o0 m25056B3() {
        return (C36812o0) this.f22762c0.getValue(this, f22761d0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54250y3(-1);
        View viewInflate = inflater.inflate(R$layout.bkumex_dialog_open_futures_trading_guide, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36812o0 c36812o0M25056B3 = m25056B3();
        if (c36812o0M25056B3 == null) {
            return;
        }
        C43852m.m96595g(C17060n0.m36552b(), "OpenContract", "1", null, 8, null);
        m54191p3();
        ImageView close = c36812o0M25056B3.f80697b;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.dialog.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectUserExperienceDialog.m25052C3(this.f22836b);
            }
        }, 1, null);
        KcPrimaryButton confirm = c36812o0M25056B3.f80698c;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.dialog.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectUserExperienceDialog.m25053D3(this.f22839b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m25052C3(CollectUserExperienceDialog collectUserExperienceDialog) {
        collectUserExperienceDialog.m25057E3();
        collectUserExperienceDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m25053D3(CollectUserExperienceDialog collectUserExperienceDialog) {
        collectUserExperienceDialog.m25057E3();
        collectUserExperienceDialog.m25054F3();
        collectUserExperienceDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    private final void m25054F3() {
        String str;
        C36812o0 c36812o0M25056B3 = m25056B3();
        if (c36812o0M25056B3 == null) {
            return;
        }
        if (c36812o0M25056B3.f80700e.isChecked()) {
            str = "Beginner";
        } else if (c36812o0M25056B3.f80701f.isChecked()) {
            str = "Experienced";
        } else {
            str = "Expert";
        }
        C43852m.m96589a(C17060n0.m36552b(), "OpenContract", "TryNow", new JSONObject().put("reportType", str));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m25057E3() {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            if (!supportFragmentManager.isDestroyed()) {
                try {
                    OpenFuturesTradingSuccessDialog openFuturesTradingSuccessDialog = new OpenFuturesTradingSuccessDialog();
                    openFuturesTradingSuccessDialog.setArguments(openFuturesTradingSuccessDialog.getArguments());
                    Intrinsics.checkNotNull(supportFragmentManager);
                    openFuturesTradingSuccessDialog.show(supportFragmentManager, "OpenFuturesTradingSuccessDialog");
                } catch (Throwable th2) {
                    C37214b.m83255a(th2, "CollectUserExperienceDialog-onDestroyView");
                }
            }
        }
    }
}
