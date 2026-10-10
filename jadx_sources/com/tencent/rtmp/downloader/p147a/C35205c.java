package com.tencent.rtmp.downloader.p147a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.liteav.txcvodplayer.p133b.C34837d;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.TXVodDownloadMediaInfo;

/* JADX INFO: renamed from: com.tencent.rtmp.downloader.a.c */
/* JADX INFO: loaded from: classes56.dex */
public class C35205c extends TXVodDownloadMediaInfo implements Parcelable {
    public static final Parcelable.Creator<C35205c> CREATOR = new Parcelable.Creator<C35205c>() { // from class: com.tencent.rtmp.downloader.a.c.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C35205c createFromParcel(Parcel parcel) {
            return new C35205c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C35205c[] newArray(int i11) {
            return new C35205c[i11];
        }
    };

    /* JADX INFO: renamed from: a */
    private static final String f75401a = "com.tencent.rtmp.downloader.a.c";

    public C35205c() {
    }

    /* JADX INFO: renamed from: a */
    public final void m77279a(C35203a c35203a) {
        this.dataSource = c35203a;
    }

    /* JADX INFO: renamed from: b */
    public final void m77281b(int i11) {
        this.playableDuration = i11;
    }

    /* JADX INFO: renamed from: c */
    public final void m77284c(int i11) {
        this.tid = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C35205c(Parcel parcel) {
        int i11;
        int i12;
        this.dataSource = (C35203a) parcel.readParcelable(C35203a.class.getClassLoader());
        this.duration = parcel.readInt();
        this.size = parcel.readInt();
        this.downloadSize = parcel.readInt();
        this.segments = parcel.readInt();
        this.downloadSegments = parcel.readInt();
        this.playPath = parcel.readString();
        this.url = parcel.readString();
        if (this.dataSource == null) {
            this.userName = parcel.readString();
        }
        this.downloadState = parcel.readInt();
        this.playableDuration = parcel.readInt();
        long j11 = parcel.readLong();
        this.preferredResolution = j11;
        if (j11 <= 0) {
            this.preferredResolution = -1L;
        }
        String string = parcel.readString();
        if (!TextUtils.isEmpty(string)) {
            this.drmBuilder = new TXPlayerDrmBuilder(string, this.url);
        }
        this.speed = parcel.readInt();
        this.totalSize = parcel.readLong();
        long j12 = parcel.readLong();
        this.playableSize = j12;
        if (this.totalSize <= 0 && (i12 = this.size) > 0) {
            this.totalSize = i12;
        }
        if (j12 > 0 || (i11 = this.downloadSize) <= 0) {
            return;
        }
        this.playableSize = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m77275a(int i11) {
        this.duration = i11;
    }

    /* JADX INFO: renamed from: b */
    public final void m77282b(long j11) {
        this.playableSize = j11;
    }

    /* JADX INFO: renamed from: c */
    public final void m77286c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.userName = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m77287d(int i11) {
        this.downloadState = i11;
    }

    /* JADX INFO: renamed from: e */
    public final void m77288e(int i11) {
        this.speed = i11;
    }

    /* JADX INFO: renamed from: f */
    public final void m77289f(int i11) {
        this.mEncryptedLevel = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.dataSource, 0);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.size);
        parcel.writeInt(this.downloadSize);
        parcel.writeInt(this.segments);
        parcel.writeInt(this.downloadSegments);
        parcel.writeString(this.playPath);
        parcel.writeString(this.url);
        if (this.dataSource == null) {
            parcel.writeString(this.userName);
        }
        parcel.writeInt(this.downloadState);
        parcel.writeInt(this.playableDuration);
        parcel.writeLong(this.preferredResolution);
        TXPlayerDrmBuilder tXPlayerDrmBuilder = this.drmBuilder;
        parcel.writeString(tXPlayerDrmBuilder != null ? tXPlayerDrmBuilder.getKeyLicenseUrl() : "");
        parcel.writeInt(this.speed);
        parcel.writeLong(this.totalSize);
        parcel.writeLong(this.playableSize);
    }

    /* JADX INFO: renamed from: a */
    public final void m77276a(long j11) {
        this.totalSize = j11;
    }

    /* JADX INFO: renamed from: b */
    public final void m77283b(String str) {
        this.url = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m77280a(String str) {
        this.playPath = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m77285c(long j11) {
        if (j11 > 0) {
            this.preferredResolution = j11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77278a(TXPlayerDrmBuilder tXPlayerDrmBuilder) {
        this.drmBuilder = tXPlayerDrmBuilder;
    }

    /* JADX INFO: renamed from: a */
    public final void m77277a(C34837d c34837d) {
        this.netApi = c34837d;
    }

    /* JADX INFO: renamed from: a */
    public final void m77274a(float f11) {
        this.progress = f11;
    }

    /* JADX INFO: renamed from: a */
    public final void m77273a() {
        this.isResourceBroken = true;
    }
}
