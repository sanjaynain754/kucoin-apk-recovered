package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.hardware.Camera;
import com.jumio.core.constants.ConstantsKt;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.util.LinkedList;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33208c {
    /* JADX INFO: renamed from: a */
    public final List m71558a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33208c.m71557a(this.f67786b);
            }
        });
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = listEmptyList;
        }
        return (List) objM71616a;
    }

    /* JADX INFO: renamed from: a */
    public static final List m71557a(C33208c c33208c) {
        String str;
        c33208c.getClass();
        int numberOfCameras = Camera.getNumberOfCameras();
        LinkedList linkedList = new LinkedList();
        for (int i11 = 0; i11 < numberOfCameras; i11++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i11, cameraInfo);
            int i12 = cameraInfo.facing;
            if (i12 == 0) {
                str = ConstantsKt.FACE_CAPTURE_MODE_BACK;
            } else if (i12 != 1) {
                str = "";
            } else {
                str = ConstantsKt.FACE_CAPTURE_MODE_FRONT;
            }
            linkedList.add(new C33206b(String.valueOf(i11), str, String.valueOf(cameraInfo.orientation)));
        }
        return linkedList;
    }
}
