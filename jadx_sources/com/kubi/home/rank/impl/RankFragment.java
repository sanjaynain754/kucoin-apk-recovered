package com.kubi.home.rank.impl;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$string;
import com.kubi.home.exception.HomeException;
import com.kubi.home.rank.impl.cache.RankItem;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p208dr.InterfaceC36952a;
import p569qq.C43841b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import ro.C44128b;

/* JADX INFO: compiled from: RankFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010%\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u0013H\u0002J\u0014\u0010'\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\u0006\u0010+\u001a\u00020\u0013J\u0006\u0010,\u001a\u00020\u0013J\n\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u000201H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000204038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/home/rank/impl/RankStateContract$UIState;", "<init>", "()V", "rankListAdapter", "Lcom/kubi/home/rank/impl/RankListAdapter;", "type", "", "key", "", "rankRepository", "Lcom/kubi/home/rank/impl/RankRepository;", "getLayout", "blockData", "", "isTrackPoint", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindFlowEvent", "bindState", "changeRankType", "rankTab", "Lcom/kubi/home/rank/impl/RankTab;", "onCustomCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleItemClick", ViewProps.POSITION, "lazyLoad", "loadData", "refreshData", "data", "", "Lcom/kubi/home/rank/impl/cache/RankItem;", "onStartMove", "onIdle", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/rank/impl/RankVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankFragment.kt\ncom/kubi/home/rank/impl/RankFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 4 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,210:1\n158#2,2:211\n158#2,2:213\n81#2,2:215\n50#3,17:217\n47#4,2:234\n93#5,4:236\n93#5,4:240\n*S KotlinDebug\n*F\n+ 1 RankFragment.kt\ncom/kubi/home/rank/impl/RankFragment\n*L\n81#1:211,2\n85#1:213,2\n89#1:215,2\n141#1:217,17\n145#1:234,2\n200#1:236,4\n202#1:240,4\n*E\n"})
public final class RankFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f25998a0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public RankListAdapter f25999U;

    /* JADX INFO: renamed from: V */
    public int f26000V;

    /* JADX INFO: renamed from: Y */
    public boolean f26003Y;

    /* JADX INFO: renamed from: W */
    @NotNull
    public String f26001W = "";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final RankRepository f26002X = new RankRepository();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f26004Z = new AtomicBoolean(false);

    /* JADX INFO: compiled from: RankFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/home/rank/impl/RankFragment;", "key", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final RankFragment newInstance(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            RankFragment rankFragment = new RankFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key", key);
            rankFragment.setArguments(bundle);
            return rankFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.RankFragment$bindState$2 */
    /* JADX INFO: compiled from: RankFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/rank/impl/cache/RankItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.rank.impl.RankFragment$bindState$2", m90122f = "RankFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C147592 extends SuspendLambda implements Function2<List<? extends RankItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RankItem> list, Continuation<? super Unit> continuation) {
            return invoke2((List<RankItem>) list, continuation);
        }

        public C147592(Continuation<? super C147592> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C147592 c147592 = RankFragment.this.new C147592(continuation);
            c147592.L$0 = obj;
            return c147592;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RankItem> list, Continuation<? super Unit> continuation) {
            return ((C147592) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<RankItem> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RankFragment.this.m29852x3(list);
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return 0;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m29850v3() {
        this.f26003Y = false;
    }

    /* JADX INFO: renamed from: w3 */
    public final void m29851w3() {
        this.f26003Y = true;
    }

    /* JADX INFO: renamed from: s3 */
    private final void m29846s3(int i11, View view) throws Throwable {
        Object objM103844constructorimpl;
        RankListAdapter rankListAdapter = this.f25999U;
        Intrinsics.checkNotNull(rankListAdapter);
        if (i11 < rankListAdapter.getItems().size() && !C27014a1.m66501a(view)) {
            RankRepository rankRepository = this.f26002X;
            int i12 = this.f26000V;
            RankListAdapter rankListAdapter2 = this.f25999U;
            rankRepository.m29872i(i12, i11, rankListAdapter2 != null ? rankListAdapter2.getItem(i11) : null);
            boolean zM42528a = C19241c.f35620a.m42528a();
            boolean z11 = !zM42528a;
            try {
                Result.Companion companion = Result.INSTANCE;
                RankListAdapter rankListAdapter3 = this.f25999U;
                Intrinsics.checkNotNull(rankListAdapter3);
                TradeItemBean tradeItemBean = rankListAdapter3.getItems().get(i11).getTradeItemBean();
                Intrinsics.checkNotNull(tradeItemBean);
                ISpotService.m59982A(ISpotService.f49646a.get(), tradeItemBean.getSymbol(), null, null, null, 14, null);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f("crash_issue", "crash_issue->【RankFragment 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl2, "RankFragment", false, null, 8, null), null, 2, null);
                this.f26002X.m29870g(this.f26000V, "rank_jump", thM103847exceptionOrNullimpl2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: t3 */
    private final void m29847t3() {
        sendIntent(new RankStateContract$UiIntent.ListenRankData(this.f26000V));
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m29848u3(RankFragment rankFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws Throwable {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        rankFragment.m29846s3(i11, view);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C14786k) {
            showEmpty(R$string.rannk_data_loading, R$drawable.ic2_common_empty);
        }
        if (singleEvent instanceof C14785j) {
            final C14785j c14785j = (C14785j) singleEvent;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.rank.impl.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RankFragment.m29845r3(this.f26028b, c14785j);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<RankVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RankVM.class);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    @Nullable
    public View onCustomCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(null);
        RankListAdapter rankListAdapter = new RankListAdapter(new RankItemDiffCallBack(), this.f26000V, this.f26002X);
        this.f25999U = rankListAdapter;
        rankListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.home.rank.impl.d
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws Throwable {
                RankFragment.m29848u3(this.f26047a, baseQuickAdapter, view, i11);
            }
        });
        recyclerView.setAdapter(this.f25999U);
        return recyclerView;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = (ImageView) view.findViewById(R$id.empty_icon);
        if (imageView != null) {
            imageView.setImageTintList(null);
        }
        showLoading();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m29852x3(@NotNull List<RankItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f26003Y) {
            return;
        }
        C4988a.m5286a("刷新数据 type->" + this.f26000V, "rank");
        if (this.f26004Z.compareAndSet(false, true)) {
            C43841b.m96557d("event_load_home_rank", "page_load_end", null, 4, null);
        }
        RankListAdapter rankListAdapter = this.f25999U;
        if (rankListAdapter != null) {
            rankListAdapter.submitList(data);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m29845r3(RankFragment rankFragment, C14785j c14785j) {
        rankFragment.m29852x3(c14785j.m29991a());
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "rank_view_more".length();
        }
        C12572a.m23692a(this, false, new RankFragment$bindFlowEvent$$inlined$bindFlowEvent$1("rank_view_more", null, this));
        if (c12573b.m23696a()) {
            "rank_view_close".length();
        }
        C12572a.m23692a(this, false, new RankFragment$bindFlowEvent$$inlined$bindFlowEvent$2("rank_view_close", null, this));
        if (c12573b.m23696a()) {
            "change_rank_type".length();
        }
        C12572a.m23692a(this, false, new RankFragment$bindFlowEvent$$inlined$bindFlowEvent$3("change_rank_type", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.rank.impl.RankFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new C147592(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        super.getViewModeFactory();
        return new RankViewModeFactory(this.f26000V);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        m29847t3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("key");
        } else {
            string = null;
        }
        String strM66668h = C27041f.m66668h(string);
        this.f26001W = strM66668h;
        this.f26000V = this.f26002X.m29866c(strM66668h);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m29849q3(RankTab rankTab) {
        if (Intrinsics.areEqual(rankTab.getKey(), this.f26001W) && this.f26000V != rankTab.getType()) {
            this.f26000V = rankTab.getType();
            sendIntent(new RankStateContract$UiIntent.UpdateListenRankData(rankTab.getType()));
        }
    }
}
