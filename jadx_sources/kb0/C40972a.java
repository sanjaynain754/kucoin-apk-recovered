package kb0;

import android.graphics.PointF;
import android.view.View;
import jb0.InterfaceC40376j;
import lb0.InterpolatorC42155b;

/* JADX INFO: renamed from: kb0.a */
/* JADX INFO: compiled from: SimpleBoundaryDecider.java */
/* JADX INFO: loaded from: classes23.dex */
public class C40972a implements InterfaceC40376j {

    /* JADX INFO: renamed from: a */
    public PointF f91062a;

    /* JADX INFO: renamed from: b */
    public InterfaceC40376j f91063b;

    /* JADX INFO: renamed from: c */
    public boolean f91064c = true;

    @Override // jb0.InterfaceC40376j
    /* JADX INFO: renamed from: a */
    public boolean mo88968a(View view) {
        InterfaceC40376j interfaceC40376j = this.f91063b;
        return interfaceC40376j != null ? interfaceC40376j.mo88968a(view) : InterpolatorC42155b.m92538a(view, this.f91062a, this.f91064c);
    }

    @Override // jb0.InterfaceC40376j
    /* JADX INFO: renamed from: b */
    public boolean mo88969b(View view) {
        InterfaceC40376j interfaceC40376j = this.f91063b;
        return interfaceC40376j != null ? interfaceC40376j.mo88969b(view) : InterpolatorC42155b.m92539b(view, this.f91062a);
    }
}
