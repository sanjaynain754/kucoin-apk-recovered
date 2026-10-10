package com.tencent.bugly.common.replay.tool;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.common.replay.BuglyReplayOptions;
import com.tencent.bugly.common.replay.viewhierarchy.ComposeViewHierarchyNode;
import com.tencent.bugly.common.replay.viewhierarchy.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u00020\u0012*\u0004\u0018\u00010\u0013H\u0001\u001a\u001a\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0015*\u00020\u0007H\u0000\u001a\u0016\u0010\u0016\u001a\u00020\u0006*\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u001c\u0010\u0018\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001d"}, m90084d2 = {"totalPaddingTopSafe", "", "Landroid/widget/TextView;", "getTotalPaddingTopSafe", "(Landroid/widget/TextView;)I", "addOnDrawListenerSafe", "", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/ViewTreeObserver$OnDrawListener;", "getVisibleRects", "", "Landroid/graphics/Rect;", "Lcom/tencent/bugly/common/replay/tool/TextLayout;", "globalRect", ViewProps.PADDING_LEFT, ViewProps.PADDING_TOP, "isMaskable", "", "Landroid/graphics/drawable/Drawable;", "isVisibleToUser", "Lkotlin/Pair;", "removeOnDrawListenerSafe", "toOpaque", "traverse", "parentNode", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "options", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "bugly-pro_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ViewsKt {
    public static final void addOnDrawListenerSafe(@Nullable View view, @NotNull ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int getTotalPaddingTopSafe(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    @NotNull
    public static final List<Rect> getVisibleRects(@Nullable TextLayout textLayout, @NotNull Rect globalRect, int i11, int i12) {
        Intrinsics.checkNotNullParameter(globalRect, "globalRect");
        if (textLayout == null) {
            return CollectionsKt.listOf(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int lineCount = textLayout.getLineCount();
        for (int i13 = 0; i13 < lineCount; i13++) {
            int primaryHorizontal = (int) textLayout.getPrimaryHorizontal(i13, textLayout.getLineStart(i13));
            int ellipsisCount = textLayout.getEllipsisCount(i13);
            int lineVisibleEnd = textLayout.getLineVisibleEnd(i13);
            int primaryHorizontal2 = (int) textLayout.getPrimaryHorizontal(i13, (lineVisibleEnd - ellipsisCount) + (ellipsisCount > 0 ? 1 : 0));
            if (primaryHorizontal2 == 0 && lineVisibleEnd > 0) {
                primaryHorizontal2 = ((int) textLayout.getPrimaryHorizontal(i13, lineVisibleEnd - 1)) + 1;
            }
            int lineTop = textLayout.getLineTop(i13);
            int lineBottom = textLayout.getLineBottom(i13);
            Rect rect = new Rect();
            int i14 = globalRect.left + i11 + primaryHorizontal;
            rect.left = i14;
            rect.right = (primaryHorizontal2 - primaryHorizontal) + i14;
            int i15 = globalRect.top + i12 + lineTop;
            rect.top = i15;
            rect.bottom = (lineBottom - lineTop) + i15;
            arrayList.add(rect);
        }
        return arrayList;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @TargetApi(21)
    public static final boolean isMaskable(@Nullable Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    @NotNull
    public static final Pair<Boolean, Rect> isVisibleToUser(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return TuplesKt.m90091to(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return TuplesKt.m90091to(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return TuplesKt.m90091to(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return TuplesKt.m90091to(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void removeOnDrawListenerSafe(@Nullable View view, @NotNull ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int toOpaque(int i11) {
        return i11 | ViewCompat.MEASURED_STATE_MASK;
    }

    public static final void traverse(@NotNull View view, @NotNull ViewHierarchyNode parentNode, @NotNull BuglyReplayOptions options) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        if ((view instanceof ViewGroup) && !ComposeViewHierarchyNode.INSTANCE.fromView(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.INSTANCE.fromView(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(viewHierarchyNodeFromView);
                    traverse(childAt, viewHierarchyNodeFromView, options);
                }
            }
            parentNode.setChildren(arrayList);
        }
    }
}
