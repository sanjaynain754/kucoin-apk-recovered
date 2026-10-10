package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.appdata.C30096c;
import com.sumsub.sns.internal.features.domain.appdata.C30099f;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31197L0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f63075a;

    /* JADX INFO: renamed from: b */
    public List f63076b;

    /* JADX INFO: renamed from: c */
    public AbstractC29172p f63077c;

    /* JADX INFO: renamed from: d */
    public int f63078d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31251c2 f63079e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f63080f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31197L0(C31251c2 c31251c2, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f63079e = c31251c2;
        this.f63080f = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31197L0(this.f63079e, this.f63080f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31197L0(this.f63079e, this.f63080f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code duplicated, block: B:78:0x018a  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (com.sumsub.sns.internal.features.presentation.main.C31251c2.m70637a(r23.f63079e, (com.sumsub.sns.internal.features.data.model.common.C29082a) r11, r13, r23) == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        if (com.sumsub.sns.internal.features.presentation.main.C31251c2.m70638a(r0, r11, r13, r3, r4, r23) == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c1, code lost:
    
        if (r0.m70656b(false, r23) == r6) goto L81;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70111a;
        Object obj2;
        AbstractC29172p abstractC29172p;
        C29124h config;
        List list;
        Object objM70045b;
        List list2;
        AbstractC29172p abstractC29172p2;
        Object obj3;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63078d;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C28936t c28936t = this.f63079e.f63287u;
            KProperty[] kPropertyArr = C31251c2.f63267D;
            KProperty kProperty = kPropertyArr[2];
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Move to next document..., reload documents = " + ((Boolean) c28936t.m69705a()).booleanValue(), null);
            C31251c2 c31251c2 = this.f63079e;
            C30099f c30099f = c31251c2.f63273g;
            C28936t c28936t2 = c31251c2.f63287u;
            KProperty kProperty2 = kPropertyArr[2];
            boolean zBooleanValue = ((Boolean) c28936t2.m69705a()).booleanValue();
            InterfaceC29921d interfaceC29921d = this.f63079e.f63278l;
            this.f63078d = 1;
            objM70111a = c30099f.m70111a(zBooleanValue, interfaceC29921d, this);
            if (objM70111a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i11 != 4 && i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            abstractC29172p2 = this.f63077c;
            List list3 = this.f63076b;
            Object obj4 = this.f63075a;
            ResultKt.throwOnFailure(obj);
            obj3 = obj4;
            list2 = list3;
            objM70045b = obj;
            config = (C29124h) ((AbstractC29971N) objM70045b).m70052d();
            list = list2;
            obj2 = obj3;
            abstractC29172p = abstractC29172p2;
            if (abstractC29172p != null || list == null) {
                if (abstractC29172p == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "moveToNextDocument; applicant==null ? " + z11 + "; documents==null ? " + (list == null) + "; ", null);
                C31251c2 c31251c3 = this.f63079e;
                this.f63075a = null;
                this.f63076b = null;
                this.f63077c = null;
                this.f63078d = 3;
                C31363x0 c31363x0 = C31251c2.f63266C;
            } else {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "moveToNextDocument, flowType=" + config.f59069b + ", documents: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.main.m2
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return C31197L0.m70596a((Document) obj5);
                    }
                }, 31, null), null);
                if (AbstractC29130i.m69785k(config)) {
                    this.f63075a = null;
                    this.f63076b = null;
                    this.f63077c = null;
                    this.f63078d = 4;
                } else {
                    if (Result.m103850isFailureimpl(obj2)) {
                        obj2 = null;
                    }
                    C30096c c30096c = (C30096c) obj2;
                    ReviewStatusType reviewStatusType = c30096c != null ? c30096c.f60498c : null;
                    C31251c2 c31251c4 = this.f63079e;
                    boolean z12 = this.f63080f || abstractC29172p.m69800p();
                    this.f63075a = null;
                    this.f63076b = null;
                    this.f63077c = null;
                    this.f63078d = 5;
                }
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(obj);
        objM70111a = ((Result) obj).getValue();
        obj2 = objM70111a;
        if (Result.m103851isSuccessimpl(obj2)) {
            C30096c c30096c2 = (C30096c) (Result.m103850isFailureimpl(obj2) ? null : obj2);
            List list4 = c30096c2 != null ? c30096c2.f60497b : null;
            C30096c c30096c3 = (C30096c) (Result.m103850isFailureimpl(obj2) ? null : obj2);
            abstractC29172p = c30096c3 != null ? c30096c3.f60496a : null;
            C31251c2 c31251c5 = this.f63079e;
            C31363x0 c31363x1 = C31251c2.f63266C;
            config = c31251c5.getConfig();
            if (config == null) {
                InterfaceC29984m interfaceC29984m = this.f63079e.f63276j;
                this.f63075a = obj2;
                this.f63076b = list4;
                this.f63077c = abstractC29172p;
                this.f63078d = 2;
                objM70045b = ((C29967J) interfaceC29984m).m70045b(true, this);
                if (objM70045b != coroutine_suspended) {
                    list2 = list4;
                    abstractC29172p2 = abstractC29172p;
                    obj3 = obj2;
                    config = (C29124h) ((AbstractC29971N) objM70045b).m70052d();
                    list = list2;
                    obj2 = obj3;
                    abstractC29172p = abstractC29172p2;
                    if (abstractC29172p != null) {
                        if (abstractC29172p == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (list == null) {
                        }
                        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "moveToNextDocument; applicant==null ? " + z11 + "; documents==null ? " + (list == null) + "; ", null);
                        C31251c2 c31251c6 = this.f63079e;
                        this.f63075a = null;
                        this.f63076b = null;
                        this.f63077c = null;
                        this.f63078d = 3;
                        C31363x0 c31363x2 = C31251c2.f63266C;
                    } else {
                        if (abstractC29172p == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (list == null) {
                        }
                        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "moveToNextDocument; applicant==null ? " + z11 + "; documents==null ? " + (list == null) + "; ", null);
                        C31251c2 c31251c7 = this.f63079e;
                        this.f63075a = null;
                        this.f63076b = null;
                        this.f63077c = null;
                        this.f63078d = 3;
                        C31363x0 c31363x3 = C31251c2.f63266C;
                    }
                }
            } else {
                list = list4;
                if (abstractC29172p != null) {
                    if (abstractC29172p == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (list == null) {
                    }
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "moveToNextDocument; applicant==null ? " + z11 + "; documents==null ? " + (list == null) + "; ", null);
                    C31251c2 c31251c8 = this.f63079e;
                    this.f63075a = null;
                    this.f63076b = null;
                    this.f63077c = null;
                    this.f63078d = 3;
                    C31363x0 c31363x4 = C31251c2.f63266C;
                } else {
                    if (abstractC29172p == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (list == null) {
                    }
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "moveToNextDocument; applicant==null ? " + z11 + "; documents==null ? " + (list == null) + "; ", null);
                    C31251c2 c31251c9 = this.f63079e;
                    this.f63075a = null;
                    this.f63076b = null;
                    this.f63077c = null;
                    this.f63078d = 3;
                    C31363x0 c31363x5 = C31251c2.f63266C;
                }
            }
            return coroutine_suspended;
        }
        AbstractC28052C.throwError$default(this.f63079e, (Exception) Result.m103847exceptionOrNullimpl(obj2), "TYPE_UNKNOWN", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m70596a(Document document) {
        return document.getType().f59014a;
    }
}
