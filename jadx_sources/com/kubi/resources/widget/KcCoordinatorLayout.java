package com.kubi.resources.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.blankj.utilcode.util.C5258a;
import com.google.android.material.appbar.MaterialToolbar;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.C27046k;
import k00.C40841e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KcCoordinatorLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/KcCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scrollbarBinding", "Lcom/kubi/sdk/res/databinding/KcLayoutScrollbarBinding;", "getScrollbarBinding", "()Lcom/kubi/sdk/res/databinding/KcLayoutScrollbarBinding;", "setScrollbarBinding", "(Lcom/kubi/sdk/res/databinding/KcLayoutScrollbarBinding;)V", JAnalysisConstants.EVENT_ATTRIBUTES, "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKcCoordinatorLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KcCoordinatorLayout.kt\ncom/kubi/resources/widget/KcCoordinatorLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class KcCoordinatorLayout extends CoordinatorLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C40841e f43827b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcCoordinatorLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcCoordinatorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public final void m54536b(Context context, AttributeSet attributeSet) {
        MaterialToolbar materialToolbar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KcCoordinatorLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.KcCoordinatorLayout_kcl_navigationIcon, -1);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.KcCoordinatorLayout_kcl_navigationIconTint, -1);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.KcCoordinatorLayout_kcl_title);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.KcCoordinatorLayout_kcl_titleTextColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        C40841e c40841e = this.f43827b;
        if (c40841e != null && (materialToolbar = c40841e.f90748c) != null) {
            if (resourceId != -1) {
                materialToolbar.setNavigationIcon(resourceId);
            }
            if (color != -1) {
                materialToolbar.setNavigationIconTint(color);
            }
            if (string != null) {
                materialToolbar.setTitle(string);
            }
            if (color2 != -1) {
                materialToolbar.setTitleTextColor(color2);
            }
            materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KcCoordinatorLayout.m54535c(view);
                }
            });
        }
        if (getBackground() == null) {
            setBackgroundColor(C27046k.m66699n(context, R$color.c_overlay));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getScrollbarBinding, reason: from getter */
    public final C40841e getF43827b() {
        return this.f43827b;
    }

    public final void setScrollbarBinding(@Nullable C40841e c40841e) {
        this.f43827b = c40841e;
    }

    public /* synthetic */ KcCoordinatorLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: c */
    public static final void m54535c(View view) {
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h != null) {
            activityM6125h.onBackPressed();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcCoordinatorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43827b = C40841e.m89379c(LayoutInflater.from(context), this, true);
        if (attributeSet != null) {
            m54536b(context, attributeSet);
        }
    }
}
