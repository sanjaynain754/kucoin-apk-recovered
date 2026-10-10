package p435ln;

import android.view.View;
import com.kubi.kyc.R$string;
import com.kubi.sdk.BaseApplication;

/* JADX INFO: renamed from: ln.h */
/* JADX INFO: compiled from: ChooseCell.java */
/* JADX INFO: loaded from: classes21.dex */
public class C42254h extends C42240a {

    /* JADX INFO: renamed from: d */
    public String f93713d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f93714e;

    /* JADX INFO: renamed from: g */
    public String f93716g;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f93719j;

    /* JADX INFO: renamed from: f */
    public String f93715f = BaseApplication.get().getResources().getString(R$string.email_not_valid);

    /* JADX INFO: renamed from: h */
    public boolean f93717h = false;

    /* JADX INFO: renamed from: i */
    public boolean f93718i = true;

    /* JADX INFO: renamed from: b */
    public String m92709b() {
        return this.f93694b;
    }

    /* JADX INFO: renamed from: c */
    public String m92710c() {
        return this.f93715f;
    }

    /* JADX INFO: renamed from: d */
    public String m92711d() {
        return this.f93716g;
    }

    /* JADX INFO: renamed from: e */
    public String m92712e() {
        return this.f93713d;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener m92713f() {
        return this.f93714e;
    }

    /* JADX INFO: renamed from: g */
    public View.OnClickListener m92714g() {
        return this.f93719j;
    }

    /* JADX INFO: renamed from: h */
    public boolean m92715h() {
        return this.f93693a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m92716i() {
        return this.f93718i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m92717j() {
        return this.f93717h;
    }

    /* JADX INFO: renamed from: k */
    public C42254h m92718k(String str) {
        this.f93715f = str;
        return this;
    }
}
