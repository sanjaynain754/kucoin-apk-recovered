package com.tencent.ugc;

import android.graphics.Bitmap;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.datereport.UGCDataReportDef;

/* JADX INFO: loaded from: classes2.dex */
public class UGCBeautyManager implements TXBeautyManager {
    private static final long MIN_REPORT_TIME_INTERVAL = 3000;
    private static final String TAG = "UGCBeautyManager";
    private final TXBeautyManagerImpl mBeautyManagerImpl;
    private boolean mIsUseBeautyFunction = false;
    private long mLastBeautyStyleReportTs;
    private long mLastSetFilterReportTs;
    private long mLastSetRuddyLevelReportTs;
    private long mLastWhitenessLevelReportTs;

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z11) {
        this.mIsUseBeautyFunction |= z11;
        this.mBeautyManagerImpl.enableSharpnessEnhancement(z11);
    }

    public boolean getIsUseBeautyFunction() {
        return this.mIsUseBeautyFunction;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(float f11) {
        this.mIsUseBeautyFunction |= f11 > 0.0f;
        this.mBeautyManagerImpl.setBeautyLevel(f11);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i11) {
        this.mBeautyManagerImpl.setBeautyStyle(i11);
        if (this.mLastBeautyStyleReportTs <= 0 || System.currentTimeMillis() - this.mLastBeautyStyleReportTs >= 3000) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_BEAUTY_SMOOTH, i11, null);
            this.mLastBeautyStyleReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setChinLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setChinLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeAngleLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setEyeAngleLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeDistanceLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setEyeDistanceLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeLightenLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setEyeLightenLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeScaleLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setEyeScaleLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceBeautyLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setFaceBeautyLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceNarrowLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setFaceNarrowLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceShortLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setFaceShortLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceSlimLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setFaceSlimLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceVLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setFaceVLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(Bitmap bitmap) {
        this.mIsUseBeautyFunction |= bitmap != null;
        this.mBeautyManagerImpl.setFilter(bitmap);
        if (this.mLastSetFilterReportTs <= 0 || System.currentTimeMillis() - this.mLastSetFilterReportTs >= 3000) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_FILTER);
            this.mLastSetFilterReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f11) {
        this.mBeautyManagerImpl.setFilterStrength(f11);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setForeheadLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setEyeDistanceLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setGreenScreenFile(String str) {
        LiteavLog.m76083e(TAG, "do not support setGreenScreenFile interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setLipsThicknessLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setLipsThicknessLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z11) {
        LiteavLog.m76083e(TAG, "do not support setMotionMute interface.");
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(String str) {
        LiteavLog.m76083e(TAG, "do not support setMotionTmpl interface.");
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setMouthShapeLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setMouthShapeLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNosePositionLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setNosePositionLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseSlimLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setNoseSlimLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseWingLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setNoseWingLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setPounchRemoveLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setPounchRemoveLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(float f11) {
        this.mIsUseBeautyFunction |= f11 > 0.0f;
        this.mBeautyManagerImpl.setRuddyLevel(f11);
        if (this.mLastSetRuddyLevelReportTs <= 0 || System.currentTimeMillis() - this.mLastSetRuddyLevelReportTs >= 3000) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_BEAUTY_RUDDY);
            this.mLastSetRuddyLevelReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setSmileLinesRemoveLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setSmileLinesRemoveLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setToothWhitenLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setToothWhitenLevel interface.");
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(float f11) {
        this.mIsUseBeautyFunction |= f11 > 0.0f;
        this.mBeautyManagerImpl.setWhitenessLevel(f11);
        if (this.mLastWhitenessLevelReportTs <= 0 || System.currentTimeMillis() - this.mLastWhitenessLevelReportTs >= 3000) {
            UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_RECORD_BEAUTY_WHITE);
            this.mLastWhitenessLevelReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setWrinkleRemoveLevel(float f11) {
        LiteavLog.m76083e(TAG, "do not support setWrinkleRemoveLevel interface.");
        return 0;
    }

    public UGCBeautyManager(long j11) {
        this.mBeautyManagerImpl = new TXBeautyManagerImpl(j11);
    }
}
