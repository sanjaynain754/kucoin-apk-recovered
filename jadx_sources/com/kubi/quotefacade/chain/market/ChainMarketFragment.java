package com.kubi.quotefacade.chain.market;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bv.C4668g;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.ChainMenuEntity;
import com.kubi.quotefacade.event.ChainMarketContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.ChainParamManager;
import com.kubi.quotefacade.helper.ChainSortHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p212dv.C36961a;
import p241ev.C37266a;
import p274fx.C37727a;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
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
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: ChainMarketFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001c\u001a\u00020\u0015H\u0014J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020+H\u0016J\u0010\u0010/\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0014J\b\u00102\u001a\u00020+H\u0014J\b\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J\u0010\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u0013H\u0002J\u0010\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\u0013H\u0002J\u0010\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u0013H\u0002J\u0010\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020\u0015H\u0002J\u0010\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020\u0013H\u0002J\u001c\u0010A\u001a\u00020+2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020+0CH\u0002J\u0016\u0010E\u001a\u00020+2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u000fj\b\u0012\u0004\u0012\u00020\u0013`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006J"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/ChainMarketFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/event/ChainMarketContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentChainMarketBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentChainMarketBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "alertSheetItem", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "codeList", "", "mPosition", "", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "tabLayout", "Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;", "mSortHelper", "Lcom/kubi/quotefacade/helper/ChainSortHelper;", "getLayout", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "initViews", "initViewPage", "initSortView", "alertChooseCryptoIndex", "updateTimeView", "timeStr", "updateFilterView", "sortType", "updateSafelySortView", "sort", "updateSortTypeVisibility", ViewProps.POSITION, "updateFilterData", "event", "updateCurrentSubUI", "block", "Lkotlin/Function1;", "Lcom/kubi/quotefacade/chain/market/ChainMarketListFragment;", "updateAdapter", "list", "", "Lcom/kubi/quotefacade/entity/ChainMenuEntity;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainMarketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainMarketFragment.kt\ncom/kubi/quotefacade/chain/market/ChainMarketFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 7 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,402:1\n147#2,16:403\n93#3,4:419\n1#4:423\n1869#5,2:424\n1878#5,3:433\n1573#5:436\n1604#5,4:437\n1573#5:441\n1604#5,4:442\n76#6,7:426\n45#7,7:446\n*S KotlinDebug\n*F\n+ 1 ChainMarketFragment.kt\ncom/kubi/quotefacade/chain/market/ChainMarketFragment\n*L\n53#1:403,16\n112#1:419,4\n277#1:424,2\n350#1:433,3\n367#1:436\n367#1:437,4\n382#1:441\n382#1:442,4\n319#1:426,7\n399#1:446,7\n*E\n"})
public final class ChainMarketFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41546U = C45681e.m100799e(this, new Function1<ChainMarketFragment, C4668g>() { // from class: com.kubi.quotefacade.chain.market.ChainMarketFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4668g invoke(@NotNull ChainMarketFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4668g.m4648a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4668g, Unit>() { // from class: com.kubi.quotefacade.chain.market.ChainMarketFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4668g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4668g c4668g) {
            invoke(c4668g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final List<SelectEntity> f41547V = new ArrayList();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<CharSequence> f41548W = new ArrayList<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ArrayList<String> f41549X = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    public int f41550Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public ViewPager2 f41551Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public SlidingTabLayout f41552a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public ChainSortHelper f41553b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f41545d0 = {Reflection.property1(new PropertyReference1Impl(ChainMarketFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentChainMarketBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f41544c0 = new Companion(null);

    /* JADX INFO: compiled from: ChainMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/ChainMarketFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "HOT_TAB_NAME", "newInstance", "Lcom/kubi/quotefacade/chain/market/ChainMarketFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ChainMarketFragment newInstance() {
            return new ChainMarketFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketFragment$a */
    /* JADX INFO: compiled from: ChainMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/chain/market/ChainMarketFragment$initViewPage$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21782a extends C45938b {
        public C21782a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) throws JSONException {
            super.mo18273b(i11);
            C44128b.m97266j(ChainMarketFragment.this.getTAG(), "onTabSelect position=" + i11);
            if (i11 >= 0 && i11 <= ChainMarketFragment.this.f41548W.size() - 1) {
                ChainMarketFragment.this.f41550Y = i11;
                ChainMarketFragment.this.m50886i4(i11);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", ChainMarketFragment.this.f41549X.get(i11));
                Unit unit = Unit.INSTANCE;
                C27023a.m66554a("B8LineCoins", "Chain", "1", jSONObject);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketFragment$b */
    /* JADX INFO: compiled from: ChainMarketFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21783b implements Function2<String, String, Unit> {

        /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketFragment$b$a */
        /* JADX INFO: compiled from: ChainMarketFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements Function1<ChainMarketListFragment, Unit> {

            /* JADX INFO: renamed from: b */
            public static final a f41556b = new a();

            /* JADX INFO: renamed from: a */
            public final void m50889a(ChainMarketListFragment chainMarketListFragment) {
                Intrinsics.checkNotNullParameter(chainMarketListFragment, "chainMarketListFragment");
                ChainMarketListFragment.m50912W3(chainMarketListFragment, false, 1, null);
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ChainMarketListFragment chainMarketListFragment) {
                m50889a(chainMarketListFragment);
                return Unit.INSTANCE;
            }
        }

        public C21783b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m50888a(String sortName, String sortSide) {
            Intrinsics.checkNotNullParameter(sortName, "sortName");
            Intrinsics.checkNotNullParameter(sortSide, "sortSide");
            C44128b.m97266j(ChainMarketFragment.this.getTAG(), sortName + " ----> " + sortSide);
            ChainMarketFragment.this.m50883e4(a.f41556b);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            m50888a(str, str2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketFragment$bindState$2 */
    /* JADX INFO: compiled from: ChainMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketFragment$bindState$2", m90122f = "ChainMarketFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C217852 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C217852(Continuation<? super C217852> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final void m50891f(ChainMarketFragment chainMarketFragment, View view) {
            chainMarketFragment.sendIntent(ChainMarketContract$UIIntent.FetchMenuList.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217852 c217852 = ChainMarketFragment.this.new C217852(continuation);
            c217852.L$0 = obj;
            return c217852;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C217852) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 == null) {
                return Unit.INSTANCE;
            }
            C44128b.m97266j(ChainMarketFragment.this.getTAG(), "bindState error");
            final ChainMarketFragment chainMarketFragment = ChainMarketFragment.this;
            BaseFragment.showFailView$default(chainMarketFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.chain.market.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChainMarketFragment.C217852.m50891f(chainMarketFragment, view);
                }
            }, 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketFragment$bindState$4 */
    /* JADX INFO: compiled from: ChainMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketFragment$bindState$4", m90122f = "ChainMarketFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C217874 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C217874(Continuation<? super C217874> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217874 c217874 = ChainMarketFragment.this.new C217874(continuation);
            c217874.L$0 = obj;
            return c217874;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C217874) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 == null) {
                return Unit.INSTANCE;
            }
            C44128b.m97266j(ChainMarketFragment.this.getTAG(), "bindState empty");
            BaseFragment.showEmptyView$default(ChainMarketFragment.this, 0, 0, (View.OnClickListener) null, 7, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m50848L3(final ChainMarketFragment chainMarketFragment, Integer num, final BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws JSONException {
        chainMarketFragment.m50883e4(new Function1() { // from class: com.kubi.quotefacade.chain.market.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainMarketFragment.m50849M3(this.f41579b, interfaceC24339a, (ChainMarketListFragment) obj);
            }
        });
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", interfaceC24339a.getValue());
        jSONObject.put("contentType", ChainParamManager.f42002a.m51963b().getMenuCode());
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B8LineCoins", "Time", "1", jSONObject);
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m50849M3(ChainMarketFragment chainMarketFragment, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a, ChainMarketListFragment chainMarketListFragment) {
        Intrinsics.checkNotNullParameter(chainMarketListFragment, "chainMarketListFragment");
        chainMarketFragment.m50887j4(interfaceC24339a.getLabel().toString());
        ChainParamManager.f42002a.m51968g(interfaceC24339a.getValue());
        ChainMarketListFragment.m50912W3(chainMarketListFragment, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m50851P3(final ChainMarketFragment chainMarketFragment) {
        ChainSortHelper chainSortHelper = chainMarketFragment.f41553b0;
        if (chainSortHelper != null) {
            chainSortHelper.m52087v(new Function2() { // from class: com.kubi.quotefacade.chain.market.l
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChainMarketFragment.m50852Q3(this.f41593b, (String) obj, (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m50852Q3(ChainMarketFragment chainMarketFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        C44128b.m97266j(chainMarketFragment.getTAG(), sortName + " --> " + sortSide);
        ChainParamManager.f42002a.m51967f(sortName, sortSide);
        chainMarketFragment.m50883e4(new Function1() { // from class: com.kubi.quotefacade.chain.market.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainMarketFragment.m50853R3((ChainMarketListFragment) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m50853R3(ChainMarketListFragment chainMarketListFragment) {
        Intrinsics.checkNotNullParameter(chainMarketListFragment, "chainMarketListFragment");
        chainMarketListFragment.m50954V3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m50854S3(final ChainMarketFragment chainMarketFragment) {
        ChainSortHelper chainSortHelper = chainMarketFragment.f41553b0;
        if (chainSortHelper != null) {
            chainSortHelper.m52086u(new Function2() { // from class: com.kubi.quotefacade.chain.market.m
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChainMarketFragment.m50855T3(this.f41594b, (String) obj, (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m50855T3(ChainMarketFragment chainMarketFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        C44128b.m97266j(chainMarketFragment.getTAG(), sortName + " --> " + sortSide);
        ChainParamManager.f42002a.m51967f(sortName, sortSide);
        chainMarketFragment.m50883e4(new Function1() { // from class: com.kubi.quotefacade.chain.market.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainMarketFragment.m50856U3((ChainMarketListFragment) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m50856U3(ChainMarketListFragment chainMarketListFragment) {
        Intrinsics.checkNotNullParameter(chainMarketListFragment, "chainMarketListFragment");
        chainMarketListFragment.m50954V3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m50857V3(final ChainMarketFragment chainMarketFragment) {
        ChainSortHelper chainSortHelper = chainMarketFragment.f41553b0;
        if (chainSortHelper != null) {
            chainSortHelper.m52085t(new Function2() { // from class: com.kubi.quotefacade.chain.market.n
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChainMarketFragment.m50858W3(this.f41595b, (String) obj, (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m50858W3(ChainMarketFragment chainMarketFragment, String sortName, String sortSide) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        Intrinsics.checkNotNullParameter(sortSide, "sortSide");
        C44128b.m97266j(chainMarketFragment.getTAG(), sortName + " --> " + sortSide);
        ChainParamManager.f42002a.m51967f(sortName, sortSide);
        chainMarketFragment.m50883e4(new Function1() { // from class: com.kubi.quotefacade.chain.market.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChainMarketFragment.m50859X3((ChainMarketListFragment) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m50859X3(ChainMarketListFragment chainMarketListFragment) {
        Intrinsics.checkNotNullParameter(chainMarketListFragment, "chainMarketListFragment");
        chainMarketListFragment.m50954V3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m50860Z3() {
        C4668g c4668gM50880N3 = m50880N3();
        if (c4668gM50880N3 == null) {
            return;
        }
        ChainParamManager.f42002a.m51965d();
        this.f41547V.clear();
        List<SelectEntity> list = this.f41547V;
        TimeSelectedEnum timeSelectedEnum = TimeSelectedEnum.TIME_5_MINUTES;
        String string = getString(timeSelectedEnum.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new SelectEntity(null, string, timeSelectedEnum.getConstTimeTag(), null, null, null, null, null, null, false, false, null, 4089, null));
        TimeSelectedEnum timeSelectedEnum2 = TimeSelectedEnum.TIME_1_HOUR;
        String string2 = getString(timeSelectedEnum2.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list.add(new SelectEntity(null, string2, timeSelectedEnum2.getConstTimeTag(), null, null, null, null, null, null, false, false, null, 4089, null));
        TimeSelectedEnum timeSelectedEnum3 = TimeSelectedEnum.TIME_4_HOURS;
        String string3 = getString(timeSelectedEnum3.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        list.add(new SelectEntity(null, string3, timeSelectedEnum3.getConstTimeTag(), null, null, null, null, null, null, false, false, null, 4089, null));
        TimeSelectedEnum timeSelectedEnum4 = TimeSelectedEnum.TIME_24_HOURS;
        String string4 = getString(timeSelectedEnum4.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        list.add(new SelectEntity(null, string4, timeSelectedEnum4.getConstTimeTag(), null, null, null, null, null, null, false, true, null, 3065, null));
        String string5 = getString(timeSelectedEnum4.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        m50887j4(string5);
        m50881Y3();
        m50850O3();
        BaseTextView ivTime = c4668gM50880N3.f4343f;
        Intrinsics.checkNotNullExpressionValue(ivTime, "ivTime");
        C27046k.m66711z(ivTime, 0L, new Function0() { // from class: com.kubi.quotefacade.chain.market.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketFragment.m50861a4(this.f41584b);
            }
        }, 1, null);
        AppCompatImageView ivFilter = c4668gM50880N3.f4342e;
        Intrinsics.checkNotNullExpressionValue(ivFilter, "ivFilter");
        C27046k.m66711z(ivFilter, 0L, new Function0() { // from class: com.kubi.quotefacade.chain.market.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketFragment.m50862b4();
            }
        }, 1, null);
        m50884f4("chain_filter_data_back_market");
        C44128b.m97266j(getTAG(), "initViews done");
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m50862b4() {
        ChainParamManager chainParamManager = ChainParamManager.f42002a;
        String str = Intrinsics.areEqual("hot", chainParamManager.m51963b().getMenuCode()) ? "marketHot" : "market";
        C27023a.m66555b("B8LineCoins", "Setting", null, null, 12, null);
        QuoteExKt.m51869t(str, chainParamManager.m51962a());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Fragment m50863d4(ChainMenuEntity chainMenuEntity, int i11) {
        return ChainMarketListFragment.f41557f0.newInstance(chainMenuEntity.getCode());
    }

    /* JADX INFO: renamed from: K3 */
    public final void m50879K3() {
        DialogFragmentHelper dialogFragmentHelperM58955P = BottomSheetDialogHelper.m58955P(BottomSheetDialogHelper.f48599a, this.f41547V, new BiConsumer() { // from class: com.kubi.quotefacade.chain.market.h
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                ChainMarketFragment.m50848L3(this.f41587b, (Integer) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, null, false, 12, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58955P.show(childFragmentManager, "alertChooseCryptoIndex");
    }

    /* JADX INFO: renamed from: N3 */
    public final C4668g m50880N3() {
        return (C4668g) this.f41546U.getValue(this, f41545d0[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.chain.market.ChainMarketFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C217852(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.chain.market.ChainMarketFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C217874(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        C44128b.m97266j(getTAG(), "dispatchSingleEvent = " + singleEvent);
        if (singleEvent instanceof C36961a) {
            C36961a c36961a = (C36961a) singleEvent;
            if (getView() == null) {
                return;
            }
            C44128b.m97266j(getTAG(), "dispatchSingleEvent marketMenuEntity = " + c36961a.m82778a());
            List<ChainMenuEntity> listM82778a = c36961a.m82778a();
            if (listM82778a == null || !(!listM82778a.isEmpty())) {
                return;
            }
            showContentView();
            m50882c4(c36961a.m82778a());
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m50883e4(Function1<? super ChainMarketListFragment, Unit> function1) {
        ViewPager2 viewPager2 = this.f41551Z;
        if (viewPager2 == null) {
            return;
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.resources.widget.viewpager2.ViewPager2Adapter");
        int i11 = 0;
        for (Object obj : ((C37727a) adapter).m85030j()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Fragment fragment = (Fragment) obj;
            if ((fragment instanceof ChainMarketListFragment) && ((ChainMarketListFragment) fragment).isShowing()) {
                function1.invoke(fragment);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m50884f4(String str) {
        if (C12573b.f21598a.m23696a()) {
            str.length();
        }
        C12572a.m23692a(this, false, new C21788x6d9c47e(str, null, this));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m50885g4(String str) {
        AppCompatImageView appCompatImageView;
        int colorRes = !Intrinsics.areEqual(str, ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType()) ? getColorRes(R$color.primary) : getColorRes(R$color.emphasis);
        C4668g c4668gM50880N3 = m50880N3();
        if (c4668gM50880N3 == null || (appCompatImageView = c4668gM50880N3.f4342e) == null) {
            return;
        }
        appCompatImageView.setColorFilter(colorRes, PorterDuff.Mode.SRC_ATOP);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_chain_market;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ChainMarketViewModel.class);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_chain_market, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m50860Z3();
    }

    /* JADX INFO: renamed from: O3 */
    private final void m50850O3() {
        C4668g c4668gM50880N3 = m50880N3();
        if (c4668gM50880N3 == null) {
            return;
        }
        FrameLayout frameLayout = c4668gM50880N3.f4346i.f4454k;
        Intrinsics.checkNotNull(frameLayout);
        this.f41553b0 = new ChainSortHelper(frameLayout);
        c4668gM50880N3.f4346i.f4449f.setImageResource(0);
        c4668gM50880N3.f4346i.f4458o.setText(getString(ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getResourceId()));
        LinearLayout llAmount = c4668gM50880N3.f4346i.f4452i;
        Intrinsics.checkNotNullExpressionValue(llAmount, "llAmount");
        C27046k.m66710y(llAmount, 500L, new Function0() { // from class: com.kubi.quotefacade.chain.market.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketFragment.m50857V3(this.f41589b);
            }
        });
        LinearLayout flPrice = c4668gM50880N3.f4346i.f4446c;
        Intrinsics.checkNotNullExpressionValue(flPrice, "flPrice");
        C27046k.m66710y(flPrice, 500L, new Function0() { // from class: com.kubi.quotefacade.chain.market.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketFragment.m50851P3(this.f41591b);
            }
        });
        FrameLayout flChangeRate = c4668gM50880N3.f4346i.f4445b;
        Intrinsics.checkNotNullExpressionValue(flChangeRate, "flChangeRate");
        C27046k.m66710y(flChangeRate, 500L, new Function0() { // from class: com.kubi.quotefacade.chain.market.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketFragment.m50854S3(this.f41592b);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m50861a4(ChainMarketFragment chainMarketFragment) {
        chainMarketFragment.m50879K3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public final void m50864h4(String str) {
        C4668g c4668gM50880N3 = m50880N3();
        if (c4668gM50880N3 == null) {
            return;
        }
        if (Intrinsics.areEqual(str, ChainSortItemEnum.CHAIN_SORT_TYPE_SAFELY.getConstSortType())) {
            c4668gM50880N3.f4346i.f4448e.setVisibility(8);
            c4668gM50880N3.f4346i.f4445b.setEnabled(false);
        } else {
            c4668gM50880N3.f4346i.f4448e.setVisibility(0);
            c4668gM50880N3.f4346i.f4445b.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m50881Y3() {
        C4668g c4668gM50880N3 = m50880N3();
        if (c4668gM50880N3 == null) {
            return;
        }
        this.f41548W.clear();
        this.f41551Z = c4668gM50880N3.f4345h;
        SlidingTabLayout slidingTabLayout = c4668gM50880N3.f4339b;
        this.f41552a0 = slidingTabLayout;
        if (slidingTabLayout != null) {
            slidingTabLayout.setNeedBold(true);
        }
        ViewPager2 viewPager2 = c4668gM50880N3.f4345h;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new C37727a(childFragmentManager, lifecycle));
        c4668gM50880N3.f4345h.setOffscreenPageLimit(1);
        c4668gM50880N3.f4339b.m55601z(this.f41551Z, this.f41548W);
        c4668gM50880N3.f4339b.setOnTabSelectListener(new C21782a());
    }

    /* JADX INFO: renamed from: c4 */
    public final void m50882c4(List<ChainMenuEntity> list) {
        SlidingTabLayout slidingTabLayout;
        TextView textView;
        Drawable drawable;
        try {
            C44128b.m97266j(getTAG(), "updateAdapter start");
            ViewPager2 viewPager2 = this.f41551Z;
            if (viewPager2 != null && (slidingTabLayout = this.f41552a0) != null) {
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.resources.widget.viewpager2.ViewPager2Adapter");
                C37727a c37727a = (C37727a) adapter;
                List<?> mutableList = CollectionsKt.toMutableList((Collection) list);
                c37727a.clear();
                this.f41548W.clear();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
                Iterator<T> it = mutableList.iterator();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    C37727a c37727aM85027g = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final ChainMenuEntity chainMenuEntity = (ChainMenuEntity) next;
                    C44128b.m97266j(getTAG(), "updateAdapter " + i12 + " --> " + chainMenuEntity);
                    String code = chainMenuEntity.getCode();
                    if (code != null) {
                        this.f41549X.add(code);
                        String displayName = chainMenuEntity.getDisplayName();
                        if (displayName != null) {
                            this.f41548W.add(displayName);
                        }
                        c37727aM85027g = c37727a.m85027g(new Function1() { // from class: com.kubi.quotefacade.chain.market.a
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChainMarketFragment.m50863d4(chainMenuEntity, ((Integer) obj).intValue());
                            }
                        });
                    }
                    arrayList.add(c37727aM85027g);
                    i12 = i13;
                }
                viewPager2.setCurrentItem(0, false);
                c37727a.m85031k(mutableList);
                if (this.f41548W.size() > 0) {
                    slidingTabLayout.m55597u();
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
                for (Object obj : mutableList) {
                    int i14 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ChainMenuEntity chainMenuEntity2 = (ChainMenuEntity) obj;
                    View viewM55593q = slidingTabLayout.m55593q(i11);
                    if (viewM55593q != null && (textView = (TextView) viewM55593q.findViewById(R$id.tv_tab_title)) != null) {
                        if (Intrinsics.areEqual(chainMenuEntity2.getTagType(), "hot")) {
                            drawable = textView.getContext().getDrawable(R$mipmap.ic_hot);
                        } else {
                            drawable = null;
                        }
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else {
                        textView = null;
                    }
                    arrayList2.add(textView);
                    i11 = i14;
                }
            }
        } catch (Exception e11) {
            if (!(e11 instanceof CancellationException)) {
                C37266a.m83411b(e11, "QuoteSpotFragmentUpdateAdapterException");
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m50886i4(int i11) {
        String f42080k;
        C4668g c4668gM50880N3 = m50880N3();
        if (c4668gM50880N3 != null && i11 >= 0 && i11 < this.f41549X.size()) {
            c4668gM50880N3.f4346i.f4447d.setVisibility(0);
            c4668gM50880N3.f4346i.f4450g.setVisibility(0);
            ChainSortHelper chainSortHelper = this.f41553b0;
            if (chainSortHelper != null) {
                f42080k = chainSortHelper.getF42080k();
            } else {
                f42080k = null;
            }
            if (!Intrinsics.areEqual(f42080k, ChainSortItemEnum.CHAIN_SORT_TYPE_SAFELY.getConstSortType())) {
                c4668gM50880N3.f4346i.f4448e.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m50887j4(String str) {
        C4668g c4668gM50880N3 = m50880N3();
        if (c4668gM50880N3 != null) {
            c4668gM50880N3.f4343f.setText(str);
            for (SelectEntity selectEntity : this.f41547V) {
                selectEntity.setChecked(Intrinsics.areEqual(selectEntity.getLabel(), str));
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        sendIntent(ChainMarketContract$UIIntent.FetchMenuList.INSTANCE);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C27023a.m66557d("B8LineCoins", "Tab", null, null, 12, null);
    }
}
