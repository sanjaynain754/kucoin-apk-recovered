package com.trtc.uikit.livekit.features.audiencecontainer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.trtc.uikit.livekit.features.audiencecontainer.store.IMStore;
import com.trtc.uikit.livekit.features.audiencecontainer.store.MediaStore;
import ee0.C37144f;
import ee0.IMState;
import ee0.MediaState;
import ee0.ViewState;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestState;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostState;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListState;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatState;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BasicView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u000bH\u0016J\b\u0010o\u001a\u00020mH\u0014J\b\u0010p\u001a\u00020mH\u0014J\b\u0010q\u001a\u00020mH$J\b\u0010r\u001a\u00020mH\u0014J\b\u0010s\u001a\u00020mH$J\b\u0010t\u001a\u00020mH$R\u001a\u0010\n\u001a\u00020\u000bX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020SX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020YX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020_X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001c\u0010d\u001a\u0004\u0018\u00010eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u000e\u0010j\u001a\u00020kX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006u"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/BasicView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "getAudienceStore", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "setAudienceStore", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V", "liveListStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;", "getLiveListStore", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;", "setLiveListStore", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;)V", "liveSeatStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;", "getLiveSeatStore", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;", "setLiveSeatStore", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;)V", "liveAudienceStore", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "getLiveAudienceStore", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;", "setLiveAudienceStore", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;)V", "coGuestStore", "Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;", "getCoGuestStore", "()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;", "setCoGuestStore", "(Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;)V", "battleStore", "Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;", "getBattleStore", "()Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;", "setBattleStore", "(Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;)V", "imStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;", "getImStore", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;", "setImStore", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMStore;)V", "mediaStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;", "getMediaStore", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;", "setMediaStore", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaStore;)V", "liveListState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;", "getLiveListState", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;", "setLiveListState", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;)V", "liveSeatState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;", "getLiveSeatState", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;", "setLiveSeatState", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;)V", "coGuestState", "Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;", "getCoGuestState", "()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;", "setCoGuestState", "(Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;)V", "coHostState", "Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;", "getCoHostState", "()Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;", "setCoHostState", "(Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;)V", "imState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMState;", "getImState", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMState;", "setImState", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/IMState;)V", "mediaState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;", "getMediaState", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;", "setMediaState", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;)V", "viewState", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewState;", "getViewState", "()Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewState;", "setViewState", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewState;)V", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "getSubscribeStateJob", "()Lkotlinx/coroutines/Job;", "setSubscribeStateJob", "(Lkotlinx/coroutines/Job;)V", "isAddObserver", "", "init", "", "store", "onAttachedToWindow", "onDetachedFromWindow", "initView", "refreshView", "addObserver", "removeObserver", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BasicView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public C37144f f78690b;

    /* JADX INFO: renamed from: c */
    public LiveListStore f78691c;

    /* JADX INFO: renamed from: d */
    public LiveSeatStore f78692d;

    /* JADX INFO: renamed from: e */
    public LiveAudienceStore f78693e;

    /* JADX INFO: renamed from: f */
    public CoGuestStore f78694f;

    /* JADX INFO: renamed from: g */
    public BattleStore f78695g;

    /* JADX INFO: renamed from: h */
    public IMStore f78696h;

    /* JADX INFO: renamed from: i */
    public MediaStore f78697i;

    /* JADX INFO: renamed from: j */
    public LiveListState f78698j;

    /* JADX INFO: renamed from: k */
    public LiveSeatState f78699k;

    /* JADX INFO: renamed from: l */
    public CoGuestState f78700l;

    /* JADX INFO: renamed from: m */
    public CoHostState f78701m;

    /* JADX INFO: renamed from: n */
    public IMState f78702n;

    /* JADX INFO: renamed from: o */
    public MediaState f78703o;

    /* JADX INFO: renamed from: p */
    public ViewState f78704p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public InterfaceC41775x1 f78705q;

    /* JADX INFO: renamed from: r */
    public boolean f78706r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo80889a();

    /* JADX INFO: renamed from: c */
    public abstract void mo80892c();

    /* JADX INFO: renamed from: e */
    public abstract void mo80896e();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public void mo80950b(@NotNull C37144f store) {
        Intrinsics.checkNotNullParameter(store, "store");
        setAudienceStore(store);
        setLiveListStore(store.getF82419a());
        setLiveListState(store.m83096o());
        setLiveSeatStore(store.getF82422d());
        setLiveAudienceStore(store.getF82423e());
        setBattleStore(store.getF82426h());
        setLiveSeatState(store.m83098q());
        setCoGuestStore(store.getF82424f());
        setCoHostState(store.m83091j());
        setImStore(store.getF82427i());
        setMediaStore(store.getF82428j());
        setCoGuestState(store.m83089h());
        setImState(store.m83093l());
        setMediaState(store.m83100s());
        setViewState(store.m83102u());
        mo80951d();
        if (this.f78706r) {
            return;
        }
        mo80889a();
        this.f78706r = true;
    }

    @NotNull
    public final C37144f getAudienceStore() {
        C37144f c37144f = this.f78690b;
        if (c37144f != null) {
            return c37144f;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceStore");
        return null;
    }

    @NotNull
    public final BattleStore getBattleStore() {
        BattleStore battleStore = this.f78695g;
        if (battleStore != null) {
            return battleStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("battleStore");
        return null;
    }

    @NotNull
    public final CoGuestState getCoGuestState() {
        CoGuestState coGuestState = this.f78700l;
        if (coGuestState != null) {
            return coGuestState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coGuestState");
        return null;
    }

    @NotNull
    public final CoGuestStore getCoGuestStore() {
        CoGuestStore coGuestStore = this.f78694f;
        if (coGuestStore != null) {
            return coGuestStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coGuestStore");
        return null;
    }

    @NotNull
    public final CoHostState getCoHostState() {
        CoHostState coHostState = this.f78701m;
        if (coHostState != null) {
            return coHostState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coHostState");
        return null;
    }

    @NotNull
    public final IMState getImState() {
        IMState iMState = this.f78702n;
        if (iMState != null) {
            return iMState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imState");
        return null;
    }

    @NotNull
    public final IMStore getImStore() {
        IMStore iMStore = this.f78696h;
        if (iMStore != null) {
            return iMStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imStore");
        return null;
    }

    @NotNull
    public final LiveAudienceStore getLiveAudienceStore() {
        LiveAudienceStore liveAudienceStore = this.f78693e;
        if (liveAudienceStore != null) {
            return liveAudienceStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("liveAudienceStore");
        return null;
    }

    @NotNull
    public final LiveListState getLiveListState() {
        LiveListState liveListState = this.f78698j;
        if (liveListState != null) {
            return liveListState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("liveListState");
        return null;
    }

    @NotNull
    public final LiveListStore getLiveListStore() {
        LiveListStore liveListStore = this.f78691c;
        if (liveListStore != null) {
            return liveListStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("liveListStore");
        return null;
    }

    @NotNull
    public final LiveSeatState getLiveSeatState() {
        LiveSeatState liveSeatState = this.f78699k;
        if (liveSeatState != null) {
            return liveSeatState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("liveSeatState");
        return null;
    }

    @NotNull
    public final LiveSeatStore getLiveSeatStore() {
        LiveSeatStore liveSeatStore = this.f78692d;
        if (liveSeatStore != null) {
            return liveSeatStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("liveSeatStore");
        return null;
    }

    @NotNull
    public final MediaState getMediaState() {
        MediaState mediaState = this.f78703o;
        if (mediaState != null) {
            return mediaState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaState");
        return null;
    }

    @NotNull
    public final MediaStore getMediaStore() {
        MediaStore mediaStore = this.f78697i;
        if (mediaStore != null) {
            return mediaStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaStore");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubscribeStateJob, reason: from getter */
    public final InterfaceC41775x1 getF78705q() {
        return this.f78705q;
    }

    @NotNull
    public final ViewState getViewState() {
        ViewState viewState = this.f78704p;
        if (viewState != null) {
            return viewState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewState");
        return null;
    }

    public final void setAudienceStore(@NotNull C37144f c37144f) {
        Intrinsics.checkNotNullParameter(c37144f, "<set-?>");
        this.f78690b = c37144f;
    }

    public final void setBattleStore(@NotNull BattleStore battleStore) {
        Intrinsics.checkNotNullParameter(battleStore, "<set-?>");
        this.f78695g = battleStore;
    }

    public final void setCoGuestState(@NotNull CoGuestState coGuestState) {
        Intrinsics.checkNotNullParameter(coGuestState, "<set-?>");
        this.f78700l = coGuestState;
    }

    public final void setCoGuestStore(@NotNull CoGuestStore coGuestStore) {
        Intrinsics.checkNotNullParameter(coGuestStore, "<set-?>");
        this.f78694f = coGuestStore;
    }

    public final void setCoHostState(@NotNull CoHostState coHostState) {
        Intrinsics.checkNotNullParameter(coHostState, "<set-?>");
        this.f78701m = coHostState;
    }

    public final void setImState(@NotNull IMState iMState) {
        Intrinsics.checkNotNullParameter(iMState, "<set-?>");
        this.f78702n = iMState;
    }

    public final void setImStore(@NotNull IMStore iMStore) {
        Intrinsics.checkNotNullParameter(iMStore, "<set-?>");
        this.f78696h = iMStore;
    }

    public final void setLiveAudienceStore(@NotNull LiveAudienceStore liveAudienceStore) {
        Intrinsics.checkNotNullParameter(liveAudienceStore, "<set-?>");
        this.f78693e = liveAudienceStore;
    }

    public final void setLiveListState(@NotNull LiveListState liveListState) {
        Intrinsics.checkNotNullParameter(liveListState, "<set-?>");
        this.f78698j = liveListState;
    }

    public final void setLiveListStore(@NotNull LiveListStore liveListStore) {
        Intrinsics.checkNotNullParameter(liveListStore, "<set-?>");
        this.f78691c = liveListStore;
    }

    public final void setLiveSeatState(@NotNull LiveSeatState liveSeatState) {
        Intrinsics.checkNotNullParameter(liveSeatState, "<set-?>");
        this.f78699k = liveSeatState;
    }

    public final void setLiveSeatStore(@NotNull LiveSeatStore liveSeatStore) {
        Intrinsics.checkNotNullParameter(liveSeatStore, "<set-?>");
        this.f78692d = liveSeatStore;
    }

    public final void setMediaState(@NotNull MediaState mediaState) {
        Intrinsics.checkNotNullParameter(mediaState, "<set-?>");
        this.f78703o = mediaState;
    }

    public final void setMediaStore(@NotNull MediaStore mediaStore) {
        Intrinsics.checkNotNullParameter(mediaStore, "<set-?>");
        this.f78697i = mediaStore;
    }

    public final void setSubscribeStateJob(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.f78705q = interfaceC41775x1;
    }

    public final void setViewState(@NotNull ViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "<set-?>");
        this.f78704p = viewState;
    }

    public /* synthetic */ BasicView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f78690b != null && !this.f78706r) {
            mo80889a();
            this.f78706r = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f78706r) {
            mo80896e();
            this.f78706r = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        mo80892c();
    }

    /* JADX INFO: renamed from: d */
    public void mo80951d() {
    }
}
