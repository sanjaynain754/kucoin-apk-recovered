package com.kubi.utaspotlib.service;

import af.C0296a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.mvi.common.MviExKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspot.api.IUtaSpotService;
import com.kubi.utaspot.api.UtaTradeType;
import com.kubi.utaspotlib.R$id;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment;
import com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment;
import com.kubi.utaspotlib.biz.order.C26914a;
import com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment;
import com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: UtaSpotService.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J4\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\"\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\tH\u0016J6\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\tH\u0016J\"\u0010\"\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0002¨\u0006#"}, m90084d2 = {"Lcom/kubi/utaspotlib/service/UtaSpotService;", "Lcom/kubi/utaspot/api/IUtaSpotService;", "<init>", "()V", "getUtaSpotTradeFragment", "Lcom/kubi/sdk/BaseFragment;", "getUtaMarginTradeFragment", "getUtaOrderHistoryFragment", "fromSymbol", "", "side", "tradeType", "jumpUtaOrdersRecordFragment", "", "context", "Landroid/content/Context;", "Lcom/kubi/utaspot/api/UtaTradeType;", "index", "", "injectRiskConfirmTipSwitchView", "viewGroup", "Landroid/view/ViewGroup;", "fromType", "spm", "getUtaDelegationRecordFragment", "mSymbol", "mIndex", "utaTradeType", "jumpUtaDelegationDetailFragment", "ctx", "orderId", "symbol", "content", "bussinesType", "updateRiskConfirmViewSwitchVisible", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UtaSpotService implements IUtaSpotService {
    /* JADX INFO: renamed from: m */
    public static final Unit m66351m(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C26914a.m66169k(z11);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.utaspot.api.IUtaSpotService
    /* JADX INFO: renamed from: a */
    public void mo65988a(@NotNull Context ctx, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String bussinesType) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bussinesType, "bussinesType");
        if (str3 == null) {
            return;
        }
        MviExKt.m42518n(new UtaSpotService$jumpUtaDelegationDetailFragment$1(str3, ctx, bussinesType, null));
    }

    @Override // com.kubi.utaspot.api.IUtaSpotService
    /* JADX INFO: renamed from: b */
    public void mo65989b(@NotNull Context context, @Nullable String str, @Nullable String str2, @NotNull UtaTradeType tradeType, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        UtaDelegationRecordFragment.f54097e0.start(context, str, i11, tradeType.name());
    }

    @Override // com.kubi.utaspot.api.IUtaSpotService
    @NotNull
    /* JADX INFO: renamed from: d */
    public BaseFragment mo65991d() {
        return new UtaSpotTradeCoreFragment();
    }

    @Override // com.kubi.utaspot.api.IUtaSpotService
    /* JADX INFO: renamed from: e */
    public void mo65992e(@Nullable ViewGroup viewGroup, @NotNull String fromType, @NotNull String spm) {
        Intrinsics.checkNotNullParameter(fromType, "fromType");
        Intrinsics.checkNotNullParameter(spm, "spm");
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_switch_pre_risk_tip_settings, viewGroup, true);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(ViewKt.findFragment(viewGroup)), null, null, new UtaSpotService$injectRiskConfirmTipSwitchView$1(this, viewGroup, fromType, spm, null), 3, null);
    }

    @Override // com.kubi.utaspot.api.IUtaSpotService
    @NotNull
    /* JADX INFO: renamed from: g */
    public BaseFragment mo65993g() {
        return new UtaMarginTradeCoreFragment();
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m66352n(ViewGroup viewGroup) {
        BaseFragment baseFragment = (BaseFragment) ViewKt.findFragment(viewGroup);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseFragment), null, null, new UtaSpotService$updateRiskConfirmViewSwitchVisible$2$1(baseFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.utaspot.api.IUtaSpotService
    @NotNull
    /* JADX INFO: renamed from: c */
    public BaseFragment mo65990c(@Nullable String str, int i11, @NotNull String utaTradeType) {
        Intrinsics.checkNotNullParameter(utaTradeType, "utaTradeType");
        return UtaDelegationRecordFragment.f54097e0.newInstance(str, i11, utaTradeType);
    }

    @Override // com.kubi.utaspot.api.IUtaSpotService
    @NotNull
    /* JADX INFO: renamed from: h */
    public BaseFragment mo65994h(@Nullable String str, @Nullable String str2, @NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        return UtaDelegationHistoryContainerFragment.f54125W.newInstance(str, str2, tradeType);
    }

    /* JADX INFO: renamed from: l */
    public final void m66353l(final ViewGroup viewGroup, String str, String str2) {
        SwitchCompat switchCompat;
        BaseTextView baseTextView;
        ImageView imageView;
        boolean z11;
        if ((!Intrinsics.areEqual(str, SearchCategory$Companion.SPOT) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "uta-margin", false, 2, (Object) null)) || !IUnifyAccountService.f53155a.get().mo64979C()) {
            if (viewGroup != null) {
                ViewExtKt.m66577h(viewGroup);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            ViewExtKt.m66594y(viewGroup);
        }
        if (viewGroup != null) {
            switchCompat = (SwitchCompat) viewGroup.findViewById(R$id.switchBtn);
        } else {
            switchCompat = null;
        }
        if (viewGroup != null) {
            baseTextView = (BaseTextView) viewGroup.findViewById(R$id.tvTitle1);
        } else {
            baseTextView = null;
        }
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R$id.iv2Arrow);
        } else {
            imageView = null;
        }
        if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "uta_margin", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "uta-margin", false, 2, (Object) null)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (baseTextView != null) {
            C0296a.m1042d(baseTextView, z11);
        }
        if (imageView != null) {
            C0296a.m1042d(imageView, z11);
        }
        if (switchCompat != null) {
            switchCompat.setChecked(C26914a.m66168j(false, 1, null));
        }
        if (switchCompat != null) {
            C27046k.m66708w(switchCompat, new Function2() { // from class: com.kubi.utaspotlib.service.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtaSpotService.m66351m((CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        if (baseTextView != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.utaspotlib.service.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaSpotService.m66352n(viewGroup);
                }
            }, 1, null);
        }
    }
}
