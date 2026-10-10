package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import androidx.autofill.HintConstants;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.presentation.widget.autocompletePhone.util.AbstractC28974a;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28990D;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C28987C1;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.appdata.C30094a;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32653g;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31502t extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f63917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31476A f63918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31502t(C31476A c31476a, Continuation continuation) {
        super(1, continuation);
        this.f63918b = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C31502t(this.f63918b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C31502t(this.f63918b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (r1.m70742a(r14, r13) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ff, code lost:
    
        if (r14.m70741a(r1, r4, r13) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        Boolean boolBoxBoolean;
        String str;
        C29719y c29719y;
        AbstractC29103d2 abstractC29103d2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63917a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            C31476A c31476a = this.f63918b;
            List list = c31476a.f63862n;
            if (list == null) {
                return Unit.INSTANCE;
            }
            List list2 = c31476a.f63863o;
            if (list2 == null) {
                return Unit.INSTANCE;
            }
            Iterator it = list2.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    AbstractC28990D abstractC28990D = (AbstractC28990D) next;
                    if (abstractC28990D instanceof C29719y) {
                        c29719y = (C29719y) abstractC28990D;
                    } else {
                        c29719y = null;
                    }
                    if (c29719y != null) {
                        abstractC29103d2 = c29719y.f59781b;
                    } else {
                        abstractC29103d2 = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(abstractC29103d2, C28987C1.f58906b));
            if (((AbstractC28990D) next) != null && (str = (String) this.f63918b.m70747e().get(HintConstants.AUTOFILL_HINT_PHONE)) != null) {
                boolBoxBoolean = Boxing.boxBoolean(AbstractC28974a.m69714a(str));
            } else {
                boolBoxBoolean = null;
            }
            this.f63918b.f63866r.getClass();
            Set setM70751a = C31481F.m70751a(list);
            C29983l strings = this.f63918b.getStrings();
            C31476A c31476a2 = this.f63918b;
            List listM71276a = AbstractC32653g.m71276a(list2, strings, c31476a2.f63855g, c31476a2.f63857i, c31476a2.f63858j, boolBoxBoolean, c31476a2.m70747e(), setM70751a);
            if (listM71276a != null) {
                C31482a.m70753a("submitApplicantData: errors=" + listM71276a.size());
                Iterator it2 = listM71276a.iterator();
                while (it2.hasNext()) {
                    C31482a.m70753a("submitApplicantData: invalid field value=" + ((C30094a) it2.next()).f60488a.mo69727c());
                }
                C31476A c31476a3 = this.f63918b;
                this.f63917a = 1;
            } else {
                AbstractC28073M0.updateState$default(this.f63918b, false, new C31501s(null), 1, null);
                C31476A c31476a4 = this.f63918b;
                this.f63917a = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
