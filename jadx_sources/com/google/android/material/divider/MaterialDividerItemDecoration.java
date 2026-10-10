package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    @ColorInt
    private int color;

    @NonNull
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(@NonNull Context context, int i11) {
        this(context, null, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(recyclerView)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    public boolean shouldDrawDivider(int i11, @Nullable RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, C7090R.attr.materialDividerStyle, i11);
    }

    private boolean shouldDrawDivider(@NonNull RecyclerView recyclerView, @NonNull View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, (RecyclerView.Adapter<?>) adapter);
    }

    @ColorInt
    public int getDividerColor() {
        return this.color;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @Px
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    @Px
    public int getDividerThickness() {
        return this.thickness;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    public void setDividerColor(@ColorInt int i11) {
        this.color = i11;
        Drawable drawableWrap = DrawableCompat.wrap(this.dividerDrawable);
        this.dividerDrawable = drawableWrap;
        drawableWrap.setTint(i11);
    }

    public void setDividerInsetEnd(@Px int i11) {
        this.insetEnd = i11;
    }

    public void setDividerInsetStart(@Px int i11) {
        this.insetStart = i11;
    }

    public void setDividerThickness(@Px int i11) {
        this.thickness = i11;
    }

    public void setLastItemDecorated(boolean z11) {
        this.lastItemDecorated = z11;
    }

    public void setOrientation(int i11) {
        if (i11 == 0 || i11 == 1) {
            this.orientation = i11;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i11 + ". It should be either HORIZONTAL or VERTICAL");
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.MaterialDivider, i11, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C7090R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C7090R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7090R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i12);
    }

    private void drawForHorizontalOrientation(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i11;
        int i12;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i13 = paddingTop + this.insetStart;
        int i14 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = recyclerView.getChildAt(i15);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationX());
                if (zIsLayoutRtl) {
                    i12 = this.tempRect.left + iRound;
                    i11 = this.thickness + i12;
                } else {
                    i11 = iRound + this.tempRect.right;
                    i12 = i11 - this.thickness;
                }
                this.dividerDrawable.setBounds(i12, i13, i11, i14);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        int i11;
        int i12;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        if (zIsLayoutRtl) {
            i11 = this.insetEnd;
        } else {
            i11 = this.insetStart;
        }
        int i13 = paddingLeft + i11;
        if (zIsLayoutRtl) {
            i12 = this.insetStart;
        } else {
            i12 = this.insetEnd;
        }
        int i14 = width - i12;
        int childCount = recyclerView.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = recyclerView.getChildAt(i15);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = this.tempRect.bottom + Math.round(childAt.getTranslationY());
                this.dividerDrawable.setBounds(i13, iRound - this.thickness, i14, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColorResource(@NonNull Context context, @ColorRes int i11) {
        setDividerColor(ContextCompat.getColor(context, i11));
    }

    public void setDividerInsetEndResource(@NonNull Context context, @DimenRes int i11) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerInsetStartResource(@NonNull Context context, @DimenRes int i11) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerThicknessResource(@NonNull Context context, @DimenRes int i11) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i11));
    }
}
