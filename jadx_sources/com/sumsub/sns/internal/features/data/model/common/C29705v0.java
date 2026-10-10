package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.internal.features.data.model.common.remote.C29237K;
import com.tencent.bugly.proguard.C33844oi;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29705v0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static AbstractC29028M0 m69909a(String str) {
        List listSplit$default;
        if (str != null && (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null)) != null) {
            if (listSplit$default.size() != 1) {
                if (listSplit$default.size() == 2) {
                    String str2 = (String) listSplit$default.get(0);
                    String str3 = (String) listSplit$default.get(1);
                    switch (str2.hashCode()) {
                        case -232128810:
                            if (str2.equals("max_value")) {
                                Double doubleOrNull = StringsKt.toDoubleOrNull(str3);
                                return new C28981B0(doubleOrNull != null ? doubleOrNull.doubleValue() : Double.MAX_VALUE);
                            }
                            break;
                        case -216634360:
                            if (str2.equals("between")) {
                                List listSplit$default2 = StringsKt.split$default((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null);
                                Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) listSplit$default2.get(0));
                                double dDoubleValue = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : Double.MIN_VALUE;
                                Double doubleOrNull3 = StringsKt.toDoubleOrNull((String) listSplit$default2.get(1));
                                return new C29695t0(new C29237K(dDoubleValue, doubleOrNull3 != null ? doubleOrNull3.doubleValue() : Double.MAX_VALUE));
                            }
                            break;
                        case 107876:
                            if (str2.equals("max")) {
                                Integer intOrNull = StringsKt.toIntOrNull(str3);
                                return new C29725z0(intOrNull != null ? intOrNull.intValue() : Integer.MAX_VALUE);
                            }
                            break;
                        case 108114:
                            if (str2.equals("min")) {
                                Integer intOrNull2 = StringsKt.toIntOrNull(str3);
                                return new C28991D0(intOrNull2 != null ? intOrNull2.intValue() : Integer.MIN_VALUE);
                            }
                            break;
                        case 108392519:
                            if (str2.equals("regex")) {
                                return new C29016J0(str3);
                            }
                            break;
                        case 540349764:
                            if (str2.equals("min_value")) {
                                Double doubleOrNull4 = StringsKt.toDoubleOrNull(str3);
                                return new C29000F0(doubleOrNull4 != null ? doubleOrNull4.doubleValue() : Double.MIN_VALUE);
                            }
                            break;
                    }
                }
            } else {
                String str4 = (String) listSplit$default.get(0);
                switch (str4.hashCode()) {
                    case -2000413939:
                        if (str4.equals("numeric")) {
                            return C29008H0.f58953a;
                        }
                        return null;
                    case -1626286546:
                        if (str4.equals("alpha_spaces")) {
                            return C29161n0.f59157a;
                        }
                        return null;
                    case -59614510:
                        if (str4.equals("validPhone")) {
                            return C29024L0.f58966a;
                        }
                        return null;
                    case 96619420:
                        if (str4.equals("email")) {
                            return C29173p0.f59173a;
                        }
                        return null;
                    case 572016716:
                        if (str4.equals("android_tetxt_cap_words")) {
                            return C29183r0.f59181a;
                        }
                        return null;
                    default:
                        return null;
                }
            }
        }
        return null;
    }

    @NotNull
    public final InterfaceC44951d<AbstractC29028M0> serializer() {
        return C29700u0.f59764a;
    }
}
