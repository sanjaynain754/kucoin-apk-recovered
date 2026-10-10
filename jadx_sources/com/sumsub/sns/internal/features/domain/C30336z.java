package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30336z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f60999a;

    /* JADX INFO: renamed from: b */
    public final Lazy f61000b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.sumsub.sns.internal.features.domain.z0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C30336z.m70192a(this.f61001b);
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70193a(ContinuationImpl continuationImpl) {
        C30334y c30334y;
        if (continuationImpl instanceof C30334y) {
            c30334y = (C30334y) continuationImpl;
            int i11 = c30334y.f60998c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30334y.f60998c = i11 - Integer.MIN_VALUE;
            } else {
                c30334y = new C30334y(this, continuationImpl);
            }
        } else {
            c30334y = new C30334y(this, continuationImpl);
        }
        Object objM70043a = c30334y.f60996a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30334y.f60998c;
        Boolean boolBoxBoolean = null;
        boolean zBooleanValue = false;
        boolean z11 = true;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                List list = (List) this.f61000b.getValue();
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        InterfaceC29984m interfaceC29984m = this.f60999a;
                        c30334y.f60998c = 1;
                        objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30334y);
                        if (objM70043a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70043a);
            if (((AbstractC29172p) objM70043a).mo69762m().f59165b != ReviewStatusType.Init) {
                z11 = false;
            }
            boolBoxBoolean = Boxing.boxBoolean(z11);
        } catch (Exception unused) {
        }
        if (boolBoxBoolean != null) {
            zBooleanValue = boolBoxBoolean.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    public C30336z(C28578h c28578h) {
        this.f60999a = (InterfaceC29984m) c28578h.f58180r.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static final List m70192a(C30336z c30336z) {
        Object objM103844constructorimpl;
        ArrayList arrayList;
        if (!C33048a.f67442E.m71434a()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = C33048a.f67443F.m71435b().f67504b;
            if (str == null) {
                str = "";
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("options");
            if (jSONArrayOptJSONArray != null) {
                arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i11));
                }
            } else {
                arrayList = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (List) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }
}
