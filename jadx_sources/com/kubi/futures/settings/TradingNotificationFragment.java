package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.futures.settings.vm.TradingConfirmAgainViewModel;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradingNotificationFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/settings/TradingNotificationFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/settings/vm/TradingConfirmAgainViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/TradingConfirmAgainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "fetchData", "setData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "isAllChecked", "", "updateBottomText", "isOpen", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingNotificationFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f23220U;

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingNotificationFragment$a */
    /* JADX INFO: compiled from: TradingNotificationFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13270a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23221b;

        public C13270a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23221b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f23221b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23221b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingNotificationFragment$b */
    /* JADX INFO: compiled from: TradingNotificationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/futures/settings/TradingNotificationFragment$viewModel$2$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13271b implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new TradingConfirmAgainViewModel("notification");
        }
    }

    /* JADX INFO: renamed from: x3 */
    private final void m26049x3() {
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        C13392j.m26319f(this, "0", new Function1() { // from class: com.kubi.futures.settings.a4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingNotificationFragment.m26050y3(this.f23283b, (TradingNoticeEntity) obj);
            }
        }, new Function0() { // from class: com.kubi.futures.settings.b4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingNotificationFragment.m26051z3(this.f23291b);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    private final TradingConfirmAgainViewModel m26020B3() {
        return (TradingConfirmAgainViewModel) this.f23220U.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m26021C3(TradingNotificationFragment tradingNotificationFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TradingConfirmAgainViewModel.m26472q(tradingNotificationFragment.m26020B3(), null, !tradingNotificationFragment.m26030L3(), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m26022D3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("PFL", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m26023E3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("FFL", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m26024F3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("STOP_TRIGGER", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m26025G3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("LIQUIDATION", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m26026H3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("APPEND_MARGIN", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m26027I3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("AUTO_CLOSE", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m26028J3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("DEPOSIT", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m26029K3(TradingNotificationFragment tradingNotificationFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.m26020B3().m26476p("ORDER_CANCELLED", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    private final boolean m26030L3() {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switchDelegationPart);
        if (!C27025c.m66566d(switchCompat != null ? Boolean.valueOf(switchCompat.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switchDelegationComplete);
        if (!C27025c.m66566d(switchCompat2 != null ? Boolean.valueOf(switchCompat2.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.switchDelegationTrigger);
        if (!C27025c.m66566d(switchCompat3 != null ? Boolean.valueOf(switchCompat3.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switchDelegationForce);
        if (!C27025c.m66566d(switchCompat4 != null ? Boolean.valueOf(switchCompat4.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.switchAutoMargin);
        if (!C27025c.m66566d(switchCompat5 != null ? Boolean.valueOf(switchCompat5.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat6 = (SwitchCompat) findViewById(R$id.switchReducePosition);
        if (!C27025c.m66566d(switchCompat6 != null ? Boolean.valueOf(switchCompat6.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat7 = (SwitchCompat) findViewById(R$id.switchRecharge);
        if (!C27025c.m66566d(switchCompat7 != null ? Boolean.valueOf(switchCompat7.isChecked()) : null)) {
            return false;
        }
        SwitchCompat switchCompat8 = (SwitchCompat) findViewById(R$id.switchDelegationCancel);
        return C27025c.m66566d(switchCompat8 != null ? Boolean.valueOf(switchCompat8.isChecked()) : null);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m26032N3(TradingNoticeEntity tradingNoticeEntity) {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switchDelegationPart);
        if (switchCompat != null) {
            HashMap<String, Boolean> webNoticeConfig = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat.setChecked(C27025c.m66566d(webNoticeConfig != null ? webNoticeConfig.get("PFL") : null));
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switchDelegationComplete);
        if (switchCompat2 != null) {
            HashMap<String, Boolean> webNoticeConfig2 = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat2.setChecked(C27025c.m66566d(webNoticeConfig2 != null ? webNoticeConfig2.get("FFL") : null));
        }
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.switchDelegationTrigger);
        if (switchCompat3 != null) {
            HashMap<String, Boolean> webNoticeConfig3 = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat3.setChecked(C27025c.m66566d(webNoticeConfig3 != null ? webNoticeConfig3.get("STOP_TRIGGER") : null));
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switchDelegationForce);
        if (switchCompat4 != null) {
            HashMap<String, Boolean> webNoticeConfig4 = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat4.setChecked(C27025c.m66566d(webNoticeConfig4 != null ? webNoticeConfig4.get("LIQUIDATION") : null));
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.switchAutoMargin);
        if (switchCompat5 != null) {
            HashMap<String, Boolean> webNoticeConfig5 = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat5.setChecked(C27025c.m66566d(webNoticeConfig5 != null ? webNoticeConfig5.get("APPEND_MARGIN") : null));
        }
        SwitchCompat switchCompat6 = (SwitchCompat) findViewById(R$id.switchReducePosition);
        if (switchCompat6 != null) {
            HashMap<String, Boolean> webNoticeConfig6 = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat6.setChecked(C27025c.m66566d(webNoticeConfig6 != null ? webNoticeConfig6.get("AUTO_CLOSE") : null));
        }
        SwitchCompat switchCompat7 = (SwitchCompat) findViewById(R$id.switchRecharge);
        if (switchCompat7 != null) {
            HashMap<String, Boolean> webNoticeConfig7 = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat7.setChecked(C27025c.m66566d(webNoticeConfig7 != null ? webNoticeConfig7.get("DEPOSIT") : null));
        }
        SwitchCompat switchCompat8 = (SwitchCompat) findViewById(R$id.switchDelegationCancel);
        if (switchCompat8 != null) {
            HashMap<String, Boolean> webNoticeConfig8 = tradingNoticeEntity.getWebNoticeConfig();
            switchCompat8.setChecked(C27025c.m66566d(webNoticeConfig8 != null ? webNoticeConfig8.get("ORDER_CANCELLED") : null));
        }
        m26033O3(m26030L3());
    }

    /* JADX INFO: renamed from: O3 */
    private final void m26033O3(boolean z11) {
        int i11 = z11 ? R$string.bkumex_preferences_close : R$string.bkumex_preferences_open;
        TextView textView = (TextView) findViewById(R$id.tv_action);
        if (textView != null) {
            textView.setText(getText(i11));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static final TradingConfirmAgainViewModel m26034P3(TradingNotificationFragment tradingNotificationFragment) {
        return (TradingConfirmAgainViewModel) new ViewModelProvider(tradingNotificationFragment, new C13271b()).get(TradingConfirmAgainViewModel.class);
    }

    private final void initView() {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switchDelegationPart);
        if (switchCompat != null) {
            ViewExKt.m36487m(switchCompat, new Function1() { // from class: com.kubi.futures.settings.e4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26022D3(this.f23324b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switchDelegationComplete);
        if (switchCompat2 != null) {
            ViewExKt.m36487m(switchCompat2, new Function1() { // from class: com.kubi.futures.settings.f4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26023E3(this.f23334b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.switchDelegationTrigger);
        if (switchCompat3 != null) {
            ViewExKt.m36487m(switchCompat3, new Function1() { // from class: com.kubi.futures.settings.g4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26024F3(this.f23342b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switchDelegationForce);
        if (switchCompat4 != null) {
            ViewExKt.m36487m(switchCompat4, new Function1() { // from class: com.kubi.futures.settings.h4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26025G3(this.f23350b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.switchAutoMargin);
        if (switchCompat5 != null) {
            ViewExKt.m36487m(switchCompat5, new Function1() { // from class: com.kubi.futures.settings.i4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26026H3(this.f23360b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat6 = (SwitchCompat) findViewById(R$id.switchReducePosition);
        if (switchCompat6 != null) {
            ViewExKt.m36487m(switchCompat6, new Function1() { // from class: com.kubi.futures.settings.j4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26027I3(this.f23367b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat7 = (SwitchCompat) findViewById(R$id.switchRecharge);
        if (switchCompat7 != null) {
            ViewExKt.m36487m(switchCompat7, new Function1() { // from class: com.kubi.futures.settings.k4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26028J3(this.f23376b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat8 = (SwitchCompat) findViewById(R$id.switchDelegationCancel);
        if (switchCompat8 != null) {
            ViewExKt.m36487m(switchCompat8, new Function1() { // from class: com.kubi.futures.settings.l4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26029K3(this.f23385b, (SwitchCompat) obj);
                }
            });
        }
        TextView textView = (TextView) findViewById(R$id.tv_action);
        if (textView != null) {
            ViewExtKt.m66575f(textView, new Function1() { // from class: com.kubi.futures.settings.z3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingNotificationFragment.m26021C3(this.f23590b, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m26050y3(TradingNotificationFragment tradingNotificationFragment, TradingNoticeEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingNotificationFragment.showContentView();
        tradingNotificationFragment.m26032N3(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m26051z3(final TradingNotificationFragment tradingNotificationFragment) {
        BaseFragment.showFailView$default(tradingNotificationFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.settings.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradingNotificationFragment.m26019A3(this.f23303b, view);
            }
        }, 3, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_trading_notification, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m26049x3();
        m26020B3().m26475o().observe(this, new C13270a(new Function1() { // from class: com.kubi.futures.settings.d4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingNotificationFragment.m26031M3(this.f23314b, (TradingNoticeEntity) obj);
            }
        }));
    }

    public TradingNotificationFragment() {
        setPageId(C17060n0.m36552b());
        this.f23220U = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.y3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingNotificationFragment.m26034P3(this.f23582b);
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public static final void m26019A3(TradingNotificationFragment tradingNotificationFragment, View view) {
        tradingNotificationFragment.m26049x3();
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m26031M3(TradingNotificationFragment tradingNotificationFragment, TradingNoticeEntity tradingNoticeEntity) {
        Intrinsics.checkNotNull(tradingNoticeEntity);
        tradingNotificationFragment.m26032N3(tradingNoticeEntity);
        return Unit.INSTANCE;
    }
}
