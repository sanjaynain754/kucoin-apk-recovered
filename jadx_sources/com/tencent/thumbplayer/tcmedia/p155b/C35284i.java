package com.tencent.thumbplayer.tcmedia.p155b;

import android.util.Xml;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.tcmedia.utils.C35422b;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.i */
/* JADX INFO: loaded from: classes62.dex */
public class C35284i {
    /* JADX INFO: renamed from: a */
    private static String m77871a(int i11, boolean z11) {
        if (i11 == 1) {
            return z11 ? "av_tracks" : "av_track";
        }
        if (i11 == 2) {
            return z11 ? "video_tracks" : "video_track";
        }
        if (i11 == 3) {
            return z11 ? "audio_tracks" : "audio_track";
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static String m77872a(ITPMediaComposition iTPMediaComposition) throws IOException {
        if (iTPMediaComposition == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        List<ITPMediaTrack> allAVTracks = iTPMediaComposition.getAllAVTracks();
        if (C35422b.m78845a(allAVTracks)) {
            List<ITPMediaTrack> allVideoTracks = iTPMediaComposition.getAllVideoTracks();
            List<ITPMediaTrack> allAudioTracks = iTPMediaComposition.getAllAudioTracks();
            if (C35422b.m78845a(allVideoTracks) && C35422b.m78845a(allAudioTracks)) {
                return "";
            }
            C35280e c35280e = (C35280e) iTPMediaComposition;
            long jM77865a = c35280e.m77865a();
            m77882a(xmlSerializerNewSerializer, allVideoTracks, 2, c35280e.m77866b());
            m77882a(xmlSerializerNewSerializer, allAudioTracks, 3, jM77865a);
        } else {
            m77882a(xmlSerializerNewSerializer, allAVTracks, 1, 0L);
        }
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: b */
    private static void m77884b(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j11) throws IOException {
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("1");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_playTimeMs");
        xmlSerializer.text(j11 > 0 ? Long.toString(iTPMediaTrackClip.getOriginalDurationMs() - j11) : Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        xmlSerializer.endTag("", "clip_playTimeMs");
        xmlSerializer.endTag("", "track_clip");
    }

    /* JADX INFO: renamed from: c */
    private static void m77885c(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j11) throws IOException {
        String string;
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("0");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_path");
        xmlSerializer.text(m77876a(iTPMediaTrackClip.getFilePath()));
        xmlSerializer.endTag("", "clip_path");
        xmlSerializer.startTag("", "clip_startTimeMs");
        xmlSerializer.text(Long.toString(iTPMediaTrackClip.getStartTimeMs()));
        xmlSerializer.endTag("", "clip_startTimeMs");
        xmlSerializer.startTag("", "clip_durationMs");
        xmlSerializer.text(Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        xmlSerializer.endTag("", "clip_durationMs");
        if (j11 > 0) {
            long endTimeMs = iTPMediaTrackClip.getEndTimeMs() - j11;
            long originalDurationMs = iTPMediaTrackClip.getOriginalDurationMs() - j11;
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(Long.toString(endTimeMs));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            string = Long.toString(originalDurationMs);
        } else {
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(Long.toString(iTPMediaTrackClip.getEndTimeMs()));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            string = Long.toString(iTPMediaTrackClip.getOriginalDurationMs());
        }
        xmlSerializer.text(string);
        xmlSerializer.endTag("", "clip_playTimeMs");
        xmlSerializer.endTag("", "track_clip");
    }

    /* JADX INFO: renamed from: a */
    public static String m77873a(ITPMediaDRMAsset iTPMediaDRMAsset) throws IOException {
        if (iTPMediaDRMAsset == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        xmlSerializerNewSerializer.startTag("", "av_tracks");
        xmlSerializerNewSerializer.startTag("", "av_track");
        xmlSerializerNewSerializer.startTag("", "track_clip");
        xmlSerializerNewSerializer.startTag("", "clip_id");
        xmlSerializerNewSerializer.text(Integer.toString(0));
        xmlSerializerNewSerializer.endTag("", "clip_id");
        xmlSerializerNewSerializer.startTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.text("0");
        xmlSerializerNewSerializer.endTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.startTag("", "clip_path");
        xmlSerializerNewSerializer.text(m77876a(iTPMediaDRMAsset.getDrmPlayUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_path");
        xmlSerializerNewSerializer.startTag("", "clip_drmType");
        xmlSerializerNewSerializer.text(String.valueOf(TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapDrmType.class, iTPMediaDRMAsset.getDrmType())));
        xmlSerializerNewSerializer.endTag("", "clip_drmType");
        xmlSerializerNewSerializer.startTag("", "clip_drmProvisionUrl");
        xmlSerializerNewSerializer.text(m77876a(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PROVISION_URL, "")));
        xmlSerializerNewSerializer.endTag("", "clip_drmProvisionUrl");
        xmlSerializerNewSerializer.startTag("", "clip_drmLicenseUrl");
        xmlSerializerNewSerializer.text(m77876a(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_URL, "")));
        xmlSerializerNewSerializer.endTag("", "clip_drmLicenseUrl");
        xmlSerializerNewSerializer.startTag("", "clip_drmUseL1");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_DRM_USEL1, "1"));
        xmlSerializerNewSerializer.endTag("", "clip_drmUseL1");
        xmlSerializerNewSerializer.startTag("", "clip_drmSavePath");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_SAVE_PATH, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmSavePath");
        xmlSerializerNewSerializer.startTag("", "clip_drmGuid");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_GUID, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmGuid");
        xmlSerializerNewSerializer.startTag("", "clip_drmPlatform");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PLATFORM, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmPlatform");
        xmlSerializerNewSerializer.startTag("", "clip_drmAppVersion");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_APPVER, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmAppVersion");
        xmlSerializerNewSerializer.startTag("", "clip_drmCookie");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_COOKIE, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmCookie");
        xmlSerializerNewSerializer.startTag("", "clip_drmLicenseStandardization");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION, "0"));
        xmlSerializerNewSerializer.endTag("", "clip_drmLicenseStandardization");
        xmlSerializerNewSerializer.startTag("", "clip_drmCommonKey");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_EXT_X_KEY, ""));
        xmlSerializerNewSerializer.endTag("", "clip_drmCommonKey");
        xmlSerializerNewSerializer.startTag("", "clip_drmOfflineKeySetId");
        xmlSerializerNewSerializer.text(iTPMediaDRMAsset.getOfflineKeySetId());
        xmlSerializerNewSerializer.endTag("", "clip_drmOfflineKeySetId");
        Map<String, String> httpHeader = iTPMediaDRMAsset.getHttpHeader();
        StringBuilder sb2 = new StringBuilder();
        if (httpHeader != null && httpHeader.size() > 0) {
            xmlSerializerNewSerializer.startTag("", "clip_drmLicenseHttpHeaders");
            for (Map.Entry<String, String> entry : httpHeader.entrySet()) {
                sb2.append(entry.getKey());
                sb2.append("=");
                sb2.append(entry.getValue());
                sb2.append(";");
            }
            xmlSerializerNewSerializer.text(sb2.toString());
            xmlSerializerNewSerializer.endTag("", "clip_drmLicenseHttpHeaders");
        }
        xmlSerializerNewSerializer.startTag("", "clip_preferredProperty");
        m77878a(xmlSerializerNewSerializer, iTPMediaDRMAsset);
        xmlSerializerNewSerializer.endTag("", "clip_preferredProperty");
        xmlSerializerNewSerializer.endTag("", "track_clip");
        xmlSerializerNewSerializer.endTag("", "av_track");
        xmlSerializerNewSerializer.endTag("", "av_tracks");
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m77874a(ITPMediaRTCAsset iTPMediaRTCAsset) throws IOException {
        if (iTPMediaRTCAsset == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        xmlSerializerNewSerializer.startTag("", "av_tracks");
        xmlSerializerNewSerializer.startTag("", "av_track");
        xmlSerializerNewSerializer.startTag("", "track_clip");
        xmlSerializerNewSerializer.startTag("", "clip_id");
        xmlSerializerNewSerializer.text(Integer.toString(0));
        xmlSerializerNewSerializer.endTag("", "clip_id");
        xmlSerializerNewSerializer.startTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.text("0");
        xmlSerializerNewSerializer.endTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.startTag("", "clip_path");
        xmlSerializerNewSerializer.text(m77876a(iTPMediaRTCAsset.getRtcStreamUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_path");
        xmlSerializerNewSerializer.startTag("", "clip_rtcServerUrl");
        xmlSerializerNewSerializer.text(m77876a(iTPMediaRTCAsset.getRtcServerUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_rtcServerUrl");
        xmlSerializerNewSerializer.startTag("", "clip_rtcSdpExchangeType");
        xmlSerializerNewSerializer.text(Integer.toString(iTPMediaRTCAsset.getRtcSdpExchangeType()));
        xmlSerializerNewSerializer.endTag("", "clip_rtcSdpExchangeType");
        xmlSerializerNewSerializer.startTag("", "clip_preferredProperty");
        m77878a(xmlSerializerNewSerializer, iTPMediaRTCAsset);
        xmlSerializerNewSerializer.endTag("", "clip_preferredProperty");
        xmlSerializerNewSerializer.endTag("", "track_clip");
        xmlSerializerNewSerializer.endTag("", "av_track");
        xmlSerializerNewSerializer.endTag("", "av_tracks");
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m77875a(ITPMediaUrlAsset iTPMediaUrlAsset) throws IOException {
        if (iTPMediaUrlAsset == null) {
            return "";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        xmlSerializerNewSerializer.startTag("", "av_tracks");
        xmlSerializerNewSerializer.startTag("", "av_track");
        xmlSerializerNewSerializer.startTag("", "track_clip");
        xmlSerializerNewSerializer.startTag("", "clip_id");
        xmlSerializerNewSerializer.text(Integer.toString(0));
        xmlSerializerNewSerializer.endTag("", "clip_id");
        xmlSerializerNewSerializer.startTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.text("0");
        xmlSerializerNewSerializer.endTag("", "clip_placeHolder");
        xmlSerializerNewSerializer.startTag("", "clip_path");
        xmlSerializerNewSerializer.text(m77876a(iTPMediaUrlAsset.getStreamUrl()));
        xmlSerializerNewSerializer.endTag("", "clip_path");
        xmlSerializerNewSerializer.startTag("", "clip_preferredProperty");
        m77878a(xmlSerializerNewSerializer, iTPMediaUrlAsset);
        xmlSerializerNewSerializer.endTag("", "clip_preferredProperty");
        xmlSerializerNewSerializer.endTag("", "track_clip");
        xmlSerializerNewSerializer.endTag("", "av_track");
        xmlSerializerNewSerializer.endTag("", "av_tracks");
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m77876a(String str) {
        return str.replaceAll("[^\t\r\n -\ud7ff\ue000-�𐀀-\u10ffff]+", "");
    }

    /* JADX INFO: renamed from: a */
    public static String m77877a(List<ITPMediaTrackClip> list, int i11) throws IOException {
        String str;
        String str2;
        if (C35422b.m78845a(list)) {
            return "";
        }
        if (i11 == 1) {
            str = "av_tracks";
            str2 = "av_track";
        } else if (i11 == 2) {
            str = "video_tracks";
            str2 = "video_track";
        } else {
            if (i11 != 3) {
                return "";
            }
            str = "audio_tracks";
            str2 = "audio_track";
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
        xmlSerializerNewSerializer.startTag("", "assets");
        m77883a(xmlSerializerNewSerializer, list, str, str2);
        xmlSerializerNewSerializer.endTag("", "assets");
        xmlSerializerNewSerializer.endDocument();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m77878a(XmlSerializer xmlSerializer, ITPMediaAsset iTPMediaAsset) throws IOException {
        ITPMediaAssetExtraParam extraParam = iTPMediaAsset.getExtraParam();
        if (extraParam == null) {
            return;
        }
        m77879a(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_AUDIO);
        m77879a(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_SUBTITLE);
        m77879a(xmlSerializer, extraParam, ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_VIDEO);
    }

    /* JADX INFO: renamed from: a */
    private static void m77879a(XmlSerializer xmlSerializer, ITPMediaAssetExtraParam iTPMediaAssetExtraParam, String str) throws IOException {
        C35278c c35278c = (C35278c) iTPMediaAssetExtraParam.getExtraObject(str);
        if (c35278c == null) {
            return;
        }
        xmlSerializer.startTag("", str);
        xmlSerializer.text(m77876a(c35278c.getKeyValueStr()));
        xmlSerializer.endTag("", str);
    }

    /* JADX INFO: renamed from: a */
    private static void m77880a(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip) throws IOException {
        m77881a(xmlSerializer, iTPMediaTrackClip, 0L);
    }

    /* JADX INFO: renamed from: a */
    private static void m77881a(XmlSerializer xmlSerializer, ITPMediaTrackClip iTPMediaTrackClip, long j11) throws IOException {
        if (iTPMediaTrackClip instanceof C35276a) {
            m77884b(xmlSerializer, iTPMediaTrackClip, j11);
        } else if (iTPMediaTrackClip instanceof C35283h) {
            m77885c(xmlSerializer, iTPMediaTrackClip, j11);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m77882a(XmlSerializer xmlSerializer, List<ITPMediaTrack> list, int i11, long j11) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    String strM77871a = m77871a(i11, true);
                    String strM77871a2 = m77871a(i11, false);
                    xmlSerializer.startTag("", strM77871a);
                    for (ITPMediaTrack iTPMediaTrack : list) {
                        if (iTPMediaTrack.getMediaType() == i11) {
                            xmlSerializer.startTag("", strM77871a2);
                            xmlSerializer.startTag("", "track_id");
                            xmlSerializer.text(Integer.toString(iTPMediaTrack.getTrackId()));
                            xmlSerializer.endTag("", "track_id");
                            if (i11 == 1 || !C35281f.f75834a.equals("base_audio") || iTPMediaTrack.getTimelineDurationMs() <= j11) {
                                Iterator<ITPMediaTrackClip> it = iTPMediaTrack.getAllTrackClips().iterator();
                                while (it.hasNext()) {
                                    m77880a(xmlSerializer, it.next());
                                }
                            } else {
                                long originalDurationMs = 0;
                                for (ITPMediaTrackClip iTPMediaTrackClip : iTPMediaTrack.getAllTrackClips()) {
                                    originalDurationMs += iTPMediaTrackClip.getOriginalDurationMs();
                                    if (originalDurationMs > j11) {
                                        m77881a(xmlSerializer, iTPMediaTrackClip, originalDurationMs - j11);
                                        break;
                                    }
                                    m77880a(xmlSerializer, iTPMediaTrackClip);
                                }
                            }
                            xmlSerializer.endTag("", strM77871a2);
                        }
                    }
                    xmlSerializer.endTag("", strM77871a);
                }
            } catch (IOException e11) {
                TPLogUtil.m78798e("TPMediaCompositionXmlGenerator", e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m77883a(XmlSerializer xmlSerializer, List<ITPMediaTrackClip> list, String str, String str2) throws IOException {
        xmlSerializer.startTag("", str);
        xmlSerializer.startTag("", str2);
        Iterator<ITPMediaTrackClip> it = list.iterator();
        while (it.hasNext()) {
            m77880a(xmlSerializer, it.next());
        }
        xmlSerializer.endTag("", str2);
        xmlSerializer.endTag("", str);
    }
}
