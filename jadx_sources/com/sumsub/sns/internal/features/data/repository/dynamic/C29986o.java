package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29356f;
import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29954b;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.random.Random;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29986o {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70063a(InterfaceC29954b interfaceC29954b, ContinuationImpl continuationImpl) {
        C29985n c29985n;
        Integer intOrNull;
        if (continuationImpl instanceof C29985n) {
            c29985n = (C29985n) continuationImpl;
            int i11 = c29985n.f60252c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29985n.f60252c = i11 - Integer.MIN_VALUE;
            } else {
                c29985n = new C29985n(this, continuationImpl);
            }
        } else {
            c29985n = new C29985n(this, continuationImpl);
        }
        Object objM70032c = c29985n.f60250a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29985n.f60252c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70032c);
            c29985n.f60252c = 1;
            objM70032c = interfaceC29954b.m70032c(c29985n);
            if (objM70032c == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70032c);
        }
        List list = (List) objM70032c;
        String str = C33048a.f67439B.m71435b().f67504b;
        int size = (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? list.size() : intOrNull.intValue();
        if (size < list.size()) {
            return CollectionsKt.take(list, size);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        int size2 = size - list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            String str2 = (String) CollectionsKt.random(C29967J.f60192n, Random.INSTANCE);
            arrayList.add(new C29380i(new C29356f(str2), new C29332c(str2, "countries." + str2)));
        }
        return arrayList;
    }
}
