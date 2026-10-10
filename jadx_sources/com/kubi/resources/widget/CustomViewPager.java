package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.resources.exception.UiKitException;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CustomViewPager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J7\u0010 \u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m90084d2 = {"Lcom/kubi/resources/widget/CustomViewPager;", "Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "isCanScroll", "", "setScanScroll", "(Z)V", "useAnim", "setUseAnim", "", "className", "setIgnoreViewClass", "(Ljava/lang/String;)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Landroid/view/View;", "v", "checkV", "", "dx", "x", "y", "canScroll", "(Landroid/view/View;ZIII)Z", "item", "setCurrentItem", "(I)V", "f", "Z", "g", "mUseAnim", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/String;", "ignoreViewClass", "LUIKit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCustomViewPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomViewPager.kt\ncom/kubi/resources/widget/CustomViewPager\n+ 2 UiKitIssue.kt\ncom/kubi/resources/exception/UiKitIssueKt\n*L\n1#1,108:1\n44#2,2:109\n44#2,2:111\n*S KotlinDebug\n*F\n+ 1 CustomViewPager.kt\ncom/kubi/resources/widget/CustomViewPager\n*L\n58#1:109,2\n73#1:111,2\n*E\n"})
public class CustomViewPager extends RtlViewPager {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isCanScroll;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean mUseAnim;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String ignoreViewClass;

    public CustomViewPager(@Nullable Context context) {
        super(context);
        this.isCanScroll = true;
        this.mUseAnim = true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(@NotNull View v11, boolean checkV, int dx2, int x11, int y11) {
        int i11;
        Intrinsics.checkNotNullParameter(v11, "v");
        if (v11 instanceof ViewGroup) {
            int scrollX = v11.getScrollX();
            int scrollY = v11.getScrollY();
            ViewGroup viewGroup = (ViewGroup) v11;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View child = viewGroup.getChildAt(childCount);
                int i12 = x11 + scrollX;
                if (i12 >= child.getLeft() && i12 < child.getRight() && (i11 = y11 + scrollY) >= child.getTop() && i11 < child.getBottom()) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    if (canScroll(child, true, dx2, i12 - child.getLeft(), i11 - child.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (Intrinsics.areEqual(v11.getClass().getName(), this.ignoreViewClass)) {
            return checkV;
        }
        return checkV && v11.canScrollHorizontally(-dx2);
    }

    @Override // com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        try {
            return this.isCanScroll && super.onInterceptTouchEvent(ev2);
        } catch (IllegalArgumentException e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            if (StringsKt.contains$default((CharSequence) message, (CharSequence) "pointerIndex out of range", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "invalid pointerIndex", false, 2, (Object) null)) {
                C43840a.m96550d(message, "CustomViewPager");
            } else {
                C43846g.m96568c(new UiKitException(e11, "CustomViewPager", false, null, 8, null), null, 2, null);
            }
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        try {
            return this.isCanScroll && super.onTouchEvent(ev2);
        } catch (IllegalArgumentException e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            if (StringsKt.contains$default((CharSequence) message, (CharSequence) "pointerIndex out of range", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "invalid pointerIndex", false, 2, (Object) null)) {
                C43840a.m96550d(message, "CustomViewPager");
            } else {
                C43846g.m96568c(new UiKitException(e11, "CustomViewPager", false, null, 8, null), null, 2, null);
            }
            return false;
        }
    }

    @Override // com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, this.mUseAnim);
    }

    public final void setIgnoreViewClass(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        this.ignoreViewClass = className;
    }

    public final void setScanScroll(boolean isCanScroll) {
        this.isCanScroll = isCanScroll;
    }

    public void setUseAnim(boolean useAnim) {
        this.mUseAnim = useAnim;
    }

    public CustomViewPager(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isCanScroll = true;
        this.mUseAnim = true;
    }
}
