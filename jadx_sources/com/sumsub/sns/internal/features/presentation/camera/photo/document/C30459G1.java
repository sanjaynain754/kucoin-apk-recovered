package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import androidx.core.app.FrameMetricsAggregator;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.G1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30459G1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f61406b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30440B2 f61407c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32635M f61408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30459G1(boolean z11, C30440B2 c30440b2, C32635M c32635m, Continuation continuation) {
        super(2, continuation);
        this.f61406b = z11;
        this.f61407c = c30440b2;
        this.f61408d = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30459G1(this.f61406b, this.f61407c, this.f61408d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30459G1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r8.m70294a(r1, r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61405a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.f61406b) {
                C30440B2 c30440b2 = this.f61407c;
                C32635M c32635m = this.f61408d;
                this.f61405a = 1;
                KProperty[] kPropertyArr = C30440B2.f61279U;
                c32635m.m71239a(IdentitySide.Back);
                c30440b2.m70299a(c32635m.f66620l.m71283a());
                Object objM70312f = c30440b2.m70312f(this);
                if (objM70312f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70312f = Unit.INSTANCE;
                }
            } else {
                C32635M c32635m2 = this.f61408d;
                List listM71250c = c32635m2.m71250c();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM71250c, 10));
                Iterator it = listM71250c.iterator();
                while (it.hasNext()) {
                    arrayList.add(C29054T.m69738a((C29054T) it.next(), null, null, null, FrameMetricsAggregator.EVERY_DURATION));
                }
                c32635m2.m71244a(arrayList);
                C30440B2 c30440b3 = this.f61407c;
                C32635M c32635m3 = this.f61408d;
                this.f61405a = 2;
                KProperty[] kPropertyArr2 = C30440B2.f61279U;
            }
        }
        return Unit.INSTANCE;
    }
}
