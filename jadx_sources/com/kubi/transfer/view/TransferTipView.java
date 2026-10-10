package com.kubi.transfer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c60.C4856j;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.data.coin.AccountType;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: TransferTipView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\"\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017J$\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u0019\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u0017J\u0018\u0010\u001e\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u0017J\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0006\u0010 \u001a\u00020\u0011R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/transfer/view/TransferTipView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferViewTransferTipBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferTipBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coin", "", "setCoin", "", "setAccountTip", "fromType", "Lcom/kubi/data/coin/AccountType;", "toType", "multiAccountMode", "", "setFutureTip", "setFinanceNormalTip", "showUnifyTip", "tipContent", "setAccountMarginTip", "isLiability", "setAccountIsolateTip", "setBothAccountIsolateTip", "hideAllTip", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferTipView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferTipView.kt\ncom/kubi/transfer/view/TransferTipView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,149:1\n41#2:150\n65#2:151\n80#2,7:152\n*S KotlinDebug\n*F\n+ 1 TransferTipView.kt\ncom/kubi/transfer/view/TransferTipView\n*L\n34#1:150\n34#1:151\n34#1:152,7\n*E\n"})
public final class TransferTipView extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f52976p = {Reflection.property1(new PropertyReference1Impl(TransferTipView.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferTipBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f52977n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public String f52978o;

    /* JADX INFO: renamed from: l */
    public final boolean m64839l(AccountType accountType, AccountType accountType2, boolean z11) {
        TextView textView;
        ShapeLinearLayout shapeLinearLayout;
        if ((!z11 && accountType != AccountType.MAIN) || accountType2 != AccountType.CONTRACT) {
            return false;
        }
        C4856j binding = getBinding();
        if (binding != null && (shapeLinearLayout = binding.f5014e) != null) {
            shapeLinearLayout.setVisibility(0);
        }
        C4856j binding2 = getBinding();
        if (binding2 == null || (textView = binding2.f5018i) == null) {
            return true;
        }
        textView.setText(C27017c.f54310a.m66516f(R$string.transfer_to_contract_tip, new Object[0]));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferTipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52977n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4856j>() { // from class: com.kubi.transfer.view.TransferTipView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4856j invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4856j.m4986a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.btransfer_view_transfer_tip, this);
    }

    private final C4856j getBinding() {
        return (C4856j) this.f52977n.getValue(this, f52976p[0]);
    }

    /* JADX INFO: renamed from: g */
    public final void m64834g(@Nullable AccountType accountType, boolean z11) {
        TextView textView;
        TextView textView2;
        ShapeConstraintLayout shapeConstraintLayout;
        if (z11 && accountType == AccountType.ISOLATED) {
            C4856j binding = getBinding();
            if (binding != null && (shapeConstraintLayout = binding.f5013d) != null) {
                shapeConstraintLayout.setVisibility(0);
            }
            C4856j binding2 = getBinding();
            if (binding2 != null && (textView2 = binding2.f5017h) != null) {
                textView2.setText(C27017c.f54310a.m66516f(R$string.lever_trasnsfer_status_text, new Object[0]));
            }
            C4856j binding3 = getBinding();
            if (binding3 == null || (textView = binding3.f5016g) == null) {
                return;
            }
            textView.setText(C27017c.f54310a.m66516f(R$string.lever_trasnsfer_tips, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m64835h(@Nullable AccountType accountType, boolean z11) {
        TextView textView;
        TextView textView2;
        ShapeConstraintLayout shapeConstraintLayout;
        if (z11 && accountType == AccountType.MARGIN) {
            C4856j binding = getBinding();
            if (binding != null && (shapeConstraintLayout = binding.f5013d) != null) {
                shapeConstraintLayout.setVisibility(0);
            }
            C4856j binding2 = getBinding();
            if (binding2 != null && (textView2 = binding2.f5017h) != null) {
                textView2.setText(C27017c.f54310a.m66516f(R$string.lever_trasnsfer_status_text, new Object[0]));
            }
            C4856j binding3 = getBinding();
            if (binding3 == null || (textView = binding3.f5016g) == null) {
                return;
            }
            textView.setText(C27017c.f54310a.m66516f(R$string.lever_trasnsfer_tips, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m64838k(AccountType accountType, AccountType accountType2) {
        AlertTipsTextView alertTipsTextView;
        AlertTipsTextView alertTipsTextView2;
        AccountType accountType3 = AccountType.SAVINGS;
        if (accountType != accountType3 && accountType2 != accountType3) {
            return false;
        }
        C4856j binding = getBinding();
        if (binding != null && (alertTipsTextView2 = binding.f5011b) != null) {
            alertTipsTextView2.setVisibility(0);
        }
        C4856j binding2 = getBinding();
        if (binding2 == null || (alertTipsTextView = binding2.f5011b) == null) {
            return true;
        }
        alertTipsTextView.setText(C27017c.f54310a.m66516f(R$string.kc_transferpro_earn_tip, new Object[0]));
        return true;
    }

    public final void setCoin(@Nullable String coin) {
        this.f52978o = coin;
    }

    /* JADX INFO: renamed from: f */
    public final void m64833f() {
        AlertTipsTextView alertTipsTextView;
        ShapeLinearLayout shapeLinearLayout;
        ShapeConstraintLayout shapeConstraintLayout;
        C4856j binding = getBinding();
        if (binding != null && (shapeConstraintLayout = binding.f5013d) != null) {
            shapeConstraintLayout.setVisibility(8);
        }
        C4856j binding2 = getBinding();
        if (binding2 != null && (shapeLinearLayout = binding2.f5014e) != null) {
            shapeLinearLayout.setVisibility(8);
        }
        C4856j binding3 = getBinding();
        if (binding3 != null && (alertTipsTextView = binding3.f5011b) != null) {
            alertTipsTextView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m64836i(@Nullable AccountType accountType, @Nullable AccountType accountType2, boolean z11) {
        if (m64839l(accountType, accountType2, z11)) {
            return;
        }
        m64838k(accountType, accountType2);
    }

    /* JADX INFO: renamed from: j */
    public final void m64837j(@Nullable AccountType accountType, @Nullable AccountType accountType2) {
        String strM66516f;
        AlertTipsTextView alertTipsTextView;
        TextView textView;
        ShapeLinearLayout shapeLinearLayout;
        C4856j binding = getBinding();
        if (binding != null && (shapeLinearLayout = binding.f5014e) != null) {
            shapeLinearLayout.setVisibility(0);
        }
        AccountType accountType3 = AccountType.ISOLATED;
        if (accountType == accountType3 && accountType2 == accountType3) {
            strM66516f = C27017c.f54310a.m66516f(R$string.transfer_nocoin_tip, new Object[0]);
        } else if (accountType2 == AccountType.SAVINGS) {
            C4856j binding2 = getBinding();
            if (binding2 != null && (alertTipsTextView = binding2.f5011b) != null) {
                ViewExtKt.m66577h(alertTipsTextView);
            }
            strM66516f = C27017c.f54310a.m66516f(R$string.kc_transferpro_earn_amount_empty, new Object[0]);
        } else {
            strM66516f = C27017c.f54310a.m66516f(R$string.transfer_nosupport_tip, new Object[0]);
        }
        C4856j binding3 = getBinding();
        if (binding3 != null && (textView = binding3.f5018i) != null) {
            textView.setText(strM66516f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m64840m(@Nullable String str) {
        AlertTipsTextView alertTipsTextView;
        AlertTipsTextView alertTipsTextView2;
        boolean z11;
        C4856j binding = getBinding();
        if (binding != null && (alertTipsTextView2 = binding.f5019j) != null) {
            if (str != null && str.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            C26268b.m64515d(alertTipsTextView2, true ^ z11);
        }
        C4856j binding2 = getBinding();
        if (binding2 != null && (alertTipsTextView = binding2.f5019j) != null) {
            alertTipsTextView.setText(str);
        }
    }
}
