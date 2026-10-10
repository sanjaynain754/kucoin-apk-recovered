.class public Lcom/tencent/thumbplayer/tcmedia/c/k;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;Ljava/util/Map;Ljava/util/Map;)Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadParam;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadParam;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_2c

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getUrlCdnidList()Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getUrlCdnidList()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getUrlCdnidList()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getUrlCdnidHttpHeaderList()Ljava/util/ArrayList;

    move-result-object p0

    goto :goto_4

    :cond_1
    :goto_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    :goto_1
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object p0, p1, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->url:Ljava/lang/String;

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getBakUrl()[Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    array-length v4, p0

    if-lez v4, :cond_4

    :goto_3
    array-length v4, p0

    if-ge v0, v4, :cond_4

    aget-object v4, p0, v0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    aget-object v4, p0, v0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    if-eqz p2, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    move-object p0, v1

    :goto_4
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFlowId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "TPProxyUtils"

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFlowId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dl_param_play_flowid"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFlowId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getUrlExpireTime()I

    move-result v0

    if-lez v0, :cond_7

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getUrlExpireTime()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "dl_param_url_expire_time"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFileSize()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_8

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFileSize()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v4, "dl_param_file_size"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFileDuration()J

    move-result-wide v4

    cmp-long v0, v4, v6

    if-lez v0, :cond_9

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFileDuration()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v4, "dl_param_file_duration"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getDownloadFileID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "dl_param_play_keyid"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getDownloadFileID()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getVid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "dl_param_vid"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getVid()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPlayDefinition()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "dl_param_play_definition"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPlayDefinition()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getCurrentFormat()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "dl_param_current_format"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getCurrentFormat()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getCurrentFormatID()I

    move-result v0

    if-lez v0, :cond_e

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getCurrentFormatID()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "dl_param_current_formatid"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFormatInfo()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/thumbplayer/tcmedia/utils/b;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v0, "dl_param_format_info"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFormatInfo()Ljava/util/Map;

    move-result-object v4

    invoke-interface {p2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getBandwidthLevel()I

    move-result v0

    if-lez v0, :cond_10

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getBandwidthLevel()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "dl_param_band_width_level"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->isCharge()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v4, "dl_param_source_is_charge"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->isNeedEncryptCache()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v4, "dl_param_cache_need_encrypt"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->isOffline()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v4, "dl_param_is_offline"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->isExtraParam()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v4, "dl_param_enable_expand_donwload_url"

    invoke-interface {p2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p0, :cond_11

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    const-string v0, "dl_param_url_header"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPreloadSize()J

    move-result-wide v4

    cmp-long p0, v4, v6

    if-lez p0, :cond_12

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPreloadSize()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string v0, "dl_param_preload_size"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPreloadDuration()J

    move-result-wide v4

    cmp-long p0, v4, v6

    if-lez p0, :cond_13

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPreloadDuration()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string v0, "dl_param_preload_duration"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getSavePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_14

    const-string p0, "dl_param_save_path"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getStarTimeMS()I

    move-result p0

    if-lez p0, :cond_15

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getStarTimeMS()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "dl_param_play_start_time"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getEndTimeMS()I

    move-result p0

    if-lez p0, :cond_16

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getEndTimeMS()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "dl_param_play_end_time"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getClipCount()I

    move-result p0

    if-lez p0, :cond_17

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getClipCount()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "dl_param_play_clip_count"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getClipNo()I

    move-result p0

    if-lez p0, :cond_18

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getClipNo()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "dl_param_play_clip_no"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getBase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_19

    const-string p0, "dl_param_vinfo_base"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getBase()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getLinkVid()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1a

    const-string p0, "dl_param_vinfo_link_vid"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getLinkVid()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1a
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFileMD5()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1b

    const-string p0, "dl_param_file_md5"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFileMD5()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getM3u8()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1c

    const-string p0, "dl_param_vinfo_m3u8"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getM3u8()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getTm()J

    move-result-wide v4

    cmp-long p0, v4, v6

    if-lez p0, :cond_1d

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getTm()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string v0, "dl_param_vinfo_tm"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1d
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getNonce()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1e

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "nonce:"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getNonce()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "dl_param_nonce"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getNonce()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getDecKey()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1f

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "encrypt stream key:"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getDecKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "dl_param_encrypt_stream_key"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getDecKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1f
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getRandoms()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_20

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "encrypt randoms:"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getRandoms()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "dl_param_encrypt_stream_randoms"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getRandoms()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_20
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getFp2p()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "dl_param_vinfo_fp2p"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getTestid()I

    move-result p0

    if-lez p0, :cond_21

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getTestid()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "dl_param_vinfo_testid"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_21
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getExceptDelay()I

    move-result p0

    if-lez p0, :cond_22

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getExceptDelay()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "dl_param_expect_delay_time"

    invoke-interface {p2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_22
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getSecondaryM3u8List()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_23

    const-string p0, "dl_param_vinfo_secondary_m3u8"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getSecondaryM3u8List()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_23
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getExtInfoMap()Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/thumbplayer/tcmedia/utils/b;->a(Ljava/util/Map;)Z

    move-result p0

    if-nez p0, :cond_24

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getExtInfoMap()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_24
    const-string p0, "dl_param_format_nodes"

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getDefInfoList()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_25

    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_25

    invoke-interface {p2, p3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_25
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPcdnUrlList()Ljava/util/ArrayList;

    move-result-object p0

    const-string p3, ";"

    const-string v0, ""

    if-eqz p0, :cond_28

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPcdnUrlList()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_28

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPcdnUrlList()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_27

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    :cond_27
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "pcdn url list: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/tencent/thumbplayer/tcmedia/utils/TPLogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "dl_param_pcdn_urls"

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_28
    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPcdnVtList()Ljava/util/ArrayList;

    move-result-object p0

    if-eqz p0, :cond_2b

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPcdnVtList()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2b

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getPcdnVtList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result p3

    if-lez p3, :cond_2a

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result p3

    sub-int/2addr p3, v2

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    :cond_2a
    const-string p3, "dl_param_pcdn_vts"

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2b
    new-instance p0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadParam;

    invoke-virtual {p1}, Lcom/tencent/thumbplayer/tcmedia/api/proxy/TPDownloadParamData;->getDlType()I

    move-result p1

    invoke-static {p1}, Lcom/tencent/thumbplayer/tcmedia/c/h;->a(I)I

    move-result p1

    invoke-direct {p0, v3, p1, p2}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadParam;-><init>(Ljava/util/ArrayList;ILjava/util/Map;)V

    return-object p0

    :cond_2c
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadParam;

    invoke-direct {p0, p1, v0, v1}, Lcom/tencent/thumbplayer/tcmedia/core/downloadproxy/api/TPDownloadParam;-><init>(Ljava/util/ArrayList;ILjava/util/Map;)V

    return-object p0
.end method
