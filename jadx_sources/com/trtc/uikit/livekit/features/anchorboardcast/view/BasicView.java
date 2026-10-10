package com.trtc.uikit.livekit.features.anchorboardcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorBattleStore;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.store.MediaStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import wd0.AnchorBattleState;
import wd0.AnchorCoHostState;
import wd0.AnchorState;
import wd0.C45802f;
import wd0.C45812p;
import wd0.MediaState;
import wd0.UserState;

/* JADX INFO: compiled from: BasicView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010K\u001a\u00020L2\u0006\u0010+\u001a\u00020,J\b\u0010M\u001a\u00020LH\u0014J\b\u0010N\u001a\u00020LH\u0014J\b\u0010O\u001a\u00020LH$J\b\u0010P\u001a\u00020LH$J\b\u0010Q\u001a\u00020LH$J\b\u0010R\u001a\u00020LH$R\u0014\u0010\n\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020JX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/BasicView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "baseContext", "getBaseContext", "()Landroid/content/Context;", "anchorState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;", "getAnchorState", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;", "setAnchorState", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;)V", "coHostState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;", "getCoHostState", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;", "setCoHostState", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostState;)V", "battleState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;", "getBattleState", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;", "setBattleState", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleState;)V", "userState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;", "getUserState", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;", "setUserState", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserState;)V", "mediaState", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;", "getMediaState", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;", "setMediaState", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;)V", "anchorStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "getAnchorStore", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "setAnchorStore", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V", "anchorCoHostStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;", "getAnchorCoHostStore", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;", "setAnchorCoHostStore", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorCoHostStore;)V", "anchorBattleStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;", "getAnchorBattleStore", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;", "setAnchorBattleStore", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;)V", "userStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;", "getUserStore", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;", "setUserStore", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/UserStore;)V", "mediaStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;", "getMediaStore", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;", "setMediaStore", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaStore;)V", "isAddObserver", "", "init", "", "onAttachedToWindow", "onDetachedFromWindow", "initView", "refreshView", "addObserver", "removeObserver", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BasicView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Context f78197b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AnchorState f78198c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public AnchorCoHostState f78199d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AnchorBattleState f78200e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public UserState f78201f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public MediaState f78202g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public AnchorStore f78203h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C45802f f78204i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public AnchorBattleStore f78205j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C45812p f78206k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public MediaStore f78207l;

    /* JADX INFO: renamed from: m */
    public boolean f78208m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo80110a();

    /* JADX INFO: renamed from: c */
    public abstract void mo80115c();

    /* JADX INFO: renamed from: d */
    public abstract void mo80117d();

    /* JADX INFO: renamed from: e */
    public abstract void mo80120e();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public final void m80259b(@NotNull AnchorStore anchorStore) {
        Intrinsics.checkNotNullParameter(anchorStore, "anchorStore");
        this.f78203h = anchorStore;
        this.f78206k = anchorStore.getF78174g();
        this.f78207l = anchorStore.getF78175h();
        this.f78204i = anchorStore.getF78176i();
        this.f78205j = anchorStore.getF78177j();
        this.f78198c = anchorStore.getF78170c();
        this.f78201f = anchorStore.m80239p();
        this.f78202g = anchorStore.m80236m();
        this.f78199d = anchorStore.m80233j();
        this.f78200e = anchorStore.m80232i();
        mo80117d();
        if (this.f78208m) {
            return;
        }
        mo80110a();
        this.f78208m = true;
    }

    @Nullable
    /* JADX INFO: renamed from: getAnchorBattleStore, reason: from getter */
    public final AnchorBattleStore getF78205j() {
        return this.f78205j;
    }

    @Nullable
    /* JADX INFO: renamed from: getAnchorCoHostStore, reason: from getter */
    public final C45802f getF78204i() {
        return this.f78204i;
    }

    @Nullable
    /* JADX INFO: renamed from: getAnchorState, reason: from getter */
    public final AnchorState getF78198c() {
        return this.f78198c;
    }

    @Nullable
    /* JADX INFO: renamed from: getAnchorStore, reason: from getter */
    public final AnchorStore getF78203h() {
        return this.f78203h;
    }

    @NotNull
    /* JADX INFO: renamed from: getBaseContext, reason: from getter */
    public final Context getF78197b() {
        return this.f78197b;
    }

    @Nullable
    /* JADX INFO: renamed from: getBattleState, reason: from getter */
    public final AnchorBattleState getF78200e() {
        return this.f78200e;
    }

    @Nullable
    /* JADX INFO: renamed from: getCoHostState, reason: from getter */
    public final AnchorCoHostState getF78199d() {
        return this.f78199d;
    }

    @Nullable
    /* JADX INFO: renamed from: getMediaState, reason: from getter */
    public final MediaState getF78202g() {
        return this.f78202g;
    }

    @Nullable
    /* JADX INFO: renamed from: getMediaStore, reason: from getter */
    public final MediaStore getF78207l() {
        return this.f78207l;
    }

    @Nullable
    /* JADX INFO: renamed from: getUserState, reason: from getter */
    public final UserState getF78201f() {
        return this.f78201f;
    }

    @Nullable
    /* JADX INFO: renamed from: getUserStore, reason: from getter */
    public final C45812p getF78206k() {
        return this.f78206k;
    }

    public final void setAnchorBattleStore(@Nullable AnchorBattleStore anchorBattleStore) {
        this.f78205j = anchorBattleStore;
    }

    public final void setAnchorCoHostStore(@Nullable C45802f c45802f) {
        this.f78204i = c45802f;
    }

    public final void setAnchorState(@Nullable AnchorState anchorState) {
        this.f78198c = anchorState;
    }

    public final void setAnchorStore(@Nullable AnchorStore anchorStore) {
        this.f78203h = anchorStore;
    }

    public final void setBattleState(@Nullable AnchorBattleState anchorBattleState) {
        this.f78200e = anchorBattleState;
    }

    public final void setCoHostState(@Nullable AnchorCoHostState anchorCoHostState) {
        this.f78199d = anchorCoHostState;
    }

    public final void setMediaState(@Nullable MediaState mediaState) {
        this.f78202g = mediaState;
    }

    public final void setMediaStore(@Nullable MediaStore mediaStore) {
        this.f78207l = mediaStore;
    }

    public final void setUserState(@Nullable UserState userState) {
        this.f78201f = userState;
    }

    public final void setUserStore(@Nullable C45812p c45812p) {
        this.f78206k = c45812p;
    }

    public /* synthetic */ BasicView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f78203h != null && !this.f78208m) {
            mo80110a();
            this.f78208m = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f78208m) {
            mo80120e();
            this.f78208m = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BasicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78197b = context;
        mo80115c();
    }
}
