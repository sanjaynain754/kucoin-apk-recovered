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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32397F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public boolean f66005a;

    /* JADX INFO: renamed from: b */
    public CharSequence f66006b;

    /* JADX INFO: renamed from: c */
    public CharSequence f66007c;

    /* JADX INFO: renamed from: d */
    public CharSequence f66008d;

    /* JADX INFO: renamed from: e */
    public List f66009e;

    /* JADX INFO: renamed from: f */
    public CharSequence f66010f;

    /* JADX INFO: renamed from: g */
    public int f66011g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C28879c f66012h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C32403L f66013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32397F(C28879c c28879c, C32403L c32403l, Continuation continuation) {
        super(2, continuation);
        this.f66012h = c28879c;
        this.f66013i = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32397F(this.f66012h, this.f66013i, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32397F(this.f66012h, this.f66013i, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8 A[PHI: r3 r4
      0x00a8: PHI (r3v11 boolean) = (r3v9 boolean), (r3v12 boolean) binds: [B:24:0x00a4, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r4v4 java.lang.Object) = (r4v3 java.lang.Object), (r4v6 java.lang.Object) binds: [B:24:0x00a4, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00be A[PHI: r3 r4 r5
      0x00be: PHI (r3v13 boolean) = (r3v11 boolean), (r3v17 boolean) binds: [B:27:0x00ba, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r4v7 java.lang.CharSequence) = (r4v5 java.lang.CharSequence), (r4v8 java.lang.CharSequence) binds: [B:27:0x00ba, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r5v4 java.lang.Object) = (r5v3 java.lang.Object), (r5v6 java.lang.Object) binds: [B:27:0x00ba, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101 A[LOOP:0: B:37:0x00ff->B:38:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x014e  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r1 == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        if (r3 == r2) goto L45;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM71121b;
        Object objM71113a;
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
        int i11;
        Object string4;
        CharSequence charSequence4;
        CharSequence charSequence5;
        List list;
        CharSequence charSequence6;
        Object objM70193a;
        List list2;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f66011g) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (this.f66012h.f58722b.m69797d()) {
                    C32403L c32403l2 = this.f66013i;
                    this.f66011g = 1;
                    objM71113a = C32403L.m71113a(c32403l2, this);
                    break;
                } else {
                    C32403L c32403l3 = this.f66013i;
                    this.f66011g = 2;
                    KProperty[] kPropertyArr = C32403L.f66041o;
                    objM71121b = c32403l3.m71121b(this);
                    if (objM71121b != coroutine_suspended) {
                        zBooleanValue = ((Boolean) objM71121b).booleanValue();
                        C32403L c32403l4 = this.f66013i;
                        this.f66005a = zBooleanValue;
                        this.f66011g = 3;
                        string = c32403l4.getString("sns_status_INITIAL_title", this);
                        if (string != coroutine_suspended) {
                            charSequence = (CharSequence) string;
                            C32403L c32403l5 = this.f66013i;
                            this.f66006b = charSequence;
                            this.f66005a = zBooleanValue;
                            this.f66011g = 4;
                            string2 = c32403l5.getString("sns_status_INITIAL_subtitle", this);
                            if (string2 != coroutine_suspended) {
                                charSequence2 = (CharSequence) string2;
                                if (zBooleanValue) {
                                    C32403L c32403l6 = this.f66013i;
                                    this.f66006b = charSequence;
                                    this.f66007c = charSequence2;
                                    this.f66011g = 5;
                                    string3 = c32403l6.getString("sns_status_INITIAL_footerHtml_noAgreement", this);
                                } else {
                                    charSequence3 = null;
                                    C32403L c32403l7 = this.f66013i;
                                    C28879c c28879c2 = this.f66012h;
                                    List list3 = c28879c2.f58723c;
                                    AbstractC29172p abstractC29172p = c28879c2.f58722b;
                                    KProperty[] kPropertyArr2 = C32403L.f66041o;
                                    c32403l7.getClass();
                                    arrayListM71114a = C32403L.m71114a(list3, abstractC29172p);
                                    c32403l = this.f66013i;
                                    c28879c = this.f66012h;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                                    size = arrayListM71114a.size();
                                    i11 = 0;
                                    while (i11 < size) {
                                        Object obj2 = arrayListM71114a.get(i11);
                                        i11++;
                                        arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj2, ApplicantStatus.None, (40 & 8) == 0, c28879c));
                                    }
                                    C32403L c32403l8 = this.f66013i;
                                    this.f66006b = charSequence;
                                    this.f66007c = charSequence2;
                                    this.f66008d = charSequence3;
                                    this.f66009e = arrayList;
                                    this.f66011g = 6;
                                    string4 = c32403l8.getString("sns_status_INITIAL_action_continue", this);
                                    if (string4 != coroutine_suspended) {
                                        CharSequence charSequence11 = charSequence2;
                                        charSequence4 = charSequence;
                                        charSequence5 = charSequence11;
                                        list = arrayList;
                                        charSequence6 = (CharSequence) string4;
                                        C30336z c30336z = this.f66013i.f66044c;
                                        this.f66006b = charSequence4;
                                        this.f66007c = charSequence5;
                                        this.f66008d = charSequence3;
                                        this.f66009e = list;
                                        this.f66010f = charSequence6;
                                        this.f66011g = 7;
                                        objM70193a = c30336z.m70193a(this);
                                        if (objM70193a != coroutine_suspended) {
                                            list2 = list;
                                            charSequence7 = charSequence6;
                                            charSequence8 = charSequence3;
                                            charSequence9 = charSequence4;
                                            charSequence10 = charSequence5;
                                            return new C32405N(charSequence9, charSequence10, charSequence8, list2, charSequence7, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Initial, C32403L.m71111a(this.f66013i));
                                        }
                                    }
                                }
                            }
                        }
                    }
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
                C32403L c32403l9 = this.f66013i;
                this.f66005a = zBooleanValue;
                this.f66011g = 3;
                string = c32403l9.getString("sns_status_INITIAL_title", this);
                if (string != coroutine_suspended) {
                    charSequence = (CharSequence) string;
                    C32403L c32403l10 = this.f66013i;
                    this.f66006b = charSequence;
                    this.f66005a = zBooleanValue;
                    this.f66011g = 4;
                    string2 = c32403l10.getString("sns_status_INITIAL_subtitle", this);
                    if (string2 != coroutine_suspended) {
                        charSequence2 = (CharSequence) string2;
                        if (zBooleanValue) {
                            C32403L c32403l11 = this.f66013i;
                            this.f66006b = charSequence;
                            this.f66007c = charSequence2;
                            this.f66011g = 5;
                            string3 = c32403l11.getString("sns_status_INITIAL_footerHtml_noAgreement", this);
                        } else {
                            charSequence3 = null;
                            C32403L c32403l12 = this.f66013i;
                            C28879c c28879c3 = this.f66012h;
                            List list4 = c28879c3.f58723c;
                            AbstractC29172p abstractC29172p2 = c28879c3.f58722b;
                            KProperty[] kPropertyArr3 = C32403L.f66041o;
                            c32403l12.getClass();
                            arrayListM71114a = C32403L.m71114a(list4, abstractC29172p2);
                            c32403l = this.f66013i;
                            c28879c = this.f66012h;
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                            size = arrayListM71114a.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj3 = arrayListM71114a.get(i11);
                                i11++;
                                arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj3, ApplicantStatus.None, (40 & 8) == 0, c28879c));
                            }
                            C32403L c32403l13 = this.f66013i;
                            this.f66006b = charSequence;
                            this.f66007c = charSequence2;
                            this.f66008d = charSequence3;
                            this.f66009e = arrayList;
                            this.f66011g = 6;
                            string4 = c32403l13.getString("sns_status_INITIAL_action_continue", this);
                            if (string4 != coroutine_suspended) {
                                CharSequence charSequence12 = charSequence2;
                                charSequence4 = charSequence;
                                charSequence5 = charSequence12;
                                list = arrayList;
                                charSequence6 = (CharSequence) string4;
                                C30336z c30336z2 = this.f66013i.f66044c;
                                this.f66006b = charSequence4;
                                this.f66007c = charSequence5;
                                this.f66008d = charSequence3;
                                this.f66009e = list;
                                this.f66010f = charSequence6;
                                this.f66011g = 7;
                                objM70193a = c30336z2.m70193a(this);
                                if (objM70193a != coroutine_suspended) {
                                    list2 = list;
                                    charSequence7 = charSequence6;
                                    charSequence8 = charSequence3;
                                    charSequence9 = charSequence4;
                                    charSequence10 = charSequence5;
                                    return new C32405N(charSequence9, charSequence10, charSequence8, list2, charSequence7, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Initial, C32403L.m71111a(this.f66013i));
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 3:
                zBooleanValue = this.f66005a;
                ResultKt.throwOnFailure(obj);
                string = obj;
                charSequence = (CharSequence) string;
                C32403L c32403l14 = this.f66013i;
                this.f66006b = charSequence;
                this.f66005a = zBooleanValue;
                this.f66011g = 4;
                string2 = c32403l14.getString("sns_status_INITIAL_subtitle", this);
                if (string2 != coroutine_suspended) {
                    charSequence2 = (CharSequence) string2;
                    if (zBooleanValue) {
                        C32403L c32403l15 = this.f66013i;
                        this.f66006b = charSequence;
                        this.f66007c = charSequence2;
                        this.f66011g = 5;
                        string3 = c32403l15.getString("sns_status_INITIAL_footerHtml_noAgreement", this);
                    } else {
                        charSequence3 = null;
                        C32403L c32403l16 = this.f66013i;
                        C28879c c28879c4 = this.f66012h;
                        List list5 = c28879c4.f58723c;
                        AbstractC29172p abstractC29172p3 = c28879c4.f58722b;
                        KProperty[] kPropertyArr4 = C32403L.f66041o;
                        c32403l16.getClass();
                        arrayListM71114a = C32403L.m71114a(list5, abstractC29172p3);
                        c32403l = this.f66013i;
                        c28879c = this.f66012h;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                        size = arrayListM71114a.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj4 = arrayListM71114a.get(i11);
                            i11++;
                            arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj4, ApplicantStatus.None, (40 & 8) == 0, c28879c));
                        }
                        C32403L c32403l17 = this.f66013i;
                        this.f66006b = charSequence;
                        this.f66007c = charSequence2;
                        this.f66008d = charSequence3;
                        this.f66009e = arrayList;
                        this.f66011g = 6;
                        string4 = c32403l17.getString("sns_status_INITIAL_action_continue", this);
                        if (string4 != coroutine_suspended) {
                            CharSequence charSequence13 = charSequence2;
                            charSequence4 = charSequence;
                            charSequence5 = charSequence13;
                            list = arrayList;
                            charSequence6 = (CharSequence) string4;
                            C30336z c30336z3 = this.f66013i.f66044c;
                            this.f66006b = charSequence4;
                            this.f66007c = charSequence5;
                            this.f66008d = charSequence3;
                            this.f66009e = list;
                            this.f66010f = charSequence6;
                            this.f66011g = 7;
                            objM70193a = c30336z3.m70193a(this);
                            if (objM70193a != coroutine_suspended) {
                                list2 = list;
                                charSequence7 = charSequence6;
                                charSequence8 = charSequence3;
                                charSequence9 = charSequence4;
                                charSequence10 = charSequence5;
                                return new C32405N(charSequence9, charSequence10, charSequence8, list2, charSequence7, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Initial, C32403L.m71111a(this.f66013i));
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 4:
                zBooleanValue = this.f66005a;
                charSequence = this.f66006b;
                ResultKt.throwOnFailure(obj);
                string2 = obj;
                charSequence2 = (CharSequence) string2;
                if (zBooleanValue) {
                    C32403L c32403l18 = this.f66013i;
                    this.f66006b = charSequence;
                    this.f66007c = charSequence2;
                    this.f66011g = 5;
                    string3 = c32403l18.getString("sns_status_INITIAL_footerHtml_noAgreement", this);
                    break;
                } else {
                    charSequence3 = null;
                    C32403L c32403l19 = this.f66013i;
                    C28879c c28879c5 = this.f66012h;
                    List list6 = c28879c5.f58723c;
                    AbstractC29172p abstractC29172p4 = c28879c5.f58722b;
                    KProperty[] kPropertyArr5 = C32403L.f66041o;
                    c32403l19.getClass();
                    arrayListM71114a = C32403L.m71114a(list6, abstractC29172p4);
                    c32403l = this.f66013i;
                    c28879c = this.f66012h;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                    size = arrayListM71114a.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj5 = arrayListM71114a.get(i11);
                        i11++;
                        arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj5, ApplicantStatus.None, (40 & 8) == 0, c28879c));
                    }
                    C32403L c32403l110 = this.f66013i;
                    this.f66006b = charSequence;
                    this.f66007c = charSequence2;
                    this.f66008d = charSequence3;
                    this.f66009e = arrayList;
                    this.f66011g = 6;
                    string4 = c32403l110.getString("sns_status_INITIAL_action_continue", this);
                    if (string4 != coroutine_suspended) {
                        CharSequence charSequence14 = charSequence2;
                        charSequence4 = charSequence;
                        charSequence5 = charSequence14;
                        list = arrayList;
                        charSequence6 = (CharSequence) string4;
                        C30336z c30336z4 = this.f66013i.f66044c;
                        this.f66006b = charSequence4;
                        this.f66007c = charSequence5;
                        this.f66008d = charSequence3;
                        this.f66009e = list;
                        this.f66010f = charSequence6;
                        this.f66011g = 7;
                        objM70193a = c30336z4.m70193a(this);
                        if (objM70193a != coroutine_suspended) {
                            list2 = list;
                            charSequence7 = charSequence6;
                            charSequence8 = charSequence3;
                            charSequence9 = charSequence4;
                            charSequence10 = charSequence5;
                            return new C32405N(charSequence9, charSequence10, charSequence8, list2, charSequence7, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Initial, C32403L.m71111a(this.f66013i));
                        }
                    }
                }
                return coroutine_suspended;
            case 5:
                CharSequence charSequence15 = this.f66007c;
                charSequence = this.f66006b;
                ResultKt.throwOnFailure(obj);
                charSequence2 = charSequence15;
                string3 = obj;
                charSequence3 = (String) string3;
                C32403L c32403l111 = this.f66013i;
                C28879c c28879c6 = this.f66012h;
                List list7 = c28879c6.f58723c;
                AbstractC29172p abstractC29172p5 = c28879c6.f58722b;
                KProperty[] kPropertyArr6 = C32403L.f66041o;
                c32403l111.getClass();
                arrayListM71114a = C32403L.m71114a(list7, abstractC29172p5);
                c32403l = this.f66013i;
                c28879c = this.f66012h;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                size = arrayListM71114a.size();
                i11 = 0;
                while (i11 < size) {
                    Object obj6 = arrayListM71114a.get(i11);
                    i11++;
                    arrayList.add(AbstractC28878b.m69662a(c32403l.getStrings(), (Document) obj6, ApplicantStatus.None, (40 & 8) == 0, c28879c));
                }
                C32403L c32403l112 = this.f66013i;
                this.f66006b = charSequence;
                this.f66007c = charSequence2;
                this.f66008d = charSequence3;
                this.f66009e = arrayList;
                this.f66011g = 6;
                string4 = c32403l112.getString("sns_status_INITIAL_action_continue", this);
                if (string4 != coroutine_suspended) {
                    CharSequence charSequence16 = charSequence2;
                    charSequence4 = charSequence;
                    charSequence5 = charSequence16;
                    list = arrayList;
                    charSequence6 = (CharSequence) string4;
                    C30336z c30336z5 = this.f66013i.f66044c;
                    this.f66006b = charSequence4;
                    this.f66007c = charSequence5;
                    this.f66008d = charSequence3;
                    this.f66009e = list;
                    this.f66010f = charSequence6;
                    this.f66011g = 7;
                    objM70193a = c30336z5.m70193a(this);
                    if (objM70193a != coroutine_suspended) {
                        list2 = list;
                        charSequence7 = charSequence6;
                        charSequence8 = charSequence3;
                        charSequence9 = charSequence4;
                        charSequence10 = charSequence5;
                        return new C32405N(charSequence9, charSequence10, charSequence8, list2, charSequence7, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Initial, C32403L.m71111a(this.f66013i));
                    }
                }
                return coroutine_suspended;
            case 6:
                List list8 = this.f66009e;
                charSequence3 = this.f66008d;
                charSequence5 = this.f66007c;
                charSequence4 = this.f66006b;
                ResultKt.throwOnFailure(obj);
                list = list8;
                string4 = obj;
                charSequence6 = (CharSequence) string4;
                C30336z c30336z6 = this.f66013i.f66044c;
                this.f66006b = charSequence4;
                this.f66007c = charSequence5;
                this.f66008d = charSequence3;
                this.f66009e = list;
                this.f66010f = charSequence6;
                this.f66011g = 7;
                objM70193a = c30336z6.m70193a(this);
                if (objM70193a != coroutine_suspended) {
                    list2 = list;
                    charSequence7 = charSequence6;
                    charSequence8 = charSequence3;
                    charSequence9 = charSequence4;
                    charSequence10 = charSequence5;
                    return new C32405N(charSequence9, charSequence10, charSequence8, list2, charSequence7, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Initial, C32403L.m71111a(this.f66013i));
                }
                return coroutine_suspended;
            case 7:
                CharSequence charSequence17 = this.f66010f;
                List list9 = this.f66009e;
                CharSequence charSequence18 = this.f66008d;
                CharSequence charSequence19 = this.f66007c;
                CharSequence charSequence20 = this.f66006b;
                ResultKt.throwOnFailure(obj);
                objM70193a = obj;
                list2 = list9;
                charSequence7 = charSequence17;
                charSequence8 = charSequence18;
                charSequence10 = charSequence19;
                charSequence9 = charSequence20;
                return new C32405N(charSequence9, charSequence10, charSequence8, list2, charSequence7, ((Boolean) objM70193a).booleanValue(), SNSApplicantStatusAnalyticsState.Initial, C32403L.m71111a(this.f66013i));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
