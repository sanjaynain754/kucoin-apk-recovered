package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.util.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuickViewHolder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u0003J\u0010\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u0003J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0003J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0003J\u0018\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0012J\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u001a\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\"\u001a\u00020\u0003J\u0018\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u001a\u0010$\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010&J\u001a\u0010$\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010'\u001a\u00020\u0003J\u001a\u0010(\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0003J\u001a\u0010)\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010*\u001a\u00020\u0003J\u0018\u0010+\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0012J\u001b\u0010-\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\b*\u00020\u0003¢\u0006\u0002\u0010\u000fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/chad/library/adapter/base/viewholder/QuickViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "resId", "", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "views", "Landroid/util/SparseArray;", "getView", ExifInterface.GPS_DIRECTION_TRUE, "viewId", "(I)Landroid/view/View;", "getViewOrNull", Constants.ENABLE_DISABLE, "", "isSelected", "setBackgroundColor", "color", "setBackgroundResource", "backgroundRes", "setEnabled", "setGone", "isGone", "setImageBitmap", "bitmap", "Landroid/graphics/Bitmap;", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageResource", "imageResId", "setSelected", "setText", "value", "", "strId", "setTextColor", "setTextColorRes", "colorRes", "setVisible", "isVisible", "findView", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuickViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickViewHolder.kt\ncom/chad/library/adapter/base/viewholder/QuickViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public class QuickViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.views = new SparseArray<>();
    }

    @NotNull
    public final QuickViewHolder setText(@IdRes int viewId, @Nullable CharSequence value) {
        ((TextView) getView(viewId)).setText(value);
        return this;
    }

    @Nullable
    public final <T extends View> T findView(int i11) {
        return (T) this.itemView.findViewById(i11);
    }

    @Nullable
    public final <T extends View> T getViewOrNull(@IdRes int viewId) {
        T t11 = (T) this.views.get(viewId);
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) this.itemView.findViewById(viewId);
        if (t12 == null) {
            return null;
        }
        this.views.put(viewId, t12);
        return t12;
    }

    @NotNull
    public final QuickViewHolder setText(@IdRes int viewId, @StringRes int strId) {
        ((TextView) getView(viewId)).setText(strId);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickViewHolder(@LayoutRes int i11, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(i11, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inflate(resId, parent, false)");
        this(viewInflate);
    }

    @NotNull
    public final <T extends View> T getView(@IdRes int viewId) {
        T t11 = (T) getViewOrNull(viewId);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(("No view found with id " + viewId).toString());
    }

    public final boolean isEnabled(@IdRes int viewId) {
        return getView(viewId).isEnabled();
    }

    public final boolean isSelected(@IdRes int viewId) {
        return getView(viewId).isSelected();
    }

    @NotNull
    public final QuickViewHolder setBackgroundColor(@IdRes int viewId, @ColorInt int color) {
        getView(viewId).setBackgroundColor(color);
        return this;
    }

    @NotNull
    public final QuickViewHolder setBackgroundResource(@IdRes int viewId, @DrawableRes int backgroundRes) {
        getView(viewId).setBackgroundResource(backgroundRes);
        return this;
    }

    @NotNull
    public final QuickViewHolder setEnabled(@IdRes int viewId, boolean isEnabled) {
        getView(viewId).isSelected();
        getView(viewId).setEnabled(isEnabled);
        return this;
    }

    @NotNull
    public final QuickViewHolder setGone(@IdRes int viewId, boolean isGone) {
        int i11;
        View view = getView(viewId);
        if (isGone) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        return this;
    }

    @NotNull
    public final QuickViewHolder setImageBitmap(@IdRes int viewId, @Nullable Bitmap bitmap) {
        ((ImageView) getView(viewId)).setImageBitmap(bitmap);
        return this;
    }

    @NotNull
    public final QuickViewHolder setImageDrawable(@IdRes int viewId, @Nullable Drawable drawable) {
        ((ImageView) getView(viewId)).setImageDrawable(drawable);
        return this;
    }

    @NotNull
    public final QuickViewHolder setImageResource(@IdRes int viewId, @DrawableRes int imageResId) {
        ((ImageView) getView(viewId)).setImageResource(imageResId);
        return this;
    }

    @NotNull
    public final QuickViewHolder setSelected(@IdRes int viewId, boolean isSelected) {
        getView(viewId).setSelected(isSelected);
        return this;
    }

    @NotNull
    public final QuickViewHolder setTextColor(@IdRes int viewId, @ColorInt int color) {
        ((TextView) getView(viewId)).setTextColor(color);
        return this;
    }

    @NotNull
    public final QuickViewHolder setTextColorRes(@IdRes int viewId, @ColorRes int colorRes) {
        ((TextView) getView(viewId)).setTextColor(ContextCompat.getColor(this.itemView.getContext(), colorRes));
        return this;
    }

    @NotNull
    public final QuickViewHolder setVisible(@IdRes int viewId, boolean isVisible) {
        int i11;
        View view = getView(viewId);
        if (isVisible) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        view.setVisibility(i11);
        return this;
    }
}
