package com.kubi.transfer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c60.C4852f;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.perf.util.Constants;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.lib.R$drawable;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.transfer.view.TransferAccountView;
import com.kubi.utils.C27015b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.functions.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: TransferAccountView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0011J\u0010\u0010(\u001a\u00020#2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010)\u001a\u00020#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aJ*\u0010*\u001a\u00020#2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,J\u0014\u0010/\u001a\u00020#2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,H\u0002J\u000e\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020&J\u000e\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020&R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u00064"}, m90084d2 = {"Lcom/kubi/transfer/view/TransferAccountView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferViewTransferAccountBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferAccountBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fromType", "Lcom/kubi/data/coin/AccountType;", "getFromType", "()Lcom/kubi/data/coin/AccountType;", "setFromType", "(Lcom/kubi/data/coin/AccountType;)V", "toType", "getToType", "setToType", "fromSymbolBean", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getFromSymbolBean", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "setFromSymbolBean", "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "toSymbolBean", "getToSymbolBean", "setToSymbolBean", "setFromAccount", "", JAnalysisConstants.Account.KEY_ACCOUNT, "isMultiAccountModel", "", "setToAccount", "setFromAccountPairName", "setToAccountPairName", "bindActionEvent", "fromAction", "Lio/reactivex/functions/Action;", "toAction", "changeAction", "exchangeAccount", "setAccountEnable", Constants.ENABLE_DISABLE, "showExchange", "isShow", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferAccountView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferAccountView.kt\ncom/kubi/transfer/view/TransferAccountView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n52#2:150\n80#2,7:151\n1#3:158\n*S KotlinDebug\n*F\n+ 1 TransferAccountView.kt\ncom/kubi/transfer/view/TransferAccountView\n*L\n31#1:150\n31#1:151,7\n*E\n"})
public final class TransferAccountView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f52950g = {Reflection.property1(new PropertyReference1Impl(TransferAccountView.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferAccountBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f52951b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public AccountType f52952c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public AccountType f52953d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public SymbolInfoEntity f52954e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public SymbolInfoEntity f52955f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferAccountView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m64787g(Action action) throws Exception {
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    private final C4852f getBinding() {
        return (C4852f) this.f52951b.getValue(this, f52950g[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m64788h(Action action) throws Exception {
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getFromSymbolBean, reason: from getter */
    public final SymbolInfoEntity getF52954e() {
        return this.f52954e;
    }

    @NotNull
    /* JADX INFO: renamed from: getFromType, reason: from getter */
    public final AccountType getF52952c() {
        return this.f52952c;
    }

    @Nullable
    /* JADX INFO: renamed from: getToSymbolBean, reason: from getter */
    public final SymbolInfoEntity getF52955f() {
        return this.f52955f;
    }

    @NotNull
    /* JADX INFO: renamed from: getToType, reason: from getter */
    public final AccountType getF52953d() {
        return this.f52953d;
    }

    /* JADX INFO: renamed from: l */
    public final void m64793l(Action action) throws Exception {
        AccountType accountType = this.f52952c;
        AccountType accountType2 = AccountType.ISOLATED;
        if (accountType == accountType2 && this.f52953d == accountType2) {
            SymbolInfoEntity symbolInfoEntity = this.f52955f;
            this.f52955f = this.f52954e;
            this.f52954e = symbolInfoEntity;
        } else if (accountType == accountType2 && this.f52953d != accountType2) {
            this.f52955f = this.f52954e;
            this.f52954e = null;
        } else if (accountType != accountType2 && this.f52953d == accountType2) {
            this.f52954e = this.f52955f;
            this.f52955f = null;
        }
        AccountType accountType3 = this.f52953d;
        this.f52953d = accountType;
        this.f52952c = accountType3;
        if (action != null) {
            action.run();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m64794m(@Nullable AccountType accountType, boolean z11) {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        ImageView imageView2;
        TextView textView3;
        this.f52952c = accountType == null ? AccountType.MAIN : accountType;
        if (accountType != null) {
            C4852f binding = getBinding();
            if (binding != null && (textView3 = binding.f4975j) != null) {
                C26268b.m64514c(textView3, accountType);
            }
            C4852f binding2 = getBinding();
            if (binding2 != null && (imageView2 = binding2.f4969d) != null) {
                C26268b.m64513b(imageView2, accountType);
            }
            C4852f binding3 = getBinding();
            if (binding3 != null && (textView2 = binding3.f4976k) != null) {
                C26268b.m64515d(textView2, accountType == AccountType.ISOLATED);
            }
            if (z11) {
                C4852f binding4 = getBinding();
                if (binding4 != null && (textView = binding4.f4975j) != null) {
                    textView.setText(R$string.kc_transferpro_multi_account);
                }
                C4852f binding5 = getBinding();
                if (binding5 == null || (imageView = binding5.f4969d) == null) {
                    return;
                }
                imageView.setImageResource(R$drawable.ic2_more2_16);
            }
        }
    }

    public final void setFromAccountPairName(@Nullable SymbolInfoEntity fromSymbolBean) {
        TextView textView;
        TextView textView2;
        if (this.f52952c != AccountType.ISOLATED) {
            return;
        }
        this.f52954e = fromSymbolBean;
        C4852f binding = getBinding();
        if (binding != null && (textView2 = binding.f4976k) != null) {
            textView2.setText(C27041f.m66668h(fromSymbolBean != null ? fromSymbolBean.getShowSymbol() : null));
        }
        C4852f binding2 = getBinding();
        if (binding2 == null || (textView = binding2.f4976k) == null) {
            return;
        }
        ViewExtKt.m66594y(textView);
    }

    public final void setFromSymbolBean(@Nullable SymbolInfoEntity symbolInfoEntity) {
        this.f52954e = symbolInfoEntity;
    }

    public final void setFromType(@NotNull AccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "<set-?>");
        this.f52952c = accountType;
    }

    public final void setToAccount(@Nullable AccountType account) {
        TextView textView;
        ImageView imageView;
        TextView textView2;
        this.f52953d = account == null ? AccountType.TRADE : account;
        if (account != null) {
            C4852f binding = getBinding();
            if (binding != null && (textView2 = binding.f4978m) != null) {
                C26268b.m64514c(textView2, account);
            }
            C4852f binding2 = getBinding();
            if (binding2 != null && (imageView = binding2.f4971f) != null) {
                C26268b.m64513b(imageView, account);
            }
            C4852f binding3 = getBinding();
            if (binding3 == null || (textView = binding3.f4979n) == null) {
                return;
            }
            C26268b.m64515d(textView, account == AccountType.ISOLATED);
        }
    }

    public final void setToAccountPairName(@Nullable SymbolInfoEntity toSymbolBean) {
        TextView textView;
        TextView textView2;
        if (this.f52953d != AccountType.ISOLATED) {
            return;
        }
        this.f52955f = toSymbolBean;
        C4852f binding = getBinding();
        if (binding != null && (textView2 = binding.f4979n) != null) {
            textView2.setText(C27041f.m66668h(toSymbolBean != null ? toSymbolBean.getShowSymbol() : null));
        }
        C4852f binding2 = getBinding();
        if (binding2 == null || (textView = binding2.f4979n) == null) {
            return;
        }
        ViewExtKt.m66594y(textView);
    }

    public final void setToSymbolBean(@Nullable SymbolInfoEntity symbolInfoEntity) {
        this.f52955f = symbolInfoEntity;
    }

    public final void setToType(@NotNull AccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "<set-?>");
        this.f52953d = accountType;
    }

    public /* synthetic */ TransferAccountView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m64789i(final TransferAccountView transferAccountView, final Action action) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C4852f binding = transferAccountView.getBinding();
        if (binding != null && (linearLayout2 = binding.f4973h) != null) {
            linearLayout2.startAnimation(C27015b.m66508c(true, new Action() { // from class: h60.d
                @Override // io.reactivex.functions.Action
                public final void run() {
                    TransferAccountView.m64790j();
                }
            }));
        }
        C4852f binding2 = transferAccountView.getBinding();
        if (binding2 != null && (linearLayout = binding2.f4974i) != null) {
            linearLayout.startAnimation(C27015b.m66508c(false, new Action() { // from class: h60.e
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    TransferAccountView.m64791k(this.f85785b, action);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m64791k(TransferAccountView transferAccountView, Action action) throws Exception {
        transferAccountView.m64793l(action);
    }

    /* JADX INFO: renamed from: f */
    public final void m64792f(@Nullable final Action action, @Nullable final Action action2, @Nullable final Action action3) {
        ImageView imageView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C4852f binding = getBinding();
        if (binding != null && (linearLayout2 = binding.f4973h) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: h60.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountView.m64787g(action);
                }
            }, 1, null);
        }
        C4852f binding2 = getBinding();
        if (binding2 != null && (linearLayout = binding2.f4974i) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: h60.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountView.m64788h(action2);
                }
            }, 1, null);
        }
        C4852f binding3 = getBinding();
        if (binding3 != null && (imageView = binding3.f4967b) != null) {
            C27046k.m66710y(imageView, 400L, new Function0() { // from class: h60.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAccountView.m64789i(this.f85783b, action3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m64795n(boolean z11) {
        ImageView imageView;
        C4852f binding = getBinding();
        if (binding != null && (imageView = binding.f4967b) != null) {
            C26268b.m64515d(imageView, z11);
        }
    }

    public final void setAccountEnable(boolean isEnabled) {
        ImageView imageView;
        ImageView imageView2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C4852f binding = getBinding();
        if (binding != null && (linearLayout2 = binding.f4973h) != null) {
            linearLayout2.setEnabled(isEnabled);
        }
        C4852f binding2 = getBinding();
        if (binding2 != null && (linearLayout = binding2.f4974i) != null) {
            linearLayout.setEnabled(isEnabled);
        }
        C4852f binding3 = getBinding();
        if (binding3 != null && (imageView2 = binding3.f4968c) != null) {
            C26268b.m64515d(imageView2, isEnabled);
        }
        C4852f binding4 = getBinding();
        if (binding4 != null && (imageView = binding4.f4970e) != null) {
            C26268b.m64515d(imageView, isEnabled);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52951b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4852f>() { // from class: com.kubi.transfer.view.TransferAccountView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4852f invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4852f.m4981a(C45682f.m100800a(viewGroup));
            }
        });
        this.f52952c = AccountType.MAIN;
        this.f52953d = AccountType.TRADE;
        LayoutInflater.from(context).inflate(R$layout.btransfer_view_transfer_account, this);
    }

    /* JADX INFO: renamed from: j */
    public static final void m64790j() {
    }
}
