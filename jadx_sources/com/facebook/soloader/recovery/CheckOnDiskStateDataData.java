package com.facebook.soloader.recovery;

import com.facebook.soloader.BackupSoSource;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.SoLoaderULError;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.UnpackingSoSource;

/* JADX INFO: loaded from: classes45.dex */
public class CheckOnDiskStateDataData implements RecoveryStrategy {
    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (!(unsatisfiedLinkError instanceof SoLoaderULError)) {
            return false;
        }
        LogUtil.m10652e(SoLoader.TAG, "Checking /data/data missing libraries.");
        boolean z11 = false;
        for (SoSource soSource : soSourceArr) {
            if ((soSource instanceof UnpackingSoSource) && !(soSource instanceof BackupSoSource)) {
                UnpackingSoSource unpackingSoSource = (UnpackingSoSource) soSource;
                try {
                    for (UnpackingSoSource.Dso dso : unpackingSoSource.getDsosBaseApk()) {
                        if (unpackingSoSource.getSoFileByName(dso.name) == null) {
                            LogUtil.m10652e(SoLoader.TAG, "Missing " + dso.name + " from " + unpackingSoSource.getName() + ", will force prepare.");
                            unpackingSoSource.prepare(2);
                            z11 = true;
                            break;
                        }
                    }
                } catch (Exception e11) {
                    LogUtil.m10653e(SoLoader.TAG, "Encountered an exception while recovering from /data/data failure ", e11);
                    return false;
                }
            }
        }
        if (z11) {
            LogUtil.m10652e(SoLoader.TAG, "Successfully recovered from /data/data disk failure.");
            return true;
        }
        LogUtil.m10652e(SoLoader.TAG, "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
