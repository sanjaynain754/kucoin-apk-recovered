package jumio.core;

import android.graphics.Bitmap;
import com.jumio.commons.utils.BitmapUtilKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.core.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C40697n extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Bitmap f90330a;

    /* JADX INFO: renamed from: b */
    public Object f90331b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f90332c;

    /* JADX INFO: renamed from: d */
    public int f90333d;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90332c = obj;
        this.f90333d |= Integer.MIN_VALUE;
        return BitmapUtilKt.use(null, null, this);
    }

    public C40697n(Continuation continuation) {
        super(continuation);
    }
}
