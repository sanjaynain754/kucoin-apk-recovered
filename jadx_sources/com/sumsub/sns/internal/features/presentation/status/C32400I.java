package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.core.presentation.helper.AbstractC28878b;
import com.sumsub.sns.internal.core.presentation.helper.C28879c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ApplicantStatus;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32400I extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f66025a;

    /* JADX INFO: renamed from: b */
    public CharSequence f66026b;

    /* JADX INFO: renamed from: c */
    public int f66027c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32403L f66028d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C28879c f66029e;

    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[LOOP:0: B:31:0x00c1->B:32:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3 A[PHI: r15
      0x00f3: PHI (r15v10 java.lang.Object) = (r15v4 java.lang.Object), (r15v0 java.lang.Object) binds: [B:36:0x00f0, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        Object string;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object string2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        Object string3;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Object string4;
        CharSequence charSequence9;
        ArrayList arrayListM71114a;
        C32403L c32403l;
        C28879c c28879c;
        ArrayList arrayList;
        int size;
        int i11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f66027c) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (C33048a.f67451N.m71434a()) {
                    C32403L c32403l2 = this.f66028d;
                    this.f66027c = 1;
                    obj = c32403l2.getString("sns_status_PENDING_title_noSteps", this);
                    if (obj != coroutine_suspended) {
                        charSequence = (CharSequence) obj;
                        C32403L c32403l3 = this.f66028d;
                        this.f66025a = charSequence;
                        this.f66027c = 2;
                        string = c32403l3.getString("sns_status_PENDING_subtitle_noSteps", this);
                        if (string != coroutine_suspended) {
                            charSequence2 = charSequence;
                            obj = string;
                            charSequence3 = (CharSequence) obj;
                            C32403L c32403l4 = this.f66028d;
                            this.f66025a = charSequence2;
                            this.f66026b = charSequence3;
                            this.f66027c = 3;
                            string2 = c32403l4.getString("sns_status_PENDING_footerHtml_noSteps", this);
                            if (string2 != coroutine_suspended) {
                                charSequence4 = charSequence2;
                                charSequence5 = charSequence3;
                                obj = string2;
                                return new C32407P(charSequence4, charSequence5, (CharSequence) obj, SNSApplicantStatusAnalyticsState.Pending);
                            }
                        }
                    }
                } else {
                    C32403L c32403l5 = this.f66028d;
                    KProperty[] kPropertyArr = C32403L.f66041o;
                    C29124h config = c32403l5.getConfig();
                    if (config == null || !AbstractC29130i.m69777c(config)) {
                        C32403L c32403l6 = this.f66028d;
                        this.f66027c = 4;
                        obj = c32403l6.getString("sns_status_PENDING_title", this);
                        if (obj != coroutine_suspended) {
                            charSequence6 = (CharSequence) obj;
                            C32403L c32403l7 = this.f66028d;
                            this.f66025a = charSequence6;
                            this.f66027c = 5;
                            string3 = c32403l7.getString("sns_status_PENDING_subtitle", this);
                            if (string3 != coroutine_suspended) {
                                charSequence7 = charSequence6;
                                obj = string3;
                                charSequence8 = (CharSequence) obj;
                                C32403L c32403l8 = this.f66028d;
                                this.f66025a = charSequence7;
                                this.f66026b = charSequence8;
                                this.f66027c = 6;
                                string4 = c32403l8.getString("sns_status_PENDING_footerHtml", this);
                                if (string4 != coroutine_suspended) {
                                    charSequence9 = charSequence8;
                                    obj = string4;
                                    CharSequence charSequence10 = (CharSequence) obj;
                                    C32403L c32403l9 = this.f66028d;
                                    C28879c c28879c2 = this.f66029e;
                                    List list = c28879c2.f58723c;
                                    AbstractC29172p abstractC29172p = c28879c2.f58722b;
                                    KProperty[] kPropertyArr2 = C32403L.f66041o;
                                    c32403l9.getClass();
                                    arrayListM71114a = C32403L.m71114a(list, abstractC29172p);
                                    c32403l = this.f66028d;
                                    c28879c = this.f66029e;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                                    size = arrayListM71114a.size();
                                    i11 = 0;
                                    while (i11 < size) {
                                        Object obj2 = arrayListM71114a.get(i11);
                                        i11++;
                                        arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj2, ApplicantStatus.Reviewing, (40 & 8) == 0, c28879c));
                                    }
                                    return new C32405N(charSequence7, charSequence9, charSequence10, arrayList, null, false, SNSApplicantStatusAnalyticsState.Pending, null);
                                }
                            }
                        }
                    } else {
                        C32403L c32403l10 = this.f66028d;
                        this.f66027c = 1;
                        obj = c32403l10.getString("sns_status_PENDING_title_noSteps", this);
                        if (obj != coroutine_suspended) {
                            charSequence = (CharSequence) obj;
                            C32403L c32403l11 = this.f66028d;
                            this.f66025a = charSequence;
                            this.f66027c = 2;
                            string = c32403l11.getString("sns_status_PENDING_subtitle_noSteps", this);
                            if (string != coroutine_suspended) {
                                charSequence2 = charSequence;
                                obj = string;
                                charSequence3 = (CharSequence) obj;
                                C32403L c32403l12 = this.f66028d;
                                this.f66025a = charSequence2;
                                this.f66026b = charSequence3;
                                this.f66027c = 3;
                                string2 = c32403l12.getString("sns_status_PENDING_footerHtml_noSteps", this);
                                if (string2 != coroutine_suspended) {
                                    charSequence4 = charSequence2;
                                    charSequence5 = charSequence3;
                                    obj = string2;
                                    return new C32407P(charSequence4, charSequence5, (CharSequence) obj, SNSApplicantStatusAnalyticsState.Pending);
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(obj);
                charSequence = (CharSequence) obj;
                C32403L c32403l13 = this.f66028d;
                this.f66025a = charSequence;
                this.f66027c = 2;
                string = c32403l13.getString("sns_status_PENDING_subtitle_noSteps", this);
                if (string != coroutine_suspended) {
                    charSequence2 = charSequence;
                    obj = string;
                    charSequence3 = (CharSequence) obj;
                    C32403L c32403l14 = this.f66028d;
                    this.f66025a = charSequence2;
                    this.f66026b = charSequence3;
                    this.f66027c = 3;
                    string2 = c32403l14.getString("sns_status_PENDING_footerHtml_noSteps", this);
                    if (string2 != coroutine_suspended) {
                        charSequence4 = charSequence2;
                        charSequence5 = charSequence3;
                        obj = string2;
                        return new C32407P(charSequence4, charSequence5, (CharSequence) obj, SNSApplicantStatusAnalyticsState.Pending);
                    }
                }
                return coroutine_suspended;
            case 2:
                charSequence2 = this.f66025a;
                ResultKt.throwOnFailure(obj);
                charSequence3 = (CharSequence) obj;
                C32403L c32403l15 = this.f66028d;
                this.f66025a = charSequence2;
                this.f66026b = charSequence3;
                this.f66027c = 3;
                string2 = c32403l15.getString("sns_status_PENDING_footerHtml_noSteps", this);
                if (string2 != coroutine_suspended) {
                    charSequence4 = charSequence2;
                    charSequence5 = charSequence3;
                    obj = string2;
                    return new C32407P(charSequence4, charSequence5, (CharSequence) obj, SNSApplicantStatusAnalyticsState.Pending);
                }
                return coroutine_suspended;
            case 3:
                charSequence5 = this.f66026b;
                charSequence4 = this.f66025a;
                ResultKt.throwOnFailure(obj);
                return new C32407P(charSequence4, charSequence5, (CharSequence) obj, SNSApplicantStatusAnalyticsState.Pending);
            case 4:
                ResultKt.throwOnFailure(obj);
                charSequence6 = (CharSequence) obj;
                C32403L c32403l16 = this.f66028d;
                this.f66025a = charSequence6;
                this.f66027c = 5;
                string3 = c32403l16.getString("sns_status_PENDING_subtitle", this);
                if (string3 != coroutine_suspended) {
                    charSequence7 = charSequence6;
                    obj = string3;
                    charSequence8 = (CharSequence) obj;
                    C32403L c32403l17 = this.f66028d;
                    this.f66025a = charSequence7;
                    this.f66026b = charSequence8;
                    this.f66027c = 6;
                    string4 = c32403l17.getString("sns_status_PENDING_footerHtml", this);
                    if (string4 != coroutine_suspended) {
                        charSequence9 = charSequence8;
                        obj = string4;
                        CharSequence charSequence11 = (CharSequence) obj;
                        C32403L c32403l18 = this.f66028d;
                        C28879c c28879c3 = this.f66029e;
                        List list2 = c28879c3.f58723c;
                        AbstractC29172p abstractC29172p2 = c28879c3.f58722b;
                        KProperty[] kPropertyArr3 = C32403L.f66041o;
                        c32403l18.getClass();
                        arrayListM71114a = C32403L.m71114a(list2, abstractC29172p2);
                        c32403l = this.f66028d;
                        c28879c = this.f66029e;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                        size = arrayListM71114a.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj3 = arrayListM71114a.get(i11);
                            i11++;
                            arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj3, ApplicantStatus.Reviewing, (40 & 8) == 0, c28879c));
                        }
                        return new C32405N(charSequence7, charSequence9, charSequence11, arrayList, null, false, SNSApplicantStatusAnalyticsState.Pending, null);
                    }
                }
                return coroutine_suspended;
            case 5:
                charSequence7 = this.f66025a;
                ResultKt.throwOnFailure(obj);
                charSequence8 = (CharSequence) obj;
                C32403L c32403l19 = this.f66028d;
                this.f66025a = charSequence7;
                this.f66026b = charSequence8;
                this.f66027c = 6;
                string4 = c32403l19.getString("sns_status_PENDING_footerHtml", this);
                if (string4 != coroutine_suspended) {
                    charSequence9 = charSequence8;
                    obj = string4;
                    CharSequence charSequence12 = (CharSequence) obj;
                    C32403L c32403l110 = this.f66028d;
                    C28879c c28879c4 = this.f66029e;
                    List list3 = c28879c4.f58723c;
                    AbstractC29172p abstractC29172p3 = c28879c4.f58722b;
                    KProperty[] kPropertyArr4 = C32403L.f66041o;
                    c32403l110.getClass();
                    arrayListM71114a = C32403L.m71114a(list3, abstractC29172p3);
                    c32403l = this.f66028d;
                    c28879c = this.f66029e;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                    size = arrayListM71114a.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj4 = arrayListM71114a.get(i11);
                        i11++;
                        arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj4, ApplicantStatus.Reviewing, (40 & 8) == 0, c28879c));
                    }
                    return new C32405N(charSequence7, charSequence9, charSequence12, arrayList, null, false, SNSApplicantStatusAnalyticsState.Pending, null);
                }
                return coroutine_suspended;
            case 6:
                CharSequence charSequence13 = this.f66026b;
                charSequence7 = this.f66025a;
                ResultKt.throwOnFailure(obj);
                charSequence9 = charSequence13;
                CharSequence charSequence14 = (CharSequence) obj;
                C32403L c32403l111 = this.f66028d;
                C28879c c28879c5 = this.f66029e;
                List list4 = c28879c5.f58723c;
                AbstractC29172p abstractC29172p4 = c28879c5.f58722b;
                KProperty[] kPropertyArr5 = C32403L.f66041o;
                c32403l111.getClass();
                arrayListM71114a = C32403L.m71114a(list4, abstractC29172p4);
                c32403l = this.f66028d;
                c28879c = this.f66029e;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                size = arrayListM71114a.size();
                i11 = 0;
                while (i11 < size) {
                    Object obj5 = arrayListM71114a.get(i11);
                    i11++;
                    arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj5, ApplicantStatus.Reviewing, (40 & 8) == 0, c28879c));
                }
                return new C32405N(charSequence7, charSequence9, charSequence14, arrayList, null, false, SNSApplicantStatusAnalyticsState.Pending, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32400I(C28879c c28879c, C32403L c32403l, Continuation continuation) {
        super(2, continuation);
        this.f66028d = c32403l;
        this.f66029e = c28879c;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32400I(this.f66029e, this.f66028d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32403L c32403l = this.f66028d;
        return new C32400I(this.f66029e, c32403l, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }
}
