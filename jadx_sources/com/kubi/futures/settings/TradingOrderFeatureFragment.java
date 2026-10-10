package com.kubi.futures.settings;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.futures.settings.vm.TradingOrderFeatureViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradingOrderFeatureFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\"\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006$"}, m90084d2 = {"Lcom/kubi/futures/settings/TradingOrderFeatureFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/settings/vm/TradingOrderFeatureViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/TradingOrderFeatureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "getTextStyle", "", "two", "", "three", "click", "Landroid/view/View$OnClickListener;", "updateSwitchButtons", "settings", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "updateBottomText", "isOpen", "", "isAllChecked", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingOrderFeatureFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f23222U;

    /* JADX INFO: renamed from: A3 */
    public static final Unit m26052A3(TradingOrderFeatureFragment tradingOrderFeatureFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingOrderFeatureFragment.m26077u3().m26498z(3, !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m26053B3(TradingOrderFeatureFragment tradingOrderFeatureFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingOrderFeatureFragment.m26077u3().m26498z(4, !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m26054C3(TradingOrderFeatureFragment tradingOrderFeatureFragment, View view) {
        String string = tradingOrderFeatureFragment.getString(R$string.bkumex_preferences_price_more_desc);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        BaseDialogFragment baseDialogFragmentM33669L = C15943u.m33669L(string, null, null, 6, null);
        FragmentManager childFragmentManager = tradingOrderFeatureFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33669L.show(childFragmentManager, (String) null);
    }

    /* JADX INFO: renamed from: D3 */
    private final boolean m26055D3() {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switch_order);
        if (!C27025c.m66566d(switchCompat != null ? Boolean.valueOf(switchCompat.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switch_delegation);
        if (!C27025c.m66566d(switchCompat2 != null ? Boolean.valueOf(switchCompat2.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.twapSb);
        if (!C27025c.m66566d(switchCompat3 != null ? Boolean.valueOf(switchCompat3.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switch_condition);
        if (!C27025c.m66566d(switchCompat4 != null ? Boolean.valueOf(switchCompat4.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.switch_price);
        return C27025c.m66566d(switchCompat5 != null ? Boolean.valueOf(switchCompat5.isChecked()) : null);
    }

    /* JADX INFO: renamed from: G3 */
    private final void m26058G3(boolean z11) {
        int i11 = z11 ? R$string.bkumex_preferences_close : R$string.bkumex_preferences_open;
        TextView textView = (TextView) findViewById(R$id.tv_action);
        if (textView != null) {
            textView.setText(getText(i11));
        }
    }

    /* JADX INFO: renamed from: I3 */
    public static final TradingOrderFeatureViewModel m26059I3(TradingOrderFeatureFragment tradingOrderFeatureFragment) {
        return (TradingOrderFeatureViewModel) new ViewModelProvider(tradingOrderFeatureFragment).get(TradingOrderFeatureViewModel.class);
    }

    /* JADX INFO: renamed from: v3 */
    private final void m26070v3(View view) {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switch_order);
        if (switchCompat != null) {
            ViewExKt.m36487m(switchCompat, new Function1() { // from class: com.kubi.futures.settings.p4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingOrderFeatureFragment.m26072x3(this.f23422b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switch_delegation);
        if (switchCompat2 != null) {
            ViewExKt.m36487m(switchCompat2, new Function1() { // from class: com.kubi.futures.settings.q4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingOrderFeatureFragment.m26073y3(this.f23429b, (SwitchCompat) obj);
                }
            });
        }
        ((BaseTextView) view.findViewById(R$id.tv_delegation_desc)).setText(C27017c.f54310a.m66516f(R$string.kumex_senior_order_desc, new Object[0]));
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.twapSb);
        if (switchCompat3 != null) {
            ViewExKt.m36487m(switchCompat3, new Function1() { // from class: com.kubi.futures.settings.r4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingOrderFeatureFragment.m26074z3(this.f23437b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switch_condition);
        if (switchCompat4 != null) {
            ViewExKt.m36487m(switchCompat4, new Function1() { // from class: com.kubi.futures.settings.s4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingOrderFeatureFragment.m26052A3(this.f23445b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.switch_price);
        if (switchCompat5 != null) {
            ViewExKt.m36487m(switchCompat5, new Function1() { // from class: com.kubi.futures.settings.t4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingOrderFeatureFragment.m26053B3(this.f23457b, (SwitchCompat) obj);
                }
            });
        }
        TextView textView = (TextView) view.findViewById(R$id.tv_price_desc);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(m26076t3(R$string.bkumex_preferences_price_desc, R$string.bkumex_preferences_price_more, new View.OnClickListener() { // from class: com.kubi.futures.settings.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TradingOrderFeatureFragment.m26054C3(this.f23466b, view2);
            }
        }));
        View viewFindViewById = view.findViewById(R$id.tv_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.futures.settings.v4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingOrderFeatureFragment.m26071w3(this.f23475b, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m26071w3(TradingOrderFeatureFragment tradingOrderFeatureFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingOrderFeatureFragment.m26077u3().m26498z(-1, !tradingOrderFeatureFragment.m26055D3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m26072x3(TradingOrderFeatureFragment tradingOrderFeatureFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingOrderFeatureFragment.m26077u3().m26498z(1, !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m26073y3(TradingOrderFeatureFragment tradingOrderFeatureFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingOrderFeatureFragment.m26077u3().m26498z(2, !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m26074z3(TradingOrderFeatureFragment tradingOrderFeatureFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingOrderFeatureFragment.m26077u3().m26498z(5, !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m26075H3(PreferencesEntity preferencesEntity) {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switch_condition);
        if (switchCompat != null) {
            switchCompat.setChecked(C27025c.m66566d(preferencesEntity.getConditionalOrder()));
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switch_delegation);
        if (switchCompat2 != null) {
            switchCompat2.setChecked(C27025c.m66566d(preferencesEntity.getSeniorOrder()));
        }
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.twapSb);
        if (switchCompat3 != null) {
            switchCompat3.setChecked(C27025c.m66567e(preferencesEntity.getTwapOrder(), true));
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switch_order);
        if (switchCompat4 != null) {
            switchCompat4.setChecked(C27025c.m66566d(preferencesEntity.getStopProfitAndLoss()));
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.switch_price);
        if (switchCompat5 != null) {
            switchCompat5.setChecked(C27025c.m66566d(preferencesEntity.getIndexPrice()));
        }
        m26058G3(m26055D3());
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_trading_order_feature, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m26070v3(view);
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m26077u3().m26496s();
        m26077u3().m26497y().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.futures.settings.m4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TradingOrderFeatureFragment.m26056E3(this.f23393b, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: t3 */
    public final CharSequence m26076t3(@StringRes int i11, @StringRes int i12, @NotNull View.OnClickListener click) {
        Intrinsics.checkNotNullParameter(click, "click");
        String string = getString(i12);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C27096v0 c27096v0Append = new C27096v0().append(getString(i11)).append(string);
        String string2 = c27096v0Append.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            iIndexOf$default = 0;
        }
        c27096v0Append.setSpan(new C27018c0(R$color.primary, click), iIndexOf$default, string2.length(), 33);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append, "apply(...)");
        return c27096v0Append;
    }

    /* JADX INFO: renamed from: u3 */
    public final TradingOrderFeatureViewModel m26077u3() {
        return (TradingOrderFeatureViewModel) this.f23222U.getValue();
    }

    public TradingOrderFeatureFragment() {
        setPageId(C17060n0.m36552b());
        this.f23222U = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.n4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingOrderFeatureFragment.m26059I3(this.f23404b);
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m26056E3(final TradingOrderFeatureFragment tradingOrderFeatureFragment, Object obj) {
        tradingOrderFeatureFragment.showContentView();
        if (obj instanceof PreferencesEntity) {
            tradingOrderFeatureFragment.m26075H3((PreferencesEntity) obj);
        } else {
            BaseFragment.showFailView$default(tradingOrderFeatureFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.settings.o4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TradingOrderFeatureFragment.m26057F3(this.f23414b, view);
                }
            }, 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m26057F3(TradingOrderFeatureFragment tradingOrderFeatureFragment, View view) {
        tradingOrderFeatureFragment.m26077u3().m26496s();
    }
}
