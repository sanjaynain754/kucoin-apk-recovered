package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.checkbox.C7172a;
import com.google.android.material.checkbox.C7173b;
import io.flutter.Log;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes23.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";

    @NonNull
    private final AutofillManager afm;

    @Nullable
    private SparseArray<TextInputChannel.Configuration> autofillConfiguration;

    @Nullable
    private TextInputChannel.Configuration configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;

    @NonNull
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;

    @Nullable
    private Rect lastClientRect;

    @Nullable
    private InputConnection lastInputConnection;

    @NonNull
    private ListenableEditingState mEditable;

    @NonNull
    private final InputMethodManager mImm;
    private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;

    @NonNull
    private final View mView;

    @NonNull
    private PlatformViewsController platformViewsController;

    @NonNull
    private PlatformViewsController2 platformViewsController2;

    @NonNull
    private final ScribeChannel scribeChannel;

    @NonNull
    private final TextInputChannel textInputChannel;

    /* JADX INFO: loaded from: classes60.dex */
    public interface MinMax {
        void inspect(double d11, double d12);
    }

    public static class InputTarget {

        /* JADX INFO: renamed from: id */
        int f86786id;

        @NonNull
        Type type;

        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(@NonNull Type type, int i11) {
            this.type = type;
            this.f86786id = i11;
        }
    }

    private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
        int i11 = textEditState.composingEnd - textEditState.composingStart;
        if (i11 != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (textEditState.text.charAt(textEditState.composingStart + i12) != textEditState2.text.charAt(textEditState2.composingStart + i12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0075  */
    /* JADX WARN: Code duplicated, block: B:61:0x0078  */
    /* JADX WARN: Code duplicated, block: B:63:0x007c  */
    /* JADX WARN: Code duplicated, block: B:65:0x007f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0083  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean z11, boolean z12, boolean z13, boolean z14, TextInputChannel.TextCapitalization textCapitalization) {
        int i11;
        int i12;
        TextInputChannel.TextInputType textInputType = inputType.type;
        if (textInputType == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputChannel.TextInputType.NUMBER) {
            int i13 = inputType.isSigned ? InputDeviceCompat.SOURCE_TOUCHSCREEN : 2;
            return inputType.isDecimal ? i13 | 8192 : i13;
        }
        if (textInputType == TextInputChannel.TextInputType.PHONE) {
            return 3;
        }
        if (textInputType == TextInputChannel.TextInputType.NONE) {
            return 0;
        }
        if (textInputType == TextInputChannel.TextInputType.MULTILINE) {
            i11 = 131073;
        } else if (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS || textInputType == TextInputChannel.TextInputType.TWITTER) {
            i11 = 33;
        } else if (textInputType == TextInputChannel.TextInputType.URL || textInputType == TextInputChannel.TextInputType.WEB_SEARCH) {
            i11 = 17;
        } else if (textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
            i11 = 145;
        } else if (textInputType == TextInputChannel.TextInputType.NAME) {
            i11 = 97;
        } else {
            i11 = textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS ? 113 : 1;
        }
        if (!z11) {
            if (z12) {
                i11 |= 32768;
            }
            i12 = z13 ? 524416 : 524432;
            if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
                return i11 | 4096;
            }
            if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
                return i11 | 8192;
            }
            if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
                return i11 | 16384;
            }
            return i11;
        }
        i11 |= i12;
        if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
            return i11 | 4096;
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
            return i11 | 8192;
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
            return i11 | 16384;
        }
        return i11;
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyValueChanged(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        TextInputChannel.Configuration configuration;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d11, double d12, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z11 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d13 = dArr[12];
        double d14 = dArr[15];
        double d15 = d13 / d14;
        dArr2[1] = d15;
        dArr2[0] = d15;
        double d16 = dArr[13] / d14;
        dArr2[3] = d16;
        dArr2[2] = d16;
        MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d17, double d18) {
                double d19 = 1.0d;
                if (!z11) {
                    double[] dArr3 = dArr;
                    d19 = 1.0d / (((dArr3[3] * d17) + (dArr3[7] * d18)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d21 = ((dArr4[0] * d17) + (dArr4[4] * d18) + dArr4[12]) * d19;
                double d22 = ((dArr4[1] * d17) + (dArr4[5] * d18) + dArr4[13]) * d19;
                double[] dArr5 = dArr2;
                if (d21 < dArr5[0]) {
                    dArr5[0] = d21;
                } else if (d21 > dArr5[1]) {
                    dArr5[1] = d21;
                }
                if (d22 < dArr5[2]) {
                    dArr5[2] = d22;
                } else if (d22 > dArr5[3]) {
                    dArr5[3] = d22;
                }
            }
        };
        minMax.inspect(d11, 0.0d);
        minMax.inspect(d11, d12);
        minMax.inspect(0.0d, d12);
        double d17 = this.mView.getContext().getResources().getDisplayMetrics().density;
        this.lastClientRect = new Rect((int) (dArr2[0] * d17), (int) (dArr2[2] * d17), (int) Math.ceil(dArr2[1] * d17), (int) Math.ceil(dArr2[3] * d17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i11, boolean z11) {
        if (!z11) {
            this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i11);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i11);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.autofillConfiguration = null;
            return;
        }
        TextInputChannel.Configuration[] configurationArr = configuration.fields;
        SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (TextInputChannel.Configuration configuration2 : configurationArr) {
            TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                this.afm.notifyValueChanged(this.mView, autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(autofill.editState.text));
            }
        }
    }

    public void autofill(@NonNull SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration configuration;
        TextInputChannel.Configuration.Autofill autofill;
        TextInputChannel.Configuration.Autofill autofill2;
        if (Build.VERSION.SDK_INT < 26 || (configuration = this.configuration) == null || this.autofillConfiguration == null || (autofill = configuration.autofill) == null) {
            return;
        }
        HashMap<String, TextInputChannel.TextEditState> map = new HashMap<>();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i11));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                String string = C38821t.m87544a(sparseArray.valueAt(i11)).getTextValue().toString();
                TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(string, string.length(), string.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    this.mEditable.setEditingState(textEditState);
                } else {
                    map.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        this.textInputChannel.updateEditingStateWithTag(this.inputTarget.f86786id, map);
    }

    public void clearPlatformViewClient(int i11) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f86786id == i11) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    @VisibleForTesting
    public void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
    }

    @Nullable
    public InputConnection createInputConnection(@NonNull View view, @NonNull KeyboardManager keyboardManager, @NonNull EditorInfo editorInfo) {
        int iIntValue;
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.f86786id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        TextInputChannel.Configuration configuration = this.configuration;
        int iInputTypeFromTextInputType = inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.enableIMEPersonalizedLearning, configuration.textCapitalization);
        editorInfo.inputType = iInputTypeFromTextInputType;
        editorInfo.imeOptions = 33554432;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.configuration.inputAction;
        if (num == null) {
            iIntValue = (iInputTypeFromTextInputType & 131072) != 0 ? 1 : 6;
        } else {
            iIntValue = num.intValue();
        }
        TextInputChannel.Configuration configuration2 = this.configuration;
        String str = configuration2.actionLabel;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = configuration2.contentCommitMimeTypes;
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        if (i11 >= 34) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.f86786id, this.textInputChannel, this.scribeChannel, keyboardManager, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    @SuppressLint({"NewApi"})
    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.platformViewsController2.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler(null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r5 == r9.composingEnd) goto L23;
     */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didChangeEditingState(boolean z11, boolean z12, boolean z13) {
        if (z11) {
            notifyValueChanged(this.mEditable.toString());
        }
        int selectionStart = this.mEditable.getSelectionStart();
        int selectionEnd = this.mEditable.getSelectionEnd();
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        ArrayList<TextEditingDelta> arrayListExtractBatchTextEditingDeltas = this.mEditable.extractBatchTextEditingDeltas();
        if (this.mLastKnownFrameworkTextEditingState != null) {
            if (this.mEditable.toString().equals(this.mLastKnownFrameworkTextEditingState.text)) {
                TextInputChannel.TextEditState textEditState = this.mLastKnownFrameworkTextEditingState;
                if (selectionStart == textEditState.selectionStart) {
                    if (selectionEnd == textEditState.selectionEnd) {
                        if (composingStart == textEditState.composingStart) {
                        }
                    }
                }
            }
            Log.m87481v(TAG, "send EditingState to flutter: " + this.mEditable.toString());
            if (this.configuration.enableDeltaModel) {
                this.textInputChannel.updateEditingStateWithDeltas(this.inputTarget.f86786id, arrayListExtractBatchTextEditingDeltas);
                this.mEditable.clearBatchDeltas();
            } else {
                this.textInputChannel.updateEditingState(this.inputTarget.f86786id, this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
                selectionStart = selectionStart;
                selectionEnd = selectionEnd;
                composingStart = composingStart;
                composingEnd = composingEnd;
            }
            this.mLastKnownFrameworkTextEditingState = new TextInputChannel.TextEditState(this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
            return;
        }
        this.mEditable.clearBatchDeltas();
    }

    @VisibleForTesting
    public Editable getEditable() {
        return this.mEditable;
    }

    @VisibleForTesting
    public ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    @NonNull
    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    @Nullable
    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(@NonNull ViewStructure viewStructure, int i11) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i12 = 0; i12 < this.autofillConfiguration.size(); i12++) {
            int iKeyAt = this.autofillConfiguration.keyAt(i12);
            TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i12).autofill;
            if (autofill != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i12);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = autofill.hints;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = autofill.hintText;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = this.lastClientRect) == null) {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(autofill.editState.text));
                } else {
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(@NonNull String str, @NonNull Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    @VisibleForTesting
    public void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean zComposingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = zComposingChanged;
            if (zComposingChanged) {
                Log.m87479i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    @VisibleForTesting
    public void showTextInput(View view) {
        TextInputChannel.InputType inputType;
        TextInputChannel.Configuration configuration = this.configuration;
        if (configuration != null && (inputType = configuration.inputType) != null && inputType.type == TextInputChannel.TextInputType.NONE) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }

    @SuppressLint({"NewApi"})
    public TextInputPlugin(@NonNull View view, @NonNull TextInputChannel textInputChannel, @NonNull ScribeChannel scribeChannel, @NonNull PlatformViewsController platformViewsController, @NonNull PlatformViewsController2 platformViewsController2) {
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.afm = C7173b.m12938a(view.getContext().getSystemService(C7172a.m12937a()));
        } else {
            this.afm = null;
        }
        if (i11 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.textInputChannel = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void finishAutofillContext(boolean z11) {
                if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z11) {
                    TextInputPlugin.this.afm.commit();
                } else {
                    TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setClient(int i12, TextInputChannel.Configuration configuration) {
                TextInputPlugin.this.setTextInputClient(i12, configuration);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditableSizeAndTransform(double d11, double d12, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d11, d12, dArr);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setPlatformViewClient(int i12, boolean z11) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i12, z11);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        });
        textInputChannel.requestExistingInputState();
        this.scribeChannel = scribeChannel;
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
        this.platformViewsController2 = platformViewsController2;
        platformViewsController2.attachTextInputPlugin(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public boolean handleKeyEvent(@NonNull KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (getInputMethodManager().isAcceptingText() && (inputConnection = this.lastInputConnection) != null) {
            if (inputConnection instanceof InputConnectionAdaptor) {
                return ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent);
            }
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @VisibleForTesting
    public void setTextInputClient(int i11, TextInputChannel.Configuration configuration) {
        TextInputChannel.TextEditState textEditState;
        notifyViewExited();
        this.configuration = configuration;
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i11);
        this.mEditable.removeEditingStateListener(this);
        TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        if (autofill != null) {
            textEditState = autofill.editState;
        } else {
            textEditState = null;
        }
        this.mEditable = new ListenableEditingState(textEditState, this.mView);
        updateAutofillConfigurationIfNeeded(configuration);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }
}
