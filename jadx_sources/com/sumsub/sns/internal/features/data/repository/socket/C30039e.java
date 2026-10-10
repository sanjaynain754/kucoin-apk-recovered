package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.features.data.model.common.remote.C29210E2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29215F2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29226H3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29270Q2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29327b2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29367g2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29375h2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29636s2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29643t2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29685z2;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29960C;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41696j;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30039e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30050p f60342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30039e(C30050p c30050p, Continuation continuation) {
        super(2, continuation);
        this.f60342b = c30050p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30039e c30039e = new C30039e(this.f60342b, continuation);
        c30039e.f60341a = obj;
        return c30039e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30039e c30039e = new C30039e(this.f60342b, (Continuation) obj2);
        c30039e.f60341a = (C29226H3) obj;
        return c30039e.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C29226H3 c29226h3 = (C29226H3) this.f60341a;
        boolean z11 = c29226h3 instanceof C29270Q2;
        if (!z11) {
            C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "Socket event " + c29226h3.f59217a + ": " + c29226h3, null);
        }
        if (c29226h3 instanceof C29643t2) {
            C29636s2 c29636s2 = ((C29643t2) c29226h3).f59699c;
            if (c29636s2 != null && (str3 = c29636s2.f59694b) != null) {
                this.f60342b.f60374d.put(str3);
            }
            C29967J c29967j = (C29967J) this.f60342b.f60372b;
            C41696j.m91104d(c29967j.f60194b, c29967j.f60195c, null, new C29960C(c29967j, null), 2, null);
        } else if (c29226h3 instanceof C29215F2) {
            C29210E2 c29210e2 = ((C29215F2) c29226h3).f59205c;
            if (c29210e2 != null && (str2 = c29210e2.f59200c) != null) {
                this.f60342b.f60374d.put(str2);
            }
            C29967J c29967j2 = (C29967J) this.f60342b.f60372b;
            C41696j.m91104d(c29967j2.f60194b, c29967j2.f60195c, null, new C29960C(c29967j2, null), 2, null);
            ((C29967J) this.f60342b.f60372b).m70046b();
        } else if (c29226h3 instanceof C29375h2) {
            C29367g2 c29367g2 = ((C29375h2) c29226h3).f59386c;
            if (c29367g2 != null && (str = c29367g2.f59380c) != null) {
                this.f60342b.f60374d.put(str);
            }
            C29967J c29967j3 = (C29967J) this.f60342b.f60372b;
            C41696j.m91104d(c29967j3.f60194b, c29967j3.f60195c, null, new C29960C(c29967j3, null), 2, null);
            ((C29967J) this.f60342b.f60372b).m70046b();
        } else if (c29226h3 instanceof C29327b2) {
            ((C29967J) this.f60342b.f60372b).m70046b();
        } else if (!(c29226h3 instanceof C29685z2) && !z11) {
            C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "event dropped: " + c29226h3.f59217a, null);
        }
        return Unit.INSTANCE;
    }
}
