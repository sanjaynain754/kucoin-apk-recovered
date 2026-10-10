package com.sumsub.sns.core.widget.autocompletePhone;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.SNSFlagView;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.internal.core.presentation.widget.autocompletePhone.util.AbstractC28974a;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.presentation.country.AbstractC30878c;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import com.sumsub.sns.internal.features.presentation.country.picker.CountryPickerDialog;
import com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\"\u0010\t\u001a\u001e\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\b\u0012\u00060\u0005j\u0002`\u0007\u0018\u00010\u0004j\u0004\u0018\u0001`\b\u0012\u001e\u0010\f\u001a\u001a\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\"\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;", "Lcom/sumsub/sns/core/widget/PhoneKit;", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "input", "", "", "Lcom/sumsub/sns/internal/features/data/model/common/CountryCode;", "Lcom/sumsub/sns/internal/features/data/model/common/CountryName;", "Lcom/sumsub/sns/internal/features/data/model/common/CountryCodeToNameMap;", "countries", "Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;", "Lcom/sumsub/sns/internal/features/data/model/common/PhoneCountryCodeWithMasks;", "phoneMasks", "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "validListener", "", "initialValue", "<init>", "(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)V", "number", "", "validate", "(Ljava/lang/CharSequence;)Z", "Lcom/sumsub/sns/internal/features/presentation/country/b;", "country", "isUser", "", "setCountry", "(Lcom/sumsub/sns/internal/features/presentation/country/b;Z)V", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "value", "Lcom/sumsub/sns/internal/features/presentation/country/b;", "getCountry", "()Lcom/sumsub/sns/internal/features/presentation/country/b;", "mask", "Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;", "getMask", "()Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;", "manuallySelectedCountryKey", "Ljava/lang/String;", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "getEditText", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "editText", "isValid", "()Z", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPhoneNumberKitV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberKitV2.kt\ncom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n126#2:180\n153#2,2:181\n155#2:194\n1056#3:183\n1563#3:184\n1634#3,2:185\n1636#3:193\n1056#3:195\n1374#3:196\n1460#3,5:197\n1068#3:202\n434#4:187\n507#4,5:188\n65#5,16:203\n93#5,3:219\n1#6:222\n*S KotlinDebug\n*F\n+ 1 PhoneNumberKitV2.kt\ncom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2\n*L\n48#1:180\n48#1:181,2\n48#1:194\n50#1:183\n51#1:184\n51#1:185,2\n51#1:193\n86#1:195\n87#1:196\n87#1:197,5\n124#1:202\n64#1:187\n64#1:188,5\n145#1:203,16\n145#1:219,3\n*E\n"})
public final class PhoneNumberKitV2 extends PhoneKit {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private C30877b country;

    @Nullable
    private final SNSFlaggedInputLayout input;

    @Nullable
    private String manuallySelectedCountryKey;

