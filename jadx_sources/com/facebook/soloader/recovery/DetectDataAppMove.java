package com.facebook.soloader.recovery;

import android.content.Context;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.RecoverableSoSource;
import com.facebook.soloader.SoSource;
import java.io.File;

/* JADX INFO: loaded from: classes45.dex */
public class DetectDataAppMove implements RecoveryStrategy {
    private static final String TAG = "soloader.recovery.DetectDataAppMove";
    private final BaseApkPathHistory mBaseApkPathHistory;
    private final Context mContext;
    private final int mInitialHistorySize;

    /* JADX WARN: Multi-variable type inference failed */
    private void recoverSoSources(SoSource[] soSourceArr) {
        for (int i11 = 0; i11 < soSourceArr.length; i11++) {
            Object[] objArr = soSourceArr[i11];
            if (objArr instanceof RecoverableSoSource) {
                soSourceArr[i11] = ((RecoverableSoSource) objArr).recover(this.mContext);
            }
        }
    }

    private String getBaseApkPath() {
        return this.mContext.getApplicationInfo().sourceDir;
    }

    public DetectDataAppMove(Context context, BaseApkPathHistory baseApkPathHistory) {
        this.mContext = context;
        this.mBaseApkPathHistory = baseApkPathHistory;
        this.mInitialHistorySize = baseApkPathHistory.size();
    }

    private boolean detectMove() {
        String baseApkPath = getBaseApkPath();
        if (new File(baseApkPath).exists() && this.mBaseApkPathHistory.recordPathIfNew(baseApkPath)) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (detectMove()) {
            recoverSoSources(soSourceArr);
            return true;
        }
        if (this.mInitialHistorySize != this.mBaseApkPathHistory.size()) {
            LogUtil.m10658w(TAG, "Context was updated (perhaps by another thread)");
            return true;
        }
        return false;
    }
}
