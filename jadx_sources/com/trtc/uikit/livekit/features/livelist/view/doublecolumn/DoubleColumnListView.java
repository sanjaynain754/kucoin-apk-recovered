package com.trtc.uikit.livekit.features.livelist.view.doublecolumn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.component.pippanel.PIPPanelStore;
import he0.InterfaceC38182b;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;

/* JADX INFO: compiled from: DoubleColumnListView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 B2\u00020\u0001:\u0001BB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0017J\u000e\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\u0019J\u0018\u00101\u001a\u00020)2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020)H\u0014J\b\u00107\u001a\u00020)H\u0014J\b\u00108\u001a\u00020)H\u0003J\b\u00109\u001a\u00020)H\u0002J\u0006\u0010:\u001a\u00020)J\b\u0010;\u001a\u00020)H\u0002J\u0016\u0010<\u001a\u00020)2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0>H\u0002J\b\u0010?\u001a\u00020)H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "adapter", "Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/LiveListViewAdapter;", "liveInfoListStore", "Lcom/trtc/uikit/livekit/features/livelist/store/LiveInfoListStore;", "onItemClickListener", "Lcom/trtc/uikit/livekit/features/livelist/OnItemClickListener;", "willEnterRoomView", "Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnItemView;", "playStreamViews", "", "isLoading", "", "isResumed", "loadingTime", "", "isInit", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "pictureInPictureRoomIdObserver", "Lkotlin/Function1;", "", "", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "init", "activity", NotificationCompat.CATEGORY_SERVICE, "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onLiveInfoViewClick", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onAttachedToWindow", "onDetachedFromWindow", "initRecyclerView", "autoPlayVideoStream", "refreshData", "loadMoreData", "startPreviewLiveStream", "itemViewSet", "", "stopAllPreviewLiveStream", "runnable", "Ljava/lang/Runnable;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDoubleColumnListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1617#2,9:293\n1869#2:302\n1870#2:304\n1626#2:305\n774#2:306\n865#2,2:307\n1869#2,2:309\n1869#2,2:311\n1869#2,2:313\n774#2:315\n865#2,2:316\n1869#2,2:318\n774#2:320\n865#2,2:321\n1869#2,2:323\n1#3:303\n*S KotlinDebug\n*F\n+ 1 DoubleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView\n*L\n185#1:293,9\n185#1:302\n185#1:304\n185#1:305\n187#1:306\n187#1:307,2\n273#1:309,2\n277#1:311,2\n284#1:313,2\n61#1:315\n61#1:316,2\n62#1:318,2\n76#1:320\n76#1:321,2\n77#1:323,2\n185#1:303\n*E\n"})
public final class DoubleColumnListView extends FrameLayout {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f79057r = new Companion(null);

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final LiveKitLogger f79058s = LiveKitLogger.f77564c.getComponentLogger("DoubleColumnListView");

    /* JADX INFO: renamed from: b */
    @NotNull
    public SwipeRefreshLayout f79059b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public RecyclerView f79060c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public GridLayoutManager f79061d;

    /* JADX INFO: renamed from: e */
    public DoubleColumnAdapter f79062e;

    /* JADX INFO: renamed from: f */
    public FragmentActivity f79063f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC38182b f79064g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public DoubleColumnItemView f79065h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Set<DoubleColumnItemView> f79066i;

    /* JADX INFO: renamed from: j */
    public boolean f79067j;

    /* JADX INFO: renamed from: k */
    public boolean f79068k;

    /* JADX INFO: renamed from: l */
    public long f79069l;

    /* JADX INFO: renamed from: m */
    public boolean f79070m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public InterfaceC41775x1 f79071n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Function1<String, Unit> f79072o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final LifecycleEventObserver f79073p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Runnable f79074q;

    /* JADX INFO: compiled from: DoubleColumnListView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "REFRESH_TIME_INTERVAL", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnListView$b */
    /* JADX INFO: compiled from: DoubleColumnListView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$refreshData$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36376b implements CompletionHandler {
        /* JADX INFO: renamed from: c */
        public static final void m81401c(DoubleColumnListView doubleColumnListView) {
            doubleColumnListView.f79067j = false;
            doubleColumnListView.f79059b.setRefreshing(false);
        }

        /* JADX INFO: renamed from: d */
        public static final void m81402d(DoubleColumnListView doubleColumnListView) {
            doubleColumnListView.f79067j = false;
            if (doubleColumnListView.f79068k) {
                doubleColumnListView.m81398t();
                doubleColumnListView.m81394m();
            }
        }

        public C36376b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            DoubleColumnListView.f79058s.m79403a("refreshData failed:error,errorCode:" + code + ",desc:" + desc);
            final DoubleColumnListView doubleColumnListView = DoubleColumnListView.this;
            doubleColumnListView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.g
                @Override // java.lang.Runnable
                public final void run() {
                    DoubleColumnListView.C36376b.m81401c(doubleColumnListView);
                }
            });
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        @SuppressLint({"NotifyDataSetChanged"})
        public void onSuccess() {
            DoubleColumnAdapter doubleColumnAdapter = DoubleColumnListView.this.f79062e;
            DoubleColumnAdapter doubleColumnAdapter2 = null;
            if (doubleColumnAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                doubleColumnAdapter = null;
            }
            doubleColumnAdapter.m81409k(LiveListStore.INSTANCE.shared().getLiveState().getLiveList().getValue());
            DoubleColumnAdapter doubleColumnAdapter3 = DoubleColumnListView.this.f79062e;
            if (doubleColumnAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                doubleColumnAdapter2 = doubleColumnAdapter3;
            }
            doubleColumnAdapter2.notifyDataSetChanged();
            DoubleColumnListView.this.f79059b.setRefreshing(false);
            final DoubleColumnListView doubleColumnListView = DoubleColumnListView.this;
            doubleColumnListView.post(new Runnable() { // from class: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.h
                @Override // java.lang.Runnable
                public final void run() {
                    DoubleColumnListView.C36376b.m81402d(doubleColumnListView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnListView$c */
    /* JADX INFO: compiled from: DoubleColumnListView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C36377c implements InterfaceC38182b, FunctionAdapter {
        public C36377c() {
        }

        @Override // he0.InterfaceC38182b
        /* JADX INFO: renamed from: a */
        public final void mo81403a(View p11, LiveInfo p12) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            DoubleColumnListView.this.m81395o(p11, p12);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC38182b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, DoubleColumnListView.this, DoubleColumnListView.class, "onLiveInfoViewClick", "onLiveInfoViewClick(Landroid/view/View;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnListView$onAttachedToWindow$1 */
    /* JADX INFO: compiled from: DoubleColumnListView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnListView$onAttachedToWindow$1", m90122f = "DoubleColumnListView.kt", m90123i = {}, m90124l = {120}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363781 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnListView$onAttachedToWindow$1$a */
        /* JADX INFO: compiled from: DoubleColumnListView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nDoubleColumnListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,292:1\n774#2:293\n865#2,2:294\n1869#2,2:296\n*S KotlinDebug\n*F\n+ 1 DoubleColumnListView.kt\ncom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnListView$onAttachedToWindow$1$1\n*L\n122#1:293\n122#1:294,2\n123#1:296,2\n*E\n"})
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DoubleColumnListView f79077b;

            public a(DoubleColumnListView doubleColumnListView) {
                this.f79077b = doubleColumnListView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                if (str.length() == 0) {
                    Set set = this.f79077b.f79066i;
                    ArrayList arrayList = new ArrayList();
                    for (T t11 : set) {
                        if (((DoubleColumnItemView) t11).getF79054h()) {
                            arrayList.add(t11);
                        }
                    }
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((DoubleColumnItemView) it.next()).m81376e();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C363781(Continuation<? super C363781> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DoubleColumnListView.this.new C363781(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363781) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                a aVar = new a(DoubleColumnListView.this);
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
    public DoubleColumnListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnListView$a */
    /* JADX INFO: compiled from: DoubleColumnListView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C36375a {
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
    public DoubleColumnListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: n */
    public static final void m81391n(DoubleColumnListView doubleColumnListView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = C36375a.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            doubleColumnListView.f79068k = true;
            doubleColumnListView.f79065h = null;
            if (doubleColumnListView.f79070m) {
                doubleColumnListView.m81396q();
                return;
            } else {
                doubleColumnListView.f79070m = true;
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        doubleColumnListView.f79068k = false;
        Set<DoubleColumnItemView> set = doubleColumnListView.f79066i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!Intrinsics.areEqual((DoubleColumnItemView) obj, doubleColumnListView.f79065h)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((DoubleColumnItemView) it.next()).m81377f();
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m81392p(DoubleColumnListView doubleColumnListView, String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        if (roomId.length() == 0) {
            Set<DoubleColumnItemView> set = doubleColumnListView.f79066i;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (((DoubleColumnItemView) obj).getF79054h()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DoubleColumnItemView) it.next()).m81376e();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m81393r(DoubleColumnListView doubleColumnListView) {
        if (doubleColumnListView.f79067j) {
            return;
        }
        doubleColumnListView.f79059b.setRefreshing(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m81394m() {
        RecyclerView.LayoutManager layoutManager = this.f79060c.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        IntRange intRange = new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(((IntIterator) it).nextInt());
            DoubleColumnItemView doubleColumnItemView = viewFindViewByPosition instanceof DoubleColumnItemView ? (DoubleColumnItemView) viewFindViewByPosition : null;
            if (doubleColumnItemView != null) {
                arrayList.add(doubleColumnItemView);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            DoubleColumnItemView doubleColumnItemView2 = (DoubleColumnItemView) obj;
            if (doubleColumnItemView2.getTop() >= 0 && doubleColumnItemView2.getBottom() <= this.f79060c.getHeight()) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        if (size == 1) {
            m81397s(SetsKt.setOf(arrayList2.get(0)));
        } else {
            if (2 > size || size > Integer.MAX_VALUE) {
                return;
            }
            m81397s(SetsKt.setOf((Object[]) new DoubleColumnItemView[]{arrayList2.get(0), arrayList2.get(1)}));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m81395o(View view, LiveInfo liveInfo) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnItemView");
        this.f79065h = (DoubleColumnItemView) view;
        InterfaceC38182b interfaceC38182b = this.f79064g;
        if (interfaceC38182b != null) {
            interfaceC38182b.mo81403a(view, liveInfo);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m81396q() {
        if (this.f79067j) {
            return;
        }
        if (System.currentTimeMillis() - this.f79069l < 1000) {
            removeCallbacks(this.f79074q);
            postDelayed(this.f79074q, 1000L);
        } else {
            this.f79069l = System.currentTimeMillis();
            this.f79067j = true;
            Intrinsics.throwUninitializedPropertyAccessException("liveInfoListStore");
            new C36376b();
            throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m81397s(Set<DoubleColumnItemView> set) {
        if (Intrinsics.areEqual(this.f79066i, set)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((DoubleColumnItemView) it.next()).m81376e();
            }
        } else {
            m81398t();
            for (DoubleColumnItemView doubleColumnItemView : set) {
                doubleColumnItemView.m81376e();
                this.f79066i.add(doubleColumnItemView);
            }
        }
    }

    public final void setOnItemClickListener(@NotNull InterfaceC38182b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f79064g = listener;
        DoubleColumnAdapter doubleColumnAdapter = this.f79062e;
        if (doubleColumnAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            doubleColumnAdapter = null;
        }
        doubleColumnAdapter.setOnItemClickListener(new C36377c());
    }

    /* JADX INFO: renamed from: t */
    public final void m81398t() {
        Iterator<T> it = this.f79066i.iterator();
        while (it.hasNext()) {
            ((DoubleColumnItemView) it.next()).m81377f();
        }
        this.f79066i.clear();
    }

    public /* synthetic */ DoubleColumnListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FragmentActivity fragmentActivity = this.f79063f;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentActivity");
            fragmentActivity = null;
        }
        fragmentActivity.getLifecycle().addObserver(this.f79073p);
        this.f79071n = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C363781(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FragmentActivity fragmentActivity = this.f79063f;
        if (fragmentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentActivity");
            fragmentActivity = null;
        }
        fragmentActivity.getLifecycle().removeObserver(this.f79073p);
        m81398t();
        InterfaceC41775x1 interfaceC41775x1 = this.f79071n;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DoubleColumnListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79066i = new LinkedHashSet();
        this.f79072o = new Function1() { // from class: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DoubleColumnListView.m81392p(this.f79090b, (String) obj);
            }
        };
        this.f79073p = new LifecycleEventObserver() { // from class: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                DoubleColumnListView.m81391n(this.f79091b, lifecycleOwner, event);
            }
        };
        LayoutInflater.from(context).inflate(R$layout.livelist_double_column_list_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.swipe_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f79059b = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.recycler_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79060c = (RecyclerView) viewFindViewById2;
        this.f79059b.setColorSchemeResources(R$color.common_design_standard_g5);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2, 1, false);
        this.f79061d = gridLayoutManager;
        this.f79060c.setLayoutManager(gridLayoutManager);
        this.f79060c.addItemDecoration(new DoubleColumnAdapter.b(context));
        this.f79059b.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.e
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                this.f79092b.m81396q();
            }
        });
        this.f79074q = new Runnable() { // from class: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.f
            @Override // java.lang.Runnable
            public final void run() {
                DoubleColumnListView.m81393r(this.f79093b);
            }
        };
    }
}
