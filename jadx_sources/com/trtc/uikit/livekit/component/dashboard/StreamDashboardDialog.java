package com.trtc.uikit.livekit.component.dashboard;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.dashboard.view.CircleIndicator;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.live.AVStatistics;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import java.util.ArrayList;
import java.util.Arrays;
import kd0.C41009a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import uc0.C45152a;

/* JADX INFO: compiled from: StreamDashboardDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001 \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020#H\u0014J\b\u0010(\u001a\u00020#H\u0014J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0004J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020#H\u0002J \u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0017H\u0003J\b\u00102\u001a\u00020#H\u0002J\b\u00103\u001a\u00020#H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u00064"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "roomId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "mPagerSnapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "mRecyclerMediaInfo", "Landroidx/recyclerview/widget/RecyclerView;", "mCircleIndicator", "Lcom/trtc/uikit/livekit/component/dashboard/view/CircleIndicator;", "mTextUpLoss", "Landroid/widget/TextView;", "mTextDownLoss", "mTextRtt", "mAdapter", "Lcom/trtc/uikit/livekit/component/dashboard/view/StreamInfoAdapter;", "mColorGreen", "", "mColorPink", "mVideoStatusList", "Ljava/util/ArrayList;", "Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;", "Lkotlin/collections/ArrayList;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "liveListListener", "com/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog$liveListListener$1", "Lcom/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog$liveListListener$1;", "initView", "", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onStart", "onStop", "setDialogMaxHeight", InterfaceC33953u5.f72199F, "Landroid/view/Window;", "initMediaInfoRecyclerView", "updateCircleIndicator", "updateNetworkStatistics", "rtt", "upLoss", "downLoss", "addObserver", "removeObserver", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStreamDashboardDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamDashboardDialog.kt\ncom/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
public final class StreamDashboardDialog extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final String f77707m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final PagerSnapHelper f77708n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f77709o;

    /* JADX INFO: renamed from: p */
    public CircleIndicator f77710p;

    /* JADX INFO: renamed from: q */
    public TextView f77711q;

    /* JADX INFO: renamed from: r */
    public TextView f77712r;

    /* JADX INFO: renamed from: s */
    public TextView f77713s;

    /* JADX INFO: renamed from: t */
    public C41009a f77714t;

    /* JADX INFO: renamed from: u */
    public int f77715u;

    /* JADX INFO: renamed from: v */
    public int f77716v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final ArrayList<AVStatistics> f77717w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public InterfaceC41775x1 f77718x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final C35908b f77719y;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$a */
    /* JADX INFO: compiled from: StreamDashboardDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog$initMediaInfoRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35905a extends RecyclerView.OnScrollListener {
        public C35905a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState == 0) {
                StreamDashboardDialog.this.m79612M();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$b */
    /* JADX INFO: compiled from: StreamDashboardDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/dashboard/StreamDashboardDialog$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35908b extends LiveListListener {
        public C35908b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            StreamDashboardDialog.this.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamDashboardDialog(@NotNull Context context, @NotNull String roomId) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        this.f77707m = roomId;
        this.f77708n = new PagerSnapHelper();
        this.f77717w = new ArrayList<>();
        this.f77719y = new C35908b();
        m79607J();
    }

    /* JADX INFO: renamed from: G */
    private final void m79606G(View view) {
        View viewFindViewById = view.findViewById(R$id.tv_rtt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77713s = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.tv_downLoss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77712r = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.tv_upLoss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f77711q = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.rv_media_info);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f77709o = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.ci_pager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f77710p = (CircleIndicator) viewFindViewById5;
        this.f77715u = getContext().getResources().getColor(R$color.common_text_color_normal);
        this.f77716v = getContext().getResources().getColor(R$color.common_not_standard_pink_f9);
    }

    /* JADX INFO: renamed from: K */
    private final void m79608K() {
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f77719y);
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getF77707m() {
        return this.f77707m;
    }

    /* JADX INFO: renamed from: I */
    public final void m79610I() {
        CircleIndicator circleIndicator = this.f77710p;
        RecyclerView recyclerView = null;
        if (circleIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCircleIndicator");
            circleIndicator = null;
        }
        circleIndicator.setCircleRadius(C45152a.m99799a(3.0f));
        PagerSnapHelper pagerSnapHelper = this.f77708n;
        RecyclerView recyclerView2 = this.f77709o;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerMediaInfo");
            recyclerView2 = null;
        }
        pagerSnapHelper.attachToRecyclerView(recyclerView2);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f77714t = new C41009a(context, this.f77717w);
        RecyclerView recyclerView3 = this.f77709o;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerMediaInfo");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView4 = this.f77709o;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerMediaInfo");
            recyclerView4 = null;
        }
        C41009a c41009a = this.f77714t;
        if (c41009a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c41009a = null;
        }
        recyclerView4.setAdapter(c41009a);
        RecyclerView recyclerView5 = this.f77709o;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerMediaInfo");
        } else {
            recyclerView = recyclerView5;
        }
        recyclerView.addOnScrollListener(new C35905a());
    }

    /* JADX INFO: renamed from: L */
    public final void m79611L(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        Configuration configuration = getContext().getResources().getConfiguration();
        window.setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i11 = (int) (((double) getContext().getResources().getDisplayMetrics().heightPixels) * 0.75d);
        if (configuration.orientation == 2) {
            attributes.gravity = GravityCompat.END;
            attributes.width = getContext().getResources().getDisplayMetrics().widthPixels / 2;
        } else {
            attributes.gravity = 80;
            attributes.width = -1;
        }
        attributes.height = i11;
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: M */
    public final void m79612M() {
        C41009a c41009a = this.f77714t;
        CircleIndicator circleIndicator = null;
        if (c41009a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c41009a = null;
        }
        int itemCount = c41009a.getItemCount();
        CircleIndicator circleIndicator2 = this.f77710p;
        if (circleIndicator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCircleIndicator");
            circleIndicator2 = null;
        }
        circleIndicator2.setVisibility(itemCount > 1 ? 0 : 8);
        CircleIndicator circleIndicator3 = this.f77710p;
        if (circleIndicator3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCircleIndicator");
            circleIndicator3 = null;
        }
        circleIndicator3.setCircleCount(itemCount);
        PagerSnapHelper pagerSnapHelper = this.f77708n;
        RecyclerView recyclerView = this.f77709o;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerMediaInfo");
            recyclerView = null;
        }
        View viewFindSnapView = pagerSnapHelper.findSnapView(recyclerView.getLayoutManager());
        if (viewFindSnapView != null) {
            RecyclerView recyclerView2 = this.f77709o;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerMediaInfo");
                recyclerView2 = null;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
            int position = layoutManager != null ? layoutManager.getPosition(viewFindSnapView) : 0;
            CircleIndicator circleIndicator4 = this.f77710p;
            if (circleIndicator4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCircleIndicator");
            } else {
                circleIndicator = circleIndicator4;
            }
            circleIndicator.setSelected(position);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: N */
    public final void m79613N(int i11, int i12, int i13) {
        TextView textView = this.f77713s;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextRtt");
            textView = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%dms", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        TextView textView3 = this.f77713s;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextRtt");
            textView3 = null;
        }
        textView3.setTextColor(i11 > 100 ? this.f77716v : this.f77715u);
        TextView textView4 = this.f77712r;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextDownLoss");
            textView4 = null;
        }
        String str2 = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView4.setText(str2);
        TextView textView5 = this.f77712r;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextDownLoss");
            textView5 = null;
        }
        textView5.setTextColor(i13 > 10 ? this.f77716v : this.f77715u);
        TextView textView6 = this.f77711q;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextUpLoss");
            textView6 = null;
        }
        String str3 = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        textView6.setText(str3);
        TextView textView7 = this.f77711q;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextUpLoss");
        } else {
            textView2 = textView7;
        }
        textView2.setTextColor(i12 > 10 ? this.f77716v : this.f77715u);
    }

    /* JADX INFO: renamed from: F */
    private final void m79605F() {
        this.f77718x = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new StreamDashboardDialog$addObserver$1(this, null), 3, null);
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f77719y);
    }

    /* JADX INFO: renamed from: J */
    private final void m79607J() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.livekit_stream_dashboard, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m79606G(viewInflate);
        m79610I();
        m79613N(0, 0, 0);
        m88181q(viewInflate);
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStart() {
        super.onStart();
        m79605F();
        Window window = getWindow();
        if (window != null) {
            m79611L(window);
        }
    }

    @Override // io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover, android.app.Dialog
    public void onStop() {
        super.onStop();
        m79608K();
    }
}
