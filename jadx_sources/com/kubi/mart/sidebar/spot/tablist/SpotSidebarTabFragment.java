package com.kubi.mart.sidebar.spot.tablist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mart.R$color;
import com.kubi.mart.R$layout;
import com.kubi.mart.R$string;
import com.kubi.mart.entity.SpotMenuModel;
import com.kubi.mart.sidebar.spot.helper.ListItemLongPressHelper;
import com.kubi.mart.sidebar.spot.helper.SortType;
import com.kubi.mart.sidebar.spot.helper.SpotSidebarSortHelper;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ScrollTabIndicatorView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import java.util.Map;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p182cq.C36517b;
import p182cq.C36518c;
import p182cq.C36519d;
import p208dr.InterfaceC36952a;
import p268fq.C37578a;
import p268fq.C37579b;
import p402kf.C41016c;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SpotSidebarTabFragment.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0017J\b\u00100\u001a\u00020+H\u0014J\b\u00101\u001a\u00020+H\u0016J\b\u00102\u001a\u00020+H\u0016J\b\u00103\u001a\u00020+H\u0016J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u000206H\u0014J\u0016\u00107\u001a\u00020+2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001309H\u0002J\u0016\u0010:\u001a\u00020+2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<09H\u0002J\u0018\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0002J\b\u0010A\u001a\u00020+H\u0002J\u0018\u0010B\u001a\u00020+2\u0006\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020\u000bH\u0002J\u0010\u0010E\u001a\u00020+2\u0006\u0010D\u001a\u00020\u000bH\u0002J\b\u0010F\u001a\u00020?H\u0002J\b\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020+H\u0016J\b\u0010J\u001a\u00020+H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b%\u0010&R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/mart/databinding/MartFragmentSpotSidebarTabListBinding;", "getBinding$MartLib_googleRelease", "()Lcom/kubi/mart/databinding/MartFragmentSpotSidebarTabListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "sidebarType", "", "getSidebarType", "()Ljava/lang/String;", "sidebarType$delegate", "Lkotlin/Lazy;", "symbolCode", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "getMenuModel", "()Lcom/kubi/mart/entity/SpotMenuModel;", "menuModel$delegate", "listAdapter", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabListAdapter;", "getListAdapter", "()Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabListAdapter;", "listAdapter$delegate", "lonePressHelper", "Lcom/kubi/mart/sidebar/spot/helper/ListItemLongPressHelper;", "getLonePressHelper", "()Lcom/kubi/mart/sidebar/spot/helper/ListItemLongPressHelper;", "lonePressHelper$delegate", "sortHelper", "Lcom/kubi/mart/sidebar/spot/helper/SpotSidebarSortHelper;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindFlowEvent", "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onAgainShow", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "refreshMenuSubTab", "subTabs", "", "setAdapterDataList", "list", "Lcom/kubi/data/entity/TradeItemBean;", "showViewLayoutState", "isSubTab", "", "isEmpty", "initClickListener", "onFavorChangedFinish", "item", ViewProps.POSITION, "resetIndexOfLongPress", "isFavorateTab", "sortType", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroyView", "Companion", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nSpotSidebarTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarTabFragment.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,279:1\n147#2,16:280\n76#3,7:296\n93#4,4:303\n93#4,4:307\n93#4,4:311\n93#4,4:315\n93#4,4:319\n*S KotlinDebug\n*F\n+ 1 SpotSidebarTabFragment.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabFragment\n*L\n78#1:280,16\n107#1:296,7\n154#1:303,4\n156#1:307,4\n160#1:311,4\n163#1:315,4\n165#1:319,4\n*E\n"})
public final class SpotSidebarTabFragment extends SimpleStateFragment<SpotSidebarTabContract$UIState> {

