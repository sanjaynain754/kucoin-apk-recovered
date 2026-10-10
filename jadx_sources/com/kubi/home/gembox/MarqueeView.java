package com.kubi.home.gembox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.kubi.utils.extensions.C27040e;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarqueeView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0011R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/home/gembox/MarqueeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "marqueeTaskManager", "Lcom/kubi/home/gembox/TextMarqueeTaskManager;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "e", "setData", "", "itemList", "", "Lcom/kubi/home/gembox/TextItem;", "onDetachedFromWindow", "pause", "resume", "reset", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarqueeView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f25660c = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static int f25661d = C27040e.m66658b(2);

    /* JADX INFO: renamed from: e */
    public static int f25662e = C27040e.m66658b(20);

    /* JADX INFO: renamed from: f */
    public static int f25663f = C27040e.m66658b(20);

    /* JADX INFO: renamed from: b */
    @Nullable
    public TextMarqueeTaskManager f25664b;

    /* JADX INFO: compiled from: MarqueeView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/gembox/MarqueeView$Companion;", "", "<init>", "()V", "MARQUEE_TYPE_ONCE", "", "MARQUEE_TYPE_FOREVER", "TEXT_MARGIN_START", "getTEXT_MARGIN_START", "()I", "setTEXT_MARGIN_START", "(I)V", "ITEM_MARGIN_START", "getITEM_MARGIN_START", "setITEM_MARGIN_START", "MARQUEE_ICON_WIDTH", "getMARQUEE_ICON_WIDTH", "setMARQUEE_ICON_WIDTH", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getITEM_MARGIN_START() {
            return MarqueeView.f25662e;
        }

        public final int getMARQUEE_ICON_WIDTH() {
            return MarqueeView.f25663f;
        }

        public final int getTEXT_MARGIN_START() {
            return MarqueeView.f25661d;
        }

        public final void setITEM_MARGIN_START(int i11) {
            MarqueeView.f25662e = i11;
        }

        public final void setMARQUEE_ICON_WIDTH(int i11) {
            MarqueeView.f25663f = i11;
        }

        public final void setTEXT_MARGIN_START(int i11) {
            MarqueeView.f25661d = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent e11) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    /* JADX INFO: renamed from: g */
    public final void m29235g() {
        TextMarqueeTaskManager textMarqueeTaskManager = this.f25664b;
        if (textMarqueeTaskManager != null) {
            textMarqueeTaskManager.m29261b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m29236h() {
        TextMarqueeTaskManager textMarqueeTaskManager = this.f25664b;
        if (textMarqueeTaskManager != null) {
            textMarqueeTaskManager.m29263d();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m29238j() {
        TextMarqueeTaskManager textMarqueeTaskManager = this.f25664b;
        if (textMarqueeTaskManager != null) {
            textMarqueeTaskManager.m29264e();
        }
    }

    public final void setData(@NotNull List<TextItem> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        if (itemList.isEmpty()) {
            removeAllViews();
            return;
        }
        m29237i();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextMarqueeTaskManager textMarqueeTaskManager = new TextMarqueeTaskManager(context, this);
        this.f25664b = textMarqueeTaskManager;
        textMarqueeTaskManager.m29265f(itemList);
    }

    /* JADX INFO: renamed from: i */
    public final void m29237i() {
        m29235g();
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4988a.m5286a("MarqueeView onDetachedFromWindow", "marquee");
        m29235g();
    }
}
