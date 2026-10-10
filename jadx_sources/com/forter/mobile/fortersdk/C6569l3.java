package com.forter.mobile.fortersdk;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.l3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6569l3 implements InterfaceC6619v3 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f10996a;

    /* JADX INFO: renamed from: b */
    public final long f10997b;

    public C6569l3() {
        this(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public final void m12425b(C6535f c6535f, Context context) {
        try {
            if (c6535f.m12248a("mockLocationAppsCount")) {
                this.f10996a.put("mockLocationAppsCount", Integer.toString(AbstractC6581o0.m12443c(context)));
            }
            if (c6535f.m12248a("locationAccuracy")) {
                this.f10996a.put("locationAccuracy", AbstractC6581o0.m12441a(context));
            }
            if (c6535f.m12248a("isMockedLocationAllowed")) {
                this.f10996a.put("isMockedLocationAllowed", AbstractC6581o0.m12442b(context));
            }
        } catch (Throwable th2) {
            C6514b.m12151b().m12159g(String.format("Failed generating event %s's general properties", "app/location"), th2.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x00ce, TryCatch #9 {all -> 0x00ce, blocks: (B:47:0x00c8, B:51:0x00d2, B:53:0x00d8, B:54:0x00dd, B:56:0x00e3, B:57:0x00e8, B:59:0x00ee, B:60:0x00f3, B:62:0x00f9, B:63:0x010a), top: B:89:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3 A[Catch: all -> 0x00ce, TryCatch #9 {all -> 0x00ce, blocks: (B:47:0x00c8, B:51:0x00d2, B:53:0x00d8, B:54:0x00dd, B:56:0x00e3, B:57:0x00e8, B:59:0x00ee, B:60:0x00f3, B:62:0x00f9, B:63:0x010a), top: B:89:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee A[Catch: all -> 0x00ce, TryCatch #9 {all -> 0x00ce, blocks: (B:47:0x00c8, B:51:0x00d2, B:53:0x00d8, B:54:0x00dd, B:56:0x00e3, B:57:0x00e8, B:59:0x00ee, B:60:0x00f3, B:62:0x00f9, B:63:0x010a), top: B:89:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9 A[Catch: all -> 0x00ce, TryCatch #9 {all -> 0x00ce, blocks: (B:47:0x00c8, B:51:0x00d2, B:53:0x00d8, B:54:0x00dd, B:56:0x00e3, B:57:0x00e8, B:59:0x00ee, B:60:0x00f3, B:62:0x00f9, B:63:0x010a), top: B:89:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final boolean m12426c(@NonNull Context context, @Nullable Location location) {
        boolean z11;
        String locality;
        String countryName;
        String postalCode;
        String thoroughfare;
        String str;
        Address address;
        String string;
        try {
            C6540g c6540gM12164a = AbstractC6515b0.m12164a("app/location");
            C6535f c6535f = new C6535f(c6540gM12164a);
            if (c6540gM12164a != null && !AbstractC6518b3.m12172f(c6540gM12164a.f10953c)) {
                return false;
            }
            if (location == null) {
                return true;
            }
            try {
                if (c6535f.m12248a(JPushConstants.Geofence.KEY_LONGITUDE)) {
                    this.f10996a.put(JPushConstants.Geofence.KEY_LONGITUDE, Double.toString(location.getLongitude()));
                }
                if (c6535f.m12248a(JPushConstants.Geofence.KEY_LATITUDE)) {
                    this.f10996a.put(JPushConstants.Geofence.KEY_LATITUDE, Double.toString(location.getLatitude()));
                }
                String subThoroughfare = null;
                if (c6535f.m12248a("geocodeing")) {
                    try {
                        List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (AbstractC6539f3.m12283q(fromLocation) || (address = fromLocation.get(0)) == null) {
                            str = null;
                            countryName = null;
                            postalCode = null;
                            thoroughfare = null;
                        } else {
                            locality = address.getLocality();
                            try {
                                countryName = address.getCountryName();
                                try {
                                    postalCode = address.getPostalCode();
                                    try {
                                        thoroughfare = address.getThoroughfare();
                                        try {
                                            subThoroughfare = address.getSubThoroughfare();
                                        } catch (IOException unused) {
                                        }
                                    } catch (IOException unused2) {
                                        thoroughfare = null;
                                    }
                                } catch (IOException unused3) {
                                    postalCode = null;
                                    thoroughfare = postalCode;
                                }
                            } catch (IOException unused4) {
                                countryName = null;
                                postalCode = countryName;
                                thoroughfare = postalCode;
                                str = subThoroughfare;
                                subThoroughfare = locality;
                                if (c6535f.m12248a("isMocked")) {
                                    try {
                                        string = Boolean.toString(location.isFromMockProvider());
                                    } catch (Throwable unused5) {
                                        string = "FAILURE";
                                    }
                                    z11 = true;
                                    try {
                                        this.f10996a.put("isMocked", string);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            C6514b.m12151b().m12158f("ForterClient::onLocationChanged() failed with exception: ".concat(String.valueOf(th)));
                                        } catch (Throwable th3) {
                                            th = th3;
                                            C6514b.m12151b().m12159g(String.format("Failed generating event %s", "app/location"), th.toString());
                                        }
                                    }
                                } else {
                                    z11 = true;
                                }
                                if (c6535f.m12248a("city")) {
                                    this.f10996a.put("city", subThoroughfare);
                                }
                                if (c6535f.m12248a("country")) {
                                    this.f10996a.put("country", countryName);
                                }
                                if (c6535f.m12248a("zipcode")) {
                                    this.f10996a.put("zipcode", postalCode);
                                }
                                if (c6535f.m12248a("additionalInfo")) {
                                    this.f10996a.put("additionalInfo", String.format(Locale.ENGLISH, "%s|%s", thoroughfare, str));
                                }
                                m12425b(c6535f, context);
                                return z11;
                            }
                            str = subThoroughfare;
                            subThoroughfare = locality;
                        }
                    } catch (IOException unused6) {
                        locality = null;
                        countryName = null;
                    }
                } else {
                    str = null;
                    countryName = null;
                    postalCode = null;
                    thoroughfare = null;
                }
                if (c6535f.m12248a("isMocked")) {
                    string = Boolean.toString(location.isFromMockProvider());
                    z11 = true;
                    this.f10996a.put("isMocked", string);
                } else {
                    z11 = true;
                }
                if (c6535f.m12248a("city")) {
                    this.f10996a.put("city", subThoroughfare);
                }
                if (c6535f.m12248a("country")) {
                    this.f10996a.put("country", countryName);
                }
                if (c6535f.m12248a("zipcode")) {
                    this.f10996a.put("zipcode", postalCode);
                }
                if (c6535f.m12248a("additionalInfo")) {
                    this.f10996a.put("additionalInfo", String.format(Locale.ENGLISH, "%s|%s", thoroughfare, str));
                }
                m12425b(c6535f, context);
            } catch (Throwable th4) {
                th = th4;
                z11 = true;
            }
            return z11;
        } catch (Throwable th5) {
            th = th5;
            z11 = true;
        }
    }

    public C6569l3(long j11) {
        this(j11, new JSONObject());
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo12303a() {
        try {
            return new JSONObject(this.f10996a.toString());
        } catch (JSONException e11) {
            C6514b.m12151b().m12159g(String.format("Failed converting to JSON event %s", "app/location"), e11.toString());
            return null;
        }
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: b */
    public final String mo12304b() {
        return "app/location";
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: c */
    public final long mo12305c() {
        return this.f10997b;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6619v3
    /* JADX INFO: renamed from: d */
    public final JSONObject mo12306d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "app/location");
            jSONObject.put("data", mo12303a());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC6524c3.m12209a();
            return jSONObject;
        }
    }

    public C6569l3(long j11, JSONObject jSONObject) {
        this.f10997b = j11;
        this.f10996a = jSONObject;
    }
}
