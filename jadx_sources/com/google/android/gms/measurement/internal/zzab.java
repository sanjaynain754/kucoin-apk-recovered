package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
abstract class zzab {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    private static Boolean zzd(String str, int i11, boolean z11, String str2, List list, String str3, zzgt zzgtVar) {
        if (i11 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z11 && i11 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i11 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z11 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzgtVar != null) {
                        zzgtVar.zze().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();

    @VisibleForTesting
    public static Boolean zze(Boolean bool, boolean z11) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z11);
    }

    public static Boolean zzg(long j11, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        try {
            return zzj(new BigDecimal(j11), zzflVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzh(double d11, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        try {
            return zzj(new BigDecimal(d11), zzflVar, Math.ulp(d11));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public zzab(String str, int i11) {
        this.zzb = str;
        this.zzc = i11;
    }

    @VisibleForTesting
    public static Boolean zzf(String str, com.google.android.gms.internal.measurement.zzfr zzfrVar, zzgt zzgtVar) {
        String strZzc;
        List list;
        String str2;
        Preconditions.checkNotNull(zzfrVar);
        if (str == null || !zzfrVar.zza() || zzfrVar.zzj() == 1 || (zzfrVar.zzj() != 7 ? !zzfrVar.zzb() : zzfrVar.zzg() == 0)) {
            return null;
        }
        int iZzj = zzfrVar.zzj();
        boolean zZze = zzfrVar.zze();
        if (!zZze && iZzj != 2 && iZzj != 7) {
            strZzc = zzfrVar.zzc().toUpperCase(Locale.ENGLISH);
        } else {
            strZzc = zzfrVar.zzc();
        }
        String str3 = strZzc;
        if (zzfrVar.zzg() == 0) {
            list = null;
        } else {
            List listZzf = zzfrVar.zzf();
            if (!zZze) {
                ArrayList arrayList = new ArrayList(listZzf.size());
                Iterator it = listZzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listZzf = Collections.unmodifiableList(arrayList);
            }
            list = listZzf;
        }
        if (iZzj == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return zzd(str, iZzj, zZze, str3, list, str2, zzgtVar);
    }

    public static Boolean zzi(String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        if (!zzpj.zzm(str)) {
            return null;
        }
        try {
            return zzj(new BigDecimal(str), zzflVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    public static Boolean zzj(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzfl zzflVar, double d11) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzflVar);
        if (zzflVar.zza()) {
            boolean z11 = true;
            if (zzflVar.zzm() != 1) {
                if (zzflVar.zzm() == 5) {
                    if (!zzflVar.zzf() || !zzflVar.zzh()) {
                        return null;
                    }
                } else if (!zzflVar.zzd()) {
                    return null;
                }
                int iZzm = zzflVar.zzm();
                if (zzflVar.zzm() == 5) {
                    if (zzpj.zzm(zzflVar.zzg()) && zzpj.zzm(zzflVar.zzi())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzflVar.zzg());
                            bigDecimal4 = new BigDecimal(zzflVar.zzi());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!zzpj.zzm(zzflVar.zze())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzflVar.zze());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iZzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i11 = iZzm - 1;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z11 = false;
                            }
                            return Boolean.valueOf(z11);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d11 != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d11).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d11).multiply(new BigDecimal(2)))) >= 0) {
                                z11 = false;
                            }
                            return Boolean.valueOf(z11);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }
        return null;
    }
}
