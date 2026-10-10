package p632t5;

import android.graphics.Bitmap;
import p006a4.AbstractC0110a;
import p251f4.AbstractC37350a;
import p251f4.InterfaceC37351b;
import p749x5.InterfaceC46070d;
import p749x5.InterfaceC46071e;

/* JADX INFO: renamed from: t5.b */
/* JADX INFO: compiled from: BaseBitmapDataSubscriber.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC44692b extends AbstractC37350a<AbstractC0110a<InterfaceC46071e>> {
    /* JADX INFO: renamed from: a */
    public abstract void mo14068a(Bitmap bitmap);

    @Override // p251f4.AbstractC37350a
    public void onNewResultImpl(InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> interfaceC37351b) {
        Bitmap bitmapMo101544K;
        if (!interfaceC37351b.isFinished()) {
            return;
        }
        AbstractC0110a<InterfaceC46071e> result = interfaceC37351b.getResult();
        if (result != null && (result.m565l() instanceof InterfaceC46070d)) {
            bitmapMo101544K = ((InterfaceC46070d) result.m565l()).mo101544K();
        } else {
            bitmapMo101544K = null;
        }
        try {
            mo14068a(bitmapMo101544K);
        } finally {
            AbstractC0110a.m555j(result);
        }
    }
}
