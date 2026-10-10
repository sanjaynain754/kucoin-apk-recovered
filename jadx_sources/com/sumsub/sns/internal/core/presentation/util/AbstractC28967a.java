package com.sumsub.sns.internal.core.presentation.util;

import android.telephony.PhoneNumberUtils;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29028M0;
import com.sumsub.sns.internal.features.data.model.common.C28981B0;
import com.sumsub.sns.internal.features.data.model.common.C28991D0;
import com.sumsub.sns.internal.features.data.model.common.C29000F0;
import com.sumsub.sns.internal.features.data.model.common.C29008H0;
import com.sumsub.sns.internal.features.data.model.common.C29016J0;
import com.sumsub.sns.internal.features.data.model.common.C29024L0;
import com.sumsub.sns.internal.features.data.model.common.C29161n0;
import com.sumsub.sns.internal.features.data.model.common.C29173p0;
import com.sumsub.sns.internal.features.data.model.common.C29183r0;
import com.sumsub.sns.internal.features.data.model.common.C29695t0;
import com.sumsub.sns.internal.features.data.model.common.C29715x0;
import com.sumsub.sns.internal.features.data.model.common.C29725z0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29237K;
import java.util.regex.Pattern;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.util.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28967a {
    /* JADX INFO: renamed from: a */
    public static final boolean m69711a(AbstractC29028M0 abstractC29028M0, String str) {
        if (abstractC29028M0 == null || str == null || StringsKt.isBlank(str)) {
            return true;
        }
        if (abstractC29028M0 instanceof C29161n0) {
            for (char c11 : str.toCharArray()) {
                if (!Character.isLetter(c11) && !Character.isSpaceChar(c11)) {
                    return false;
                }
            }
            return true;
        }
        if (abstractC29028M0 instanceof C29695t0) {
            C29237K c29237k = ((C29695t0) abstractC29028M0).f59741a;
            Double doubleOrNull = StringsKt.toDoubleOrNull(str);
            if (doubleOrNull != null) {
                return RangesKt.rangeTo(c29237k.f59229a, c29237k.f59230b).contains(doubleOrNull);
            }
            c29237k.getClass();
            return false;
        }
        if (abstractC29028M0 instanceof C29715x0) {
            return Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(str).matches();
        }
        if (abstractC29028M0 instanceof C28981B0) {
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(str);
            return (doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d) <= ((C28981B0) abstractC29028M0).f58904a;
        }
        if (abstractC29028M0 instanceof C29000F0) {
            Double doubleOrNull3 = StringsKt.toDoubleOrNull(str);
            return (doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d) >= ((C29000F0) abstractC29028M0).f58945a;
        }
        if (abstractC29028M0 instanceof C29008H0) {
            return TextUtils.isDigitsOnly(str);
        }
        if (abstractC29028M0 instanceof C29016J0) {
            return new Regex(((C29016J0) abstractC29028M0).f58959a).matches(str);
        }
        if (abstractC29028M0 instanceof C29024L0) {
            return PhoneNumberUtils.isGlobalPhoneNumber(str);
        }
        if (abstractC29028M0 instanceof C29725z0) {
            return str.length() <= ((C29725z0) abstractC29028M0).f59794a;
        }
        if (abstractC29028M0 instanceof C28991D0) {
            return str.length() >= ((C28991D0) abstractC29028M0).f58920a;
        }
        if (abstractC29028M0 instanceof C29183r0) {
            return true;
        }
        if (abstractC29028M0 instanceof C29173p0) {
            return Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(str).matches();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69710a(EditText editText, AbstractC29028M0 abstractC29028M0) {
        Integer num;
        if (abstractC29028M0 instanceof C29725z0) {
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(((C29725z0) abstractC29028M0).f59794a)});
            return;
        }
        if (!(abstractC29028M0 instanceof C28981B0) && !(abstractC29028M0 instanceof C29000F0) && !(abstractC29028M0 instanceof C29695t0)) {
            if (abstractC29028M0 instanceof C29008H0) {
                num = 2;
            } else if (abstractC29028M0 instanceof C29715x0) {
                num = 32;
            } else if (abstractC29028M0 instanceof C29183r0) {
                num = 8193;
            } else {
                num = abstractC29028M0 instanceof C29173p0 ? 32 : null;
            }
        } else {
            num = 8194;
        }
        if (num != null) {
            editText.setInputType(num.intValue());
        }
    }
}
