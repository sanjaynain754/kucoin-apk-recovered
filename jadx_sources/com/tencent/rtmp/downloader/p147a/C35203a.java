package com.tencent.rtmp.downloader.p147a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.rtmp.TXPlayerAuthBuilder;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: renamed from: com.tencent.rtmp.downloader.a.a */
/* JADX INFO: loaded from: classes56.dex */
public class C35203a extends TXVodDownloadDataSource implements Parcelable {
    public static final Parcelable.Creator<C35203a> CREATOR = new Parcelable.Creator<C35203a>() { // from class: com.tencent.rtmp.downloader.a.a.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C35203a createFromParcel(Parcel parcel) {
            return new C35203a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C35203a[] newArray(int i11) {
            return new C35203a[i11];
        }
    };

    public C35203a(int i11, String str, int i12, String str2, String str3) {
        super(i11, str, i12, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static int m77248a(int i11) {
        if (i11 == 1000) {
            return 0;
        }
        switch (i11) {
            case 0:
                return 0;
            case 1:
                return TXVodDownloadDataSource.QUALITY_360P;
            case 2:
                return 540;
            case 3:
                return 720;
            case 4:
                return TXVodDownloadDataSource.QUALITY_1080P;
            case 5:
                return 1800;
            case 6:
                return 3112;
            default:
                return i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77251b(String str) {
        this.overlayIv = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C35203a(TXPlayerAuthBuilder tXPlayerAuthBuilder, int i11) {
        super(tXPlayerAuthBuilder, i11);
    }

    /* JADX INFO: renamed from: b */
    public static String m77249b(int i11) {
        if (i11 == 1) {
            return "FLU";
        }
        if (i11 == 2) {
            return "SD";
        }
        if (i11 == 3) {
            return "HD";
        }
        if (i11 == 4) {
            return "FHD";
        }
        if (i11 == 5) {
            return "2K";
        }
        return i11 == 6 ? "4K" : "";
    }

    /* JADX INFO: renamed from: a */
    public final void m77250a(String str) {
        this.overlayKey = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.fileId);
        parcel.writeString(this.pSign);
        parcel.writeInt(this.quality);
        parcel.writeString(this.userName);
        if (TextUtils.isEmpty(this.pSign)) {
            return;
        }
        parcel.writeString(this.overlayKey);
        parcel.writeString(this.overlayIv);
    }

    public C35203a(TXPlayerAuthBuilder tXPlayerAuthBuilder, String str) {
        super(tXPlayerAuthBuilder, str);
    }

    public C35203a(Parcel parcel) {
        this.appId = parcel.readInt();
        this.fileId = parcel.readString();
        this.pSign = parcel.readString();
        this.quality = parcel.readInt();
        this.userName = parcel.readString();
        if (TextUtils.isEmpty(this.pSign)) {
            return;
        }
        this.overlayKey = parcel.readString();
        this.overlayIv = parcel.readString();
    }
}
