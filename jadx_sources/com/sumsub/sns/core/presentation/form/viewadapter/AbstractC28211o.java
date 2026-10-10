package com.sumsub.sns.core.presentation.form.viewadapter;

import android.content.Context;
import android.text.Spanned;
import android.widget.EditText;
import com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c;
import com.sumsub.sns.core.presentation.form.C28167d;
import com.sumsub.sns.core.presentation.form.InterfaceC28164a;
import com.sumsub.sns.core.presentation.form.viewutils.AbstractC28230a;
import com.sumsub.sns.core.presentation.form.viewutils.AbstractC28231b;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBoolFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataCalendarFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataDateTimeFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMultipleCountrySelectionFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28807A;
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
import com.sumsub.sns.internal.core.presentation.util.AbstractC28967a;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29028M0;
import com.sumsub.sns.internal.features.data.model.common.C28981B0;
import com.sumsub.sns.internal.features.data.model.common.C29695t0;
import com.sumsub.sns.internal.features.data.model.common.C29705v0;
import com.sumsub.sns.internal.features.data.model.common.C29724z;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29494N;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.viewadapter.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28211o extends AbstractC28091c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28164a f57497a;

    /* JADX INFO: renamed from: b */
    public final C28167d f57498b;

    /* JADX INFO: renamed from: c */
    public final SNSApplicantDataBaseFieldView f57499c;

    /* JADX INFO: renamed from: a */
    public void mo69144a() {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo69125a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0, int i11);

    @Override // com.sumsub.sns.core.presentation.base.adapter.AbstractC28091c
    /* JADX INFO: renamed from: a */
    public final void mo69072a(Object obj, int i11) {
        AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) obj;
        this.f57499c.reset();
        mo69125a(this.f57499c, abstractC28841e0, i11);
        m69148a(this.f57499c, abstractC28841e0);
    }

    public AbstractC28211o(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, InterfaceC28164a interfaceC28164a, C28167d c28167d) {
        super(sNSApplicantDataBaseFieldView);
        this.f57497a = interfaceC28164a;
        this.f57498b = c28167d;
        this.f57499c = sNSApplicantDataBaseFieldView;
    }

    /* JADX INFO: renamed from: b */
    public void mo69129b(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, AbstractC28841e0 abstractC28841e0) {
        EditText editText;
        C29470F c29470fMo69642c = abstractC28841e0.mo69642c();
        C29705v0 c29705v0 = AbstractC29028M0.Companion;
        String str = c29470fMo69642c.f59471f;
        c29705v0.getClass();
        AbstractC29028M0 abstractC29028M0M69909a = C29705v0.m69909a(str);
        if (abstractC29028M0M69909a != null && (editText = sNSApplicantDataBaseFieldView.getEditText()) != null) {
            AbstractC28967a.m69710a(editText, abstractC29028M0M69909a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m69148a(SNSApplicantDataBaseFieldView sNSApplicantDataBaseFieldView, final AbstractC28841e0 abstractC28841e0) {
        CharSequence charSequenceM69380a;
        int iRoundToInt;
        C28807A c28807a;
        Object next;
        Object next2;
        C29724z c29724z;
        String strM69098a;
        String str;
        Object next3;
        Object next4;
        Date date;
        Date date2;
        Spanned spannedM69364a;
        Context context = sNSApplicantDataBaseFieldView.getContext();
        C29470F c29470fMo69642c = abstractC28841e0.mo69642c();
        String str2 = c29470fMo69642c.f59467b;
        String str3 = "";
        if (str2 == null || (spannedM69364a = AbstractC28462i0.m69364a(str2, context)) == null || (charSequenceM69380a = AbstractC28485q.m69380a(spannedM69364a, context, Intrinsics.areEqual(abstractC28841e0.mo69642c().f59470e, Boolean.TRUE))) == null) {
            charSequenceM69380a = "";
        }
        sNSApplicantDataBaseFieldView.setLabel(charSequenceM69380a);
        String str4 = c29470fMo69642c.f59468c;
        sNSApplicantDataBaseFieldView.setExample(str4 != null ? AbstractC28462i0.m69364a(str4, context) : null);
        sNSApplicantDataBaseFieldView.setEnabled(abstractC28841e0.mo69649h());
        sNSApplicantDataBaseFieldView.setHint(c29470fMo69642c.f59472g);
        sNSApplicantDataBaseFieldView.setOnLinkClicked(new Function1() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28211o.m69147a(this.f57483b, abstractC28841e0, (String) obj);
            }
        });
        C28167d c28167d = this.f57498b;
        if (!(abstractC28841e0 instanceof C28831Z) && !(abstractC28841e0 instanceof C28835b0)) {
            if (abstractC28841e0 instanceof C28854l) {
                SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataBoolFieldView ? (SNSApplicantDataBoolFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataBoolFieldView != null) {
                    String strM69098a2 = c28167d.m69098a(abstractC28841e0);
                    sNSApplicantDataBoolFieldView.setChecked(strM69098a2 != null ? Boolean.parseBoolean(strM69098a2) : false);
                }
            } else if (abstractC28841e0 instanceof C28861s) {
                SNSApplicantDataCalendarFieldView sNSApplicantDataCalendarFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataCalendarFieldView ? (SNSApplicantDataCalendarFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataCalendarFieldView != null) {
                    String strM69098a3 = c28167d.m69098a(abstractC28841e0);
                    SimpleDateFormat simpleDateFormat = AbstractC28231b.f57527a;
                    if (strM69098a3 != null) {
                        try {
                            date2 = AbstractC28231b.f57527a.parse(strM69098a3);
                        } catch (Exception unused) {
                            date2 = null;
                        }
                    } else {
                        date2 = null;
                    }
                    sNSApplicantDataCalendarFieldView.setSelectedDate(date2);
                }
            } else if (abstractC28841e0 instanceof C28863u) {
                SNSApplicantDataDateTimeFieldView sNSApplicantDataDateTimeFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataDateTimeFieldView ? (SNSApplicantDataDateTimeFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataDateTimeFieldView != null) {
                    String strM69098a4 = c28167d.m69098a(abstractC28841e0);
                    SimpleDateFormat simpleDateFormat2 = AbstractC28230a.f57526a;
                    if (strM69098a4 != null) {
                        try {
                            date = AbstractC28230a.f57526a.parse(strM69098a4);
                        } catch (Exception unused2) {
                            date = null;
                        }
                    } else {
                        date = null;
                    }
                    sNSApplicantDataDateTimeFieldView.setSelectedDate(date);
                }
            } else if (abstractC28841e0 instanceof C28825T) {
                SNSApplicantDataRadioGroupView sNSApplicantDataRadioGroupView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataRadioGroupView ? (SNSApplicantDataRadioGroupView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataRadioGroupView != null) {
                    String strM69098a5 = c28167d.m69098a(abstractC28841e0);
                    Iterator<T> it = sNSApplicantDataRadioGroupView.getItems().iterator();
                    do {
                        if (!it.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it.next();
                    } while (!Intrinsics.areEqual(((C29724z) next4).f59791a, strM69098a5));
                    sNSApplicantDataRadioGroupView.setSelectedItem((C29724z) next4);
                }
            } else if (abstractC28841e0 instanceof C28827V) {
                SNSApplicantDataSelectionFieldView sNSApplicantDataSelectionFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionFieldView ? (SNSApplicantDataSelectionFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataSelectionFieldView != null) {
                    String strM69098a6 = c28167d.m69098a(abstractC28841e0);
                    Iterator<T> it2 = sNSApplicantDataSelectionFieldView.getItems().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it2.next();
                    } while (!Intrinsics.areEqual(((C29724z) next3).f59791a, strM69098a6));
                    C29724z c29724z2 = (C29724z) next3;
                    if (c29724z2 != null) {
                        sNSApplicantDataSelectionFieldView.setSelectedItem(c29724z2);
                    } else {
                        sNSApplicantDataSelectionFieldView.setValue(strM69098a6 != null ? strM69098a6 : "");
                    }
                }
            } else if (abstractC28841e0 instanceof C28859q) {
                SNSApplicantDataSelectionCountryFieldView sNSApplicantDataSelectionCountryFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataSelectionCountryFieldView ? (SNSApplicantDataSelectionCountryFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataSelectionCountryFieldView != null) {
                    String strM69098a7 = c28167d.m69098a(abstractC28841e0);
                    Map map = ((C28859q) abstractC28841e0).f58691f;
                    if (strM69098a7 != null && (str = (String) map.get(strM69098a7)) != null) {
                        str3 = str;
                    }
                    sNSApplicantDataSelectionCountryFieldView.setValue(str3);
                }
            } else if (abstractC28841e0 instanceof C28821O) {
                SNSApplicantDataPhoneFieldView sNSApplicantDataPhoneFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataPhoneFieldView ? (SNSApplicantDataPhoneFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataPhoneFieldView != null) {
                    C28821O c28821o = (C28821O) abstractC28841e0;
                    if (!c28821o.f58618f.isEmpty() && (strM69098a = c28167d.m69098a(c28821o)) != null) {
                        str3 = strM69098a;
                    }
                    sNSApplicantDataPhoneFieldView.setValue(str3);
                }
            } else if (abstractC28841e0 instanceof C28809C) {
                SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataFileFieldView ? (SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataFileFieldView != null) {
                    C28809C c28809c = (C28809C) abstractC28841e0;
                    String strM69098a8 = c28167d.m69098a(abstractC28841e0);
                    if (strM69098a8 != null) {
                        sNSApplicantDataFileFieldView.setFiles(CollectionsKt.listOf(new SNSApplicantDataFileFieldView.Attachment(strM69098a8, c28809c.f58587m, c28809c.f58586l, c28809c.f58584j)));
                    }
                    if (c28809c.f58580f == null) {
                        sNSApplicantDataFileFieldView.setFiles(CollectionsKt.emptyList());
                    }
                    sNSApplicantDataFileFieldView.setShowPickFile(sNSApplicantDataFileFieldView.getFiles().isEmpty());
                }
            } else if (abstractC28841e0 instanceof C28819M) {
                SNSApplicantDataMutilselectFieldView sNSApplicantDataMutilselectFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataMutilselectFieldView ? (SNSApplicantDataMutilselectFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataMutilselectFieldView != null) {
                    List<String> listM69099b = c28167d.m69099b(abstractC28841e0);
                    List list = ((C28819M) abstractC28841e0).f58608d.f59474i;
                    if (list != null && listM69099b != null) {
                        ArrayList arrayList = new ArrayList();
                        for (String str5 : listM69099b) {
                            Iterator it3 = list.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                            } while (!Intrinsics.areEqual(str5, ((C29494N) next2).f59517a));
                            C29494N c29494n = (C29494N) next2;
                            if (c29494n != null) {
                                String str6 = c29494n.f59517a;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                String str7 = c29494n.f59518b;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                c29724z = new C29724z(str6, str7, c29494n.f59519c);
                            } else {
                                c29724z = null;
                            }
                            if (c29724z != null) {
                                arrayList.add(c29724z);
                            }
                        }
                        sNSApplicantDataMutilselectFieldView.setSelectedItems(arrayList);
                    }
                }
            } else if (abstractC28841e0 instanceof C28817K) {
                SNSApplicantDataFileFieldView sNSApplicantDataFileFieldView2 = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataFileFieldView ? (SNSApplicantDataFileFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataFileFieldView2 != null) {
                    C28817K c28817k = (C28817K) abstractC28841e0;
                    List listM69099b2 = c28167d.m69099b(abstractC28841e0);
                    if (listM69099b2 != null) {
                        List<String> list2 = !listM69099b2.isEmpty() ? listM69099b2 : null;
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            for (String str8 : list2) {
                                String str9 = c28817k.f58606n;
                                Map map2 = c28817k.f58605m;
                                String str10 = map2 != null ? (String) map2.get(str8) : null;
                                List list3 = c28817k.f58603k;
                                if (list3 != null) {
                                    Iterator it4 = list3.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it4.next();
                                    } while (!Intrinsics.areEqual(((C28807A) next).f58576a, str8));
                                    c28807a = (C28807A) next;
                                } else {
                                    c28807a = null;
                                }
                                arrayList2.add(new SNSApplicantDataFileFieldView.Attachment(str8, str9, str10, c28807a));
                            }
                            sNSApplicantDataFileFieldView2.setFiles(arrayList2);
                        }
                    }
                    if (listM69099b2 == null) {
                        sNSApplicantDataFileFieldView2.setFiles(CollectionsKt.emptyList());
                    }
                    C29470F c29470f = c28817k.f58596d;
                    C29705v0 c29705v0 = AbstractC29028M0.Companion;
                    String str11 = c29470f.f59471f;
                    c29705v0.getClass();
                    AbstractC29028M0 abstractC29028M0M69909a = C29705v0.m69909a(str11);
                    if (abstractC29028M0M69909a instanceof C28981B0) {
                        iRoundToInt = MathKt.roundToInt(((C28981B0) abstractC29028M0M69909a).f58904a - ((double) sNSApplicantDataFileFieldView2.getFiles().size()));
                    } else {
                        iRoundToInt = abstractC29028M0M69909a instanceof C29695t0 ? MathKt.roundToInt(((C29695t0) abstractC29028M0M69909a).f59741a.f59230b - ((double) sNSApplicantDataFileFieldView2.getFiles().size())) : Integer.MAX_VALUE;
                    }
                    sNSApplicantDataFileFieldView2.setShowPickFile(iRoundToInt > 0);
                }
            } else if (abstractC28841e0 instanceof C28857o) {
                SNSApplicantDataMultipleCountrySelectionFieldView sNSApplicantDataMultipleCountrySelectionFieldView = sNSApplicantDataBaseFieldView instanceof SNSApplicantDataMultipleCountrySelectionFieldView ? (SNSApplicantDataMultipleCountrySelectionFieldView) sNSApplicantDataBaseFieldView : null;
                if (sNSApplicantDataMultipleCountrySelectionFieldView != null) {
                    C28857o c28857o = (C28857o) abstractC28841e0;
                    List<String> listM69099b3 = c28167d.m69099b(abstractC28841e0);
                    if (listM69099b3 == null) {
                        listM69099b3 = CollectionsKt.emptyList();
                    }
                    Map map3 = c28857o.f58685f;
                    ArrayList arrayList3 = new ArrayList();
                    for (String str12 : listM69099b3) {
                        String str13 = (String) map3.get(str12);
                        C30877b c30877b = str13 == null ? null : new C30877b(str12, str13);
                        if (c30877b != null) {
                            arrayList3.add(c30877b);
                        }
                    }
                    sNSApplicantDataMultipleCountrySelectionFieldView.setSelectedCountries(arrayList3);
                }
            } else if (!(abstractC28841e0 instanceof C28865w) && !(abstractC28841e0 instanceof C28811E) && !(abstractC28841e0 instanceof C28813G) && !(abstractC28841e0 instanceof C28867y) && !(abstractC28841e0 instanceof C28823Q) && !(abstractC28841e0 instanceof C28829X) && !(abstractC28841e0 instanceof C28839d0) && !(abstractC28841e0 instanceof C28846h) && !(abstractC28841e0 instanceof C28815I)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            EditText editText = sNSApplicantDataBaseFieldView.getEditText();
            if (editText != null) {
                editText.setText(c28167d.m69098a(abstractC28841e0));
            }
        }
        this.f57499c.setError(abstractC28841e0.mo69641b());
        String strMo69647e = abstractC28841e0.mo69647e();
        sNSApplicantDataBaseFieldView.setTitleIcon(strMo69647e != null ? C28468k0.f57983a.getIconHandler().onResolveIcon(context, strMo69647e) : null);
        sNSApplicantDataBaseFieldView.setOnTitleClickCallback(abstractC28841e0.mo69648i() ? new Function0() { // from class: com.sumsub.sns.core.presentation.form.viewadapter.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC28211o.m69146a(this.f57486b, abstractC28841e0);
            }
        } : null);
        mo69129b(sNSApplicantDataBaseFieldView, abstractC28841e0);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69147a(AbstractC28211o abstractC28211o, AbstractC28841e0 abstractC28841e0, String str) {
        InterfaceC28164a interfaceC28164a = abstractC28211o.f57497a;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69094b(abstractC28841e0, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69146a(AbstractC28211o abstractC28211o, AbstractC28841e0 abstractC28841e0) {
        InterfaceC28164a interfaceC28164a = abstractC28211o.f57497a;
        if (interfaceC28164a != null) {
            interfaceC28164a.mo69089a(abstractC28841e0);
        }
        return Unit.INSTANCE;
    }
}
