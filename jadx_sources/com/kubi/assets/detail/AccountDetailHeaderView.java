package com.kubi.assets.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$mipmap;
import com.kubi.resources.CollateralStatusUiHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p637ta.C44755e2;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AccountDetailHeaderView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u001f\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bR\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/detail/AccountDetailHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetViewAccountDetailHeaderBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetViewAccountDetailHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bind", "", "bean", "Lcom/kubi/assets/detail/FullCoinBean;", "setCoinPrice", "coinNumber", "", "coinPrice", "bindCollateralStatus", "collateralStatus", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Ljava/lang/Integer;Landroidx/fragment/app/FragmentManager;)V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountDetailHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountDetailHeaderView.kt\ncom/kubi/assets/detail/AccountDetailHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,59:1\n41#2:60\n65#2:61\n80#2,7:62\n*S KotlinDebug\n*F\n+ 1 AccountDetailHeaderView.kt\ncom/kubi/assets/detail/AccountDetailHeaderView\n*L\n23#1:60\n23#1:61\n23#1:62,7\n*E\n"})
public final class AccountDetailHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f16856o = {Reflection.property1(new PropertyReference1Impl(AccountDetailHeaderView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetViewAccountDetailHeaderBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f16857n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f16857n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44755e2>() { // from class: com.kubi.assets.detail.AccountDetailHeaderView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44755e2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44755e2.m99024a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_view_account_detail_header, this);
    }

    private final C44755e2 getBinding() {
        return (C44755e2) this.f16857n.getValue(this, f16856o[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m15861a(@NotNull FullCoinBean bean) {
        CoinAvatarView coinAvatarView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(bean, "bean");
        C44755e2 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f99801e) != null) {
            baseTextView2.setText(bean.getShortName());
        }
        C44755e2 binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f99800d) != null) {
            baseTextView.setText(bean.getFullName());
        }
        C44755e2 binding3 = getBinding();
        if (binding3 == null || (coinAvatarView = binding3.f99798b) == null) {
            return;
        }
        ComponentCallbacks2C5309c.m6556t(getContext()).mo6634v(bean.getDisplayUrl()).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(coinAvatarView);
    }

    /* JADX INFO: renamed from: b */
    public final void m15862b(@Nullable Integer num, @Nullable FragmentManager fragmentManager) {
        CollateralStatusUiHelper collateralStatusUiHelper = CollateralStatusUiHelper.f43602a;
        C44755e2 binding = getBinding();
        CollateralStatusUiHelper.m54264g(collateralStatusUiHelper, binding != null ? binding.f99799c : null, num, fragmentManager, "UnifiedAccountDetailCollateralStatusDialog", null, 16, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m15863c(@NotNull String coinNumber, @NotNull String coinPrice) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(coinNumber, "coinNumber");
        Intrinsics.checkNotNullParameter(coinPrice, "coinPrice");
        C44755e2 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f99802f) != null) {
            baseTextView2.setText(coinNumber);
        }
        C44755e2 binding2 = getBinding();
        if (binding2 == null || (baseTextView = binding2.f99803g) == null) {
            return;
        }
        baseTextView.setText(coinPrice);
    }
}
