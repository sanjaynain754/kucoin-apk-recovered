package com.sumsub.sns.internal.features.presentation.questionnaire;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.form.AbstractC28806m;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29083a0;
import com.sumsub.sns.internal.features.data.model.common.C29074Y;
import com.sumsub.sns.internal.features.data.model.common.C29078Z;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.utils.AbstractC30064d;
import com.sumsub.sns.internal.features.domain.AbstractC30223k0;
import com.sumsub.sns.internal.features.domain.C30217h0;
import com.sumsub.sns.internal.features.domain.C30227m0;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32299H extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65793a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32300I f65794b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FieldId f65795c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Document f65796d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f65797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32299H(C32300I c32300i, FieldId fieldId, Document document, List list, Continuation continuation) {
        super(2, continuation);
        this.f65794b = c32300i;
        this.f65795c = fieldId;
        this.f65796d = document;
        this.f65797e = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32299H(this.f65794b, this.f65795c, this.f65796d, this.f65797e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32299H) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ArrayList arrayList;
        String str;
        String str2;
        List listListOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65793a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32300I c32300i = this.f65794b;
            KProperty[] kPropertyArr = C32300I.f65798w;
            c32300i.m71088a(AbstractC28806m.m69637a(c32300i.m71091g().f58567b, this.f65795c, (String) null, FormItem$ItemState.LOADING));
            C32300I c32300i2 = this.f65794b;
            C30311s0 c30311s0 = c32300i2.f65803e;
            Document document = this.f65796d;
            C28936t c28936t = c32300i2.f65812n;
            KProperty kProperty = C32300I.f65798w[3];
            C30227m0 c30227m0 = new C30227m0(document, (String) c28936t.m69705a(), this.f65797e);
            this.f65793a = 1;
            c30311s0.getClass();
            obj = AbstractC30223k0.m70145a(c30311s0, c30227m0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC29083a0 abstractC29083a0 = (AbstractC29083a0) obj;
        C32300I c32300i3 = this.f65794b;
        FieldId fieldId = this.f65795c;
        abstractC29083a0.getClass();
        if (abstractC29083a0 instanceof C29078Z) {
            List list = (List) ((C29078Z) abstractC29083a0).f59019a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29307Y0 c29307y0 = ((C30217h0) it.next()).f60735b;
                if (c29307y0 != null) {
                    arrayList2.add(c29307y0);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                KProperty[] kPropertyArr2 = C32300I.f65798w;
                List list2 = c32300i3.m71091g().f58567b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList3, ((C28801h) it2.next()).f58573d);
                }
                int size = arrayList3.size();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 < size) {
                        obj2 = arrayList3.get(i13);
                        i13++;
                        AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) obj2;
                        if (Intrinsics.areEqual(abstractC28841e0.mo69643d(), fieldId.getSectionId())) {
                            String strM69333a = abstractC28841e0.mo69642c().f59466a;
                            if (strM69333a == null) {
                                strM69333a = AbstractC28458h.m69333a(abstractC28841e0);
                            }
                            if (Intrinsics.areEqual(strM69333a, fieldId.getItemId())) {
                                break;
                            }
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                AbstractC28841e0 abstractC28841e1 = (AbstractC28841e0) obj2;
                if (abstractC28841e1 instanceof C28809C) {
                    int size2 = arrayList2.size();
                    do {
                        if (i12 < size2) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            str = ((C29307Y0) obj3).f59320e;
                        } else {
                            str = null;
                            break;
                        }
                    } while (str == null);
                    c32300i3.mo69623b(abstractC28841e1, str);
                    List list3 = c32300i3.m71091g().f58567b;
                    Function1 function1 = c32300i3.f65819u;
                    if (str != null) {
                        str2 = (String) function1.invoke(str);
                    } else {
                        str2 = null;
                    }
                    if (str != null) {
                        listListOf = CollectionsKt.listOf(str);
                    } else {
                        listListOf = null;
                    }
                    c32300i3.m71088a(AbstractC28806m.m69638a(list3, fieldId, listListOf, CollectionsKt.listOf(str2)));
                } else if (abstractC28841e1 instanceof C28817K) {
                    C32323s c32323s = c32300i3.f65817s;
                    C28817K c28817k = (C28817K) abstractC28841e1;
                    String str3 = c28817k.f58597e;
                    String strM69333a2 = c28817k.mo69642c().f59466a;
                    if (strM69333a2 == null) {
                        strM69333a2 = AbstractC28458h.m69333a(c28817k);
                    }
                    List listM70091b = AbstractC30064d.m70091b(c32323s.f65855a.m71090f(), str3, strM69333a2);
                    if (listM70091b == null) {
                        listM70091b = CollectionsKt.emptyList();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = arrayList2.size();
                    while (i12 < size3) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        String str4 = ((C29307Y0) obj4).f59320e;
                        if (str4 != null) {
                            arrayList4.add(str4);
                        }
                    }
                    List listPlus = CollectionsKt.plus((Collection) arrayList4, (Iterable) listM70091b);
                    c32300i3.mo69619a(abstractC28841e1, listPlus);
                    List list4 = c32300i3.m71091g().f58567b;
                    Function1 function2 = c32300i3.f65819u;
                    if (listPlus != null) {
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
                        Iterator it3 = listPlus.iterator();
                        while (it3.hasNext()) {
                            arrayList.add((String) function2.invoke((String) it3.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    c32300i3.m71088a(AbstractC28806m.m69638a(list4, fieldId, listPlus, arrayList));
                }
                c32300i3.m71088a(AbstractC28806m.m69637a(c32300i3.m71091g().f58567b, fieldId, (String) null, FormItem$ItemState.DEFAULT));
                InterfaceC41775x1 interfaceC41775x1 = c32300i3.f65820v;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                c32300i3.f65820v = C41696j.m91104d(ViewModelKt.getViewModelScope(c32300i3), null, null, new C32298G(c32300i3, null), 3, null);
            }
        } else if (abstractC29083a0 instanceof C29074Y) {
            Exception exc = (Exception) ((C29074Y) abstractC29083a0).f59016a;
            c32300i3.f65799a.getClass();
            C33272c.f67816e.f67810a.mo68956e("SNSQuestionnaireViewModel", "Error sending file", exc);
            AbstractC28052C.throwError$default(c32300i3, exc, c32300i3.f65807i, null, 4, null);
            c32300i3.m71088a(AbstractC28806m.m69637a(c32300i3.m71091g().f58567b, fieldId, (String) null, FormItem$ItemState.DEFAULT));
        }
        return Unit.INSTANCE;
    }
}
