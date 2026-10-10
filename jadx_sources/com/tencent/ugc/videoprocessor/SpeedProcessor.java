package com.tencent.ugc.videoprocessor;

import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SpeedProcessor {
    private List<TXVideoEditConstants.TXSpeed> mSpeedList;

    public void clear() {
        List<TXVideoEditConstants.TXSpeed> list = this.mSpeedList;
        if (list != null) {
            list.clear();
        }
        this.mSpeedList = null;
    }

    public float findSpeedByLevel(int i11) {
        if (i11 == 0) {
            return 0.25f;
        }
        if (i11 == 1) {
            return 0.5f;
        }
        if (i11 != 3) {
            return i11 != 4 ? 1.0f : 2.0f;
        }
        return 1.5f;
    }

    public float getSpeedLevel(long j11) {
        List<TXVideoEditConstants.TXSpeed> list = this.mSpeedList;
        if (list != null && list.size() != 0) {
            for (TXVideoEditConstants.TXSpeed tXSpeed : this.mSpeedList) {
                if (j11 > tXSpeed.startTime * 1000 && j11 < tXSpeed.endTime * 1000) {
                    return findSpeedByLevel(tXSpeed.speedLevel);
                }
            }
        }
        return 1.0f;
    }

    public List<TXVideoEditConstants.TXSpeed> getSpeedList() {
        return this.mSpeedList;
    }

    public boolean isSpeedListExist() {
        if (CollectionUtils.isEmpty(this.mSpeedList)) {
            return false;
        }
        Iterator<TXVideoEditConstants.TXSpeed> it = this.mSpeedList.iterator();
        while (it.hasNext()) {
            if (it.next().speedLevel != 2) {
                return true;
            }
        }
        return false;
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        this.mSpeedList = list;
    }
}
