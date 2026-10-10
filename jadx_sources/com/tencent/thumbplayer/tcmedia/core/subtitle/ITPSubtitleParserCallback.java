package com.tencent.thumbplayer.tcmedia.core.subtitle;

import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;

/* JADX INFO: loaded from: classes64.dex */
public interface ITPSubtitleParserCallback {
    long onGetCurrentPlayPositionMs();

    void onLoadResult(int i11);

    void onSelectResult(int i11, long j11);

    void onSubtitleError(int i11, int i12);

    void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame);

    void onSubtitleNote(String str);
}
