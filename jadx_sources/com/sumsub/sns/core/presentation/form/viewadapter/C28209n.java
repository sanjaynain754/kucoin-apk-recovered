package com.sumsub.sns.core.presentation.form.viewadapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28090b;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.widget.SNSApplicantDataFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataActionView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBoolFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDescriptionView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataInfoBannerView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSectionView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSubtitleView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTextAreaFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTitleView;
import com.sumsub.sns.core.widget.applicantData.SNSDividerView;
import com.sumsub.sns.core.widget.applicantData.SNSHiddenView;
import com.sumsub.sns.core.widget.applicantData.SNSIndentView;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28811E;
import com.sumsub.sns.internal.core.presentation.form.model.C28813G;
import com.sumsub.sns.internal.core.presentation.form.model.C28815I;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.C28819M;
import com.sumsub.sns.internal.core.presentation.form.model.C28821O;
import com.sumsub.sns.internal.core.presentation.form.model.C28823Q;
import com.sumsub.sns.internal.core.presentation.form.model.C28825T;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.core.presentation.form.model.C28829X;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28835b0;
import com.sumsub.sns.internal.core.presentation.form.model.C28839d0;
import com.sumsub.sns.internal.core.presentation.form.model.C28846h;
import com.sumsub.sns.internal.core.presentation.form.model.C28854l;
import com.sumsub.sns.internal.core.presentation.form.model.C28857o;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.core.presentation.form.model.C28861s;
import com.sumsub.sns.internal.core.presentation.form.model.C28863u;
import com.sumsub.sns.internal.core.presentation.form.model.C28865w;
import com.sumsub.sns.internal.core.presentation.form.model.C28867y;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28209n extends AbstractC28090b {

    /* JADX INFO: renamed from: b */
    public final C28167d f57492b;

    /* JADX INFO: renamed from: c */
    public C28191e f57493c;

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28090b
    /* JADX INFO: renamed from: a */
    public final DiffUtil.Callback mo69071a(ArrayList arrayList, List list) {
        return new C28207m(arrayList, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) this.f57292a.get(i11);
        if (abstractC28841e0 instanceof C28823Q) {
            return 4;
        }
        if (abstractC28841e0 instanceof C28831Z) {
            return 5;
        }
        if (abstractC28841e0 instanceof C28861s) {
            return 6;
        }
        if (abstractC28841e0 instanceof C28839d0) {
            return 0;
        }
        if (abstractC28841e0 instanceof C28829X) {
            return 1;
        }
        if (abstractC28841e0 instanceof C28865w) {
            return 2;
        }
        if (abstractC28841e0 instanceof C28835b0) {
            return 7;
        }
        if (abstractC28841e0 instanceof C28854l) {
            return 8;
        }
        if (abstractC28841e0 instanceof C28863u) {
            return 9;
        }
        if (abstractC28841e0 instanceof C28821O) {
            return 10;
        }
        if (abstractC28841e0 instanceof C28859q) {
            return 11;
        }
        if (abstractC28841e0 instanceof C28857o) {
            return 18;
        }
        if (abstractC28841e0 instanceof C28825T) {
            return 12;
        }
        if (abstractC28841e0 instanceof C28827V) {
            return 13;
        }
        if (abstractC28841e0 instanceof C28819M) {
            return 14;
        }
        if (abstractC28841e0 instanceof C28809C) {
            return 15;
        }
        if (abstractC28841e0 instanceof C28817K) {
            return 16;
        }
        if (abstractC28841e0 instanceof C28813G) {
            return 17;
        }
        if (abstractC28841e0 instanceof C28867y) {
            return 20;
        }
        if (abstractC28841e0 instanceof C28846h) {
            return 19;
        }
        if (abstractC28841e0 instanceof C28815I) {
            return 21;
        }
        if (abstractC28841e0 instanceof C28811E) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        AbstractC28211o abstractC28211o = (AbstractC28211o) viewHolder;
        C28191e c28191e = this.f57493c;
        if (c28191e != null) {
            c28191e.f57461b = true;
        }
        AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) this.f57292a.get(i11);
        int size = this.f57292a.size();
        abstractC28211o.f57499c.reset();
        abstractC28211o.mo69125a(abstractC28211o.f57499c, abstractC28841e0, size);
        abstractC28211o.m69148a(abstractC28211o.f57499c, abstractC28841e0);
        C28191e c28191e2 = this.f57493c;
        if (c28191e2 != null) {
            c28191e2.f57461b = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        AbstractC28211o abstractC28211o = (AbstractC28211o) viewHolder;
        super.onViewRecycled(abstractC28211o);
        abstractC28211o.mo69144a();
    }

    public C28209n(C28167d c28167d) {
        this.f57492b = c28167d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        RecyclerView.ViewHolder c28182c;
        switch (i11) {
            case 0:
                c28182c = new C28182C(new SNSApplicantDataTitleView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
            case 1:
                c28182c = new C28229z(new SNSApplicantDataSubtitleView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
            case 2:
                c28182c = new C28199i(new SNSApplicantDataDescriptionView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
            case 3:
            default:
                c28182c = new C28213p(new SNSHiddenView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
            case 4:
                c28182c = new C28226w(new SNSApplicantDataSectionView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 5:
                c28182c = new C28181B(new SNSApplicantDataFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 6:
                c28182c = new C28189d(new SNSApplicantDataCalendarFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 7:
                c28182c = new C28180A(new SNSApplicantDataTextAreaFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 8:
                c28182c = new C28187c(new SNSApplicantDataBoolFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 9:
                c28182c = new C28197h(new SNSApplicantDataDateTimeFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 10:
                c28182c = new C28225v(new SNSApplicantDataPhoneFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 11:
                c28182c = new C28195g(new SNSApplicantDataSelectionCountryFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 12:
                c28182c = new C28228y(new SNSApplicantDataRadioGroupView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 13:
                c28182c = new C28227x(new SNSApplicantDataSelectionFieldView(viewGroup.getContext(), null, 0, 6, null), this.f57493c, this.f57492b);
                break;
            case 14:
                c28182c = new C28223u(new SNSApplicantDataMutilselectFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 15:
                c28182c = new C28205l(new SNSApplicantDataFileFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 16:
                c28182c = new C28221t(new SNSApplicantDataFileFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 17:
                c28182c = new C28215q(new SNSIndentView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
            case 18:
                c28182c = new C28193f(new SNSApplicantDataMultipleCountrySelectionFieldView(viewGroup.getContext(), null, 0, 0, 14, null), this.f57493c, this.f57492b);
                break;
            case 19:
                c28182c = new C28185b(new SNSApplicantDataActionView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
            case 20:
                c28182c = new C28201j(new SNSDividerView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
            case 21:
                c28182c = new C28217r(new SNSApplicantDataInfoBannerView(viewGroup.getContext()), this.f57493c, this.f57492b);
                break;
        }
        c28182c.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return c28182c;
    }
}
