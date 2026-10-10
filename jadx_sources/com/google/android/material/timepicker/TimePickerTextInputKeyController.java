package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes45.dex */
class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {
    private final ChipTextInputComboView hourLayoutComboView;
    private boolean keyListenerRunning = false;
    private final ChipTextInputComboView minuteLayoutComboView;
    private final TimeModel time;

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        boolean z11 = i11 == 5;
        if (z11) {
            moveSelection(12);
        }
        return z11;
    }

    private void moveSelection(int i11) {
        this.minuteLayoutComboView.setChecked(i11 == 12);
        this.hourLayoutComboView.setChecked(i11 == 10);
        this.time.selection = i11;
    }

    private boolean onMinuteKeyPress(int i11, KeyEvent keyEvent, EditText editText) {
        if (i11 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            moveSelection(10);
            return true;
        }
        if (i11 < 7 || i11 > 16) {
            return false;
        }
        clearPrefilledText(editText);
        return false;
    }

    public void bind() {
        TextInputLayout textInput = this.hourLayoutComboView.getTextInput();
        TextInputLayout textInput2 = this.minuteLayoutComboView.getTextInput();
        EditText editText = textInput.getEditText();
        EditText editText2 = textInput2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (this.keyListenerRunning) {
            return false;
        }
        this.keyListenerRunning = true;
        EditText editText = (EditText) view;
        boolean zOnMinuteKeyPress = this.time.selection == 12 ? onMinuteKeyPress(i11, keyEvent, editText) : onHourKeyPress(i11, keyEvent, editText);
        this.keyListenerRunning = false;
        return zOnMinuteKeyPress;
    }

    public TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.hourLayoutComboView = chipTextInputComboView;
        this.minuteLayoutComboView = chipTextInputComboView2;
        this.time = timeModel;
    }

    private void clearPrefilledText(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    private boolean onHourKeyPress(int i11, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i11 >= 7 && i11 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            moveSelection(12);
            return true;
        }
        if (i11 >= 7 && i11 <= 16) {
            clearPrefilledText(editText);
        }
        return false;
    }
}
