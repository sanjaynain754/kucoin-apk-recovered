package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzql;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhc {
    final /* synthetic */ zzhg zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    @WorkerThread
    public final Bundle zza() {
        byte b11;
        if (this.zzd == null) {
            zzhg zzhgVar = this.zza;
            String string = zzhgVar.zzd().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b11 = 4;
                                            } else {
                                                b11 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b11 = 3;
                                        } else {
                                            b11 = -1;
                                        }
                                    } else if (string3.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                                        b11 = 0;
                                    } else {
                                        b11 = -1;
                                    }
                                } else if (string3.equals(CmcdData.Factory.STREAM_TYPE_LIVE)) {
                                    b11 = 2;
                                } else {
                                    b11 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b11 = 1;
                            } else {
                                b11 = -1;
                            }
                            if (b11 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b11 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b11 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b11 == 3) {
                                zzql.zza();
                                if (zzhgVar.zzu.zzc().zzp(null, zzfx.zzaQ)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i12 = 0; i12 < length; i12++) {
                                        iArr[i12] = jSONArray2.optInt(i12);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (b11 != 4) {
                                zzhgVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                zzql.zza();
                                if (zzhgVar.zzu.zzc().zzp(null, zzfx.zzaQ)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i13 = 0; i13 < length2; i13++) {
                                        jArr[i13] = jSONArray3.optLong(i13);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaV().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    this.zza.zzu.zzaV().zzb().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhg zzhgVar = this.zza;
        SharedPreferences.Editor editorEdit = zzhgVar.zzd().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzql.zza();
                        zzib zzibVar = zzhgVar.zzu;
                        if (zzibVar.zzc().zzp(null, zzfx.zzaQ)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", CmcdData.Factory.STREAMING_FORMAT_SS);
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", CmcdData.Factory.STREAM_TYPE_LIVE);
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                zzibVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", CmcdData.Factory.STREAMING_FORMAT_SS);
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", CmcdData.Factory.STREAM_TYPE_LIVE);
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzibVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e11) {
                        this.zza.zzu.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e11);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }

    public zzhc(zzhg zzhgVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }
}
