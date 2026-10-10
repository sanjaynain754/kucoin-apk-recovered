package com.jumio.core.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.ScreenUtilKt;
import com.jumio.core.C9301R;
import com.jumio.core.views.BaseBrandingView;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import jumio.core.AbstractC40707p;
import jumio.core.C40580P3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0007H\u0014J\b\u0010$\u001a\u00020\u000eH\u0002J\u0016\u0010%\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0'H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/jumio/core/views/BaseBrandingView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "viewTag", "", "drawableResId", "", "tintColorId", "<init>", "(Landroid/content/Context;Ljava/lang/String;II)V", "brandingImageView", "Landroid/widget/ImageView;", "addView", "", "child", "Landroid/view/View;", "index", ReportDataTable.COLUMN_PARAMS, "Landroid/view/ViewGroup$LayoutParams;", "width", "height", "removeAllViews", "removeAllViewsInLayout", "removeViewAt", "removeView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "removeViewInLayout", "removeViews", "start", "count", "removeViewsInLayout", "setVisibility", "visibility", "onVisibilityChanged", "changedView", "ignoreRemove", "maybeIgnoreAdd", "func", "Lkotlin/Function0;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public abstract class BaseBrandingView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final C40580P3 f14583a;

    public /* synthetic */ BaseBrandingView(Context context, String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, i11, (i13 & 8) != 0 ? C9301R.color.jumio_black : i12);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14602a(BaseBrandingView baseBrandingView, View view) {
        super.addView(view);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable final View child) {
        Function0 function0 = new Function0() { // from class: y9.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseBrandingView.m14602a(this.f104077b, child);
            }
        };
        if (getChildCount() > 0) {
            Log.m14463d("BrandingView", "Tried to add child views, ignoring...");
        } else {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (visibility != 4 && visibility != 8) {
            super.setVisibility(visibility);
            return;
        }
        Log.m14463d("BrandingView", "Tried to set visibility: " + AbstractC40707p.m89261a(visibility) + ", ignoring...");
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14603a(BaseBrandingView baseBrandingView, View view, int i11) {
        super.addView(view, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final void m14607b(BaseBrandingView baseBrandingView, View view) {
        baseBrandingView.f14583a.setVisibility(0);
        view.setVisibility(0);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull final View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (Intrinsics.areEqual(changedView, this)) {
            if (visibility == 8 || visibility == 4) {
                Log.m14463d("BrandingView", "Visibility changed to: " + AbstractC40707p.m89261a(visibility) + ". Resetting...");
                post(new Runnable() { // from class: y9.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseBrandingView.m14607b(this.f104061b, changedView);
                    }
                });
            }
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        Log.m14463d("BrandingView", "Tried to remove child views, ignoring...");
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        Log.m14463d("BrandingView", "Tried to remove child views, ignoring...");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@Nullable View view) {
        Log.m14463d("BrandingView", "Tried to remove child views, ignoring...");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        Log.m14463d("BrandingView", "Tried to remove child views, ignoring...");
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@Nullable View view) {
        Log.m14463d("BrandingView", "Tried to remove child views, ignoring...");
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        Log.m14463d("BrandingView", "Tried to remove child views, ignoring...");
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        Log.m14463d("BrandingView", "Tried to remove child views, ignoring...");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBrandingView(@NotNull Context context, @NotNull String viewTag, int i11, int i12) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        int iDpToPx = ScreenUtilKt.dpToPx(24, context);
        setTag(viewTag);
        setOrientation(1);
        setPadding(iDpToPx, 0, iDpToPx, 0);
        C40580P3 c40580p3 = new C40580P3(context);
        c40580p3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c40580p3.setAdjustViewBounds(true);
        Drawable drawable = ResourcesCompat.getDrawable(c40580p3.getResources(), i11, context.getTheme());
        if (drawable != null) {
            DrawableCompat.setTint(DrawableCompat.wrap(drawable), ResourcesCompat.getColor(c40580p3.getResources(), i12, context.getTheme()));
            c40580p3.setImageDrawable(drawable);
        }
        this.f14583a = c40580p3;
        addView(c40580p3);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14606a(BaseBrandingView baseBrandingView, View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14605a(BaseBrandingView baseBrandingView, View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable final View child, final int index) {
        Function0 function0 = new Function0() { // from class: y9.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseBrandingView.m14603a(this.f104070b, child, index);
            }
        };
        if (getChildCount() > 0) {
            Log.m14463d("BrandingView", "Tried to add child views, ignoring...");
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14604a(BaseBrandingView baseBrandingView, View view, int i11, int i12) {
        super.addView(view, i11, i12);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable final View child, @Nullable final ViewGroup.LayoutParams params) {
        Function0 function0 = new Function0() { // from class: y9.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseBrandingView.m14606a(this.f104063b, child, params);
            }
        };
        if (getChildCount() > 0) {
            Log.m14463d("BrandingView", "Tried to add child views, ignoring...");
        } else {
            function0.invoke();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable final View child, final int index, @Nullable final ViewGroup.LayoutParams params) {
        Function0 function0 = new Function0() { // from class: y9.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseBrandingView.m14605a(this.f104073b, child, index, params);
            }
        };
        if (getChildCount() > 0) {
            Log.m14463d("BrandingView", "Tried to add child views, ignoring...");
        } else {
            function0.invoke();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable final View child, final int width, final int height) {
        Function0 function0 = new Function0() { // from class: y9.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseBrandingView.m14604a(this.f104066b, child, width, height);
            }
        };
        if (getChildCount() > 0) {
            Log.m14463d("BrandingView", "Tried to add child views, ignoring...");
        } else {
            function0.invoke();
        }
    }
}
