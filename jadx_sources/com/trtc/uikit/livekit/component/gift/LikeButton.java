package com.trtc.uikit.livekit.component.gift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.kubi.event.api.C12572a;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.common.p179ui.BasicView;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LikeButton.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\fH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/LikeButton;", "Lcom/trtc/uikit/livekit/common/ui/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "likePendingCount", "likeLastSendTimeMS", "", "hasPostLikeTask", "", "likeStore", "Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;", "mainHandler", "Landroid/os/Handler;", "sendLikeTask", "Ljava/lang/Runnable;", "initStore", "", "addObserver", "removeObserver", "initView", "setImageResource", "resId", "onLikeClick", "sendLike", "count", "now", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class LikeButton extends BasicView {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f77762j = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final LiveKitLogger f77763k = LiveKitLogger.f77564c.getComponentLogger("LikeButton");

    /* JADX INFO: renamed from: d */
    public int f77764d;

    /* JADX INFO: renamed from: e */
    public long f77765e;

    /* JADX INFO: renamed from: f */
    public boolean f77766f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public LikeStore f77767g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Handler f77768h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Runnable f77769i;

    /* JADX INFO: compiled from: LikeButton.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/LikeButton$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "LIKE_SEND_INTERVAL_MS", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.LikeButton$a */
    /* JADX INFO: compiled from: LikeButton.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/LikeButton$sendLike$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35918a implements CompletionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f77771b;

        public C35918a(int i11) {
            this.f77771b = i11;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            LikeButton.this.f77764d += this.f77771b;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: m */
    public final void m79668m(int i11, long j11) {
        this.f77764d = 0;
        this.f77765e = j11;
        LikeStore likeStore = this.f77767g;
        if (likeStore != null) {
            likeStore.sendLike(i11, new C35918a(i11));
        }
        C12572a.m23695d("com.trtc.uikit.livekit.kc.LiveEvent:like_event", Boolean.TRUE, 0L, 4, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    private final void m79664j() {
        setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.component.gift.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LikeButton.m79665k(this.f77775b, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final void m79666n(LikeButton likeButton) {
        f77763k.m79404b("sendLikeTask run");
        likeButton.f77766f = false;
        likeButton.m79668m(likeButton.f77764d, System.currentTimeMillis());
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: c */
    public void mo79410c() {
        this.f77767g = LikeStore.INSTANCE.create(getF77568c());
    }

    /* JADX INFO: renamed from: l */
    public final void m79667l() {
        C43852m.m96591c("B1FeedLive", "like", null, null, 12, null);
        if (TextUtils.isEmpty(getF77568c())) {
            f77763k.m79406d("roomId is null");
            return;
        }
        this.f77764d++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f77765e;
        long j12 = jCurrentTimeMillis - j11;
        if (j11 == 0 || j12 > 500) {
            this.f77768h.removeCallbacks(this.f77769i);
            this.f77766f = false;
            m79668m(this.f77764d, jCurrentTimeMillis);
        } else {
            if (this.f77766f) {
                return;
            }
            this.f77768h.postDelayed(this.f77769i, 500L);
            this.f77766f = true;
        }
    }

    public final void setImageResource(int resId) {
        ImageView imageView = (ImageView) findViewById(R$id.iv_like);
        if (imageView != null) {
            imageView.setImageResource(resId);
        }
    }

    public /* synthetic */ LikeButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: k */
    public static final void m79665k(LikeButton likeButton, View view) {
        likeButton.m79667l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LikeButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77768h = new Handler(Looper.getMainLooper());
        this.f77769i = new Runnable() { // from class: com.trtc.uikit.livekit.component.gift.b
            @Override // java.lang.Runnable
            public final void run() {
                LikeButton.m79666n(this.f77774b);
            }
        };
        LayoutInflater.from(context).inflate(R$layout.gift_layout_like_button, this);
        m79664j();
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: a */
    public void mo79408a() {
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: d */
    public void mo79411d() {
    }
}
