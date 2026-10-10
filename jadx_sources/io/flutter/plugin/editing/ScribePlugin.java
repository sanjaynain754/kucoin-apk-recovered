package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;

/* JADX INFO: loaded from: classes23.dex */
public class ScribePlugin implements ScribeChannel.ScribeMethodHandler {

    @NonNull
    private final InputMethodManager mInputMethodManager;

    @NonNull
    private final ScribeChannel mScribeChannel;

    @NonNull
    private View mView;

    public void destroy() {
        this.mScribeChannel.setScribeMethodHandler(null);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
    public boolean isFeatureAvailable() {
        return Build.VERSION.SDK_INT >= 34 && isStylusHandwritingAvailable();
    }

    @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
    @RequiresApi(34)
    @TargetApi(34)
    public boolean isStylusHandwritingAvailable() {
        return this.mInputMethodManager.isStylusHandwritingAvailable();
    }

    public void setView(@NonNull View view) {
        if (view == this.mView) {
            return;
        }
        this.mView = view;
    }

    @Override // io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler
    @RequiresApi(33)
    @TargetApi(33)
    public void startStylusHandwriting() {
        this.mInputMethodManager.startStylusHandwriting(this.mView);
    }

    public ScribePlugin(@NonNull View view, @NonNull InputMethodManager inputMethodManager, @NonNull ScribeChannel scribeChannel) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.mView = view;
        this.mInputMethodManager = inputMethodManager;
        this.mScribeChannel = scribeChannel;
        scribeChannel.setScribeMethodHandler(this);
    }
}
