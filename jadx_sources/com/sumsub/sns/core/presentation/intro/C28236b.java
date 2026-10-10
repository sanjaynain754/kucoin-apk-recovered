package com.sumsub.sns.core.presentation.intro;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSListItemView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextView;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.intro.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28236b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30000a f57530a;

    /* JADX INFO: renamed from: b */
    public final boolean f57531b = false;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28498u0 f57532c;

    public C28236b(InterfaceC30000a interfaceC30000a, InterfaceC28498u0 interfaceC28498u0) {
        this.f57530a = interfaceC30000a;
        this.f57532c = interfaceC28498u0;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0256  */
    /* JADX WARN: Code duplicated, block: B:201:0x0462  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:225:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:232:0x050a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0510  */
    /* JADX WARN: Code duplicated, block: B:237:0x051a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m69184a(C28236b c28236b, View view, Map map, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ViewGroup viewGroup;
        Object obj;
        String str;
        Object obj2;
        String str2;
        TextView textView;
        Button button;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i16;
        String str3;
        C28235a c28235a;
        int i17;
        Object obj3;
        Object objM69181a;
        Object objM69181a2;
        String value;
        ArrayList arrayList3;
        Object objM69182b;
        int i18 = 1;
        int i19 = R$id.sns_instructions_disclaimer;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Object obj4 = map.get("title");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        String str5 = "subtitle";
        Object obj5 = map.get("subtitle");
        String str6 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("contentBlocks");
        List list = obj6 instanceof List ? (List) obj6 : null;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_small);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_large);
        if (str6 == null) {
            dimensionPixelSize2 = dimensionPixelSize3;
        }
        int i21 = -1;
        if (str4 != null) {
            SNSTextView sNSTextViewM69187b = c28236b.m69187b(context, str4);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
            linearLayout.addView(sNSTextViewM69187b, marginLayoutParams);
        }
        if (str6 != null) {
            SNSTextView sNSTextViewM69186a = c28236b.m69186a(context, str6);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.bottomMargin = dimensionPixelSize3;
            linearLayout.addView(sNSTextViewM69186a, marginLayoutParams2);
        }
        if (list != null) {
            if (list.isEmpty()) {
                i13 = i19;
                i14 = -1;
                i15 = -2;
            } else {
                C28235a c28235a2 = new C28235a(c28236b.f57530a, c28236b.f57532c);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : list) {
                    if (obj7 instanceof Map) {
                        arrayList4.add(obj7);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i22 = 0;
                while (i22 < size) {
                    int i23 = i22 + 1;
                    Map map2 = (Map) arrayList4.get(i22);
                    Object obj8 = map2.get("type");
                    String str7 = str5;
                    String str8 = "image";
                    if (Intrinsics.areEqual(obj8, "image")) {
                        Object obj9 = map2.get("image");
                        String str9 = obj9 instanceof String ? (String) obj9 : null;
                        String str10 = str9 != null ? str9 : "";
                        arrayList = arrayList4;
                        i16 = size;
                        str3 = str7;
                        arrayList2 = arrayList5;
                        SNSImageView sNSImageView = new SNSImageView(context, null, 0, 0, 14, null);
                        sNSImageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(context, str10));
                        objM69182b = sNSImageView;
                    } else {
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        i16 = size;
                        str3 = str7;
                        if (Intrinsics.areEqual(obj8, "header")) {
                            Object obj10 = map2.get("header");
                            String str11 = obj10 instanceof String ? (String) obj10 : null;
                            if (str11 == null) {
                                Object obj11 = map2.get("text");
                                str11 = obj11 instanceof String ? (String) obj11 : null;
                                if (str11 == null) {
                                    str11 = "";
                                }
                            }
                            objM69182b = c28235a2.m69180a(context, str11);
                        } else {
                            if (Intrinsics.areEqual(obj8, "text")) {
                                Object obj12 = map2.get("text");
                                objM69182b = c28235a2.m69182b(context, obj12 instanceof String ? (String) obj12 : null);
                            } else if (Intrinsics.areEqual(obj8, "single")) {
                                Object obj13 = map2.get("image");
                                String str12 = obj13 instanceof String ? (String) obj13 : null;
                                String str13 = str12 == null ? "" : str12;
                                Object obj14 = map2.get("header");
                                String str14 = obj14 instanceof String ? (String) obj14 : null;
                                Object obj15 = map2.get("text");
                                String str15 = obj15 instanceof String ? (String) obj15 : null;
                                LinearLayout linearLayout2 = new LinearLayout(context);
                                linearLayout2.setOrientation(i18);
                                String str16 = str14;
                                String str17 = str15;
                                SNSImageView sNSImageView2 = new SNSImageView(context, null, 0, 0, 14, null);
                                sNSImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                C28468k0 c28468k0 = C28468k0.f57983a;
                                sNSImageView2.setImageDrawable(c28468k0.getIconHandler().onResolveIcon(context, str13));
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(i21, context.getResources().getDimensionPixelSize(R$dimen.sns_icon_size_huge));
                                marginLayoutParams3.bottomMargin = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium_plus);
                                Unit unit = Unit.INSTANCE;
                                linearLayout2.addView(sNSImageView2, marginLayoutParams3);
                                SNSH2TextView sNSH2TextView = new SNSH2TextView(context, null, 0, 0, 14, null);
                                sNSH2TextView.setText(str16 != null ? AbstractC28462i0.m69364a(str16, ((C28547d) c28235a2.f57528a).f58099a.f58163a) : null);
                                SNSJsonCustomization customization = c28468k0.getCustomization();
                                SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
                                C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
                                if (c28966p != null) {
                                    SNSMetricElement sNSMetricElement = SNSMetricElement.SCREEN_HEADER_ALIGNMENT;
                                    Map map3 = c28966p.f58878d;
                                    AbstractC28962j abstractC28962j = map3 != null ? (AbstractC28962j) map3.get(sNSMetricElement.getValue()) : null;
                                    C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
                                    value = c28960h != null ? c28960h.f58868a : null;
                                    if (value == null) {
                                        value = SNSThemeMetric$TextAlignment.CENTER.getValue();
                                    }
                                } else {
                                    value = SNSThemeMetric$TextAlignment.CENTER.getValue();
                                }
                                AbstractC28234b.m69177a(sNSH2TextView, value);
                                ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(i21, -2);
                                marginLayoutParams4.bottomMargin = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
                                linearLayout2.addView(sNSH2TextView, marginLayoutParams4);
                                SNSBodyTextView sNSBodyTextView = new SNSBodyTextView(context, null, 0, 0, 14, null);
                                sNSBodyTextView.setText(str17 != null ? AbstractC28462i0.m69364a(str17, ((C28547d) c28235a2.f57528a).f58099a.f58163a) : null);
                                ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(i21, -2);
                                Resources resources = context.getResources();
                                int i24 = R$dimen.sns_margin_small_plus;
                                marginLayoutParams5.topMargin = resources.getDimensionPixelSize(i24);
                                marginLayoutParams5.bottomMargin = context.getResources().getDimensionPixelSize(i24);
                                linearLayout2.addView(sNSBodyTextView, marginLayoutParams5);
                                i17 = i19;
                                obj3 = linearLayout2;
                                str5 = str3;
                                c28235a = c28235a2;
                            } else {
                                if (Intrinsics.areEqual(obj8, "do")) {
                                    Object obj16 = map2.get("image");
                                    String str18 = obj16 instanceof String ? (String) obj16 : null;
                                    if (str18 == null) {
                                        str18 = "";
                                    }
                                    Object obj17 = map2.get("header");
                                    String str19 = obj17 instanceof String ? (String) obj17 : null;
                                    Object obj18 = map2.get("text");
                                    String str20 = obj18 instanceof String ? (String) obj18 : null;
                                    C28235a c28235a3 = c28235a2;
                                    i17 = i19;
                                    c28235a = c28235a3;
                                    objM69181a2 = c28235a3.m69181a(context, str18, str19, str20, SNSStepState.APPROVED);
                                } else {
                                    C28235a c28235a4 = c28235a2;
                                    if (Intrinsics.areEqual(obj8, "dont")) {
                                        Object obj19 = map2.get("image");
                                        String str21 = obj19 instanceof String ? (String) obj19 : null;
                                        String str22 = str21 == null ? "" : str21;
                                        Object obj20 = map2.get("header");
                                        String str23 = obj20 instanceof String ? (String) obj20 : null;
                                        Object obj21 = map2.get("text");
                                        c28235a = c28235a4;
                                        objM69181a = c28235a4.m69181a(context, str22, str23, obj21 instanceof String ? (String) obj21 : null, SNSStepState.REJECTED);
                                        i17 = i19;
                                        str5 = str3;
                                        obj3 = objM69181a;
                                    } else {
                                        c28235a = c28235a4;
                                        if (Intrinsics.areEqual(obj8, "listItems")) {
                                            Object obj22 = map2.get("listItems");
                                            List list2 = obj22 instanceof List ? (List) obj22 : null;
                                            if (list2 != null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                for (Object obj23 : list2) {
                                                    if (obj23 instanceof Map) {
                                                        arrayList6.add(obj23);
                                                    }
                                                }
                                                LinearLayout linearLayout3 = new LinearLayout(context);
                                                boolean z11 = true;
                                                linearLayout3.setOrientation(1);
                                                ArrayList arrayList7 = new ArrayList();
                                                int size2 = arrayList6.size();
                                                int i25 = 0;
                                                while (i25 < size2) {
                                                    boolean z12 = z11;
                                                    Object obj24 = arrayList6.get(i25);
                                                    i25++;
                                                    if (obj24 instanceof Map) {
                                                        arrayList7.add(obj24);
                                                    }
                                                    z11 = z12;
                                                }
                                                int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_small_plus);
                                                int size3 = arrayList7.size() - 1;
                                                int size4 = arrayList7.size();
                                                int i26 = 0;
                                                int i27 = 0;
                                                while (i26 < size4) {
                                                    Object obj25 = arrayList7.get(i26);
                                                    int i28 = i26 + 1;
                                                    int i29 = i27 + 1;
                                                    if (i27 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Map map4 = (Map) obj25;
                                                    int i31 = i27 == size3 ? 0 : dimensionPixelSize4;
                                                    int i32 = size3;
                                                    int i33 = i31;
                                                    String str24 = str8;
                                                    ArrayList arrayList8 = arrayList7;
                                                    int i34 = size4;
                                                    int i35 = dimensionPixelSize4;
                                                    int i36 = i19;
                                                    SNSListItemView sNSListItemView = new SNSListItemView(context, null, 0, 0, 14, null);
                                                    SNSIconHandler iconHandler = C28468k0.f57983a.getIconHandler();
                                                    String str25 = (String) map4.get(str24);
                                                    if (str25 == null) {
                                                        str25 = "";
                                                    }
                                                    sNSListItemView.setIconStart(iconHandler.onResolveIcon(context, str25));
                                                    String str26 = (String) map4.get("title");
                                                    sNSListItemView.setTitle(str26 != null ? AbstractC28462i0.m69364a(str26, ((C28547d) c28235a.f57528a).f58099a.f58163a) : null);
                                                    String str27 = str3;
                                                    String str28 = (String) map4.get(str27);
                                                    sNSListItemView.setSubtitle(str28 != null ? AbstractC28462i0.m69364a(str28, ((C28547d) c28235a.f57528a).f58099a.f58163a) : null);
                                                    ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-1, -2);
                                                    marginLayoutParams6.bottomMargin = i33;
                                                    Unit unit2 = Unit.INSTANCE;
                                                    linearLayout3.addView(sNSListItemView, marginLayoutParams6);
                                                    str3 = str27;
                                                    str8 = str24;
                                                    i19 = i36;
                                                    i26 = i28;
                                                    i27 = i29;
                                                    size3 = i32;
                                                    arrayList7 = arrayList8;
                                                    size4 = i34;
                                                    dimensionPixelSize4 = i35;
                                                }
                                                i17 = i19;
                                                objM69181a2 = linearLayout3;
                                            }
                                        }
                                        i17 = i19;
                                        str5 = str3;
                                        obj3 = null;
                                    }
                                }
                                str5 = str3;
                                obj3 = objM69181a2;
                            }
                            arrayList3 = arrayList2;
                            if (obj3 != null) {
                                arrayList3.add(obj3);
                            }
                            i21 = -1;
                            i18 = 1;
                            arrayList5 = arrayList3;
                            c28235a2 = c28235a;
                            i22 = i23;
                            arrayList4 = arrayList;
                            size = i16;
                            i19 = i17;
                        }
                    }
                    c28235a = c28235a2;
                    objM69181a = objM69182b;
                    i17 = i19;
                    str5 = str3;
                    obj3 = objM69181a;
                    arrayList3 = arrayList2;
                    if (obj3 != null) {
                        arrayList3.add(obj3);
                    }
                    i21 = -1;
                    i18 = 1;
                    arrayList5 = arrayList3;
                    c28235a2 = c28235a;
                    i22 = i23;
                    arrayList4 = arrayList;
                    size = i16;
                    i19 = i17;
                }
                i13 = i19;
                ArrayList arrayList9 = arrayList5;
                int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_small_plus);
                int dimensionPixelSize6 = context.getResources().getDimensionPixelSize(R$dimen.sns_margin_large);
                int size5 = arrayList9.size() - 1;
                int size6 = arrayList9.size();
                int i37 = 0;
                int i38 = 0;
                while (i37 < size6) {
                    Object obj26 = arrayList9.get(i37);
                    i37++;
                    int i39 = i38 + 1;
                    if (i38 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    View view2 = (View) obj26;
                    int i41 = i38 == size5 ? 0 : view2 instanceof SNSImageView ? dimensionPixelSize6 : dimensionPixelSize5;
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams7.bottomMargin = i41;
                    linearLayout.addView(view2, marginLayoutParams7);
                    i38 = i39;
                }
                i15 = -2;
                i14 = -1;
            }
            viewGroup = (ViewGroup) view.findViewById(i11);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(linearLayout, new ViewGroup.MarginLayoutParams(i14, i15));
            }
            obj = map.get("actionTitle");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null && (button = (Button) view.findViewById(i12)) != null) {
                button.setText(str);
            }
            obj2 = map.get("disclaimer");
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            textView = (TextView) view.findViewById(i13);
            if (textView != null) {
                if (str2 == null && !StringsKt.isBlank(str2)) {
                    textView.setText(AbstractC28462i0.m69364a(str2, ((C28547d) c28236b.f57530a).f58099a.f58163a));
                    textView.setVisibility(0);
                    return;
                }
                textView.setVisibility(8);
            }
        }
        i13 = i19;
        i14 = -1;
        i15 = -2;
        viewGroup = (ViewGroup) view.findViewById(i11);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(linearLayout, new ViewGroup.MarginLayoutParams(i14, i15));
        }
        obj = map.get("actionTitle");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null) {
            button.setText(str);
        }
        obj2 = map.get("disclaimer");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        textView = (TextView) view.findViewById(i13);
        if (textView != null) {
            if (str2 == null) {
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX INFO: renamed from: b */
    public final SNSTextView m69187b(Context context, String str) {
        String value;
        SNSTextView sNSH1TextView = this.f57531b ? new SNSH1TextView(context, null, 0, 0, 14, null) : new SNSH2TextView(context, null, 0, 0, 14, null);
        sNSH1TextView.setText(AbstractC28462i0.m69364a(str, ((C28547d) this.f57530a).f58099a.f58163a));
        AbstractC28485q.m69381a(sNSH1TextView, new Function1() { // from class: com.sumsub.sns.core.presentation.intro.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28236b.m69185b(this.f57535b, (String) obj);
            }
        });
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.SCREEN_HEADER_ALIGNMENT;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
            value = c28960h != null ? c28960h.f58868a : null;
            if (value == null) {
                value = SNSThemeMetric$TextAlignment.CENTER.getValue();
            }
        } else {
            value = SNSThemeMetric$TextAlignment.CENTER.getValue();
        }
        AbstractC28234b.m69177a(sNSH1TextView, value);
        return sNSH1TextView;
    }

    public C28236b(InterfaceC30000a interfaceC30000a, InterfaceC28498u0 interfaceC28498u0, int i11) {
        this.f57530a = interfaceC30000a;
        this.f57532c = interfaceC28498u0;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m69185b(C28236b c28236b, String str) {
        InterfaceC28498u0 interfaceC28498u0 = c28236b.f57532c;
        if (interfaceC28498u0 != null) {
            ((SNSAppActivity) interfaceC28498u0).m70610a(str, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX INFO: renamed from: a */
    public final SNSTextView m69186a(Context context, String str) {
        SNSTextView sNSBodyTextView;
        String value;
        if (this.f57531b) {
            sNSBodyTextView = new SNSSubtitle2TextView(context, null, 0, 0, 14, null);
        } else {
            sNSBodyTextView = new SNSBodyTextView(context, null, 0, 0, 14, null);
        }
        sNSBodyTextView.setText(AbstractC28462i0.m69364a(str, ((C28547d) this.f57530a).f58099a.f58163a));
        AbstractC28485q.m69381a(sNSBodyTextView, new Function1() { // from class: com.sumsub.sns.core.presentation.intro.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28236b.m69183a(this.f57536b, (String) obj);
            }
        });
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.SCREEN_HEADER_ALIGNMENT;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
            value = c28960h != null ? c28960h.f58868a : null;
            if (value == null) {
                value = SNSThemeMetric$TextAlignment.CENTER.getValue();
            }
        } else {
            value = SNSThemeMetric$TextAlignment.CENTER.getValue();
        }
        AbstractC28234b.m69177a(sNSBodyTextView, value);
        return sNSBodyTextView;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69183a(C28236b c28236b, String str) {
        InterfaceC28498u0 interfaceC28498u0 = c28236b.f57532c;
        if (interfaceC28498u0 != null) {
            ((SNSAppActivity) interfaceC28498u0).m70610a(str, true);
        }
        return Unit.INSTANCE;
    }
}
