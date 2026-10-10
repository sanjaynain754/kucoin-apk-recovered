package com.kubi.assets.view;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.withdraw.WithDrawAccountType;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.round.widget.RoundTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44845q1;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AccountTabViewLayout.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u000fH\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/view/AccountTabViewLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetLayoutAccountTabBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetLayoutAccountTabBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "selectAccountTab", "", "complete", "Lkotlin/Function1;", "Lcom/kubi/assets/withdraw/WithDrawAccountType;", "setTab", "type", "", "resetColor", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountTabViewLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabViewLayout.kt\ncom/kubi/assets/view/AccountTabViewLayout\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,84:1\n41#2:85\n65#2:86\n80#2,7:87\n*S KotlinDebug\n*F\n+ 1 AccountTabViewLayout.kt\ncom/kubi/assets/view/AccountTabViewLayout\n*L\n21#1:85\n21#1:86\n21#1:87,7\n*E\n"})
public final class AccountTabViewLayout extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f19072c = {Reflection.property1(new PropertyReference1Impl(AccountTabViewLayout.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetLayoutAccountTabBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f19073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTabViewLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f19073b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44845q1>() { // from class: com.kubi.assets.view.AccountTabViewLayout$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44845q1 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44845q1.m99216a(C45682f.m100801b(viewGroup));
            }
        });
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.asset_layout_account_tab, this);
    }

    private final C44845q1 getBinding() {
        return (C44845q1) this.f19073b.getValue(this, f19072c[0]);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m19966k(AccountTabViewLayout accountTabViewLayout) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4("UID").m54156M4(accountTabViewLayout.getContext().getString(R$string.asset_withdraw_pop_tip1)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.view.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AccountTabViewLayout.m19967l(dialogInterface, i11);
            }
        });
        Context context = accountTabViewLayout.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(supportFragmentManager, "AlertDialogFragmentHelper");
        return Unit.INSTANCE;
    }

    public final void setTab(@NotNull String type) {
        C44845q1 binding;
        RoundTextView roundTextView;
        C44845q1 binding2;
        RoundTextView roundTextView2;
        C44845q1 binding3;
        RoundTextView roundTextView3;
        RoundTextView roundTextView4;
        RoundTextView roundTextView5;
        RoundTextView roundTextView6;
        Intrinsics.checkNotNullParameter(type, "type");
        m19968f();
        C44845q1 binding4 = getBinding();
        if (binding4 != null && (roundTextView6 = binding4.f100662b) != null) {
            roundTextView6.setEnabled(false);
        }
        C44845q1 binding5 = getBinding();
        if (binding5 != null && (roundTextView5 = binding5.f100663c) != null) {
            roundTextView5.setEnabled(false);
        }
        C44845q1 binding6 = getBinding();
        if (binding6 != null && (roundTextView4 = binding6.f100664d) != null) {
            roundTextView4.setEnabled(false);
        }
        int iHashCode = type.hashCode();
        if (iHashCode == 84016) {
            if (!type.equals("UID") || (binding = getBinding()) == null || (roundTextView = binding.f100664d) == null) {
                return;
            }
            roundTextView.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text));
            return;
        }
        if (iHashCode == 2358711) {
            if (!type.equals("MAIL") || (binding2 = getBinding()) == null || (roundTextView2 = binding2.f100662b) == null) {
                return;
            }
            roundTextView2.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text));
            return;
        }
        if (iHashCode == 76105038 && type.equals("PHONE") && (binding3 = getBinding()) != null && (roundTextView3 = binding3.f100663c) != null) {
            roundTextView3.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m19963h(AccountTabViewLayout accountTabViewLayout, Function1 function1) {
        RoundTextView roundTextView;
        accountTabViewLayout.m19968f();
        C44845q1 binding = accountTabViewLayout.getBinding();
        if (binding != null && (roundTextView = binding.f100662b) != null) {
            roundTextView.setTextColor(ContextCompat.getColor(accountTabViewLayout.getContext(), R$color.c_text));
        }
        if (function1 != null) {
            function1.invoke(WithDrawAccountType.MAIL);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m19964i(AccountTabViewLayout accountTabViewLayout, Function1 function1) {
        RoundTextView roundTextView;
        accountTabViewLayout.m19968f();
        C44845q1 binding = accountTabViewLayout.getBinding();
        if (binding != null && (roundTextView = binding.f100663c) != null) {
            roundTextView.setTextColor(ContextCompat.getColor(accountTabViewLayout.getContext(), R$color.c_text));
        }
        if (function1 != null) {
            function1.invoke(WithDrawAccountType.PHONE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m19965j(AccountTabViewLayout accountTabViewLayout, Function1 function1) {
        RoundTextView roundTextView;
        accountTabViewLayout.m19968f();
        C44845q1 binding = accountTabViewLayout.getBinding();
        if (binding != null && (roundTextView = binding.f100664d) != null) {
            roundTextView.setTextColor(ContextCompat.getColor(accountTabViewLayout.getContext(), R$color.c_text));
        }
        if (function1 != null) {
            function1.invoke(WithDrawAccountType.UID);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m19968f() {
        RoundTextView roundTextView;
        RoundTextView roundTextView2;
        RoundTextView roundTextView3;
        C44845q1 binding = getBinding();
        if (binding != null && (roundTextView3 = binding.f100662b) != null) {
            roundTextView3.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
        }
        C44845q1 binding2 = getBinding();
        if (binding2 != null && (roundTextView2 = binding2.f100663c) != null) {
            roundTextView2.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
        }
        C44845q1 binding3 = getBinding();
        if (binding3 != null && (roundTextView = binding3.f100664d) != null) {
            roundTextView.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19969g(@Nullable final Function1<? super WithDrawAccountType, Unit> function1) {
        ImageView imageView;
        RoundTextView roundTextView;
        RoundTextView roundTextView2;
        RoundTextView roundTextView3;
        C44845q1 binding = getBinding();
        if (binding != null && (roundTextView3 = binding.f100662b) != null) {
            C27046k.m66711z(roundTextView3, 0L, new Function0() { // from class: com.kubi.assets.view.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountTabViewLayout.m19963h(this.f19147b, function1);
                }
            }, 1, null);
        }
        C44845q1 binding2 = getBinding();
        if (binding2 != null && (roundTextView2 = binding2.f100663c) != null) {
            C27046k.m66711z(roundTextView2, 0L, new Function0() { // from class: com.kubi.assets.view.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountTabViewLayout.m19964i(this.f19150b, function1);
                }
            }, 1, null);
        }
        C44845q1 binding3 = getBinding();
        if (binding3 != null && (roundTextView = binding3.f100664d) != null) {
            C27046k.m66711z(roundTextView, 0L, new Function0() { // from class: com.kubi.assets.view.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountTabViewLayout.m19965j(this.f19159b, function1);
                }
            }, 1, null);
        }
        C44845q1 binding4 = getBinding();
        if (binding4 != null && (imageView = binding4.f100665e) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.view.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountTabViewLayout.m19966k(this.f19182b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m19967l(DialogInterface dialogInterface, int i11) {
    }
}
