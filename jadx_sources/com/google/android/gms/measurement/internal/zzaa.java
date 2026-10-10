package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzpq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaa extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzff zzh;

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return this.zzh.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0285  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x0299  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:121:0x030a A[EDGE_INSN: B:121:0x030a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:122:0x032a A[EDGE_INSN: B:122:0x032a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x034a A[EDGE_INSN: B:176:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x034a A[EDGE_INSN: B:178:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x034a A[EDGE_INSN: B:187:0x034a->B:124:0x034a BREAK  A[LOOP:0: B:40:0x00f4->B:45:0x0121], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[LOOP:0: B:40:0x00f4->B:45:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l11, Long l12, com.google.android.gms.internal.measurement.zzhs zzhsVar, long j11, zzbc zzbcVar, boolean z11) {
        HashSet hashSet;
        Iterator it;
        ArrayMap arrayMap;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzfh zzfhVar;
        boolean z12;
        String strZzh;
        V v11;
        Boolean boolZzg;
        Boolean boolZzh;
        String str;
        Boolean boolZzi;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.zzfh zzfhVar2;
        zzpq.zza();
        zzad zzadVar = this.zza;
        zzib zzibVar = zzadVar.zzu;
        zzal zzalVarZzc = zzibVar.zzc();
        String str2 = this.zzb;
        boolean zZzp = zzalVarZzc.zzp(str2, zzfx.zzaF);
        com.google.android.gms.internal.measurement.zzff zzffVar = this.zzh;
        long j12 = zzffVar.zzm() ? zzbcVar.zze : j11;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(zzibVar.zzaV().zzn(), 2)) {
            zzibVar.zzaV().zzk().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null, zzibVar.zzl().zza(zzffVar.zzc()));
            zzibVar.zzaV().zzk().zzb("Filter definition", zzadVar.zzg.zzp().zzj(zzffVar));
        }
        if (!zzffVar.zza() || zzffVar.zzb() > 256) {
            zzibVar.zzaV().zze().zzc("Invalid event filter ID. appId, id", zzgt.zzl(str2), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
            return false;
        }
        Object[] objArr = zzffVar.zzi() || zzffVar.zzj() || zzffVar.zzm();
        if (z11 && objArr != true) {
            zzibVar.zzaV().zzk().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
            return true;
        }
        String strZzd = zzhsVar.zzd();
        if (!zzffVar.zzg()) {
            hashSet = new HashSet();
            it = zzffVar.zzd().iterator();
            while (true) {
                if (it.hasNext()) {
                    arrayMap = new ArrayMap();
                    it2 = zzhsVar.zza().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzffVar.zzd().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                if (zzfhVar.zze() || !zzfhVar.zzf()) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                strZzh = zzfhVar.zzh();
                                if (strZzh.isEmpty()) {
                                    v11 = arrayMap.get(strZzh);
                                    if (v11 instanceof Long) {
                                        if (v11 instanceof Double) {
                                            if (v11 instanceof String) {
                                                if (v11 == 0) {
                                                    zzibVar.zzaV().zze().zzc("Unknown param type. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                    break;
                                                }
                                                zzibVar.zzaV().zzk().zzc("Missing param for filter. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzfhVar.zza()) {
                                                if (zzfhVar.zzc()) {
                                                    zzibVar.zzaV().zze().zzc("No filter for String param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                    break;
                                                }
                                                str = (String) v11;
                                                if (zzpj.zzm(str)) {
                                                    zzibVar.zzaV().zze().zzc("Invalid param value for number filter. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                    break;
                                                }
                                                boolZzi = zzab.zzi(str, zzfhVar.zzd());
                                            } else {
                                                boolZzi = zzab.zzf((String) v11, zzfhVar.zzb(), zzibVar.zzaV());
                                            }
                                            if (boolZzi != null) {
                                                break;
                                            }
                                            if (boolZzi.booleanValue() == z12) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (zzfhVar.zzc()) {
                                                zzibVar.zzaV().zze().zzc("No number filter for double param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                break;
                                            }
                                            boolZzh = zzab.zzh(((Double) v11).doubleValue(), zzfhVar.zzd());
                                            if (boolZzh != null) {
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z12) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (zzfhVar.zzc()) {
                                            zzibVar.zzaV().zze().zzc("No number filter for long param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                            break;
                                        }
                                        boolZzg = zzab.zzg(((Long) v11).longValue(), zzfhVar.zzd());
                                        if (boolZzg != null) {
                                            break;
                                        }
                                        if (boolZzg.booleanValue() == z12) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    zzibVar.zzaV().zze().zzb("Event has empty param name. event", zzibVar.zzl().zza(strZzd));
                                    break;
                                }
                            }
                        } else {
                            zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                            if (!hashSet.contains(zzhwVar.zzb())) {
                                if (zzhwVar.zze()) {
                                    if (zzhwVar.zzi()) {
                                        if (zzhwVar.zzc()) {
                                            zzibVar.zzaV().zze().zzc("Unknown value for param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(zzhwVar.zzb()));
                                            break;
                                        }
                                        arrayMap.put(zzhwVar.zzb(), zzhwVar.zzd());
                                    } else {
                                        String strZzb = zzhwVar.zzb();
                                        if (zzhwVar.zzi()) {
                                            dValueOf = Double.valueOf(zzhwVar.zzj());
                                        } else {
                                            dValueOf = null;
                                        }
                                        arrayMap.put(strZzb, dValueOf);
                                    }
                                } else {
                                    String strZzb2 = zzhwVar.zzb();
                                    if (zzhwVar.zze()) {
                                        lValueOf = Long.valueOf(zzhwVar.zzf());
                                    } else {
                                        lValueOf = null;
                                    }
                                    arrayMap.put(strZzb2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                    if (zzfhVar2.zzh().isEmpty()) {
                        zzibVar.zzaV().zze().zzb("null or empty param name in filter. event", zzibVar.zzl().zza(strZzd));
                        break;
                    }
                    hashSet.add(zzfhVar2.zzh());
                }
            }
        } else {
            Boolean boolZzg2 = zzab.zzg(j12, zzffVar.zzh());
            if (boolZzg2 != null) {
                if (boolZzg2.booleanValue()) {
                    hashSet = new HashSet();
                    it = zzffVar.zzd().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            arrayMap = new ArrayMap();
                            it2 = zzhsVar.zza().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = zzffVar.zzd().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                        if (zzfhVar.zze()) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        strZzh = zzfhVar.zzh();
                                        if (strZzh.isEmpty()) {
                                            v11 = arrayMap.get(strZzh);
                                            if (v11 instanceof Long) {
                                                if (v11 instanceof Double) {
                                                    if (v11 instanceof String) {
                                                        if (v11 == 0) {
                                                            zzibVar.zzaV().zze().zzc("Unknown param type. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                            break;
                                                        }
                                                        zzibVar.zzaV().zzk().zzc("Missing param for filter. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (zzfhVar.zza()) {
                                                        if (zzfhVar.zzc()) {
                                                            zzibVar.zzaV().zze().zzc("No filter for String param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                            break;
                                                        }
                                                        str = (String) v11;
                                                        if (zzpj.zzm(str)) {
                                                            zzibVar.zzaV().zze().zzc("Invalid param value for number filter. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                            break;
                                                        }
                                                        boolZzi = zzab.zzi(str, zzfhVar.zzd());
                                                    } else {
                                                        boolZzi = zzab.zzf((String) v11, zzfhVar.zzb(), zzibVar.zzaV());
                                                    }
                                                    if (boolZzi != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzi.booleanValue() == z12) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (zzfhVar.zzc()) {
                                                    boolZzh = zzab.zzh(((Double) v11).doubleValue(), zzfhVar.zzd());
                                                    if (boolZzh != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzh.booleanValue() == z12) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    zzibVar.zzaV().zze().zzc("No number filter for double param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                    break;
                                                }
                                            } else if (zzfhVar.zzc()) {
                                                boolZzg = zzab.zzg(((Long) v11).longValue(), zzfhVar.zzd());
                                                if (boolZzg != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolZzg.booleanValue() == z12) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                zzibVar.zzaV().zze().zzc("No number filter for long param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(strZzh));
                                                break;
                                            }
                                        } else {
                                            zzibVar.zzaV().zze().zzb("Event has empty param name. event", zzibVar.zzl().zza(strZzd));
                                            break;
                                        }
                                    }
                                } else {
                                    zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                                    if (!hashSet.contains(zzhwVar.zzb())) {
                                        if (zzhwVar.zze()) {
                                            if (zzhwVar.zzi()) {
                                                if (zzhwVar.zzc()) {
                                                    zzibVar.zzaV().zze().zzc("Unknown value for param. event, param", zzibVar.zzl().zza(strZzd), zzibVar.zzl().zzb(zzhwVar.zzb()));
                                                    break;
                                                }
                                                arrayMap.put(zzhwVar.zzb(), zzhwVar.zzd());
                                            } else {
                                                String strZzb3 = zzhwVar.zzb();
                                                if (zzhwVar.zzi()) {
                                                    dValueOf = Double.valueOf(zzhwVar.zzj());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                arrayMap.put(strZzb3, dValueOf);
                                            }
                                        } else {
                                            String strZzb4 = zzhwVar.zzb();
                                            if (zzhwVar.zze()) {
                                                lValueOf = Long.valueOf(zzhwVar.zzf());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(strZzb4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                            if (zzfhVar2.zzh().isEmpty()) {
                                zzibVar.zzaV().zze().zzb("null or empty param name in filter. event", zzibVar.zzl().zza(strZzd));
                                break;
                            }
                            hashSet.add(zzfhVar2.zzh());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        zzibVar.zzaV().zzk().zzb("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zze = bool2;
        if (objArr != false && zzhsVar.zze()) {
            Long lValueOf2 = Long.valueOf(zzhsVar.zzf());
            if (zzffVar.zzj()) {
                if (zZzp && zzffVar.zzg()) {
                    lValueOf2 = l11;
                }
                this.zzg = lValueOf2;
            } else {
                if (zZzp && zzffVar.zzg()) {
                    lValueOf2 = l12;
                }
                this.zzf = lValueOf2;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzad zzadVar, String str, int i11, com.google.android.gms.internal.measurement.zzff zzffVar) {
        super(str, i11);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzffVar;
    }
}
