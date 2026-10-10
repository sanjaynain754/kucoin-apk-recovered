package p611s;

import ai.advance.sdk.global.iqa.lib.JNI;
import android.content.Context;
import java.util.Map;
import p246f.AbstractC37284f;
import p579r.C43890a;

/* JADX INFO: renamed from: s.c1 */
/* JADX INFO: loaded from: classes23.dex */
public class C44211c1 extends AbstractC37284f {

    /* JADX INFO: renamed from: j */
    public static volatile C44211c1 f97608j;

    @Override // p246f.AbstractC37284f
    /* JADX INFO: renamed from: I */
    public boolean mo83467I() {
        return true;
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: j */
    public String mo83556j() {
        return null;
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: n */
    public boolean mo83559n() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static C44211c1 m97482R() {
        if (f97608j == null) {
            synchronized (C44211c1.class) {
                try {
                    if (f97608j == null) {
                        f97608j = new C44211c1(C43890a.m96661b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f97608j;
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: m */
    public int mo83558m() {
        return 15;
    }

    public C44211c1(Context context) {
        super(context);
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: l */
    public Map<String, Object> mo83557l() {
        return JNI.m1362g();
    }

    @Override // p246f.AbstractC37284f, p246f.AbstractC37293o
    /* JADX INFO: renamed from: o */
    public void mo83478o() {
        m83470M("session_finished");
        super.mo83478o();
    }
}
