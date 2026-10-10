package com.kubi.sdk.base.p113ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.utils.C23635a;
import com.kubi.router.utils.C23637c;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.R$id;
import com.kubi.sdk.R$layout;
import dh0.C36686b;
import java.util.Iterator;
import org.aspectj.lang.InterfaceC43175a;
import p813yy.C46611a;
import ro.C44127a;
import ro.C44128b;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class BaseFragmentActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ InterfaceC43175a.a f46492v;

    /* JADX INFO: renamed from: k0 */
    public static Intent m56572k0(Context context, String str, String str2, Bundle bundle) {
        if (bundle != null) {
            C23635a c23635a = C23635a.f46211a;
            c23635a.m56286a(bundle, BaseActivity.STATUS_BAR, bundle.getBoolean(BaseActivity.STATUS_BAR, false));
            c23635a.m56286a(bundle, BaseActivity.TITLE_BAR, bundle.getBoolean(BaseActivity.TITLE_BAR, true));
        } else {
            bundle = new Bundle();
            C23635a c23635a2 = C23635a.f46211a;
            c23635a2.m56286a(bundle, BaseActivity.STATUS_BAR, false);
            c23635a2.m56286a(bundle, BaseActivity.TITLE_BAR, true);
        }
        Intent intentPutExtra = new Intent(context, (Class<?>) BaseFragmentActivity.class).putExtras(bundle).putExtra("title", str).putExtra("fragment", str2);
        if (!(context instanceof Activity)) {
            intentPutExtra.addFlags(268435456);
        }
        return intentPutExtra;
    }

    public static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("BaseFragmentActivity.java", BaseFragmentActivity.class);
        f46492v = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onCreate", "com.kubi.sdk.base.ui.BaseFragmentActivity", "android.os.Bundle", "savedInstanceState", "", "void"), 62);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m56573m0(Context context, String str, String str2) {
        m56574n0(context, str, str2, new Bundle());
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.activity_fragment_container;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        C46611a.m102764b().m102770h(C36686b.m82123c(f46492v, this, this, bundle));
        if (C23637c.f46218a.m56296a(getIntent(), BaseActivity.STATUS_BAR, m56576l0(BaseActivity.STATUS_BAR, Boolean.FALSE))) {
            m56590g0(true);
        }
        super.onCreate(bundle);
        Iterator<Fragment> it = getSupportFragmentManager().getFragments().iterator();
        while (it.hasNext()) {
            getSupportFragmentManager().beginTransaction().remove(it.next()).commitAllowingStateLoss();
        }
        processFragment();
        if (C23637c.f46218a.m56296a(getIntent(), BaseActivity.TITLE_BAR, m56576l0(BaseActivity.TITLE_BAR, Boolean.TRUE))) {
            return;
        }
        this.f46503o.setVisibility(8);
    }

    static {
        ajc$preClinit();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m56574n0(Context context, String str, String str2, Bundle bundle) {
        context.startActivity(m56572k0(context, str, str2, bundle));
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: h0 */
    public void mo56575h0(NavigationBar navigationBar) {
        super.mo56575h0(navigationBar);
        String strM56297b = C23637c.f46218a.m56297b(getIntent(), "title");
        if (!TextUtils.isEmpty(strM56297b)) {
            navigationBar.setMainTitle(strM56297b);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m56576l0(String str, Boolean bool) {
        String stringExtra = getIntent().getStringExtra(str);
        if (TextUtils.isEmpty(stringExtra)) {
            return getIntent().getBooleanExtra(str, bool.booleanValue());
        }
        try {
            return Boolean.parseBoolean(stringExtra);
        } catch (ClassCastException e11) {
            C44127a.m97248h(e11);
            return bool.booleanValue();
        }
    }

    public final void processFragment() {
        String stringExtra = getIntent().getStringExtra("fragment");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                getSupportFragmentManager().beginTransaction().add(R$id.fl_container, Fragment.instantiate(this, stringExtra, getIntent().getExtras())).addToBackStack(null).commitAllowingStateLoss();
            } catch (Fragment.InstantiationException e11) {
                C44128b.m97262f("BaseFragmentActivity", "Unable to instantiate fragment=" + stringExtra + ", action=" + getIntent().getAction() + ", categories=" + getIntent().getCategories() + ", data=" + getIntent().getDataString(), e11);
                finish();
            }
        }
    }
}
