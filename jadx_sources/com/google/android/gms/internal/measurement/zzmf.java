package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzmf extends zzkt implements RandomAccess, zzml, zzns {
    private static final int[] zza;
    private static final zzmf zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzmf(iArr, 0, false);
    }

    public zzmf() {
        this(zza, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        zzcF();
        if (i11 < 0 || i11 > (i12 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i11));
        }
        int i13 = i11 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i12 < length) {
            System.arraycopy(iArr, i11, iArr, i13, i12 - i11);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i11);
            System.arraycopy(this.zzc, i11, iArr2, i13, this.zzd - i11);
            this.zzc = iArr2;
        }
        this.zzc[i11] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmf)) {
            return super.equals(obj);
        }
        zzmf zzmfVar = (zzmf) obj;
        if (this.zzd != zzmfVar.zzd) {
            return false;
        }
        int[] iArr = zzmfVar.zzc;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            if (this.zzc[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zzd; i12++) {
            i11 = (i11 * 31) + this.zzc[i12];
        }
        return i11;
    }

    private zzmf(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.zzc = iArr;
        this.zzd = i11;
    }

    public static zzmf zzd() {
        return zzb;
    }

    private static int zzj(int i11) {
        return Math.max(((i11 * 3) / 2) + 1, 10);
    }

    private final void zzk(int i11) {
        if (i11 < 0 || i11 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i11));
        }
    }

    private final String zzl(int i11) {
        return zzkv.zza(this.zzd, i11, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.zzd;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zzc[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zzcF();
        zzk(i11);
        int[] iArr = this.zzc;
        int i12 = iArr[i11];
        iArr[i11] = iIntValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzmg
    /* JADX INFO: renamed from: zze */
    public final zzml zzg(int i11) {
        if (i11 >= this.zzd) {
            return new zzmf(i11 == 0 ? zza : Arrays.copyOf(this.zzc, i11), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzi(int i11) {
        int length = this.zzc.length;
        if (i11 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i11, 10)];
            return;
        }
        while (length < i11) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmo.zzb;
        collection.getClass();
        if (!(collection instanceof zzmf)) {
            return super.addAll(collection);
        }
        zzmf zzmfVar = (zzmf) collection;
        int i11 = zzmfVar.zzd;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzd;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.zzc;
            if (i13 > iArr.length) {
                this.zzc = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(zzmfVar.zzc, 0, this.zzc, this.zzd, zzmfVar.zzd);
            this.zzd = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzk(i11);
        return Integer.valueOf(this.zzc[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zzcF();
        zzk(i11);
        int[] iArr = this.zzc;
        int i12 = iArr[i11];
        int i13 = this.zzd;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        zzcF();
        if (i12 >= i11) {
            int[] iArr = this.zzc;
            System.arraycopy(iArr, i12, iArr, i11, this.zzd - i12);
            this.zzd -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final int zzf(int i11) {
        zzk(i11);
        return this.zzc[i11];
    }

    public final void zzh(int i11) {
        zzcF();
        int i12 = this.zzd;
        int length = this.zzc.length;
        if (i12 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i13 = this.zzd;
        this.zzd = i13 + 1;
        iArr2[i13] = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
