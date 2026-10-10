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

/* JADX INFO: renamed from: com.kubi.kumex.market.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecommendFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/market/DrawerRecommendDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "<init>", "()V", "dp4", "", "getDp4", "()I", "dp4$delegate", "Lkotlin/Lazy;", "dp12", "getDp12", "dp12$delegate", "dp24", "getDp24", "dp24$delegate", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/DrawerRecommendDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,466:1\n808#2,11:467\n*S KotlinDebug\n*F\n+ 1 RecommendFragment.kt\ncom/kubi/kumex/market/DrawerRecommendDecoration\n*L\n446#1:467,11\n*E\n"})
public final class DrawerRecommendDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f29431d = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(DrawerRecommendDecoration.m34395f());
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f29432e = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(DrawerRecommendDecoration.m34393d());
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f29433f = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(DrawerRecommendDecoration.m34394e());
        }
    });

    /* JADX INFO: renamed from: d */
    public static final int m34393d() {
        return (int) C27025c.m66565c(C27017c.f54310a.m66513b(), 16);
    }

    /* JADX INFO: renamed from: e */
    public static final int m34394e() {
        return (int) C27025c.m66565c(C27017c.f54310a.m66513b(), 14);
    }

    /* JADX INFO: renamed from: f */
    public static final int m34395f() {
        return (int) C27025c.m66564b(C27017c.f54310a.m66513b(), 4.0f);
    }

    /* JADX INFO: renamed from: g */
    public final int m34396g() {
        return ((Number) this.f29432e.getValue()).intValue();
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
            int iM34396g = m34396g();
            int iM34396g2 = m34396g();
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            outRect.set(iM34396g, 0, iM34396g2, (int) C27025c.m66565c(context, 10));
            return;
        }
        if (!(item instanceof RecommendObject)) {
            if (item instanceof ButtonObject) {
                int iM34396g3 = m34396g();
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                outRect.set(iM34396g3, (int) C27025c.m66565c(context2, 17), m34396g(), m34397h());
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
        if (listEmptyList.indexOf(item) % 2 == 0) {
            if (C5303w0.m6511a()) {
                outRect.set(m34398i(), 0, m34396g(), m34398i() * 2);
                return;
            } else {
                outRect.set(m34396g(), 0, m34398i(), m34398i() * 2);
                return;
            }
        }
        if (C5303w0.m6511a()) {
            outRect.set(m34396g(), 0, m34398i(), m34398i() * 2);
        } else {
            outRect.set(m34398i(), 0, m34396g(), m34398i() * 2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m34397h() {
        return ((Number) this.f29433f.getValue()).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m34398i() {
        return ((Number) this.f29431d.getValue()).intValue();
    }
}
