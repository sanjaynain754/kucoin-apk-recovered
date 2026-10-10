package com.trtc.tuikit.common;

import android.os.Bundle;
import android.view.Window;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenActivity extends AppCompatActivity {
    /* JADX INFO: renamed from: G */
    public final void m79350G() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(9216);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m79350G();
    }
}
