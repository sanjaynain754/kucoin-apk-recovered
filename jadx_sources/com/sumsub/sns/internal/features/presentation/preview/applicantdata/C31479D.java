package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.presentation.form.model.C28846h;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$Action$Type;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Set;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31479D {

    /* JADX INFO: renamed from: a */
    public final C29983l f63869a;

    /* JADX INFO: renamed from: b */
    public final C29719y f63870b;

    /* JADX INFO: renamed from: c */
    public final int f63871c;

    /* JADX INFO: renamed from: d */
    public final Set f63872d;

    /* JADX INFO: renamed from: e */
    public boolean f63873e;

    /* JADX INFO: renamed from: a */
    public static C28846h m70749a(int i11, String str, C29983l c29983l) {
        return new C28846h("appdata", c29983l.m70061a("sns_data_tax_information_action_remove"), SNSIconHandler.SNSCommonIcons.BIN.getImageName(), new C28850j("remove_tin", String.valueOf(i11)), FormItem$Action$Type.DANGEROUS, str + "_delete_tin_action");
    }

    public C31479D(C29983l c29983l, C29719y c29719y, int i11, Set set) {
        this.f63869a = c29983l;
        this.f63870b = c29719y;
        this.f63871c = i11;
        this.f63872d = set;
    }

    /* JADX INFO: renamed from: a */
    public static C28846h m70750a(C29983l c29983l, String str) {
        return new C28846h("appdata", c29983l.m70061a("sns_data_tax_information_action_add"), SNSIconHandler.SNSCommonIcons.ADD.getImageName(), new C28850j("add_tin", null), FormItem$Action$Type.NORMAL, str + "_add_tin_action");
    }
}
