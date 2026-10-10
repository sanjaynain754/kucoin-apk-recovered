package com.kubi.home.v2.container.p088ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HandleTouchRecyclerView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/HandleTouchRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "touchHandler", "Lcom/kubi/home/v2/container/ui/HandleTouchRecyclerView$TouchHandler;", "getTouchHandler", "()Lcom/kubi/home/v2/container/ui/HandleTouchRecyclerView$TouchHandler;", "setTouchHandler", "(Lcom/kubi/home/v2/container/ui/HandleTouchRecyclerView$TouchHandler;)V", "onInterceptTouchEvent", "", "e", "Landroid/view/MotionEvent;", "onTouchEvent", "TouchHandler", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HandleTouchRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC15004a f26549b;

    /* JADX INFO: renamed from: com.kubi.home.v2.container.ui.HandleTouchRecyclerView$a */
    /* JADX INFO: compiled from: HandleTouchRecyclerView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/HandleTouchRecyclerView$TouchHandler;", "", "onTouchEvent", "", "e", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "interceptTouchEvent", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC15004a {
        @Nullable
        /* JADX INFO: renamed from: b */
        Boolean mo30867b(@NotNull MotionEvent motionEvent);

        @Nullable
        /* JADX INFO: renamed from: c */
        Boolean mo30868c(@NotNull MotionEvent motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HandleTouchRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HandleTouchRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    /* JADX INFO: renamed from: getTouchHandler, reason: from getter */
    public final InterfaceC15004a getF26549b() {
        return this.f26549b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e11) {
        Boolean boolMo30868c;
        Intrinsics.checkNotNullParameter(e11, "e");
        InterfaceC15004a interfaceC15004a = this.f26549b;
        return (interfaceC15004a == null || (boolMo30868c = interfaceC15004a.mo30868c(e11)) == null) ? super.onInterceptTouchEvent(e11) : boolMo30868c.booleanValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent e11) {
        Boolean boolMo30867b;
        Intrinsics.checkNotNullParameter(e11, "e");
        InterfaceC15004a interfaceC15004a = this.f26549b;
        return (interfaceC15004a == null || (boolMo30867b = interfaceC15004a.mo30867b(e11)) == null) ? super.onTouchEvent(e11) : boolMo30867b.booleanValue();
    }

    public final void setTouchHandler(@Nullable InterfaceC15004a interfaceC15004a) {
        this.f26549b = interfaceC15004a;
    }

    public /* synthetic */ HandleTouchRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HandleTouchRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
