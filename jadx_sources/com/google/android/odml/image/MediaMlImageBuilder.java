package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes45.dex */
@RequiresApi(19)
public class MediaMlImageBuilder {
    private final Image zza;
    private int zzb = 0;
    private Rect zzc;

    @NonNull
    public MlImage build() {
        return new MlImage(new zzi(this.zza), this.zzb, this.zzc, 0L, this.zza.getWidth(), this.zza.getHeight());
    }

    public MediaMlImageBuilder(@NonNull Image image) {
        this.zza = image;
        this.zzc = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @NonNull
    public MediaMlImageBuilder setRotation(int i11) {
        MlImage.zzc(i11);
        this.zzb = i11;
        return this;
    }
}
