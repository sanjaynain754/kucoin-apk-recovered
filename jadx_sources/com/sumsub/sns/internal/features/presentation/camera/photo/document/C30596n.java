package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.core.common.AbstractC28396H;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30596n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public long f61802a;

    /* JADX INFO: renamed from: b */
    public int f61803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30471K f61804c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageProxy f61805d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C28758x f61806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30596n(C30471K c30471k, ImageProxy imageProxy, C28758x c28758x, Continuation continuation) {
        super(2, continuation);
        this.f61804c = c30471k;
        this.f61805d = imageProxy;
        this.f61806e = c28758x;
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m70413a(C30471K c30471k, int i11, int i12) {
        C30590m c30590m = C30471K.f61458R;
        return c30471k.m70394a(i11, i12);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30596n(this.f61804c, this.f61805d, this.f61806e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30596n) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61803b;
        TextView textView = null;
        if (i11 != 0) {
            if (i11 == 1) {
                j11 = this.f61802a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30471K c30471k = this.f61804c;
            if (c30471k.f61476Q) {
                if (C28468k0.f57988f) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "skipped frame", null);
                }
                return Unit.INSTANCE;
            }
            c30471k.f61476Q = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ImageProxy imageProxy = this.f61805d;
            final C30471K c30471k2 = this.f61804c;
            Object objM69280a = AbstractC28396H.m69280a(imageProxy, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.q4
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return C30596n.m70413a(c30471k2, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            });
            C30471K c30471k3 = this.f61804c;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM69280a);
            if (thM103847exceptionOrNullimpl == null) {
                C30471K c30471k4 = this.f61804c;
                this.f61802a = jCurrentTimeMillis;
                this.f61803b = 1;
                if (c30471k4.mo70212a((Bitmap) objM69280a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j11 = jCurrentTimeMillis;
            } else {
                c30471k3.f61476Q = false;
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "failed to convert imageProxy to bitmap", thM103847exceptionOrNullimpl);
                return Unit.INSTANCE;
            }
        }
        C30471K c30471k5 = this.f61804c;
        c30471k5.f61476Q = false;
        ViewGroup viewGroup = (ViewGroup) c30471k5.f61494z.getValue(c30471k5, C30471K.f61459S[18]);
        if (viewGroup != null) {
            textView = (TextView) viewGroup.findViewById(R$id.text3);
        }
        if (textView != null) {
            AbstractC28458h.m69341a(textView, "frame handle: " + C30471K.m70376a(System.currentTimeMillis() - j11));
        }
        return Unit.INSTANCE;
    }
}
