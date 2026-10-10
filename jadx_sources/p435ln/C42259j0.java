package p435ln;

import android.text.Spannable;
import android.view.View;
import com.kubi.kyc.R$string;
import com.kubi.sdk.BaseApplication;

/* JADX INFO: renamed from: ln.j0 */
/* JADX INFO: compiled from: UploadCell.java */
/* JADX INFO: loaded from: classes21.dex */
public class C42259j0 extends C42240a {

    /* JADX INFO: renamed from: d */
    public String f93727d;

    /* JADX INFO: renamed from: e */
    public Spannable f93728e;

    /* JADX INFO: renamed from: f */
    public int f93729f;

    /* JADX INFO: renamed from: g */
    public String f93730g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f93731h;

    /* JADX INFO: renamed from: i */
    public String f93732i = BaseApplication.get().getResources().getString(R$string.upload_photo_invalid);

    /* JADX INFO: renamed from: j */
    public boolean f93733j = false;

    /* JADX INFO: renamed from: b */
    public String m92727b() {
        return this.f93694b;
    }

    /* JADX INFO: renamed from: c */
    public String m92728c() {
        return this.f93732i;
    }

    /* JADX INFO: renamed from: d */
    public int m92729d() {
        return this.f93729f;
    }

    /* JADX INFO: renamed from: e */
    public String m92730e() {
        return this.f93730g;
    }

    /* JADX INFO: renamed from: f */
    public String m92731f() {
        return this.f93727d;
    }

    /* JADX INFO: renamed from: g */
    public View.OnClickListener m92732g() {
        return this.f93731h;
    }

    /* JADX INFO: renamed from: h */
    public Spannable m92733h() {
        return this.f93728e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m92734i() {
        return this.f93733j;
    }

    /* JADX INFO: renamed from: j */
    public C42259j0 m92735j(boolean z11) {
        this.f93695c = z11;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C42259j0 m92736k(String str) {
        this.f93694b = str;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C42259j0 m92737l(String str) {
        this.f93732i = str;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C42259j0 m92738m(int i11) {
        this.f93729f = i11;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C42259j0 m92739n(String str) {
        this.f93730g = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C42259j0 m92740o(View.OnClickListener onClickListener) {
        this.f93731h = onClickListener;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C42259j0 m92741p(boolean z11) {
        this.f93733j = z11;
        return this;
    }
}
