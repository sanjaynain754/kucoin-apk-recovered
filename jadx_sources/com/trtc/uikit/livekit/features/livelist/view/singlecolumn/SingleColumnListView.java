package com.trtc.uikit.livekit.features.livelist.view.singlecolumn;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPager;
import com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPagerAdapter;
import he0.InterfaceC38182b;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SingleColumnListView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010(\u001a\u00020)H\u0002J\u001e\u0010*\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u001bJ\b\u0010.\u001a\u00020)H\u0014J\b\u0010/\u001a\u00020)H\u0014J\u0018\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u001eH\u0002J\u0010\u00103\u001a\u00020)2\u0006\u00101\u001a\u00020\u0018H\u0002J\b\u00104\u001a\u00020)H\u0002J\b\u00105\u001a\u00020)H\u0002J\u0006\u00106\u001a\u00020)J\u0012\u00107\u001a\u00020)2\b\u00108\u001a\u0004\u0018\u00010'H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/LiveListViewAdapter;", "liveInfoListStore", "Lcom/trtc/uikit/livekit/features/livelist/store/LiveInfoListStore;", "liveListViewPager", "Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPager;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "liveListViewPagerAdapter", "Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter;", "playStreamView", "Ljava/util/HashSet;", "Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnItemView;", "Lkotlin/collections/HashSet;", "onItemClickListener", "Lcom/trtc/uikit/livekit/features/livelist/OnItemClickListener;", "willEnterRoomView", "isLoading", "", "isResumed", "loadingTime", "", "isInit", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "pictureInPictureRoomIdObserver", "Landroidx/lifecycle/Observer;", "", "initView", "", "init", "adapter", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onAttachedToWindow", "onDetachedFromWindow", "startPreviewLiveStream", "itemView", "isMuteAudio", "stopPreviewLiveStream", "stopAllPreviewLiveStream", "pauseAllLiveStream", "refreshData", "onPictureInPictureRoomIdChanged", "roomId", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "runnable", "Ljava/lang/Runnable;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSingleColumnListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1869#2,2:234\n1869#2,2:236\n1869#2,2:238\n*S KotlinDebug\n*F\n+ 1 SingleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnListView\n*L\n155#1:234,2\n160#1:236,2\n198#1:238,2\n*E\n"})
public final class SingleColumnListView extends FrameLayout {

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f79128q = new Companion(null);

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final LiveKitLogger f79129r = LiveKitLogger.f77564c.getComponentLogger("SingleColumnListView");

    /* JADX INFO: renamed from: b */
    public FragmentActivity f79130b;

    /* JADX INFO: renamed from: c */
    public LiveListViewPager f79131c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshLayout f79132d;

    /* JADX INFO: renamed from: e */
    public LiveListViewPagerAdapter f79133e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final HashSet<SingleColumnItemView> f79134f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC38182b f79135g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public SingleColumnItemView f79136h;

    /* JADX INFO: renamed from: i */
    public boolean f79137i;

    /* JADX INFO: renamed from: j */
    public boolean f79138j;

    /* JADX INFO: renamed from: k */
    public long f79139k;

    /* JADX INFO: renamed from: l */
    public boolean f79140l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC41775x1 f79141m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Observer<String> f79142n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final LifecycleEventObserver f79143o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Runnable f79144p;

