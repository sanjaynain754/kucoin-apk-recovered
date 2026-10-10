package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzkw {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i11, zzkv zzkvVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zzb(b11, bArr, i12, zzkvVar);
        }
        zzkvVar.zza = b11;
        return i12;
    }

    public static int zzb(int i11, byte[] bArr, int i12, zzkv zzkvVar) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            zzkvVar.zza = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & 127) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zzkvVar.zza = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzkvVar.zza = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zzkvVar.zza = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & 127) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zzkvVar.zza = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    public static int zzc(byte[] bArr, int i11, zzkv zzkvVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zzkvVar.zzb = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | (((long) (b11 & 127)) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            byte b12 = bArr[i13];
            i14 += 7;
            j12 |= ((long) (b12 & 127)) << i14;
            b11 = b12;
            i13 = i15;
        }
        zzkvVar.zzb = j12;
        return i13;
    }

    public static int zzd(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public static long zze(byte[] bArr, int i11) {
        return (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    public static int zzj(Object obj, zznw zznwVar, byte[] bArr, int i11, int i12, zzkv zzkvVar) throws IOException {
        int iZzb = i11 + 1;
        int i13 = bArr[i11];
        if (i13 < 0) {
            iZzb = zzb(i13, bArr, iZzb, zzkvVar);
            i13 = zzkvVar.zza;
        }
        int i14 = iZzb;
        if (i13 < 0 || i13 > i12 - i14) {
            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzkvVar.zze + 1;
        zzkvVar.zze = i15;
        zzq(i15);
        int i16 = i14 + i13;
        zznwVar.zzi(obj, bArr, i14, i16, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return i16;
    }

    public static int zzk(Object obj, zznw zznwVar, byte[] bArr, int i11, int i12, int i13, zzkv zzkvVar) throws IOException {
        int i14 = zzkvVar.zze + 1;
        zzkvVar.zze = i14;
        zzq(i14);
        int iZzh = ((zzno) zznwVar).zzh(obj, bArr, i11, i12, i13, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return iZzh;
    }

    public static int zzl(int i11, byte[] bArr, int i12, int i13, zzmn zzmnVar, zzkv zzkvVar) {
        zzmf zzmfVar = (zzmf) zzmnVar;
        int iZza = zza(bArr, i12, zzkvVar);
        zzmfVar.zzh(zzkvVar.zza);
        while (iZza < i13) {
            int iZza2 = zza(bArr, iZza, zzkvVar);
            if (i11 != zzkvVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i11, zzmn zzmnVar, zzkv zzkvVar) throws IOException {
        zzmf zzmfVar = (zzmf) zzmnVar;
        int iZza = zza(bArr, i11, zzkvVar);
        int i12 = zzkvVar.zza + iZza;
        while (iZza < i12) {
            iZza = zza(bArr, iZza, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        if (iZza == i12) {
            return iZza;
        }
        throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzo(int i11, byte[] bArr, int i12, int i13, zzoi zzoiVar, zzkv zzkvVar) throws zzmq {
        if ((i11 >>> 3) == 0) {
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int iZzc = zzc(bArr, i12, zzkvVar);
            zzoiVar.zzk(i11, Long.valueOf(zzkvVar.zzb));
            return iZzc;
        }
        if (i14 == 1) {
            zzoiVar.zzk(i11, Long.valueOf(zze(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int iZza = zza(bArr, i12, zzkvVar);
            int i15 = zzkvVar.zza;
            if (i15 < 0) {
                throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - iZza) {
                throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                zzoiVar.zzk(i11, zzlg.zzb);
            } else {
                zzoiVar.zzk(i11, zzlg.zzh(bArr, iZza, i15));
            }
            return iZza + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zzmq("Protocol message contained an invalid tag (zero).");
            }
            zzoiVar.zzk(i11, Integer.valueOf(zzd(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zzoi zzoiVarZzb = zzoi.zzb();
        int i17 = zzkvVar.zze + 1;
        zzkvVar.zze = i17;
        zzq(i17);
        int i18 = 0;
        while (i12 < i13) {
            int iZza2 = zza(bArr, i12, zzkvVar);
            int i19 = zzkvVar.zza;
            if (i19 == i16) {
                i18 = i19;
                i12 = iZza2;
                break;
            }
            i12 = zzo(i19, bArr, iZza2, i13, zzoiVarZzb, zzkvVar);
            i18 = i19;
        }
        zzkvVar.zze--;
        if (i12 > i13 || i18 != i16) {
            throw new zzmq("Failed to parse the message.");
        }
        zzoiVar.zzk(i11, zzoiVarZzb);
        return i12;
    }

    public static int zzp(int i11, byte[] bArr, int i12, int i13, zzkv zzkvVar) throws zzmq {
        if ((i11 >>> 3) == 0) {
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return zzc(bArr, i12, zzkvVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return zza(bArr, i12, zzkvVar) + zzkvVar.zza;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = zza(bArr, i12, zzkvVar);
            i16 = zzkvVar.zza;
            if (i16 == i15) {
                break;
            }
            i12 = zzp(i16, bArr, i12, i13, zzkvVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw new zzmq("Failed to parse the message.");
        }
        return i12;
    }

    private static void zzq(int i11) throws zzmq {
        if (i11 >= zzb) {
            throw new zzmq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public static int zzf(byte[] bArr, int i11, zzkv zzkvVar) throws zzmq {
        int i12;
        int iZza = zza(bArr, i11, zzkvVar);
        int i13 = zzkvVar.zza;
        if (i13 >= 0) {
            if (i13 == 0) {
                zzkvVar.zzc = "";
                return iZza;
            }
            int i14 = zzor.zza;
            int length = bArr.length;
            if ((((length - iZza) - i13) | iZza | i13) >= 0) {
                int i15 = iZza + i13;
                char[] cArr = new char[i13];
                int i16 = 0;
                while (iZza < i15) {
                    byte b11 = bArr[iZza];
                    if (!zzop.zza(b11)) {
                        break;
                    }
                    iZza++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
                int i17 = i16;
                while (iZza < i15) {
                    int i18 = iZza + 1;
                    byte b12 = bArr[iZza];
                    if (zzop.zza(b12)) {
                        cArr[i17] = (char) b12;
                        i17++;
                        iZza = i18;
                        while (iZza < i15) {
                            byte b13 = bArr[iZza];
                            if (!zzop.zza(b13)) {
                                break;
                            }
                            iZza++;
                            cArr[i17] = (char) b13;
                            i17++;
                        }
                    } else {
                        if (b12 < -32) {
                            if (i18 < i15) {
                                i12 = i17 + 1;
                                iZza += 2;
                                zzop.zzb(b12, bArr[i18], cArr, i17);
                            } else {
                                throw new zzmq("Protocol message had invalid UTF-8.");
                            }
                        } else if (b12 < -16) {
                            if (i18 < i15 - 1) {
                                i12 = i17 + 1;
                                int i19 = iZza + 2;
                                iZza += 3;
                                zzop.zzc(b12, bArr[i18], bArr[i19], cArr, i17);
                            } else {
                                throw new zzmq("Protocol message had invalid UTF-8.");
                            }
                        } else if (i18 < i15 - 2) {
                            byte b14 = bArr[i18];
                            int i21 = iZza + 3;
                            byte b15 = bArr[iZza + 2];
                            iZza += 4;
                            zzop.zzd(b12, b14, b15, bArr[i21], cArr, i17);
                            i17 += 2;
                        } else {
                            throw new zzmq("Protocol message had invalid UTF-8.");
                        }
                        i17 = i12;
                    }
                }
                zzkvVar.zzc = new String(cArr, 0, i17);
                return i15;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i13)));
        }
        throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int zzg(byte[] bArr, int i11, zzkv zzkvVar) throws zzmq {
        int iZza = zza(bArr, i11, zzkvVar);
        int i12 = zzkvVar.zza;
        if (i12 >= 0) {
            if (i12 <= bArr.length - iZza) {
                if (i12 == 0) {
                    zzkvVar.zzc = zzlg.zzb;
                    return iZza;
                }
                zzkvVar.zzc = zzlg.zzh(bArr, iZza, i12);
                return iZza + i12;
            }
            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int zzh(zznw zznwVar, byte[] bArr, int i11, int i12, zzkv zzkvVar) throws IOException {
        Object objZza = zznwVar.zza();
        int iZzj = zzj(objZza, zznwVar, bArr, i11, i12, zzkvVar);
        zznwVar.zzj(objZza);
        zzkvVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zznw zznwVar, byte[] bArr, int i11, int i12, int i13, zzkv zzkvVar) throws IOException {
        Object objZza = zznwVar.zza();
        int iZzk = zzk(objZza, zznwVar, bArr, i11, i12, i13, zzkvVar);
        zznwVar.zzj(objZza);
        zzkvVar.zzc = objZza;
        return iZzk;
    }

    public static int zzn(zznw zznwVar, int i11, byte[] bArr, int i12, int i13, zzmn zzmnVar, zzkv zzkvVar) throws IOException {
        int iZzh = zzh(zznwVar, bArr, i12, i13, zzkvVar);
        zzmnVar.add(zzkvVar.zzc);
        while (iZzh < i13) {
            int iZza = zza(bArr, iZzh, zzkvVar);
            if (i11 != zzkvVar.zza) {
                break;
            }
            iZzh = zzh(zznwVar, bArr, iZza, i13, zzkvVar);
            zzmnVar.add(zzkvVar.zzc);
        }
        return iZzh;
    }
}
