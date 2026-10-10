package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: androidx.media3.extractor.metadata.icy.IcyHeaders.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IcyHeaders[] newArray(int i11) {
            return new IcyHeaders[i11];
        }
    };
    public static final String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final String RESPONSE_HEADER_NAME = "icy-name";
    private static final String RESPONSE_HEADER_PUB = "icy-pub";
    private static final String RESPONSE_HEADER_URL = "icy-url";
    private static final String TAG = "IcyHeaders";
    public final int bitrate;

    @Nullable
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;

    @Nullable
    public final String name;

    @Nullable
    public final String url;

    public IcyHeaders(int i11, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11, int i12) {
        Assertions.checkArgument(i12 == -1 || i12 > 0);
        this.bitrate = i11;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z11;
        this.metadataInterval = i12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.bitrate == icyHeaders.bitrate && Util.areEqual(this.genre, icyHeaders.genre) && Util.areEqual(this.name, icyHeaders.name) && Util.areEqual(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static IcyHeaders parse(Map<String, List<String>> map) {
        boolean z11;
        int i11;
        String str;
        String str2;
        boolean zEquals;
        int i12;
        List<String> list = map.get(RESPONSE_HEADER_BITRATE);
        boolean z12 = true;
        int i13 = -1;
        if (list != null) {
            String str3 = list.get(0);
            try {
                i12 = Integer.parseInt(str3) * 1000;
                if (i12 > 0) {
                    z11 = true;
                } else {
                    try {
                        Log.m2961w(TAG, "Invalid bitrate: " + str3);
                        z11 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        Log.m2961w(TAG, "Invalid bitrate header: " + str3);
                        z11 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
            i11 = i12;
        } else {
            z11 = false;
            i11 = -1;
        }
        List<String> list2 = map.get(RESPONSE_HEADER_GENRE);
        String str4 = null;
        if (list2 != null) {
            str4 = list2.get(0);
            z11 = true;
        }
        List<String> list3 = map.get(RESPONSE_HEADER_NAME);
        if (list3 != null) {
            str = list3.get(0);
            z11 = true;
        } else {
            str = str4;
        }
        List<String> list4 = map.get(RESPONSE_HEADER_URL);
        if (list4 != null) {
            str2 = list4.get(0);
            z11 = true;
        } else {
            str2 = str4;
        }
        List<String> list5 = map.get(RESPONSE_HEADER_PUB);
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z11 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i14 = Integer.parseInt(str5);
                if (i14 > 0) {
                    i13 = i14;
                } else {
                    try {
                        Log.m2961w(TAG, "Invalid metadata interval: " + str5);
                        z12 = z11;
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        Log.m2961w(TAG, "Invalid metadata interval: " + str5);
                    }
                }
                z11 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        return z11 ? new IcyHeaders(i11, str4, str, str2, zEquals, i13) : null;
    }

    public int hashCode() {
        int i11 = (527 + this.bitrate) * 31;
        String str = this.genre;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.name;
        if (str != null) {
            builder.setStation(str);
        }
        String str2 = this.genre;
        if (str2 != null) {
            builder.setGenre(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        Util.writeBoolean(parcel, this.isPublic);
        parcel.writeInt(this.metadataInterval);
    }

    public IcyHeaders(Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.isPublic = Util.readBoolean(parcel);
        this.metadataInterval = parcel.readInt();
    }
}
