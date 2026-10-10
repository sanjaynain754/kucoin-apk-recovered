package com.kubi.tradingbotkit.business.strategyList;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$font;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.user.api.IUserService;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27050g0;
import com.kubi.utils.ObservableLast;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import k50.C40911a;
import kotlinx.coroutines.C41696j;
import l50.C42080l0;
import l50.C42092r0;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import u50.C45125a;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: StrategyListFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J\b\u0010*\u001a\u00020%H\u0002J&\u0010+\u001a\u00020%2\u001c\u0010,\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u0013\u0018\u00010-H\u0002J\b\u0010/\u001a\u00020%H\u0002J\b\u00100\u001a\u00020%H\u0002J\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\rJ\b\u00103\u001a\u00020%H\u0002J\u0018\u00104\u001a\u00020%2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0014H\u0002J\u0014\u0010:\u001a\u00020%*\u0002062\u0006\u0010;\u001a\u00020<H\u0002J\u001a\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0-2\u0006\u0010>\u001a\u000208R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006@"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/StrategyListFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyListBinding;", "getBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/tradingbotkit/business/strategyList/StrategyAdapter;", "entryType", "", "getEntryType", "()Ljava/lang/String;", "entryType$delegate", "Lkotlin/Lazy;", "tagItems", "", "Lcom/kubi/tradingbotkit/business/strategyList/TagItem;", "preSelectedStrategyType", "", "viewModel", "Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;", "getViewModel", "()Lcom/kubi/tradingbotkit/business/strategyList/viewModel/StrategyListViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onAgainShow", "initObserver", "refreshTags", "tagDatas", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "refreshPageData", "showNotLogin", "setCurSymbol", "curSymbol", "initView", "initTagsFilter", "generateTagView", "Landroid/widget/TextView;", "ctx", "Landroid/content/Context;", "tagItem", "setIsSelected", "selected", "", "getStrategiesNameDesc", "context", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStrategyListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyListFragment.kt\ncom/kubi/tradingbotkit/business/strategyList/StrategyListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,324:1\n147#2,16:325\n106#3,15:341\n136#4:356\n1869#5,2:357\n1068#5:359\n1869#5,2:360\n1869#5,2:362\n*S KotlinDebug\n*F\n+ 1 StrategyListFragment.kt\ncom/kubi/tradingbotkit/business/strategyList/StrategyListFragment\n*L\n108#1:325,16\n119#1:341,15\n139#1:356\n200#1:357,2\n203#1:359\n257#1:360,2\n279#1:362,2\n*E\n"})
public final class StrategyListFragment extends BaseFragment {

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public static Map<Integer, String> f52411c0;

    /* JADX INFO: renamed from: V */
    @Nullable
    public StrategyAdapter f52413V;

    /* JADX INFO: renamed from: X */
    @Nullable
    public List<TagItem> f52415X;

