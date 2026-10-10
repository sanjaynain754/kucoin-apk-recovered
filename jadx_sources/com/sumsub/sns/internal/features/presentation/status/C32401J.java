package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.core.presentation.helper.AbstractC28878b;
import com.sumsub.sns.internal.core.presentation.helper.C28879c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ApplicantStatus;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.domain.C30336z;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32401J extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public boolean f66030a;

    /* JADX INFO: renamed from: b */
    public CharSequence f66031b;

    /* JADX INFO: renamed from: c */
    public CharSequence f66032c;

    /* JADX INFO: renamed from: d */
    public CharSequence f66033d;

    /* JADX INFO: renamed from: e */
    public List f66034e;

    /* JADX INFO: renamed from: f */
    public CharSequence f66035f;

    /* JADX INFO: renamed from: g */
    public int f66036g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C28879c f66037h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C32403L f66038i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32401J(C28879c c28879c, C32403L c32403l, Continuation continuation) {
        super(2, continuation);
        this.f66037h = c28879c;
        this.f66038i = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32401J(this.f66037h, this.f66038i, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32401J(this.f66037h, this.f66038i, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fc A[PHI: r3 r5
      0x00fc: PHI (r3v19 boolean) = (r3v17 boolean), (r3v20 boolean) binds: [B:36:0x00f8, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r5v7 java.lang.Object) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:36:0x00f8, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0112 A[PHI: r3 r5 r6
      0x0112: PHI (r3v21 boolean) = (r3v19 boolean), (r3v25 boolean) binds: [B:39:0x010e, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r5v10 java.lang.CharSequence) = (r5v8 java.lang.CharSequence), (r5v11 java.lang.CharSequence) binds: [B:39:0x010e, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v8 java.lang.Object) binds: [B:39:0x010e, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0154 A[LOOP:0: B:49:0x0152->B:50:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x019d  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        if (r3 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01be, code lost:
    
        if (r1 == r2) goto L63;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM71113a;
        Object objM71121b;
        boolean zBooleanValue;
        Object string;
        CharSequence charSequence;
        Object string2;
        CharSequence charSequence2;
        Object string3;
        CharSequence charSequence3;
        ArrayList arrayListM71114a;
        C32403L c32403l;
        C28879c c28879c;
        ArrayList arrayList;
        int size;
        Object string4;
        CharSequence charSequence4;
        List list;
        CharSequence charSequence5;
        Object objM70193a;
        List list2;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = 0;
        switch (this.f66036g) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (!this.f66037h.f58722b.m69797d()) {
                    C32403L c32403l2 = this.f66038i;
                    C28879c c28879c2 = this.f66037h;
                    KProperty[] kPropertyArr = C32403L.f66041o;
                    c32403l2.getClass();
                    if (c28879c2.f58722b.mo69760k().f59152b) {
                        List list3 = c28879c2.f58723c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list3) {
                            Document document = (Document) obj2;
                            List list4 = c28879c2.f58722b.mo69760k().f59154d;
                            if (list4 != null && list4.contains(document.getType().f59014a)) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            int size2 = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size2) {
                                    Object obj3 = arrayList2.get(i12);
                                    i12++;
                                    if (!((Document) obj3).isSubmitted()) {
                                    }
                                }
                            }
                        }
                        C32403L c32403l3 = this.f66038i;
                        this.f66036g = 1;
                        objM71113a = C32403L.m71113a(c32403l3, this);
                    }
                    C32403L c32403l4 = this.f66038i;
                    this.f66036g = 2;
                    objM71121b = c32403l4.m71121b(this);
                    if (objM71121b != coroutine_suspended) {
                        zBooleanValue = ((Boolean) objM71121b).booleanValue();
                        C32403L c32403l5 = this.f66038i;
                        this.f66030a = zBooleanValue;
                        this.f66036g = 3;
                        string = c32403l5.getString("sns_status_INCOMPLETE_title", this);
                        if (string != coroutine_suspended) {
                            charSequence = (CharSequence) string;
                            C32403L c32403l6 = this.f66038i;
                            this.f66031b = charSequence;
                            this.f66030a = zBooleanValue;
                            this.f66036g = 4;
                            string2 = c32403l6.getString("sns_status_INCOMPLETE_subtitle", this);
                            if (string2 != coroutine_suspended) {
                                charSequence2 = (CharSequence) string2;
                                if (zBooleanValue) {
                                    C32403L c32403l7 = this.f66038i;
                                    this.f66031b = charSequence;
                                    this.f66032c = charSequence2;
                                    this.f66036g = 5;
                                    string3 = c32403l7.getString("sns_status_INCOMPLETE_footerHtml", this);
                                } else {
                                    charSequence3 = null;
                                    C32403L c32403l8 = this.f66038i;
                                    C28879c c28879c3 = this.f66037h;
                                    List list5 = c28879c3.f58723c;
                                    AbstractC29172p abstractC29172p = c28879c3.f58722b;
                                    KProperty[] kPropertyArr2 = C32403L.f66041o;
                                    c32403l8.getClass();
                                    arrayListM71114a = C32403L.m71114a(list5, abstractC29172p);
                                    c32403l = this.f66038i;
                                    c28879c = this.f66037h;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                                    size = arrayListM71114a.size();
                                    while (i11 < size) {
                                        Object obj4 = arrayListM71114a.get(i11);
                                        i11++;
                                        arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj4, ApplicantStatus.Submitting, (40 & 8) == 0, c28879c));
                                    }
                                    C32403L c32403l9 = this.f66038i;
                                    this.f66031b = charSequence;
                                    this.f66032c = charSequence2;
                                    this.f66033d = charSequence3;
                                    this.f66034e = arrayList;
                                    this.f66036g = 6;
                                    string4 = c32403l9.getString("sns_status_INITIAL_action_continue", this);
                                    if (string4 != coroutine_suspended) {
                                        charSequence4 = charSequence2;
                                        list = arrayList;
                                        charSequence5 = (CharSequence) string4;
                                        C30336z c30336z = this.f66038i.f66044c;
                                        this.f66031b = charSequence;
                                        this.f66032c = charSequence4;
                                        this.f66033d = charSequence3;
                                        this.f66034e = list;
                                        this.f66035f = charSequence5;
                                        this.f66036g = 7;
                                        objM70193a = c30336z.m70193a(this);
                                        if (objM70193a != coroutine_suspended) {
                                            list2 = list;
                                            charSequence6 = charSequence5;
                                            charSequence7 = charSequence4;
                                            charSequence8 = charSequence;
                                            charSequence9 = charSequence3;
                                            return new C32405N(charSequence8, charSequence7, charSequence9, list2, charSequence6, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Incomplete, C32403L.m71111a(this.f66038i));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    C32403L c32403l10 = this.f66038i;
                    this.f66036g = 1;
                    objM71113a = C32403L.m71113a(c32403l10, this);
                    break;
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(obj);
                objM71113a = obj;
                return (AbstractC32410T) objM71113a;
            case 2:
                ResultKt.throwOnFailure(obj);
                objM71121b = obj;
                zBooleanValue = ((Boolean) objM71121b).booleanValue();
                C32403L c32403l11 = this.f66038i;
                this.f66030a = zBooleanValue;
                this.f66036g = 3;
                string = c32403l11.getString("sns_status_INCOMPLETE_title", this);
                if (string != coroutine_suspended) {
                    charSequence = (CharSequence) string;
                    C32403L c32403l12 = this.f66038i;
                    this.f66031b = charSequence;
                    this.f66030a = zBooleanValue;
                    this.f66036g = 4;
                    string2 = c32403l12.getString("sns_status_INCOMPLETE_subtitle", this);
                    if (string2 != coroutine_suspended) {
                        charSequence2 = (CharSequence) string2;
                        if (zBooleanValue) {
                            C32403L c32403l13 = this.f66038i;
                            this.f66031b = charSequence;
                            this.f66032c = charSequence2;
                            this.f66036g = 5;
                            string3 = c32403l13.getString("sns_status_INCOMPLETE_footerHtml", this);
                        } else {
                            charSequence3 = null;
                            C32403L c32403l14 = this.f66038i;
                            C28879c c28879c4 = this.f66037h;
                            List list6 = c28879c4.f58723c;
                            AbstractC29172p abstractC29172p2 = c28879c4.f58722b;
                            KProperty[] kPropertyArr3 = C32403L.f66041o;
                            c32403l14.getClass();
                            arrayListM71114a = C32403L.m71114a(list6, abstractC29172p2);
                            c32403l = this.f66038i;
                            c28879c = this.f66037h;
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                            size = arrayListM71114a.size();
                            while (i11 < size) {
                                Object obj5 = arrayListM71114a.get(i11);
                                i11++;
                                arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj5, ApplicantStatus.Submitting, (40 & 8) == 0, c28879c));
                            }
                            C32403L c32403l15 = this.f66038i;
                            this.f66031b = charSequence;
                            this.f66032c = charSequence2;
                            this.f66033d = charSequence3;
                            this.f66034e = arrayList;
                            this.f66036g = 6;
                            string4 = c32403l15.getString("sns_status_INITIAL_action_continue", this);
                            if (string4 != coroutine_suspended) {
                                charSequence4 = charSequence2;
                                list = arrayList;
                                charSequence5 = (CharSequence) string4;
                                C30336z c30336z2 = this.f66038i.f66044c;
                                this.f66031b = charSequence;
                                this.f66032c = charSequence4;
                                this.f66033d = charSequence3;
                                this.f66034e = list;
                                this.f66035f = charSequence5;
                                this.f66036g = 7;
                                objM70193a = c30336z2.m70193a(this);
                                if (objM70193a != coroutine_suspended) {
                                    list2 = list;
                                    charSequence6 = charSequence5;
                                    charSequence7 = charSequence4;
                                    charSequence8 = charSequence;
                                    charSequence9 = charSequence3;
                                    return new C32405N(charSequence8, charSequence7, charSequence9, list2, charSequence6, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Incomplete, C32403L.m71111a(this.f66038i));
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 3:
                zBooleanValue = this.f66030a;
                ResultKt.throwOnFailure(obj);
                string = obj;
                charSequence = (CharSequence) string;
                C32403L c32403l16 = this.f66038i;
                this.f66031b = charSequence;
                this.f66030a = zBooleanValue;
                this.f66036g = 4;
                string2 = c32403l16.getString("sns_status_INCOMPLETE_subtitle", this);
                if (string2 != coroutine_suspended) {
                    charSequence2 = (CharSequence) string2;
                    if (zBooleanValue) {
                        C32403L c32403l17 = this.f66038i;
                        this.f66031b = charSequence;
                        this.f66032c = charSequence2;
                        this.f66036g = 5;
                        string3 = c32403l17.getString("sns_status_INCOMPLETE_footerHtml", this);
                    } else {
                        charSequence3 = null;
                        C32403L c32403l18 = this.f66038i;
                        C28879c c28879c5 = this.f66037h;
                        List list7 = c28879c5.f58723c;
                        AbstractC29172p abstractC29172p3 = c28879c5.f58722b;
                        KProperty[] kPropertyArr4 = C32403L.f66041o;
                        c32403l18.getClass();
                        arrayListM71114a = C32403L.m71114a(list7, abstractC29172p3);
                        c32403l = this.f66038i;
                        c28879c = this.f66037h;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                        size = arrayListM71114a.size();
                        while (i11 < size) {
                            Object obj6 = arrayListM71114a.get(i11);
                            i11++;
                            arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj6, ApplicantStatus.Submitting, (40 & 8) == 0, c28879c));
                        }
                        C32403L c32403l19 = this.f66038i;
                        this.f66031b = charSequence;
                        this.f66032c = charSequence2;
                        this.f66033d = charSequence3;
                        this.f66034e = arrayList;
                        this.f66036g = 6;
                        string4 = c32403l19.getString("sns_status_INITIAL_action_continue", this);
                        if (string4 != coroutine_suspended) {
                            charSequence4 = charSequence2;
                            list = arrayList;
                            charSequence5 = (CharSequence) string4;
                            C30336z c30336z3 = this.f66038i.f66044c;
                            this.f66031b = charSequence;
                            this.f66032c = charSequence4;
                            this.f66033d = charSequence3;
                            this.f66034e = list;
                            this.f66035f = charSequence5;
                            this.f66036g = 7;
                            objM70193a = c30336z3.m70193a(this);
                            if (objM70193a != coroutine_suspended) {
                                list2 = list;
                                charSequence6 = charSequence5;
                                charSequence7 = charSequence4;
                                charSequence8 = charSequence;
                                charSequence9 = charSequence3;
                                return new C32405N(charSequence8, charSequence7, charSequence9, list2, charSequence6, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Incomplete, C32403L.m71111a(this.f66038i));
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 4:
                zBooleanValue = this.f66030a;
                charSequence = this.f66031b;
                ResultKt.throwOnFailure(obj);
                string2 = obj;
                charSequence2 = (CharSequence) string2;
                if (zBooleanValue) {
                    C32403L c32403l110 = this.f66038i;
                    this.f66031b = charSequence;
                    this.f66032c = charSequence2;
                    this.f66036g = 5;
                    string3 = c32403l110.getString("sns_status_INCOMPLETE_footerHtml", this);
                    break;
                } else {
                    charSequence3 = null;
                    C32403L c32403l111 = this.f66038i;
                    C28879c c28879c6 = this.f66037h;
                    List list8 = c28879c6.f58723c;
                    AbstractC29172p abstractC29172p4 = c28879c6.f58722b;
                    KProperty[] kPropertyArr5 = C32403L.f66041o;
                    c32403l111.getClass();
                    arrayListM71114a = C32403L.m71114a(list8, abstractC29172p4);
                    c32403l = this.f66038i;
                    c28879c = this.f66037h;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                    size = arrayListM71114a.size();
                    while (i11 < size) {
                        Object obj7 = arrayListM71114a.get(i11);
                        i11++;
                        arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj7, ApplicantStatus.Submitting, (40 & 8) == 0, c28879c));
                    }
                    C32403L c32403l112 = this.f66038i;
                    this.f66031b = charSequence;
                    this.f66032c = charSequence2;
                    this.f66033d = charSequence3;
                    this.f66034e = arrayList;
                    this.f66036g = 6;
                    string4 = c32403l112.getString("sns_status_INITIAL_action_continue", this);
                    if (string4 != coroutine_suspended) {
                        charSequence4 = charSequence2;
                        list = arrayList;
                        charSequence5 = (CharSequence) string4;
                        C30336z c30336z4 = this.f66038i.f66044c;
                        this.f66031b = charSequence;
                        this.f66032c = charSequence4;
                        this.f66033d = charSequence3;
                        this.f66034e = list;
                        this.f66035f = charSequence5;
                        this.f66036g = 7;
                        objM70193a = c30336z4.m70193a(this);
                        if (objM70193a != coroutine_suspended) {
                            list2 = list;
                            charSequence6 = charSequence5;
                            charSequence7 = charSequence4;
                            charSequence8 = charSequence;
                            charSequence9 = charSequence3;
                            return new C32405N(charSequence8, charSequence7, charSequence9, list2, charSequence6, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Incomplete, C32403L.m71111a(this.f66038i));
                        }
                    }
                }
                return coroutine_suspended;
            case 5:
                CharSequence charSequence10 = this.f66032c;
                charSequence = this.f66031b;
                ResultKt.throwOnFailure(obj);
                charSequence2 = charSequence10;
                string3 = obj;
                charSequence3 = (String) string3;
                C32403L c32403l113 = this.f66038i;
                C28879c c28879c7 = this.f66037h;
                List list9 = c28879c7.f58723c;
                AbstractC29172p abstractC29172p5 = c28879c7.f58722b;
                KProperty[] kPropertyArr6 = C32403L.f66041o;
                c32403l113.getClass();
                arrayListM71114a = C32403L.m71114a(list9, abstractC29172p5);
                c32403l = this.f66038i;
                c28879c = this.f66037h;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                size = arrayListM71114a.size();
                while (i11 < size) {
                    Object obj8 = arrayListM71114a.get(i11);
                    i11++;
                    arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj8, ApplicantStatus.Submitting, (40 & 8) == 0, c28879c));
                }
                C32403L c32403l114 = this.f66038i;
                this.f66031b = charSequence;
                this.f66032c = charSequence2;
                this.f66033d = charSequence3;
                this.f66034e = arrayList;
                this.f66036g = 6;
                string4 = c32403l114.getString("sns_status_INITIAL_action_continue", this);
                if (string4 != coroutine_suspended) {
                    charSequence4 = charSequence2;
                    list = arrayList;
                    charSequence5 = (CharSequence) string4;
                    C30336z c30336z5 = this.f66038i.f66044c;
                    this.f66031b = charSequence;
                    this.f66032c = charSequence4;
                    this.f66033d = charSequence3;
                    this.f66034e = list;
                    this.f66035f = charSequence5;
                    this.f66036g = 7;
                    objM70193a = c30336z5.m70193a(this);
                    if (objM70193a != coroutine_suspended) {
                        list2 = list;
                        charSequence6 = charSequence5;
                        charSequence7 = charSequence4;
                        charSequence8 = charSequence;
                        charSequence9 = charSequence3;
                        return new C32405N(charSequence8, charSequence7, charSequence9, list2, charSequence6, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Incomplete, C32403L.m71111a(this.f66038i));
                    }
                }
                return coroutine_suspended;
            case 6:
                List list10 = this.f66034e;
                charSequence3 = this.f66033d;
                charSequence4 = this.f66032c;
                charSequence = this.f66031b;
                ResultKt.throwOnFailure(obj);
                list = list10;
                string4 = obj;
                charSequence5 = (CharSequence) string4;
                C30336z c30336z6 = this.f66038i.f66044c;
                this.f66031b = charSequence;
                this.f66032c = charSequence4;
                this.f66033d = charSequence3;
                this.f66034e = list;
                this.f66035f = charSequence5;
                this.f66036g = 7;
                objM70193a = c30336z6.m70193a(this);
                if (objM70193a != coroutine_suspended) {
                    list2 = list;
                    charSequence6 = charSequence5;
                    charSequence7 = charSequence4;
                    charSequence8 = charSequence;
                    charSequence9 = charSequence3;
                    return new C32405N(charSequence8, charSequence7, charSequence9, list2, charSequence6, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Incomplete, C32403L.m71111a(this.f66038i));
                }
                return coroutine_suspended;
            case 7:
                CharSequence charSequence11 = this.f66035f;
                List list11 = this.f66034e;
                CharSequence charSequence12 = this.f66033d;
                CharSequence charSequence13 = this.f66032c;
                CharSequence charSequence14 = this.f66031b;
                ResultKt.throwOnFailure(obj);
                objM70193a = obj;
                list2 = list11;
                charSequence6 = charSequence11;
                charSequence9 = charSequence12;
                charSequence7 = charSequence13;
                charSequence8 = charSequence14;
                return new C32405N(charSequence8, charSequence7, charSequence9, list2, charSequence6, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Incomplete, C32403L.m71111a(this.f66038i));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
