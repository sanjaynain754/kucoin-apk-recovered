package com.kubi.quotefacade.tradechance.submodule.gembox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.kubi.quotefacade.tradechance.utils.QuoteCloseableCoroutineScope;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChanceMarqueeView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0017J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018J\f\u0010\u0019\u001a\u00020\u0016*\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0014J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "textItemList", "", "Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "marqueeScrollHandler", "Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeHandler;", "uiSccope", "Lcom/kubi/quotefacade/tradechance/utils/QuoteCloseableCoroutineScope;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "e", "setData", "", "itemList", "", "start", "nextStart", "textItem", "onDetachedFromWindow", "pause", "resume", "reset", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChanceMarqueeView extends FrameLayout {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f42644e = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static int f42645f = C27040e.m66658b(2);

    /* JADX INFO: renamed from: g */
    public static int f42646g = C27040e.m66658b(20);

    /* JADX INFO: renamed from: h */
    public static int f42647h = C27040e.m66658b(20);

    /* JADX INFO: renamed from: b */
    @NotNull
    public List<ChanceGemBoxTextItem> f42648b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ChanceMarqueeHandler f42649c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final QuoteCloseableCoroutineScope f42650d;

    /* JADX INFO: compiled from: ChanceMarqueeView.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView$Companion;", "", "<init>", "()V", "MARQUEE_TYPE_ONCE", "", "MARQUEE_TYPE_FOREVER", "TEXT_MARGIN_START", "getTEXT_MARGIN_START", "()I", "setTEXT_MARGIN_START", "(I)V", "ITEM_MARGIN_START", "getITEM_MARGIN_START", "setITEM_MARGIN_START", "MARQUEE_ICON_WIDTH", "getMARQUEE_ICON_WIDTH", "setMARQUEE_ICON_WIDTH", "DELAY_TIME", "", "FIRST_DELAY_TIME", "MAX_MARQUEE_TIME", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getITEM_MARGIN_START() {
            return ChanceMarqueeView.f42646g;
        }

        public final int getMARQUEE_ICON_WIDTH() {
            return ChanceMarqueeView.f42647h;
        }

        public final int getTEXT_MARGIN_START() {
            return ChanceMarqueeView.f42645f;
        }

        public final void setITEM_MARGIN_START(int i11) {
            ChanceMarqueeView.f42646g = i11;
        }

        public final void setMARQUEE_ICON_WIDTH(int i11) {
            ChanceMarqueeView.f42647h = i11;
        }

        public final void setTEXT_MARGIN_START(int i11) {
            ChanceMarqueeView.f42645f = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent e11) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChanceMarqueeView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f42648b = new ArrayList();
        this.f42650d = new QuoteCloseableCoroutineScope(C42911a.m94121c());
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m53140q(ChanceMarqueeView chanceMarqueeView, ChanceGemBoxTextItem chanceGemBoxTextItem) {
        C41696j.m91104d(chanceMarqueeView.f42650d, null, null, new ChanceMarqueeView$start$1$1(chanceMarqueeView, chanceGemBoxTextItem, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final void m53141k() {
        this.f42650d.close();
        ChanceMarqueeHandler chanceMarqueeHandler = this.f42649c;
        if (chanceMarqueeHandler != null) {
            chanceMarqueeHandler.mo53155c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m53142l(ChanceGemBoxTextItem chanceGemBoxTextItem) {
        int size = this.f42648b.size();
        if (size != 0) {
            int index = chanceGemBoxTextItem.getIndex() + 1;
            if (index >= size) {
                index = 0;
            }
            m53146p(this.f42648b.get(index));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m53143m() {
        ChanceMarqueeHandler chanceMarqueeHandler = this.f42649c;
        if (chanceMarqueeHandler != null) {
            chanceMarqueeHandler.mo53156i();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m53145o() {
        ChanceMarqueeHandler chanceMarqueeHandler = this.f42649c;
        if (chanceMarqueeHandler != null) {
            chanceMarqueeHandler.mo53157j();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m53146p(final ChanceGemBoxTextItem chanceGemBoxTextItem) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceMarqueeView.m53140q(this.f42673b, chanceGemBoxTextItem);
            }
        });
    }

    public final void setData(@NotNull List<ChanceGemBoxTextItem> itemList) {
        ChanceGemBoxTextItem chanceGemBoxTextItem;
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        m53144n();
        this.f42648b.clear();
        this.f42648b.addAll(itemList);
        if (this.f42648b.isEmpty() || (chanceGemBoxTextItem = (ChanceGemBoxTextItem) CollectionsKt.firstOrNull(CollectionsKt.toList(this.f42648b))) == null) {
            return;
        }
        m53146p(chanceGemBoxTextItem);
    }

    /* JADX INFO: renamed from: n */
    public final void m53144n() {
        m53141k();
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m53141k();
    }
}
