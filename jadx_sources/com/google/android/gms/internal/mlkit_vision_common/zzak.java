package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzak implements ObjectEncoderContext {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final ObjectEncoder zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ObjectEncoder zzh;
    private final zzao zzi = new zzao(this);

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d11) throws IOException {
        zza(fieldDescriptor, d11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = builder2.withProperty(zzaeVar2.zzb()).build();
        zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                zzak.zzg((Map.Entry) obj, objectEncoderContext);
            }
        };
    }

    public static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        zzai zzaiVar = (zzai) fieldDescriptor.getProperty(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(ObjectEncoder objectEncoder, Object obj) throws IOException {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzafVar.zza();
                zzafVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzafVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static zzai zzj(FieldDescriptor fieldDescriptor) {
        zzai zzaiVar = (zzai) fieldDescriptor.getProperty(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzak zzl(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z11) throws IOException {
        this.zzi.zza(fieldDescriptor, z11);
        valueEncoder.encode(obj, this.zzi);
        return this;
    }

    private final void zzn(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            this.zze.write((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.zze.write(i11 & 127);
    }

    private final void zzo(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            this.zze.write((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.zze.write(((int) j11) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f11) throws IOException {
        zzb(fieldDescriptor, f11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.m13752of(str));
    }

    public final ObjectEncoderContext zza(@NonNull FieldDescriptor fieldDescriptor, double d11, boolean z11) throws IOException {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d11).array());
        return this;
    }

    public final ObjectEncoderContext zzb(@NonNull FieldDescriptor fieldDescriptor, float f11, boolean z11) throws IOException {
        if (z11 && f11 == 0.0f) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f11).array());
        return this;
    }

    public final ObjectEncoderContext zzc(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z11) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z11 || charSequence.length() != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(fieldDescriptor, ((Double) obj).doubleValue(), z11);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(fieldDescriptor, ((Float) obj).floatValue(), z11);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(fieldDescriptor, ((Number) obj).longValue(), z11);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
                    if (objectEncoder != null) {
                        zzk(objectEncoder, fieldDescriptor, obj, z11);
                        return this;
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.zzg.get(obj.getClass());
                    if (valueEncoder != null) {
                        zzl(valueEncoder, fieldDescriptor, obj, z11);
                        return this;
                    }
                    if (obj instanceof zzag) {
                        zzd(fieldDescriptor, ((zzag) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, fieldDescriptor, obj, z11);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z11 || bArr.length != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzak zzd(@NonNull FieldDescriptor fieldDescriptor, int i11, boolean z11) throws IOException {
        if (!z11 || i11 != 0) {
            zzai zzaiVarZzj = zzj(fieldDescriptor);
            zzah zzahVar = zzah.DEFAULT;
            int iOrdinal = zzaiVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzaiVarZzj.zza() << 3);
                zzn(i11);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzaiVarZzj.zza() << 3);
                zzn((i11 + i11) ^ (i11 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzaiVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i11).array());
                return this;
            }
        }
        return this;
    }

    public final zzak zze(@NonNull FieldDescriptor fieldDescriptor, long j11, boolean z11) throws IOException {
        if (!z11 || j11 != 0) {
            zzai zzaiVarZzj = zzj(fieldDescriptor);
            zzah zzahVar = zzah.DEFAULT;
            int iOrdinal = zzaiVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzaiVarZzj.zza() << 3);
                zzo(j11);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzaiVarZzj.zza() << 3);
                zzo((j11 >> 63) ^ (j11 + j11));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzaiVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j11).array());
                return this;
            }
        }
        return this;
    }

    public final zzak zzf(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    public zzak(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    private final zzak zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z11) throws IOException {
        long jZzi = zzi(objectEncoder, obj);
        if (z11 && jZzi == 0) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(jZzi);
        objectEncoder.encode(obj, this);
        return this;
    }

    private static ByteBuffer zzm(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i11) throws IOException {
        zzd(fieldDescriptor, i11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j11) throws IOException {
        zze(fieldDescriptor, j11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        zzc(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z11) throws IOException {
        zzd(fieldDescriptor, z11 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d11) throws IOException {
        zza(FieldDescriptor.m13752of(str), d11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i11) throws IOException {
        zzd(FieldDescriptor.m13752of(str), i11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j11) throws IOException {
        zze(FieldDescriptor.m13752of(str), j11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        zzc(FieldDescriptor.m13752of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z11) throws IOException {
        zzd(FieldDescriptor.m13752of(str), z11 ? 1 : 0, true);
        return this;
    }
}
