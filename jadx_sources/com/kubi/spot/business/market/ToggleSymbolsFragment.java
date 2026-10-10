package com.kubi.spot.business.market;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.blankj.utilcode.util.C5275i0;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.MarketsEntity;
import com.kubi.spot.quote.market.SpotFavorHelper;
import com.kubi.spot.quote.market.ToggleSymbolsListFragment;
import com.kubi.spot.quote.market.TradeListModel;
import com.kubi.spot.quote.market.symbolListItemView.SymbolsListAdapter;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import eg.InterfaceC37173a;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p569qq.C43841b;
import p569qq.C43852m;
import p739ww.C45938b;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import qe0.C43724b;
import ro.C44128b;
import t20.C44637e0;
import w00.C45681e;
import w20.C45700a;

/* JADX INFO: compiled from: ToggleSymbolsFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020\u0014H\u0016J\b\u0010J\u001a\u00020EH\u0016J\b\u0010K\u001a\u00020EH\u0016J\b\u0010L\u001a\u00020EH\u0016J\u001a\u0010M\u001a\u00020E2\u0006\u0010N\u001a\u00020O2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010R\u001a\u00020EH\u0002J\u0010\u0010S\u001a\u00020E2\u0006\u0010T\u001a\u00020\u0012H\u0002J\b\u0010U\u001a\u00020EH\u0002J\u000e\u0010V\u001a\u00020E2\u0006\u0010W\u001a\u00020\u0019J\u0012\u0010X\u001a\u00020E2\b\u0010Y\u001a\u0004\u0018\u00010\u0019H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u000ej\b\u0012\u0004\u0012\u00020\u0012`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u000ej\b\u0012\u0004\u0012\u00020\u0019`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 '*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010&0&0%¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010>R#\u0010?\u001a\n '*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0017\u001a\u0004\bA\u0010BR\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006["}, m90084d2 = {"Lcom/kubi/spot/business/market/ToggleSymbolsFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "Lcom/kubi/spot/ext/ISymbolsChange;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/FragmentToggleSymbolsBinding;", "getBinding", "()Lcom/kubi/spot/databinding/FragmentToggleSymbolsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "tabFragments", "Ljava/util/ArrayList;", "Lcom/kubi/spot/quote/market/ToggleSymbolsListFragment;", "Lkotlin/collections/ArrayList;", "tabs", "", "isMarket", "", "()Z", "isMarket$delegate", "Lkotlin/Lazy;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "setTradeItemBean", "(Lcom/kubi/data/entity/TradeItemBean;)V", "tradeListAdapter", "Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;", "getTradeListAdapter", "()Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;", "tradeListAdapter$delegate", "totalTradeItemList", "totalTradeItemListSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getTotalTradeItemListSubject", "()Lio/reactivex/subjects/PublishSubject;", "srcTotalTradeItemList", "getSrcTotalTradeItemList", "()Ljava/util/List;", "setSrcTotalTradeItemList", "(Ljava/util/List;)V", "searchJob", "Lkotlinx/coroutines/Job;", "getSearchJob", "()Lkotlinx/coroutines/Job;", "setSearchJob", "(Lkotlinx/coroutines/Job;)V", "previewRequestTime", "", "getPreviewRequestTime", "()J", "setPreviewRequestTime", "(J)V", "requesting", "getRequesting", "setRequesting", "(Z)V", "mPop", "Lcom/zyyoona7/popup/EasyPopup;", "getMPop", "()Lcom/zyyoona7/popup/EasyPopup;", "mPop$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setUserVisibleHint", "isVisibleToUser", "lazyLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "spotFavorHelper", "Lcom/kubi/spot/quote/market/SpotFavorHelper;", "searchListAdapterLongClick", "sortSearchData", "filterKey", "handleSpot", "updateFavor", "item", "changeSymbols", "bean", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nToggleSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleSymbolsFragment.kt\ncom/kubi/spot/business/market/ToggleSymbolsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,351:1\n147#2,16:352\n1#3:368\n43#4,7:369\n33#5:376\n17#5,2:377\n34#5,3:379\n33#5:382\n17#5,2:383\n34#5,3:385\n*S KotlinDebug\n*F\n+ 1 ToggleSymbolsFragment.kt\ncom/kubi/spot/business/market/ToggleSymbolsFragment\n*L\n68#1:352,16\n224#1:369,7\n270#1:376\n270#1:377,2\n270#1:379,3\n282#1:382\n282#1:383,2\n282#1:385,3\n*E\n"})
public final class ToggleSymbolsFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: Y */
    @Nullable
    public TradeItemBean f50197Y;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final PublishSubject<List<TradeItemBean>> f50200b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public List<? extends TradeItemBean> f50201c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public InterfaceC41775x1 f50202d0;

    /* JADX INFO: renamed from: e0 */
    public long f50203e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f50204f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f50205g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final SpotFavorHelper f50206h0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f50192j0 = {Reflection.property1(new PropertyReference1Impl(ToggleSymbolsFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/FragmentToggleSymbolsBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f50191i0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50193U = C45681e.m100799e(this, new Function1<ToggleSymbolsFragment, C44637e0>() { // from class: com.kubi.spot.business.market.ToggleSymbolsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44637e0 invoke(@NotNull ToggleSymbolsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44637e0.m98751a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44637e0, Unit>() { // from class: com.kubi.spot.business.market.ToggleSymbolsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44637e0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44637e0 c44637e0) {
            invoke(c44637e0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ArrayList<ToggleSymbolsListFragment> f50194V = new ArrayList<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<String> f50195W = new ArrayList<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50196X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.market.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ToggleSymbolsFragment.m61123O3(this.f50232b));
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f50198Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.market.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsFragment.m61133a4(this.f50233b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public ArrayList<TradeItemBean> f50199a0 = new ArrayList<>();

    /* JADX INFO: compiled from: ToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/business/market/ToggleSymbolsFragment$Companion;", "", "<init>", "()V", "REQUEST_TIME_OUT", "", "newInstance", "Lcom/kubi/spot/business/market/ToggleSymbolsFragment;", "isMarket", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ ToggleSymbolsFragment newInstance$default(Companion companion, boolean z11, TradeItemBean tradeItemBean, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            if ((i11 & 2) != 0) {
                tradeItemBean = null;
            }
            return companion.newInstance(z11, tradeItemBean);
        }

        @JvmStatic
        @NotNull
        public final ToggleSymbolsFragment newInstance(boolean isMarket, @Nullable TradeItemBean tradeItemBean) {
            ToggleSymbolsFragment toggleSymbolsFragment = new ToggleSymbolsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BaseFragment.FRAGMENT_BACK, R$color.c_bulletLayer);
            bundle.putBoolean("isMarket", isMarket);
            bundle.putParcelable("tradeItemBean", tradeItemBean);
            toggleSymbolsFragment.setArguments(bundle);
            return toggleSymbolsFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.market.ToggleSymbolsFragment$a */
    /* JADX INFO: compiled from: ToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/market/ToggleSymbolsFragment$handleSpot$1$6", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24979a extends C24223c1 {
        public C24979a() {
            super(null, false);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            RtlViewPager rtlViewPager;
            super.accept(th2);
            C44637e0 c44637e0M61150F3 = ToggleSymbolsFragment.this.m61150F3();
            if (c44637e0M61150F3 != null && (rtlViewPager = c44637e0M61150F3.f99057g) != null) {
                rtlViewPager.setCurrentItem(0);
            }
            ToggleSymbolsFragment.this.showContent();
            C43841b.m96555b("click_spot_exchange", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.market.ToggleSymbolsFragment$b */
    /* JADX INFO: compiled from: ToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/market/ToggleSymbolsFragment$onViewCreated$3", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24980b extends C45938b {
        public C24980b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            String str;
            super.mo18273b(i11);
            if (ToggleSymbolsFragment.this.isMarket() && i11 == 1) {
                C43852m.m96591c("B5candle", ExifInterface.TAG_CONTRAST, null, null, 12, null);
                return;
            }
            String strValueOf = String.valueOf(i11 + 1);
            if (i11 == 0) {
                str = "FAV";
            } else {
                Object obj = ToggleSymbolsFragment.this.f50195W.get(i11);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                str = (String) obj;
            }
            C43852m.m96590b("B5trading", "symbolSelectTab", strValueOf, TuplesKt.m90091to("tag", str));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.market.ToggleSymbolsFragment$updateFavor$1 */
    /* JADX INFO: compiled from: ToggleSymbolsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.market.ToggleSymbolsFragment$updateFavor$1", m90122f = "ToggleSymbolsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nToggleSymbolsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleSymbolsFragment.kt\ncom/kubi/spot/business/market/ToggleSymbolsFragment$updateFavor$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n1869#2,2:352\n*S KotlinDebug\n*F\n+ 1 ToggleSymbolsFragment.kt\ncom/kubi/spot/business/market/ToggleSymbolsFragment$updateFavor$1\n*L\n340#1:352,2\n*E\n"})
    public static final class C249821 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ TradeItemBean $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C249821(TradeItemBean tradeItemBean, Continuation<? super C249821> continuation) {
            super(2, continuation);
            this.$item = tradeItemBean;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ToggleSymbolsFragment.this.new C249821(this.$item, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C249821) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList<TradeItemBean> arrayList = ToggleSymbolsFragment.this.f50199a0;
                TradeItemBean tradeItemBean = this.$item;
                for (TradeItemBean tradeItemBean2 : arrayList) {
                    if (Intrinsics.areEqual(tradeItemBean2.getSymbol(), tradeItemBean.getSymbol())) {
                        tradeItemBean2.setFavor(tradeItemBean.isFavor());
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static final boolean m61132Y3(ToggleSymbolsFragment toggleSymbolsFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object objM103844constructorimpl;
        RecyclerView recyclerView;
        try {
            Result.Companion companion = Result.INSTANCE;
            view.setBackgroundResource(R$color.emphasis4);
            if (toggleSymbolsFragment.m61151H3().getF51073m() != -1 && i11 >= 0 && i11 < toggleSymbolsFragment.m61151H3().getData().size()) {
                toggleSymbolsFragment.m61151H3().notifyItemChanged(toggleSymbolsFragment.m61151H3().getF51073m());
            }
            toggleSymbolsFragment.m61151H3().m62739m(i11);
            SpotFavorHelper spotFavorHelper = toggleSymbolsFragment.f50206h0;
            SymbolsListAdapter symbolsListAdapterM61151H3 = toggleSymbolsFragment.m61151H3();
            C43724b c43724bM61117G3 = toggleSymbolsFragment.m61117G3();
            Intrinsics.checkNotNullExpressionValue(c43724bM61117G3, "<get-mPop>(...)");
            spotFavorHelper.m62644i(symbolsListAdapterM61151H3, i11, c43724bM61117G3, toggleSymbolsFragment);
            C44637e0 c44637e0M61150F3 = toggleSymbolsFragment.m61150F3();
            Unit unit = null;
            RecyclerView.LayoutManager layoutManager = (c44637e0M61150F3 == null || (recyclerView = c44637e0M61150F3.f99054d) == null) ? null : recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                boolean z11 = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == i11 || linearLayoutManager.findFirstVisibleItemPosition() == i11;
                ((BubbleLinearLayout) toggleSymbolsFragment.m61117G3().m96332z(R$id.bbLayout)).setArrowDirection(z11 ? BubbleStyle.ArrowDirection.Up : BubbleStyle.ArrowDirection.Down);
                toggleSymbolsFragment.m61117G3().m96320e0(view, z11 ? 2 : 1, 0, 0, 0);
                unit = Unit.INSTANCE;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C45700a.m100877c(thM103847exceptionOrNullimpl, "searchListAdapterLongClick");
        }
        return true;
    }

    /* JADX INFO: renamed from: G3 */
    private final C43724b m61117G3() {
        return (C43724b) this.f50205g0.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m61118J3(final ToggleSymbolsFragment toggleSymbolsFragment, ArrayList arrayList) {
        RtlViewPager rtlViewPager;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        RtlViewPager rtlViewPager2;
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        if (toggleSymbolsFragment.getActivity() != null) {
            FragmentActivity activity = toggleSymbolsFragment.getActivity();
            if (!C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null) && !toggleSymbolsFragment.isDetached() && toggleSymbolsFragment.getContext() != null) {
                if (arrayList == null || arrayList.isEmpty()) {
                    return Unit.INSTANCE;
                }
                toggleSymbolsFragment.f50195W.clear();
                toggleSymbolsFragment.f50194V.clear();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (!TextUtils.isEmpty(((MarketsEntity) arrayList.get(i11)).getDisplayName())) {
                        ArrayList<ToggleSymbolsListFragment> arrayList2 = toggleSymbolsFragment.f50194V;
                        ToggleSymbolsListFragment.Companion companion = ToggleSymbolsListFragment.f50883j0;
                        Object obj = arrayList.get(i11);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        arrayList2.add(ToggleSymbolsListFragment.Companion.newInstance$default(companion, (MarketsEntity) obj, null, 2, null));
                        toggleSymbolsFragment.f50195W.add(((MarketsEntity) arrayList.get(i11)).getDisplayName());
                    }
                }
                Router router = Router.f46192a;
                SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
                Object objM56186h = router.m56186h(InterfaceC37173a.class, siteInfoManager.m58109c());
                if (objM56186h != null ? ((InterfaceC37173a) objM56186h).m83140c() : true) {
                    toggleSymbolsFragment.f50194V.add(0, ToggleSymbolsListFragment.Companion.newInstance$default(ToggleSymbolsListFragment.f50883j0, new MarketsEntity("favor", "favor", false, null, 12, null), null, 2, null));
                    toggleSymbolsFragment.f50195W.add(0, toggleSymbolsFragment.getString(R$string.favorites));
                }
                Object objM56186h2 = router.m56186h(InterfaceC37173a.class, siteInfoManager.m58109c());
                if ((objM56186h2 != null ? ((InterfaceC37173a) objM56186h2).m83140c() : true) && toggleSymbolsFragment.isMarket()) {
                    ArrayList<ToggleSymbolsListFragment> arrayList3 = toggleSymbolsFragment.f50194V;
                    ToggleSymbolsListFragment.Companion companion2 = ToggleSymbolsListFragment.f50883j0;
                    MarketsEntity marketsEntity = new MarketsEntity(null, "relation", false, null, 13, null);
                    TradeItemBean tradeItemBean = toggleSymbolsFragment.f50197Y;
                    arrayList3.add(1, companion2.newInstance(marketsEntity, C27041f.m66668h((tradeItemBean == null || (symbolInfoEntity2 = tradeItemBean.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity2.getBaseCurrency())));
                    ArrayList<String> arrayList4 = toggleSymbolsFragment.f50195W;
                    int i12 = R$string.market_currency_placeholder;
                    TradeItemBean tradeItemBean2 = toggleSymbolsFragment.f50197Y;
                    arrayList4.add(1, toggleSymbolsFragment.getString(i12, C27041f.m66668h((tradeItemBean2 == null || (symbolInfoEntity = tradeItemBean2.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity.getBaseCurrencyName())));
                }
                FragmentManager childFragmentManager = toggleSymbolsFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                C27103z c27103z = new C27103z(childFragmentManager, toggleSymbolsFragment.f50194V, toggleSymbolsFragment.f50195W);
                C44637e0 c44637e0M61150F3 = toggleSymbolsFragment.m61150F3();
                if (c44637e0M61150F3 != null && (rtlViewPager2 = c44637e0M61150F3.f99057g) != null) {
                    rtlViewPager2.setAdapter(c27103z);
                }
                C44637e0 c44637e0M61150F4 = toggleSymbolsFragment.m61150F3();
                if (c44637e0M61150F4 != null && (slidingTabLayout2 = c44637e0M61150F4.f99055e) != null) {
                    C44637e0 c44637e0M61150F5 = toggleSymbolsFragment.m61150F3();
                    slidingTabLayout2.setViewPager(c44637e0M61150F5 != null ? c44637e0M61150F5.f99057g : null);
                }
                C44637e0 c44637e0M61150F6 = toggleSymbolsFragment.m61150F3();
                if (c44637e0M61150F6 != null && (slidingTabLayout = c44637e0M61150F6.f99055e) != null) {
                    slidingTabLayout.m55291w();
                }
                C44637e0 c44637e0M61150F7 = toggleSymbolsFragment.m61150F3();
                if (c44637e0M61150F7 != null && (rtlViewPager = c44637e0M61150F7.f99057g) != null) {
                    rtlViewPager.setOffscreenPageLimit(toggleSymbolsFragment.f50195W.size());
                }
                Disposable disposableSubscribe = TradeListModel.m62518e(new TradeListModel(), "favor", true, "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_slide_symbols", null, 8, null).subscribe(new Consumer() { // from class: com.kubi.spot.business.market.t
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        ToggleSymbolsFragment.m61119K3(this.f50235b, (List) obj2);
                    }
                }, toggleSymbolsFragment.new C24979a());
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, toggleSymbolsFragment.getDestroyDisposable());
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m61119K3(ToggleSymbolsFragment toggleSymbolsFragment, List list) {
        RtlViewPager rtlViewPager;
        RtlViewPager rtlViewPager2;
        if (list != null) {
            if (!list.isEmpty() || toggleSymbolsFragment.f50195W.size() <= 1) {
                C44637e0 c44637e0M61150F3 = toggleSymbolsFragment.m61150F3();
                if (c44637e0M61150F3 != null && (rtlViewPager = c44637e0M61150F3.f99057g) != null) {
                    rtlViewPager.setCurrentItem(0);
                }
                toggleSymbolsFragment.showContent();
            } else {
                C44637e0 c44637e0M61150F4 = toggleSymbolsFragment.m61150F3();
                if (c44637e0M61150F4 != null && (rtlViewPager2 = c44637e0M61150F4.f99057g) != null) {
                    rtlViewPager2.setCurrentItem(1);
                }
                toggleSymbolsFragment.showContent();
            }
        }
        C43841b.m96557d("click_spot_exchange", "data_load_finish", null, 4, null);
    }

    /* JADX INFO: renamed from: P3 */
    public static final C43724b m61124P3(ToggleSymbolsFragment toggleSymbolsFragment) {
        Context mContext = toggleSymbolsFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        return new BubbleEasyPopup(mContext).m96307Q(R$layout.kucoin_popup_favor).m96316Z(true).m96322p();
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m61125Q3(ToggleSymbolsFragment toggleSymbolsFragment, List list) {
        toggleSymbolsFragment.f50200b0.onNext(list);
        toggleSymbolsFragment.f50204f0 = false;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m61126R3(C44637e0 c44637e0, ToggleSymbolsFragment toggleSymbolsFragment, ArrayList arrayList) {
        String string = StringsKt.trim((CharSequence) String.valueOf(c44637e0.f99052b.getText())).toString();
        c44637e0.f99058h.setDisplayedChild(!TextUtils.isEmpty(string) ? 1 : 0);
        toggleSymbolsFragment.m61154Z3(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final ArrayList m61130V3(ToggleSymbolsFragment toggleSymbolsFragment, CharSequence charSequence, List allItem) {
        Intrinsics.checkNotNullParameter(charSequence, "<unused var>");
        Intrinsics.checkNotNullParameter(allItem, "allItem");
        if (allItem == toggleSymbolsFragment.f50201c0) {
            return toggleSymbolsFragment.f50199a0;
        }
        toggleSymbolsFragment.f50201c0 = allItem;
        InterfaceC41775x1 interfaceC41775x1 = toggleSymbolsFragment.f50202d0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        ArrayList<TradeItemBean> arrayList = new ArrayList<>();
        arrayList.addAll(allItem);
        toggleSymbolsFragment.f50199a0 = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: W3 */
    public static final ArrayList m61131W3(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (ArrayList) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: a4 */
    public static final SymbolsListAdapter m61133a4(ToggleSymbolsFragment toggleSymbolsFragment) {
        return new SymbolsListAdapter(toggleSymbolsFragment, toggleSymbolsFragment.isMarket(), null, null, 12, null);
    }

    /* JADX INFO: renamed from: F3 */
    public final C44637e0 m61150F3() {
        return (C44637e0) this.f50193U.getValue(this, f50192j0[0]);
    }

    /* JADX INFO: renamed from: H3 */
    public final SymbolsListAdapter m61151H3() {
        return (SymbolsListAdapter) this.f50198Z.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    public final void m61152I3() {
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        showLoadingView(C27046k.m66699n(mContext, R$color.c_bulletLayer), 17);
        Observable<ArrayList<MarketsEntity>> observableObserveOn = new QuoteModel().m61187k().subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.market.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsFragment.m61118J3(this.f50237b, (ArrayList) obj);
            }
        };
        Consumer<? super ArrayList<MarketsEntity>> consumer = new Consumer() { // from class: com.kubi.spot.business.market.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToggleSymbolsFragment.m61120L3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.market.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsFragment.m61121M3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.market.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToggleSymbolsFragment.m61122N3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_toggle_symbols;
    }

    @Nullable
    /* JADX INFO: renamed from: getTradeItemBean, reason: from getter */
    public final TradeItemBean getF50197Y() {
        return this.f50197Y;
    }

    public final boolean isMarket() {
        return ((Boolean) this.f50196X.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SlidingTabLayout slidingTabLayout;
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44637e0 c44637e0M61150F3 = m61150F3();
        if (c44637e0M61150F3 != null && (baseTextView = c44637e0M61150F3.f99056f) != null) {
            baseTextView.setText(getString(R$string.assets_coin_exchange));
        }
        C44637e0 c44637e0M61150F4 = m61150F3();
        if (c44637e0M61150F4 != null && (linearLayout = c44637e0M61150F4.f99053c) != null) {
            Bundle arguments = getArguments();
            linearLayout.setPadding(0, C5275i0.m6236a(!C27025c.m66566d(arguments != null ? Boolean.valueOf(arguments.getBoolean("isMarket")) : null) ? 50.0f : 10.0f), 0, 0);
        }
        C44637e0 c44637e0M61150F5 = m61150F3();
        if (c44637e0M61150F5 != null && (recyclerView = c44637e0M61150F5.f99054d) != null) {
            recyclerView.setAdapter(m61151H3());
        }
        SymbolsListAdapter symbolsListAdapterM61151H3 = m61151H3();
        View viewInflate = getLayoutInflater().inflate(R$layout.view_empty, (ViewGroup) null);
        viewInflate.setBackgroundResource(R$color.c_bulletLayer);
        symbolsListAdapterM61151H3.setEmptyView(viewInflate);
        m61153X3();
        final C44637e0 c44637e0M61150F6 = m61150F3();
        if (c44637e0M61150F6 != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(c44637e0M61150F6.f99052b);
            PublishSubject<List<TradeItemBean>> publishSubject = this.f50200b0;
            final Function2 function2 = new Function2() { // from class: com.kubi.spot.business.market.z
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ToggleSymbolsFragment.m61130V3(this.f50240b, (CharSequence) obj, (List) obj2);
                }
            };
            Observable observableCombineLatest = Observable.combineLatest(abstractC46099aM784d, publishSubject, new BiFunction() { // from class: com.kubi.spot.business.market.a0
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return ToggleSymbolsFragment.m61131W3(function2, obj, obj2);
                }
            });
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.market.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsFragment.m61126R3(c44637e0M61150F6, this, (ArrayList) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.market.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ToggleSymbolsFragment.m61127S3(function1, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.market.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsFragment.m61128T3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableCombineLatest.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.market.p
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ToggleSymbolsFragment.m61129U3(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
        C44637e0 c44637e0M61150F7 = m61150F3();
        if (c44637e0M61150F7 == null || (slidingTabLayout = c44637e0M61150F7.f99055e) == null) {
            return;
        }
        slidingTabLayout.setOnTabSelectListener(new C24980b());
    }

    public final void updateFavor(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new C249821(item, null), 2, null);
    }

    public ToggleSymbolsFragment() {
        PublishSubject<List<TradeItemBean>> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.f50200b0 = publishSubjectCreate;
        this.f50201c0 = CollectionsKt.emptyList();
        this.f50205g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.market.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ToggleSymbolsFragment.m61124P3(this.f50234b);
            }
        });
        this.f50206h0 = new SpotFavorHelper();
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m61120L3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m61121M3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m61122N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static final boolean m61123O3(ToggleSymbolsFragment toggleSymbolsFragment) {
        Boolean boolValueOf;
        Bundle arguments = toggleSymbolsFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isMarket"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m61127S3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m61128T3(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m61129U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m61153X3() {
        m61151H3().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.spot.business.market.u
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return ToggleSymbolsFragment.m61132Y3(this.f50236a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m61154Z3(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f50202d0 = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new ToggleSymbolsFragment$sortSearchData$1(this, str, null), 2, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        PagerAdapter adapter;
        RtlViewPager rtlViewPager;
        if (getView() != null) {
            C44637e0 c44637e0M61150F3 = m61150F3();
            if (c44637e0M61150F3 != null && (rtlViewPager = c44637e0M61150F3.f99057g) != null) {
                adapter = rtlViewPager.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter == null) {
                m61152I3();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        TradeItemBean tradeItemBean;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            tradeItemBean = (TradeItemBean) arguments.getParcelable("tradeItemBean");
        } else {
            tradeItemBean = null;
        }
        this.f50197Y = tradeItemBean;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        Editable text;
        C44637e0 c44637e0M61150F3;
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        super.onHide();
        if (getView() != null) {
            C44637e0 c44637e0M61150F4 = m61150F3();
            if (c44637e0M61150F4 != null && (clearEditText2 = c44637e0M61150F4.f99052b) != null) {
                text = clearEditText2.getText();
            } else {
                text = null;
            }
            if (!TextUtils.isEmpty(text) && (c44637e0M61150F3 = m61150F3()) != null && (clearEditText = c44637e0M61150F3.f99052b) != null) {
                clearEditText.setText("");
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (this.f50204f0 && System.currentTimeMillis() - this.f50203e0 <= 30000) {
            return;
        }
        this.f50204f0 = true;
        this.f50203e0 = System.currentTimeMillis();
        C37890n.f85269a.mo85594g(new Consumer() { // from class: com.kubi.spot.business.market.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToggleSymbolsFragment.m61125Q3(this.f50230b, (List) obj);
            }
        }, true);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        C44637e0 c44637e0M61150F3;
        RtlViewPager rtlViewPager;
        super.setUserVisibleHint(isVisibleToUser);
        if (getView() != null && (c44637e0M61150F3 = m61150F3()) != null && (rtlViewPager = c44637e0M61150F3.f99057g) != null && !this.f50194V.isEmpty()) {
            this.f50194V.get(rtlViewPager.getCurrentItem()).setUserVisibleHint(isVisibleToUser);
        }
    }
}
