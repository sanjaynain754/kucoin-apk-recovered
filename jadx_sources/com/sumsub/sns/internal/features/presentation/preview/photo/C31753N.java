package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.os.Parcelable;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import com.sumsub.sns.internal.features.domain.documents.C30134e;
import com.sumsub.sns.internal.features.domain.documents.C30143n;
import com.sumsub.sns.internal.features.domain.documents.C30145p;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32668s;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31753N extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30146q f64518b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC31770c0 f64519c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f64520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31753N(AbstractC30146q abstractC30146q, AbstractC31770c0 abstractC31770c0, List list, Continuation continuation) {
        super(2, continuation);
        this.f64518b = abstractC30146q;
        this.f64519c = abstractC31770c0;
        this.f64520d = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31753N(this.f64518b, this.f64519c, this.f64520d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31753N) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r1.m71232a(r2, r15, r14) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r15.m71232a(r1, (com.sumsub.sns.internal.features.domain.documents.DocumentSideness) null, r14) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r15.m70859a(r1, r14) == r0) goto L34;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64517a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C32635M c32635m = this.f64519c.f64559h;
                        C30134e c30134e = (C30134e) this.f64518b;
                        c32635m.m71243a(c30134e.f60572a, c30134e.f60573b, c30134e.f60574c);
                        AbstractC31770c0 abstractC31770c0 = this.f64519c;
                        AbstractC30146q abstractC30146q = this.f64518b;
                        this.f64517a = 4;
                        KProperty[] kPropertyArr = AbstractC31770c0.f64557l;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    AbstractC31770c0 abstractC31770c1 = this.f64519c;
                    AbstractC30146q abstractC30146q2 = this.f64518b;
                    this.f64517a = 4;
                    KProperty[] kPropertyArr2 = AbstractC31770c0.f64557l;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AbstractC31770c0 abstractC31770c2 = this.f64519c;
            C29131i0 c29131i0 = new C29131i0((Throwable) null, (Parcelable) null, 7);
            KProperty[] kPropertyArr3 = AbstractC31770c0.f64557l;
            AbstractC28052C.throwError$default(abstractC31770c2, c29131i0, abstractC31770c2.f64476a.getType().f59014a, false, null, 12, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC30146q abstractC30146q3 = this.f64518b;
        if (abstractC30146q3 instanceof C30143n) {
            C32635M c32635m2 = this.f64519c.f64559h;
            List list = this.f64520d;
            DocumentSideness documentSideness = ((C30143n) abstractC30146q3).f60578a;
            this.f64517a = 1;
        } else if (abstractC30146q3 instanceof C30145p) {
            C32635M c32635m3 = this.f64519c.f64559h;
            List list2 = this.f64520d;
            this.f64517a = 2;
            C32668s c32668s = C32635M.f66606w;
            if (c32635m3.m71232a(list2, (DocumentSideness) null, this) != coroutine_suspended) {
                AbstractC31770c0 abstractC31770c3 = this.f64519c;
                AbstractC30146q abstractC30146q4 = this.f64518b;
                this.f64517a = 4;
                KProperty[] kPropertyArr4 = AbstractC31770c0.f64557l;
            }
        } else if (abstractC30146q3 instanceof C30134e) {
            C32635M c32635m4 = this.f64519c.f64559h;
            List list3 = this.f64520d;
            this.f64517a = 3;
            C32668s c32668s2 = C32635M.f66606w;
        } else {
            AbstractC31770c0 abstractC31770c4 = this.f64519c;
            AbstractC30146q abstractC30146q5 = this.f64518b;
            this.f64517a = 4;
            KProperty[] kPropertyArr5 = AbstractC31770c0.f64557l;
        }
        return coroutine_suspended;
    }
}
