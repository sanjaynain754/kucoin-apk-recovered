package com.kubi.assets.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.kubi.assets.R$drawable;
import com.kubi.resources.widget.ClearEditText;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FocusEditTextLinearLayout.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/view/FocusEditTextLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "needPrimaryBorder", "", "getNeedPrimaryBorder", "()Z", "setNeedPrimaryBorder", "(Z)V", "hasFocus", "getHasFocus", "setHasFocus", "onFinishInflate", "", "setActivated", "activated", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFocusEditTextLinearLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEditTextLinearLayout.kt\ncom/kubi/assets/view/FocusEditTextLinearLayout\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,66:1\n60#2,4:67\n*S KotlinDebug\n*F\n+ 1 FocusEditTextLinearLayout.kt\ncom/kubi/assets/view/FocusEditTextLinearLayout\n*L\n32#1:67,4\n*E\n"})
public class FocusEditTextLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public boolean f19096b;

    /* JADX INFO: renamed from: c */
    public boolean f19097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusEditTextLinearLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX INFO: renamed from: b */
    public static final void m20030b(FocusEditTextLinearLayout focusEditTextLinearLayout, View view, boolean z11) {
        focusEditTextLinearLayout.f19097c = z11;
        focusEditTextLinearLayout.setActivated(focusEditTextLinearLayout.isActivated());
    }

    /* JADX INFO: renamed from: getHasFocus, reason: from getter */
    public final boolean getF19097c() {
        return this.f19097c;
    }

    /* JADX INFO: renamed from: getNeedPrimaryBorder, reason: from getter */
    public final boolean getF19096b() {
        return this.f19096b;
    }

    public final void setHasFocus(boolean z11) {
        this.f19097c = z11;
    }

    public final void setNeedPrimaryBorder(boolean z11) {
        this.f19096b = z11;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getBackground() == null) {
            ArrayList arrayList = new ArrayList();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof ClearEditText) {
                    arrayList.add(childAt);
                }
            }
            if (arrayList.size() != 1) {
                return;
            }
            this.f19096b = true;
            setBackgroundResource(R$drawable.asset_shape_border_emphasis8_40r);
            ((ClearEditText) arrayList.get(0)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.assets.view.r0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    FocusEditTextLinearLayout.m20030b(this.f19149b, view, z11);
                }
            });
        }
    }

    @Override // android.view.View
    public void setActivated(boolean activated) {
        super.setActivated(activated);
        if (this.f19096b) {
            if (this.f19097c) {
                setBackgroundResource(R$drawable.asset_shape_border_primary_40r);
            } else {
                setBackgroundResource(R$drawable.asset_shape_border_emphasis8_40r);
            }
        }
    }
}
