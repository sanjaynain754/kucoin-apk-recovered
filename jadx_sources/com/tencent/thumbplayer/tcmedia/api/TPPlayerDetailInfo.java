package com.tencent.thumbplayer.tcmedia.api;

import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes62.dex */
public class TPPlayerDetailInfo {

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_CONFIGURE_END */
    @TPNativeKeyMap.MapDetailInfoType(16)
    public static final int f75806x4029493f = 16;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_CONFIGURE_START */
    @TPNativeKeyMap.MapDetailInfoType(15)
    public static final int f75807xdbc3f7c6 = 15;

    @TPNativeKeyMap.MapDetailInfoType(18)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_START_END = 18;

    @TPNativeKeyMap.MapDetailInfoType(17)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_AUDIO_MEDIACODEC_START_START = 17;

    @TPNativeKeyMap.MapDetailInfoType(4)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUXER_FILE_OPEN_END = 4;

    @TPNativeKeyMap.MapDetailInfoType(3)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUXER_FILE_OPEN_START = 3;

    @TPNativeKeyMap.MapDetailInfoType(5)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUX_THREAD_ON_PREAPRED = 5;

    @TPNativeKeyMap.MapDetailInfoType(2)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_DEMUX_THREAD_PREPARE_START = 2;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_AUDIO_DECODER_CREATE_START */
    @TPNativeKeyMap.MapDetailInfoType(8)
    public static final int f75808xc2476f13 = 8;

    @TPNativeKeyMap.MapDetailInfoType(10)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_AUDIO_FRAME_RENDERED = 10;

    @TPNativeKeyMap.MapDetailInfoType(0)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_START = 0;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_VIDEO_DECODER_CREATE_START */
    @TPNativeKeyMap.MapDetailInfoType(7)
    public static final int f75809x8e113f8e = 7;

    @TPNativeKeyMap.MapDetailInfoType(9)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_FIRST_VIDEO_FRAME_RENDERED = 9;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_PLAYER_SCHEDULING_THREAD_ON_PREAPRED */
    @TPNativeKeyMap.MapDetailInfoType(6)
    public static final int f75810xea5a37b8 = 6;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_PLAYER_SCHEDULING_THREAD_PREPARE_START */
    @TPNativeKeyMap.MapDetailInfoType(1)
    public static final int f75811x5e50cc3 = 1;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_FIRST_AUDIO_FRAME_RENDERED */
    public static final int f75812xfdb7ee58 = 1006;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_FIRST_VIDEO_FRAME_RENDERED */
    public static final int f75813x175a7713 = 1005;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_ON_PREPARED = 1004;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_PREPARE_START = 1003;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_SET_DATA_SOURCE_END = 1001;
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_TP_API_SET_DATA_SOURCE_START = 1000;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_CONFIGURE_END */
    @TPNativeKeyMap.MapDetailInfoType(12)
    public static final int f75814x7950643a = 12;

    /* JADX INFO: renamed from: TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_CONFIGURE_START */
    @TPNativeKeyMap.MapDetailInfoType(11)
    public static final int f75815x67904001 = 11;

    @TPNativeKeyMap.MapDetailInfoType(14)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_START_END = 14;

    @TPNativeKeyMap.MapDetailInfoType(13)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_TRACKING_VIDEO_MEDIACODEC_START_START = 13;

    @TPNativeKeyMap.MapDetailInfoType(-1)
    public static final int TP_PLAYER_DETAIL_INFO_TYPE_UNKNOWN = -1;
    public long timeSince1970Ms;

    @TPPlayerDetailInfoType
    public int type;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPPlayerDetailInfoType {
    }

    public TPPlayerDetailInfo(@TPPlayerDetailInfoType int i11) {
        this(i11, System.currentTimeMillis());
    }

    public TPPlayerDetailInfo(@TPPlayerDetailInfoType int i11, long j11) {
        this.type = i11;
        this.timeSince1970Ms = j11;
    }
}
