package com.sumsub.sns.internal.features.presentation.support;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.support.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32619j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C32617h f66546a;

    /* JADX INFO: renamed from: b */
    public CharSequence f66547b;

    /* JADX INFO: renamed from: c */
    public CharSequence f66548c;

    /* JADX INFO: renamed from: d */
    public CharSequence f66549d;

    /* JADX INFO: renamed from: e */
    public CharSequence f66550e;

    /* JADX INFO: renamed from: f */
    public int f66551f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f66552g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C32620k f66553h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32619j(C32620k c32620k, Continuation continuation) {
        super(2, continuation);
        this.f66553h = c32620k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32619j c32619j = new C32619j(this.f66553h, continuation);
        c32619j.f66552g = obj;
        return c32619j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32619j c32619j = new C32619j(this.f66553h, (Continuation) obj2);
        c32619j.f66552g = (C32617h) obj;
        return c32619j.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C32617h c32617h;
        List listEmptyList;
        Object string;
        C32616g c32616g;
        Object string2;
        C32617h c32617h2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object string3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Object string4;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Object objM70075b;
        CharSequence charSequence9;
        CharSequence charSequence10;
        C32617h c32617h3;
        List list;
        CharSequence charSequence11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66551f;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            c32617h = (C32617h) this.f66552g;
            List<SNSSupportItem> supportItems = C28468k0.f57983a.getSupportItems();
            if (supportItems != null) {
                C32620k c32620k = this.f66553h;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportItems, 10));
                for (SNSSupportItem sNSSupportItem : supportItems) {
                    String strIsValid = sNSSupportItem.isValid();
                    if (strIsValid == null || strIsValid.length() == 0) {
                        SNSStepState sNSStepState = SNSStepState.INIT;
                        Drawable iconDrawable = sNSSupportItem.getIconDrawable();
                        String title = sNSSupportItem.getTitle();
                        Spanned spannedM69364a = title != null ? AbstractC28462i0.m69364a(title, ((C28547d) c32620k.f66554a).f58099a.f58163a) : null;
                        String subtitle = sNSSupportItem.getSubtitle();
                        c32616g = new C32616g(sNSSupportItem, sNSStepState, iconDrawable, spannedM69364a, subtitle != null ? AbstractC28462i0.m69364a(subtitle, ((C28547d) c32620k.f66554a).f58099a.f58163a) : null);
                    } else {
                        c32616g = null;
                    }
                    arrayList.add(c32616g);
                }
                listEmptyList = CollectionsKt.filterNotNull(arrayList);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            C32620k c32620k2 = this.f66553h;
            this.f66552g = listEmptyList;
            this.f66546a = c32617h;
            this.f66551f = 1;
            string = c32620k2.getString("sns_support_title", this);
            if (string != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            c32617h = this.f66546a;
            List list2 = (List) this.f66552g;
            ResultKt.throwOnFailure(obj);
            listEmptyList = list2;
            string = obj;
        } else {
            if (i11 == 2) {
                charSequence = this.f66547b;
                C32617h c32617h4 = this.f66546a;
                List list3 = (List) this.f66552g;
                ResultKt.throwOnFailure(obj);
                listEmptyList = list3;
                c32617h2 = c32617h4;
                string2 = obj;
                charSequence2 = (CharSequence) string2;
                C32620k c32620k3 = this.f66553h;
                this.f66552g = listEmptyList;
                this.f66546a = c32617h2;
                this.f66547b = charSequence;
                this.f66548c = charSequence2;
                this.f66551f = 3;
                string3 = c32620k3.getString("sns_support_caseId", this);
                if (string3 != coroutine_suspended) {
                    charSequence3 = charSequence;
                    charSequence4 = charSequence2;
                    charSequence5 = (CharSequence) string3;
                    C32620k c32620k4 = this.f66553h;
                    this.f66552g = listEmptyList;
                    this.f66546a = c32617h2;
                    this.f66547b = charSequence3;
                    this.f66548c = charSequence4;
                    this.f66549d = charSequence5;
                    this.f66551f = 4;
                    string4 = c32620k4.getString("sns_general_action_copy", this);
                    if (string4 != coroutine_suspended) {
                        charSequence6 = charSequence4;
                        charSequence7 = charSequence5;
                        charSequence8 = (CharSequence) string4;
                        C30034c c30034c = this.f66553h.f66555b;
                        this.f66552g = listEmptyList;
                        this.f66546a = c32617h2;
                        this.f66547b = charSequence3;
                        this.f66548c = charSequence6;
                        this.f66549d = charSequence7;
                        this.f66550e = charSequence8;
                        this.f66551f = 5;
                        objM70075b = c30034c.m70075b(this);
                        if (objM70075b != coroutine_suspended) {
                            CharSequence charSequence12 = charSequence3;
                            charSequence9 = charSequence6;
                            charSequence10 = charSequence12;
                            c32617h3 = c32617h2;
                            list = listEmptyList;
                            charSequence11 = charSequence8;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 3) {
                charSequence4 = this.f66548c;
                CharSequence charSequence13 = this.f66547b;
                C32617h c32617h5 = this.f66546a;
                List list4 = (List) this.f66552g;
                ResultKt.throwOnFailure(obj);
                listEmptyList = list4;
                c32617h2 = c32617h5;
                charSequence3 = charSequence13;
                string3 = obj;
                charSequence5 = (CharSequence) string3;
                C32620k c32620k5 = this.f66553h;
                this.f66552g = listEmptyList;
                this.f66546a = c32617h2;
                this.f66547b = charSequence3;
                this.f66548c = charSequence4;
                this.f66549d = charSequence5;
                this.f66551f = 4;
                string4 = c32620k5.getString("sns_general_action_copy", this);
                if (string4 != coroutine_suspended) {
                    charSequence6 = charSequence4;
                    charSequence7 = charSequence5;
                    charSequence8 = (CharSequence) string4;
                    C30034c c30034c2 = this.f66553h.f66555b;
                    this.f66552g = listEmptyList;
                    this.f66546a = c32617h2;
                    this.f66547b = charSequence3;
                    this.f66548c = charSequence6;
                    this.f66549d = charSequence7;
                    this.f66550e = charSequence8;
                    this.f66551f = 5;
                    objM70075b = c30034c2.m70075b(this);
                    if (objM70075b != coroutine_suspended) {
                        CharSequence charSequence14 = charSequence3;
                        charSequence9 = charSequence6;
                        charSequence10 = charSequence14;
                        c32617h3 = c32617h2;
                        list = listEmptyList;
                        charSequence11 = charSequence8;
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 4) {
                charSequence7 = this.f66549d;
                CharSequence charSequence15 = this.f66548c;
                CharSequence charSequence16 = this.f66547b;
                C32617h c32617h6 = this.f66546a;
                List list5 = (List) this.f66552g;
                ResultKt.throwOnFailure(obj);
                listEmptyList = list5;
                c32617h2 = c32617h6;
                charSequence3 = charSequence16;
                charSequence6 = charSequence15;
                string4 = obj;
                charSequence8 = (CharSequence) string4;
                C30034c c30034c3 = this.f66553h.f66555b;
                this.f66552g = listEmptyList;
                this.f66546a = c32617h2;
                this.f66547b = charSequence3;
                this.f66548c = charSequence6;
                this.f66549d = charSequence7;
                this.f66550e = charSequence8;
                this.f66551f = 5;
                objM70075b = c30034c3.m70075b(this);
                if (objM70075b != coroutine_suspended) {
                    CharSequence charSequence17 = charSequence3;
                    charSequence9 = charSequence6;
                    charSequence10 = charSequence17;
                    c32617h3 = c32617h2;
                    list = listEmptyList;
                    charSequence11 = charSequence8;
                }
                return coroutine_suspended;
            }
            if (i11 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CharSequence charSequence18 = this.f66550e;
            charSequence7 = this.f66549d;
            CharSequence charSequence19 = this.f66548c;
            CharSequence charSequence20 = this.f66547b;
            C32617h c32617h7 = this.f66546a;
            List list6 = (List) this.f66552g;
            ResultKt.throwOnFailure(obj);
            charSequence11 = charSequence18;
            c32617h3 = c32617h7;
            list = list6;
            charSequence9 = charSequence19;
            charSequence10 = charSequence20;
            objM70075b = obj;
        }
        CharSequence charSequence21 = charSequence7;
        c32617h3.getClass();
        return new C32617h(charSequence10, charSequence9, charSequence21, charSequence11, (CharSequence) objM70075b, list);
        CharSequence charSequence22 = (CharSequence) string;
        C32620k c32620k6 = this.f66553h;
        this.f66552g = listEmptyList;
        this.f66546a = c32617h;
        this.f66547b = charSequence22;
        this.f66551f = 2;
        string2 = c32620k6.getString("sns_support_subtitle", this);
        if (string2 != coroutine_suspended) {
            c32617h2 = c32617h;
            charSequence = charSequence22;
            charSequence2 = (CharSequence) string2;
            C32620k c32620k7 = this.f66553h;
            this.f66552g = listEmptyList;
            this.f66546a = c32617h2;
            this.f66547b = charSequence;
            this.f66548c = charSequence2;
            this.f66551f = 3;
            string3 = c32620k7.getString("sns_support_caseId", this);
            if (string3 != coroutine_suspended) {
                charSequence3 = charSequence;
                charSequence4 = charSequence2;
                charSequence5 = (CharSequence) string3;
                C32620k c32620k8 = this.f66553h;
                this.f66552g = listEmptyList;
                this.f66546a = c32617h2;
                this.f66547b = charSequence3;
                this.f66548c = charSequence4;
                this.f66549d = charSequence5;
                this.f66551f = 4;
                string4 = c32620k8.getString("sns_general_action_copy", this);
                if (string4 != coroutine_suspended) {
                    charSequence6 = charSequence4;
                    charSequence7 = charSequence5;
                    charSequence8 = (CharSequence) string4;
                    C30034c c30034c4 = this.f66553h.f66555b;
                    this.f66552g = listEmptyList;
                    this.f66546a = c32617h2;
                    this.f66547b = charSequence3;
                    this.f66548c = charSequence6;
                    this.f66549d = charSequence7;
                    this.f66550e = charSequence8;
                    this.f66551f = 5;
                    objM70075b = c30034c4.m70075b(this);
                    if (objM70075b != coroutine_suspended) {
                        CharSequence charSequence110 = charSequence3;
                        charSequence9 = charSequence6;
                        charSequence10 = charSequence110;
                        c32617h3 = c32617h2;
                        list = listEmptyList;
                        charSequence11 = charSequence8;
                        CharSequence charSequence23 = charSequence7;
                        c32617h3.getClass();
                        return new C32617h(charSequence10, charSequence9, charSequence23, charSequence11, (CharSequence) objM70075b, list);
                    }
                }
            }
        }
        return coroutine_suspended;
    }
}
