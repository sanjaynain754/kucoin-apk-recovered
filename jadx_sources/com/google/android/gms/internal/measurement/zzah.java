package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.node.C6447a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzah implements zzao {
    private final Double zza;

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzah) {
            return this.zza.equals(((zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        Double d11 = this.zza;
        if (Double.isNaN(d11.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d11.doubleValue())) {
            return d11.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalM11724a = C6447a.m11724a(BigDecimal.valueOf(d11.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalM11724a.scale() > 0 ? bigDecimalM11724a.precision() : bigDecimalM11724a.scale()) - 1);
        String str = decimalFormat.format(bigDecimalM11724a);
        int iIndexOf = str.indexOf(ExifInterface.LONGITUDE_EAST);
        if (iIndexOf <= 0) {
            return str;
        }
        int i11 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i11 >= 0 || i11 <= -7) && (i11 < 0 || i11 >= 21)) ? str.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+") : bigDecimalM11724a.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        Double d11 = this.zza;
        boolean z11 = false;
        if (!Double.isNaN(d11.doubleValue()) && d11.doubleValue() != 0.0d) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzah(this.zza);
    }

    public zzah(Double d11) {
        if (d11 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d11;
        }
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        if ("toString".equals(str)) {
            return new zzas(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }
}
