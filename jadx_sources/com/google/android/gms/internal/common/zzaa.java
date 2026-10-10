package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzaa {
    private final zzr zza;
    private final boolean zzb;
    private final zzx zzc;

    public static zzaa zzc(zzr zzrVar) {
        return new zzaa(new zzx(zzrVar), false, zzq.zza, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzh(CharSequence charSequence) {
        zzx zzxVar = this.zzc;
        return new zzw(zzxVar, this, charSequence, zzxVar.zza);
    }

    public final zzaa zzb() {
        return new zzaa(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new zzy(this, charSequence);
    }

    private zzaa(zzx zzxVar, boolean z11, zzr zzrVar, int i11) {
        this.zzc = zzxVar;
        this.zzb = z11;
        this.zza = zzrVar;
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzh = zzh(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzh.hasNext()) {
            arrayList.add((String) itZzh.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
