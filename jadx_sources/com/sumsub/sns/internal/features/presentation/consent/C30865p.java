package com.sumsub.sns.internal.features.presentation.consent;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.utils.C32641a;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30865p extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Integer f62343a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f62344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28075O f62345c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30870u f62346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30865p(C28075O c28075o, C30870u c30870u, Continuation continuation) {
        super(3, continuation);
        this.f62345c = c28075o;
        this.f62346d = c30870u;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C30865p c30865p = new C30865p(this.f62345c, this.f62346d, (Continuation) obj3);
        c30865p.f62343a = (Integer) obj;
        c30865p.f62344b = (List) obj2;
        return c30865p.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM71265a;
        String strJoinToString$default;
        C29380i c29380i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Integer num = this.f62343a;
        List list = this.f62344b;
        C29983l c29983l = this.f62345c.f57271c;
        Pair pairM90091to = list.size() > 1 ? TuplesKt.m90091to(c29983l != null ? c29983l.m70061a("sns_agreement_header") : null, null) : TuplesKt.m90091to(c29983l != null ? c29983l.m70061a("sns_agreement_special_title") : null, c29983l != null ? c29983l.m70061a("sns_agreement_special_subtitle") : null);
        String str = (String) pairM90091to.component1();
        String str2 = (String) pairM90091to.component2();
        C32649e c32649e = this.f62346d.f62363d;
        C28075O c28075o = this.f62345c;
        C29124h c29124h = c28075o.f57270b;
        C29983l c29983l2 = c28075o.f57271c;
        List list2 = c29983l2 != null ? c29983l2.f60249b : null;
        c32649e.getClass();
        if (num != null) {
            int iIntValue = num.intValue();
            strM71265a = (list2 == null || (c29380i = (C29380i) CollectionsKt.getOrNull(list2, iIntValue)) == null) ? null : C32649e.m71265a(c29124h, c29380i, iIntValue);
            if (strM71265a == null) {
                strM71265a = "";
            }
        } else {
            strM71265a = "";
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj2 : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C29380i c29380i2 = (C29380i) obj2;
                C32641a c32641a = C32649e.f66642b;
                String strM71266b = !C32641a.m71262a(c29380i2) ? null : C32649e.m71266b(c29124h, c29380i2, i11);
                if (strM71266b != null) {
                    arrayList.add(strM71266b);
                }
                i11 = i12;
            }
            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "\n\n", null, null, 0, null, null, 62, null);
            if (strJoinToString$default == null || StringsKt.isBlank(strJoinToString$default)) {
                strJoinToString$default = null;
            }
        } else {
            strJoinToString$default = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM71265a);
        if (strJoinToString$default != null && !StringsKt.isBlank(strJoinToString$default)) {
            sb2.append("\n\n");
            sb2.append(strJoinToString$default);
        }
        return new C30863n(num, str, str2, c29983l != null ? c29983l.m70061a("sns_agreement_action_continue") : null, AbstractC28462i0.m69363a(AbstractC28462i0.m69364a(sb2.toString(), ((C28547d) c32649e.f66644a).f58099a.f58163a)), list, true ^ (strJoinToString$default == null || StringsKt.isBlank(strJoinToString$default)));
    }
}
