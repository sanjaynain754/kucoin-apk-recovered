package com.tencent.thumbplayer.tcmedia.api.composition;

import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.p155b.C35276a;
import com.tencent.thumbplayer.tcmedia.p155b.C35277b;
import com.tencent.thumbplayer.tcmedia.p155b.C35278c;
import com.tencent.thumbplayer.tcmedia.p155b.C35280e;
import com.tencent.thumbplayer.tcmedia.p155b.C35282g;
import com.tencent.thumbplayer.tcmedia.p155b.C35283h;
import com.tencent.thumbplayer.tcmedia.p155b.C35285j;
import com.tencent.thumbplayer.tcmedia.p155b.C35286k;
import com.tencent.thumbplayer.tcmedia.p155b.C35287l;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes62.dex */
public class TPMediaCompositionFactory {
    public static ITPMediaAsset createMediaRTCAsset(String str, String str2) {
        return new C35286k(str, str2);
    }

    public static ITPMediaTrack createMediaTrack(int i11) {
        return new C35282g(i11);
    }

    public static ITPMediaTrackClip createMediaTrackClip(String str, int i11) {
        return new C35283h(str, i11);
    }

    public static ITPMediaTrackClip createEmptyTrackClip(int i11, long j11, long j12) {
        C35276a c35276a = new C35276a(i11);
        c35276a.setCutTimeRange(j11, j12);
        return c35276a;
    }

    public static ITPMediaAssetExtraParam createMediaAssetExtraParam() {
        return new C35277b();
    }

    public static ITPMediaAssetOrderedMap createMediaAssetOrderedMap() {
        return new C35278c();
    }

    public static ITPMediaComposition createMediaComposition() {
        return new C35280e();
    }

    public static ITPMediaDRMAsset createMediaDRMAsset(@TPCommonEnum.TP_DRM_TYPE int i11, String str) {
        return new C35285j(i11, str);
    }

    public static ITPMediaAsset createMediaRTCAsset(String str, String str2, int i11) {
        return new C35286k(str, str2, i11);
    }

    public static ITPMediaTrack createMediaTrack(int i11, List<ITPMediaTrackClip> list) {
        C35282g c35282g = new C35282g(i11);
        Iterator<ITPMediaTrackClip> it = list.iterator();
        while (it.hasNext()) {
            c35282g.addTrackClip(it.next());
        }
        return c35282g;
    }

    public static ITPMediaTrackClip createMediaTrackClip(String str, int i11, long j11, long j12) {
        return new C35283h(str, i11, j11, j12);
    }

    public static ITPMediaUrlAsset createMediaUrlAsset(String str) {
        return new C35287l(str);
    }

    public static ITPMediaTrack createMediaTrack(int i11, ITPMediaTrackClip... iTPMediaTrackClipArr) {
        C35282g c35282g = new C35282g(i11);
        for (ITPMediaTrackClip iTPMediaTrackClip : iTPMediaTrackClipArr) {
            c35282g.addTrackClip(iTPMediaTrackClip);
        }
        return c35282g;
    }
}
