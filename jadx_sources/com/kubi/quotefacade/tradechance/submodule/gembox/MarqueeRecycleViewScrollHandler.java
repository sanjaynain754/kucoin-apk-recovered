package com.kubi.quotefacade.tradechance.submodule.gembox;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChanceMarqueeHandler.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/gembox/MarqueeRecycleViewScrollHandler;", "Ljava/lang/Runnable;", "Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeHandler;", "marqueeView", "Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView;", "textItem", "Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "<init>", "(Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView;Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;)V", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scrollStop", "", "uiHandler", "Landroid/os/Handler;", "run", "", "post", "delayTime", "", "pause", "resume", "createTextMarqueeText", "", "", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "addContentView", "start", InterfaceC33730j9.f70350a, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarqueeRecycleViewScrollHandler extends ChanceMarqueeHandler implements Runnable {

    /* JADX INFO: renamed from: j */
    @Nullable
    public LinearLayoutManager f42651j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public RecyclerView f42652k;

    /* JADX INFO: renamed from: l */
    public boolean f42653l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Handler f42654m;

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.submodule.gembox.MarqueeRecycleViewScrollHandler$a */
    /* JADX INFO: compiled from: ChanceMarqueeHandler.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/quotefacade/tradechance/submodule/gembox/MarqueeRecycleViewScrollHandler$addContentView$1$2", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22561a extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (parent.getChildAdapterPosition(view) != 0) {
                if (C5303w0.m6511a()) {
                    outRect.right = ChanceMarqueeView.f42644e.getITEM_MARGIN_START();
                } else {
                    outRect.left = ChanceMarqueeView.f42644e.getITEM_MARGIN_START();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeRecycleViewScrollHandler(@NotNull ChanceMarqueeView marqueeView, @NotNull ChanceGemBoxTextItem textItem) {
        super(textItem, marqueeView);
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
        Intrinsics.checkNotNullParameter(textItem, "textItem");
        this.f42654m = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: r */
    public static final void m53151r(MarqueeRecycleViewScrollHandler marqueeRecycleViewScrollHandler) {
        LinearLayoutManager linearLayoutManager = marqueeRecycleViewScrollHandler.f42651j;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m53152u(MarqueeRecycleViewScrollHandler marqueeRecycleViewScrollHandler, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 16;
        }
        marqueeRecycleViewScrollHandler.m53161t(j11);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m53153v(MarqueeRecycleViewScrollHandler marqueeRecycleViewScrollHandler) {
        int iM66650j;
        RecyclerView recyclerView = marqueeRecycleViewScrollHandler.f42652k;
        if (recyclerView == null) {
            return Unit.INSTANCE;
        }
        boolean zM6511a = C5303w0.m6511a();
        int i11 = zM6511a ? -2 : 2;
        recyclerView.scrollBy(i11, i11);
        LinearLayoutManager linearLayoutManager = marqueeRecycleViewScrollHandler.f42651j;
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            int[] iArr = new int[2];
            recyclerView.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            LinearLayoutManager linearLayoutManager2 = marqueeRecycleViewScrollHandler.f42651j;
            View viewFindViewByPosition = linearLayoutManager2 != null ? linearLayoutManager2.findViewByPosition(numValueOf.intValue()) : null;
            if (viewFindViewByPosition != null) {
                viewFindViewByPosition.getLocationInWindow(iArr2);
            }
            if (zM6511a) {
                iM66650j = iArr2[0] + C27039d.m66650j(viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getMeasuredWidth()) : null);
            } else {
                iM66650j = iArr2[0];
            }
            int iM66650j2 = zM6511a ? iArr[0] + C27039d.m66650j(Integer.valueOf(recyclerView.getMeasuredWidth())) : iArr[0];
            if (!zM6511a ? iM66650j >= iM66650j2 : iM66650j <= iM66650j2) {
                marqueeRecycleViewScrollHandler.f42653l = true;
            } else {
                m53152u(marqueeRecycleViewScrollHandler, 0L, 1, null);
            }
        } else {
            m53152u(marqueeRecycleViewScrollHandler, 0L, 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // java.lang.Runnable
    public void run() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarqueeRecycleViewScrollHandler.m53153v(this.f42677b);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final List<CharSequence> m53160s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getF42665b().getMessage());
        arrayList.add(getF42665b().getMessage());
        return arrayList;
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeHandler
    /* JADX INFO: renamed from: b */
    public void mo53154b() {
        super.mo53154b();
        Context context = getF42669f().getContext();
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f42651j = linearLayoutManager;
        recyclerView.addItemDecoration(new C22561a());
        final int i11 = R$layout.quote_item_tradechance_gembox_text_marquee;
        final List<CharSequence> listM53160s = m53160s();
        recyclerView.setAdapter(new BaseQuickAdapter<CharSequence, BaseViewHolder>(i11, listM53160s) { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.MarqueeRecycleViewScrollHandler$addContentView$1$3
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, CharSequence charSequence) {
                View view;
                TextView textView;
                if (baseViewHolder == null || (view = baseViewHolder.itemView) == null || (textView = (TextView) view.findViewById(R$id.text)) == null) {
                    return;
                }
                textView.setText(charSequence);
            }
        });
        this.f42652k = recyclerView;
        LinearLayout f42669f = getF42669f();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(ChanceMarqueeView.f42644e.getTEXT_MARGIN_START());
        Unit unit = Unit.INSTANCE;
        f42669f.addView(recyclerView, layoutParams);
        getF42669f().requestLayout();
        this.f42654m.post(new Runnable() { // from class: com.kubi.quotefacade.tradechance.submodule.gembox.q
            @Override // java.lang.Runnable
            public final void run() {
                MarqueeRecycleViewScrollHandler.m53151r(this.f42678b);
            }
        });
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeHandler
    /* JADX INFO: renamed from: c */
    public void mo53155c() {
        super.mo53155c();
        this.f42654m.removeCallbacksAndMessages(null);
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeHandler
    /* JADX INFO: renamed from: i */
    public void mo53156i() {
        super.mo53156i();
        if (getF42667d()) {
            this.f42654m.removeCallbacks(this);
        }
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeHandler
    /* JADX INFO: renamed from: j */
    public void mo53157j() {
        super.mo53157j();
        m53152u(this, 0L, 1, null);
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeHandler
    /* JADX INFO: renamed from: l */
    public void mo53158l() {
        super.mo53158l();
        m53161t(1000L);
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeHandler
    /* JADX INFO: renamed from: o */
    public void mo53159o() {
        super.mo53159o();
        if (!getF42668e()) {
            this.f42654m.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m53161t(long j11) {
        if (!getF42668e() && !getF42667d() && !this.f42653l) {
            this.f42654m.postDelayed(this, j11);
        }
    }
}
