package com.facebook.soloader.recovery;

import com.facebook.soloader.BackupSoSource;
import com.facebook.soloader.DirectorySoSource;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.facebook.soloader.SoLoaderULError;
import com.facebook.soloader.SoSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class ReunpackBackupSoSources implements RecoveryStrategy {
    private int mRecoveryFlags;

    public ReunpackBackupSoSources() {
        this(0);
    }

    private boolean recoverDSONotFoundError(SoSource[] soSourceArr, String str, int i11) {
        try {
            for (SoSource soSource : soSourceArr) {
                if ((soSource instanceof BackupSoSource) && ((BackupSoSource) soSource).peekAndPrepareSoSource(str, i11)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e11) {
            LogUtil.m10652e(SoLoader.TAG, "Failed to run recovery for backup so source due to: " + e11);
            return false;
        }
    }

    public ReunpackBackupSoSources(int i11) {
        this.mRecoveryFlags = i11;
    }

    private boolean lazyPrepareBackupSoSource(SoSource[] soSourceArr, String str) {
        for (SoSource soSource : soSourceArr) {
            if (soSource instanceof BackupSoSource) {
                BackupSoSource backupSoSource = (BackupSoSource) soSource;
                try {
                    LogUtil.m10652e(SoLoader.TAG, "Preparing BackupSoSource for the first time " + backupSoSource.getName());
                    backupSoSource.prepare(0);
                    for (SoSource soSource2 : soSourceArr) {
                        if ((soSource2 instanceof DirectorySoSource) && !(soSource2 instanceof BackupSoSource)) {
                            ((DirectorySoSource) soSource2).setExplicitDependencyResolution();
                        }
                    }
                    return true;
                } catch (Exception e11) {
                    LogUtil.m10653e(SoLoader.TAG, "Encountered an exception while reunpacking BackupSoSource " + backupSoSource.getName() + " for library " + str + ": ", e11);
                    break;
                }
            }
        }
        return false;
    }

    private void logRecovery(Error error, String str) {
        LogUtil.m10652e(SoLoader.TAG, "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (!(unsatisfiedLinkError instanceof SoLoaderULError)) {
            return false;
        }
        SoLoaderULError soLoaderULError = (SoLoaderULError) unsatisfiedLinkError;
        String soName = soLoaderULError.getSoName();
        String message = soLoaderULError.getMessage();
        if (soName == null) {
            LogUtil.m10652e(SoLoader.TAG, "No so name provided in ULE, cannot recover");
            return false;
        }
        if (soLoaderULError instanceof SoLoaderDSONotFoundError) {
            if ((this.mRecoveryFlags & 1) == 0) {
                return false;
            }
            logRecovery(soLoaderULError, soName);
            return recoverDSONotFoundError(soSourceArr, soName, 0);
        }
        if (message == null || !(message.contains("/app/") || message.contains("/mnt/"))) {
            return false;
        }
        logRecovery(soLoaderULError, soName);
        return lazyPrepareBackupSoSource(soSourceArr, soName);
    }
}
