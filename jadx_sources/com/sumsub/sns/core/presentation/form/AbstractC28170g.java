package com.sumsub.sns.core.presentation.form;

import com.sumsub.sns.core.presentation.form.viewutils.AbstractC28230a;
import com.sumsub.sns.core.presentation.form.viewutils.AbstractC28231b;
import com.sumsub.sns.core.presentation.form.viewutils.AbstractC28232c;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBoolFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
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
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28170g {
    /* JADX INFO: renamed from: a */
    public static final String m69116a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0) {
        List<SNSApplicantDataFileFieldView.Attachment> files;
        SNSApplicantDataFileFieldView.Attachment attachment;
        C30877b selectedCountry;
        C29724z selectedItem;
        if ((abstractC28841e0 instanceof C28831Z) || (abstractC28841e0 instanceof C28835b0) || (abstractC28841e0 instanceof C28825T)) {
            String value = sNSApplicantDataBaseFieldView.getValue();
            if (StringsKt.isBlank(value)) {
                return null;
            }
            return value;
        }
        if (abstractC28841e0 instanceof C28821O) {
            SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataPhoneFieldView ? (SNSApplicantDataPhoneFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataPhoneFieldView != null) {
                return AbstractC28232c.m69164a(sNSApplicantDataPhoneFieldView);
            }
            return null;
        }
        if (abstractC28841e0 instanceof C28827V) {
            SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionFieldView ? (SNSApplicantDataSelectionFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataSelectionFieldView == null || (selectedItem = sNSApplicantDataSelectionFieldView.getSelectedItem()) == null) {
                return null;
            }
            return selectedItem.f59791a;
        }
        if (abstractC28841e0 instanceof C28854l) {
            SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataBoolFieldView ? (SNSApplicantDataBoolFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataBoolFieldView != null) {
                boolean zIsChecked = sNSApplicantDataBoolFieldView.isChecked();
                Boolean boolValueOf = Boolean.valueOf(zIsChecked);
                if (!zIsChecked) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    return boolValueOf.toString();
                }
            }
            return null;
        }
        if (abstractC28841e0 instanceof C28861s) {
            SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataCalendarFieldView ? (SNSApplicantDataCalendarFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataCalendarFieldView != null) {
                SimpleDateFormat simpleDateFormat = AbstractC28231b.f57527a;
                Date selectedDate = sNSApplicantDataCalendarFieldView.getSelectedDate();
                if (selectedDate != null) {
                    return AbstractC28231b.f57527a.format(selectedDate);
                }
            }
            return null;
        }
        if (abstractC28841e0 instanceof C28863u) {
            SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataDateTimeFieldView ? (SNSApplicantDataDateTimeFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataDateTimeFieldView != null) {
                SimpleDateFormat simpleDateFormat2 = AbstractC28230a.f57526a;
                Date selectedDate2 = sNSApplicantDataDateTimeFieldView.getSelectedDate();
                if (selectedDate2 != null) {
                    return AbstractC28230a.f57526a.format(selectedDate2);
                }
            }
            return null;
        }
        if (abstractC28841e0 instanceof C28859q) {
            SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionCountryFieldView ? (SNSApplicantDataSelectionCountryFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataSelectionCountryFieldView == null || (selectedCountry = sNSApplicantDataSelectionCountryFieldView.getSelectedCountry()) == null) {
                return null;
            }
            return selectedCountry.f62373a;
        }
        if (abstractC28841e0 instanceof C28809C) {
            SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataFileFieldView ? (SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView : null;
            if (sNSApplicantDataFileFieldView == null || (files = sNSApplicantDataFileFieldView.getFiles()) == null || (attachment = (SNSApplicantDataFileFieldView.Attachment) CollectionsKt.firstOrNull((List) files)) == null) {
                return null;
            }
            return attachment.getId();
        }
        if ((abstractC28841e0 instanceof C28817K) || (abstractC28841e0 instanceof C28819M) || (abstractC28841e0 instanceof C28857o) || (abstractC28841e0 instanceof C28865w) || (abstractC28841e0 instanceof C28811E) || (abstractC28841e0 instanceof C28823Q) || (abstractC28841e0 instanceof C28829X) || (abstractC28841e0 instanceof C28839d0) || (abstractC28841e0 instanceof C28813G) || (abstractC28841e0 instanceof C28867y) || (abstractC28841e0 instanceof C28846h) || (abstractC28841e0 instanceof C28815I)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m69117b(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0) {
        if (abstractC28841e0 instanceof C28819M) {
            List<C29724z> selectedItems = ((SNSApplicantDataMutilselectFieldView) sNSApplicantDataBaseFieldView).getSelectedItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedItems, 10));
            Iterator<T> it = selectedItems.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29724z) it.next()).f59791a);
            }
            return arrayList;
        }
        if (abstractC28841e0 instanceof C28817K) {
            List<SNSApplicantDataFileFieldView.Attachment> files = ((SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView).getFiles();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
            Iterator<T> it2 = files.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((SNSApplicantDataFileFieldView.Attachment) it2.next()).getId());
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        if (abstractC28841e0 instanceof C28857o) {
            List<C30877b> selectedCountries = ((SNSApplicantDataMultipleCountrySelectionFieldView) sNSApplicantDataBaseFieldView).getSelectedCountries();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedCountries, 10));
            Iterator<T> it3 = selectedCountries.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((C30877b) it3.next()).f62373a);
            }
            return arrayList3;
        }
        if ((abstractC28841e0 instanceof C28854l) || (abstractC28841e0 instanceof C28859q) || (abstractC28841e0 instanceof C28861s) || (abstractC28841e0 instanceof C28863u) || (abstractC28841e0 instanceof C28809C) || (abstractC28841e0 instanceof C28821O) || (abstractC28841e0 instanceof C28825T) || (abstractC28841e0 instanceof C28827V) || (abstractC28841e0 instanceof C28831Z) || (abstractC28841e0 instanceof C28835b0) || (abstractC28841e0 instanceof C28811E) || (abstractC28841e0 instanceof C28865w) || (abstractC28841e0 instanceof C28823Q) || (abstractC28841e0 instanceof C28829X) || (abstractC28841e0 instanceof C28813G) || (abstractC28841e0 instanceof C28867y) || (abstractC28841e0 instanceof C28839d0) || (abstractC28841e0 instanceof C28846h) || (abstractC28841e0 instanceof C28815I)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
