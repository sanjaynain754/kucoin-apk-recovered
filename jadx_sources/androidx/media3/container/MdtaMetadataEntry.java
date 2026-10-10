package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new Parcelable.Creator<MdtaMetadataEntry>() { // from class: androidx.media3.container.MdtaMetadataEntry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry[] newArray(int i11) {
            return new MdtaMetadataEntry[i11];
        }
    };
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final byte EDITABLE_TRACKS_SAMPLES_LOCATION_INTERLEAVED = 1;
    public static final byte EDITABLE_TRACKS_SAMPLES_LOCATION_IN_EDIT_DATA_MP4 = 0;
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final String KEY_EDITABLE_TRACKS_LENGTH = "editable.tracks.length";
    public static final String KEY_EDITABLE_TRACKS_MAP = "editable.tracks.map";
    public static final String KEY_EDITABLE_TRACKS_OFFSET = "editable.tracks.offset";
    public static final String KEY_EDITABLE_TRACKS_SAMPLES_LOCATION = "editable.tracks.samples.location";
    public static final int TYPE_INDICATOR_8_BIT_UNSIGNED_INT = 75;
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_RESERVED = 0;
    public static final int TYPE_INDICATOR_STRING = 1;
    public static final int TYPE_INDICATOR_UNSIGNED_INT64 = 78;
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    private static void validateData(String str, byte[] bArr, int i11) {
        byte b11;
        str.getClass();
        boolean z11 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                break;
            case "editable.tracks.samples.location":
                if (i11 == 75 && bArr.length == 1 && ((b11 = bArr[0]) == 0 || b11 == 1)) {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                break;
            case "editable.tracks.map":
                Assertions.checkArgument(i11 == 0);
                break;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i11) {
        this(str, bArr, 0, i11);
    }

    private static String getFormattedValueForEditableTracksMap(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        Joiner.m13372on(',').appendTo(sb2, (Iterable<? extends Object>) list);
        return sb2.toString();
    }

    public List<Integer> getEditableTrackTypesFromMap() {
        Assertions.checkState(this.key.equals(KEY_EDITABLE_TRACKS_MAP), "Metadata is not an editable tracks map");
        byte b11 = this.value[1];
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < b11; i11++) {
            arrayList.add(Integer.valueOf(this.value[i11 + 2]));
        }
        return arrayList;
    }

    public int hashCode() {
        return ((((((527 + this.key.hashCode()) * 31) + Arrays.hashCode(this.value)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public String toString() {
        String formattedValueForEditableTracksMap;
        int i11 = this.typeIndicator;
        if (i11 != 0) {
            if (i11 == 1) {
                formattedValueForEditableTracksMap = Util.fromUtf8Bytes(this.value);
            } else if (i11 == 23) {
                formattedValueForEditableTracksMap = String.valueOf(Float.intBitsToFloat(Ints.fromByteArray(this.value)));
            } else if (i11 == 67) {
                formattedValueForEditableTracksMap = String.valueOf(Ints.fromByteArray(this.value));
            } else if (i11 == 75) {
                formattedValueForEditableTracksMap = String.valueOf(C2851a.m2984a(this.value[0]));
            } else if (i11 != 78) {
                formattedValueForEditableTracksMap = Util.toHexString(this.value);
            } else {
                formattedValueForEditableTracksMap = String.valueOf(new ParsableByteArray(this.value).readUnsignedLongToLong());
            }
        } else if (this.key.equals(KEY_EDITABLE_TRACKS_MAP)) {
            formattedValueForEditableTracksMap = getFormattedValueForEditableTracksMap(getEditableTrackTypesFromMap());
        } else {
            formattedValueForEditableTracksMap = Util.toHexString(this.value);
        }
        return "mdta: key=" + this.key + ", value=" + formattedValueForEditableTracksMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.key);
        parcel.writeByteArray(this.value);
        parcel.writeInt(this.localeIndicator);
        parcel.writeInt(this.typeIndicator);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i11, int i12) {
        validateData(str, bArr, i12);
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i11;
        this.typeIndicator = i12;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        String str = (String) Util.castNonNull(parcel.readString());
        this.key = str;
        byte[] bArr = (byte[]) Util.castNonNull(parcel.createByteArray());
        this.value = bArr;
        this.localeIndicator = parcel.readInt();
        int i11 = parcel.readInt();
        this.typeIndicator = i11;
        validateData(str, bArr, i11);
    }
}
