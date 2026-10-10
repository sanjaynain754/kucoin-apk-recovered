package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.documents.C30122P;
import com.sumsub.sns.internal.features.domain.documents.C30123Q;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31465q extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C29046Q2 f63800a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f63801b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f63802c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31472x f63803d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C28075O f63804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31465q(C28075O c28075o, C31472x c31472x, Continuation continuation) {
        super(4, continuation);
        this.f63803d = c31472x;
        this.f63804e = c28075o;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C31472x c31472x = this.f63803d;
        C31465q c31465q = new C31465q(this.f63804e, c31472x, (Continuation) obj4);
        c31465q.f63800a = (C29046Q2) obj;
        c31465q.f63801b = (List) obj2;
        c31465q.f63802c = zBooleanValue;
        return c31465q.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30152w c30152wM70118a;
        C31458j c31458j;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C29046Q2 c29046q2 = this.f63800a;
        List list = this.f63801b;
        boolean z11 = this.f63802c;
        C31472x c31472x = this.f63803d;
        C28075O c28075o = this.f63804e;
        C29983l c29983l = c28075o.f57271c;
        C29124h c29124h = c28075o.f57270b;
        boolean z12 = c31472x.f63844l && list != null && (list.isEmpty() ^ true);
        C30152w c30152wM70118a2 = null;
        C30152w c30152w = list != null ? (C30152w) CollectionsKt.firstOrNull(list) : null;
        C30152w c30152w2 = list != null ? (C30152w) CollectionsKt.getOrNull(list, 1) : null;
        if (c30152w != null) {
            c30152wM70118a = (c30152w2 == null || !(c30152w.f60595g instanceof C30123Q) || (c30152w2.f60595g instanceof C30123Q)) ? c30152w : C30152w.m70118a(c30152w, 0, null, C30122P.f60562a, 63);
        } else {
            c30152wM70118a = null;
        }
        boolean z13 = !z11;
        C31458j c31458j2 = new C31458j(c30152wM70118a, true, false, z13);
        if (z11 || z12) {
            if (c30152w2 != null) {
                c30152wM70118a2 = (c30152w == null || !(c30152w2.f60595g instanceof C30123Q) || (c30152w.f60595g instanceof C30123Q)) ? c30152w2 : C30152w.m70118a(c30152w2, 0, null, C30122P.f60562a, 63);
            }
            c31458j = new C31458j(c30152wM70118a2, (z11 && c30152w2 == null) ? false : true, true, z13);
        } else {
            c31458j = null;
        }
        return new C31459k(c29983l.m70061a("sns_poa_upload_title"), c29983l.m70061a("sns_poa_upload_subtitle"), c31458j2, c31458j, z11 ? c29983l.m70061a("sns_general_state_uploading") : c29983l.m70061a("sns_poa_upload_action_continue"), z13, c29983l.m70061a("sns_poa_upload_action_whatElse"), z13, new C31463o(c29046q2), c29983l.m70061a("sns_poa_upload_examples"), c31472x.m70738a(c29124h, c29046q2, c29983l), c29983l.m70061a("sns_poa_upload_document_label"), c29983l.m70061a("sns_poa_upload_optionalDocument_label"), c29983l.m70061a("sns_poa_upload_document_action_addFile"), c29983l.m70061a("sns_poa_upload_optionalDocument_action_addFile"), c29983l.m70061a("sns_poa_upload_optionalDocument_suffix"), c29983l.m70061a("sns_poa_upload_fileFormats"), c29983l.m70061a("sns_general_state_uploading"), c29983l.m70061a("sns_general_state_processing"));
    }
}
