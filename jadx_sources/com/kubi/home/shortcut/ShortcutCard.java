package com.kubi.home.shortcut;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.BeepHelper;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.R$raw;
import com.kubi.home.R$string;
import com.kubi.home.common.ReferralHelper;
import com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.SimpleStateCard;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.ToastCompat;
import dj.C36722g;
import fj.C37548u0;
import io.reactivex.functions.Action;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p209ds.RedDot;
import p569qq.C43841b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ShortcutCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\u0016\u0010%\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortcutCard;", "Lcom/kubi/kucoin/home/cards/SimpleStateCard;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UIState;", "<init>", "()V", "kucoinLayoutHomeFastLinkBinding", "Lcom/kubi/home/databinding/KucoinLayoutHomeFastlinkBinding;", "getKucoinLayoutHomeFastLinkBinding", "()Lcom/kubi/home/databinding/KucoinLayoutHomeFastlinkBinding;", "kucoinLayoutHomeFastLinkBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "homeMenuListAdapter", "Lcom/kubi/home/shortcut/HomeMenuListAdapter;", "getHomeMenuListAdapter", "()Lcom/kubi/home/shortcut/HomeMenuListAdapter;", "homeMenuListAdapter$delegate", "Lkotlin/Lazy;", "getLayout", "", "initView", "", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindListLayoutManager", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "bindAdapter", "onResume", "listenEventChanged", "updateHeight", "bindRedDot", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "Lcom/kubi/notice/api/entity/RedDot;", "handleUpdateEnCourage", "handleUpdateMenuList", "", "Lcom/kubi/home/shortcut/FunctionEntity;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/shortcut/ShortcutVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShortcutCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutCard.kt\ncom/kubi/home/shortcut/ShortcutCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n147#2,16:222\n93#3,4:238\n76#4,7:242\n76#4,7:249\n153#4,7:256\n153#4,7:263\n1#5:270\n*S KotlinDebug\n*F\n+ 1 ShortcutCard.kt\ncom/kubi/home/shortcut/ShortcutCard\n*L\n41#1:222,16\n72#1:238,4\n140#1:242,7\n143#1:249,7\n146#1:256,7\n149#1:263,7\n*E\n"})
public final class ShortcutCard extends SimpleStateCard<UIState> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f26230Z = {Reflection.property1(new PropertyReference1Impl(ShortcutCard.class, "kucoinLayoutHomeFastLinkBinding", "getKucoinLayoutHomeFastLinkBinding()Lcom/kubi/home/databinding/KucoinLayoutHomeFastlinkBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f26231X = C45681e.m100799e(this, new Function1<ShortcutCard, C37548u0>() { // from class: com.kubi.home.shortcut.ShortcutCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37548u0 invoke(@NotNull ShortcutCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37548u0.m84568a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37548u0, Unit>() { // from class: com.kubi.home.shortcut.ShortcutCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37548u0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37548u0 c37548u0) {
            invoke(c37548u0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f26232Y = LazyKt.lazy(new Function0() { // from class: com.kubi.home.shortcut.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortcutCard.m30268w3();
        }
    });

    /* JADX INFO: renamed from: com.kubi.home.shortcut.ShortcutCard$a */
    /* JADX INFO: compiled from: ShortcutCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/home/shortcut/ShortcutCard$bindListLayoutManager$1", "Lcom/kubi/home/pagergridlayoutmanager/PagerGridLayoutManager$PagerChangedListener;", "onPagerCountChanged", "", "pagerCount", "", "onPagerIndexSelected", "prePagerIndex", "currentPagerIndex", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14857a implements PagerGridLayoutManager.InterfaceC14748e {
        public C14857a() {
        }

        @Override // com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager.InterfaceC14748e
        /* JADX INFO: renamed from: a */
        public void mo29805a(int i11, int i12) {
            IndicatorView2 indicatorView2;
            C37548u0 c37548u0M30273t3 = ShortcutCard.this.m30273t3();
            if (c37548u0M30273t3 == null || (indicatorView2 = c37548u0M30273t3.f83428b) == null) {
                return;
            }
            indicatorView2.m30257b(i12);
        }

        @Override // com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager.InterfaceC14748e
        /* JADX INFO: renamed from: b */
        public void mo29806b(int i11) {
            IndicatorView2 indicatorView2;
            C37548u0 c37548u0M30273t3 = ShortcutCard.this.m30273t3();
            if (c37548u0M30273t3 == null || (indicatorView2 = c37548u0M30273t3.f83428b) == null) {
                return;
            }
            indicatorView2.m30256a(i11, 0);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.ShortcutCard$bindState$2 */
    /* JADX INFO: compiled from: ShortcutCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/shortcut/FunctionEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.shortcut.ShortcutCard$bindState$2", m90122f = "ShortcutCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C148592 extends SuspendLambda implements Function2<List<? extends FunctionEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends FunctionEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<FunctionEntity>) list, continuation);
        }

        public C148592(Continuation<? super C148592> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C148592 c148592 = ShortcutCard.this.new C148592(continuation);
            c148592.L$0 = obj;
            return c148592;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<FunctionEntity> list, Continuation<? super Unit> continuation) {
            return ((C148592) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ShortcutCard.this.m30275v3(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static final void m30267r3(ShortcutCard shortcutCard) {
        shortcutCard.sendIntent(ShortCutCardMviContract$UiIntent.EnCourageIntent.INSTANCE);
    }

    /* JADX INFO: renamed from: w3 */
    public static final HomeMenuListAdapter m30268w3() {
        return new HomeMenuListAdapter();
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo28980K1(data);
        ShortcutData shortcutData = data instanceof ShortcutData ? (ShortcutData) data : null;
        if (shortcutData != null) {
            sendIntent(new ShortCutCardMviContract$UiIntent.SetServerMenuResponseIntent(shortcutData));
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C14888f) {
            m30274u3();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_layout_home_fastlink;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @NotNull
    public KClass<ShortcutVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ShortcutVM.class);
    }

    /* JADX INFO: renamed from: p3 */
    public final void m30270p3() {
        RecyclerView recyclerView;
        PagerGridLayoutManager pagerGridLayoutManager = new PagerGridLayoutManager(1, 5, 0);
        pagerGridLayoutManager.m29765N(true);
        C37548u0 c37548u0M30273t3 = m30273t3();
        if (c37548u0M30273t3 != null && (recyclerView = c37548u0M30273t3.f83429c) != null) {
            recyclerView.setLayoutManager(pagerGridLayoutManager);
        }
        pagerGridLayoutManager.m29766O(new C14857a());
    }

    /* JADX INFO: renamed from: s3 */
    public final HomeMenuListAdapter m30272s3() {
        return (HomeMenuListAdapter) this.f26232Y.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    public final C37548u0 m30273t3() {
        return (C37548u0) this.f26231X.getValue(this, f26230Z[0]);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m30276x3() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:showRedPoint".length();
        }
        C12572a.m23692a(this, false, new ShortcutCard$listenEventChanged$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:showRedPoint", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:updateShortcut".length();
        }
        C12572a.m23692a(this, false, new ShortcutCard$listenEventChanged$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:updateShortcut", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.user.event.UserEvent:onConfigChange".length();
        }
        C12572a.m23692a(this, false, new ShortcutCard$listenEventChanged$$inlined$bindFlowEvent$default$3("com.kubi.user.event.UserEvent:onConfigChange", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new ShortcutCard$listenEventChanged$$inlined$bindFlowEvent$default$4("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.shortcut.ShortcutCard.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new C148592(null));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void initView() {
        super.initView();
        m30270p3();
        m30269o3();
        List<FunctionEntity> listM30396d = ShortCutDataParser.f26308a.m30396d();
        if (listM30396d == null) {
            listM30396d = CollectionsKt.emptyList();
        }
        m30275v3(listM30396d);
        sendIntent(ShortCutCardMviContract$UiIntent.UpdateServerIntent.INSTANCE);
        m30276x3();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m30269o3() {
        RecyclerView recyclerView;
        C37548u0 c37548u0M30273t3 = m30273t3();
        if (c37548u0M30273t3 != null && (recyclerView = c37548u0M30273t3.f83429c) != null) {
            recyclerView.setAdapter(m30272s3());
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        sendIntent(ShortCutCardMviContract$UiIntent.CheckNeedGetCacheMenuListIntent.INSTANCE);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m30271q3(RedDot redDot) {
        m30272s3().m30244p(Integer.valueOf(redDot.getEncourageCount()));
        m30272s3().m30245q(new Action() { // from class: com.kubi.home.shortcut.i
            @Override // io.reactivex.functions.Action
            public final void run() {
                ShortcutCard.m30267r3(this.f26310b);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m30274u3() {
        m30272s3().m30244p(0);
        BeepHelper.m23642f("beep_income", R$raw.asset_in);
        ToastCompat.m66437C(R$string.withdrawal_all_success);
        Context context = getContext();
        if (context != null) {
            C36722g.m82290d(context, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m30275v3(List<FunctionEntity> list) {
        IndicatorView2 indicatorView2;
        RecyclerView.LayoutManager layoutManager;
        RecyclerView recyclerView;
        m30272s3().replaceData(list);
        m30277y3();
        ReferralHelper.m29042a(list);
        C37548u0 c37548u0M30273t3 = m30273t3();
        if (c37548u0M30273t3 != null && (indicatorView2 = c37548u0M30273t3.f83428b) != null) {
            C37548u0 c37548u0M30273t4 = m30273t3();
            if (c37548u0M30273t4 != null && (recyclerView = c37548u0M30273t4.f83429c) != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager");
            indicatorView2.m30256a(((PagerGridLayoutManager) layoutManager).m29790s(), 0);
        }
        C43841b.m96557d("event_load_home_grid_menu", "page_load_end", null, 4, null);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m30277y3() {
        RecyclerView recyclerView;
        int i11;
        C37548u0 c37548u0M30273t3 = m30273t3();
        if (c37548u0M30273t3 != null && (recyclerView = c37548u0M30273t3.f83429c) != null) {
            List<FunctionEntity> data = m30272s3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            if (!data.isEmpty()) {
                if (data.size() <= 5) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, HomeMenuConstant.f26204a.getITEM_HEIGHT() * i11));
                if (recyclerView.getLayoutManager() instanceof PagerGridLayoutManager) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.kubi.home.pagergridlayoutmanager.PagerGridLayoutManager");
                    ((PagerGridLayoutManager) layoutManager).m29768Q(i11);
                }
            }
        }
    }
}
