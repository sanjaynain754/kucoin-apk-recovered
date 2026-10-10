package com.kubi.assets.exchange.p075ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.exchange.p075ui.dialog.ConfirmConvertDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import java.math.BigDecimal;
import java.util.Arrays;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44871u;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ConfirmConvertDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/dialog/ConfirmConvertDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogConfirmConvertBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogConfirmConvertBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "confirmAction", "Lkotlin/Function0;", "", "getConfirmAction", "()Lkotlin/jvm/functions/Function0;", "setConfirmAction", "(Lkotlin/jvm/functions/Function0;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initListener", "getConvertTip", "", "isBottomSheet", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConfirmConvertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmConvertDialog.kt\ncom/kubi/assets/exchange/ui/dialog/ConfirmConvertDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,95:1\n143#2,20:96\n*S KotlinDebug\n*F\n+ 1 ConfirmConvertDialog.kt\ncom/kubi/assets/exchange/ui/dialog/ConfirmConvertDialog\n*L\n26#1:96,20\n*E\n"})
public final class ConfirmConvertDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ KProperty<Object>[] f17289s0 = {Reflection.property1(new PropertyReference1Impl(ConfirmConvertDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogConfirmConvertBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f17290q0 = C45681e.m100799e(this, new Function1<ConfirmConvertDialog, C44871u>() { // from class: com.kubi.assets.exchange.ui.dialog.ConfirmConvertDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44871u invoke(@NotNull ConfirmConvertDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44871u.m99266a(fragment.requireView());
        }
    }, new Function1<C44871u, Unit>() { // from class: com.kubi.assets.exchange.ui.dialog.ConfirmConvertDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44871u it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44871u c44871u) {
            invoke(c44871u);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function0<Unit> f17291r0;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m16509p4(ConfirmConvertDialog confirmConvertDialog) {
        Function0<Unit> function0 = confirmConvertDialog.f17291r0;
        if (function0 != null) {
            function0.invoke();
        }
        confirmConvertDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public final C44871u m16510l4() {
        return (C44871u) this.f17290q0.getValue(this, f17289s0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_confirm_convert, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m16507n4();
    }

    /* JADX INFO: renamed from: q4 */
    public final void m16512q4(@Nullable Function0<Unit> function0) {
        this.f17291r0 = function0;
    }

    private final void initView() {
        String string;
        String string2;
        String string3;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("data_1");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("data_2");
        } else {
            string3 = null;
        }
        C44871u c44871uM16510l4 = m16510l4();
        if (c44871uM16510l4 != null && (baseTextView5 = c44871uM16510l4.f100918h) != null) {
            BigDecimal bigDecimalAdd = DowngradeExKt.m66535e(string, null, 1, null).add(DowngradeExKt.m66535e(string2, null, 1, null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            baseTextView5.setText(C42828b.m93906g(C37886j.m85578b(bigDecimalAdd, "KCS", null, false, false, false, 0, null, 0, 254, null), "KCS", true, false, 4, null));
        }
        C44871u c44871uM16510l5 = m16510l4();
        if (c44871uM16510l5 != null && (baseTextView4 = c44871uM16510l5.f100915e) != null) {
            baseTextView4.setText(C42828b.m93906g(C37886j.m85578b(DowngradeExKt.m66535e(string2, null, 1, null), "KCS", null, false, false, false, 0, null, 0, 254, null), "KCS", true, false, 4, null));
        }
        C44871u c44871uM16510l6 = m16510l4();
        if (c44871uM16510l6 != null && (baseTextView3 = c44871uM16510l6.f100921k) != null) {
            baseTextView3.setText(C42828b.m93906g(C37886j.m85578b(DowngradeExKt.m66535e(string, null, 1, null), "KCS", null, false, false, false, 0, null, 0, 254, null), "KCS", true, false, 4, null));
        }
        C44871u c44871uM16510l7 = m16510l4();
        if (c44871uM16510l7 != null && (baseTextView2 = c44871uM16510l7.f100917g) != null) {
            baseTextView2.setText(m16511m4());
        }
        if (string3 != null && string3.length() != 0) {
            C44871u c44871uM16510l8 = m16510l4();
            if (c44871uM16510l8 != null && (baseTextView = c44871uM16510l8.f100916f) != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string4 = getString(R$string.kc_convert_fee_tip);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String str = String.format(string4, Arrays.copyOf(new Object[]{string3}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                baseTextView.setText(str);
            }
        }
    }

    /* JADX INFO: renamed from: n4 */
    private final void m16507n4() {
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton;
        C44871u c44871uM16510l4 = m16510l4();
        if (c44871uM16510l4 != null && (kcSecondaryButton = c44871uM16510l4.f100913c) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: ya.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConfirmConvertDialog.m16508o4(this.f104089b);
                }
            }, 1, null);
        }
        C44871u c44871uM16510l5 = m16510l4();
        if (c44871uM16510l5 != null && (kcPrimaryButton = c44871uM16510l5.f100914d) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: ya.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConfirmConvertDialog.m16509p4(this.f104090b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m16508o4(ConfirmConvertDialog confirmConvertDialog) {
        confirmConvertDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public final String m16511m4() {
        String string;
        String string2;
        Context context = getContext();
        String string3 = null;
        if (context == null) {
            return null;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("page");
        } else {
            string = null;
        }
        if (Intrinsics.areEqual(string, "MAIN")) {
            string2 = context.getString(R$string.save_account);
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                string3 = arguments2.getString("page");
            }
            if (Intrinsics.areEqual(string3, "TRADE")) {
                string2 = context.getString(R$string.trade_account);
            } else if (IUnifyAccountService.f53155a.get().mo64979C()) {
                string2 = context.getString(R$string.margin_single_account);
            } else {
                string2 = context.getString(R$string.margin_whole_account);
            }
        }
        Intrinsics.checkNotNull(string2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string4 = context.getString(R$string.kc_convert_account_tip);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
