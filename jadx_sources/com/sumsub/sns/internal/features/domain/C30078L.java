package com.sumsub.sns.internal.features.domain;

import android.content.Context;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.common.AbstractC28461i;
import com.sumsub.sns.internal.core.domain.C28535a;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.log.C30002b;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.logger.C33303i;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.TimeoutKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30078L {

    /* JADX INFO: renamed from: a */
    public final Context f60436a;

    /* JADX INFO: renamed from: b */
    public final C29903a f60437b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29953a f60438c;

    /* JADX INFO: renamed from: d */
    public final C30002b f60439d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC28584k f60440e;

    /* JADX INFO: renamed from: f */
    public final AbstractC41697j0 f60441f;

    /* JADX INFO: renamed from: g */
    public volatile Boolean f60442g;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m70102a(C30078L c30078l, ContinuationImpl continuationImpl) {
        C30075I c30075i;
        if (continuationImpl instanceof C30075I) {
            c30075i = (C30075I) continuationImpl;
            int i11 = c30075i.f60430c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30075i.f60430c = i11 - Integer.MIN_VALUE;
            } else {
                c30075i = new C30075I(c30078l, continuationImpl);
            }
        } else {
            c30075i = new C30075I(c30078l, continuationImpl);
        }
        Object objM90469d = c30075i.f60428a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30075i.f60430c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90469d);
            Boolean bool = c30078l.f60442g;
            if (bool != null) {
                return Boxing.boxBoolean(bool.booleanValue());
            }
            C30076J c30076j = new C30076J(c30078l, null);
            c30075i.f60430c = 1;
            objM90469d = TimeoutKt.m90469d(1500L, c30076j, c30075i);
            if (objM90469d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90469d);
        }
        Boolean bool2 = (Boolean) objM90469d;
        if (bool2 != null) {
            c30078l.f60442g = bool2;
        }
        return Boxing.boxBoolean(bool2 != null ? bool2.booleanValue() : false);
    }

    public C30078L(Context context, C29903a c29903a, InterfaceC29953a interfaceC29953a, C30002b c30002b, C28535a c28535a) {
        AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
        this.f60436a = context;
        this.f60437b = c29903a;
        this.f60438c = interfaceC29953a;
        this.f60439d = c30002b;
        this.f60440e = c28535a;
        this.f60441f = abstractC41697j0M91392b;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70103a(SuspendLambda suspendLambda) {
        C29903a c29903a = C28366e.f57832a;
        C28366e.f57832a = this.f60437b;
        C28366e.f57834c.clear();
        C33303i c33303i = new C33303i(this.f60439d, this.f60440e, this.f60436a.getCacheDir());
        C33272c c33272c = C33272c.f67812a;
        C33272c.f67815d.put(LoggerType.KIBANA, c33303i);
        C33272c.f67816e.f67811b.f67874b = c33303i;
        Object objM91049g = C41686h.m91049g(this.f60441f, new C30077K(this, AbstractC28461i.m69361a(this.f60436a), null), suspendLambda);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }
}
