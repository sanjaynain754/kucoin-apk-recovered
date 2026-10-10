package com.tencent.rtmp;

import android.os.Bundle;

/* JADX INFO: loaded from: classes56.dex */
public interface ITXVodPlayListener {
    void onNetStatus(TXVodPlayer tXVodPlayer, Bundle bundle);

    void onPlayEvent(TXVodPlayer tXVodPlayer, int i11, Bundle bundle);

    public static abstract class ITXVodSubtitleDataListener {
        public void onSubtitleData(TXVodDef.TXVodSubtitleData tXVodSubtitleData) {
        }
    }
}
