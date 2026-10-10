package com.trtc.uikit.livekit.component.audiencelist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.common.p179ui.BasicView;
import com.trtc.uikit.livekit.component.audiencelist.view.AudienceListPopupDialog;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceState;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;
import vc0.C45496e;
import xc0.C46136a;

/* JADX INFO: compiled from: AudienceListView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u001d\b\u0007\u0018\u00002\u00020\u0001:\u0001:B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u0019J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020 H\u0014J\b\u0010)\u001a\u00020 H\u0014J\b\u0010*\u001a\u00020 H\u0014J\b\u0010+\u001a\u00020 H\u0002J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0003J\b\u0010.\u001a\u00020 H\u0002J\u0016\u0010/\u001a\u00020 2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\b\u00103\u001a\u00020 H\u0002J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u0007H\u0003J\u0010\u00106\u001a\u0002072\u0006\u00105\u001a\u00020\u0007H\u0002J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u000207H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006;"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView;", "Lcom/trtc/uikit/livekit/common/ui/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textAudienceCount", "Landroid/widget/TextView;", "layoutAudienceCount", "Landroid/widget/LinearLayout;", "recycleAudienceList", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListIconAdapter;", "liveListStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;", "audienceStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "audienceListPopupDialog", "Lcom/trtc/uikit/livekit/component/audiencelist/view/AudienceListPopupDialog;", "onUserItemClickListener", "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$OnUserItemClickListener;", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "liveListListener", "com/trtc/uikit/livekit/component/audiencelist/AudienceListView$liveListListener$1", "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$liveListListener$1;", "init", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "setOnUserItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setScreenOrientation", "isPortrait", "", "initStore", "addObserver", "removeObserver", "initView", "initAudienceCountView", "initAudienceAvatarView", "showAudienceListPanelView", "onAudienceListChange", "userInfoList", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "updateAudienceCount", "setUserCount", "count", "formatUserCount", "", "reportData", "roomId", "OnUserItemClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class AudienceListView extends BasicView {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Context f77572d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public TextView f77573e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public LinearLayout f77574f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public RecyclerView f77575g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public C46136a f77576h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public LiveListStore f77577i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public LiveAudienceStore f77578j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public AudienceListPopupDialog f77579k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public InterfaceC35869a f77580l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final LiveKitLogger f77581m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final C35873c f77582n;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audiencelist.AudienceListView$a */
    /* JADX INFO: compiled from: AudienceListView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$OnUserItemClickListener;", "", "onUserItemClick", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35869a {
        /* JADX INFO: renamed from: a */
        void mo79430a(@NotNull LiveUserInfo liveUserInfo);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audiencelist.AudienceListView$b */
    /* JADX INFO: compiled from: AudienceListView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/component/audiencelist/AudienceListView$initAudienceAvatarView$1", "Landroid/view/View$OnTouchListener;", "point", "Landroid/graphics/Point;", ViewProps.SCROLL, "", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewOnTouchListenerC35872b implements View.OnTouchListener {

        /* JADX INFO: renamed from: b */
        public final Point f77585b = new Point();

        /* JADX INFO: renamed from: c */
        public boolean f77586c;

        public ViewOnTouchListenerC35872b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v11, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v11, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            int action = event.getAction();
            if (action == 0) {
                this.f77585b.set((int) event.getX(), (int) event.getY());
                this.f77586c = false;
            } else if (action != 1) {
                if (action == 2 && Math.abs(event.getX() - this.f77585b.x) > 10.0f && !this.f77586c) {
                    this.f77586c = true;
                }
            } else if (!this.f77586c) {
                AudienceListView.this.m79428u();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audiencelist.AudienceListView$c */
    /* JADX INFO: compiled from: AudienceListView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/audiencelist/AudienceListView$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveId", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35873c extends LiveListListener {
        public C35873c() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveId, LiveEndedReason reason, String message) {
            AudienceListPopupDialog audienceListPopupDialog;
            Intrinsics.checkNotNullParameter(liveId, "liveId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            if (Intrinsics.areEqual(liveId, AudienceListView.this.getF77568c()) && (audienceListPopupDialog = AudienceListView.this.f77579k) != null) {
                audienceListPopupDialog.dismiss();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: a */
    public void mo79408a() {
        LiveListStore liveListStore = this.f77577i;
        if (liveListStore != null) {
            liveListStore.addLiveListListener(this.f77582n);
        }
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AudienceListView$addObserver$1(this, null), 3, null));
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: c */
    public void mo79410c() {
        this.f77577i = LiveListStore.INSTANCE.shared();
        this.f77578j = LiveAudienceStore.INSTANCE.create(getF77568c());
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: d */
    public void mo79411d() {
        LiveListStore liveListStore = this.f77577i;
        if (liveListStore != null) {
            liveListStore.removeLiveListListener(this.f77582n);
        }
        InterfaceC41775x1 f77567b = getF77567b();
        if (f77567b != null) {
            InterfaceC41775x1.a.m91377a(f77567b, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m79422n(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        super.mo79409b(liveInfo.getLiveID());
        m79425r();
        m79427t(liveInfo.getLiveID());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: o */
    public final void m79423o() {
        LiveAudienceState liveAudienceState;
        this.f77575g.setLayoutManager(new LinearLayoutManager(this.f77572d, 0, false));
        Context context = this.f77572d;
        LiveAudienceStore liveAudienceStore = this.f77578j;
        if (liveAudienceStore == null || (liveAudienceState = liveAudienceStore.getLiveAudienceState()) == null) {
            liveAudienceState = LiveAudienceStore.INSTANCE.create(getF77568c()).getLiveAudienceState();
        }
        C46136a c46136a = new C46136a(context, liveAudienceState);
        this.f77576h = c46136a;
        this.f77575g.setAdapter(c46136a);
        this.f77575g.setOnTouchListener(new ViewOnTouchListenerC35872b());
    }

    /* JADX INFO: renamed from: p */
    public final void m79424p() {
        this.f77574f.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.audiencelist.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceListView.m79420q(this.f77589b, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m79426s(List<LiveUserInfo> list) {
        ViewGroup.LayoutParams layoutParams = this.f77575g.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (list.size() <= 2) {
            layoutParams2.width = -2;
        } else {
            layoutParams2.width = ScreenUtil.dip2px(56.0f);
        }
        C46136a c46136a = this.f77576h;
        if (c46136a != null) {
            c46136a.m101682i();
        }
        m79429v();
    }

    public final void setOnUserItemClickListener(@Nullable InterfaceC35869a interfaceC35869a) {
        this.f77580l = interfaceC35869a;
        AudienceListPopupDialog audienceListPopupDialog = this.f77579k;
        if (audienceListPopupDialog != null) {
            audienceListPopupDialog.setOnUserItemClickListener(interfaceC35869a);
        }
    }

    public final void setScreenOrientation(boolean isPortrait) {
        this.f77574f.setEnabled(isPortrait);
        this.f77575g.setEnabled(isPortrait);
    }

    /* JADX INFO: renamed from: u */
    public final void m79428u() {
        LiveAudienceState liveAudienceState;
        LiveAudienceStore liveAudienceStore = this.f77578j;
        if (liveAudienceStore != null) {
            liveAudienceStore.fetchAudienceList(null);
        }
        if (this.f77579k == null) {
            Context context = this.f77572d;
            LiveAudienceStore liveAudienceStore2 = this.f77578j;
            if (liveAudienceStore2 == null || (liveAudienceState = liveAudienceStore2.getLiveAudienceState()) == null) {
                liveAudienceState = LiveAudienceStore.INSTANCE.create(getF77568c()).getLiveAudienceState();
            }
            AudienceListPopupDialog audienceListPopupDialog = new AudienceListPopupDialog(context, liveAudienceState);
            this.f77579k = audienceListPopupDialog;
            audienceListPopupDialog.setOnUserItemClickListener(this.f77580l);
        }
        AudienceListPopupDialog audienceListPopupDialog2 = this.f77579k;
        if (audienceListPopupDialog2 != null) {
            audienceListPopupDialog2.show();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m79429v() {
        LiveAudienceState liveAudienceState;
        InterfaceC41678w<List<LiveUserInfo>> audienceList;
        List<LiveUserInfo> value;
        LiveAudienceState liveAudienceState2;
        InterfaceC41678w<Integer> audienceCount;
        LiveAudienceStore liveAudienceStore = this.f77578j;
        int size = 0;
        int iIntValue = (liveAudienceStore == null || (liveAudienceState2 = liveAudienceStore.getLiveAudienceState()) == null || (audienceCount = liveAudienceState2.getAudienceCount()) == null) ? 0 : audienceCount.getValue().intValue();
        LiveAudienceStore liveAudienceStore2 = this.f77578j;
        if (liveAudienceStore2 != null && (liveAudienceState = liveAudienceStore2.getLiveAudienceState()) != null && (audienceList = liveAudienceState.getAudienceList()) != null && (value = audienceList.getValue()) != null) {
            size = value.size();
        }
        this.f77581m.m79404b("updateAudienceCount userCount:" + iIntValue + " listSize:" + size);
        if (iIntValue >= 100) {
            setUserCount(iIntValue);
        } else {
            setUserCount(size);
        }
    }

    public /* synthetic */ AudienceListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: q */
    public static final void m79420q(AudienceListView audienceListView, View view) {
        audienceListView.m79428u();
    }

    @SuppressLint({"SetTextI18n"})
    private final void setUserCount(int count) {
        this.f77573e.setText(m79421m(count));
    }

    /* JADX INFO: renamed from: m */
    public final String m79421m(int i11) {
        String strValueOf = String.valueOf(i11);
        if (i11 >= 10000) {
            if (Intrinsics.areEqual(Locale.CHINESE.getLanguage(), Locale.getDefault().getLanguage())) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strReplace$default = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(i11 / 10000.0f)}, 1));
                Intrinsics.checkNotNullExpressionValue(strReplace$default, "format(...)");
                if (StringsKt.endsWith$default(strReplace$default, ".0", false, 2, (Object) null)) {
                    strReplace$default = StringsKt.replace$default(strReplace$default, ".0", "", false, 4, (Object) null);
                }
                return strReplace$default + (char) 19975;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%dk", Arrays.copyOf(new Object[]{Integer.valueOf(i11 / 1000)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        return strValueOf;
    }

    /* JADX INFO: renamed from: r */
    public final void m79425r() {
        m79424p();
        m79423o();
    }

    /* JADX INFO: renamed from: t */
    public final void m79427t(String str) {
        if (!TextUtils.isEmpty(str) && StringsKt.startsWith$default(str, "voice_", false, 2, (Object) null)) {
            C45496e.m100464a(191009);
        } else {
            C45496e.m100464a(190010);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudienceListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77572d = context;
        this.f77581m = LiveKitLogger.f77564c.getComponentLogger("AudienceListView");
        this.f77582n = new C35873c();
        LayoutInflater.from(context).inflate(R$layout.audience_list_layout_icon, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.ll_audience_count);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77574f = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_audience_count);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77573e = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.rv_audience_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f77575g = (RecyclerView) viewFindViewById3;
    }
}
