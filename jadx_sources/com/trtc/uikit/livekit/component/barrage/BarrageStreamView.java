package com.trtc.uikit.livekit.component.barrage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.core.app.FrameMetricsAggregator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cd0.C4936b;
import cd0.InterfaceC4935a;
import cd0.InterfaceC4937c;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.p179ui.BasicView;
import com.trtc.uikit.livekit.component.barrage.view.CustomRecyclerView;
import com.trtc.uikit.livekit.component.barrage.view.adapter.BarrageMsgListAdapter;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageState;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import vc0.C45496e;

/* JADX INFO: compiled from: BarrageStreamView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\b\u0005*\u0001<\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002>?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020*J\u000e\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020!H\u0014J\b\u0010/\u001a\u00020!H\u0014J\b\u00100\u001a\u00020!H\u0014J!\u00101\u001a\u00020!2\u0012\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001903\"\u00020\u0019H\u0016¢\u0006\u0002\u00104J\u0014\u00105\u001a\u00020!2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001906J\u0006\u00107\u001a\u00020\bJ\b\u00108\u001a\u00020!H\u0007J\u0006\u00109\u001a\u00020!J\b\u0010:\u001a\u00020!H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0004\n\u0002\u0010=¨\u0006@"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView;", "Lcom/trtc/uikit/livekit/common/ui/BasicView;", "Lcom/trtc/uikit/livekit/component/barrage/view/IBarrageDisplayView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "timestampOnLastUpdate", "", "smoothScroll", "", "updateViewTask", "Ljava/lang/Runnable;", "recyclerMsg", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerMsg", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerMsg$delegate", "Lkotlin/Lazy;", "msgList", "", "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "adapter", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageMsgListAdapter;", "barrageStore", "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;", "liveAudienceStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "init", "", "roomId", "", TUIConstantDefine.OWNER_ID, "setItemTypeDelegate", "delegate", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemTypeDelegate;", "setItemAdapter", "itemType", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemAdapter;", "setOnMessageClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$OnMessageClickListener;", "initStore", "addObserver", "removeObserver", "insertBarrages", "barrages", "", "([Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;)V", "onBarrageListChanged", "", "getBarrageCount", "notifyDataSetChanged", "scrollToLastPosition", "reportData", "liveAudienceListener", "com/trtc/uikit/livekit/component/barrage/BarrageStreamView$liveAudienceListener$1", "Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$liveAudienceListener$1;", "Companion", "OnMessageClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nBarrageStreamView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarrageStreamView.kt\ncom/trtc/uikit/livekit/component/barrage/BarrageStreamView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,186:1\n13472#2,2:187\n*S KotlinDebug\n*F\n+ 1 BarrageStreamView.kt\ncom/trtc/uikit/livekit/component/barrage/BarrageStreamView\n*L\n101#1:187,2\n*E\n"})
public final class BarrageStreamView extends BasicView {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f77611m = new Companion(null);

    /* JADX INFO: renamed from: d */
    public long f77612d;

    /* JADX INFO: renamed from: e */
    public boolean f77613e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Runnable f77614f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f77615g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<Barrage> f77616h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final BarrageMsgListAdapter f77617i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public BarrageStore f77618j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public LiveAudienceStore f77619k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final C35883b f77620l;

    /* JADX INFO: compiled from: BarrageStreamView.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$Companion;", "", "<init>", "()V", "BARRAGE_LIST_UPDATE_DURATION_MS", "", "SMOOTH_SCROLL_COUNT_MAX", "", "ICON_URL", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.BarrageStreamView$a */
    /* JADX INFO: compiled from: BarrageStreamView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/BarrageStreamView$OnMessageClickListener;", "", "onMessageClick", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35881a {
        /* JADX INFO: renamed from: a */
        void mo79480a(@NotNull LiveUserInfo liveUserInfo);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.BarrageStreamView$b */
    /* JADX INFO: compiled from: BarrageStreamView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/barrage/BarrageStreamView$liveAudienceListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "onAudienceJoined", "", "audience", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35883b extends LiveAudienceListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f77623b;

        public C35883b(Context context) {
            this.f77623b = context;
        }

        /* JADX INFO: renamed from: b */
        public static final void m79483b(BarrageStreamView barrageStreamView, LiveUserInfo liveUserInfo) {
            Barrage barrage = new Barrage(null, null, 0L, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            String string = barrageStreamView.getContext().getString(R$string.common_entered_room);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            barrage.setTextContent(string);
            LiveUserInfo sender = barrage.getSender();
            sender.setUserID(liveUserInfo.getUserID());
            sender.setUserName(liveUserInfo.getUserName());
            sender.setAvatarURL(liveUserInfo.getAvatarURL());
            barrageStreamView.m79474k(barrage);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
        public void onAudienceJoined(final LiveUserInfo audience) {
            Intrinsics.checkNotNullParameter(audience, "audience");
            String userID = audience.getUserID();
            UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
            if (Intrinsics.areEqual(userID, value != null ? value.getUserID() : null)) {
                Barrage barrage = new Barrage(null, null, 0L, 0L, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                Context context = this.f77623b;
                String string = context.getString(R$string.live_risk_notice_barrage);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                barrage.setTextContent(string);
                LiveUserInfo sender = barrage.getSender();
                String string2 = context.getString(R$string.live_admin);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                sender.setUserName(string2);
                sender.setAvatarURL("https://assets.staticimg.com/cms/media/av7BnQ4iBYLLDa4Wv8EK58apLukxhGJ0rm4XvKX4u.png");
                BarrageStreamView.this.m79474k(barrage);
            }
            final BarrageStreamView barrageStreamView = BarrageStreamView.this;
            barrageStreamView.postDelayed(new Runnable() { // from class: com.trtc.uikit.livekit.component.barrage.f
                @Override // java.lang.Runnable
                public final void run() {
                    BarrageStreamView.C35883b.m79483b(barrageStreamView, audience);
                }
            }, 500L);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarrageStreamView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarrageStreamView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RecyclerView getRecyclerMsg() {
        Object value = this.f77615g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    /* JADX INFO: renamed from: n */
    public static final RecyclerView m79470n(BarrageStreamView barrageStreamView) {
        return (RecyclerView) barrageStreamView.findViewById(R$id.rv_msg);
    }

    /* JADX INFO: renamed from: q */
    public static final void m79471q(BarrageStreamView barrageStreamView, int i11) {
        if (barrageStreamView.f77613e) {
            barrageStreamView.getRecyclerMsg().smoothScrollToPosition(i11);
        } else {
            barrageStreamView.getRecyclerMsg().scrollToPosition(i11);
        }
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: c */
    public void mo79410c() {
        this.f77618j = BarrageStore.INSTANCE.create(getF77568c());
        this.f77619k = LiveAudienceStore.INSTANCE.create(getF77568c());
    }

    public final int getBarrageCount() {
        BarrageState barrageState;
        InterfaceC41678w<List<Barrage>> messageList;
        List<Barrage> value;
        BarrageStore barrageStore = this.f77618j;
        if (barrageStore == null || (barrageState = barrageStore.getBarrageState()) == null || (messageList = barrageState.getMessageList()) == null || (value = messageList.getValue()) == null) {
            return 0;
        }
        return value.size();
    }

    /* JADX INFO: renamed from: j */
    public final void m79473j(@NotNull String roomId, @NotNull String ownerId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        super.mo79409b(roomId);
        setRoomId(roomId);
        BarrageMsgListAdapter barrageMsgListAdapter = this.f77617i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        barrageMsgListAdapter.m79547i(0, new C4936b(context, ownerId));
        m79477o();
    }

    /* JADX INFO: renamed from: k */
    public void m79474k(@NotNull Barrage... barrages) {
        Intrinsics.checkNotNullParameter(barrages, "barrages");
        for (Barrage barrage : barrages) {
            BarrageStore barrageStore = this.f77618j;
            if (barrageStore != null) {
                barrageStore.appendLocalTip(barrage);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m79476m(@NotNull List<Barrage> barrages) {
        Intrinsics.checkNotNullParameter(barrages, "barrages");
        this.f77613e = barrages.size() - this.f77616h.size() < 100;
        this.f77616h.clear();
        this.f77616h.addAll(barrages);
        removeCallbacks(this.f77614f);
        if (System.currentTimeMillis() - this.f77612d >= 250) {
            m79475l();
        } else {
            postDelayed(this.f77614f, 250L);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m79479r(int i11, @NotNull InterfaceC4935a adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f77617i.m79547i(i11, adapter);
    }

    public final void setItemTypeDelegate(@NotNull InterfaceC4937c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f77617i.m79548j(delegate);
    }

    public final void setOnMessageClickListener(@NotNull InterfaceC35881a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f77617i.setOnMessageClickListener(listener);
    }

    public /* synthetic */ BarrageStreamView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: s */
    public static final void m79472s(BarrageStreamView barrageStreamView) {
        barrageStreamView.m79475l();
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: a */
    public void mo79408a() {
        setSubscribeStateJob(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new BarrageStreamView$addObserver$1(this, null), 3, null));
        LiveAudienceStore liveAudienceStore = this.f77619k;
        if (liveAudienceStore != null) {
            liveAudienceStore.addLiveAudienceListener(this.f77620l);
        }
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: d */
    public void mo79411d() {
        InterfaceC41775x1 f77567b = getF77567b();
        if (f77567b != null) {
            InterfaceC41775x1.a.m91377a(f77567b, null, 1, null);
        }
        LiveAudienceStore liveAudienceStore = this.f77619k;
        if (liveAudienceStore != null) {
            liveAudienceStore.removeLiveAudienceListener(this.f77620l);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: l */
    public final void m79475l() {
        this.f77612d = System.currentTimeMillis();
        this.f77617i.notifyDataSetChanged();
        m79478p();
    }

    /* JADX INFO: renamed from: o */
    public final void m79477o() {
        int i11;
        if (!TextUtils.isEmpty(getF77568c()) && StringsKt.startsWith$default(getF77568c(), "voice_", false, 2, (Object) null)) {
            i11 = 191012;
        } else {
            i11 = 190013;
        }
        C45496e.m100464a(i11);
    }

    /* JADX INFO: renamed from: p */
    public final void m79478p() {
        RecyclerView recyclerMsg = getRecyclerMsg();
        Intrinsics.checkNotNull(recyclerMsg, "null cannot be cast to non-null type com.trtc.uikit.livekit.component.barrage.view.CustomRecyclerView");
        if (((CustomRecyclerView) recyclerMsg).getF77650c()) {
            return;
        }
        final int iMax = Math.max(0, this.f77617i.getItemCount() - 1);
        getRecyclerMsg().post(new Runnable() { // from class: com.trtc.uikit.livekit.component.barrage.e
            @Override // java.lang.Runnable
            public final void run() {
                BarrageStreamView.m79471q(this.f77628b, iMax);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarrageStreamView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77613e = true;
        this.f77614f = new Runnable() { // from class: com.trtc.uikit.livekit.component.barrage.c
            @Override // java.lang.Runnable
            public final void run() {
                BarrageStreamView.m79472s(this.f77626b);
            }
        };
        this.f77615g = LazyKt.lazy(new Function0() { // from class: com.trtc.uikit.livekit.component.barrage.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageStreamView.m79470n(this.f77627b);
            }
        });
        ArrayList arrayList = new ArrayList();
        this.f77616h = arrayList;
        BarrageMsgListAdapter barrageMsgListAdapter = new BarrageMsgListAdapter(arrayList);
        this.f77617i = barrageMsgListAdapter;
        LayoutInflater.from(context).inflate(R$layout.livekit_barrage_view_display, this);
        getRecyclerMsg().setLayoutManager(new LinearLayoutManager(context));
        getRecyclerMsg().setAdapter(barrageMsgListAdapter);
        this.f77620l = new C35883b(context);
    }
}
