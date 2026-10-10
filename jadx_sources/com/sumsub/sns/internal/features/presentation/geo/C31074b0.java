package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29094c;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.domain.geo.C30213x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31074b0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62830a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31120v0 f62832c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31120v0 f62833d;

    /* JADX INFO: renamed from: e */
    public C31120v0 f62834e;

    /* JADX INFO: renamed from: f */
    public List f62835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31074b0(C31120v0 c31120v0, Continuation continuation, C31120v0 c31120v1) {
        super(2, continuation);
        this.f62832c = c31120v0;
        this.f62833d = c31120v1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31074b0 c31074b0 = new C31074b0(this.f62832c, continuation, this.f62833d);
        c31074b0.f62831b = obj;
        return c31074b0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31074b0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        if (r14 == r0) goto L56;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70120a;
        String strMo69715b;
        Object objM103844constructorimpl;
        String str;
        List list;
        C31120v0 c31120v0;
        Map map;
        Object objM70141a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62830a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ResultKt.throwOnFailure(obj);
                            objM70141a = ((Result) obj).getValue();
                            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70141a);
                            if (thM103847exceptionOrNullimpl == null) {
                                C31120v0 c31120v1 = this.f62833d;
                                List listEmptyList = CollectionsKt.emptyList();
                                KProperty[] kPropertyArr = C31120v0.f62914w;
                                C28936t c28936t = c31120v1.f62927m;
                                KProperty kProperty = C31120v0.f62914w[0];
                                c28936t.f58834a.set(c28936t.f58835b, listEmptyList);
                                AbstractC28052C.finish$default(this.f62833d, new C28494t(), null, null, null, 14, null);
                            } else {
                                C31120v0 c31120v2 = this.f62833d;
                                AbstractC28052C.throwError$default(c31120v2, thM103847exceptionOrNullimpl, c31120v2.f62921g.getType().f59014a, null, 4, null);
                            }
                            this.f62832c.showProgress(false);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = this.f62835f;
                    c31120v0 = this.f62834e;
                    map = (Map) this.f62831b;
                    ResultKt.throwOnFailure(obj);
                    this.f62833d.f62934t.setValue(new C31111r(c31120v0.m70583a((C29983l) obj, list, map, this.f62833d.f62936v)));
                    this.f62832c.showProgress(false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objM70120a = ((Result) obj).getValue();
            } else {
                ResultKt.throwOnFailure(obj);
                C28367f.m69256a(this.f62833d.m70585e(), Control.ContinueButton, (Map) null, (Popup) null, 6);
                C28936t c28936t2 = this.f62833d.f62927m;
                KProperty kProperty2 = C31120v0.f62914w[0];
                List list2 = (List) c28936t2.m69705a();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AbstractC29103d2 abstractC29103d2 = ((C29094c) it.next()).f59041a.f59781b;
                    if (abstractC29103d2 != null) {
                        strMo69715b = abstractC29103d2.mo69715b();
                    } else {
                        strMo69715b = null;
                    }
                    arrayList.add(strMo69715b);
                }
                C31070a.m70567a("sendAddressData: fields=" + arrayList);
                C30156e c30156e = this.f62833d.f62919e;
                this.f62830a = 1;
                objM70120a = c30156e.m70120a(false, (ContinuationImpl) this);
                if (objM70120a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (Result.m103851isSuccessimpl(objM70120a)) {
                objM103844constructorimpl = Result.m103844constructorimpl(((C30270n) objM70120a).f60856c);
            } else {
                objM103844constructorimpl = Result.m103844constructorimpl(objM70120a);
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) == null) {
                Map map2 = (Map) objM103844constructorimpl;
                C31120v0 c31120v3 = this.f62833d;
                KProperty[] kPropertyArr2 = C31120v0.f62914w;
                C28936t c28936t3 = c31120v3.f62927m;
                KProperty kProperty3 = C31120v0.f62914w[0];
                List list3 = (List) c28936t3.m69705a();
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C29094c c29094c = (C29094c) it2.next();
                            if (c29094c.f59041a.f59782c && ((str = c29094c.f59042b) == null || StringsKt.isBlank(str))) {
                                C31070a.m70567a("not all required fields are filled");
                                C31120v0 c31120v4 = this.f62833d;
                                this.f62831b = map2;
                                this.f62834e = c31120v4;
                                this.f62835f = list3;
                                this.f62830a = 2;
                                Object strings = c31120v4.getStrings(this);
                                if (strings != coroutine_suspended) {
                                    list = list3;
                                    c31120v0 = c31120v4;
                                    map = map2;
                                    obj = strings;
                                    this.f62833d.f62934t.setValue(new C31111r(c31120v0.m70583a((C29983l) obj, list, map, this.f62833d.f62936v)));
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                C30213x c30213x = this.f62833d.f62916b;
                this.f62830a = 3;
                objM70141a = c30213x.m70141a(list3, this);
            } else {
                AbstractC28052C.throwError$default(this.f62833d, new SNSGeneralException("Send address countries data error", null, null, 6, null), this.f62833d.f62921g.getType().f59014a, null, 4, null);
            }
            this.f62832c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f62832c.showProgress(false);
            throw th2;
        }
    }
}
