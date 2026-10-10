package com.sensorsdata.abtest.core;

import com.sensorsdata.abtest.entity.SABErrorEnum;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes59.dex */
public class SABErrorDispatcher {
    private static final String TAG = "SAB.GlobalException";

    /* JADX WARN: Code duplicated, block: B:6:0x000c A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0002, B:5:0x0005, B:7:0x000e, B:6:0x000c), top: B:12:0x0002 }] */
    public static void dispatchSABException(SABErrorEnum sABErrorEnum, Object... objArr) {
        String str;
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    str = String.format(sABErrorEnum.message, objArr);
                } else {
                    str = sABErrorEnum.message;
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                return;
            }
        } else {
            str = sABErrorEnum.message;
        }
        SALog.m68589i(TAG, "error code: " + sABErrorEnum.code + " , message: " + str);
    }
}
