package com.sumsub.sns.internal.features.presentation.questionnaire;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.form.AbstractC28806m;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;
import com.sumsub.sns.internal.features.data.utils.AbstractC30064d;
import com.sumsub.sns.internal.features.domain.C30306q;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32324t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32300I f65857b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f65858c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FieldId f65859d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28841e0 f65860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32324t(C32300I c32300i, String str, FieldId fieldId, AbstractC28841e0 abstractC28841e0, Continuation continuation) {
        super(2, continuation);
        this.f65857b = c32300i;
        this.f65858c = str;
        this.f65859d = fieldId;
        this.f65860e = abstractC28841e0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32324t(this.f65857b, this.f65858c, this.f65859d, this.f65860e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32324t) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70177a;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65856a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM70177a = ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30306q c30306q = this.f65857b.f65804f;
            List listListOf = CollectionsKt.listOf(this.f65858c);
            this.f65856a = 1;
            objM70177a = c30306q.m70177a(listListOf, this);
            if (objM70177a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (Result.m103847exceptionOrNullimpl(objM70177a) != null) {
            C32300I c32300i = this.f65857b;
            String str = this.f65858c;
            C30316a.m70182a(c32300i.f65799a, "SNSQuestionnaireViewModel", "Failed to delete file with id: " + str);
        }
        C32300I c32300i2 = this.f65857b;
        KProperty[] kPropertyArr = C32300I.f65798w;
        c32300i2.m71088a(AbstractC28806m.m69637a(c32300i2.m71091g().f58567b, this.f65859d, this.f65858c, FormItem$ItemState.DEFAULT));
        if (Result.m103850isFailureimpl(objM70177a)) {
            objM70177a = null;
        }
        List list = (List) objM70177a;
        if (list == null) {
            return Unit.INSTANCE;
        }
        C32300I c32300i3 = this.f65857b;
        c32300i3.m71088a(AbstractC28806m.m69636a(c32300i3.m71091g().f58567b, this.f65859d, this.f65858c));
        AbstractC28841e0 abstractC28841e0 = this.f65860e;
        if (abstractC28841e0 instanceof C28809C) {
            this.f65857b.mo69623b(abstractC28841e0, null);
            C32300I c32300i4 = this.f65857b;
            c32300i4.m71088a(AbstractC28806m.m69638a(c32300i4.m71091g().f58567b, this.f65859d, (List) null, CollectionsKt.listOf((Object) null)));
        } else if (abstractC28841e0 instanceof C28817K) {
            C32323s c32323s = this.f65857b.f65817s;
            String str2 = ((C28817K) abstractC28841e0).f58597e;
            String strM69333a = abstractC28841e0.mo69642c().f59466a;
            if (strM69333a == null) {
                strM69333a = AbstractC28458h.m69333a(abstractC28841e0);
            }
            List listM70091b = AbstractC30064d.m70091b(c32323s.f65855a.m71090f(), str2, strM69333a);
            if (listM70091b == null) {
                listM70091b = CollectionsKt.emptyList();
            }
            List listMinus = CollectionsKt.minus((Iterable) listM70091b, (Iterable) list);
            this.f65857b.mo69619a(this.f65860e, listMinus);
            C32300I c32300i5 = this.f65857b;
            List list2 = c32300i5.m71091g().f58567b;
            FieldId fieldId = this.f65859d;
            Function1 function1 = this.f65857b.f65819u;
            if (listMinus != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMinus, 10));
                Iterator it = listMinus.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) function1.invoke((String) it.next()));
                }
            } else {
                arrayList = null;
            }
            c32300i5.m71088a(AbstractC28806m.m69638a(list2, fieldId, listMinus, arrayList));
        }
        C32300I c32300i6 = this.f65857b;
        InterfaceC41775x1 interfaceC41775x1 = c32300i6.f65820v;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        c32300i6.f65820v = C41696j.m91104d(ViewModelKt.getViewModelScope(c32300i6), null, null, new C32298G(c32300i6, null), 3, null);
        return Unit.INSTANCE;
    }
}
