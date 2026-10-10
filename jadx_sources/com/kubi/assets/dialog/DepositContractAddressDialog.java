package com.kubi.assets.dialog;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5283m0;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27057k;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44899y;
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

/* JADX INFO: compiled from: DepositContractAddressDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/dialog/DepositContractAddressDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogDepositContractAddressBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogDepositContractAddressBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "contractAddress", "", "initListener", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDepositContractAddressDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepositContractAddressDialog.kt\ncom/kubi/assets/dialog/DepositContractAddressDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,67:1\n143#2,20:68\n*S KotlinDebug\n*F\n+ 1 DepositContractAddressDialog.kt\ncom/kubi/assets/dialog/DepositContractAddressDialog\n*L\n30#1:68,20\n*E\n"})
public final class DepositContractAddressDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ KProperty<Object>[] f16932r0 = {Reflection.property1(new PropertyReference1Impl(DepositContractAddressDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogDepositContractAddressBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16933q0 = C45681e.m100799e(this, new Function1<DepositContractAddressDialog, C44899y>() { // from class: com.kubi.assets.dialog.DepositContractAddressDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44899y invoke(@NotNull DepositContractAddressDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44899y.m99322a(fragment.requireView());
        }
    }, new Function1<C44899y, Unit>() { // from class: com.kubi.assets.dialog.DepositContractAddressDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44899y it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44899y c44899y) {
            invoke(c44899y);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: n4 */
    public static final Unit m16000n4(DepositContractAddressDialog depositContractAddressDialog, String str) {
        C27057k.m66746b(depositContractAddressDialog.getString(R$string.deposit_info_contract_address) + ": " + str);
        Context context = depositContractAddressDialog.getContext();
        Object systemService = context != null ? context.getSystemService("vibrator") : null;
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(100L);
        }
        C5283m0.m6289p(depositContractAddressDialog.getString(R$string.copy_success), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public final C44899y m16002l4() {
        return (C44899y) this.f16933q0.getValue(this, f16932r0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_deposit_contract_address, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "contractAddress") : null;
        m16003p4(strM56284y);
        m15999m4(strM56284y);
    }

    /* JADX INFO: renamed from: m4 */
    private final void m15999m4(final String str) {
        KcSecondaryButton kcSecondaryButton;
        ImageView imageView;
        C44899y c44899yM16002l4 = m16002l4();
        if (c44899yM16002l4 != null && (imageView = c44899yM16002l4.f101161b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.dialog.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DepositContractAddressDialog.m16000n4(this.f17138b, str);
                }
            }, 1, null);
        }
        C44899y c44899yM16002l5 = m16002l4();
        if (c44899yM16002l5 != null && (kcSecondaryButton = c44899yM16002l5.f101162c) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DepositContractAddressDialog.m16001o4(this.f17142b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m16001o4(DepositContractAddressDialog depositContractAddressDialog) {
        depositContractAddressDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m16003p4(String str) {
        C44899y c44899yM16002l4;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C44899y c44899yM16002l5 = m16002l4();
        if (c44899yM16002l5 != null && (baseTextView2 = c44899yM16002l5.f101164e) != null) {
            baseTextView2.setText(C27041f.m66668h(str));
        }
        Context context = getContext();
        if (context != null && (c44899yM16002l4 = m16002l4()) != null && (baseTextView = c44899yM16002l4.f101163d) != null) {
            HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.brandRed)));
        }
    }
}
