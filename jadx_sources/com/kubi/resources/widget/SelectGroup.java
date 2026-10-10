package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SelectGroup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u000bJ\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001c\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001fH\u0002R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, m90084d2 = {"Lcom/kubi/resources/widget/SelectGroup;", "Landroid/widget/LinearLayout;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "value", "", "selected", "getSelected", "()I", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "select", "id", "onChildViewAdded", "parent", "Landroid/view/View;", "child", "onChildViewRemoved", "setSelectedStateForView", "viewId", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectGroup extends LinearLayout implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: b */
    public int f44046b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function2<? super SelectGroup, ? super Integer, Unit> f44047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44046b = -1;
        setOnHierarchyChangeListener(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m54773c(@IdRes int i11) {
        int i12 = this.f44046b;
        if (i11 != i12) {
            m54774d(i12, false);
            m54774d(i11, true);
            this.f44046b = i11;
            Function2<? super SelectGroup, ? super Integer, Unit> function2 = this.f44047c;
            if (function2 != null) {
                function2.invoke(this, Integer.valueOf(i11));
            }
        }
    }

    @Nullable
    public final Function2<SelectGroup, Integer, Unit> getListener() {
        return this.f44047c;
    }

    /* JADX INFO: renamed from: getSelected, reason: from getter */
    public final int getF44046b() {
        return this.f44046b;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(@NotNull View parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (Intrinsics.areEqual(parent, this)) {
            if (child.getId() == -1) {
                child.setId(View.generateViewId());
            }
            child.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.a2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectGroup.m54772b(this.f44235b, view);
                }
            });
        }
    }

    public final void setListener(@Nullable Function2<? super SelectGroup, ? super Integer, Unit> function2) {
        this.f44047c = function2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m54772b(SelectGroup selectGroup, View view) {
        selectGroup.m54773c(view.getId());
    }

    /* JADX INFO: renamed from: d */
    public final void m54774d(int i11, boolean z11) {
        View viewFindViewById = findViewById(i11);
        if (viewFindViewById != null) {
            viewFindViewById.setSelected(z11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectGroup(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(@Nullable View parent, @Nullable View child) {
    }
}