    /* JADX INFO: compiled from: SingleColumnListView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/SingleColumnListView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "REFRESH_TIME_INTERVAL", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.SingleColumnListView$onAttachedToWindow$1 */
    /* JADX INFO: compiled from: SingleColumnListView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.livelist.view.singlecolumn.SingleColumnListView$onAttachedToWindow$1", m90122f = "SingleColumnListView.kt", m90123i = {}, m90124l = {131}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363931 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.SingleColumnListView$onAttachedToWindow$1$a */
        /* JADX INFO: compiled from: SingleColumnListView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ SingleColumnListView f79145b;

            public a(SingleColumnListView singleColumnListView) {
                this.f79145b = singleColumnListView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                this.f79145b.m81491k(str);
                return Unit.INSTANCE;
            }
        }

        public C363931(Continuation<? super C363931> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleColumnListView.this.new C363931(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363931) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41669n<String> interfaceC41669nM99359d = PIPPanelStore.f77996b.sharedInstance().getF77998a().m99359d();
                a aVar = new a(SingleColumnListView.this);
                this.label = 1;
                if (interfaceC41669nM99359d.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleColumnListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: p */
    public static final void m81488p(SingleColumnListView singleColumnListView) {
        singleColumnListView.f79137i = false;
        if (!singleColumnListView.f79138j) {
            f79129r.m79404b("the current activity is not resumed");
            return;
        }
        singleColumnListView.m81495s();
        LiveListViewPager liveListViewPager = singleColumnListView.f79131c;
        if (liveListViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveListViewPager");
            liveListViewPager = null;
        }
        int currentItem = liveListViewPager.getCurrentItem();
        LiveListViewPager liveListViewPager2 = singleColumnListView.f79131c;
        if (liveListViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveListViewPager");
            liveListViewPager2 = null;
        }
        View viewM81437o = liveListViewPager2.m81437o(currentItem);
        SingleColumnItemView singleColumnItemView = viewM81437o instanceof SingleColumnItemView ? (SingleColumnItemView) viewM81437o : null;
        if (singleColumnItemView != null) {
            singleColumnListView.m81494r(singleColumnItemView, false);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.SingleColumnListView$a */
    /* JADX INFO: compiled from: SingleColumnListView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C36392a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleColumnListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public static final void m81485j(SingleColumnListView singleColumnListView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = C36392a.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            singleColumnListView.f79138j = false;
            singleColumnListView.m81492l();
            return;
        }
        singleColumnListView.f79138j = true;
        singleColumnListView.f79136h = null;
        if (singleColumnListView.f79140l) {
            singleColumnListView.m81493n();
        } else {
            singleColumnListView.f79140l = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m81486m(SingleColumnListView singleColumnListView, String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        singleColumnListView.m81491k(roomId);
    }

    /* JADX INFO: renamed from: o */
    public static final void m81487o(final SingleColumnListView singleColumnListView) {
        SwipeRefreshLayout swipeRefreshLayout = singleColumnListView.f79132d;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(false);
        singleColumnListView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.g
            @Override // java.lang.Runnable
            public final void run() {
                SingleColumnListView.m81488p(this.f79152b);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final void m81489q(SingleColumnListView singleColumnListView) {
        if (singleColumnListView.f79137i) {
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = singleColumnListView.f79132d;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m81490h() {
        View viewFindViewById = findViewById(R$id.swipe_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f79132d = swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2 = null;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
            swipeRefreshLayout = null;
        }
        swipeRefreshLayout.setColorSchemeResources(R$color.common_design_standard_g5);
        View viewFindViewById2 = findViewById(R$id.live_list_view_pager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79131c = (LiveListViewPager) viewFindViewById2;
        SwipeRefreshLayout swipeRefreshLayout3 = this.f79132d;
        if (swipeRefreshLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
        } else {
            swipeRefreshLayout2 = swipeRefreshLayout3;
        }
        swipeRefreshLayout2.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.f
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                SingleColumnListView.m81484i(this.f79151b);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m81492l() {
        for (SingleColumnItemView singleColumnItemView : this.f79134f) {
            if (!Intrinsics.areEqual(this.f79136h, singleColumnItemView)) {
                singleColumnItemView.m81476d();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m81493n() {
        if (this.f79137i) {
            return;
        }
        if (System.currentTimeMillis() - this.f79139k < 1000) {
            removeCallbacks(this.f79144p);
            postDelayed(this.f79144p, 1000L);
            return;
        }
        this.f79139k = System.currentTimeMillis();
        this.f79137i = true;
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f79133e;
        if (liveListViewPagerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveListViewPagerAdapter");
            liveListViewPagerAdapter = null;
        }
        liveListViewPagerAdapter.m81464v(new LiveListViewPagerAdapter.InterfaceC36388a() { // from class: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.e
            @Override // com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPagerAdapter.InterfaceC36388a
            public final void onComplete() {
                SingleColumnListView.m81487o(this.f79150a);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m81495s() {
        Iterator<T> it = this.f79134f.iterator();
        while (it.hasNext()) {
            ((SingleColumnItemView) it.next()).m81476d();
        }
        this.f79134f.clear();
    }

    public final void setOnItemClickListener(@NotNull InterfaceC38182b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f79135g = listener;
    }

    public /* synthetic */ SingleColumnListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: i */
    public static final void m81484i(SingleColumnListView singleColumnListView) {
        singleColumnListView.m81493n();
    }

    /* JADX INFO: renamed from: k */
    public final void m81491k(String str) {
        if (TextUtils.isEmpty(str)) {
            for (SingleColumnItemView singleColumnItemView : this.f79134f) {
                if (singleColumnItemView.getF79126f()) {
                    singleColumnItemView.m81475c(false);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FragmentActivity fragmentActivity = this.f79130b;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentActivity");
            fragmentActivity = null;
        }
        fragmentActivity.getLifecycle().addObserver(this.f79143o);
        this.f79141m = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C363931(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FragmentActivity fragmentActivity = this.f79130b;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentActivity");
            fragmentActivity = null;
        }
        fragmentActivity.getLifecycle().removeObserver(this.f79143o);
        m81495s();
        InterfaceC41775x1 interfaceC41775x1 = this.f79141m;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m81494r(SingleColumnItemView singleColumnItemView, boolean z11) {
        singleColumnItemView.m81475c(z11);
        this.f79134f.add(singleColumnItemView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleColumnListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79134f = new HashSet<>(2);
        this.f79142n = new Observer() { // from class: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SingleColumnListView.m81486m(this.f79147b, (String) obj);
            }
        };
        LayoutInflater.from(context).inflate(R$layout.livelist_single_column_list_view, (ViewGroup) this, true);
        m81490h();
        this.f79143o = new LifecycleEventObserver() { // from class: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.c
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SingleColumnListView.m81485j(this.f79148b, lifecycleOwner, event);
            }
        };
        this.f79144p = new Runnable() { // from class: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.d
            @Override // java.lang.Runnable
            public final void run() {
                SingleColumnListView.m81489q(this.f79149b);
            }
        };
    }
}
