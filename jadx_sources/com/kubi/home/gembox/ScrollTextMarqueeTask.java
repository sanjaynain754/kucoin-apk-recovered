package com.kubi.home.gembox;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.home.R$layout;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScrollTextMarqueeTask.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u00002\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/home/gembox/ScrollTextMarqueeTask;", "", "context", "Landroid/content/Context;", "textItem", "Lcom/kubi/home/gembox/TextItem;", "marqueeView", "Lcom/kubi/home/gembox/MarqueeView;", "<init>", "(Landroid/content/Context;Lcom/kubi/home/gembox/TextItem;Lcom/kubi/home/gembox/MarqueeView;)V", "getContext", "()Landroid/content/Context;", "marqueeScrollHandler", "Lcom/kubi/home/gembox/MarqueeHandler;", "mHandler", "Landroid/os/Handler;", "pause", "", "resume", InterfaceC33730j9.f70350a, TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "createTextView", "Landroid/widget/TextView;", "start", "stopCallBack", "Lkotlin/Function0;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScrollTextMarqueeTask {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f25665f = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f25666a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TextItem f25667b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MarqueeView f25668c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public MarqueeHandler f25669d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Handler f25670e;

    /* JADX INFO: compiled from: ScrollTextMarqueeTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/gembox/ScrollTextMarqueeTask$Companion;", "", "<init>", "()V", "DELAY_TIME", "", "FIRST_DELAY_TIME", "MAX_MARQUEE_TIME", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ScrollTextMarqueeTask(@NotNull Context context, @NotNull TextItem textItem, @NotNull MarqueeView marqueeView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textItem, "textItem");
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
        this.f25666a = context;
        this.f25667b = textItem;
        this.f25668c = marqueeView;
        this.f25670e = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: b */
    public final TextView m29241b() {
        View viewInflate = LayoutInflater.from(this.f25666a).inflate(R$layout.layout_text_marquee, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public final void m29242c() {
        MarqueeHandler marqueeHandler = this.f25669d;
        if (marqueeHandler != null) {
            marqueeHandler.mo29222c();
        }
        this.f25670e.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m29243d() {
        MarqueeHandler marqueeHandler = this.f25669d;
        if (marqueeHandler != null) {
            marqueeHandler.mo29223j();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m29244e() {
        MarqueeHandler marqueeHandler = this.f25669d;
        if (marqueeHandler != null) {
            marqueeHandler.mo29224k();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ScrollTextMarqueeTask m29245f(@Nullable final Function0<Unit> function0) {
        this.f25670e.postDelayed(new Runnable() { // from class: com.kubi.home.gembox.p
            @Override // java.lang.Runnable
            public final void run() {
                ScrollTextMarqueeTask.m29240g(this.f25695b, function0);
            }
        }, 1000L);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public static final void m29240g(ScrollTextMarqueeTask scrollTextMarqueeTask, Function0 function0) {
        MarqueeHandler textViewMarqueeHandler;
        TextView textViewM29241b = scrollTextMarqueeTask.m29241b();
        textViewM29241b.setText(scrollTextMarqueeTask.f25667b.getMessage());
        textViewM29241b.measure(0, 0);
        int measuredWidth = textViewM29241b.getMeasuredWidth();
        int width = (scrollTextMarqueeTask.f25668c.getWidth() - scrollTextMarqueeTask.f25668c.getPaddingStart()) - scrollTextMarqueeTask.f25668c.getPaddingEnd();
        MarqueeView.Companion companion = MarqueeView.f25660c;
        int marquee_icon_width = (width - companion.getMARQUEE_ICON_WIDTH()) - companion.getTEXT_MARGIN_START();
        C4988a.m5286a("text:textWidth:" + measuredWidth + "  marqueeView.width:" + marquee_icon_width, "marquee");
        if (measuredWidth > marquee_icon_width) {
            textViewMarqueeHandler = new MarqueeRecycleViewScrollHandler(scrollTextMarqueeTask.f25668c, scrollTextMarqueeTask.f25667b);
        } else {
            textViewMarqueeHandler = new TextViewMarqueeHandler(scrollTextMarqueeTask.f25667b, scrollTextMarqueeTask.f25668c);
        }
        scrollTextMarqueeTask.f25669d = textViewMarqueeHandler;
        textViewMarqueeHandler.m29257l(function0);
        MarqueeHandler marqueeHandler = scrollTextMarqueeTask.f25669d;
        if (marqueeHandler != null) {
            marqueeHandler.mo29225m();
        }
    }
}
