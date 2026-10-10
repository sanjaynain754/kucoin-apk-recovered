package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzkp implements ObjectEncoder {
    static final zzkp zza = new zzkp();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(DbParams.KEY_CHANNEL_RESULT);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("ok");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        builder2.withProperty(zzayVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }

    private zzkp() {
    }
}
