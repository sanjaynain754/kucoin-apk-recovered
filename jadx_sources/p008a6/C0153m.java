package p008a6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BasePool;
import com.facebook.imagepipeline.memory.PoolStatsTracker;
import p712w3.C45708h;
import p819z3.InterfaceC46675d;

/* JADX INFO: renamed from: a6.m */
/* JADX INFO: compiled from: BucketsBitmapPool.java */
/* JADX INFO: loaded from: classes34.dex */
@TargetApi(21)
public class C0153m extends BasePool<Bitmap> implements InterfaceC0149i {
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Bitmap mo699g(int i11) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i11) / 2.0d), Bitmap.Config.RGB_565);
    }

    public C0153m(InterfaceC46675d interfaceC46675d, C0148h0 c0148h0, PoolStatsTracker poolStatsTracker, boolean z11) {
        super(interfaceC46675d, c0148h0, poolStatsTracker, z11);
        m9474s();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo700k(Bitmap bitmap) {
        C45708h.m100896g(bitmap);
        bitmap.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo702o(Bitmap bitmap) {
        C45708h.m100896g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Bitmap mo704q(C0150j<Bitmap> c0150j) {
        Bitmap bitmap = (Bitmap) super.mo704q(c0150j);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo705u(Bitmap bitmap) {
        C45708h.m100896g(bitmap);
        if (!bitmap.isRecycled() && bitmap.isMutable()) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo701n(int i11) {
        return i11;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo703p(int i11) {
        return i11;
    }
}
