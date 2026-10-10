package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.futures.settings.vm.TradingPositionFeatureViewModel;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
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

/* JADX INFO: compiled from: TradingPositionFeatureFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001aH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/futures/settings/TradingPositionFeatureFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/settings/vm/TradingPositionFeatureViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/TradingPositionFeatureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "updateSwitchButtons", "settings", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "isAllChecked", "", "updateBottomText", "isOpen", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingPositionFeatureFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f23223U;

    private final void initView() {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switch_position);
        if (switchCompat != null) {
            ViewExKt.m36487m(switchCompat, new Function1() { // from class: com.kubi.futures.settings.y4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingPositionFeatureFragment.m26084q3(this.f23583b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switch_fundingRate);
        if (switchCompat2 != null) {
            ViewExKt.m36487m(switchCompat2, new Function1() { // from class: com.kubi.futures.settings.z4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingPositionFeatureFragment.m26085r3(this.f23591b, (SwitchCompat) obj);
                }
            });
        }
        View viewFindViewById = findViewById(R$id.tv_action);
        if (viewFindViewById != null) {
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.futures.settings.a5
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradingPositionFeatureFragment.m26086s3(this.f23284b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m26084q3(TradingPositionFeatureFragment tradingPositionFeatureFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingPositionFeatureFragment.m26093p3().m26462B(0, !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m26085r3(TradingPositionFeatureFragment tradingPositionFeatureFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingPositionFeatureFragment.m26093p3().m26462B(1, !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    private final boolean m26087t3() {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switch_position);
        if (!C27025c.m66566d(switchCompat != null ? Boolean.valueOf(switchCompat.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switch_fundingRate);
        return C27025c.m66566d(switchCompat2 != null ? Boolean.valueOf(switchCompat2.isChecked()) : null);
    }

    /* JADX INFO: renamed from: w3 */
    private final void m26090w3(boolean z11) {
        int i11 = z11 ? R$string.bkumex_preferences_close : R$string.bkumex_preferences_open;
        TextView textView = (TextView) findViewById(R$id.tv_action);
        if (textView != null) {
            textView.setText(getText(i11));
        }
    }

    /* JADX INFO: renamed from: x3 */
    private final void m26091x3(PreferencesEntity preferencesEntity) {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switch_position);
        if (switchCompat != null) {
            switchCompat.setChecked(C27025c.m66566d(preferencesEntity.getSeniorPosition()));
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switch_fundingRate);
        if (switchCompat2 != null) {
            switchCompat2.setChecked(C27025c.m66566d(preferencesEntity.getFundingRate()));
        }
        m26090w3(m26087t3());
    }

    /* JADX INFO: renamed from: y3 */
    public static final TradingPositionFeatureViewModel m26092y3(TradingPositionFeatureFragment tradingPositionFeatureFragment) {
        return (TradingPositionFeatureViewModel) new ViewModelProvider(tradingPositionFeatureFragment).get(TradingPositionFeatureViewModel.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_trading_position_feature, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m26093p3().m26463u();
        m26093p3().m26461A().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.futures.settings.x4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TradingPositionFeatureFragment.m26088u3(this.f23575b, obj);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final TradingPositionFeatureViewModel m26093p3() {
        return (TradingPositionFeatureViewModel) this.f23223U.getValue();
    }

    public TradingPositionFeatureFragment() {
        setPageId(C17060n0.m36552b());
        this.f23223U = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.w4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingPositionFeatureFragment.m26092y3(this.f23566b);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m26086s3(TradingPositionFeatureFragment tradingPositionFeatureFragment) {
        tradingPositionFeatureFragment.m26093p3().m26462B(-1, !tradingPositionFeatureFragment.m26087t3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m26088u3(final TradingPositionFeatureFragment tradingPositionFeatureFragment, Object obj) {
        tradingPositionFeatureFragment.showContentView();
        if (obj instanceof PreferencesEntity) {
            tradingPositionFeatureFragment.m26091x3((PreferencesEntity) obj);
        } else {
            BaseFragment.showFailView$default(tradingPositionFeatureFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.settings.b5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TradingPositionFeatureFragment.m26089v3(this.f23292b, view);
                }
            }, 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m26089v3(TradingPositionFeatureFragment tradingPositionFeatureFragment, View view) {
        tradingPositionFeatureFragment.m26093p3().m26463u();
    }
}
