package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33232o {

    /* JADX INFO: renamed from: a */
    public final SensorManager f67777a;

    /* JADX INFO: renamed from: a */
    public final List m71604a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33232o.m71603a(this.f67779b);
            }
        });
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = listEmptyList;
        }
        return (List) objM71616a;
    }

    public C33232o(SensorManager sensorManager) {
        this.f67777a = sensorManager;
    }

    /* JADX INFO: renamed from: a */
    public static final List m71603a(C33232o c33232o) {
        List<Sensor> sensorList;
        SensorManager sensorManager = c33232o.f67777a;
        if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sensorList, 10));
            for (Sensor sensor : sensorList) {
                arrayList.add(new C33230n(sensor.getName(), sensor.getVendor()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}
