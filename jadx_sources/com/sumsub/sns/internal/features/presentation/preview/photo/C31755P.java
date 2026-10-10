package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.domain.documents.C30132c;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31755P extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f64526b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f64527c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC31770c0 f64528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31755P(File file, int i11, AbstractC31770c0 abstractC31770c0, Continuation continuation) {
        super(2, continuation);
        this.f64526b = file;
        this.f64527c = i11;
        this.f64528d = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31755P c31755p = new C31755P(this.f64526b, this.f64527c, this.f64528d, continuation);
        c31755p.f64525a = obj;
        return c31755p;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31755P) create((C31931t) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        int i11;
        C30152w c30152wM70118a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C31931t c31931t = (C31931t) this.f64525a;
        List<C30152w> list = c31931t.f64909a;
        File file = this.f64526b;
        int i12 = this.f64527c;
        AbstractC31770c0 abstractC31770c0 = this.f64528d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C30152w c30152w : list) {
            if (Intrinsics.areEqual(c30152w.f60590b, file)) {
                c30152wM70118a = C30152w.m70118a(c30152w, i12, null, null, 123);
            } else {
                C28936t c28936t = abstractC31770c0.f64559h.f66627s;
                KProperty kProperty = C32635M.f66607x[5];
                Map map = (Map) c28936t.m69705a();
                File file2 = c30152w.f60590b;
                if (file2 == null || (absolutePath = file2.getAbsolutePath()) == null) {
                    absolutePath = "";
                }
                C30132c c30132c = (C30132c) map.get(absolutePath);
                if (c30132c != null) {
                    i11 = c30132c.f60571a;
                } else {
                    i11 = 0;
                }
                c30152wM70118a = C30152w.m70118a(c30152w, i11, null, null, 123);
            }
            arrayList.add(c30152wM70118a);
        }
        return C31931t.m70949a(c31931t, arrayList, null, false, false, null, 30);
    }
}
