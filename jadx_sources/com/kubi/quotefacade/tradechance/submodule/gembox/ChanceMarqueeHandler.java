package com.kubi.quotefacade.tradechance.submodule.gembox;

import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.submodule.gembox.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChanceMarqueeHandler.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0014J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeHandler;", "", "textItem", "Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "marqueeView", "Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView;", "<init>", "(Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView;)V", "getTextItem", "()Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "isPause", "", "()Z", "setPause", "(Z)V", "isDestroy", "setDestroy", "contentContainer", "Landroid/widget/LinearLayout;", "getContentContainer", "()Landroid/widget/LinearLayout;", "setContentContainer", "(Landroid/widget/LinearLayout;)V", "ivIcon", "Landroid/widget/ImageView;", "mHandler", "Landroid/os/Handler;", "stopCallBack", "Lkotlin/Function0;", "", "getStopCallBack", "()Lkotlin/jvm/functions/Function0;", "setStopCallBack", "(Lkotlin/jvm/functions/Function0;)V", "startMaxDelayTime", "initTimeForFirst", "pause", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "addContentView", "resume", "start", InterfaceC33730j9.f70350a, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceMarqueeHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceMarqueeHandler.kt\ncom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public abstract class ChanceMarqueeHandler {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ChanceGemBoxTextItem f42665b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ChanceMarqueeView f42666c;

    /* JADX INFO: renamed from: d */
    public boolean f42667d;

    /* JADX INFO: renamed from: e */
    public boolean f42668e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public LinearLayout f42669f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ImageView f42670g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Handler f42671h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function0<Unit> f42672i;

    public ChanceMarqueeHandler(@NotNull ChanceGemBoxTextItem textItem, @NotNull ChanceMarqueeView marqueeView) {
        Intrinsics.checkNotNullParameter(textItem, "textItem");
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
        this.f42665b = textItem;
        this.f42666c = marqueeView;
        LinearLayout linearLayout = new LinearLayout(marqueeView.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f42669f = linearLayout;
        this.f42671h = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: b */
    public void mo53154b() {
        this.f42666c.removeAllViews();
        ChanceMarqueeView chanceMarqueeView = this.f42666c;
        LinearLayout linearLayout = this.f42669f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Unit unit = Unit.INSTANCE;
        chanceMarqueeView.addView(linearLayout, layoutParams);
        this.f42669f.removeAllViews();
        ImageView imageView = new ImageView(this.f42669f.getContext());
        LinearLayout linearLayout2 = this.f42669f;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(C5275i0.m6236a(2.0f));
        linearLayout2.addView(imageView, layoutParams2);
        this.f42670g = imageView;
    }

    /* JADX INFO: renamed from: c */
    public void mo53155c() {
        this.f42671h.removeCallbacksAndMessages(null);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LinearLayout getF42669f() {
        return this.f42669f;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ChanceGemBoxTextItem getF42665b() {
        return this.f42665b;
    }

    /* JADX INFO: renamed from: f */
    public final void m53189f() {
        this.f42665b.setStartTime(System.currentTimeMillis());
        this.f42665b.setEndTime(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF42668e() {
        return this.f42668e;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getF42667d() {
        return this.f42667d;
    }

    /* JADX INFO: renamed from: i */
    public void mo53156i() {
        if (this.f42667d) {
            return;
        }
        this.f42671h.removeCallbacksAndMessages(null);
        this.f42665b.setEndTime(System.currentTimeMillis());
        this.f42667d = true;
    }

    /* JADX INFO: renamed from: j */
    public void mo53157j() {
        if (this.f42667d) {
            this.f42667d = false;
            m53193m();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m53192k(@Nullable Function0<Unit> function0) {
        this.f42672i = function0;
    }

    /* JADX INFO: renamed from: m */
    public final void m53193m() {
        if (this.f42665b.getMarqueeType() == 1) {
            long endTime = 8000 - (this.f42665b.getEndTime() - this.f42665b.getStartTime());
            if (endTime > 0) {
                this.f42671h.postDelayed(new Runnable() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChanceMarqueeHandler.m53186n(this.f42664b);
                    }
                }, endTime);
            } else {
                mo53159o();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo53159o() {
        if (this.f42668e) {
            return;
        }
        this.f42668e = true;
        this.f42671h.removeCallbacksAndMessages(null);
        Function0<Unit> function0 = this.f42672i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m53186n(ChanceMarqueeHandler chanceMarqueeHandler) {
        chanceMarqueeHandler.mo53159o();
    }

    /* JADX INFO: renamed from: l */
    public void mo53158l() {
        mo53154b();
        m53189f();
        m53193m();
        Integer textIcon = this.f42665b.getTextIcon();
        if (textIcon != null) {
            int iIntValue = textIcon.intValue();
            ImageView imageView = this.f42670g;
            if (imageView != null) {
                imageView.setImageResource(iIntValue);
            }
        }
    }
}
