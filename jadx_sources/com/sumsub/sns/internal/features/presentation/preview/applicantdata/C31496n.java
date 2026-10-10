package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28990D;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29060U1;
import com.sumsub.sns.internal.features.data.model.common.C29068W1;
import com.sumsub.sns.internal.features.data.model.common.C29076Y1;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31496n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28850j f63900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31476A f63901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31496n(C28850j c28850j, C31476A c31476a, Continuation continuation) {
        super(2, continuation);
        this.f63900b = c28850j;
        this.f63901c = c31476a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31496n(this.f63900b, this.f63901c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31496n(this.f63900b, this.f63901c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0203, code lost:
    
        if (r14 == r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0205, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (r14 == r0) goto L114;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C31480E c31480e;
        Object objM70742a;
        Integer intOrNull;
        Object obj2;
        int iIntValue;
        Object objM70742a2;
        Integer numValueOf;
        AbstractC29103d2 abstractC29103d2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63899a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            String str = this.f63900b.f58677a;
            if (Intrinsics.areEqual(str, "add_tin")) {
                C31476A c31476a = this.f63901c;
                this.f63899a = 1;
                List<AbstractC28990D> list = c31476a.f63863o;
                if (list == null) {
                    objM70742a2 = Unit.INSTANCE;
                } else {
                    c31476a.f63866r.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC28990D abstractC28990D : list) {
                        boolean z11 = abstractC28990D instanceof C29719y;
                        if (z11) {
                            AbstractC29103d2 abstractC29103d3 = ((C29719y) abstractC28990D).f59781b;
                            if (abstractC29103d3 instanceof C29060U1) {
                                numValueOf = Integer.valueOf(((C29060U1) abstractC29103d3).f59008b);
                            } else if (z11) {
                                abstractC29103d2 = ((C29719y) abstractC28990D).f59781b;
                                if (abstractC29103d2 instanceof C29076Y1) {
                                    numValueOf = Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b);
                                } else {
                                    numValueOf = null;
                                }
                            } else {
                                numValueOf = null;
                            }
                        } else if (z11) {
                            abstractC29103d2 = ((C29719y) abstractC28990D).f59781b;
                            if (abstractC29103d2 instanceof C29076Y1) {
                                numValueOf = Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b);
                            } else {
                                numValueOf = null;
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            arrayList.add(numValueOf);
                        }
                    }
                    Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
                    int iNextIndex = -1;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    int i12 = iIntValue + 1;
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        AbstractC28990D abstractC28990D2 = (AbstractC28990D) listIterator.previous();
                        if (abstractC28990D2 instanceof C29719y) {
                            AbstractC29103d2 abstractC29103d4 = ((C29719y) abstractC28990D2).f59781b;
                            if (Intrinsics.areEqual(abstractC29103d4, C29068W1.f59010b) || (abstractC29103d4 instanceof C29076Y1) || (abstractC29103d4 instanceof C29060U1)) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        }
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) list);
                    C31481F.m70752a(mutableList, i12, Integer.valueOf(iNextIndex + 1));
                    c31476a.f63863o = mutableList;
                    objM70742a2 = c31476a.m70742a((List) null, this);
                    if (objM70742a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM70742a2 = Unit.INSTANCE;
                    }
                }
            } else if (Intrinsics.areEqual(str, "remove_tin")) {
                C31476A c31476a2 = this.f63901c;
                C28850j c28850j = this.f63900b;
                this.f63899a = 2;
                List list2 = c31476a2.f63863o;
                if (list2 == null) {
                    objM70742a = Unit.INSTANCE;
                } else {
                    C31481F c31481f = c31476a2.f63866r;
                    Map mapM70747e = c31476a2.m70747e();
                    c31481f.getClass();
                    String str2 = c28850j.f58678b;
                    if (str2 != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
                        int iIntValue2 = intOrNull.intValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof C29719y) {
                                arrayList2.add(obj3);
                            }
                        }
                        int size = arrayList2.size();
                        int i13 = 0;
                        int i14 = 0;
                        do {
                            if (i14 < size) {
                                obj2 = arrayList2.get(i14);
                                i14++;
                            } else {
                                obj2 = null;
                                break;
                            }
                        } while (!Intrinsics.areEqual(((C29719y) obj2).f59781b, C29068W1.f59010b));
                        C29719y c29719y = (C29719y) obj2;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : list2) {
                            if (obj4 instanceof C29719y) {
                                arrayList3.add(obj4);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            int size2 = arrayList3.size();
                            int i15 = 0;
                            while (i13 < size2) {
                                Object obj5 = arrayList3.get(i13);
                                i13++;
                                if ((((C29719y) obj5).f59781b instanceof C29076Y1) && (i15 = i15 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                            i13 = i15;
                        }
                        if (c29719y != null && c29719y.f59782c && i13 <= 1) {
                            c31480e = new C31480E(list2, mapM70747e);
                        } else {
                            C29060U1 c29060u1 = new C29060U1(iIntValue2);
                            C29076Y1 c29076y1 = new C29076Y1(iIntValue2);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj6 : list2) {
                                AbstractC28990D abstractC28990D3 = (AbstractC28990D) obj6;
                                if (abstractC28990D3 instanceof C29719y) {
                                    C29719y c29719y2 = (C29719y) abstractC28990D3;
                                    if (Intrinsics.areEqual(c29719y2.f59781b, c29060u1) || Intrinsics.areEqual(c29719y2.f59781b, c29076y1)) {
                                    }
                                }
                                arrayList4.add(obj6);
                            }
                            Map mutableMap = MapsKt.toMutableMap(mapM70747e);
                            mutableMap.remove(c29060u1.f59051a);
                            mutableMap.remove(c29076y1.f59051a);
                            c31480e = new C31480E(arrayList4, mutableMap);
                        }
                    } else {
                        c31480e = new C31480E(list2, mapM70747e);
                    }
                    c31476a2.f63863o = c31480e.f63874a;
                    c31476a2.m70744a(c31480e.f63875b);
                    objM70742a = c31476a2.m70742a((List) null, this);
                    if (objM70742a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM70742a = Unit.INSTANCE;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
