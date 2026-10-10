package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: androidx.media3.common.Metadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Metadata[] newArray(int i11) {
            return new Metadata[i11];
        }
    };
    private final Entry[] entries;
    public final long presentationTimeUs;

    public Metadata(Entry... entryArr) {
        this(C2711C.TIME_UNSET, entryArr);
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.presentationTimeUs, (Entry[]) Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs) {
                return true;
            }
        }
        return false;
    }

    public Metadata(long j11, Entry... entryArr) {
        this.presentationTimeUs = j11;
        this.entries = entryArr;
    }

    public Metadata copyWithAppendedEntriesFrom(@Nullable Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public Metadata copyWithPresentationTimeUs(long j11) {
        return this.presentationTimeUs == j11 ? this : new Metadata(j11, this.entries);
    }

    public Entry get(int i11) {
        return this.entries[i11];
    }

    public int hashCode() {
        return (Arrays.hashCode(this.entries) * 31) + Longs.hashCode(this.presentationTimeUs);
    }

    public int length() {
        return this.entries.length;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.entries));
        if (this.presentationTimeUs == C2711C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.entries.length);
        for (Entry entry : this.entries) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.presentationTimeUs);
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j11, List<? extends Entry> list) {
        this(j11, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.entries = new Entry[parcel.readInt()];
        int i11 = 0;
        while (true) {
            Entry[] entryArr = this.entries;
            if (i11 < entryArr.length) {
                entryArr[i11] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i11++;
            } else {
                this.presentationTimeUs = parcel.readLong();
                return;
            }
        }
    }

    public interface Entry extends Parcelable {
        @Nullable
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        @Nullable
        default Format getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(MediaMetadata.Builder builder) {
        }
    }
}
