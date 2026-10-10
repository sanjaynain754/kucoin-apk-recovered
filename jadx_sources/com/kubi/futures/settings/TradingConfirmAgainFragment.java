package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.settings.vm.TradingConfirmAgainViewModel;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.Persistence;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37568c;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: TradingConfirmAgainFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u001c\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\n\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/futures/settings/TradingConfirmAgainFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/settings/vm/TradingConfirmAgainViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/TradingConfirmAgainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchData", "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initTradeConfirmAgainToggleStatus", "tradeConfirmLabelTv", "Lcom/kubi/resources/widget/BaseTextView;", "limitDelegationTv", "setData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "isAllChecked", "", "updateBottomText", "isOpen", "isReversePositionEnable", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradingConfirmAgainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingConfirmAgainFragment.kt\ncom/kubi/futures/settings/TradingConfirmAgainFragment\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n136#2:226\n136#2:227\n136#2:228\n126#2,2:230\n126#2,2:232\n126#2,2:234\n126#2,2:236\n126#2,2:238\n126#2,2:240\n1#3:229\n*S KotlinDebug\n*F\n+ 1 TradingConfirmAgainFragment.kt\ncom/kubi/futures/settings/TradingConfirmAgainFragment\n*L\n179#1:226\n182#1:227\n186#1:228\n99#1:230,2\n104#1:232,2\n109#1:234,2\n131#1:236,2\n133#1:238,2\n136#1:240,2\n*E\n"})
public final class TradingConfirmAgainFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f23217U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public TradingNoticeEntity f23218V;

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingConfirmAgainFragment$a */
    /* JADX INFO: compiled from: TradingConfirmAgainFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13268a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23219b;

        public C13268a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23219b = function;
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
            return this.f23219b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23219b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingConfirmAgainFragment$b */
    /* JADX INFO: compiled from: TradingConfirmAgainFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/futures/settings/TradingConfirmAgainFragment$viewModel$2$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13269b implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new TradingConfirmAgainViewModel("confirm-again");
        }
    }

    /* JADX INFO: renamed from: x3 */
    private final void m26010x3() {
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        C13392j.m26319f(this, "0", new Function1() { // from class: com.kubi.futures.settings.m3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingConfirmAgainFragment.m26011y3(this.f23392b, (TradingNoticeEntity) obj);
            }
        }, new Function0() { // from class: com.kubi.futures.settings.n3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingConfirmAgainFragment.m26012z3(this.f23403b);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    public final void m26014C3(BaseTextView baseTextView, BaseTextView baseTextView2) {
        if (baseTextView != null) {
            C27046k.m66684G(baseTextView, false);
        }
        if (baseTextView2 != null) {
            baseTextView2.setText(C27017c.f54310a.m66516f(R$string.kumex_order_confirm, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m25985D3(TradingConfirmAgainFragment tradingConfirmAgainFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C46392a.m102328k(C46894j.f104736a.m103280s(), z11);
        TradingNoticeEntity value = tradingConfirmAgainFragment.m26013B3().m26475o().getValue();
        if (value == null) {
            value = tradingConfirmAgainFragment.f23218V;
        }
        if (value != null) {
            tradingConfirmAgainFragment.m26017P3(value);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m25986E3(TradingConfirmAgainFragment tradingConfirmAgainFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingConfirmAgainFragment.m26013B3().m26476p("MISOPERATION", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m25987F3(TradingConfirmAgainFragment tradingConfirmAgainFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingConfirmAgainFragment.m26013B3().m26476p("LIMIT_CLOSE", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m25988G3(TradingConfirmAgainFragment tradingConfirmAgainFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingConfirmAgainFragment.m26013B3().m26476p("AUTO_APPEND_MARGIN", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m25989H3(TradingConfirmAgainFragment tradingConfirmAgainFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z11 = !tradingConfirmAgainFragment.m26015M3();
        Persistence.f30799a.m36519f("positions_close_all_tips" + UserInfo.a.i(), z11);
        C46894j c46894j = C46894j.f104736a;
        C46392a.m102328k(c46894j.m103243H(), z11);
        if (tradingConfirmAgainFragment.m26016N3()) {
            C46392a.m102328k(c46894j.m103250O(), z11);
        }
        if (C37568c.m84643n()) {
            C46392a.m102328k(c46894j.m103280s(), z11);
        }
        TradingConfirmAgainViewModel.m26472q(tradingConfirmAgainFragment.m26013B3(), null, z11, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m25990I3(TradingConfirmAgainFragment tradingConfirmAgainFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingConfirmAgainFragment.m26013B3().m26476p("LIMIT", !it.isChecked());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m25991J3(TradingConfirmAgainFragment tradingConfirmAgainFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        Persistence.f30799a.m36519f("positions_close_all_tips" + UserInfo.a.i(), z11);
        TradingNoticeEntity value = tradingConfirmAgainFragment.m26013B3().m26475o().getValue();
        if (value == null) {
            value = tradingConfirmAgainFragment.f23218V;
        }
        if (value != null) {
            tradingConfirmAgainFragment.m26017P3(value);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m25992K3(TradingConfirmAgainFragment tradingConfirmAgainFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C46392a.m102328k(C46894j.f104736a.m103243H(), z11);
        TradingNoticeEntity value = tradingConfirmAgainFragment.m26013B3().m26475o().getValue();
        if (value == null) {
            value = tradingConfirmAgainFragment.f23218V;
        }
        if (value != null) {
            tradingConfirmAgainFragment.m26017P3(value);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m25993L3(TradingConfirmAgainFragment tradingConfirmAgainFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C46392a.m102328k(C46894j.f104736a.m103250O(), z11);
        TradingNoticeEntity value = tradingConfirmAgainFragment.m26013B3().m26475o().getValue();
        if (value == null) {
            value = tradingConfirmAgainFragment.f23218V;
        }
        if (value != null) {
            tradingConfirmAgainFragment.m26017P3(value);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final TradingConfirmAgainViewModel m25995R3(TradingConfirmAgainFragment tradingConfirmAgainFragment) {
        return (TradingConfirmAgainViewModel) new ViewModelProvider(tradingConfirmAgainFragment, new C13269b()).get(TradingConfirmAgainViewModel.class);
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m26011y3(TradingConfirmAgainFragment tradingConfirmAgainFragment, TradingNoticeEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        tradingConfirmAgainFragment.showContentView();
        tradingConfirmAgainFragment.m26017P3(it);
        tradingConfirmAgainFragment.f23218V = it;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m26012z3(final TradingConfirmAgainFragment tradingConfirmAgainFragment) {
        BaseFragment.showFailView$default(tradingConfirmAgainFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.settings.o3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradingConfirmAgainFragment.m25984A3(this.f23413b, view);
            }
        }, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public final TradingConfirmAgainViewModel m26013B3() {
        return (TradingConfirmAgainViewModel) this.f23217U.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX INFO: renamed from: M3 */
    public final boolean m26015M3() {
        boolean z11;
        boolean zM66566d;
        boolean zM66566d2;
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switchLimit);
        if (C27025c.m66566d(switchCompat != null ? Boolean.valueOf(switchCompat.isChecked()) : null)) {
            SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.switchOrderDeep);
            if (C27025c.m66566d(switchCompat2 != null ? Boolean.valueOf(switchCompat2.isChecked()) : null)) {
                SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.switchBookDeep);
                if (C27025c.m66566d(switchCompat3 != null ? Boolean.valueOf(switchCompat3.isChecked()) : null)) {
                    SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switchMarginHint);
                    if (C27025c.m66566d(switchCompat4 != null ? Boolean.valueOf(switchCompat4.isChecked()) : null)) {
                        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.closeAllCondition);
                        if (C27025c.m66566d(switchCompat5 != null ? Boolean.valueOf(switchCompat5.isChecked()) : null)) {
                            SwitchCompat switchCompat6 = (SwitchCompat) findViewById(R$id.MarketCloseAllCondition);
                            if (C27025c.m66566d(switchCompat6 != null ? Boolean.valueOf(switchCompat6.isChecked()) : null)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (C37568c.m84643n()) {
            SwitchCompat switchCompat7 = (SwitchCompat) findViewById(R$id.chaseOrderCondition);
            zM66566d = C27025c.m66566d(switchCompat7 != null ? Boolean.valueOf(switchCompat7.isChecked()) : null);
        } else {
            zM66566d = true;
        }
        if (m26016N3()) {
            SwitchCompat switchCompat8 = (SwitchCompat) findViewById(R$id.reversePositionCondition);
            zM66566d2 = C27025c.m66566d(switchCompat8 != null ? Boolean.valueOf(switchCompat8.isChecked()) : null);
        } else {
            zM66566d2 = true;
        }
        return z11 && zM66566d && zM66566d2;
    }

    /* JADX INFO: renamed from: N3 */
    public final boolean m26016N3() {
        return RepositoryServiceLocator.f19236a.m20288g().mo25020o();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m26017P3(TradingNoticeEntity tradingNoticeEntity) {
        SwitchCompat switchCompat;
        SwitchCompat switchCompat2;
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.switchLimit);
        if (switchCompat3 != null) {
            HashMap<String, Boolean> confirmConfig = tradingNoticeEntity.getConfirmConfig();
            switchCompat3.setChecked(C27025c.m66566d(confirmConfig != null ? confirmConfig.get("LIMIT") : null));
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.switchOrderDeep);
        if (switchCompat4 != null) {
            HashMap<String, Boolean> confirmConfig2 = tradingNoticeEntity.getConfirmConfig();
            switchCompat4.setChecked(C27025c.m66566d(confirmConfig2 != null ? confirmConfig2.get("MISOPERATION") : null));
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.switchBookDeep);
        if (switchCompat5 != null) {
            HashMap<String, Boolean> confirmConfig3 = tradingNoticeEntity.getConfirmConfig();
            switchCompat5.setChecked(C27025c.m66566d(confirmConfig3 != null ? confirmConfig3.get("LIMIT_CLOSE") : null));
        }
        SwitchCompat switchCompat6 = (SwitchCompat) findViewById(R$id.switchMarginHint);
        if (switchCompat6 != null) {
            HashMap<String, Boolean> confirmConfig4 = tradingNoticeEntity.getConfirmConfig();
            switchCompat6.setChecked(C27025c.m66566d(confirmConfig4 != null ? confirmConfig4.get("AUTO_APPEND_MARGIN") : null));
        }
        SwitchCompat switchCompat7 = (SwitchCompat) findViewById(R$id.closeAllCondition);
        if (switchCompat7 != null) {
            switchCompat7.setChecked(Persistence.f30799a.m36516a("positions_close_all_tips" + UserInfo.a.i(), true));
        }
        SwitchCompat switchCompat8 = (SwitchCompat) findViewById(R$id.MarketCloseAllCondition);
        if (switchCompat8 != null) {
            switchCompat8.setChecked(C46392a.m102322d(C46894j.f104736a.m103243H(), true));
        }
        if (m26016N3() && (switchCompat2 = (SwitchCompat) findViewById(R$id.reversePositionCondition)) != null) {
            switchCompat2.setChecked(C46392a.m102322d(C46894j.f104736a.m103250O(), true));
        }
        if (C37568c.m84643n() && (switchCompat = (SwitchCompat) findViewById(R$id.chaseOrderCondition)) != null) {
            switchCompat.setChecked(C46392a.m102322d(C46894j.f104736a.m103280s(), true));
        }
        m26018Q3(m26015M3());
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m26018Q3(boolean z11) {
        int i11 = z11 ? R$string.bkumex_preferences_close : R$string.bkumex_preferences_open;
        TextView textView = (TextView) findViewById(R$id.tv_action);
        if (textView != null) {
            textView.setText(getText(i11));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_trading_confirm_again, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m26010x3();
        m26013B3().m26475o().observe(this, new C13268a(new Function1() { // from class: com.kubi.futures.settings.p3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradingConfirmAgainFragment.m25994O3(this.f23421b, (TradingNoticeEntity) obj);
            }
        }));
    }

    public TradingConfirmAgainFragment() {
        setPageId(C17060n0.m36552b());
        this.f23217U = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.k3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradingConfirmAgainFragment.m25995R3(this.f23375b);
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public static final void m25984A3(TradingConfirmAgainFragment tradingConfirmAgainFragment, View view) {
        tradingConfirmAgainFragment.m26010x3();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m25994O3(TradingConfirmAgainFragment tradingConfirmAgainFragment, TradingNoticeEntity tradingNoticeEntity) {
        tradingConfirmAgainFragment.showContentView();
        Intrinsics.checkNotNull(tradingNoticeEntity);
        tradingConfirmAgainFragment.m26017P3(tradingNoticeEntity);
        return Unit.INSTANCE;
    }

    private final void initView() {
        if (!m26016N3()) {
            View viewFindViewById = findViewById(R$id.reversePositionCondition);
            if (viewFindViewById != null) {
                ViewExtKt.m66577h(viewFindViewById);
            }
            View viewFindViewById2 = findViewById(R$id.reversePosition);
            if (viewFindViewById2 != null) {
                ViewExtKt.m66577h(viewFindViewById2);
            }
        }
        if (!C37568c.m84643n()) {
            View viewFindViewById3 = findViewById(R$id.chaseOrder);
            if (viewFindViewById3 != null) {
                ViewExtKt.m66577h(viewFindViewById3);
            }
            View viewFindViewById4 = findViewById(R$id.chaseOrderCondition);
            if (viewFindViewById4 != null) {
                ViewExtKt.m66577h(viewFindViewById4);
            }
        }
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.switchLimit);
        if (switchCompat != null) {
            ViewExKt.m36487m(switchCompat, new Function1() { // from class: com.kubi.futures.settings.q3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingConfirmAgainFragment.m25990I3(this.f23428b, (SwitchCompat) obj);
                }
            });
        }
        m26014C3((BaseTextView) findViewById(R$id.orderConfirm), (BaseTextView) findViewById(R$id.limitDelegation));
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R$id.closeAllCondition);
        if (switchCompat2 != null) {
            C27046k.m66708w(switchCompat2, new Function2() { // from class: com.kubi.futures.settings.r3
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingConfirmAgainFragment.m25991J3(this.f23436b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R$id.MarketCloseAllCondition);
        if (switchCompat3 != null) {
            C27046k.m66708w(switchCompat3, new Function2() { // from class: com.kubi.futures.settings.s3
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingConfirmAgainFragment.m25992K3(this.f23444b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        SwitchCompat switchCompat4 = (SwitchCompat) findViewById(R$id.reversePositionCondition);
        if (switchCompat4 != null) {
            C27046k.m66708w(switchCompat4, new Function2() { // from class: com.kubi.futures.settings.t3
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingConfirmAgainFragment.m25993L3(this.f23456b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        SwitchCompat switchCompat5 = (SwitchCompat) findViewById(R$id.chaseOrderCondition);
        if (switchCompat5 != null) {
            C27046k.m66708w(switchCompat5, new Function2() { // from class: com.kubi.futures.settings.u3
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingConfirmAgainFragment.m25985D3(this.f23465b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        SwitchCompat switchCompat6 = (SwitchCompat) findViewById(R$id.switchOrderDeep);
        if (switchCompat6 != null) {
            ViewExKt.m36487m(switchCompat6, new Function1() { // from class: com.kubi.futures.settings.v3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingConfirmAgainFragment.m25986E3(this.f23474b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat7 = (SwitchCompat) findViewById(R$id.switchBookDeep);
        if (switchCompat7 != null) {
            ViewExKt.m36487m(switchCompat7, new Function1() { // from class: com.kubi.futures.settings.w3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingConfirmAgainFragment.m25987F3(this.f23565b, (SwitchCompat) obj);
                }
            });
        }
        SwitchCompat switchCompat8 = (SwitchCompat) findViewById(R$id.switchMarginHint);
        if (switchCompat8 != null) {
            ViewExKt.m36487m(switchCompat8, new Function1() { // from class: com.kubi.futures.settings.x3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingConfirmAgainFragment.m25988G3(this.f23574b, (SwitchCompat) obj);
                }
            });
        }
        TextView textView = (TextView) findViewById(R$id.tv_action);
        if (textView != null) {
            ViewExtKt.m66575f(textView, new Function1() { // from class: com.kubi.futures.settings.l3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradingConfirmAgainFragment.m25989H3(this.f23384b, (View) obj);
                }
            });
        }
    }
}
