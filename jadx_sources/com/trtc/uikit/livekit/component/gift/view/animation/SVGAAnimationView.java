package com.trtc.uikit.livekit.component.gift.view.animation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.opensource.svgaplayer.InterfaceC27319b;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import vc0.C45496e;

/* JADX INFO: compiled from: SVGAAnimationView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView;", "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;", "Lcom/opensource/svgaplayer/SVGACallback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "svgaParser", "Lcom/opensource/svgaplayer/SVGAParser;", "imageView", "Lcom/opensource/svgaplayer/SVGAImageView;", "playAnimation", "", "playUrl", "", "stopPlay", "onFinished", "onPause", "onRepeat", "onStep", TypedValues.AttributesType.S_FRAME, "", "percentage", "", "openInputStream", "Ljava/io/InputStream;", "path", "reportData", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SVGAAnimationView extends AnimationView implements InterfaceC27319b {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f77812f = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final SVGAParser f77813d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final SVGAImageView f77814e;

    /* JADX INFO: compiled from: SVGAAnimationView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$Companion;", "", "<init>", "()V", "TAG", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.SVGAAnimationView$a */
    /* JADX INFO: compiled from: SVGAAnimationView.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/animation/SVGAAnimationView$playAnimation$1", "Lcom/opensource/svgaplayer/SVGAParser$ParseCompletion;", "onComplete", "", "videoItem", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "onError", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35930a implements SVGAParser.InterfaceC27307b {
        public C35930a() {
        }

        @Override // com.opensource.svgaplayer.SVGAParser.InterfaceC27307b
        /* JADX INFO: renamed from: a */
        public void mo67676a() {
            Log.e("SVGAAnimationView", "decodeFromURL onError");
            AnimationView.InterfaceC35926a f77795b = SVGAAnimationView.this.getF77795b();
            if (f77795b != null) {
                f77795b.mo79658a(-1);
            }
        }

        @Override // com.opensource.svgaplayer.SVGAParser.InterfaceC27307b
        /* JADX INFO: renamed from: b */
        public void mo67677b(SVGAVideoEntity videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            SVGAAnimationView.this.f77814e.setVisibility(0);
            SVGAAnimationView.this.f77814e.setVideoItem(videoItem);
            SVGAAnimationView.this.f77814e.m67671r();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SVGAAnimationView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SVGAAnimationView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.opensource.svgaplayer.InterfaceC27319b
    /* JADX INFO: renamed from: a */
    public void mo67739a() {
        this.f77814e.setVisibility(8);
        AnimationView.InterfaceC35926a f77795b = getF77795b();
        if (f77795b != null) {
            f77795b.mo79658a(0);
        }
    }

    @Override // com.trtc.uikit.livekit.component.gift.view.animation.AnimationView
    /* JADX INFO: renamed from: d */
    public void mo79684d(@NotNull String playUrl) {
        Intrinsics.checkNotNullParameter(playUrl, "playUrl");
        InputStream inputStreamM79709g = m79709g(playUrl);
        if (inputStreamM79709g != null) {
            this.f77813d.m67699r(inputStreamM79709g, "", new C35930a(), true, null, "");
            m79710h();
            return;
        }
        Log.e("SVGAAnimationView", "InputStream is null");
        AnimationView.InterfaceC35926a f77795b = getF77795b();
        if (f77795b != null) {
            f77795b.mo79658a(-1);
        }
    }

    @Override // com.trtc.uikit.livekit.component.gift.view.animation.AnimationView
    /* JADX INFO: renamed from: e */
    public void mo79685e() {
        this.f77814e.m67675v(true);
    }

    /* JADX INFO: renamed from: g */
    public final InputStream m79709g(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return new FileInputStream(file);
            }
            return null;
        } catch (FileNotFoundException e11) {
            Log.i("SVGAAnimationView", ' ' + e11.getLocalizedMessage());
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SVGAImageView sVGAImageView = new SVGAImageView(context, null, 0, 6, null);
        this.f77814e = sVGAImageView;
        addView(sVGAImageView, new FrameLayout.LayoutParams(-1, -1));
        sVGAImageView.setLoops(1);
        sVGAImageView.setCallback(this);
        SVGAParser sVGAParserShareParser = SVGAParser.INSTANCE.shareParser();
        this.f77813d = sVGAParserShareParser;
        sVGAParserShareParser.m67704x(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m79710h() {
        int i11;
        boolean z11 = false;
        if (!TextUtils.isEmpty(getF77796c()) && StringsKt.startsWith$default(getF77796c(), "voice_", false, 2, (Object) null)) {
            z11 = true;
        }
        if (z11) {
            i11 = 191022;
        } else {
            i11 = 190022;
        }
        C45496e.m100464a(i11);
    }

    @Override // com.opensource.svgaplayer.InterfaceC27319b
    /* JADX INFO: renamed from: c */
    public void mo67741c() {
    }

    @Override // com.opensource.svgaplayer.InterfaceC27319b
    /* JADX INFO: renamed from: b */
    public void mo67740b(int i11, double d11) {
    }
}