    /* JADX INFO: renamed from: Y */
    public int f52416Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f52417Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f52410b0 = {Reflection.property1(new PropertyReference1Impl(StrategyListFragment.class, "binding", "getBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyListBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f52409a0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f52412U = C45681e.m100799e(this, new Function1<StrategyListFragment, C42080l0>() { // from class: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42080l0 invoke(@NotNull StrategyListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42080l0.m92313a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C42080l0, Unit>() { // from class: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C42080l0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42080l0 c42080l0) {
            invoke(c42080l0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52414W = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.strategyList.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StrategyListFragment.m64084A3(this.f52426b);
        }
    });

    /* JADX INFO: compiled from: StrategyListFragment.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/StrategyListFragment$Companion;", "", "<init>", "()V", "ENTRY_FUTURES", "", "ENTRY_SPOT", "newInstance", "Lcom/kubi/tradingbotkit/business/strategyList/StrategyListFragment;", "type", "STRATEGIES_NAME_DESC", "", "", "getStrategiesNameDesc", "context", "Landroid/content/Context;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Map<Integer, String> getStrategiesNameDesc(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (StrategyListFragment.f52411c0 == null) {
                StrategyListFragment.f52411c0 = MapsKt.mapOf(TuplesKt.m90091to(0, context.getString(R$string.cancel)), TuplesKt.m90091to(3, context.getString(R$string.kc_tb_futures_grid)), TuplesKt.m90091to(12, context.getString(R$string.kc_tb_futures_martin_gale)), TuplesKt.m90091to(9, context.getString(R$string.kc_tb_futures_win_two_way)), TuplesKt.m90091to(13, context.getString(R$string.kc_tb_futures_cta)), TuplesKt.m90091to(1, context.getString(R$string.kc_tb_spot_grid)), TuplesKt.m90091to(11, context.getString(R$string.kc_tb_spot_cta)), TuplesKt.m90091to(7, context.getString(R$string.kc_tb_spot_martin_gale)), TuplesKt.m90091to(4, context.getString(R$string.kc_tb_spot_positions)), TuplesKt.m90091to(2, context.getString(R$string.kc_tb_spot_aip)), TuplesKt.m90091to(8, context.getString(R$string.kc_tb_spot_ai)), TuplesKt.m90091to(5, context.getString(R$string.kc_tb_spot_infinity)), TuplesKt.m90091to(10, context.getString(R$string.kc_tb_margin_grid)));
            }
            Map<Integer, String> map = StrategyListFragment.f52411c0;
            Intrinsics.checkNotNull(map);
            return map;
        }

        @NotNull
        public final StrategyListFragment newInstance(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            StrategyListFragment strategyListFragment = new StrategyListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("type", type);
            strategyListFragment.setArguments(bundle);
            return strategyListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 StrategyListFragment.kt\ncom/kubi/tradingbotkit/business/strategyList/StrategyListFragment\n*L\n1#1,328:1\n203#2:329\n*E\n"})
    public static final class C26183a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((TagItem) t12).getNum()), Integer.valueOf(((TagItem) t11).getNum()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$b */
    /* JADX INFO: compiled from: StrategyListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/tradingbotkit/business/strategyList/StrategyListFragment$viewModel$2$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26184b implements ViewModelProvider.Factory {
        public C26184b() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new StrategyListViewModel(StrategyListFragment.this.m64115E3());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public static final Unit m64092O3() {
        C40911a.m89599c("", null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Pair m64087I3(LoginUserEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IUserService iUserServiceM64273f = TradingBotKitDepend.m64273f();
        return TuplesKt.m90091to(Boolean.valueOf(iUserServiceM64273f.c()), Boolean.valueOf(iUserServiceM64273f.d0().isHasOpenContract()));
    }

    /* JADX INFO: renamed from: J3 */
    public static final Pair m64088J3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Pair) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m64091N3(StrategyListFragment strategyListFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        strategyListFragment.m64117G3().m64150I(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m64094V3() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final ViewModelProvider.Factory m64095W3(StrategyListFragment strategyListFragment) {
        return strategyListFragment.new C26184b();
    }

    /* JADX INFO: renamed from: D3 */
    public final C42080l0 m64114D3() {
        return (C42080l0) this.f52412U.getValue(this, f52410b0[0]);
    }

    /* JADX INFO: renamed from: E3 */
    public final String m64115E3() {
        return (String) this.f52414W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: F3 */
    public final Map<Integer, String> m64116F3(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f52409a0.getStrategiesNameDesc(context);
    }

    @NotNull
    /* JADX INFO: renamed from: G3 */
    public final StrategyListViewModel m64117G3() {
        return (StrategyListViewModel) this.f52417Z.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m64121R3(@NotNull String curSymbol) {
        Intrinsics.checkNotNullParameter(curSymbol, "curSymbol");
        if (!isAdded() || isDetached() || getContext() == null) {
            return;
        }
        m64117G3().m64149H(curSymbol);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m64123T3() {
        Spanned spannedFromHtml = Html.fromHtml(getStringRes(R$string.please_first, C27041f.m66663c(getStringRes(R$string.login, new Object[0]), Integer.valueOf(getColorRes(R$color.primary)), null, 2, null)));
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        BaseFragment.showEmptyView$default(this, spannedFromHtml, 0, new View.OnClickListener() { // from class: com.kubi.tradingbotkit.business.strategyList.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StrategyListFragment.m64093U3(view);
            }
        }, 2, (Object) null);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.btrading_bot_kit_strategy_list, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KuCheckBox kuCheckBox;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LoadingViewUtils.f48255a.m58509b(this);
        C42080l0 c42080l0M64114D3 = m64114D3();
        if (c42080l0M64114D3 != null && (kuCheckBox = c42080l0M64114D3.f93036g) != null) {
            kuCheckBox.setChecked(C46392a.m102322d(C45125a.f101543a.m99748c(), false));
        }
        initView();
        m64086H3();
        m64119P3();
    }

    public StrategyListFragment() {
        Function0 function0 = new Function0() { // from class: com.kubi.tradingbotkit.business.strategyList.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategyListFragment.m64095W3(this.f52427b);
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function2 = null;
        this.f52417Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(StrategyListViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.strategyList.StrategyListFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function2;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
    }

    /* JADX INFO: renamed from: A3 */
    public static final String m64084A3(StrategyListFragment strategyListFragment) {
        String string;
        Bundle arguments = strategyListFragment.getArguments();
        if (arguments != null && (string = arguments.getString("type")) != null) {
            return string;
        }
        return SearchCategory$Companion.FUTURES;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m64085C3(TagItem tagItem, StrategyListFragment strategyListFragment) {
        boolean z11;
        if (tagItem.getType() == strategyListFragment.f52416Y) {
            return Unit.INSTANCE;
        }
        strategyListFragment.f52416Y = tagItem.getType();
        List<TagItem> list = strategyListFragment.f52415X;
        if (list != null) {
            for (TagItem tagItem2 : list) {
                TextView tagTextView = tagItem2.getTagTextView();
                if (tagTextView != null) {
                    if (strategyListFragment.f52416Y == tagItem2.getType()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    strategyListFragment.m64122S3(tagTextView, z11);
                }
            }
        }
        strategyListFragment.m64117G3().m64155x(tagItem.getType());
        if (strategyListFragment.m64117G3().m64153v()) {
            C43852m.m96590b(IKuMexService.f28731a.get().mo33260I(), "botTab", "grid", TuplesKt.m90091to("grid_type", String.valueOf(tagItem.getType())));
        } else {
            C43852m.m96590b(ISpotService.f49646a.get().mo59997j(), "botTab", "grid", TuplesKt.m90091to("grid_type", String.valueOf(tagItem.getType())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    private final void m64086H3() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new StrategyListFragment$initObserver$1(this, null), 3, null);
        ObservableLast observableLastM66716a = C27050g0.m66716a(TradingBotKitDepend.m64273f().m(), showPredicate());
        final Function1 function1 = new Function1() { // from class: com.kubi.tradingbotkit.business.strategyList.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StrategyListFragment.m64087I3((LoginUserEntity) obj);
            }
        };
        Observable observableObserveOn = observableLastM66716a.map(new Function() { // from class: com.kubi.tradingbotkit.business.strategyList.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return StrategyListFragment.m64088J3(function1, obj);
            }
        }).distinctUntilChanged().observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.tradingbotkit.business.strategyList.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StrategyListFragment.m64089K3(this.f52424b, (Pair) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.tradingbotkit.business.strategyList.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StrategyListFragment.m64090L3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m64089K3(StrategyListFragment strategyListFragment, Pair pair) {
        ((Boolean) pair.component1()).getClass();
        strategyListFragment.m64119P3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final void m64090L3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m64093U3(View view) {
        IUserService.O(TradingBotKitDepend.m64273f(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.tradingbotkit.business.strategyList.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategyListFragment.m64094V3();
            }
        }), 1, (Object) null);
    }

    private final void initView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        KcSecondaryButton kcSecondaryButton;
        KuCheckBox kuCheckBox;
        C42080l0 c42080l0M64114D3 = m64114D3();
        if (c42080l0M64114D3 != null && (kuCheckBox = c42080l0M64114D3.f93036g) != null) {
            C27046k.m66708w(kuCheckBox, new Function2() { // from class: com.kubi.tradingbotkit.business.strategyList.k
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StrategyListFragment.m64091N3(this.f52428b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C42080l0 c42080l0M64114D4 = m64114D3();
        if (c42080l0M64114D4 != null && (kcSecondaryButton = c42080l0M64114D4.f93031b) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.strategyList.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StrategyListFragment.m64092O3();
                }
            }, 1, null);
        }
        Context context = getContext();
        if (context != null) {
            this.f52413V = new StrategyAdapter(m64115E3(), m64117G3(), CollectionsKt.emptyList(), m64116F3(context));
        }
        C42080l0 c42080l0M64114D5 = m64114D3();
        if (c42080l0M64114D5 != null && (recyclerView3 = c42080l0M64114D5.f93035f) != null) {
            recyclerView3.setAdapter(this.f52413V);
        }
        C42080l0 c42080l0M64114D6 = m64114D3();
        if (c42080l0M64114D6 != null && (recyclerView2 = c42080l0M64114D6.f93035f) != null) {
            recyclerView2.setItemAnimator(null);
        }
        C42080l0 c42080l0M64114D7 = m64114D3();
        if (c42080l0M64114D7 != null && (recyclerView = c42080l0M64114D7.f93035f) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        }
        m64118M3(m64117G3().m64147E());
    }

    /* JADX INFO: renamed from: B3 */
    public final TextView m64113B3(Context context, final TagItem tagItem) {
        boolean z11;
        C42092r0 c42092r0M92338c = C42092r0.m92338c(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(c42092r0M92338c, "inflate(...)");
        c42092r0M92338c.f93257b.setText(tagItem.getTagName() + " (" + tagItem.getNum() + ")");
        BaseTextView typeTv = c42092r0M92338c.f93257b;
        Intrinsics.checkNotNullExpressionValue(typeTv, "typeTv");
        if (this.f52416Y == tagItem.getType()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m64122S3(typeTv, z11);
        BaseTextView typeTv2 = c42092r0M92338c.f93257b;
        Intrinsics.checkNotNullExpressionValue(typeTv2, "typeTv");
        C27046k.m66711z(typeTv2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.strategyList.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategyListFragment.m64085C3(tagItem, this);
            }
        }, 1, null);
        BaseTextView typeTv3 = c42092r0M92338c.f93257b;
        Intrinsics.checkNotNullExpressionValue(typeTv3, "typeTv");
        return typeTv3;
    }

    /* JADX INFO: renamed from: M3 */
    public final void m64118M3(List<TagItem> list) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Context context = getContext();
        if (context != null) {
            C42080l0 c42080l0M64114D3 = m64114D3();
            if (c42080l0M64114D3 != null && (linearLayout2 = c42080l0M64114D3.f93037h) != null) {
                linearLayout2.removeAllViews();
            }
            if (list != null) {
                for (TagItem tagItem : list) {
                    TextView textViewM64113B3 = m64113B3(context, tagItem);
                    tagItem.m64135f(textViewM64113B3);
                    C42080l0 c42080l0M64114D4 = m64114D3();
                    if (c42080l0M64114D4 != null && (linearLayout = c42080l0M64114D4.f93037h) != null) {
                        linearLayout.addView(textViewM64113B3);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m64119P3() {
        if (TradingBotKitDepend.m64273f().c()) {
            m64117G3().m64154w();
        } else {
            m64123T3();
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m64120Q3(Map<Integer, ? extends List<StrategyItemEntity>> map) {
        int size;
        List<StrategyItemEntity> list;
        for (TagItem tagItem : m64117G3().m64147E()) {
            if (map != null && (list = map.get(Integer.valueOf(tagItem.getType()))) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            tagItem.m64134e(size);
        }
        List<TagItem> listSortedWith = CollectionsKt.sortedWith(m64117G3().m64147E(), new C26183a());
        this.f52415X = listSortedWith;
        m64118M3(listSortedWith);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m64122S3(TextView textView, boolean z11) {
        textView.setSelected(z11);
        if (z11) {
            textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), R$font.medium));
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.c_text));
        } else {
            textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), R$font.regular));
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.c_text40));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        m64119P3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m64117G3().m64152K();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m64117G3().m64151J();
    }
}
