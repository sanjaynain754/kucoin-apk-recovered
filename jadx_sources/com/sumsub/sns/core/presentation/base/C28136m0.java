package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28136m0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f57366a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28142p0 f57367b;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0148, code lost:
    
        if (r4.emit(r15, r2) == r3) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.sumsub.sns.core.presentation.base.O] */
    /* JADX WARN: Type inference failed for: r15v9, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C28134l0 c28134l0;
        Boolean bool;
        Pair pairM90091to;
        boolean zBooleanValue = false;
        if (continuation instanceof C28134l0) {
            c28134l0 = (C28134l0) continuation;
            int i11 = c28134l0.f57358b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28134l0.f57358b = i11 - Integer.MIN_VALUE;
            } else {
                c28134l0 = new C28134l0(this, continuation);
            }
        } else {
            c28134l0 = new C28134l0(this, continuation);
        }
        Object objM70035a = c28134l0.f57357a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = c28134l0.f57358b;
        try {
            if (r11 != 0) {
                if (r11 == 1) {
                    C28075O c28075o = c28134l0.f57361e;
                    InterfaceC41635f interfaceC41635f = c28134l0.f57359c;
                    ResultKt.throwOnFailure(objM70035a);
                    r11 = interfaceC41635f;
                    obj = c28075o;
                } else {
                    if (r11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM70035a);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objM70035a);
            InterfaceC41635f interfaceC41635f2 = this.f57366a;
            C28075O c28075o2 = (C28075O) obj;
            InterfaceC29953a interfaceC29953a = this.f57367b.commonRepository;
            c28134l0.f57359c = interfaceC41635f2;
            c28134l0.f57361e = c28075o2;
            c28134l0.f57358b = 1;
            objM70035a = ((C29957e) interfaceC29953a).m70035a(c28134l0);
            r11 = interfaceC41635f2;
            obj = c28075o2;
            if (objM70035a == coroutine_suspended) {
            }
            return coroutine_suspended;
            ?? r15 = (Map) objM70035a;
            if (r15 != 0) {
                List listSplit$default = StringsKt.split$default((CharSequence) "minimalisticUi", new char[]{(char) 47}, false, 0, 6, (Object) null);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r15;
                Iterator<Integer> it = RangesKt.until(0, listSplit$default.size() - 1).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                        if (!(obj2 instanceof Boolean)) {
                            obj2 = null;
                        }
                        bool = (Boolean) obj2;
                        break;
                    }
                    Object obj3 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it).nextInt()));
                    Map map = obj3 instanceof Map ? (Map) obj3 : null;
                    if (map != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            if (!(key instanceof String)) {
                                key = null;
                            }
                            String str = (String) key;
                            if (str != null) {
                                Object value = entry.getValue();
                                if (value == null) {
                                    value = null;
                                }
                                if (value != null) {
                                    pairM90091to = TuplesKt.m90091to(str, value);
                                }
                                if (pairM90091to != null) {
                                    arrayList.add(pairM90091to);
                                }
                            }
                            pairM90091to = null;
                            if (pairM90091to != null) {
                                arrayList.add(pairM90091to);
                            }
                        }
                        ?? map2 = MapsKt.toMap(arrayList);
                        if (map2 != 0) {
                            objectRef.element = map2;
                        }
                    }
                    bool = null;
                    break;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e(AbstractC33294e.m71624a(this.f57367b), "Error fetching client integration settings", th2);
        }
        C29983l c29983l = obj.f57271c;
        String strM70061a = c29983l != null ? c29983l.m70061a("sns_general_poweredBy") : null;
        C29983l c29983l2 = obj.f57271c;
        C28143q c28143q = new C28143q(strM70061a, c29983l2 != null ? c29983l2.m70061a("sns_general_progress_text") : null, zBooleanValue);
        c28134l0.f57359c = null;
        c28134l0.f57361e = null;
        c28134l0.f57358b = 2;
    }

    public C28136m0(InterfaceC41635f interfaceC41635f, AbstractC28142p0 abstractC28142p0) {
        this.f57366a = interfaceC41635f;
        this.f57367b = abstractC28142p0;
    }
}
