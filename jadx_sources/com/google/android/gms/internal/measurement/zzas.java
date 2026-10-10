package com.google.android.gms.internal.measurement;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        byte b11;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zIsEmpty;
        zzg zzgVar2;
        int iZzi;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str3 = r10;
                str4 = "charAt";
                b11 = str.equals(str3) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str4 = "charAt";
                if (str.equals("toString")) {
                    b11 = 14;
                    str3 = r10;
                }
                str3 = r10;
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b11 = 12;
                    str3 = r10;
                }
                str3 = r10;
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    str3 = r10;
                    b11 = 0;
                } else {
                    str3 = r10;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str3 = r10;
                    str4 = "charAt";
                    b11 = 1;
                } else {
                    str3 = "hasOwnProperty";
                    str4 = "charAt";
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b11 = 13;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    b11 = 7;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b11 = 11;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b11 = 4;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b11 = 15;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b11 = 16;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b11 = 5;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b11 = 8;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b11 = 9;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b11 = 10;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b11 = 6;
                    str3 = r10;
                    str4 = "charAt";
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str3 = r10;
                    str4 = "charAt";
                    b11 = 3;
                } else {
                    str3 = "hasOwnProperty";
                    str4 = "charAt";
                }
                break;
            default:
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
        }
        String strZzc = "undefined";
        switch (b11) {
            case 0:
                zzh.zzc(str4, 1, list);
                int iZzi2 = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
                String str5 = this.zza;
                return (iZzi2 < 0 || iZzi2 >= str5.length()) ? zzao.zzm : new zzas(String.valueOf(str5.charAt(iZzi2)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb2 = new StringBuilder(this.zza);
                for (int i15 = 0; i15 < list.size(); i15++) {
                    sb2.append(zzgVar.zza((zzao) list.get(i15)).zzc());
                }
                return new zzas(sb2.toString());
            case 2:
                zzh.zza(str3, 1, list);
                String str6 = this.zza;
                zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                if (SessionDescription.ATTR_LENGTH.equals(zzaoVarZza.zzc())) {
                    return zzao.zzk;
                }
                double dDoubleValue = zzaoVarZza.zzd().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i11 = (int) dDoubleValue) < 0 || i11 >= str6.length()) ? zzao.zzl : zzao.zzk;
            case 3:
                zzh.zzc("indexOf", 2, list);
                return new zzah(Double.valueOf(this.zza.indexOf(list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined", (int) zzh.zzi(list.size() >= 2 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : 0.0d))));
            case 4:
                zzh.zzc("lastIndexOf", 2, list);
                String str7 = this.zza;
                String strZzc2 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                double dDoubleValue2 = list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                return new zzah(Double.valueOf(str7.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.zzi(dDoubleValue2)))));
            case 5:
                zzh.zzc("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
            case 6:
                zzh.zzc("replace", 2, list);
                zzao zzaoVarZza2 = zzao.zzf;
                if (!list.isEmpty()) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    if (list.size() > 1) {
                        zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                    }
                }
                String str8 = strZzc;
                String str9 = this.zza;
                int iIndexOf = str9.indexOf(str8);
                if (iIndexOf < 0) {
                    return this;
                }
                if (zzaoVarZza2 instanceof zzai) {
                    i12 = 0;
                    zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str8), new zzah(Double.valueOf(iIndexOf)), this));
                } else {
                    i12 = 0;
                }
                String strSubstring = str9.substring(i12, iIndexOf);
                String strZzc3 = zzaoVarZza2.zzc();
                String strSubstring2 = str9.substring(iIndexOf + str8.length());
                StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc3).length() + String.valueOf(strSubstring2).length());
                sb3.append(strSubstring);
                sb3.append(strZzc3);
                sb3.append(strSubstring2);
                return new zzas(sb3.toString());
            case 7:
                zzh.zzc(FirebaseAnalytics.Event.SEARCH, 1, list);
                Matcher matcher2 = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
            case 8:
                zzh.zzc("slice", 2, list);
                String str10 = this.zza;
                double dZzi = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                double dMax = dZzi < 0.0d ? Math.max(((double) str10.length()) + dZzi, 0.0d) : Math.min(dZzi, str10.length());
                double dZzi2 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str10.length());
                double dMax2 = dZzi2 < 0.0d ? Math.max(((double) str10.length()) + dZzi2, 0.0d) : Math.min(dZzi2, str10.length());
                int i16 = (int) dMax;
                return new zzas(str10.substring(i16, Math.max(0, ((int) dMax2) - i16) + i16));
            case 9:
                zzh.zzc("split", 2, list);
                String str11 = this.zza;
                if (str11.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzc4 = zzgVar.zza((zzao) list.get(0)).zzc();
                    long jZzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                    if (jZzh == 0) {
                        return new zzae();
                    }
                    String[] strArrSplit = str11.split(Pattern.quote(strZzc4), ((int) jZzh) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc4.isEmpty() || length <= 0) {
                        i13 = length;
                        i14 = 0;
                    } else {
                        zIsEmpty = strArrSplit[0].isEmpty();
                        i13 = length - 1;
                        if (!strArrSplit[i13].isEmpty()) {
                            i14 = zIsEmpty;
                            i13 = length;
                            i14 = zIsEmpty;
                        }
                    }
                    i14 = zIsEmpty;
                    if (length > jZzh) {
                        i13--;
                    }
                    while (i14 < i13) {
                        arrayList.add(new zzas(strArrSplit[i14]));
                        i14++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzc("substring", 2, list);
                String str12 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZzi = 0;
                } else {
                    zzgVar2 = zzgVar;
                    iZzi = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                }
                int iZzi3 = list.size() > 1 ? (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()) : str12.length();
                int iMin = Math.min(Math.max(iZzi, 0), str12.length());
                int iMin2 = Math.min(Math.max(iZzi3, 0), str12.length());
                return new zzas(str12.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                zzh.zza("toLocaleUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase());
            case 12:
                zzh.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case 13:
                zzh.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zza("toString", 0, list);
                return this;
            case 15:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }

    public zzas(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
}
