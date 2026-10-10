package com.facebook.soloader.recovery;

import com.facebook.soloader.SoSource;

/* JADX INFO: loaded from: classes45.dex */
public class CompositeRecoveryStrategy implements RecoveryStrategy {
    private int mCurrentStrategy = 0;
    private final RecoveryStrategy[] mStrategies;

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        int i11;
        RecoveryStrategy[] recoveryStrategyArr;
        do {
            i11 = this.mCurrentStrategy;
            recoveryStrategyArr = this.mStrategies;
            if (i11 >= recoveryStrategyArr.length) {
                return false;
            }
            this.mCurrentStrategy = i11 + 1;
        } while (!recoveryStrategyArr[i11].recover(unsatisfiedLinkError, soSourceArr));
        return true;
    }

    public CompositeRecoveryStrategy(RecoveryStrategy... recoveryStrategyArr) {
        this.mStrategies = recoveryStrategyArr;
    }
}
