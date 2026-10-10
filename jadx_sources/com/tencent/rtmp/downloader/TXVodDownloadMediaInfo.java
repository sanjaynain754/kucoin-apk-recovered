package com.tencent.rtmp.downloader;

import com.tencent.liteav.txcvodplayer.p133b.C34837d;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.p147a.C35203a;

/* JADX INFO: loaded from: classes56.dex */
public class TXVodDownloadMediaInfo {
    public static final int STATE_ERROR = 3;
    public static final int STATE_FINISH = 4;
    public static final int STATE_INIT = 0;
    public static final int STATE_START = 1;
    public static final int STATE_STOP = 2;
    protected C35203a dataSource;
    protected int downloadSegments;

    @Deprecated
    protected int downloadSize;
    protected TXPlayerDrmBuilder drmBuilder;
    protected int duration;

    @Deprecated
    protected C34837d netApi;
    protected String playPath;
    protected int playableDuration;
    protected long playableSize;
    protected float progress;
    protected int segments;

    @Deprecated
    protected int size;
    protected int speed;
    protected long totalSize;
    protected String url;
    protected String userName = "default";
    protected int tid = -1;
    protected int downloadState = 0;
    protected long preferredResolution = 921600;
    protected boolean isResourceBroken = false;
    protected int mEncryptedLevel = 0;

    public TXVodDownloadDataSource getDataSource() {
        return this.dataSource;
    }

    public long getDownloadSize() {
        return (this.playableSize != 0 || this.totalSize <= 0 || getProgress() <= 0.0f) ? Math.min(this.playableSize, this.totalSize) : Math.min((long) (this.totalSize * getProgress()), this.totalSize);
    }

    public int getDownloadState() {
        return this.downloadState;
    }

    public TXPlayerDrmBuilder getDrmBuilder() {
        return this.drmBuilder;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEncryptedLevel() {
        return this.mEncryptedLevel;
    }

    public String getPlayPath() {
        return this.playPath;
    }

    public int getPlayableDuration() {
        return (this.playableDuration != 0 || this.duration <= 0 || getProgress() <= 0.0f) ? this.playableDuration : Math.min((int) (this.duration * getProgress()), this.duration);
    }

    public long getPreferredResolution() {
        return this.preferredResolution;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public float getProgress() {
        float fMin;
        int i11;
        int i12;
        int i13 = this.playableDuration;
        if (i13 <= 0 || (i12 = this.duration) <= 0) {
            long j11 = this.playableSize;
            if (j11 > 0) {
                long j12 = this.totalSize;
                if (j12 > 0) {
                    fMin = Math.min(j11 / j12, 1.0f);
                } else {
                    fMin = 0.0f;
                }
            } else {
                fMin = 0.0f;
            }
        } else {
            fMin = Math.min(i13 / i12, 1.0f);
        }
        int i14 = this.downloadSegments;
        if (i14 > 0 && (i11 = this.segments) > 0) {
            fMin = Math.min(i14 / i11, 1.0f);
        }
        float f11 = this.progress;
        return f11 > 0.0f ? Math.max(fMin, f11) : fMin;
    }

    public long getSize() {
        return this.totalSize;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getTaskId() {
        return this.tid;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserName() {
        C35203a c35203a = this.dataSource;
        return c35203a != null ? c35203a.getUserName() : this.userName;
    }

    public boolean isDownloadFinished() {
        return this.downloadState == 4;
    }

    public boolean isResourceBroken() {
        return this.isResourceBroken;
    }
}
