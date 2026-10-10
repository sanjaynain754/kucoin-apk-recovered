package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzcv extends zzck {
    static final zzcv zzc;
    final transient zzcc zzd;

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzck) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzdb.zza(((zzck) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzdd zzddVarListIterator = this.zzd.listIterator(0);
            while (zzddVarListIterator.hasNext()) {
                E next = zzddVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzck) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iZzu = zzu(obj, true) - 1;
        if (iZzu == -1) {
            return null;
        }
        return this.zzd.get(iZzu);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iZzu = zzu(obj, false) - 1;
        if (iZzu == -1) {
            return null;
        }
        return this.zzd.get(iZzu);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzo(Object obj, boolean z11) {
        return zzw(0, zzu(obj, z11));
    }

    static {
        int i11 = zzcc.zzd;
        zzc = new zzcv(zzct.zza, zzcq.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        zzcc zzccVar = this.zzd;
        int iZzv = zzv(obj, true);
        if (iZzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(iZzv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        if (!zzdb.zza(((zzck) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzdd zzddVarListIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!zzddVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = zzddVarListIterator.next();
        while (true) {
            try {
                int iCompare = ((zzck) this).zza.compare(next2, next);
                if (iCompare < 0) {
                    if (!zzddVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zzddVarListIterator.next();
                } else {
                    if (iCompare != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object higher(Object obj) {
        zzcc zzccVar = this.zzd;
        int iZzv = zzv(obj, false);
        if (iZzv == zzccVar.size()) {
            return null;
        }
        return this.zzd.get(iZzv);
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr, int i11) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: zzd */
    public final zzdc iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] zze() {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzf() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((zzck) this).zza);
        return isEmpty() ? zzck.zzs(comparatorReverseOrder) : new zzcv(this.zzd.zzf(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzr(Object obj, boolean z11) {
        return zzw(zzv(obj, z11), this.zzd.size());
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    /* JADX INFO: renamed from: zzt */
    public final zzdc descendingIterator() {
        return this.zzd.zzf().listIterator(0);
    }

    public final zzcv zzw(int i11, int i12) {
        if (i11 == 0) {
            if (i12 == this.zzd.size()) {
                return this;
            }
            i11 = 0;
        }
        if (i11 >= i12) {
            return zzck.zzs(((zzck) this).zza);
        }
        zzcc zzccVar = this.zzd;
        return new zzcv(zzccVar.subList(i11, i12), ((zzck) this).zza);
    }

    public zzcv(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.zzd.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            zzcc zzccVar = this.zzd;
            return zzccVar.get(zzccVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck zzq(Object obj, boolean z11, Object obj2, boolean z12) {
        return zzr(obj, z11).zzo(obj2, z12);
    }

    public final int zzu(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        if (iBinarySearch >= 0) {
            if (z11) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int zzv(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        if (iBinarySearch >= 0) {
            if (z11) {
                return iBinarySearch;
            }
            return iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
