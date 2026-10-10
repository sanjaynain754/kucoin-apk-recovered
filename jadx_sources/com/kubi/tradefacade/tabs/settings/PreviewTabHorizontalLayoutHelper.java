package com.kubi.tradefacade.tabs.settings;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import b40.TradeTabSortData;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradefacade.R$color;
import com.kubi.tradefacade.tabs.data.C26001a;
import com.kubi.tradefacade.tabs.data.TabBiz;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.tradefacade.tabs.settings.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PreviewTabHorizontalLayoutHelper.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\nJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u001c\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/settings/PreviewTabHorizontalLayoutHelper;", "", "horizontalLayout", "Landroid/widget/HorizontalScrollView;", "tabContainerLayout", "Landroid/widget/LinearLayout;", "<init>", "(Landroid/widget/HorizontalScrollView;Landroid/widget/LinearLayout;)V", "cacheTabViewMap", "", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "Lcom/kubi/resources/widget/BaseTextView;", "updateTabLayout", "", "tabList", "", "Lcom/kubi/tradefacade/tabs/data/TradeTabSortData;", "selectedBiz", "createTabTextView", "context", "Landroid/content/Context;", "data", "scrollTabIntoView", "tabView", "Landroid/view/View;", "scrollView", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPreviewTabHorizontalLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewTabHorizontalLayoutHelper.kt\ncom/kubi/tradefacade/tabs/settings/PreviewTabHorizontalLayoutHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n774#2:82\n865#2,2:83\n1878#2,3:85\n*S KotlinDebug\n*F\n+ 1 PreviewTabHorizontalLayoutHelper.kt\ncom/kubi/tradefacade/tabs/settings/PreviewTabHorizontalLayoutHelper\n*L\n32#1:82\n32#1:83,2\n32#1:85,3\n*E\n"})
public final class PreviewTabHorizontalLayoutHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HorizontalScrollView f52027a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LinearLayout f52028b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<TabBiz, BaseTextView> f52029c;

    public PreviewTabHorizontalLayoutHelper(@NotNull HorizontalScrollView horizontalLayout, @NotNull LinearLayout tabContainerLayout) {
        Intrinsics.checkNotNullParameter(horizontalLayout, "horizontalLayout");
        Intrinsics.checkNotNullParameter(tabContainerLayout, "tabContainerLayout");
        this.f52027a = horizontalLayout;
        this.f52028b = tabContainerLayout;
        this.f52029c = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: g */
    public static final void m63657g(PreviewTabHorizontalLayoutHelper previewTabHorizontalLayoutHelper, TabBiz tabBiz) {
        previewTabHorizontalLayoutHelper.m63659d(previewTabHorizontalLayoutHelper.f52029c.get(tabBiz), previewTabHorizontalLayoutHelper.f52027a);
    }

    /* JADX INFO: renamed from: c */
    public final BaseTextView m63658c(Context context, TradeTabSortData tradeTabSortData, TabBiz tabBiz) {
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setText(context.getString(C26001a.m63615a(tradeTabSortData.getBiz())));
        baseTextView.setTextSize(16.0f);
        baseTextView.setGravity(1);
        baseTextView.setTextColor(C27046k.m66699n(context, Intrinsics.areEqual(tradeTabSortData.getBiz(), tabBiz) ? R$color.c_text : R$color.c_text40));
        baseTextView.setPadding(C5275i0.m6236a(8.0f), 0, C5275i0.m6236a(8.0f), 0);
        return baseTextView;
    }

    /* JADX INFO: renamed from: d */
    public final void m63659d(final View view, final HorizontalScrollView horizontalScrollView) {
        if (view == null || horizontalScrollView == null) {
            return;
        }
        horizontalScrollView.post(new Runnable() { // from class: com.kubi.tradefacade.tabs.settings.b
            @Override // java.lang.Runnable
            public final void run() {
                PreviewTabHorizontalLayoutHelper.m63656e(view, horizontalScrollView);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m63660f(@NotNull List<TradeTabSortData> tabList, @NotNull final TabBiz selectedBiz) {
        Intrinsics.checkNotNullParameter(tabList, "tabList");
        Intrinsics.checkNotNullParameter(selectedBiz, "selectedBiz");
        LinearLayout linearLayout = this.f52028b;
        linearLayout.removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (Object obj : tabList) {
            if (!((TradeTabSortData) obj).getIsHide()) {
                arrayList.add(obj);
            }
        }
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TradeTabSortData tradeTabSortData = (TradeTabSortData) obj2;
            BaseTextView baseTextViewM63658c = this.f52029c.get(tradeTabSortData.getBiz());
            if (baseTextViewM63658c == null) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                baseTextViewM63658c = m63658c(context, tradeTabSortData, selectedBiz);
                this.f52029c.put(tradeTabSortData.getBiz(), baseTextViewM63658c);
            }
            linearLayout.addView(baseTextViewM63658c);
            i11 = i12;
        }
        linearLayout.post(new Runnable() { // from class: com.kubi.tradefacade.tabs.settings.a
            @Override // java.lang.Runnable
            public final void run() {
                PreviewTabHorizontalLayoutHelper.m63657g(this.f52023b, selectedBiz);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final void m63656e(View view, HorizontalScrollView horizontalScrollView) {
        int left = view.getLeft();
        int right = view.getRight();
        int scrollX = horizontalScrollView.getScrollX();
        int width = horizontalScrollView.getWidth();
        if (left < scrollX) {
            horizontalScrollView.smoothScrollTo(left, 0);
        } else if (right > scrollX + width) {
            horizontalScrollView.smoothScrollTo(right - width, 0);
        }
    }
}
