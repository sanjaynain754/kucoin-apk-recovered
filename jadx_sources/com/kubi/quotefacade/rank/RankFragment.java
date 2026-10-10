package com.kubi.quotefacade.rank;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import bv.C4702x;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.ICardV2;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.rank.config.RankConfig;
import com.kubi.quotefacade.rank.config.RankTabConfig;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.flyco.RankSlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025av.C4391b;
import p025av.C4392c;
import p208dr.InterfaceC36952a;
import p321hv.InterfaceC38358h;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: RankFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010*\u0001.\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001JB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010#\u001a\u00020$H\u0014J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0016J\b\u00101\u001a\u00020&H\u0016J\b\u00102\u001a\u00020&H\u0016J\b\u00103\u001a\u00020&H\u0016J\b\u00104\u001a\u00020&H\u0016J\b\u00105\u001a\u00020&H\u0016J\u0010\u00106\u001a\u00020&2\u0006\u00107\u001a\u000208H\u0014J\u0010\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020;H\u0007J\u0010\u0010<\u001a\u00020&2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020$H\u0007J\b\u0010>\u001a\u00020$H\u0002J\b\u0010?\u001a\u00020&H\u0002J\b\u0010@\u001a\u00020&H\u0002J\b\u0010A\u001a\u00020&H\u0002J\u0010\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020$H\u0002J\b\u0010D\u001a\u00020$H\u0002J\b\u0010E\u001a\u00020&H\u0002J\b\u0010F\u001a\u00020&H\u0002J\u0010\u0010G\u001a\u00020&2\u0006\u0010H\u001a\u00020\u000eH\u0002J\b\u0010I\u001a\u00020&H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u001aj\b\u0012\u0004\u0012\u00020\u000e`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001aj\b\u0012\u0004\u0012\u00020\u001d`\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/¨\u0006K"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/rank/RankContract$UIState;", "Lcom/kubi/kucoin/home/v2/cards/ICardV2;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentRankBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentRankBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "safeBinding", "positionType", "", "getPositionType", "()Ljava/lang/String;", "positionType$delegate", "Lkotlin/Lazy;", "mainTab", "getMainTab", "mainTab$delegate", "subTab", "getSubTab", "subTab$delegate", "titleList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "curTabs", "Lcom/kubi/quotefacade/rank/config/RankTabConfig;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/rank/RankVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateDiffUI", "initObserver", "onPageChangeListener", "com/kubi/quotefacade/rank/RankFragment$onPageChangeListener$1", "Lcom/kubi/quotefacade/rank/RankFragment$onPageChangeListener$1;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onDestroyView", "onMoveStart", "onMoveStop", "onEnterDragMode", "onExitDragMode", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "testUpdateNewTabRedDot", TIMPushProvider.f75062n, "", "updateNewTabRedDot", "testGetNewTabIndex", "getNewTabIndex", "openTargetTab", "updateUI", "addScrollListener", "cacheCurrentTab", ViewProps.POSITION, "getCurrentTab", "triggerFetchRankNewList", "triggerFetchMarket", "trackRankTabClick", "rankTab", "trackRankExpose", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankFragment.kt\ncom/kubi/quotefacade/rank/RankFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 6 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 7 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,357:1\n147#2,16:358\n774#3:374\n865#3,2:375\n1869#3,2:377\n360#3,7:392\n33#4:379\n17#4,2:380\n34#4,3:382\n93#5,4:385\n15#6,2:389\n32#7:391\n23#7,2:399\n*S KotlinDebug\n*F\n+ 1 RankFragment.kt\ncom/kubi/quotefacade/rank/RankFragment\n*L\n54#1:358,16\n100#1:374\n100#1:375,2\n103#1:377,2\n313#1:392,7\n178#1:379\n178#1:380,2\n178#1:382,3\n211#1:385,4\n299#1:389,2\n312#1:391\n304#1:399,2\n*E\n"})
public final class RankFragment extends SimpleStateFragment<UIState> implements ICardV2 {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f42399U = C45681e.m100799e(this, new Function1<RankFragment, C4702x>() { // from class: com.kubi.quotefacade.rank.RankFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4702x invoke(@NotNull RankFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4702x.m4716a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4702x, Unit>() { // from class: com.kubi.quotefacade.rank.RankFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4702x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4702x c4702x) {
            invoke(c4702x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f42400V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankFragment.m52667S3(this.f42450b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f42401W = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankFragment.m52665P3(this.f42451b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f42402X = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankFragment.m52668U3(this.f42452b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ArrayList<String> f42403Y = new ArrayList<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public ArrayList<RankTabConfig> f42404Z = new ArrayList<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C22431a f42405a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f42398c0 = {Reflection.property1(new PropertyReference1Impl(RankFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentRankBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f42397b0 = new Companion(null);

    /* JADX INFO: compiled from: RankFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/RankFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/quotefacade/rank/RankFragment;", "positionType", "", "mainTab", "subTab", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ RankFragment instance$default(Companion companion, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return companion.instance(str, str2, str3);
        }

        @JvmStatic
        @NotNull
        public final RankFragment instance(@Nullable String positionType, @Nullable String mainTab, @Nullable String subTab) {
            RankFragment rankFragment = new RankFragment();
            Bundle bundle = new Bundle();
            bundle.putString("positionType", positionType);
            bundle.putString("tab", mainTab);
            bundle.putString(ViewProps.POSITION, subTab);
            rankFragment.setArguments(bundle);
            return rankFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.RankFragment$a */
    /* JADX INFO: compiled from: RankFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/rank/RankFragment$onPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22431a extends ViewPager.SimpleOnPageChangeListener {
        public C22431a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) throws JSONException {
            if (position == RankFragment.this.m52689K3()) {
                RankFragment.this.m52696c4(false);
            }
            RankFragment.this.m52697d4();
            RankFragment.this.m52659G3(position);
            RankFragment rankFragment = RankFragment.this;
            rankFragment.m52669W3(((RankTabConfig) rankFragment.f42404Z.get(position)).getRankType());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.RankFragment$b */
    /* JADX INFO: compiled from: RankFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22432b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f42407b;

        public C22432b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f42407b = function;
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
            return this.f42407b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f42407b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m52658F3(C4702x c4702x, View view, int i11, int i12, int i13, int i14) {
        View childAt = c4702x.f4605b.getChildAt(0);
        if (childAt == null) {
            return;
        }
        c4702x.f4606c.setVisibility(i11 >= ((childAt.getWidth() - c4702x.f4605b.getWidth()) - c4702x.f4605b.getPaddingStart()) - c4702x.f4605b.getPaddingEnd() ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public final void m52659G3(final int i11) {
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.quotefacade.rank.m
            @Override // java.lang.Runnable
            public final void run() {
                RankFragment.m52660H3(this.f42548b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m52660H3(RankFragment rankFragment, int i11) {
        RankTabConfig rankTabConfig = (RankTabConfig) CollectionsKt.getOrNull(rankFragment.f42404Z, i11);
        if (rankTabConfig == null) {
            return;
        }
        String rankType = rankTabConfig.getRankType();
        if (StringsKt.isBlank(rankType)) {
            return;
        }
        C4391b.f3820a.m4011i(rankType);
        C46392a.m102333p(QuoteKV.f42044a.m52056p(), rankType);
    }

    /* JADX INFO: renamed from: L3 */
    private final String m52661L3() {
        return (String) this.f42400V.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    private final void m52662M3() {
        NewRankRedDotHelper newRankRedDotHelper = NewRankRedDotHelper.f42388a;
        newRankRedDotHelper.m52641i().observe(getViewLifecycleOwner(), new C22432b(new Function1() { // from class: com.kubi.quotefacade.rank.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankFragment.m52663N3(this.f42454b, (List) obj);
            }
        }));
        newRankRedDotHelper.m52642j().observe(getViewLifecycleOwner(), new C22432b(new Function1() { // from class: com.kubi.quotefacade.rank.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankFragment.m52664O3(this.f42455b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m52663N3(RankFragment rankFragment, List list) {
        rankFragment.sendIntent(new RankContract$UiIntent.CheckToShowNewTabRedDot());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m52664O3(RankFragment rankFragment, List list) {
        rankFragment.sendIntent(new RankContract$UiIntent.CheckToShowNewTabRedDot());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public final void m52669W3(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rankTab", str);
        jSONObject.put("from", C22218w1.m52124d(getArguments()) ? "homePage" : C33556b3.f68963J);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "hotRankFlow", "2", jSONObject);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m52670Y3(RankFragment rankFragment) {
        rankFragment.sendIntent(new RankContract$UiIntent.FetchMarket());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m52671a4(RankFragment rankFragment) {
        rankFragment.sendIntent(new RankContract$UiIntent.FetchNewAllList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public final C4702x m52687I3() {
        return (C4702x) this.f42399U.getValue(this, f42398c0[0]);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[RETURN] */
    /* JADX INFO: renamed from: J3 */
    public final int m52688J3() {
        String strM4006d = C4391b.f3820a.m4006d();
        if (StringsKt.isBlank(strM4006d)) {
            strM4006d = null;
        }
        if (strM4006d == null) {
            strM4006d = C46392a.m102326h(QuoteKV.f42044a.m52056p(), "");
        }
        Iterator<RankTabConfig> it = this.f42404Z.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getRankType(), strM4006d)) {
                if (i11 == -1) {
                    return 0;
                }
                return i11;
            }
            i11++;
        }
        i11 = -1;
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    /* JADX INFO: renamed from: K3 */
    public final int m52689K3() {
        return this.f42403Y.indexOf(getString(R$string.rank_new_label_market));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m52692V3() throws JSONException {
        RankTabConfig rankTabConfig = (RankTabConfig) CollectionsKt.getOrNull(this.f42404Z, m52688J3());
        String rankType = rankTabConfig != null ? rankTabConfig.getRankType() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rankTab", rankType);
        jSONObject.put("from", C22218w1.m52124d(getArguments()) ? "homePage" : C33556b3.f68963J);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e(HomeCardViewHolderProxy.PAGE_ID, "hotRankFlow", "2", jSONObject);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m52693X3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankFragment.m52670Y3(this.f42453b);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m52694Z3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankFragment.m52671a4(this.f42457b);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22436c) {
            C22436c c22436c = (C22436c) singleEvent;
            if (getView() == null) {
                return;
            }
            m52696c4(c22436c.getF42412a());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_rank;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<RankVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RankVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C4702x c4702xM52687I3 = m52687I3();
        if (c4702xM52687I3 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f42403Y.clear();
        this.f42404Z.clear();
        if (C22218w1.m52124d(getArguments())) {
            RankConfig.f42417a.m52736p();
        }
        ArrayList<RankTabConfig> arrayList2 = this.f42404Z;
        List<RankTabConfig> listM52735m = RankConfig.f42417a.m52735m();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listM52735m) {
            if (((RankTabConfig) obj).getShowInDetail() || C22218w1.m52124d(getArguments())) {
                arrayList3.add(obj);
            }
        }
        arrayList2.addAll(arrayList3);
        for (RankTabConfig rankTabConfig : this.f42404Z) {
            this.f42403Y.add(rankTabConfig.getRankName());
            arrayList.add(rankTabConfig.getFragment(m52661L3()));
        }
        c4702xM52687I3.f4605b.setNeedBold(true);
        NoScrollQuoteViewPager noScrollQuoteViewPager = c4702xM52687I3.f4608e;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        noScrollQuoteViewPager.setAdapter(new C27103z(childFragmentManager, arrayList, this.f42403Y));
        c4702xM52687I3.f4605b.setViewPager(c4702xM52687I3.f4608e);
        c4702xM52687I3.f4608e.setOffscreenPageLimit(arrayList.size());
        c4702xM52687I3.f4608e.addOnPageChangeListener(this.f42405a0);
        m52662M3();
        m52695b4(c4702xM52687I3);
        m52693X3();
        if (C22218w1.m52124d(getArguments())) {
            m52686E3();
        }
    }

    public RankFragment() {
        setPageId("");
        this.f42405a0 = new C22431a();
    }

    /* JADX INFO: renamed from: P3 */
    public static final String m52665P3(RankFragment rankFragment) {
        Bundle arguments = rankFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("tab");
        }
        return null;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m52666Q3(RankFragment rankFragment) {
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4702x c4702xM52687I3 = rankFragment.m52687I3();
        if (c4702xM52687I3 != null && (noScrollQuoteViewPager = c4702xM52687I3.f4608e) != null) {
            noScrollQuoteViewPager.addOnPageChangeListener(rankFragment.f42405a0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final String m52667S3(RankFragment rankFragment) {
        Bundle arguments = rankFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("positionType");
        }
        return null;
    }

    /* JADX INFO: renamed from: U3 */
    public static final String m52668U3(RankFragment rankFragment) {
        Bundle arguments = rankFragment.getArguments();
        if (arguments != null) {
            return arguments.getString(ViewProps.POSITION);
        }
        return null;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m52686E3() {
        final C4702x c4702xM52687I3 = m52687I3();
        if (c4702xM52687I3 == null) {
            return;
        }
        c4702xM52687I3.f4605b.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.kubi.quotefacade.rank.k
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                RankFragment.m52658F3(c4702xM52687I3, view, i11, i12, i13, i14);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: P */
    public void mo31093P() {
        super.mo31093P();
        C12572a.m23695d("WIDGET_MOVE_ACTION", Boolean.FALSE, 0L, 4, null);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: Q */
    public void mo31094Q() {
        super.mo31094Q();
        C12572a.m23695d("WIDGET_MOVE_ACTION", Boolean.TRUE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m52690R3() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new RankFragment$openTargetTab$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: T3 */
    public final C4702x m52691T3() {
        if (getView() != null && isAdded()) {
            return m52687I3();
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public final void m52695b4(C4702x c4702x) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (C4392c.m4013a(m52661L3())) {
            int iM66658b = C27040e.m66658b(2);
            int iM66658b2 = C27040e.m66658b(14);
            if (C5303w0.m6511a()) {
                c4702x.f4605b.setPadding(iM66658b2, 0, iM66658b, 0);
            } else {
                c4702x.f4605b.setPadding(iM66658b, 0, iM66658b2, 0);
            }
            c4702x.f4605b.setUnderlineHeight(0.0f);
            ViewGroup.LayoutParams layoutParams = c4702x.f4605b.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C27040e.m66658b(8);
            }
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m52696c4(boolean z11) {
        RankSlidingTabLayout rankSlidingTabLayout;
        C4702x c4702xM52687I3 = m52687I3();
        if (c4702xM52687I3 != null && (rankSlidingTabLayout = c4702xM52687I3.f4605b) != null) {
            int currentTab = rankSlidingTabLayout.getCurrentTab();
            int iM52689K3 = m52689K3();
            if (iM52689K3 >= 0) {
                if (currentTab != iM52689K3 && z11) {
                    rankSlidingTabLayout.m55233y(iM52689K3);
                } else {
                    rankSlidingTabLayout.m55226r(iM52689K3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m52697d4() {
        C4702x c4702xM52687I3 = m52687I3();
        if (c4702xM52687I3 == null) {
            return;
        }
        if (C22218w1.m52124d(getArguments())) {
            int currentItem = c4702xM52687I3.f4608e.getCurrentItem();
            if (currentItem == 0) {
                ImageView tabLayoutStart = c4702xM52687I3.f4607d;
                Intrinsics.checkNotNullExpressionValue(tabLayoutStart, "tabLayoutStart");
                C27046k.m66700o(tabLayoutStart);
                return;
            } else if (currentItem == this.f42403Y.size() - 1) {
                ImageView tabLayoutStart2 = c4702xM52687I3.f4607d;
                Intrinsics.checkNotNullExpressionValue(tabLayoutStart2, "tabLayoutStart");
                C27046k.m66685H(tabLayoutStart2);
                return;
            } else {
                ImageView tabLayoutStart3 = c4702xM52687I3.f4607d;
                Intrinsics.checkNotNullExpressionValue(tabLayoutStart3, "tabLayoutStart");
                C27046k.m66685H(tabLayoutStart3);
                return;
            }
        }
        ImageView tabLayoutStart4 = c4702xM52687I3.f4607d;
        Intrinsics.checkNotNullExpressionValue(tabLayoutStart4, "tabLayoutStart");
        C27046k.m66700o(tabLayoutStart4);
        ImageView tabLayoutEnd = c4702xM52687I3.f4606c;
        Intrinsics.checkNotNullExpressionValue(tabLayoutEnd, "tabLayoutEnd");
        C27046k.m66700o(tabLayoutEnd);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: k0 */
    public void mo30080k0() {
        super.mo30080k0();
        C12572a.m23695d("WIDGET_MOVE_ACTION", Boolean.FALSE, 0L, 4, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankFragment.m52666Q3(this.f42449b);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws JSONException {
        boolean zM86553a;
        super.onShow();
        m52690R3();
        m52697d4();
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38358h.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zM86553a = ((InterfaceC38358h) objM56186h).m86553a();
        } else {
            zM86553a = true;
        }
        if (zM86553a) {
            m52694Z3();
        }
        m52692V3();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: r0 */
    public void mo30082r0() {
        super.mo30082r0();
        C12572a.m23695d("WIDGET_MOVE_ACTION", Boolean.TRUE, 0L, 4, null);
    }
}
