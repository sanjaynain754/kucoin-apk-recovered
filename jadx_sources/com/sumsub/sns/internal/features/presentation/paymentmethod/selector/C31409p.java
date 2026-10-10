package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.paymentmethod.InterfaceC31392b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31409p implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f63644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29983l f63645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f63646c;

    public C31409p(InterfaceC41635f interfaceC41635f, C29983l c29983l, List list) {
        this.f63644a = interfaceC41635f;
        this.f63645b = c29983l;
        this.f63646c = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C31408o c31408o;
        if (continuation instanceof C31408o) {
            c31408o = (C31408o) continuation;
            int i11 = c31408o.f63642b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31408o.f63642b = i11 - Integer.MIN_VALUE;
            } else {
                c31408o = new C31408o(this, continuation);
            }
        } else {
            c31408o = new C31408o(this, continuation);
        }
        Object obj2 = c31408o.f63641a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31408o.f63642b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f63644a;
            String str = (String) obj;
            C29983l c29983l = this.f63645b;
            String strM70061a = c29983l != null ? c29983l.m70061a("sns_paymentmethods_selector_title") : null;
            String str2 = strM70061a == null ? "" : strM70061a;
            C29983l c29983l2 = this.f63645b;
            String strM70061a2 = c29983l2 != null ? c29983l2.m70061a("sns_paymentmethods_selector_section") : null;
            String str3 = strM70061a2 == null ? "" : strM70061a2;
            C29983l c29983l3 = this.f63645b;
            String strM70061a3 = c29983l3 != null ? c29983l3.m70061a("sns_paymentmethods_selector_action_continue") : null;
            String str4 = strM70061a3 == null ? "" : strM70061a3;
            boolean z11 = str != null;
            List list = this.f63646c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC31392b) it.next()).getClass();
                C29983l c29983l4 = this.f63645b;
                String strM70061a4 = c29983l4 != null ? c29983l4.m70061a("sns_paymentmethods_method_bankCard_title") : null;
                if (strM70061a4 == null) {
                    strM70061a4 = "";
                }
                arrayList.add(new C31406m(strM70061a4, Intrinsics.areEqual("bankCard", str)));
            }
            C31407n c31407n = new C31407n(str2, str3, str4, z11, arrayList);
            c31408o.f63642b = 1;
            if (interfaceC41635f.emit(c31407n, c31408o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
