package com.sumsub.sns.internal.features.presentation.camera.photo;

import android.text.Spanned;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Lazy;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30411P extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f61187a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f61188b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C30400E f61189c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CharSequence f61190d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f61191e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f61192f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lazy f61193g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Lazy f61194h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30411P(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Lazy lazy, Lazy lazy2, Continuation continuation) {
        super(4, continuation);
        this.f61190d = charSequence;
        this.f61191e = charSequence2;
        this.f61192f = charSequence3;
        this.f61193g = lazy;
        this.f61194h = lazy2;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C30411P c30411p = new C30411P(this.f61190d, this.f61191e, this.f61192f, this.f61193g, this.f61194h, (Continuation) obj4);
        c30411p.f61187a = (List) obj;
        c30411p.f61188b = (List) obj2;
        c30411p.f61189c = (C30400E) obj3;
        return c30411p.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30401F c30401f;
        CharSequence charSequence;
        C30401F c30401f2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = this.f61187a;
        List list2 = this.f61188b;
        C30400E c30400e = this.f61189c;
        if (list != null && list2 != null) {
            if (list.isEmpty() && list2.isEmpty()) {
                return new C30693s((Spanned) this.f61193g.getValue());
            }
            CharSequence charSequence2 = this.f61190d;
            C30685o c30685o = null;
            if (list2.isEmpty()) {
                charSequence2 = null;
            }
            if (charSequence2 != null) {
                c30401f = new C30401F(charSequence2);
            } else {
                c30401f = null;
            }
            if (!list.isEmpty()) {
                if (!list2.isEmpty()) {
                    charSequence = this.f61191e;
                } else {
                    charSequence = this.f61192f;
                }
            } else {
                charSequence = null;
            }
            if (charSequence != null) {
                c30401f2 = new C30401F(charSequence);
            } else {
                c30401f2 = null;
            }
            if (!list.isEmpty() && !list2.isEmpty()) {
                c30685o = (C30685o) this.f61194h.getValue();
            }
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            if (c30401f != null) {
                Boxing.boxBoolean(listCreateListBuilder.add(c30401f));
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                listCreateListBuilder.add((InterfaceC30681m) it.next());
            }
            if (c30685o != null) {
                Boxing.boxBoolean(listCreateListBuilder.add(c30685o));
            }
            if (c30401f2 != null) {
                Boxing.boxBoolean(listCreateListBuilder.add(c30401f2));
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                listCreateListBuilder.add((InterfaceC30681m) it2.next());
            }
            return new C30689q(CollectionsKt.build(listCreateListBuilder), c30400e);
        }
        return C30691r.f62021a;
    }
}