    /* JADX INFO: renamed from: W */
    @Nullable
    public String f34808W;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f34805c0 = {Reflection.property1(new PropertyReference1Impl(SpotSidebarTabFragment.class, "binding", "getBinding$MartLib_googleRelease()Lcom/kubi/mart/databinding/MartFragmentSpotSidebarTabListBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f34804b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f34806U = C45681e.m100799e(this, new Function1<SpotSidebarTabFragment, C36517b>() { // from class: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36517b invoke(@NotNull SpotSidebarTabFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36517b.m81763a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36517b, Unit>() { // from class: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36517b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36517b c36517b) {
            invoke(c36517b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f34807V = LazyKt.lazy(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSidebarTabFragment.m41553o4(this.f34857b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f34809X = LazyKt.lazy(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSidebarTabFragment.m41538X3(this.f34858b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f34810Y = LazyKt.lazy(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSidebarTabFragment.m41536V3();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f34811Z = LazyKt.lazy(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSidebarTabFragment.m41537W3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final SpotSidebarSortHelper f34812a0 = new SpotSidebarSortHelper();

    /* JADX INFO: compiled from: SpotSidebarTabFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabFragment;", "type", "", "symbolCode", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final SpotSidebarTabFragment instance(@NotNull String type, @NotNull String symbolCode, @NotNull SpotMenuModel menuModel) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            Intrinsics.checkNotNullParameter(menuModel, "menuModel");
            SpotSidebarTabFragment spotSidebarTabFragment = new SpotSidebarTabFragment();
            C27051h c27051h = new C27051h();
            c27051h.m66724h("type", type);
            c27051h.m66724h("symbolCode", symbolCode);
            c27051h.m66721e("menuModel", menuModel);
            spotSidebarTabFragment.setArguments(c27051h.m66717a());
            return spotSidebarTabFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabFragment$a */
    /* JADX INFO: compiled from: SpotSidebarTabFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18887a implements Function0<Unit> {
        public C18887a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m41577a() {
            SpotSidebarTabFragment.this.m41566L3().m41583j(SpotSidebarTabFragment.this.f34808W);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m41577a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m41533R3(SpotSidebarTabFragment spotSidebarTabFragment) {
        spotSidebarTabFragment.m41573g4(-1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m41535T3(SpotSidebarTabFragment spotSidebarTabFragment, SortType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<TradeItemBean> data = spotSidebarTabFragment.m41566L3().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        spotSidebarTabFragment.sendIntent(new SpotSidebarTabContract$UIIntent.SortList(data, spotSidebarTabFragment.m41576p4()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final SpotSidebarTabListAdapter m41536V3() {
        return new SpotSidebarTabListAdapter();
    }

    /* JADX INFO: renamed from: W3 */
    public static final ListItemLongPressHelper m41537W3() {
        return new ListItemLongPressHelper();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX INFO: renamed from: Z3 */
    public static final Unit m41539Z3(TradeItemBean tradeItemBean, SpotSidebarTabFragment spotSidebarTabFragment, int i11) {
        ScrollTabIndicatorView scrollTabIndicatorView;
        if (IQuoteFacadeService.f41383a.get().mo50681F(tradeItemBean)) {
            spotSidebarTabFragment.m41566L3().notifyItemChanged(i11);
        } else {
            SpotMenuModel spotMenuModelM41568N3 = spotSidebarTabFragment.m41568N3();
            Boolean boolValueOf = null;
            if (Intrinsics.areEqual(spotMenuModelM41568N3 != null ? spotMenuModelM41568N3.getTabType() : null, "FAVORITE")) {
                spotSidebarTabFragment.m41566L3().getData().remove(tradeItemBean);
                if (spotSidebarTabFragment.m41566L3().getData().isEmpty()) {
                    C36517b c36517bM41565K3 = spotSidebarTabFragment.m41565K3();
                    if (c36517bM41565K3 != null && (scrollTabIndicatorView = c36517bM41565K3.f79355e) != null) {
                        boolValueOf = Boolean.valueOf(C27046k.m66704s(scrollTabIndicatorView));
                    }
                    spotSidebarTabFragment.m41575k4(C27025c.m66566d(boolValueOf), true);
                }
                spotSidebarTabFragment.m41566L3().notifyDataSetChanged();
                spotSidebarTabFragment.sendIntent(new SpotSidebarTabContract$UIIntent.ListItemRemoved(tradeItemBean, spotSidebarTabFragment.m41568N3(), spotSidebarTabFragment.m41576p4()));
            } else {
                spotSidebarTabFragment.m41566L3().notifyItemChanged(i11);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m41540a4(final SpotSidebarTabFragment spotSidebarTabFragment, Boolean bool) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41541b4(this.f34843b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m41544f4(SpotSidebarTabFragment spotSidebarTabFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        spotSidebarTabFragment.sendIntent(new SpotSidebarTabContract$UIIntent.TabChecked(it, spotSidebarTabFragment.m41568N3(), spotSidebarTabFragment.m41576p4()));
        C43852m.m96591c(C37578a.f83542a.m84710a(), "sideMarketStableCoinTab", null, new JSONObject().put("sidemarketsubtab", it), 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m41549m4() {
        C43852m.m96591c(C37578a.f83542a.m84710a(), "sideMarketLogin", null, null, 12, null);
        IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41551n4();
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m41551n4() {
        InterfaceC37754f.a.m85140l(C37304a.f82764a, null, null, null, null, null, null, 63, null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: K3 */
    public final C36517b m41565K3() {
        return (C36517b) this.f34806U.getValue(this, f34805c0[0]);
    }

    /* JADX INFO: renamed from: L3 */
    public final SpotSidebarTabListAdapter m41566L3() {
        return (SpotSidebarTabListAdapter) this.f34810Y.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final ListItemLongPressHelper m41567M3() {
        return (ListItemLongPressHelper) this.f34811Z.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final SpotMenuModel m41568N3() {
        return (SpotMenuModel) this.f34809X.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m41569O3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41531P3(this.f34842b);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m41571Y3(final TradeItemBean tradeItemBean, final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41539Z3(tradeItemBean, this, i11);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final void m41572d4(final List<String> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41543e4(list, this);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (getView() == null) {
            return;
        }
        showContentView();
        if (singleEvent instanceof C18897a) {
            m41575k4(((C18897a) singleEvent).getF34824a(), true);
        }
        if (singleEvent instanceof C18903d) {
            C18903d c18903d = (C18903d) singleEvent;
            m41572d4(c18903d.m41608b());
            m41574i4(c18903d.m41607a());
            m41575k4(false, c18903d.m41607a().isEmpty());
        }
        if (singleEvent instanceof C18901c) {
            C18901c c18901c = (C18901c) singleEvent;
            m41574i4(c18901c.m41606a());
            m41575k4(true, c18901c.m41606a().isEmpty());
        }
        if (singleEvent instanceof C18905e) {
            C18905e c18905e = (C18905e) singleEvent;
            if (!m41567M3().m41462j() && isShowing()) {
                m41574i4(c18905e.m41617a());
            }
        }
        if (singleEvent instanceof C18899b) {
            m41574i4(((C18899b) singleEvent).m41605a());
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m41573g4(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41545h4(this.f34851b, i11);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.mart_fragment_spot_sidebar_tab_list;
    }

    public final String getSidebarType() {
        return (String) this.f34807V.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<SpotSidebarTabVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SpotSidebarTabVM.class);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m41574i4(final List<? extends TradeItemBean> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41546j4(this.f34859b, list);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41575k4(final boolean z11, final boolean z12) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41547l4(this.f34861b, z12, z11);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C36519d c36519d;
        BaseTextView baseTextView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ScrollTabIndicatorView scrollTabIndicatorView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.f34808W = arguments != null ? RouteExKt.m56284y(arguments, "symbolCode") : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onViewCreated-tabList. tab=");
        SpotMenuModel spotMenuModelM41568N3 = m41568N3();
        sb2.append(spotMenuModelM41568N3 != null ? spotMenuModelM41568N3.getTitleName() : null);
        C37579b.m84715d(sb2.toString());
        BaseFragment.showEmptyView$default(this, "", 0, (View.OnClickListener) null, 4, (Object) null);
        C36517b c36517bM41565K3 = m41565K3();
        if (c36517bM41565K3 != null && (scrollTabIndicatorView = c36517bM41565K3.f79355e) != null) {
            scrollTabIndicatorView.setPaddingRelative(0, C27040e.m66658b(10), 0, 0);
        }
        C36517b c36517bM41565K4 = m41565K3();
        if (c36517bM41565K4 != null && (recyclerView2 = c36517bM41565K4.f79354d) != null) {
            C22912t.m54409g(recyclerView2, false);
        }
        C36517b c36517bM41565K5 = m41565K3();
        if (c36517bM41565K5 != null && (recyclerView = c36517bM41565K5.f79354d) != null) {
            SpotSidebarTabListAdapter spotSidebarTabListAdapterM41566L3 = m41566L3();
            String sidebarType = getSidebarType();
            String str = this.f34808W;
            SpotMenuModel spotMenuModelM41568N4 = m41568N3();
            spotSidebarTabListAdapterM41566L3.m41582i(this, sidebarType, str, spotMenuModelM41568N4 != null ? spotMenuModelM41568N4.getTabType() : null);
            recyclerView.setAdapter(spotSidebarTabListAdapterM41566L3);
        }
        C36517b c36517bM41565K6 = m41565K3();
        if (c36517bM41565K6 != null && (c36519d = c36517bM41565K6.f79352b) != null && (baseTextView = c36519d.f79367d) != null) {
            baseTextView.setText(R$string.no_more_data);
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.mart.sidebar.spot.tablist.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotSidebarTabFragment.m41540a4(this.f34841b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.mart.sidebar.spot.tablist.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotSidebarTabFragment.m41542c4(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m41569O3();
    }

    /* JADX INFO: renamed from: p4 */
    public final SortType m41576p4() {
        return this.f34812a0.m41483i();
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m41531P3(final SpotSidebarTabFragment spotSidebarTabFragment) {
        spotSidebarTabFragment.m41566L3().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.mart.sidebar.spot.tablist.k
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return SpotSidebarTabFragment.m41532Q3(this.f34845a, baseQuickAdapter, view, i11);
            }
        });
        spotSidebarTabFragment.f34812a0.m41486q(new Function1() { // from class: com.kubi.mart.sidebar.spot.tablist.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotSidebarTabFragment.m41535T3(this.f34846b, (SortType) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final boolean m41532Q3(final SpotSidebarTabFragment spotSidebarTabFragment, BaseQuickAdapter baseQuickAdapter, View view, final int i11) {
        final TradeItemBean tradeItemBean;
        Object item = baseQuickAdapter.getItem(i11);
        RecyclerView recyclerView = null;
        if (item instanceof TradeItemBean) {
            tradeItemBean = (TradeItemBean) item;
        } else {
            tradeItemBean = null;
        }
        if (tradeItemBean == null) {
            return false;
        }
        view.setBackgroundResource(R$color.emphasis4);
        spotSidebarTabFragment.m41573g4(i11);
        ListItemLongPressHelper listItemLongPressHelperM41567M3 = spotSidebarTabFragment.m41567M3();
        C36517b c36517bM41565K3 = spotSidebarTabFragment.m41565K3();
        if (c36517bM41565K3 != null) {
            recyclerView = c36517bM41565K3.f79354d;
        }
        Intrinsics.checkNotNull(view);
        listItemLongPressHelperM41567M3.m41465o(recyclerView, tradeItemBean, i11, view, new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41533R3(this.f34847b);
            }
        }, new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarTabFragment.m41534S3(this.f34848b, tradeItemBean, i11);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m41534S3(SpotSidebarTabFragment spotSidebarTabFragment, TradeItemBean tradeItemBean, int i11) {
        spotSidebarTabFragment.m41571Y3(tradeItemBean, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final SpotMenuModel m41538X3(SpotSidebarTabFragment spotSidebarTabFragment) {
        Bundle arguments = spotSidebarTabFragment.getArguments();
        if (arguments != null) {
            return (SpotMenuModel) RouteExKt.m56274t(arguments, "menuModel");
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m41541b4(SpotSidebarTabFragment spotSidebarTabFragment) {
        spotSidebarTabFragment.m41566L3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m41542c4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m41543e4(List list, final SpotSidebarTabFragment spotSidebarTabFragment) {
        ScrollTabIndicatorView scrollTabIndicatorView;
        ScrollTabIndicatorView scrollTabIndicatorView2;
        ScrollTabIndicatorView scrollTabIndicatorView3;
        if (list.isEmpty()) {
            C36517b c36517bM41565K3 = spotSidebarTabFragment.m41565K3();
            if (c36517bM41565K3 != null && (scrollTabIndicatorView3 = c36517bM41565K3.f79355e) != null) {
                C27046k.m66700o(scrollTabIndicatorView3);
            }
        } else {
            C36517b c36517bM41565K4 = spotSidebarTabFragment.m41565K3();
            if (c36517bM41565K4 != null && (scrollTabIndicatorView2 = c36517bM41565K4.f79355e) != null) {
                C27046k.m66685H(scrollTabIndicatorView2);
            }
            C36517b c36517bM41565K5 = spotSidebarTabFragment.m41565K3();
            if (c36517bM41565K5 != null && (scrollTabIndicatorView = c36517bM41565K5.f79355e) != null) {
                scrollTabIndicatorView.m54769g(list, new Function1() { // from class: com.kubi.mart.sidebar.spot.tablist.i
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SpotSidebarTabFragment.m41544f4(this.f34844b, (String) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m41545h4(SpotSidebarTabFragment spotSidebarTabFragment, int i11) {
        if (spotSidebarTabFragment.m41566L3().getF34818m() != -1) {
            spotSidebarTabFragment.m41566L3().notifyItemChanged(spotSidebarTabFragment.m41566L3().getF34818m());
        }
        spotSidebarTabFragment.m41566L3().m41591t(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m41546j4(SpotSidebarTabFragment spotSidebarTabFragment, List list) {
        spotSidebarTabFragment.m41566L3().setNewData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m41547l4(SpotSidebarTabFragment spotSidebarTabFragment, boolean z11, boolean z12) {
        int i11;
        int i12;
        String tabType;
        C36517b c36517bM41565K3 = spotSidebarTabFragment.m41565K3();
        if (c36517bM41565K3 == null) {
            return Unit.INSTANCE;
        }
        if (!z11) {
            ConstraintLayout root = c36517bM41565K3.f79353c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C27046k.m66685H(root);
            RecyclerView recyclerView = c36517bM41565K3.f79354d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            C27046k.m66685H(recyclerView);
            ConstraintLayout root2 = c36517bM41565K3.f79352b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            C27046k.m66700o(root2);
            return Unit.INSTANCE;
        }
        ScrollTabIndicatorView scrollTabIndicatorView = c36517bM41565K3.f79355e;
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        scrollTabIndicatorView.setVisibility(i11);
        ConstraintLayout root3 = c36517bM41565K3.f79353c.getRoot();
        if (z12) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        root3.setVisibility(i12);
        c36517bM41565K3.f79354d.setVisibility(8);
        c36517bM41565K3.f79352b.getRoot().setVisibility(0);
        SpotMenuModel spotMenuModelM41568N3 = spotSidebarTabFragment.m41568N3();
        if (spotMenuModelM41568N3 != null) {
            tabType = spotMenuModelM41568N3.getTabType();
        } else {
            tabType = null;
        }
        if (Intrinsics.areEqual(tabType, "FAVORITE") && !UserInfo.a.n()) {
            KcPrimaryButton emptyBtnLogin = c36517bM41565K3.f79352b.f79365b;
            Intrinsics.checkNotNullExpressionValue(emptyBtnLogin, "emptyBtnLogin");
            C27046k.m66685H(emptyBtnLogin);
            KcPrimaryButton emptyBtnLogin2 = c36517bM41565K3.f79352b.f79365b;
            Intrinsics.checkNotNullExpressionValue(emptyBtnLogin2, "emptyBtnLogin");
            C27046k.m66711z(emptyBtnLogin2, 0L, new Function0() { // from class: com.kubi.mart.sidebar.spot.tablist.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotSidebarTabFragment.m41549m4();
                }
            }, 1, null);
        } else {
            KcPrimaryButton emptyBtnLogin3 = c36517bM41565K3.f79352b.f79365b;
            Intrinsics.checkNotNullExpressionValue(emptyBtnLogin3, "emptyBtnLogin");
            C27046k.m66700o(emptyBtnLogin3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final String m41553o4(SpotSidebarTabFragment spotSidebarTabFragment) {
        String strM56284y;
        Bundle arguments = spotSidebarTabFragment.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "type")) != null) {
            return strM56284y;
        }
        return "spot_trade";
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m41570U3() {
        String tabType;
        SpotMenuModel spotMenuModelM41568N3 = m41568N3();
        if (spotMenuModelM41568N3 != null) {
            tabType = spotMenuModelM41568N3.getTabType();
        } else {
            tabType = null;
        }
        return Intrinsics.areEqual(tabType, "FAVORITE");
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "mart_changeSymol".length();
        }
        C12572a.m23692a(this, false, new C18888xa35715ca("mart_changeSymol", null, this));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        Boolean boolValueOf;
        ScrollTabIndicatorView scrollTabIndicatorView;
        super.onAgainShow();
        if (getView() != null && m41566L3().getItemCount() == 0 && !m41570U3()) {
            C36517b c36517bM41565K3 = m41565K3();
            if (c36517bM41565K3 != null && (scrollTabIndicatorView = c36517bM41565K3.f79355e) != null) {
                boolValueOf = Boolean.valueOf(C27046k.m66704s(scrollTabIndicatorView));
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf)) {
                String sidebarType = getSidebarType();
                String str = this.f34808W;
                if (str == null) {
                    str = "";
                }
                sendIntent(new SpotSidebarTabContract$UIIntent.FetchTabList(sidebarType, str, m41568N3(), m41576p4()));
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        m41567M3().m41463k(true);
        super.onDestroyView();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        ListItemLongPressHelper.m41458l(m41567M3(), false, 1, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        String titleName;
        super.onLoad();
        if (getView() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onLoad-tabList. tab=");
            SpotMenuModel spotMenuModelM41568N3 = m41568N3();
            if (spotMenuModelM41568N3 != null) {
                titleName = spotMenuModelM41568N3.getTitleName();
            } else {
                titleName = null;
            }
            sb2.append(titleName);
            C37579b.m84715d(sb2.toString());
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
            if (!m41570U3()) {
                String sidebarType = getSidebarType();
                String str = this.f34808W;
                if (str == null) {
                    str = "";
                }
                sendIntent(new SpotSidebarTabContract$UIIntent.FetchTabList(sidebarType, str, m41568N3(), m41576p4()));
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        C36518c c36518c;
        super.onShow();
        SpotSidebarSortHelper spotSidebarSortHelper = this.f34812a0;
        C36517b c36517bM41565K3 = m41565K3();
        if (c36517bM41565K3 != null) {
            c36518c = c36517bM41565K3.f79353c;
        } else {
            c36518c = null;
        }
        spotSidebarSortHelper.m41484j(c36518c);
        if (m41566L3().getData().size() > 0) {
            List<TradeItemBean> data = m41566L3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            sendIntent(new SpotSidebarTabContract$UIIntent.SortList(data, m41576p4()));
        }
        if (m41570U3()) {
            String sidebarType = getSidebarType();
            String str = this.f34808W;
            if (str == null) {
                str = "";
            }
            sendIntent(new SpotSidebarTabContract$UIIntent.FetchTabList(sidebarType, str, m41568N3(), m41576p4()));
        }
    }
}
