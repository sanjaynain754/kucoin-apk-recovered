package com.sumsub.sns.internal.log;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33293d {

    /* JADX INFO: renamed from: a */
    public static final Map f67871a = MapsKt.mapOf(TuplesKt.m90091to(6, ExifInterface.LONGITUDE_EAST), TuplesKt.m90091to(5, ExifInterface.LONGITUDE_WEST), TuplesKt.m90091to(3, "D"), TuplesKt.m90091to(4, "I"), TuplesKt.m90091to(2, ExifInterface.GPS_MEASUREMENT_INTERRUPTED));

    /* JADX INFO: renamed from: a */
    public static final void m71623a(String str, String str2, Throwable th2) {
        C33272c c33272c = C33272c.f67812a;
        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(str, str2, th2);
    }
}
