package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0467R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    @NonNull
    private final EmojiTextViewHelper mEmojiTextViewHelper;

    @NonNull
    private final TextView mView;

    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.isEnabled();
    }

    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, C0467R.styleable.AppCompatTextView, i11, 0);
        try {
            int i12 = C0467R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z11 = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getBoolean(i12, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            setEnabled(z11);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setAllCaps(boolean z11) {
        this.mEmojiTextViewHelper.setAllCaps(z11);
    }

    public void setEnabled(boolean z11) {
        this.mEmojiTextViewHelper.setEnabled(z11);
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.wrapTransformationMethod(transformationMethod);
    }

    public AppCompatEmojiTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new EmojiTextViewHelper(textView, false);
    }
}
