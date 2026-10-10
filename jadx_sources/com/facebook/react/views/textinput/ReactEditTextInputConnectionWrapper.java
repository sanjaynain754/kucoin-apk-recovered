package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes45.dex */
class ReactEditTextInputConnectionWrapper extends InputConnectionWrapper {
    public static final String BACKSPACE_KEY_VALUE = "Backspace";
    public static final String ENTER_KEY_VALUE = "Enter";
    public static final String NEWLINE_RAW_VALUE = "\n";
    private ReactEditText mEditText;
    private EventDispatcher mEventDispatcher;
    private boolean mIsBatchEdit;

    @Nullable
    private String mKey;

    public ReactEditTextInputConnectionWrapper(InputConnection inputConnection, ReactContext reactContext, ReactEditText reactEditText, EventDispatcher eventDispatcher) {
        super(inputConnection, false);
        this.mKey = null;
        this.mEventDispatcher = eventDispatcher;
        this.mEditText = reactEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.mIsBatchEdit = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.mIsBatchEdit = false;
        String str = this.mKey;
        if (str != null) {
            dispatchKeyEvent(str);
            this.mKey = null;
        }
        return super.endBatchEdit();
    }

    private void dispatchKeyEvent(String str) {
        if (str.equals(NEWLINE_RAW_VALUE)) {
            str = ENTER_KEY_VALUE;
        }
        this.mEventDispatcher.dispatchEvent(new ReactTextInputKeyPressEvent(this.mEditText.getId(), str));
    }

    private void dispatchKeyEventOrEnqueue(String str) {
        if (this.mIsBatchEdit) {
            this.mKey = str;
        } else {
            dispatchKeyEvent(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        dispatchKeyEvent(BACKSPACE_KEY_VALUE);
        return super.deleteSurroundingText(i11, i12);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i11) {
        int selectionStart = this.mEditText.getSelectionStart();
        int selectionEnd = this.mEditText.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i11);
        int selectionStart2 = this.mEditText.getSelectionStart();
        dispatchKeyEventOrEnqueue((selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? BACKSPACE_KEY_VALUE : String.valueOf(this.mEditText.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i11) {
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.equals("")) {
                string = BACKSPACE_KEY_VALUE;
            }
            dispatchKeyEventOrEnqueue(string);
        }
        return super.commitText(charSequence, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z11;
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (keyEvent.getKeyCode() == 67) {
                dispatchKeyEvent(BACKSPACE_KEY_VALUE);
            } else if (keyEvent.getKeyCode() == 66) {
                dispatchKeyEvent(ENTER_KEY_VALUE);
            } else if (z11) {
                dispatchKeyEvent(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
