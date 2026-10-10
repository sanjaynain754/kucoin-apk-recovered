package com.kubi.kumex.market;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.kumex.record.CommonHeadObject;
import com.kubi.sdk.BaseAdapter;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.market.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecommendFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u001b\u0010\u0012\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\t¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/market/QuotesRecommendDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "isHomeRankPosition", "", "<init>", "(Z)V", "dp4", "", "getDp4", "()I", "dp4$delegate", "Lkotlin/Lazy;", "dp8", "getDp8", "dp8$delegate", "dp12", "getDp12", "dp12$delegate", "dp24", "getDp24", "dp24$delegate", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/QuotesRecommendDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n808#2,11:467\n*S KotlinDebug\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/QuotesRecommendDecoration\n*L\n393#1:467,11\n*E\n"})
public final class QuotesRecommendDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public final boolean f29878d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f29879e = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(QuotesRecommendDecoration.m35136g());
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f29880f = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(QuotesRecommendDecoration.m35137h());
        }
    });

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f29881g = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(QuotesRecommendDecoration.m35134e());
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f29882h = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(QuotesRecommendDecoration.m35135f());
        }
    });

    /* JADX INFO: renamed from: e */
    public static final int m35134e() {
        return (int) C27025c.m66565c(C27017c.f54310a.m66513b(), 12);
    }

    /* JADX INFO: renamed from: f */
    public static final int m35135f() {
        return (int) C27025c.m66565c(C27017c.f54310a.m66513b(), 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final int m35136g() {
        return (int) C27025c.m66564b(C27017c.f54310a.m66513b(), 4.0f);
    }

    /* JADX INFO: renamed from: h */
    public static final int m35137h() {
        return (int) C27025c.m66565c(C27017c.f54310a.m66513b(), 8);
    }

    /* JADX INFO: renamed from: i */
    private final int m35138i() {
        return ((Number) this.f29881g.getValue()).intValue();
    }

    /* JADX INFO: renamed from: j */
    private final int m35139j() {
        return ((Number) this.f29882h.getValue()).intValue();
    }

    /* JADX INFO: renamed from: k */
    private final int m35140k() {
        return ((Number) this.f29879e.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.sdk.BaseAdapter<*>");
        Object item = ((BaseAdapter) adapter).getItem(childAdapterPosition);
        if (item instanceof CommonHeadObject) {
            int iM35138i = m35138i();
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iM66565c = (int) C27025c.m66565c(context, 24);
            int iM35138i2 = m35138i();
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            outRect.set(iM35138i, iM66565c, iM35138i2, (int) C27025c.m66565c(context2, 20));
            return;
        }
        if (!(item instanceof RecommendObject)) {
            if (item instanceof ButtonObject) {
                if (this.f29878d) {
                    outRect.set(0, 0, 0, m35138i());
                    return;
                }
                int iM35138i3 = m35138i();
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                outRect.set(iM35138i3, (int) C27025c.m66565c(context3, 40), m35138i(), m35139j());
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter2 = parent.getAdapter();
        Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.kubi.sdk.BaseAdapter<*>");
        List data = ((BaseAdapter) adapter2).getData();
        if (data != null) {
            listEmptyList = new ArrayList();
            for (Object obj : data) {
                if (obj instanceof RecommendObject) {
                    listEmptyList.add(obj);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (this.f29878d) {
            if (listEmptyList.indexOf(item) % 2 != 0) {
                outRect.set(0, 0, 0, m35138i());
                return;
            } else if (C5303w0.m6511a()) {
                outRect.set(m35141l(), 0, 0, m35138i());
                return;
            } else {
                outRect.set(0, 0, m35141l(), m35138i());
                return;
            }
        }
        if (listEmptyList.indexOf(item) % 2 == 0) {
            if (C5303w0.m6511a()) {
                outRect.set(m35140k(), 0, m35138i(), m35138i());
                return;
            } else {
                outRect.set(m35138i(), 0, m35140k(), m35138i());
                return;
            }
        }
        if (C5303w0.m6511a()) {
            outRect.set(m35138i(), 0, m35140k(), m35138i());
        } else {
            outRect.set(m35140k(), 0, m35138i(), m35138i());
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m35141l() {
        return ((Number) this.f29880f.getValue()).intValue();
    }

    public QuotesRecommendDecoration(boolean z11) {
        this.f29878d = z11;
    }
}
