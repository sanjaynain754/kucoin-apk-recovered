package we0;

import a3d20260409.C0075l;
import a3d20260409.C0109v;
import android.content.Context;
import java.util.Map;
import p246f.AbstractC37286h;
import p579r.C43890a;

/* JADX INFO: renamed from: we0.f */
/* JADX INFO: loaded from: classes60.dex */
public class C45819f extends AbstractC37286h {

    /* JADX INFO: renamed from: l */
    public static volatile C45819f f103303l;

    @Override // p246f.AbstractC37286h
    /* JADX INFO: renamed from: D */
    public boolean mo83488D() {
        return true;
    }

    @Override // p246f.AbstractC37286h
    /* JADX INFO: renamed from: E */
    public boolean mo83489E() {
        return true;
    }

    @Override // p246f.AbstractC37286h, p246f.AbstractC37290l
    /* JADX INFO: renamed from: s */
    public boolean mo83497s() {
        return true;
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: t */
    public boolean mo83548t() {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static C45819f m101227J() {
        if (f103303l == null) {
            synchronized (C45819f.class) {
                try {
                    if (f103303l == null) {
                        f103303l = new C45819f(C43890a.m96661b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f103303l;
    }

    public C45819f(Context context) {
        super(context);
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: o */
    public String mo83546o() {
        return C0075l.m362e();
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: q */
    public Map<String, Object> mo83547q() {
        return C0109v.m551z();
    }
}
