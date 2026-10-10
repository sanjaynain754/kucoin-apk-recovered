package com.trtc.uikit.livekit.component.gift.view.animation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AnimationViewWrapper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper;", "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationView", "effectAnimationView", "Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;", "svgaAnimationView", "Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;", "playAnimation", "", "playUrl", "", "playEffectAnimation", "url", "playSVGAAnimation", "switchAnimationView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getSourceType", "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;", "stopPlay", "AnimationSourceType", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationViewWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationViewWrapper.kt\ncom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,86:1\n43#2:87\n*S KotlinDebug\n*F\n+ 1 AnimationViewWrapper.kt\ncom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper\n*L\n36#1:87\n*E\n"})
public final class AnimationViewWrapper extends AnimationView {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f77797g = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    public AnimationView f77798d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public TCEffectAnimationView f77799e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public SVGAAnimationView f77800f;

    /* JADX INFO: compiled from: AnimationViewWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$AnimationSourceType;", "", "<init>", "(Ljava/lang/String;I)V", "SVGA", "MP4", "OTHER", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum AnimationSourceType {
        SVGA,
        MP4,
        OTHER;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f77802c = EnumEntriesKt.enumEntries(m79690a());

        @NotNull
        public static EnumEntries<AnimationSourceType> getEntries() {
            return f77802c;
        }
    }

    /* JADX INFO: compiled from: AnimationViewWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationViewWrapper$Companion;", "", "<init>", "()V", "TAG", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AnimationViewWrapper(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnimationViewWrapper(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.trtc.uikit.livekit.component.gift.view.animation.AnimationView
    /* JADX INFO: renamed from: d */
    public void mo79684d(@NotNull String playUrl) {
        Intrinsics.checkNotNullParameter(playUrl, "playUrl");
        AnimationSourceType animationSourceTypeM79686f = m79686f(playUrl);
        if (animationSourceTypeM79686f == AnimationSourceType.MP4) {
            m79687g(playUrl);
            return;
        }
        if (animationSourceTypeM79686f == AnimationSourceType.SVGA) {
            m79688h(playUrl);
            return;
        }
        Log.e("AnimationViewWrapper", "not support url: " + playUrl);
        AnimationView.InterfaceC35926a f77795b = getF77795b();
        if (f77795b != null) {
            f77795b.mo79658a(-1);
        }
    }

    @Override // com.trtc.uikit.livekit.component.gift.view.animation.AnimationView
    /* JADX INFO: renamed from: e */
    public void mo79685e() {
        AnimationView animationView = this.f77798d;
        if (animationView != null) {
            animationView.mo79685e();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m79687g(String str) {
        if (this.f77799e == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f77799e = new TCEffectAnimationView(context, null, 2, null);
        }
        TCEffectAnimationView tCEffectAnimationView = this.f77799e;
        if ((tCEffectAnimationView != null ? tCEffectAnimationView.getChildCount() : 0) <= 0) {
            Log.e("AnimationViewWrapper", "not support TCEffectAnimationView");
            AnimationView.InterfaceC35926a f77795b = getF77795b();
            if (f77795b != null) {
                f77795b.mo79658a(-1);
                return;
            }
            return;
        }
        AnimationView animationView = this.f77798d;
        TCEffectAnimationView tCEffectAnimationView2 = this.f77799e;
        if (animationView != tCEffectAnimationView2) {
            m79689i(tCEffectAnimationView2);
            this.f77798d = this.f77799e;
        }
        AnimationView animationView2 = this.f77798d;
        if (animationView2 != null) {
            animationView2.setCallback(getF77795b());
        }
        AnimationView animationView3 = this.f77798d;
        if (animationView3 != null) {
            animationView3.mo79684d(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m79688h(String str) {
        if (this.f77800f == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f77800f = new SVGAAnimationView(context, null, 2, null);
        }
        if (!Intrinsics.areEqual(this.f77798d, this.f77800f)) {
            m79689i(this.f77800f);
            this.f77798d = this.f77800f;
        }
        AnimationView animationView = this.f77798d;
        if (animationView != null) {
            animationView.setCallback(getF77795b());
        }
        AnimationView animationView2 = this.f77798d;
        if (animationView2 != null) {
            animationView2.mo79684d(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimationViewWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public final AnimationSourceType m79686f(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnimationSourceType.OTHER;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase, ".mp4", false, 2, (Object) null)) {
            return AnimationSourceType.MP4;
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase2, ".svga", false, 2, (Object) null)) {
            return AnimationSourceType.SVGA;
        }
        return AnimationSourceType.OTHER;
    }

    /* JADX INFO: renamed from: i */
    public final void m79689i(AnimationView animationView) {
        removeAllViews();
        addView(animationView, new FrameLayout.LayoutParams(-1, -1));
    }
}
