package com.kubi.home.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$id;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.navigation.HomeNavigationPayDialogHelper;
import com.kubi.home.v2.container.p088ui.CustomGridLayoutManager;
import com.kubi.home.widgets.feed.HomeFeedActionLayout;
import com.kubi.home.widgets.feed.HomeFeedWrapperTabLayout;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p575qw.C43881b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeRecyclerView.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\b\t*\u0001_\u0018\u0000 f2\u00020\u0001:\u0001fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\rJ\u0010\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u000bJ\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\u0012\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020\"J\u0006\u00101\u001a\u00020\"J\b\u00102\u001a\u00020\rH\u0002J\u0010\u00108\u001a\u00020\r2\u0006\u00109\u001a\u000207H\u0016J\u0017\u0010?\u001a\u0004\u0018\u00010\r2\u0006\u00109\u001a\u000207H\u0002¢\u0006\u0002\u0010@J\u0010\u0010C\u001a\u00020\r2\u0006\u00109\u001a\u000207H\u0017J\u0010\u0010D\u001a\u00020\r2\u0006\u00109\u001a\u000207H\u0002J\u0012\u0010E\u001a\u00020\"2\b\u00109\u001a\u0004\u0018\u000107H\u0002J\u000f\u0010F\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020\rH\u0002J\u0012\u0010I\u001a\u00020\"2\b\b\u0002\u0010J\u001a\u00020\rH\u0002J\u0010\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020\rH\u0002J\u0010\u0010R\u001a\u00020\"2\u0006\u0010L\u001a\u00020\rH\u0002J\u0010\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020\u0007H\u0002J\b\u0010U\u001a\u00020\"H\u0002J\b\u0010V\u001a\u00020\u0007H\u0002J\b\u0010W\u001a\u00020\u0007H\u0002J\b\u0010X\u001a\u00020\"H\u0002J\u001c\u0010Y\u001a\u00020\"2\b\b\u0002\u0010Z\u001a\u00020\u00072\b\b\u0002\u0010[\u001a\u00020\rH\u0002J\b\u0010]\u001a\u00020\"H\u0002J\u000f\u0010c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010GJ\b\u0010d\u001a\u00020\"H\u0002J\b\u0010e\u001a\u00020\"H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010:\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u000e\u0010A\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010M\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bO\u0010PR\u000e\u0010\\\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010^\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010>\u001a\u0004\b`\u0010a¨\u0006g"}, m90084d2 = {"Lcom/kubi/home/widgets/HomeRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homeFeed", "Landroid/view/View;", "flutterCanScrollDown", "", "homeRootView", "homeNavigationContainer", "refreshLayout", "refreshLayoutContainer", "fakeFlutterTab", "Lcom/kubi/home/widgets/feed/HomeFeedWrapperTabLayout;", "homeLiveIconLayout", "Lcom/kubi/home/widgets/feed/HomeFeedActionLayout;", "tabAnim", "Landroid/animation/ValueAnimator;", "isTabShow", "isEditMode", "isNoFeed", "isNoCalendar", "calendarView", "curListCards", "", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "feedCardIndex", "setCardsData", "", "cards", "", "updateDragMode", "dragMode", "configHomeRootView", "rootView", "onListScrolled", "scrollFeedToTop", "updateListHeight", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateFlutterState", "state", "", "onHomeFeedContentCreated", "onFakeTabReClick", "onIgnoreFeed", "lastY", "", "lastX", "fakeDownEvent", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "e", "touchSlop", "getTouchSlop", "()I", "touchSlop$delegate", "Lkotlin/Lazy;", "onFlutterIntercept", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "beforeX", "beforeY", "onTouchEvent", "flutterDispatchTouchEvent", "dispatchCancelOrUpToFlutter", "getFeedOffsetTop", "()Ljava/lang/Integer;", "isCalendarFullVisible", "tryStartTabAnim", "isClick", "preRunTabTopAnim", TIMPushProvider.f75062n, "animInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "getAnimInterpolator", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "animInterpolator$delegate", "runTabTopAnim", "configContentScrollY", "y", "updateFlutterFakeTabVisible", "getNavContainerHeight", "getFeedTabHeight", "notifyFeedVisibleHeight", "realNotifyFeedVisibleHeight", "height", "inTop", "feedInTop", "updateHomeTabState", "feedHandler", "com/kubi/home/widgets/HomeRecyclerView$feedHandler$2$1", "getFeedHandler", "()Lcom/kubi/home/widgets/HomeRecyclerView$feedHandler$2$1;", "feedHandler$delegate", "getEditScrollLimitY", "tryToUpdateEditLimitY", "notifyCalendarVisibleChange", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRecyclerView.kt\ncom/kubi/home/widgets/HomeRecyclerView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n360#2,7:647\n360#2,7:654\n*S KotlinDebug\n*F\n+ 1 HomeRecyclerView.kt\ncom/kubi/home/widgets/HomeRecyclerView\n*L\n101#1:647,7\n108#1:654,7\n*E\n"})
public final class HomeRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final Companion f26643A = new Companion(null);

    /* JADX INFO: renamed from: B */
    public static int f26644B;

    /* JADX INFO: renamed from: b */
    @Nullable
    public View f26645b;

    /* JADX INFO: renamed from: c */
    public boolean f26646c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public View f26647d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public View f26648e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public View f26649f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public View f26650g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public HomeFeedWrapperTabLayout f26651h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public HomeFeedActionLayout f26652i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ValueAnimator f26653j;

    /* JADX INFO: renamed from: k */
    public boolean f26654k;

    /* JADX INFO: renamed from: l */
    public boolean f26655l;

    /* JADX INFO: renamed from: m */
    public boolean f26656m;

    /* JADX INFO: renamed from: n */
    public boolean f26657n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public View f26658o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public List<BaseCardDataV2> f26659p;

    /* JADX INFO: renamed from: q */
    public int f26660q;

    /* JADX INFO: renamed from: r */
    public float f26661r;

    /* JADX INFO: renamed from: s */
    public float f26662s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public MotionEvent f26663t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final Lazy f26664u;

    /* JADX INFO: renamed from: v */
    public float f26665v;

    /* JADX INFO: renamed from: w */
    public float f26666w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f26667x;

    /* JADX INFO: renamed from: y */
    public boolean f26668y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public final Lazy f26669z;

    /* JADX INFO: compiled from: HomeRecyclerView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/home/widgets/HomeRecyclerView$Companion;", "", "<init>", "()V", "TAG", "", "STATE_TO_TOP", "STATE_LEAVE_TOP", "STATE_TO_BOTTOM", "STATE_LEAVE_BOTTOM", "ANIM_SHOW_DURATION", "", "ANIM_HIDE_DURATION", "feedCardVisibleHeight", "", "getFeedCardVisibleHeight", "()I", "setFeedCardVisibleHeight", "(I)V", "DELAY_ANIM_MSG", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getFeedCardVisibleHeight() {
            return HomeRecyclerView.f26644B;
        }

        public final void setFeedCardVisibleHeight(int i11) {
            HomeRecyclerView.f26644B = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.widgets.HomeRecyclerView$a */
    /* JADX INFO: compiled from: HomeRecyclerView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/home/widgets/HomeRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "onScrollStateChanged", "newState", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15071a extends RecyclerView.OnScrollListener {
        public C15071a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                if (!HomeRecyclerView.this.m31050G()) {
                    HomeRecyclerView.this.m31046C();
                }
                HomeRecyclerView.this.m31045B();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx2, dy2);
            HomeRecyclerView.this.m31051H();
            HomeRecyclerView.this.m31057R();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.widgets.HomeRecyclerView$b */
    /* JADX INFO: compiled from: HomeRecyclerView.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/home/widgets/HomeRecyclerView$feedHandler$2$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class HandlerC15072b extends Handler {
        public HandlerC15072b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 539300101) {
                HomeRecyclerView.m31021Q(HomeRecyclerView.this, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.widgets.HomeRecyclerView$c */
    /* JADX INFO: compiled from: HomeRecyclerView.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/home/widgets/HomeRecyclerView$runTabTopAnim$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15073c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f26672a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeRecyclerView f26673b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f26674c;

        public C15073c(boolean z11, HomeRecyclerView homeRecyclerView, View view) {
            this.f26672a = z11;
            this.f26673b = homeRecyclerView;
            this.f26674c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.f26672a) {
                this.f26673b.m31063t(0);
                HomeRecyclerView.m31018K(this.f26673b, 0, true, 1, null);
            } else {
                this.f26673b.m31063t(this.f26674c.getHeight());
                Integer feedOffsetTop = this.f26673b.getFeedOffsetTop();
                if (feedOffsetTop != null) {
                    this.f26673b.scrollBy(0, feedOffsetTop.intValue());
                }
            }
            this.f26673b.f26653j = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m31018K(HomeRecyclerView homeRecyclerView, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        homeRecyclerView.m31053J(i11, z11);
    }

    /* JADX INFO: renamed from: M */
    public static final void m31019M(HomeRecyclerView homeRecyclerView, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        if (num != null) {
            homeRecyclerView.m31063t(num.intValue());
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m31021Q(HomeRecyclerView homeRecyclerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        homeRecyclerView.m31056P(z11);
    }

    private final AccelerateDecelerateInterpolator getAnimInterpolator() {
        return (AccelerateDecelerateInterpolator) this.f26667x.getValue();
    }

    private final HandlerC15072b getFeedHandler() {
        return (HandlerC15072b) this.f26669z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getFeedOffsetTop() {
        if (this.f26656m) {
            return null;
        }
        if (this.f26645b == null) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return null;
            }
            RecyclerView.Adapter adapter = getAdapter();
            for (int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1; itemCount >= 0; itemCount--) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(itemCount);
                if ((viewFindViewByPosition != null ? viewFindViewByPosition.findViewById(R$id.quote_home_feed_card) : null) != null) {
                    this.f26645b = viewFindViewByPosition;
                    break;
                }
            }
        }
        View view = this.f26645b;
        if (view == null) {
            return null;
        }
        return Integer.valueOf(view.getTop() - getPaddingTop());
    }

    private final int getFeedTabHeight() {
        View viewFindViewById;
        View view = this.f26645b;
        int height = (view == null || (viewFindViewById = view.findViewById(R$id.feed_card_tab_layout)) == null) ? 0 : viewFindViewById.getHeight();
        return height == 0 ? C43881b.m96650a(40) : height;
    }

    private final int getNavContainerHeight() {
        View view = this.f26648e;
        int height = view != null ? view.getHeight() : 0;
        return height == 0 ? C43881b.m96650a(44) : height;
    }

    private final int getTouchSlop() {
        return ((Number) this.f26664u.getValue()).intValue();
    }

    /* JADX INFO: renamed from: s */
    public static final AccelerateDecelerateInterpolator m31040s() {
        return new AccelerateDecelerateInterpolator();
    }

    /* JADX INFO: renamed from: v */
    public static final void m31041v(final HomeRecyclerView homeRecyclerView, View view) {
        if (homeRecyclerView.f26645b != null) {
            homeRecyclerView.m31055N();
            return;
        }
        homeRecyclerView.getFeedOffsetTop();
        homeRecyclerView.m31062W(homeRecyclerView.f26649f);
        homeRecyclerView.m31062W(homeRecyclerView.f26645b);
        homeRecyclerView.post(new Runnable() { // from class: com.kubi.home.widgets.h
            @Override // java.lang.Runnable
            public final void run() {
                HomeRecyclerView.m31042w(this.f26772b);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final boolean m31044A() {
        HomeFeedWrapperTabLayout homeFeedWrapperTabLayout;
        if (this.f26657n) {
            return false;
        }
        if (this.f26658o == null) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return false;
            }
            RecyclerView.Adapter adapter = getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            for (int i11 = 0; i11 < itemCount; i11++) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i11);
                if ((viewFindViewByPosition != null ? viewFindViewByPosition.findViewById(R$id.quote_home_calendar_root_layout) : null) != null) {
                    this.f26658o = viewFindViewByPosition;
                    break;
                }
            }
        }
        View view = this.f26658o;
        if (view == null) {
            return false;
        }
        HomeFeedWrapperTabLayout homeFeedWrapperTabLayout2 = this.f26651h;
        return view.getTop() + view.getHeight() <= ((getHeight() - getPaddingTop()) - getNavContainerHeight()) - ((homeFeedWrapperTabLayout2 == null || !ViewExtKt.m66581l(homeFeedWrapperTabLayout2) || (homeFeedWrapperTabLayout = this.f26651h) == null) ? 0 : homeFeedWrapperTabLayout.getHeight());
    }

    /* JADX INFO: renamed from: B */
    public final void m31045B() {
        if (this.f26657n) {
            return;
        }
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_calendar_visible_change", Boolean.valueOf(m31044A()), 0L, 4, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m31049F() {
        m31062W(this.f26645b);
        m31059T();
        m31046C();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m31050G() {
        return this.f26655l || this.f26656m;
    }

    /* JADX INFO: renamed from: I */
    public final void m31052I(boolean z11) {
        ValueAnimator valueAnimator;
        if (this.f26654k == z11) {
            return;
        }
        ValueAnimator valueAnimator2 = this.f26653j;
        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && ((valueAnimator = this.f26653j) == null || !valueAnimator.isStarted())) {
            this.f26654k = z11;
            m31054L(z11);
        } else {
            if (getFeedHandler().hasMessages(539300101)) {
                getFeedHandler().removeMessages(539300101);
            }
            getFeedHandler().sendEmptyMessageDelayed(539300101, 1000L);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m31053J(int i11, boolean z11) {
        if (z11) {
            i11 = -1;
        }
        f26644B = i11;
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_visible_height_change", Integer.valueOf(i11), 0L, 4, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m31054L(boolean z11) {
        ValueAnimator duration;
        View view = this.f26648e;
        if (view == null || this.f26650g == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = z11 ? ValueAnimator.ofInt(view.getHeight(), 0) : ValueAnimator.ofInt(0, view.getHeight());
        this.f26653j = valueAnimatorOfInt;
        long j11 = z11 ? 300L : 200L;
        if (valueAnimatorOfInt == null || (duration = valueAnimatorOfInt.setDuration(j11)) == null) {
            return;
        }
        duration.setInterpolator(getAnimInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.home.widgets.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HomeRecyclerView.m31019M(this.f26716b, valueAnimator);
            }
        });
        duration.addListener(new C15073c(z11, this, view));
        duration.start();
    }

    /* JADX INFO: renamed from: S */
    public final void m31058S(boolean z11) {
        this.f26655l = z11;
        m31059T();
        m31046C();
        m31057R();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: U */
    public final void m31060U(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (state.hashCode()) {
            case -1940093293:
                if (!state.equals("ScrollToBottom")) {
                    return;
                }
                break;
            case -571970067:
                if (state.equals("ScrollToTop")) {
                    this.f26646c = false;
                    return;
                }
                return;
            case 770924181:
                if (!state.equals("ScrollLeaveBottom")) {
                    return;
                }
                break;
            case 1905681707:
                if (!state.equals("ScrollLeaveTop")) {
                    return;
                }
                break;
            default:
                return;
        }
        this.f26646c = true;
    }

    /* JADX INFO: renamed from: W */
    public final void m31062W(View view) {
        int height;
        ViewGroup.LayoutParams layoutParams;
        View view2 = this.f26650g;
        if (view2 == null || (height = view2.getHeight()) <= 0) {
            return;
        }
        if (Intrinsics.areEqual(view, this.f26645b)) {
            getFeedOffsetTop();
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_update_feed_height", Integer.valueOf(height), 0L, 4, null);
        }
        if ((view != null && height == view.getHeight()) || view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = height;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (m31050G()) {
            return super.onInterceptTouchEvent(e11);
        }
        int action = e11.getAction();
        Boolean boolM31048E = null;
        if (action == 0) {
            this.f26662s = e11.getX();
            this.f26661r = e11.getY();
            MotionEvent motionEvent = this.f26663t;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            this.f26663t = null;
            m31062W(this.f26649f);
            m31062W(this.f26645b);
        } else if (action == 2) {
            boolM31048E = m31048E(e11);
            this.f26665v = e11.getX();
            this.f26666w = e11.getY();
        }
        return boolM31048E != null ? boolM31048E.booleanValue() : super.onInterceptTouchEvent(e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (m31050G()) {
            return super.onTouchEvent(e11);
        }
        int action = e11.getAction();
        Boolean boolValueOf = null;
        if (action == 0) {
            this.f26661r = e11.getY();
            this.f26665v = e11.getX();
            this.f26666w = e11.getY();
        } else if (action == 1 || action == 2 || action == 3) {
            boolValueOf = m31066z(e11) ? Boolean.TRUE : null;
            this.f26665v = e11.getX();
            this.f26666w = e11.getY();
        }
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(super.onTouchEvent(e11));
        }
        return boolValueOf.booleanValue();
    }

    public final void setCardsData(@NotNull List<BaseCardDataV2> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f26659p = cards;
        Iterator<BaseCardDataV2> it = cards.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getCode(), HomeWidgetCode.HomeFeed.getCode())) {
                break;
            } else {
                i11++;
            }
        }
        this.f26660q = i11;
        this.f26645b = null;
        this.f26656m = i11 == -1;
        Iterator<BaseCardDataV2> it2 = this.f26659p.iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (Intrinsics.areEqual(it2.next().getCode(), HomeWidgetCode.Calendar.getCode())) {
                break;
            } else {
                i12++;
            }
        }
        this.f26657n = i12 == -1;
        if (this.f26656m) {
            m31063t(0);
        } else {
            post(new Runnable() { // from class: com.kubi.home.widgets.a
                @Override // java.lang.Runnable
                public final void run() {
                    HomeRecyclerView.setCardsData$lambda$2(this.f26677b);
                }
            });
        }
        post(new Runnable() { // from class: com.kubi.home.widgets.b
            @Override // java.lang.Runnable
            public final void run() {
                HomeRecyclerView.setCardsData$lambda$3(this.f26678b);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m31063t(int i11) {
        View view = this.f26648e;
        if (view != null) {
            view.setScrollY(i11);
        }
        View view2 = this.f26650g;
        if (view2 != null) {
            view2.setScrollY(i11);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m31064u(@Nullable View view) {
        this.f26647d = view;
        this.f26648e = view != null ? view.findViewById(R$id.homeNavigationContainer) : null;
        View view2 = this.f26647d;
        this.f26649f = view2 != null ? view2.findViewById(R$id.refreshLayout) : null;
        View view3 = this.f26647d;
        this.f26650g = view3 != null ? view3.findViewById(R$id.refreshLayoutContainer) : null;
        View view4 = this.f26647d;
        this.f26651h = view4 != null ? (HomeFeedWrapperTabLayout) view4.findViewById(R$id.fake_flutter_tab) : null;
        View view5 = this.f26647d;
        this.f26652i = view5 != null ? (HomeFeedActionLayout) view5.findViewById(R$id.home_feed_action_layout) : null;
        HomeFeedWrapperTabLayout homeFeedWrapperTabLayout = this.f26651h;
        if (homeFeedWrapperTabLayout != null) {
            homeFeedWrapperTabLayout.configJumpTopClick(new View.OnClickListener() { // from class: com.kubi.home.widgets.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    HomeRecyclerView.m31041v(this.f26743b, view6);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m31065x(MotionEvent motionEvent) {
        View view;
        if (this.f26663t != null) {
            if (motionEvent != null && (view = this.f26645b) != null) {
                view.dispatchTouchEvent(motionEvent);
            }
            MotionEvent motionEvent2 = this.f26663t;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f26663t = null;
        }
    }

    public /* synthetic */ HomeRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: O */
    public static final int m31020O(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final Integer getEditScrollLimitY() {
        Integer feedOffsetTop;
        int height = (getHeight() * 3) / 4;
        if (this.f26655l && !this.f26656m && (feedOffsetTop = getFeedOffsetTop()) != null) {
            int iIntValue = feedOffsetTop.intValue() - height;
            if (iIntValue < 0) {
                scrollBy(0, iIntValue);
                return 0;
            }
            return Integer.valueOf(iIntValue);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCardsData$lambda$2(HomeRecyclerView homeRecyclerView) {
        homeRecyclerView.getFeedOffsetTop();
        homeRecyclerView.m31062W(homeRecyclerView.f26645b);
        homeRecyclerView.m31062W(homeRecyclerView.f26649f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCardsData$lambda$3(HomeRecyclerView homeRecyclerView) {
        homeRecyclerView.m31059T();
        homeRecyclerView.m31046C();
        homeRecyclerView.m31045B();
    }

    /* JADX INFO: renamed from: w */
    public static final void m31042w(HomeRecyclerView homeRecyclerView) {
        homeRecyclerView.m31055N();
    }

    /* JADX INFO: renamed from: y */
    public static final HandlerC15072b m31043y(HomeRecyclerView homeRecyclerView) {
        return homeRecyclerView.new HandlerC15072b(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: C */
    public final void m31046C() {
        Integer feedOffsetTop;
        HomeFeedWrapperTabLayout homeFeedWrapperTabLayout;
        if (!m31050G() && (feedOffsetTop = getFeedOffsetTop()) != null && (homeFeedWrapperTabLayout = this.f26651h) != null) {
            int navContainerHeight = getNavContainerHeight();
            if (feedOffsetTop.intValue() < (getHeight() - navContainerHeight) - homeFeedWrapperTabLayout.getHeight()) {
                if (feedOffsetTop.intValue() == 0) {
                    m31018K(this, 0, true, 1, null);
                    return;
                } else {
                    m31018K(this, (getHeight() - feedOffsetTop.intValue()) - navContainerHeight, false, 2, null);
                    return;
                }
            }
            m31018K(this, 0, false, 2, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m31047D() {
        m31055N();
    }

    /* JADX INFO: renamed from: E */
    public final Boolean m31048E(MotionEvent motionEvent) {
        boolean z11;
        Boolean bool = null;
        if (m31050G()) {
            return null;
        }
        float x11 = motionEvent.getX() - this.f26662s;
        float y11 = motionEvent.getY() - this.f26661r;
        boolean z12 = false;
        if (y11 < 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y11 > 0.0f) {
            z12 = true;
        }
        Integer feedOffsetTop = getFeedOffsetTop();
        if (feedOffsetTop != null) {
            if (z11 && feedOffsetTop.intValue() + y11 <= 0.0f) {
                bool = Boolean.FALSE;
            }
            if (z12 && this.f26646c) {
                bool = Boolean.FALSE;
            }
            if (this.f26662s > feedOffsetTop.intValue() && y11 * 2 < x11 && x11 > getTouchSlop()) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX INFO: renamed from: H */
    public final void m31051H() {
        if (m31050G()) {
            return;
        }
        m31021Q(this, false, 1, null);
        m31059T();
        m31061V();
    }

    /* JADX INFO: renamed from: N */
    public final void m31055N() {
        if (m31050G()) {
            return;
        }
        Integer feedOffsetTop = getFeedOffsetTop();
        if (feedOffsetTop == null) {
            smoothScrollToPosition(this.f26660q);
        } else {
            smoothScrollBy(0, feedOffsetTop.intValue(), null, 200);
            m31056P(true);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m31056P(boolean z11) {
        Integer feedOffsetTop;
        if (!m31050G() && (feedOffsetTop = getFeedOffsetTop()) != null) {
            int iIntValue = feedOffsetTop.intValue();
            if (z11) {
                m31052I(false);
                return;
            }
            int navContainerHeight = getNavContainerHeight();
            if (iIntValue <= 0) {
                if (iIntValue < 0) {
                    scrollBy(0, iIntValue);
                }
                m31052I(false);
            } else if (iIntValue > navContainerHeight) {
                m31052I(true);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m31057R() {
        CustomGridLayoutManager customGridLayoutManager;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof CustomGridLayoutManager) {
            customGridLayoutManager = (CustomGridLayoutManager) layoutManager;
        } else {
            customGridLayoutManager = null;
        }
        if (customGridLayoutManager != null) {
            boolean z11 = this.f26655l;
            if (z11 && !this.f26656m) {
                if (customGridLayoutManager.m30820c()) {
                    customGridLayoutManager.m30821d(this.f26655l, getEditScrollLimitY());
                    return;
                }
                return;
            }
            CustomGridLayoutManager.m30819e(customGridLayoutManager, z11, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m31059T() {
        boolean z11;
        boolean z12 = false;
        if (m31050G()) {
            HomeFeedWrapperTabLayout homeFeedWrapperTabLayout = this.f26651h;
            if (homeFeedWrapperTabLayout != null) {
                homeFeedWrapperTabLayout.m31165f(false);
            }
            HomeFeedActionLayout homeFeedActionLayout = this.f26652i;
            if (homeFeedActionLayout != null) {
                homeFeedActionLayout.m31139p(false);
                return;
            }
            return;
        }
        Integer feedOffsetTop = getFeedOffsetTop();
        if (feedOffsetTop != null) {
            HomeFeedWrapperTabLayout homeFeedWrapperTabLayout2 = this.f26651h;
            if (homeFeedWrapperTabLayout2 != null) {
                if (feedOffsetTop.intValue() > (getHeight() - getNavContainerHeight()) - homeFeedWrapperTabLayout2.getHeight()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                homeFeedWrapperTabLayout2.m31165f(z11);
            }
            HomeFeedActionLayout homeFeedActionLayout2 = this.f26652i;
            if (homeFeedActionLayout2 != null) {
                int navContainerHeight = getNavContainerHeight();
                int feedTabHeight = getFeedTabHeight();
                int height = homeFeedActionLayout2.getHeight();
                if (height == 0) {
                    height = C43881b.m96650a(122);
                }
                if (feedOffsetTop.intValue() < ((getHeight() - navContainerHeight) - feedTabHeight) - height) {
                    z12 = true;
                }
                homeFeedActionLayout2.m31139p(z12);
                return;
            }
            return;
        }
        HomeFeedWrapperTabLayout homeFeedWrapperTabLayout3 = this.f26651h;
        if (homeFeedWrapperTabLayout3 != null) {
            homeFeedWrapperTabLayout3.m31165f(true);
        }
        HomeFeedActionLayout homeFeedActionLayout3 = this.f26652i;
        if (homeFeedActionLayout3 != null) {
            homeFeedActionLayout3.m31139p(false);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m31061V() {
        Integer feedOffsetTop;
        boolean z11;
        if (!m31050G() && (feedOffsetTop = getFeedOffsetTop()) != null) {
            if (feedOffsetTop.intValue() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f26668y != z11) {
                this.f26668y = z11;
                C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_on_top", Boolean.valueOf(z11), 0L, 4, null);
                if (this.f26668y) {
                    m31018K(this, 0, true, 1, null);
                    HomeNavigationPayDialogHelper.f25899a.m29698c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m31066z(MotionEvent motionEvent) {
        Integer feedOffsetTop;
        boolean z11;
        boolean z12;
        if (!m31050G() && (feedOffsetTop = getFeedOffsetTop()) != null) {
            int iIntValue = feedOffsetTop.intValue();
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    float y11 = motionEvent.getY() - this.f26666w;
                    if (y11 <= 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (y11 > 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        float f11 = iIntValue + y11;
                        if (f11 <= 0.0f) {
                            scrollBy(0, -((int) f11));
                            if (this.f26663t == null) {
                                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(0);
                                this.f26663t = motionEventObtain;
                                View view = this.f26645b;
                                if (view != null) {
                                    view.dispatchTouchEvent(motionEventObtain);
                                }
                            }
                            View view2 = this.f26645b;
                            if (view2 == null || !view2.dispatchTouchEvent(motionEvent)) {
                                return false;
                            }
                            return true;
                        }
                    }
                    if (z12 && this.f26646c) {
                        View view3 = this.f26645b;
                        if (view3 == null || !view3.dispatchTouchEvent(motionEvent)) {
                            return false;
                        }
                        return true;
                    }
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    this.f26663t = motionEventObtain2;
                    m31065x(motionEventObtain2);
                    return false;
                }
            }
            m31065x(motionEvent);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeRecyclerView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26654k = true;
        this.f26656m = true;
        this.f26657n = true;
        addOnScrollListener(new C15071a());
        this.f26659p = CollectionsKt.emptyList();
        this.f26660q = -1;
        this.f26664u = LazyKt.lazy(new Function0() { // from class: com.kubi.home.widgets.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(HomeRecyclerView.m31020O(context));
            }
        });
        this.f26667x = LazyKt.lazy(new Function0() { // from class: com.kubi.home.widgets.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeRecyclerView.m31040s();
            }
        });
        this.f26669z = LazyKt.lazy(new Function0() { // from class: com.kubi.home.widgets.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeRecyclerView.m31043y(this.f26715b);
            }
        });
    }
}
