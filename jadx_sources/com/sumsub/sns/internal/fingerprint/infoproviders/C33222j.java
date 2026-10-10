package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33222j {

    /* JADX INFO: renamed from: a */
    public final InputManager f67770a;

    /* JADX INFO: renamed from: a */
    public final List m71586a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33222j.m71585a(this.f67764b);
            }
        });
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = listEmptyList;
        }
        return (List) objM71616a;
    }

    public C33222j(InputManager inputManager) {
        this.f67770a = inputManager;
    }

    /* JADX INFO: renamed from: a */
    public static final List m71585a(C33222j c33222j) {
        int[] inputDeviceIds;
        String name;
        InputManager inputManager = c33222j.f67770a;
        if (inputManager != null && (inputDeviceIds = inputManager.getInputDeviceIds()) != null) {
            ArrayList arrayList = new ArrayList(inputDeviceIds.length);
            for (int i11 : inputDeviceIds) {
                InputDevice inputDevice = c33222j.f67770a.getInputDevice(i11);
                String strValueOf = String.valueOf(inputDevice != null ? Integer.valueOf(inputDevice.getVendorId()) : null);
                if (inputDevice == null || (name = inputDevice.getName()) == null) {
                    name = "";
                }
                arrayList.add(new C33220i(name, strValueOf));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}