    @Nullable
    private C29405l0 mask;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$Companion;", "", "<init>", "()V", "MAX_PHONE_LENGTH", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0186  */
    public PhoneNumberKitV2(@Nullable SNSFlaggedInputLayout sNSFlaggedInputLayout, @Nullable final Map<String, String> map, @Nullable Map<String, C29405l0> map2, @Nullable final ValidationListener validationListener, @Nullable CharSequence charSequence) {
        final List<SNSTextInputEditText.Mask> mutableList;
        LinearLayout flagTouchInterceptor;
        String str;
        super(map, map2, validationListener);
        this.input = sNSFlaggedInputLayout;
        final HashMap map3 = new HashMap();
        final HashMap map4 = new HashMap();
        if (map2 != null) {
            ArrayList arrayList = new ArrayList(map2.size());
            Iterator<Map.Entry<String, C29405l0>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, C29405l0> next = it.next();
                List<String> listSortedWith = CollectionsKt.sortedWith(next.getValue().f59410b, new Comparator() { // from class: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2$_init_$lambda$8$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        String str2 = (String) t11;
                        int i11 = 0;
                        for (int i12 = 0; i12 < str2.length(); i12++) {
                            if (Character.isDigit(str2.charAt(i12))) {
                                i11++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i11);
                        String str3 = (String) t12;
                        int i13 = 0;
                        for (int i14 = 0; i14 < str3.length(); i14++) {
                            if (Character.isDigit(str3.charAt(i14))) {
                                i13++;
                            }
                        }
                        return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i13));
                    }
                });
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                for (String str2 : listSortedWith) {
                    String str3 = next.getValue().f59409a;
                    SNSTextInputEditText.Mask mask = new SNSTextInputEditText.Mask("+ " + str3 + C33627eb.f69716f + str2, true, false, false, new C30877b(next.getKey(), (map == null || (str = map.get(next.getKey())) == null) ? "" : str), 12, null);
                    StringBuilder sb2 = new StringBuilder();
                    int length = str2.length();
                    int i11 = 0;
                    while (i11 < length) {
                        Iterator<Map.Entry<String, C29405l0>> it2 = it;
                        char cCharAt = str2.charAt(i11);
                        if (Character.isDigit(cCharAt)) {
                            sb2.append(cCharAt);
                        }
                        i11++;
                        it = it2;
                    }
                    Iterator<Map.Entry<String, C29405l0>> it3 = it;
                    String strReplace$default = StringsKt.replace$default(str3 + sb2.toString(), C33627eb.f69716f, "", false, 4, (Object) null);
                    ArrayList arrayList3 = (ArrayList) map3.get(strReplace$default);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map3.put(strReplace$default, arrayList3);
                    }
                    arrayList3.add(mask);
                    if (str3 != null) {
                        ArrayList arrayList4 = (ArrayList) map4.get(next.getKey());
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map4.put(next.getKey(), arrayList4);
                        }
                        arrayList4.add(mask);
                    }
                    arrayList2.add(mask);
                    it = it3;
                }
                arrayList.add(TuplesKt.m90091to(next.getValue().f59409a, arrayList2));
                it = it;
            }
            List listSortedWith2 = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return ComparisonsKt.compareValues((String) ((Pair) t11).getFirst(), (String) ((Pair) t12).getFirst());
                }
            });
            if (listSortedWith2 != null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = listSortedWith2.iterator();
                while (it4.hasNext()) {
                    CollectionsKt.addAll(arrayList5, (Iterable) ((Pair) it4.next()).getSecond());
                }
                mutableList = CollectionsKt.toMutableList((Collection) arrayList5);
                if (mutableList != null) {
                    mutableList.add(0, new SNSTextInputEditText.Mask("+ ", false, false, false, null, 16, null));
                } else {
                    mutableList = null;
                }
            } else {
                mutableList = null;
            }
        } else {
            mutableList = null;
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayout2 = this.input;
        if (sNSFlaggedInputLayout2 != null && (flagTouchInterceptor = sNSFlaggedInputLayout2.getFlagTouchInterceptor()) != null) {
            flagTouchInterceptor.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.autocompletePhone.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PhoneNumberKitV2._init_$lambda$12(map, mutableList, this, view);
                }
            });
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayout3 = this.input;
        if (sNSFlaggedInputLayout3 != null) {
            sNSFlaggedInputLayout3.setFlagDropDownVisible(true);
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayout4 = this.input;
        if (sNSFlaggedInputLayout4 != null) {
            sNSFlaggedInputLayout4.setStartIconVisible(false);
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayout5 = this.input;
        if (sNSFlaggedInputLayout5 != null) {
            sNSFlaggedInputLayout5.setStartIconCheckable(false);
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayout6 = this.input;
        if (sNSFlaggedInputLayout6 != null) {
            sNSFlaggedInputLayout6.setStartIconTintList(null);
        }
        final List listSortedWith3 = CollectionsKt.sortedWith(map3.keySet(), new Comparator() { // from class: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.compareValues(Integer.valueOf(((String) t12).length()), Integer.valueOf(((String) t11).length()));
            }
        });
        SNSTextInputEditText editText = getEditText();
        if (editText != null) {
            editText.setMaskListener(new SNSTextInputEditText.MaskListener() { // from class: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2.2
                @Override // com.sumsub.sns.core.widget.SNSTextInputEditText.MaskListener
                public void onMaskChanged(SNSTextInputEditText.Mask newMask) {
                    Object payload = newMask != null ? newMask.getPayload() : null;
                    PhoneNumberKitV2.this.setCountry(payload instanceof C30877b ? (C30877b) payload : null, false);
                }

                @Override // com.sumsub.sns.core.widget.SNSTextInputEditText.MaskListener
                public List<SNSTextInputEditText.Mask> preFilterMasks(CharSequence raw) {
                    Object obj = null;
                    if (StringsKt.isBlank(raw)) {
                        PhoneNumberKitV2.this.manuallySelectedCountryKey = null;
                    }
                    if (PhoneNumberKitV2.this.manuallySelectedCountryKey != null) {
                        return map4.get(PhoneNumberKitV2.this.manuallySelectedCountryKey);
                    }
                    for (Object obj2 : listSortedWith3) {
                        if (StringsKt.startsWith$default(raw, (CharSequence) obj2, false, 2, (Object) null)) {
                            obj = obj2;
                            break;
                        }
                    }
                    return map3.get((String) obj);
                }
            });
        }
        SNSTextInputEditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.setMaxLength(15);
        }
        SNSTextInputEditText editText3 = getEditText();
        if (editText3 != null) {
            editText3.setMasks(mutableList);
        }
        SNSTextInputEditText editText4 = getEditText();
        if (editText4 != null) {
            editText4.updateInputType(3);
        }
        SNSTextInputEditText editText5 = getEditText();
        if (editText5 != null) {
            editText5.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2$special$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s11) {
                    SNSTextInputEditText editText6 = this.this$0.getEditText();
                    String rawText = editText6 != null ? editText6.getRawText() : null;
                    ValidationListener validationListener2 = validationListener;
                    if (validationListener2 != null) {
                        validationListener2.onValidate(this.this$0.isValid(), rawText != null ? StringsKt.isBlank(rawText) : false, rawText);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                }
            });
        }
        SNSTextInputEditText editText6 = getEditText();
        if (editText6 != null) {
            editText6.setText(charSequence);
        }
        SNSTextInputEditText editText7 = getEditText();
        if (editText7 != null) {
            Editable text = editText7.getText();
            editText7.setSelection(text != null ? text.length() : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$12(Map map, final List list, final PhoneNumberKitV2 phoneNumberKitV2, View view) {
        FragmentManager supportFragmentManager;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C30877b((String) entry.getKey(), (String) entry.getValue()));
        }
        Context context = view.getContext();
        InterfaceC30893e interfaceC30893e = new InterfaceC30893e() { // from class: com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2$1$1
            @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e
            public void onItemSelected(C30877b item) {
                SNSTextInputEditText.Mask mask;
                Editable text;
                Editable text2;
                C29405l0 c29405l0;
                String str;
                Object next;
                C30877b c30877b;
                List<SNSTextInputEditText.Mask> list2 = list;
                String strReplace$default = null;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            Object payload = ((SNSTextInputEditText.Mask) next).getPayload();
                            c30877b = payload instanceof C30877b ? (C30877b) payload : null;
                        }
                    } while (!Intrinsics.areEqual(c30877b != null ? c30877b.f62373a : null, item.f62373a));
                    mask = (SNSTextInputEditText.Mask) next;
                } else {
                    mask = null;
                }
                int length = 0;
                phoneNumberKitV2.setCountry(item, false);
                Object payload2 = mask != null ? mask.getPayload() : null;
                C30877b c30877b2 = payload2 instanceof C30877b ? (C30877b) payload2 : null;
                if (c30877b2 != null) {
                    PhoneNumberKitV2 phoneNumberKitV3 = phoneNumberKitV2;
                    Map phoneMasks = phoneNumberKitV3.getPhoneMasks();
                    if (phoneMasks != null && (c29405l0 = (C29405l0) phoneMasks.get(c30877b2.f62373a)) != null && (str = c29405l0.f59409a) != null) {
                        strReplace$default = StringsKt.replace$default(str, C33627eb.f69716f, "", false, 4, (Object) null);
                    }
                    SNSTextInputEditText editText = phoneNumberKitV3.getEditText();
                    if (editText != null && (text2 = editText.getText()) != null) {
                        text2.clear();
                    }
                    phoneNumberKitV3.manuallySelectedCountryKey = item.f62373a;
                    SNSTextInputEditText editText2 = phoneNumberKitV3.getEditText();
                    if (editText2 != null) {
                        editText2.setText(strReplace$default);
                    }
                    SNSTextInputEditText editText3 = phoneNumberKitV3.getEditText();
                    if (editText3 != null) {
                        SNSTextInputEditText editText4 = phoneNumberKitV3.getEditText();
                        if (editText4 != null && (text = editText4.getText()) != null) {
                            length = text.length();
                        }
                        editText3.setSelection(length);
                    }
                }
            }

            @Override // com.sumsub.sns.internal.features.presentation.country.picker.InterfaceC30893e
            public void onDismiss() {
            }
        };
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || supportFragmentManager.findFragmentByTag("CountryPickerDialog") != null) {
            return;
        }
        int i11 = CountryPickerDialog.f62384U;
        Set setEmptySet = SetsKt.emptySet();
        CountryPickerDialog countryPickerDialog = new CountryPickerDialog();
        countryPickerDialog.f62386c = interfaceC30893e;
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_selection_mode", CountryPickerDialog.SelectionMode.SINGLE);
        bundle.putParcelableArray("extra_items", (Parcelable[]) arrayList.toArray(new C30877b[0]));
        bundle.putParcelableArray("extra_preselected_items", (Parcelable[]) setEmptySet.toArray(new C30877b[0]));
        bundle.putBoolean("extra_sort", true);
        countryPickerDialog.setArguments(bundle);
        countryPickerDialog.show(supportFragmentManager, "CountryPickerDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SNSTextInputEditText getEditText() {
        SNSFlaggedInputLayout sNSFlaggedInputLayout = this.input;
        EditText editText = sNSFlaggedInputLayout != null ? sNSFlaggedInputLayout.getEditText() : null;
        if (editText instanceof SNSTextInputEditText) {
            return (SNSTextInputEditText) editText;
        }
        return null;
    }

    private final boolean validate(CharSequence number) {
        String string;
        if (number == null || (string = number.toString()) == null) {
            return false;
        }
        return AbstractC28974a.m69714a(string);
    }

    @Override // com.sumsub.sns.core.widget.PhoneKit
    @Nullable
    public C30877b getCountry() {
        return this.country;
    }

    @Override // com.sumsub.sns.core.widget.PhoneKit
    @Nullable
    public C29405l0 getMask() {
        return this.mask;
    }

    @Override // com.sumsub.sns.core.widget.PhoneKit
    public boolean isValid() {
        String rawText;
        SNSTextInputEditText editText = getEditText();
        if (editText != null) {
            rawText = editText.getRawText();
        } else {
            rawText = null;
        }
        boolean zValidate = validate(rawText);
        if (!zValidate) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, "SNSPhoneNumberKit", "valid=" + zValidate, null, 4, null);
        }
        return zValidate;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    public void setCountry(@Nullable C30877b country, boolean isUser) {
        Context context;
        SNSFlaggedInputLayout sNSFlaggedInputLayout;
        SNSFlagView flagView;
        Map<String, C29405l0> phoneMasks;
        Unit unit;
        SNSFlaggedInputLayout sNSFlaggedInputLayout2;
        SNSFlagView flagView2;
        SNSTextInputEditText editText = getEditText();
        if (editText != null && (context = editText.getContext()) != null) {
            C29405l0 c29405l0 = null;
            if (country != null) {
                Drawable drawableM70503a = AbstractC30878c.m70503a(country, context);
                if (drawableM70503a != null && (sNSFlaggedInputLayout2 = this.input) != null && (flagView2 = sNSFlaggedInputLayout2.getFlagView()) != null) {
                    flagView2.setImageDrawable(drawableM70503a);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    sNSFlaggedInputLayout = this.input;
                    if (sNSFlaggedInputLayout != null) {
                        flagView.setImageDrawable(ResourcesCompat.getDrawable(flagView.getResources(), R$drawable.sns_ic_flag_placeholder, flagView.getContext().getTheme()));
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } else {
                sNSFlaggedInputLayout = this.input;
                if (sNSFlaggedInputLayout != null && (flagView = sNSFlaggedInputLayout.getFlagView()) != null) {
                    flagView.setImageDrawable(ResourcesCompat.getDrawable(flagView.getResources(), R$drawable.sns_ic_flag_placeholder, flagView.getContext().getTheme()));
                    Unit unit3 = Unit.INSTANCE;
                }
            }
            this.country = country;
            if (country != null && (phoneMasks = getPhoneMasks()) != null) {
                c29405l0 = phoneMasks.get(country.f62373a);
            }
            this.mask = c29405l0;
        }
    }
}
