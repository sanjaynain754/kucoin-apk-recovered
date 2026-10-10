package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    public DialogTitle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int lineCount;
        super.onMeasure(i11, i12);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0467R.styleable.TextAppearance, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0467R.styleable.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            super.onMeasure(i11, i12);
        }
    }
}
