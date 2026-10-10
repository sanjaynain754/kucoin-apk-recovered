package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.trtc.uikit.livekit.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoGuestIconView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "currentAnimationResIndex", "", "startAnimationTask", "com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$startAnimationTask$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$startAnimationTask$1;", "startAnimation", "", "stopAnimation", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoGuestIconView extends View {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f78314d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final int[] f78315e = {R$drawable.livekit_function_link_1, R$drawable.livekit_function_link_2, R$drawable.livekit_function_link_3};

    /* JADX INFO: renamed from: f */
    public static final int f78316f = R$drawable.livekit_function_link_default;

    /* JADX INFO: renamed from: b */
    public int f78317b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final RunnableC36113a f78318c;

    /* JADX INFO: compiled from: CoGuestIconView.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$Companion;", "", "<init>", "()V", "ANIMATION_INTERVAL_MS", "", "ANIMATION_ICON_RES_ID_ARRAY", "", "DEFAULT_ICON_RES_ID", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.CoGuestIconView$a */
    /* JADX INFO: compiled from: CoGuestIconView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/CoGuestIconView$startAnimationTask$1", "Ljava/lang/Runnable;", "run", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC36113a implements Runnable {
        public RunnableC36113a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11 = CoGuestIconView.this.f78317b;
            int length = CoGuestIconView.f78315e.length;
            if (i11 < 0 || i11 >= length) {
                return;
            }
            CoGuestIconView.this.setBackgroundResource(CoGuestIconView.f78315e[i11]);
            CoGuestIconView.this.postDelayed(this, 500L);
            CoGuestIconView.this.f78317b = (i11 + 1) % length;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CoGuestIconView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public final void m80455e() {
        this.f78317b = -1;
        setBackgroundResource(f78316f);
        removeCallbacks(this.f78318c);
    }

    public /* synthetic */ CoGuestIconView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public final void m80454d() {
        if (this.f78317b == -1) {
            this.f78317b = 0;
            post(this.f78318c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoGuestIconView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78317b = -1;
        this.f78318c = new RunnableC36113a();
        setBackgroundResource(f78316f);
    }
}
