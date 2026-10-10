package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int areAllFieldsValid = 1;
    private static boolean getCurrencyIso4217Code;
    private static int getMediationNetwork;
    private static char[] getMonetizationNetwork;
    private static boolean getRevenue;

    @NonNull
    private static AFi1tSDK AFAdRevenueData(@NonNull AFi1ySDK aFi1ySDK, @Nullable String str, @NonNull String str2, @NonNull String str3) throws UnsupportedEncodingException {
        String string;
        if (str == null) {
            return new AFi1tSDK(aFi1ySDK.getMonetizationNetwork == AFh1dSDK.DEFAULT, AFi1xSDK.NA);
        }
        Object[] objArr = new Object[1];
        m5968a(null, "\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1ySDK.getMonetizationNetwork == AFh1dSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = AFAdRevenueData(new StringBuilder(str3).reverse().toString(), aFi1ySDK.getMediationNetwork, "android", "v1", string).equals(str);
        return new AFi1tSDK(zEquals, zEquals ? AFi1xSDK.SUCCESS : AFi1xSDK.FAILURE);
    }

    /* JADX INFO: renamed from: a */
    private static void m5968a(String str, String str2, int[] iArr, int i11, Object[] objArr) throws UnsupportedEncodingException {
        int length;
        char[] cArr;
        int i12;
        int i13 = $11 + 117;
        $10 = i13 % 128;
        Object bytes = str2;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr3 = getMonetizationNetwork;
        if (cArr3 != null) {
            int i14 = $10 + 9;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i12 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i12 = 0;
            }
            while (i12 < length) {
                cArr[i12] = (char) (((long) cArr3[i12]) ^ 1825820251896122634L);
                i12++;
            }
            $11 = ($10 + 71) % 128;
            cArr3 = cArr;
        }
        int i15 = (int) (1825820251896122634L ^ ((long) AFAdRevenueData));
        if (getRevenue) {
            int length2 = bArr.length;
            aFk1jSDK.getRevenue = length2;
            char[] cArr4 = new char[length2];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i16 = aFk1jSDK.getMonetizationNetwork;
                int i17 = aFk1jSDK.getRevenue;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    $10 = ($11 + 19) % 128;
                    cArr4[i16] = (char) (cArr3[bArr[(i17 - 1) - i16] + i11] - i15);
                    aFk1jSDK.getMonetizationNetwork = i16 + 1;
                }
            }
        } else if (getCurrencyIso4217Code) {
            int length3 = cArr2.length;
            aFk1jSDK.getRevenue = length3;
            char[] cArr5 = new char[length3];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i18 = aFk1jSDK.getMonetizationNetwork;
                int i19 = aFk1jSDK.getRevenue;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i18] = (char) (cArr3[cArr2[(i19 - 1) - i18] - i11] - i15);
                    aFk1jSDK.getMonetizationNetwork = i18 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1jSDK.getRevenue = length4;
            char[] cArr6 = new char[length4];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i21 = aFk1jSDK.getMonetizationNetwork;
                int i22 = aFk1jSDK.getRevenue;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i21] = (char) (cArr3[iArr[(i22 - 1) - i21] - i11] - i15);
                    aFk1jSDK.getMonetizationNetwork = i21 + 1;
                }
            }
        }
    }

    public static void getCurrencyIso4217Code() {
        getMonetizationNetwork = new char[]{36169, 36173, 36172, 36163, 36168, 36174, 36175, 36162, 36170, 36190, 36171, 36187, 36191};
        AFAdRevenueData = 1912311066;
        getCurrencyIso4217Code = true;
        getRevenue = true;
    }

    @NonNull
    public final AFi1tSDK getMonetizationNetwork(@NonNull AFi1ySDK aFi1ySDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        int i11 = getMediationNetwork;
        areAllFieldsValid = (i11 + 19) % 128;
        if (aFi1ySDK != null) {
            int i12 = (i11 + 17) % 128;
            areAllFieldsValid = i12;
            if (str2 != null && str3 != null) {
                getMediationNetwork = (i12 + 43) % 128;
                return AFAdRevenueData(aFi1ySDK, str, str2, str3);
            }
        }
        getMediationNetwork = (areAllFieldsValid + 59) % 128;
        return new AFi1tSDK(false, AFi1xSDK.INTERNAL_ERROR);
    }

    static {
        getCurrencyIso4217Code();
        ExpandableListView.getPackedPositionChild(0L);
        getMediationNetwork = (areAllFieldsValid + 75) % 128;
    }

    @VisibleForTesting
    private static String AFAdRevenueData(String str, String str2, String str3, String str4, String str5) {
        getMediationNetwork = (areAllFieldsValid + 45) % 128;
        String revenue = AFj1dSDK.getRevenue(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (revenue.length() < 12) {
            int i11 = getMediationNetwork + 69;
            areAllFieldsValid = i11 % 128;
            if (i11 % 2 != 0) {
                return revenue;
            }
            throw null;
        }
        return revenue.substring(0, 12);
    }
}
