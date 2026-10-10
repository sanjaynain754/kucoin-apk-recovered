package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.tencent.bugly.proguard.C33978va;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: androidx.media3.common.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i11) {
            return new StreamKey[i11];
        }
    };
    private static final String FIELD_PERIOD_INDEX = Util.intToStringMaxRadix(0);
    private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(1);
    private static final String FIELD_STREAM_INDEX = Util.intToStringMaxRadix(2);

    public StreamKey(int i11, int i12) {
        this(0, i11, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex) {
                return true;
            }
        }
        return false;
    }

    public StreamKey(int i11, int i12, int i13) {
        this.periodIndex = i11;
        this.groupIndex = i12;
        this.streamIndex = i13;
    }

    public static StreamKey fromBundle(Bundle bundle) {
        return new StreamKey(bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getInt(FIELD_GROUP_INDEX, 0), bundle.getInt(FIELD_STREAM_INDEX, 0));
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i11 = this.periodIndex - streamKey.periodIndex;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.groupIndex - streamKey.groupIndex;
        return i12 == 0 ? this.streamIndex - streamKey.streamIndex : i12;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i11 = this.periodIndex;
        if (i11 != 0) {
            bundle.putInt(FIELD_PERIOD_INDEX, i11);
        }
        int i12 = this.groupIndex;
        if (i12 != 0) {
            bundle.putInt(FIELD_GROUP_INDEX, i12);
        }
        int i13 = this.streamIndex;
        if (i13 != 0) {
            bundle.putInt(FIELD_STREAM_INDEX, i13);
        }
        return bundle;
    }

    public String toString() {
        return this.periodIndex + C33978va.f72339h + this.groupIndex + C33978va.f72339h + this.streamIndex;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public StreamKey(Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.streamIndex = parcel.readInt();
    }
}
