package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0467R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {

    @NonNull
    private final EmojiEditTextHelper mEmojiEditTextHelper;

    @NonNull
    private final EditText mView;

    public boolean isEmojiCapableKeyListener(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean isEnabled() {
        return this.mEmojiEditTextHelper.isEnabled();
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

    @Nullable
    public InputConnection onCreateInputConnection(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.mEmojiEditTextHelper.onCreateInputConnection(inputConnection, editorInfo);
    }

    public void setEnabled(boolean z11) {
        this.mEmojiEditTextHelper.setEnabled(z11);
    }

    public AppCompatEmojiEditTextHelper(@NonNull EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new EmojiEditTextHelper(editText, false);
    }

    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener keyListener) {
        if (isEmojiCapableKeyListener(keyListener)) {
            return this.mEmojiEditTextHelper.getKeyListener(keyListener);
        }
        return keyListener;
    }
}
