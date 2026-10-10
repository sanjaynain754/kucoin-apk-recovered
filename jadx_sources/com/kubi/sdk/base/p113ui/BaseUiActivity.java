package com.kubi.sdk.base.p113ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.LoadingDialogFragment;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.R$id;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.ToastCompat;
import dh0.C36686b;
import io.reactivex.disposables.CompositeDisposable;
import k10.InterfaceC40863a;
import org.aspectj.lang.InterfaceC43175a;
import p813yy.C46611a;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public abstract class BaseUiActivity extends OldBaseActivity implements InterfaceC23686g {

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ InterfaceC43175a.a f46499t;

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ InterfaceC43175a.a f46500u;

    /* JADX INFO: renamed from: m */
    public BaseDialogFragment f46501m;

    /* JADX INFO: renamed from: n */
    public InterfaceC40863a f46502n;

    /* JADX INFO: renamed from: o */
    public NavigationBar f46503o;

    /* JADX INFO: renamed from: p */
    public View f46504p;

    /* JADX INFO: renamed from: q */
    public Context f46505q;

    /* JADX INFO: renamed from: r */
    public boolean f46506r;

    /* JADX INFO: renamed from: s */
    public boolean f46507s = false;

    @LayoutRes
    /* JADX INFO: renamed from: Z */
    public abstract int mo30326Z();

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i11) {
        setContentView(LayoutInflater.from(this).inflate(i11, (ViewGroup) null));
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("BaseUiActivity.java", BaseUiActivity.class);
        f46499t = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onCreate", "com.kubi.sdk.base.ui.BaseUiActivity", "android.os.Bundle", "savedInstanceState", "", "void"), 59);
        f46500u = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onDestroy", "com.kubi.sdk.base.ui.BaseUiActivity", "", "", "", "void"), 162);
    }

    /* JADX INFO: renamed from: Y */
    public int m56586Y(@ColorRes int i11) {
        return ContextCompat.getColor(this.f46505q, i11);
    }

    /* JADX INFO: renamed from: a0 */
    public BaseDialogFragment m56587a0() {
        if (this.f46501m == null) {
            this.f46501m = new LoadingDialogFragment();
        }
        return this.f46501m;
    }

    /* JADX INFO: renamed from: b0 */
    public void m56588b0(View view) {
        if (this.f46502n == null) {
            this.f46502n = WrapperLoadingView.injectView(view);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public View mo32393c0() {
        return new NavigationBar(this);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m56589d0() {
        return this.f46507s;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo38439f0(boolean z11) {
        this.f46507s = z11;
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public NavigationBar getNavigationBar() {
        return this.f46503o;
    }

    /* JADX INFO: renamed from: h0 */
    public void mo56575h0(NavigationBar navigationBar) {
        navigationBar.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.sdk.base.ui.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46517b.preformBackPressed();
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void hideDialogLoading() {
        if (this.f46501m == null || getSupportFragmentManager() == null || this.f46501m.getFragmentManager() == null) {
            return;
        }
        this.f46501m.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: i0 */
    public void m56591i0() {
        m56588b0(this.f46504p);
        InterfaceC40863a interfaceC40863a = this.f46502n;
        if (interfaceC40863a != null) {
            interfaceC40863a.showLoading();
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        C46611a.m102764b().m102770h(C36686b.m82123c(f46499t, this, this, bundle));
        super.onCreate(bundle);
        getTitleBar().m58934f();
        this.f46505q = this;
        setContentView(mo30326Z());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        InterfaceC43175a interfaceC43175aM82122b = C36686b.m82122b(f46500u, this, this);
        try {
            super.onDestroy();
            this.f46501m = null;
            this.f46502n = null;
        } finally {
            C46611a.m102764b().m102771i(interfaceC43175aM82122b);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        this.f46504p = view;
        View viewMo32393c0 = mo32393c0();
        if (viewMo32393c0 == null) {
            super.setContentView(view);
            return;
        }
        if (viewMo32393c0 instanceof NavigationBar) {
            NavigationBar navigationBar = (NavigationBar) viewMo32393c0;
            this.f46503o = navigationBar;
            mo56575h0(navigationBar);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(R$id.base_ui_activity_layout);
        linearLayout.setOrientation(1);
        linearLayout.addView(viewMo32393c0, new FrameLayout.LayoutParams(-1, TitleBar.f48580r.dp2px(this, 42)));
        linearLayout.addView(this.f46504p, new FrameLayout.LayoutParams(-1, -1));
        super.setContentView(linearLayout);
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        m56588b0(this.f46504p);
        InterfaceC40863a interfaceC40863a = this.f46502n;
        if (interfaceC40863a != null) {
            interfaceC40863a.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showDialogLoading() {
        BaseDialogFragment baseDialogFragment = this.f46501m;
        if (baseDialogFragment == null || baseDialogFragment.getDialog() == null || !this.f46501m.getDialog().isShowing()) {
            m56587a0().show(getSupportFragmentManager(), "a_dialog_loading");
        }
    }

    static {
        ajc$preClinit();
    }

    /* JADX INFO: renamed from: g0 */
    public void m56590g0(boolean z11) {
        getIntent().putExtra(BaseActivity.STATUS_BAR, z11 + "");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public CompositeDisposable getCompositeDisposable() {
        return super.getCompositeDisposable();
    }

    /* JADX INFO: renamed from: j0 */
    public void m56592j0(String str) {
        ToastCompat.m66440F(str);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f46506r = true;
        mo38439f0(false);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f46506r) {
            mo32394e0();
        }
        this.f46506r = false;
        mo38439f0(true);
    }

    /* JADX INFO: renamed from: e0 */
    public void mo32394e0() {
    }
}
