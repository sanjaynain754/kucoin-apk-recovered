package com.kubi.assets.sort;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.assets.R$color;
import com.kubi.assets.R$font;
import com.kubi.p110rn.Constants;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.C27017c;
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

/* JADX INFO: renamed from: com.kubi.assets.sort.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AccountPreviewTabLayoutHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\nJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u001c\u0010\u0019\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountPreviewTabLayoutHelper;", "", "horizontalLayout", "Landroid/widget/HorizontalScrollView;", "tabContainerLayout", "Landroid/widget/LinearLayout;", "<init>", "(Landroid/widget/HorizontalScrollView;Landroid/widget/LinearLayout;)V", "cacheTabViewMap", "", "Lcom/kubi/assets/sort/AccountBiz;", "Lcom/kubi/resources/widget/BaseTextView;", "updateTabLayout", "", "tabList", "", "Lcom/kubi/assets/sort/AccountTabSortData;", "selectedBiz", "createTabTextView", "context", "Landroid/content/Context;", "data", "updateTabViewStyle", "tabView", Constants.BIZ, "scrollTabIntoView", "Landroid/view/View;", "scrollView", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountPreviewTabLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPreviewTabLayoutHelper.kt\ncom/kubi/assets/sort/AccountPreviewTabLayoutHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n774#2:103\n865#2,2:104\n1878#2,3:106\n*S KotlinDebug\n*F\n+ 1 AccountPreviewTabLayoutHelper.kt\ncom/kubi/assets/sort/AccountPreviewTabLayoutHelper\n*L\n34#1:103\n34#1:104,2\n34#1:106,3\n*E\n"})
public final class AccountPreviewTabLayoutHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HorizontalScrollView f18780a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LinearLayout f18781b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<AccountBiz, BaseTextView> f18782c;

    public AccountPreviewTabLayoutHelper(@NotNull HorizontalScrollView horizontalLayout, @NotNull LinearLayout tabContainerLayout) {
        Intrinsics.checkNotNullParameter(horizontalLayout, "horizontalLayout");
        Intrinsics.checkNotNullParameter(tabContainerLayout, "tabContainerLayout");
        this.f18780a = horizontalLayout;
        this.f18781b = tabContainerLayout;
        this.f18782c = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: g */
    public static final void m19345g(AccountPreviewTabLayoutHelper accountPreviewTabLayoutHelper, AccountBiz accountBiz) {
        accountPreviewTabLayoutHelper.m19347d(accountPreviewTabLayoutHelper.f18782c.get(accountBiz), accountPreviewTabLayoutHelper.f18780a);
    }

    /* JADX INFO: renamed from: c */
    public final BaseTextView m19346c(Context context, AccountTabSortData accountTabSortData, AccountBiz accountBiz) {
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setText(C10995j.m19356a(accountTabSortData.getBiz()));
        baseTextView.setTextSize(16.0f);
        baseTextView.setGravity(1);
        baseTextView.setTextColor(C27046k.m66699n(context, R$color.c_text40));
        baseTextView.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        baseTextView.setPadding(C5275i0.m6236a(8.0f), 0, C5275i0.m6236a(8.0f), 0);
        return baseTextView;
    }

    /* JADX INFO: renamed from: d */
    public final void m19347d(final View view, final HorizontalScrollView horizontalScrollView) {
        if (view == null || horizontalScrollView == null) {
            return;
        }
        horizontalScrollView.post(new Runnable() { // from class: com.kubi.assets.sort.b
            @Override // java.lang.Runnable
            public final void run() {
                AccountPreviewTabLayoutHelper.m19344e(view, horizontalScrollView);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m19348f(@NotNull List<AccountTabSortData> tabList, @NotNull final AccountBiz selectedBiz) {
        Intrinsics.checkNotNullParameter(tabList, "tabList");
        Intrinsics.checkNotNullParameter(selectedBiz, "selectedBiz");
        LinearLayout linearLayout = this.f18781b;
        linearLayout.removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (Object obj : tabList) {
            if (!((AccountTabSortData) obj).getIsHide()) {
                arrayList.add(obj);
            }
        }
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AccountTabSortData accountTabSortData = (AccountTabSortData) obj2;
            BaseTextView baseTextViewM19346c = this.f18782c.get(accountTabSortData.getBiz());
            if (baseTextViewM19346c == null) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                baseTextViewM19346c = m19346c(context, accountTabSortData, selectedBiz);
                this.f18782c.put(accountTabSortData.getBiz(), baseTextViewM19346c);
            }
            m19349h(baseTextViewM19346c, accountTabSortData.getBiz(), selectedBiz);
            linearLayout.addView(baseTextViewM19346c);
            i11 = i12;
        }
        linearLayout.post(new Runnable() { // from class: com.kubi.assets.sort.a
            @Override // java.lang.Runnable
            public final void run() {
                AccountPreviewTabLayoutHelper.m19345g(this.f18776b, selectedBiz);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m19349h(BaseTextView baseTextView, AccountBiz accountBiz, AccountBiz accountBiz2) {
        int i11 = R$color.c_text40;
        Context context = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        baseTextView.setTextColor(C27046k.m66699n(context, i11));
        baseTextView.setTypeface(ResourcesCompat.getFont(C27017c.f54310a.m66513b(), R$font.regular));
    }

    /* JADX INFO: renamed from: e */
    public static final void m19344e(View view, HorizontalScrollView horizontalScrollView) {
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
