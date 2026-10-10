package io.chad.library.adapter.base;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    private BaseQuickAdapter adapter;
    Object associatedObject;
    private final LinkedHashSet<Integer> childClickViewIds;

    @Deprecated
    public View convertView;
    private final LinkedHashSet<Integer> itemChildLongClickViewIds;
    private final HashSet<Integer> nestViews;
    private final SparseArray<View> views;

    public BaseViewHolder addOnClickListener(@IdRes int... iArr) {
        for (int i11 : iArr) {
            this.childClickViewIds.add(Integer.valueOf(i11));
            View view = getView(i11);
            if (view != null) {
                if (!view.isClickable()) {
                    view.setClickable(true);
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: io.chad.library.adapter.base.BaseViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (BaseViewHolder.this.adapter.getOnItemChildClickListener() != null) {
                            BaseViewHolder.this.adapter.getOnItemChildClickListener().onItemChildClick(BaseViewHolder.this.adapter, view2, BaseViewHolder.this.getClickPosition());
                        }
                    }
                });
            }
        }
        return this;
    }

    public BaseViewHolder addOnLongClickListener(@IdRes int... iArr) {
        for (int i11 : iArr) {
            this.itemChildLongClickViewIds.add(Integer.valueOf(i11));
            View view = getView(i11);
            if (view != null) {
                if (!view.isLongClickable()) {
                    view.setLongClickable(true);
                }
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: io.chad.library.adapter.base.BaseViewHolder.2
                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view2) {
                        return BaseViewHolder.this.adapter.getOnItemChildLongClickListener() != null && BaseViewHolder.this.adapter.getOnItemChildLongClickListener().onItemChildLongClick(BaseViewHolder.this.adapter, view2, BaseViewHolder.this.getClickPosition());
                    }
                });
            }
        }
        return this;
    }

    public BaseViewHolder setAdapter(@IdRes int i11, Adapter adapter) {
        ((AdapterView) getView(i11)).setAdapter(adapter);
        return this;
    }

    public BaseViewHolder setNestView(@IdRes int... iArr) {
        for (int i11 : iArr) {
            this.nestViews.add(Integer.valueOf(i11));
        }
        addOnClickListener(iArr);
        addOnLongClickListener(iArr);
        return this;
    }

    public BaseViewHolder setProgress(@IdRes int i11, int i12) {
        ((ProgressBar) getView(i11)).setProgress(i12);
        return this;
    }

    public BaseViewHolder setRating(@IdRes int i11, float f11) {
        ((RatingBar) getView(i11)).setRating(f11);
        return this;
    }

    public BaseViewHolder setTag(@IdRes int i11, Object obj) {
        getView(i11).setTag(obj);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i11, CharSequence charSequence) {
        ((TextView) getView(i11)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTypeface(@IdRes int i11, Typeface typeface) {
        TextView textView = (TextView) getView(i11);
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        return this;
    }

    public Object getAssociatedObject() {
        return this.associatedObject;
    }

    public HashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @Deprecated
    public View getConvertView() {
        return this.convertView;
    }

    public HashSet<Integer> getItemChildLongClickViewIds() {
        return this.itemChildLongClickViewIds;
    }

    public Set<Integer> getNestViews() {
        return this.nestViews;
    }

    public <T extends View> T getView(@IdRes int i11) {
        T t11 = (T) this.views.get(i11);
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) this.itemView.findViewById(i11);
        this.views.put(i11, t12);
        return t12;
    }

    public void setAssociatedObject(Object obj) {
        this.associatedObject = obj;
    }

    public BaseViewHolder(View view) {
        super(view);
        this.views = new SparseArray<>();
        this.childClickViewIds = new LinkedHashSet<>();
        this.itemChildLongClickViewIds = new LinkedHashSet<>();
        this.nestViews = new HashSet<>();
        this.convertView = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getClickPosition() {
        if (getLayoutPosition() >= this.adapter.getHeaderLayoutCount()) {
            return getLayoutPosition() - this.adapter.getHeaderLayoutCount();
        }
        return 0;
    }

    public BaseViewHolder linkify(@IdRes int i11) {
        Linkify.addLinks((TextView) getView(i11), 15);
        return this;
    }

    public BaseViewHolder setAdapter(BaseQuickAdapter baseQuickAdapter) {
        this.adapter = baseQuickAdapter;
        return this;
    }

    public BaseViewHolder setAlpha(@IdRes int i11, float f11) {
        getView(i11).setAlpha(f11);
        return this;
    }

    public BaseViewHolder setBackgroundColor(@IdRes int i11, @ColorInt int i12) {
        getView(i11).setBackgroundColor(i12);
        return this;
    }

    public BaseViewHolder setBackgroundRes(@IdRes int i11, @DrawableRes int i12) {
        getView(i11).setBackgroundResource(i12);
        return this;
    }

    public BaseViewHolder setChecked(@IdRes int i11, boolean z11) {
        KeyEvent.Callback view = getView(i11);
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(z11);
        }
        return this;
    }

    public BaseViewHolder setEnabled(@IdRes int i11, boolean z11) {
        getView(i11).setEnabled(z11);
        return this;
    }

    public BaseViewHolder setGone(@IdRes int i11, boolean z11) {
        int i12;
        View view = getView(i11);
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        view.setVisibility(i12);
        return this;
    }

    public BaseViewHolder setImageBitmap(@IdRes int i11, Bitmap bitmap) {
        ((ImageView) getView(i11)).setImageBitmap(bitmap);
        return this;
    }

    public BaseViewHolder setImageDrawable(@IdRes int i11, Drawable drawable) {
        ((ImageView) getView(i11)).setImageDrawable(drawable);
        return this;
    }

    public BaseViewHolder setImageResource(@IdRes int i11, @DrawableRes int i12) {
        ((ImageView) getView(i11)).setImageResource(i12);
        return this;
    }

    public BaseViewHolder setMax(@IdRes int i11, int i12) {
        ((ProgressBar) getView(i11)).setMax(i12);
        return this;
    }

    public BaseViewHolder setOnCheckedChangeListener(@IdRes int i11, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        ((CompoundButton) getView(i11)).setOnCheckedChangeListener(onCheckedChangeListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnClickListener(@IdRes int i11, View.OnClickListener onClickListener) {
        getView(i11).setOnClickListener(onClickListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnItemClickListener(@IdRes int i11, AdapterView.OnItemClickListener onItemClickListener) {
        ((AdapterView) getView(i11)).setOnItemClickListener(onItemClickListener);
        return this;
    }

    public BaseViewHolder setOnItemLongClickListener(@IdRes int i11, AdapterView.OnItemLongClickListener onItemLongClickListener) {
        ((AdapterView) getView(i11)).setOnItemLongClickListener(onItemLongClickListener);
        return this;
    }

    public BaseViewHolder setOnItemSelectedClickListener(@IdRes int i11, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        ((AdapterView) getView(i11)).setOnItemSelectedListener(onItemSelectedListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnLongClickListener(@IdRes int i11, View.OnLongClickListener onLongClickListener) {
        getView(i11).setOnLongClickListener(onLongClickListener);
        return this;
    }

    @Deprecated
    public BaseViewHolder setOnTouchListener(@IdRes int i11, View.OnTouchListener onTouchListener) {
        getView(i11).setOnTouchListener(onTouchListener);
        return this;
    }

    public BaseViewHolder setProgress(@IdRes int i11, int i12, int i13) {
        ProgressBar progressBar = (ProgressBar) getView(i11);
        progressBar.setMax(i13);
        progressBar.setProgress(i12);
        return this;
    }

    public BaseViewHolder setRating(@IdRes int i11, float f11, int i12) {
        RatingBar ratingBar = (RatingBar) getView(i11);
        ratingBar.setMax(i12);
        ratingBar.setRating(f11);
        return this;
    }

    public BaseViewHolder setTag(@IdRes int i11, int i12, Object obj) {
        getView(i11).setTag(i12, obj);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i11, @StringRes int i12) {
        ((TextView) getView(i11)).setText(i12);
        return this;
    }

    public BaseViewHolder setTextColor(@IdRes int i11, @ColorInt int i12) {
        ((TextView) getView(i11)).setTextColor(i12);
        return this;
    }

    public BaseViewHolder setVisible(@IdRes int i11, boolean z11) {
        int i12;
        View view = getView(i11);
        if (z11) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        view.setVisibility(i12);
        return this;
    }

    public BaseViewHolder setTypeface(Typeface typeface, int... iArr) {
        for (int i11 : iArr) {
            TextView textView = (TextView) getView(i11);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | 128);
        }
        return this;
    }
}
