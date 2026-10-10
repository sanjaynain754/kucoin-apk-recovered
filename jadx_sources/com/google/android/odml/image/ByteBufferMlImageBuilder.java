package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes45.dex */
public class ByteBufferMlImageBuilder {
    private final ByteBuffer zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze = 0;
    private Rect zzf;

    @NonNull
    public MlImage build() {
        return new MlImage(new zzf(this.zza, this.zzd), this.zze, this.zzf, 0L, this.zzb, this.zzc);
    }

    public ByteBufferMlImageBuilder(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13) {
        this.zza = byteBuffer;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zzf = new Rect(0, 0, i11, i12);
    }

    @NonNull
    public ByteBufferMlImageBuilder setRotation(int i11) {
        MlImage.zzc(i11);
        this.zze = i11;
        return this;
    }
}
