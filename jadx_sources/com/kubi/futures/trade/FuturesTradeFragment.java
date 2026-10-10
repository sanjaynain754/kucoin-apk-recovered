package com.kubi.futures.trade;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.futures.compliance.EuropeComplianceContractsDialog;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageProcessor;
import com.kubi.futures.settings.CrossLeverageSettingDialog;
import com.kubi.futures.settings.IsolatedLeverageSettingDialog;
import com.kubi.futures.trade.book.C13635c;
import com.kubi.futures.trade.book.FuturesBookFragment;
import com.kubi.futures.trade.challenge.FuturesTraderProChallengeController;
import com.kubi.futures.trade.submit.FuturesSubmitFragment;
import com.kubi.futures.view.FuturesTraderProChallengeView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$string;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.C17067s;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36796l2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38215c;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import sh.EuropeComplianceSymbolDocEntity;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesTradeFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020!H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020!H\u0002J\u0018\u00106\u001a\u00020!2\u0006\u00107\u001a\u0002022\u0006\u00108\u001a\u000202H\u0002J(\u00109\u001a\u0002022\u0006\u0010:\u001a\u0002022\u0006\u00108\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u000202H\u0002J\n\u0010;\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010<\u001a\u00020!H\u0016J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0002J\b\u0010?\u001a\u00020@H\u0002J\u0012\u0010A\u001a\u00020!2\b\u0010B\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010C\u001a\u00020!2\b\u0010B\u001a\u0004\u0018\u00010\u001dH\u0002J\f\u0010D\u001a\u00020!*\u00020EH\u0002J\b\u0010F\u001a\u00020!H\u0016J\b\u0010G\u001a\u0004\u0018\u00010HR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m90084d2 = {"Lcom/kubi/futures/trade/FuturesTradeFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "viewModel", "Lcom/kubi/futures/trade/FuturesTradeViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/FuturesTradeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesTradeBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesTradeBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "traderProChallengeController", "Lcom/kubi/futures/trade/challenge/FuturesTraderProChallengeController;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initTraderProChallengeView", "registerObserver", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onEnvironmentChanged", "environmentConfig", "Lcom/kubi/futures/trade/config/IFuturesEnvironmentConfig;", "onEuropeComplianceDoc", "tips", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceSymbolDocEntity;", "onContractChanged", "contractConfig", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "registerPanelHeightChanged", "lastBookHeight", "", "lastSubmitHeight", "bookItemHeight", "minTopMargin", "calculateBookCount", "submitHeight", "bookHeight", "calculateItemCount", "realSubmitHeight", "getFooterPanel", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "resetDirection", "getSubmitPercent", "", "onArguments", "bundle", "handleArguments", "dismissLeverageDialog", "Landroidx/fragment/app/FragmentManager;", "onDestroyView", "getBookEntity", "Lcom/kubi/kumex/logic/book/BookEntity;", "IPanelDirectionSettingConstant", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTradeFragment.kt\ncom/kubi/futures/trade/FuturesTradeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,480:1\n106#2,15:481\n143#3,20:496\n1#4:516\n347#5:517\n372#6:518\n1549#7:519\n1620#7,3:520\n1869#7,2:523\n1869#7,2:525\n*S KotlinDebug\n*F\n+ 1 FuturesTradeFragment.kt\ncom/kubi/futures/trade/FuturesTradeFragment\n*L\n97#1:481,15\n99#1:496,20\n275#1:517\n333#1:518\n333#1:519\n333#1:520,3\n369#1:523,2\n389#1:525,2\n*E\n"})
public final class FuturesTradeFragment extends BaseFragment {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f23599c0 = {Reflection.property1(new PropertyReference1Impl(FuturesTradeFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesTradeBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public boolean f23600U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f23601V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f23602W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public FuturesTraderProChallengeController f23603X;

    /* JADX INFO: renamed from: Y */
    public int f23604Y;

    /* JADX INFO: renamed from: Z */
    public int f23605Z;

    /* JADX INFO: renamed from: a0 */
    public final int f23606a0;

    /* JADX INFO: renamed from: b0 */
    public final int f23607b0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesTradeFragment$a */
    /* JADX INFO: compiled from: FuturesTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/futures/trade/FuturesTradeFragment$IPanelDirectionSettingConstant;", "", "<init>", "()V", "getSubmitHorizontalMargin", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13599a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C13599a f23608a = new C13599a();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Pair<Integer, Integer> m26581a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return C27063n.m66764b("trade_panel_position", 1) == 0 ? new Pair<>(Integer.valueOf((int) C27025c.m66565c(context, 16)), Integer.valueOf((int) C27025c.m66565c(context, 20))) : new Pair<>(Integer.valueOf((int) C27025c.m66565c(context, 20)), Integer.valueOf((int) C27025c.m66565c(context, 16)));
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesTradeFragment$b */
    /* JADX INFO: compiled from: FuturesTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/futures/trade/FuturesTradeFragment$onEuropeComplianceDoc$costSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13600b extends ClickableSpan {
        public C13600b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            EuropeComplianceContractsDialog.Companion companion = EuropeComplianceContractsDialog.f22560w0;
            FragmentManager childFragmentManager = FuturesTradeFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, "cost_transparency");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(C27017c.f54310a.m66512a(R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesTradeFragment$c */
    /* JADX INFO: compiled from: FuturesTradeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/futures/trade/FuturesTradeFragment$onEuropeComplianceDoc$legalSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13601c extends ClickableSpan {
        public C13601c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            EuropeComplianceContractsDialog.Companion companion = EuropeComplianceContractsDialog.f22560w0;
            FragmentManager childFragmentManager = FuturesTradeFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, "legal");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(C27017c.f54310a.m66512a(R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesTradeFragment$d */
    /* JADX INFO: compiled from: FuturesTradeFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13602d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23611b;

        public C13602d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23611b = function;
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
            return this.f23611b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23611b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m26558K3(FuturesTradeFragment futuresTradeFragment, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i14 - i12;
        if (i19 == futuresTradeFragment.f23604Y) {
            return;
        }
        futuresTradeFragment.m26573r3(futuresTradeFragment.f23605Z, i19);
        if (futuresTradeFragment.f23604Y <= 0) {
            futuresTradeFragment.f23604Y = i19;
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m26559L3(FuturesTradeFragment futuresTradeFragment, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i14 - i12;
        if (i19 == futuresTradeFragment.f23605Z) {
            return;
        }
        futuresTradeFragment.m26573r3(i19, futuresTradeFragment.f23604Y);
    }

    /* JADX INFO: renamed from: z3 */
    private final void m26569z3(Bundle bundle) {
        String strM56284y = bundle != null ? RouteExKt.m56284y(bundle, "symbol") : null;
        String strM66669i = C27041f.m66669i(bundle != null ? RouteExKt.m56285z(bundle, "leverage", "") : null, "");
        if (strM66669i.length() > 0 && strM56284y != null && strM56284y.length() != 0) {
            m26580y3().m26706x1(strM56284y, strM66669i);
        }
        String strM56284y2 = bundle != null ? RouteExKt.m56284y(bundle, "europeUnlockLeverage") : null;
        if (strM56284y2 == null || strM56284y2.length() == 0) {
            return;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FuturesTradeFragment$handleArguments$1(this, strM56284y2, null), 3, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f23603X = null;
        EuropeUnlockLeverageProcessor.f22643a.m24699f();
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: C3 */
    private final void m26552C3(InterfaceC38213a interfaceC38213a) {
        FuturesTraderProChallengeController futuresTraderProChallengeController = this.f23603X;
        if (futuresTraderProChallengeController != null) {
            futuresTraderProChallengeController.m26954D();
        }
    }

    /* JADX INFO: renamed from: M3 */
    private final void m26560M3() {
        Object next;
        C36796l2 c36796l2M26579x3 = m26579x3();
        if (c36796l2M26579x3 == null) {
            return;
        }
        View viewFindViewById = c36796l2M26579x3.getRoot().findViewById(R$id.fragment_submit);
        View viewFindViewById2 = c36796l2M26579x3.getRoot().findViewById(R$id.fragment_orderbook);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        C13599a c13599a = C13599a.f23608a;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Pair<Integer, Integer> pairM26581a = c13599a.m26581a(contextRequireContext);
        Intrinsics.checkNotNull(viewFindViewById);
        List<Fragment> fragments = ViewKt.findFragment(viewFindViewById).getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Fragment) next) instanceof FuturesSubmitFragment));
        Fragment fragment = (Fragment) next;
        if (fragment == null) {
            return;
        }
        if (C27063n.m66764b("trade_panel_position", 1) == 0) {
            layoutParams2.startToEnd = -1;
            layoutParams2.endToEnd = -1;
            layoutParams2.endToStart = R$id.fragment_orderbook;
            layoutParams2.startToStart = R$id.cl_root;
            List<Fragment> fragments2 = fragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
            Iterator<T> it2 = fragments2.iterator();
            while (it2.hasNext()) {
                View view = ((Fragment) it2.next()).getView();
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams.setMarginStart(pairM26581a.getFirst().intValue());
                    marginLayoutParams.setMarginEnd(pairM26581a.getSecond().intValue());
                    view.setLayoutParams(marginLayoutParams);
                }
            }
            layoutParams4.setMarginStart(0);
            layoutParams4.setMarginEnd(C27029c.m66603f(this, 16));
            layoutParams4.startToStart = -1;
            layoutParams4.endToStart = -1;
            layoutParams4.startToEnd = R$id.fragment_submit;
            layoutParams4.endToEnd = R$id.cl_root;
            C43852m.m96605q("preference_status", new JSONObject().put("OrderbookStatus", "left"));
        } else {
            layoutParams2.endToStart = -1;
            layoutParams2.startToStart = -1;
            layoutParams2.startToEnd = R$id.fragment_orderbook;
            layoutParams2.endToEnd = R$id.cl_root;
            List<Fragment> fragments3 = fragment.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments3, "getFragments(...)");
            Iterator<T> it3 = fragments3.iterator();
            while (it3.hasNext()) {
                View view2 = ((Fragment) it3.next()).getView();
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    marginLayoutParams2.setMarginStart(pairM26581a.getFirst().intValue());
                    marginLayoutParams2.setMarginEnd(pairM26581a.getSecond().intValue());
                    view2.setLayoutParams(marginLayoutParams2);
                }
            }
            layoutParams4.setMarginStart(C27029c.m66603f(this, 16));
            layoutParams4.setMarginEnd(0);
            layoutParams4.startToEnd = -1;
            layoutParams4.endToEnd = -1;
            layoutParams4.startToStart = R$id.cl_root;
            layoutParams4.endToStart = R$id.fragment_submit;
            C43852m.m96605q("preference_status", new JSONObject().put("OrderbookStatus", "right"));
        }
        float fM26578w3 = m26578w3();
        layoutParams2.horizontalWeight = fM26578w3;
        viewFindViewById.setLayoutParams(layoutParams2);
        layoutParams4.horizontalWeight = 1 - fM26578w3;
        viewFindViewById2.setLayoutParams(layoutParams4);
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF23600U() {
        return this.f23600U;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LinearLayoutCompat root = C36796l2.m82453c(inflater, container, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m26569z3(getArguments());
        m26572J3();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m26554F3(viewLifecycleOwner);
        m26570A3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m26573r3(int i11, int i12) {
        View viewM26577v3;
        if (i12 == 0 || i11 == 0 || i11 == i12 || (viewM26577v3 = m26577v3()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewM26577v3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i13 = i11 - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        int iM26574s3 = m26574s3(i13, i12, this.f23606a0, this.f23607b0);
        int i14 = this.f23606a0;
        int i15 = (iM26574s3 * i14 * 2) + i12;
        int i16 = i15 - i13;
        if (i16 < this.f23607b0) {
            int i17 = iM26574s3 + 1;
            i15 = i12 + (i14 * i17 * 2);
            i16 = i15 - i13;
            m26580y3().m26685W0().setValue(Integer.valueOf(i17));
        } else {
            m26580y3().m26685W0().setValue(Integer.valueOf(iM26574s3));
        }
        int i18 = i15;
        int i19 = i16;
        ViewExtKt.m66585p(viewM26577v3, 0, i19, 0, 0, 13, null);
        this.f23605Z = i13 + i19;
        this.f23604Y = i18;
    }

    /* JADX INFO: renamed from: s3 */
    public final int m26574s3(int i11, int i12, int i13, int i14) {
        int i15 = i11 - i12;
        if (i15 > 0) {
            if (i12 + i14 >= i11) {
                return 0;
            }
            int iCeil = (int) Math.ceil(((double) i15) / (((double) i13) * 2.0d));
            return i12 + ((i13 * iCeil) * 2) < i11 + i14 ? iCeil + 1 : iCeil;
        }
        int iAbs = Math.abs(i15);
        if (iAbs <= i14) {
            return 1;
        }
        int iFloor = (int) Math.floor(((double) iAbs) / (((double) i13) * 2.0d));
        while ((iFloor * i13 * 2) + i12 > i11 + i14) {
            iFloor--;
        }
        return iFloor;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f23600U = z11;
    }

    /* JADX INFO: renamed from: x3 */
    public final C36796l2 m26579x3() {
        return (C36796l2) this.f23602W.getValue(this, f23599c0[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final FuturesTradeViewModel m26580y3() {
        return (FuturesTradeViewModel) this.f23601V.getValue();
    }

    public FuturesTradeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.FuturesTradeFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.FuturesTradeFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f23601V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuturesTradeViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.FuturesTradeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.FuturesTradeFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.FuturesTradeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f23602W = C45681e.m100799e(this, new Function1<FuturesTradeFragment, C36796l2>() { // from class: com.kubi.futures.trade.FuturesTradeFragment$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36796l2 invoke(@NotNull FuturesTradeFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36796l2.m82452a(fragment.requireView());
            }
        }, new Function1<C36796l2, Unit>() { // from class: com.kubi.futures.trade.FuturesTradeFragment$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36796l2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36796l2 c36796l2) {
                invoke(c36796l2);
                return Unit.INSTANCE;
            }
        });
        this.f23606a0 = C27029c.m66603f(this, C13635c.m26931a());
        this.f23607b0 = C27029c.m66603f(this, 16);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m26551B3(FuturesTradeFragment futuresTradeFragment, boolean z11) {
        FuturesFragment futuresFragment;
        Fragment parentFragment = futuresTradeFragment.getParentFragment();
        if (parentFragment instanceof FuturesFragment) {
            futuresFragment = (FuturesFragment) parentFragment;
        } else {
            futuresFragment = null;
        }
        if (futuresFragment != null) {
            futuresFragment.m36179i8(z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    private final void m26553D3(InterfaceC38215c interfaceC38215c) {
        InterfaceC38213a interfaceC38213aM26687Y0 = m26580y3().m26687Y0();
        if (interfaceC38213aM26687Y0 != null) {
            m26580y3().m26683T0(C27041f.m66668h(interfaceC38213aM26687Y0.getSymbol()));
        }
    }

    /* JADX INFO: renamed from: F3 */
    private final void m26554F3(LifecycleOwner lifecycleOwner) {
        m26580y3().m26686X0().observe(lifecycleOwner, new C13602d(new Function1() { // from class: com.kubi.futures.trade.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeFragment.m26555G3(this.f23769b, (InterfaceC38213a) obj);
            }
        }));
        m26580y3().m26693e1().observe(lifecycleOwner, new C13602d(new Function1() { // from class: com.kubi.futures.trade.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeFragment.m26556H3(this.f23771b, (EuropeComplianceSymbolDocEntity) obj);
            }
        }));
        Transformations.distinctUntilChanged(m26580y3().m26690b1()).observe(lifecycleOwner, new C13602d(new Function1() { // from class: com.kubi.futures.trade.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeFragment.m26557I3(this.f23773b, (InterfaceC38215c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m26555G3(FuturesTradeFragment futuresTradeFragment, InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNull(interfaceC38213a);
        futuresTradeFragment.m26552C3(interfaceC38213a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m26556H3(FuturesTradeFragment futuresTradeFragment, EuropeComplianceSymbolDocEntity europeComplianceSymbolDocEntity) {
        Intrinsics.checkNotNull(europeComplianceSymbolDocEntity);
        futuresTradeFragment.m26571E3(europeComplianceSymbolDocEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m26557I3(FuturesTradeFragment futuresTradeFragment, InterfaceC38215c interfaceC38215c) {
        Intrinsics.checkNotNull(interfaceC38215c);
        futuresTradeFragment.m26553D3(interfaceC38215c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final void m26570A3() {
        View view;
        FuturesTraderProChallengeView futuresTraderProChallengeView;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null && (futuresTraderProChallengeView = (FuturesTraderProChallengeView) view.findViewById(R$id.traderProChallengeView)) != null) {
            futuresTraderProChallengeView.setOnVisibilityChanged(new Function1() { // from class: com.kubi.futures.trade.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesTradeFragment.m26551B3(this.f23643b, ((Boolean) obj).booleanValue());
                }
            });
            FuturesTraderProChallengeController futuresTraderProChallengeController = new FuturesTraderProChallengeController(this, futuresTraderProChallengeView, m26580y3());
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            futuresTraderProChallengeController.m26957k(viewLifecycleOwner);
            this.f23603X = futuresTraderProChallengeController;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E3 */
    public final void m26571E3(EuropeComplianceSymbolDocEntity europeComplianceSymbolDocEntity) {
        String priidKIdUrlShort;
        String priidKIdCostUrlLong;
        String priidKIdCostUrlShort;
        String showPoweredByText;
        C36796l2 c36796l2M26579x3 = m26579x3();
        if (c36796l2M26579x3 == null) {
            return;
        }
        AlignTopTextView europeCompliance = c36796l2M26579x3.f80481c;
        Intrinsics.checkNotNullExpressionValue(europeCompliance, "europeCompliance");
        if (!C27025c.m66566d(europeComplianceSymbolDocEntity.getShowLink()) && !C27025c.m66566d(europeComplianceSymbolDocEntity.getShowPoweredBy())) {
            ViewExtKt.m66577h(europeCompliance);
            ConstraintLayout clRoot = c36796l2M26579x3.f80480b;
            Intrinsics.checkNotNullExpressionValue(clRoot, "clRoot");
            ViewExtKt.m66585p(clRoot, 0, C27040e.m66658b(6), 0, 0, 13, null);
            return;
        }
        europeCompliance.setDrawablePaddingTop(C27040e.m66658b(2));
        C27046k.m66685H(europeCompliance);
        ConstraintLayout clRoot2 = c36796l2M26579x3.f80480b;
        Intrinsics.checkNotNullExpressionValue(clRoot2, "clRoot");
        ViewExtKt.m66585p(clRoot2, 0, C27040e.m66658b(10), 0, 0, 13, null);
        if (C27025c.m66566d(europeComplianceSymbolDocEntity.getShowPoweredBy()) && (showPoweredByText = europeComplianceSymbolDocEntity.getShowPoweredByText()) != null && showPoweredByText.length() != 0 && !C27025c.m66566d(europeComplianceSymbolDocEntity.getShowLink()) && !C27025c.m66566d(europeComplianceSymbolDocEntity.getShowCostLink())) {
            europeCompliance.setText(europeComplianceSymbolDocEntity.getShowPoweredByText());
            return;
        }
        String priidKIdUrlLong = europeComplianceSymbolDocEntity.getPriidKIdUrlLong();
        if ((priidKIdUrlLong != null && priidKIdUrlLong.length() != 0) || (((priidKIdUrlShort = europeComplianceSymbolDocEntity.getPriidKIdUrlShort()) != null && priidKIdUrlShort.length() != 0) || (((priidKIdCostUrlLong = europeComplianceSymbolDocEntity.getPriidKIdCostUrlLong()) != null && priidKIdCostUrlLong.length() != 0) || ((priidKIdCostUrlShort = europeComplianceSymbolDocEntity.getPriidKIdCostUrlShort()) != null && priidKIdCostUrlShort.length() != 0)))) {
            europeCompliance.setMovementMethod(LinkMovementMethod.getInstance());
            europeCompliance.setHighlightColor(0);
            C13601c c13601c = new C13601c();
            C13600b c13600b = new C13600b();
            C27096v0 c27096v0Append = new C27096v0().append(C27041f.m66668h(europeComplianceSymbolDocEntity.getShowPoweredByText()));
            if (europeComplianceSymbolDocEntity.m97956k() && europeComplianceSymbolDocEntity.m97955j()) {
                c27096v0Append.append(getString(R$string.futures_eourpe_legal_cost_link));
                europeCompliance.setText(c27096v0Append);
                HighlightTextHelper.f43497a.m54120f(europeCompliance, new Pair(HighlightTextHelper.TextTagEnum.SPAN, c13601c), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, c13600b));
                return;
            } else if (europeComplianceSymbolDocEntity.m97956k()) {
                c27096v0Append.append(getString(R$string.futures_eourpe_legal_link));
                europeCompliance.setText(c27096v0Append);
                HighlightTextHelper.f43497a.m54120f(europeCompliance, new Pair(HighlightTextHelper.TextTagEnum.SPAN, c13601c));
                return;
            } else {
                c27096v0Append.append(getString(R$string.futures_eourpe_cost_link));
                europeCompliance.setText(c27096v0Append);
                HighlightTextHelper.f43497a.m54120f(europeCompliance, new Pair(HighlightTextHelper.TextTagEnum.SPAN, c13600b));
                return;
            }
        }
        europeCompliance.setText(europeComplianceSymbolDocEntity.getShowPoweredByText());
    }

    /* JADX INFO: renamed from: J3 */
    public final void m26572J3() {
        C36796l2 c36796l2M26579x3 = m26579x3();
        if (c36796l2M26579x3 == null) {
            return;
        }
        c36796l2M26579x3.f80482d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.kubi.futures.trade.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                FuturesTradeFragment.m26558K3(this.f23646b, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        c36796l2M26579x3.f80483e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.kubi.futures.trade.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                FuturesTradeFragment.m26559L3(this.f23741b, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        super.onArguments(bundle);
        m26569z3(bundle);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m26580y3().onHide();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        super.onShow();
        m26560M3();
        m26580y3().onShow();
        FuturesTraderProChallengeController futuresTraderProChallengeController = this.f23603X;
        if (futuresTraderProChallengeController != null) {
            futuresTraderProChallengeController.m26954D();
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m26575t3(FragmentManager fragmentManager) {
        DialogFragment dialogFragment;
        for (Fragment fragment : fragmentManager.getFragments()) {
            Intrinsics.checkNotNull(fragment);
            if (!C17067s.m36608a(fragment)) {
                if (!(fragment instanceof CrossLeverageSettingDialog) && !(fragment instanceof IsolatedLeverageSettingDialog)) {
                    FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    m26575t3(childFragmentManager);
                } else {
                    if (fragment instanceof DialogFragment) {
                        dialogFragment = (DialogFragment) fragment;
                    } else {
                        dialogFragment = null;
                    }
                    if (dialogFragment != null) {
                        dialogFragment.dismissAllowingStateLoss();
                    }
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u3 */
    public final BookEntity m26576u3() {
        FragmentContainerView fragmentContainerView;
        FuturesBookFragment futuresBookFragment;
        C36796l2 c36796l2M26579x3 = m26579x3();
        if (c36796l2M26579x3 != null && (fragmentContainerView = c36796l2M26579x3.f80482d) != null && (futuresBookFragment = (FuturesBookFragment) fragmentContainerView.getFragment()) != null) {
            return futuresBookFragment.m26801M3();
        }
        return null;
    }

    /* JADX INFO: renamed from: v3 */
    public final View m26577v3() {
        ViewGroup viewGroup;
        C36796l2 c36796l2M26579x3 = m26579x3();
        if (c36796l2M26579x3 == null) {
            return null;
        }
        View view = c36796l2M26579x3.f80483e.getFragment().getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return null;
        }
        IntRange intRangeUntil = RangesKt.until(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
        }
        return (View) CollectionsKt.last((List) arrayList);
    }

    /* JADX INFO: renamed from: w3 */
    public final float m26578w3() {
        int iM6180b = C5267e0.m6180b();
        return ((((iM6180b - C27029c.m66603f(this, 36)) * 3) / 5.0f) + C27029c.m66603f(this, 36)) / iM6180b;
    }
}
