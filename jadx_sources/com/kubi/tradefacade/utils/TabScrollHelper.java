package com.kubi.tradefacade.utils;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.resources.widget.RadioGroupPlus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.tradefacade.utils.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TabScrollHelper.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/tradefacade/utils/TabScrollHelper;", "", "<init>", "()V", "adjustScrollIfNeeded", "", "scrollView", "Landroid/widget/HorizontalScrollView;", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "(Landroid/widget/HorizontalScrollView;Lcom/kubi/resources/widget/RadioGroupPlus;Ljava/lang/Integer;)V", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TabScrollHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TabScrollHelper f52044a = new TabScrollHelper();

    /* JADX INFO: renamed from: b */
    public final void m63676b(@Nullable final HorizontalScrollView horizontalScrollView, @Nullable final RadioGroupPlus radioGroupPlus, @Nullable final Integer num) {
        if (horizontalScrollView == null || radioGroupPlus == null || num == null) {
            return;
        }
        horizontalScrollView.post(new Runnable() { // from class: com.kubi.tradefacade.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                TabScrollHelper.m63675c(radioGroupPlus, num, horizontalScrollView);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m63675c(RadioGroupPlus radioGroupPlus, Integer num, HorizontalScrollView horizontalScrollView) {
        boolean z11;
        int i11;
        View viewFindViewById = radioGroupPlus.findViewById(num.intValue());
        if (viewFindViewById != null) {
            boolean z12 = false;
            int measuredWidth = horizontalScrollView.getChildAt(0).getMeasuredWidth() - horizontalScrollView.getMeasuredWidth();
            int iIndexOfChild = radioGroupPlus.indexOfChild(viewFindViewById);
            if (iIndexOfChild == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (iIndexOfChild == radioGroupPlus.getChildCount() - 1) {
                z12 = true;
            }
            int i12 = 66;
            if (horizontalScrollView.getScrollX() + ViewConfiguration.get(horizontalScrollView.getContext()).getScaledTouchSlop() >= measuredWidth && z11) {
                if (!C5303w0.m6511a()) {
                    i11 = 17;
                } else {
                    i11 = 66;
                }
                horizontalScrollView.fullScroll(i11);
            }
            if (horizontalScrollView.getScrollX() == 0 && z12) {
                if (C5303w0.m6511a()) {
                    i12 = 17;
                }
                horizontalScrollView.fullScroll(i12);
            }
        }
    }
}
