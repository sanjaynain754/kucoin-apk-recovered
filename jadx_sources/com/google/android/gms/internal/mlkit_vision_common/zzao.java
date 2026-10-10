package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzao implements ValueEncoderContext {
    private boolean zza = false;
    private boolean zzb = false;
    private FieldDescriptor zzc;
    private final zzak zzd;

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(double d11) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d11, this.zzb);
        return this;
    }

    public final void zza(FieldDescriptor fieldDescriptor, boolean z11) {
        this.zza = false;
        this.zzc = fieldDescriptor;
        this.zzb = z11;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    public zzao(zzak zzakVar) {
        this.zzd = zzakVar;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(float f11) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f11, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(int i11) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i11, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(long j11) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j11, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@Nullable String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(boolean z11) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z11 ? 1 : 0, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
