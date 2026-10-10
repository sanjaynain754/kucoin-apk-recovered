package com.kubi.sdk.base.p113ui;

import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.R$string;
import com.kubi.utils.C27012a;
import com.kubi.utils.ToastCompat;
import dh0.C36686b;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import me.jessyan.autosize.internal.CancelAdapt;
import org.aspectj.lang.InterfaceC43175a;
import p813yy.C46611a;
import xb0.C46126b;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class OldBaseActivity extends BaseActivity implements CancelAdapt {

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC43175a.a f46508l;

    /* JADX INFO: renamed from: i */
    public C46126b f46509i;

    /* JADX INFO: renamed from: j */
    public CompositeDisposable f46510j;

    /* JADX INFO: renamed from: k */
    public long f46511k;

    /* JADX INFO: renamed from: W */
    public boolean mo32389W() {
        return false;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("OldBaseActivity.java", OldBaseActivity.class);
        f46508l = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onDestroy", "com.kubi.sdk.base.ui.OldBaseActivity", "", "", "", "void"), 88);
    }

    /* JADX INFO: renamed from: U */
    public void m56594U() {
        CompositeDisposable compositeDisposable = this.f46510j;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    /* JADX INFO: renamed from: V */
    public C46126b m56595V() {
        if (this.f46509i == null) {
            this.f46509i = new C46126b(this);
        }
        return this.f46509i;
    }

    public CompositeDisposable getCompositeDisposable() {
        if (this.f46510j == null) {
            this.f46510j = new CompositeDisposable();
        }
        return this.f46510j;
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        InterfaceC43175a interfaceC43175aM82122b = C36686b.m82122b(f46508l, this, this);
        try {
            super.onDestroy();
            m56594U();
        } finally {
            C46611a.m102764b().m102771i(interfaceC43175aM82122b);
        }
    }

    static {
        ajc$preClinit();
    }

    /* JADX INFO: renamed from: T */
    public void m56593T(Disposable disposable) {
        getCompositeDisposable().add(disposable);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (mo32389W()) {
            if (System.currentTimeMillis() - this.f46511k > 1000) {
                this.f46511k = System.currentTimeMillis();
                ToastCompat.m66437C(R$string.double_quit);
                return;
            } else {
                C27012a.m66486i().m66490d();
                return;
            }
        }
        super.onBackPressed();
    }
}
