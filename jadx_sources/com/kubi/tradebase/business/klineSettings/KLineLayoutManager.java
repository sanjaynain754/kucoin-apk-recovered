package com.kubi.tradebase.business.klineSettings;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KLineLayoutManager.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KLineLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onLayoutCompleted", "", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getTotalItemWidth", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KLineLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Context f51514b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineLayoutManager(@NotNull Context context) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51514b = context;
    }

    /* JADX INFO: renamed from: a */
    public final int m63113a() {
        int itemCount = getItemCount();
        int measuredWidth = 0;
        for (int i11 = 0; i11 < itemCount; i11++) {
            View viewFindViewByPosition = findViewByPosition(i11);
            if (viewFindViewByPosition != null) {
                measuredWidth += viewFindViewByPosition.getMeasuredWidth();
            }
        }
        return measuredWidth;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(@Nullable RecyclerView.State state) {
        ViewGroup.LayoutParams layoutParams;
        RecyclerView.LayoutParams layoutParams2;
        int i11;
        ViewGroup.LayoutParams layoutParams3;
        RecyclerView.LayoutParams layoutParams4;
        super.onLayoutCompleted(state);
        int i12 = 0;
        if (getItemCount() == 5) {
            int width = getWidth() - m63113a();
            int itemCount = getItemCount();
            if (itemCount > 0 && width > 0) {
                i11 = width / itemCount;
            } else {
                i11 = 0;
            }
            int itemCount2 = getItemCount();
            while (i12 < itemCount2) {
                View viewFindViewByPosition = findViewByPosition(i12);
                if (viewFindViewByPosition != null) {
                    layoutParams3 = viewFindViewByPosition.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                if (layoutParams3 instanceof RecyclerView.LayoutParams) {
                    layoutParams4 = (RecyclerView.LayoutParams) layoutParams3;
                } else {
                    layoutParams4 = null;
                }
                if (layoutParams4 != null) {
                    layoutParams4.setMarginEnd(i11);
                }
                if (viewFindViewByPosition != null) {
                    viewFindViewByPosition.setLayoutParams(layoutParams4);
                }
                i12++;
            }
            return;
        }
        int itemCount3 = getItemCount();
        while (i12 < itemCount3) {
            View viewFindViewByPosition2 = findViewByPosition(i12);
            if (viewFindViewByPosition2 != null) {
                layoutParams = viewFindViewByPosition2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd((int) C27025c.m66565c(this.f51514b, 6));
            }
            if (viewFindViewByPosition2 != null) {
                viewFindViewByPosition2.setLayoutParams(layoutParams2);
            }
            i12++;
        }
    }
}
