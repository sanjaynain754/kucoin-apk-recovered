package com.sensorsdata.analytics.android.sdk;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes59.dex */
public class SensorsDataScreenOrientationDetector extends OrientationEventListener {
    private int mCurrentOrientation;

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i11) {
        if (i11 == -1) {
            return;
        }
        if (i11 < 45 || i11 > 315) {
            this.mCurrentOrientation = 0;
            return;
        }
        if (i11 > 45 && i11 < 135) {
            this.mCurrentOrientation = 90;
            return;
        }
        if (i11 > 135 && i11 < 225) {
            this.mCurrentOrientation = 180;
        } else {
            if (i11 <= 225 || i11 >= 315) {
                return;
            }
            this.mCurrentOrientation = 270;
        }
    }

    public String getOrientation() {
        int i11 = this.mCurrentOrientation;
        if (i11 == 0 || i11 == 180) {
            return "portrait";
        }
        if (i11 == 90 || i11 == 270) {
            return "landscape";
        }
        return null;
    }

    public SensorsDataScreenOrientationDetector(Context context, int i11) {
        super(context, i11);
    }
}
