package com.kubi.home.gembox;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.C4625b;
import com.kubi.home.common.p086ex.ViewExKt;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarqueeRecycleViewScrollHandler.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/home/gembox/MarqueeRecycleViewScrollHandler;", "Ljava/lang/Runnable;", "Lcom/kubi/home/gembox/MarqueeHandler;", "marqueeView", "Lcom/kubi/home/gembox/MarqueeView;", "textItem", "Lcom/kubi/home/gembox/TextItem;", "<init>", "(Lcom/kubi/home/gembox/MarqueeView;Lcom/kubi/home/gembox/TextItem;)V", "mLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scrollStop", "", "mHandler", "Landroid/os/Handler;", "run", "", "post", "delayTime", "", "pause", "resume", "createTextMarqueeText", "", "", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "addContentView", "start", InterfaceC33730j9.f70350a, "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarqueeRecycleViewScrollHandler extends MarqueeHandler implements Runnable {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f25655n = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public LinearLayoutManager f25656j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public RecyclerView f25657k;

    /* JADX INFO: renamed from: l */
    public boolean f25658l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Handler f25659m;

    /* JADX INFO: compiled from: MarqueeRecycleViewScrollHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/gembox/MarqueeRecycleViewScrollHandler$Companion;", "", "<init>", "()V", "STEP_DISTANCE", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeRecycleViewScrollHandler(@NotNull MarqueeView marqueeView, @NotNull TextItem textItem) {
        super(textItem, marqueeView);
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
        Intrinsics.checkNotNullParameter(textItem, "textItem");
        this.f25659m = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: r */
    public static final void m29219r(MarqueeRecycleViewScrollHandler marqueeRecycleViewScrollHandler) {
        LinearLayoutManager linearLayoutManager = marqueeRecycleViewScrollHandler.f25656j;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m29220u(MarqueeRecycleViewScrollHandler marqueeRecycleViewScrollHandler, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 16;
        }
        marqueeRecycleViewScrollHandler.m29228t(j11);
    }

    @Override // java.lang.Runnable
    public void run() {
        int iM66650j;
        RecyclerView recyclerView = this.f25657k;
        if (recyclerView != null) {
            boolean zM29092c = ViewExKt.m29092c(getF25687c());
            int i11 = zM29092c ? -2 : 2;
            recyclerView.scrollBy(i11, i11);
            LinearLayoutManager linearLayoutManager = this.f25656j;
            Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
            if (numValueOf == null || numValueOf.intValue() != 1) {
                m29220u(this, 0L, 1, null);
                return;
            }
            int[] iArr = new int[2];
            recyclerView.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            LinearLayoutManager linearLayoutManager2 = this.f25656j;
            View viewFindViewByPosition = linearLayoutManager2 != null ? linearLayoutManager2.findViewByPosition(numValueOf.intValue()) : null;
            if (viewFindViewByPosition != null) {
                viewFindViewByPosition.getLocationInWindow(iArr2);
            }
            if (zM29092c) {
                iM66650j = iArr2[0] + C27039d.m66650j(viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getMeasuredWidth()) : null);
            } else {
                iM66650j = iArr2[0];
            }
            int iM66650j2 = zM29092c ? iArr[0] + C27039d.m66650j(Integer.valueOf(recyclerView.getMeasuredWidth())) : iArr[0];
            C4988a.m5286a("recycleView.x:" + iM66650j2 + " measuredWidth:" + recyclerView.getMeasuredWidth() + "  itemLocation[0]:" + iArr2[0] + "  recycleViewLocation[0]:" + iArr[0], "marquee");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("item.x:");
            sb2.append(iM66650j);
            sb2.append("  view?.measuredWidth:");
            sb2.append(viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getMeasuredWidth()) : null);
            C4988a.m5286a(sb2.toString(), "marquee");
            if (!zM29092c ? iM66650j >= iM66650j2 : iM66650j <= iM66650j2) {
                this.f25658l = true;
            } else {
                m29220u(this, 0L, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final List<CharSequence> m29227s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getF25686b().getMessage());
        arrayList.add(getF25686b().getMessage());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.home.gembox.MarqueeHandler
    /* JADX INFO: renamed from: b */
    public void mo29221b() {
        super.mo29221b();
        RecyclerView recyclerView = new RecyclerView(getF25690f().getContext());
        TextMarqueeAdapter textMarqueeAdapter = new TextMarqueeAdapter(null, 1, 0 == true ? 1 : 0);
        textMarqueeAdapter.replaceData(m29227s());
        recyclerView.setAdapter(textMarqueeAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        this.f25656j = linearLayoutManager;
        MarqueeView.Companion companion = MarqueeView.f25660c;
        C4625b.m4550a(recyclerView, companion.getITEM_MARGIN_START());
        recyclerView.setLayoutManager(this.f25656j);
        this.f25657k = recyclerView;
        LinearLayout f25690f = getF25690f();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(companion.getTEXT_MARGIN_START());
        recyclerView.requestLayout();
        this.f25659m.post(new Runnable() { // from class: com.kubi.home.gembox.o
            @Override // java.lang.Runnable
            public final void run() {
                MarqueeRecycleViewScrollHandler.m29219r(this.f25694b);
            }
        });
        Unit unit = Unit.INSTANCE;
        f25690f.addView(recyclerView, layoutParams);
    }

    @Override // com.kubi.home.gembox.MarqueeHandler
    /* JADX INFO: renamed from: c */
    public void mo29222c() {
        super.mo29222c();
        this.f25659m.removeCallbacksAndMessages(null);
    }

    @Override // com.kubi.home.gembox.MarqueeHandler
    /* JADX INFO: renamed from: j */
    public void mo29223j() {
        super.mo29223j();
        if (getF25688d()) {
            this.f25659m.removeCallbacks(this);
        }
    }

    @Override // com.kubi.home.gembox.MarqueeHandler
    /* JADX INFO: renamed from: k */
    public void mo29224k() {
        super.mo29224k();
        m29220u(this, 0L, 1, null);
    }

    @Override // com.kubi.home.gembox.MarqueeHandler
    /* JADX INFO: renamed from: m */
    public void mo29225m() {
        super.mo29225m();
        m29228t(1000L);
    }

    @Override // com.kubi.home.gembox.MarqueeHandler
    /* JADX INFO: renamed from: p */
    public void mo29226p() {
        super.mo29226p();
        if (!getF25689e()) {
            this.f25659m.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m29228t(long j11) {
        if (!getF25689e() && !getF25688d() && !this.f25658l) {
            this.f25659m.postDelayed(this, j11);
        }
    }
}
