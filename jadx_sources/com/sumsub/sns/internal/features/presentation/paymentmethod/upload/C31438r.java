package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28080U;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.documents.C30122P;
import com.sumsub.sns.internal.features.domain.documents.C30123Q;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31438r extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f63712a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f63713b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28075O f63714c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31442v f63715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31438r(C28075O c28075o, C31442v c31442v, Continuation continuation) {
        super(3, continuation);
        this.f63714c = c28075o;
        this.f63715d = c31442v;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C31438r c31438r = new C31438r(this.f63714c, this.f63715d, (Continuation) obj3);
        c31438r.f63712a = (List) obj;
        c31438r.f63713b = zBooleanValue;
        return c31438r.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30152w c30152wM70118a;
        C31434n c31434n;
        String str;
        EnumC31420x33e3abfe enumC31420x33e3abfe;
        String str2;
        C30152w c30152wM70118a2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = this.f63712a;
        boolean z11 = this.f63713b;
        C29983l c29983l = this.f63714c.f57271c;
        if (c29983l == null) {
            return C28080U.f57275a;
        }
        C31442v c31442v = this.f63715d;
        int i11 = C31442v.f63730W;
        C30152w c30152w = list != null ? (C30152w) CollectionsKt.firstOrNull(list) : null;
        C30152w c30152w2 = list != null ? (C30152w) CollectionsKt.getOrNull(list, 1) : null;
        if (c30152w != null) {
            c30152wM70118a = (c30152w2 == null || !(c30152w.f60595g instanceof C30123Q) || (c30152w2.f60595g instanceof C30123Q)) ? c30152w : C30152w.m70118a(c30152w, 0, null, C30122P.f60562a, 63);
        } else {
            c30152wM70118a = null;
        }
        boolean z12 = !z11;
        C31434n c31434n2 = new C31434n(c30152wM70118a, false, z12);
        if (c31442v.f63737l && ((c31442v.f63738m || c30152w != null) && !(z11 && c30152w2 == null))) {
            if (c30152w2 != null) {
                c30152wM70118a2 = (c30152w == null || !(c30152w2.f60595g instanceof C30123Q) || (c30152w.f60595g instanceof C30123Q)) ? c30152w2 : C30152w.m70118a(c30152w2, 0, null, C30122P.f60562a, 63);
            } else {
                c30152wM70118a2 = null;
            }
            c31434n = new C31434n(c30152wM70118a2, !c31442v.f63738m, z12);
        } else {
            c31434n = null;
        }
        int i12 = AbstractC31437q.f63710a[c31442v.f63732g.ordinal()];
        if (i12 == 1) {
            str = "sns_paymentmethods_upload_bankCard_subtitle_one_file";
        } else if (i12 == 2) {
            str = "sns_paymentmethods_upload_bankCard_subtitle_two_files";
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sns_paymentmethods_upload_bankCard_subtitle_some_files";
        }
        if (z11) {
            enumC31420x33e3abfe = null;
        } else if (c30152w == null) {
            enumC31420x33e3abfe = EnumC31420x33e3abfe.SHOW_SELECTOR;
        } else {
            enumC31420x33e3abfe = (c31442v.f63738m && c30152w2 == null) ? EnumC31420x33e3abfe.SHOW_SELECTOR : EnumC31420x33e3abfe.UPLOAD_DOCS;
        }
        int i13 = enumC31420x33e3abfe == null ? -1 : AbstractC31437q.f63711b[enumC31420x33e3abfe.ordinal()];
        if (i13 == -1) {
            str2 = "sns_paymentmethods_upload_bankCard_action_uploading";
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "sns_paymentmethods_upload_bankCard_action_continue";
        }
        C31431k c31431k = new C31431k(c29983l.m70061a(str2), enumC31420x33e3abfe);
        String strM70061a = c29983l.m70061a("sns_paymentmethods_upload_bankCard_title");
        String str3 = strM70061a == null ? "" : strM70061a;
        String strM70061a2 = c29983l.m70061a(str);
        String str4 = strM70061a2 == null ? "" : strM70061a2;
        String strM70061a3 = c29983l.m70061a("sns_paymentmethods_upload_bankCard_body");
        return new C31435o(str3, str4, strM70061a3 != null ? AbstractC28462i0.m69364a(strM70061a3, ((C28547d) c31442v.f63735j).f58099a.f58163a) : null, c29983l.m70061a("sns_paymentmethods_disclaimer"), new C31433m(new C31432l(c29983l.m70061a("sns_paymentmethods_upload_bankCard_document_action_addFile"), c29983l.m70061a("sns_paymentmethods_upload_bankCard_optionalDocument_action_addFile"), c29983l.m70061a("sns_paymentmethods_upload_bankCard_document_label"), c29983l.m70061a("sns_paymentmethods_upload_bankCard_optionalDocument_label"), c29983l.m70061a("sns_general_state_uploading"), c29983l.m70061a("sns_general_state_processing"), c29983l.m70061a("sns_paymentmethods_upload_bankCard_optionalDocument_suffix")), c29983l.m70061a("sns_paymentmethods_upload_bankCard_fileFormats"), c31434n2, c31434n), c31431k);
    }
}
