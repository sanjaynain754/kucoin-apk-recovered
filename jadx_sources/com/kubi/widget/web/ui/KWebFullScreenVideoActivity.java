package com.kubi.widget.web.ui;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.web.core.C24303a;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KWebFullScreenVideoActivity.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0014¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebFullScreenVideoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "exitFullscreen", "onDestroy", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebFullScreenVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebFullScreenVideoActivity.kt\ncom/kubi/widget/web/ui/KWebFullScreenVideoActivity\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,56:1\n158#2,2:57\n*S KotlinDebug\n*F\n+ 1 KWebFullScreenVideoActivity.kt\ncom/kubi/widget/web/ui/KWebFullScreenVideoActivity\n*L\n35#1:57,2\n*E\n"})
public final class KWebFullScreenVideoActivity extends AppCompatActivity {
    /* JADX INFO: renamed from: H */
    public final void m67516H() {
        C24303a c24303a = C24303a.f48422a;
        WebChromeClient.CustomViewCallback customViewCallbackM58685b = c24303a.m58685b();
        if (customViewCallbackM58685b != null) {
            customViewCallbackM58685b.onCustomViewHidden();
        }
        c24303a.m58684a();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m67516H();
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewM58686c = C24303a.f48422a.m58686c();
        if (viewM58686c == null) {
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.addView(viewM58686c, new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        EdgeToEdgeCompat.f48106a.m58273k(this);
        if (C12573b.f21598a.m23696a()) {
            "exit_full_screen".length();
        }
        C12572a.m23692a(this, false, new KWebFullScreenVideoActivity$onCreate$$inlined$bindFlowEvent$1("exit_full_screen", null, this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m67516H();
        super.onDestroy();
    }
}
