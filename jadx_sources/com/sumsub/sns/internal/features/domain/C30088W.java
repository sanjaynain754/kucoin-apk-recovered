package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.C29698t3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30088W {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f60474a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29984m f60475b;

    public C30088W(C28578h c28578h) {
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) c28578h.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) c28578h.f58180r.getValue();
        this.f60474a = interfaceC29953a;
        this.f60475b = interfaceC29984m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (p852kotlin.Unit.INSTANCE == r1) goto L37;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70108a(InterfaceC29921d interfaceC29921d, AbstractC29172p abstractC29172p, List list, boolean z11, ContinuationImpl continuationImpl) {
        C30087V c30087v;
        AbstractC29172p abstractC29172pM69751a;
        if (continuationImpl instanceof C30087V) {
            c30087v = (C30087V) continuationImpl;
            int i11 = c30087v.f60473d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30087v.f60473d = i11 - Integer.MIN_VALUE;
            } else {
                c30087v = new C30087V(this, continuationImpl);
            }
        } else {
            c30087v = new C30087V(this, continuationImpl);
        }
        Object objM70017a = c30087v.f60471b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30087v.f60473d;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    abstractC29172p = c30087v.f60470a;
                    ResultKt.throwOnFailure(objM70017a);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM70017a);
                }
                Result.Companion companion = Result.INSTANCE;
                return Result.m103844constructorimpl(Unit.INSTANCE);
            }
            ResultKt.throwOnFailure(objM70017a);
            if (abstractC29172p.mo69752a() == null || z11) {
                c30087v.f60470a = abstractC29172p;
                c30087v.f60473d = 1;
                objM70017a = ((C29950z) interfaceC29921d).m70017a(list, c30087v);
                if (objM70017a == coroutine_suspended) {
                }
            } else {
                InterfaceC29984m interfaceC29984m = this.f60475b;
                c30087v.f60470a = null;
                c30087v.f60473d = 2;
                C29967J c29967j = (C29967J) interfaceC29984m;
                c29967j.f60202j.m70058a(abstractC29172p);
                c29967j.m70048c();
            }
            return coroutine_suspended;
            C29332c c29332c = (C29332c) objM70017a;
            if (abstractC29172p instanceof C29698t3) {
                abstractC29172pM69751a = C29698t3.m69908a((C29698t3) abstractC29172p, c29332c, null, 8175);
            } else {
                if (!(abstractC29172p instanceof C29082a)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC29172pM69751a = C29082a.m69751a((C29082a) abstractC29172p, c29332c, null, 32751);
            }
            abstractC29172p = abstractC29172pM69751a;
            InterfaceC29984m interfaceC29984m2 = this.f60475b;
            c30087v.f60470a = null;
            c30087v.f60473d = 2;
            C29967J c29967j2 = (C29967J) interfaceC29984m2;
            c29967j2.f60202j.m70058a(abstractC29172p);
            c29967j2.m70048c();
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(this), "Error during agreement acceptance", e11);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(AbstractC28543c.m69413a(this.f60474a, e11)));
        }
    }
}
