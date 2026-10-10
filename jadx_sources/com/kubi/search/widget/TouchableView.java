package com.kubi.search.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.kubi.search.utils.SearchExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TouchableView.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0010J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0018H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/search/widget/TouchableView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "flipDistance", "", "x1", "x2", "y1", "y2", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "", "getCallback", "()Lkotlin/jvm/functions/Function0;", "setCallback", "(Lkotlin/jvm/functions/Function0;)V", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "reset", "onTouchEvent", "event", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTouchableView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchableView.kt\ncom/kubi/search/widget/TouchableView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n2756#2:82\n1#3:83\n*S KotlinDebug\n*F\n+ 1 TouchableView.kt\ncom/kubi/search/widget/TouchableView\n*L\n75#1:82\n75#1:83\n*E\n"})
public final class TouchableView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public final float f49185b;

    /* JADX INFO: renamed from: c */
    public float f49186c;

    /* JADX INFO: renamed from: d */
    public float f49187d;

    /* JADX INFO: renamed from: e */
    public float f49188e;

    /* JADX INFO: renamed from: f */
    public float f49189f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function0<Unit> f49190g;

    /* JADX INFO: renamed from: a */
    public final void m59625a() {
        this.f49186c = 0.0f;
        this.f49187d = 0.0f;
        this.f49188e = 0.0f;
        this.f49189f = 0.0f;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49185b = 50.0f;
    }

    @Nullable
    public final Function0<Unit> getCallback() {
        return this.f49190g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            SearchExKt.m59511E("onTouchEvent: ---ACTION_DOWN");
            this.f49186c = event.getX();
            this.f49188e = event.getY();
        } else if (action == 1) {
            SearchExKt.m59511E("onTouchEvent: -----ACTION_UP");
            m59625a();
        } else if (action == 2) {
            SearchExKt.m59511E("onTouchEvent:------ACTION_MOVE ");
            this.f49187d = event.getX();
            float y11 = event.getY();
            this.f49189f = y11;
            float fAbs = Math.abs(y11 - this.f49188e);
            SearchExKt.m59511E("滑动距离:" + fAbs);
            if (fAbs > this.f49185b) {
                Function0<Unit> function0 = this.f49190g;
                if (function0 != null) {
                    function0.invoke();
                }
                SearchExKt.m59511E("向下滑");
            }
        } else if (action == 3) {
            SearchExKt.m59511E("onTouchEvent: -----ACTION_CANCEL");
            m59625a();
        }
        Iterator<Integer> it = RangesKt.until(0, getChildCount()).iterator();
        while (it.hasNext()) {
            getChildAt(((IntIterator) it).nextInt()).dispatchTouchEvent(event);
        }
        return true;
    }

    public final void setCallback(@Nullable Function0<Unit> function0) {
        this.f49190g = function0;
    }
}
