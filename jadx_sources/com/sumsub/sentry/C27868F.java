package com.sumsub.sentry;

import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import com.sumsub.sns.internal.p125ff.core.C33051b;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sentry.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C27868F extends FunctionReferenceImpl implements Function0 {
    public C27868F() {
        super(0, C33048a.f67464a, C33048a.class, "getEnabledFeatureNames", "getEnabledFeatureNames$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/List;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C33048a) this.receiver).getClass();
        C33051b c33051b = C33048a.f67466b;
        List listPlus = CollectionsKt.plus(c33051b.f67501a.values(), (Iterable) c33051b.f67502b.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (((C33050a) obj).m71434a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(((C33050a) obj2).f67494a);
        }
        return arrayList2;
    }
}
