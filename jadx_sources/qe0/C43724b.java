package qe0;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: qe0.b */
/* JADX INFO: compiled from: EasyPopup.java */
/* JADX INFO: loaded from: classes60.dex */
public class C43724b extends AbstractC43723a<C43724b> {

    /* JADX INFO: renamed from: C */
    public a f96677C;

    /* JADX INFO: renamed from: qe0.b$a */
    /* JADX INFO: compiled from: EasyPopup.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4917a(View view, C43724b c43724b);
    }

    public C43724b() {
    }

    public C43724b(Context context) {
        m96310T(context);
    }

    /* JADX INFO: renamed from: g0 */
    public static C43724b m96333g0() {
        return new C43724b();
    }

    /* JADX INFO: renamed from: h0 */
    public static C43724b m96334h0(Context context) {
        return new C43724b(context);
    }

    @Override // qe0.AbstractC43723a
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo25306H(View view, C43724b c43724b) {
        a aVar = this.f96677C;
        if (aVar != null) {
            aVar.mo4917a(view, c43724b);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public C43724b m96335j0(a aVar) {
        this.f96677C = aVar;
        return this;
    }

    @Override // qe0.AbstractC43723a
    /* JADX INFO: renamed from: E */
    public void mo96296E() {
    }
}
