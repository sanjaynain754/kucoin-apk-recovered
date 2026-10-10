package com.kubi.fallback;

import android.os.Bundle;
import android.view.View;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.extensions.core.C27032f;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: GlobalFallbackActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/fallback/GlobalFallbackActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "titleView", "Lcom/kubi/sdk/widget/TitleBar;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GlobalFallbackActivity extends BaseActivity {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f21854j = 0;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TitleBar f21855i;

    /* JADX INFO: renamed from: U */
    public static final void m23742U(GlobalFallbackActivity globalFallbackActivity, View view) {
        globalFallbackActivity.finish();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.fallback_activity_global);
        TitleBar titleBar = (TitleBar) findViewById(R$id.title_bar);
        this.f21855i = titleBar;
        if (titleBar != null) {
            titleBar.setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.fallback.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GlobalFallbackActivity.m23742U(this.f21938b, view);
                }
            });
        }
        C27032f.m66626q(this, R$id.fragment_container, new GlobalFallbackFragment(), null, 4, null);
    }
}
