package com.kubi.home.gembox;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.home.R$layout;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.gembox.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarqueeHandler.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010(\u001a\u00020#H\u0002J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0014J\b\u0010-\u001a\u00020#H\u0016J\b\u0010.\u001a\u00020#H\u0016J\b\u0010/\u001a\u00020#H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00060"}, m90084d2 = {"Lcom/kubi/home/gembox/MarqueeHandler;", "", "textItem", "Lcom/kubi/home/gembox/TextItem;", "marqueeView", "Lcom/kubi/home/gembox/MarqueeView;", "<init>", "(Lcom/kubi/home/gembox/TextItem;Lcom/kubi/home/gembox/MarqueeView;)V", "getTextItem", "()Lcom/kubi/home/gembox/TextItem;", "getMarqueeView", "()Lcom/kubi/home/gembox/MarqueeView;", "isPause", "", "()Z", "setPause", "(Z)V", "isDestroy", "setDestroy", "contentContainer", "Landroid/widget/LinearLayout;", "getContentContainer", "()Landroid/widget/LinearLayout;", "setContentContainer", "(Landroid/widget/LinearLayout;)V", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "mHandler", "Landroid/os/Handler;", "stopCallBack", "Lkotlin/Function0;", "", "getStopCallBack", "()Lkotlin/jvm/functions/Function0;", "setStopCallBack", "(Lkotlin/jvm/functions/Function0;)V", "startMaxDelayTime", "initTimeForFirst", "pause", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "addContentView", "resume", "start", InterfaceC33730j9.f70350a, "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MarqueeHandler {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TextItem f25686b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MarqueeView f25687c;

    /* JADX INFO: renamed from: d */
    public boolean f25688d;

    /* JADX INFO: renamed from: e */
    public boolean f25689e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public LinearLayout f25690f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public ImageView f25691g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Handler f25692h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function0<Unit> f25693i;

    public MarqueeHandler(@NotNull TextItem textItem, @NotNull MarqueeView marqueeView) {
        Intrinsics.checkNotNullParameter(textItem, "textItem");
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
        this.f25686b = textItem;
        this.f25687c = marqueeView;
        LinearLayout linearLayout = new LinearLayout(marqueeView.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f25690f = linearLayout;
        View viewInflate = LayoutInflater.from(marqueeView.getContext()).inflate(R$layout.layout_text_marquee_icon, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        this.f25691g = (ImageView) viewInflate;
        this.f25692h = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o */
    public static final void m29250o(MarqueeHandler marqueeHandler) {
        C4988a.m5286a("8秒时间到，停止滚动", "marquee");
        marqueeHandler.mo29226p();
    }

    /* JADX INFO: renamed from: b */
    public void mo29221b() {
        this.f25687c.removeAllViews();
        MarqueeView marqueeView = this.f25687c;
        LinearLayout linearLayout = this.f25690f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Unit unit = Unit.INSTANCE;
        marqueeView.addView(linearLayout, layoutParams);
        this.f25690f.removeAllViews();
        LinearLayout linearLayout2 = this.f25690f;
        ImageView imageView = this.f25691g;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(C5275i0.m6236a(2.0f));
        linearLayout2.addView(imageView, layoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void mo29222c() {
        this.f25692h.removeCallbacksAndMessages(null);
        mo29226p();
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LinearLayout getF25690f() {
        return this.f25690f;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final MarqueeView getF25687c() {
        return this.f25687c;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextItem getF25686b() {
        return this.f25686b;
    }

    /* JADX INFO: renamed from: g */
    public final void m29254g() {
        this.f25686b.setStartTime(System.currentTimeMillis());
        this.f25686b.setEndTime(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getF25689e() {
        return this.f25689e;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF25688d() {
        return this.f25688d;
    }

    /* JADX INFO: renamed from: j */
    public void mo29223j() {
        C4988a.m5286a("MarqueeHandler marquee  pause", "marquee");
        if (this.f25688d) {
            return;
        }
        this.f25692h.removeCallbacksAndMessages(null);
        this.f25686b.setEndTime(System.currentTimeMillis());
        this.f25688d = true;
    }

    /* JADX INFO: renamed from: k */
    public void mo29224k() {
        C4988a.m5286a("MarqueeHandler marquee  resume", "marquee");
        if (this.f25688d) {
            this.f25688d = false;
            m29258n();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m29257l(@Nullable Function0<Unit> function0) {
        this.f25693i = function0;
    }

    /* JADX INFO: renamed from: m */
    public void mo29225m() {
        C4988a.m5286a("MarqueeHandler marquee  start", "marquee");
        mo29221b();
        m29254g();
        m29258n();
        Integer textIcon = this.f25686b.getTextIcon();
        if (textIcon != null) {
            this.f25691g.setImageResource(textIcon.intValue());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m29258n() {
        if (this.f25686b.getMarqueeType() == 1) {
            C4988a.m5286a("startMaxDelayTime", "marquee");
            long endTime = 8000 - (this.f25686b.getEndTime() - this.f25686b.getStartTime());
            C4988a.m5286a("startMaxDelayTime delay time:" + endTime, "marquee");
            if (endTime <= 0) {
                mo29226p();
            } else {
                C4988a.m5286a("开始8秒倒计时", "marquee");
                this.f25692h.postDelayed(new Runnable() { // from class: com.kubi.home.gembox.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        MarqueeHandler.m29250o(this.f25685b);
                    }
                }, endTime);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo29226p() {
        C4988a.m5286a("MarqueeHandler marquee  stop", "marquee");
        if (this.f25689e) {
            return;
        }
        this.f25689e = true;
        this.f25692h.removeCallbacksAndMessages(null);
        Function0<Unit> function0 = this.f25693i;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
