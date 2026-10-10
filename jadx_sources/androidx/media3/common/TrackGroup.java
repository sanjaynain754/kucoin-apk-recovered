package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public final class TrackGroup {
    private static final String FIELD_FORMATS = Util.intToStringMaxRadix(0);
    private static final String FIELD_ID = Util.intToStringMaxRadix(1);
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;

    /* JADX INFO: renamed from: id */
    @UnstableApi
    public final String f2793id;

    @UnstableApi
    public final int length;

    @UnstableApi
    public final int type;

    @UnstableApi
    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.f2793id.equals(trackGroup.f2793id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public int indexOf(Format format) {
        int i11 = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i11 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    @UnstableApi
    public TrackGroup(String str, Format... formatArr) {
        Assertions.checkArgument(formatArr.length > 0);
        this.f2793id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        int trackType = MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        verifyCorrectness();
    }

    @UnstableApi
    public static TrackGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_FORMATS);
        return new TrackGroup(bundle.getString(FIELD_ID, ""), (Format[]) (parcelableArrayList == null ? ImmutableList.m13439of() : BundleCollectionUtil.fromBundleList(new Function() { // from class: androidx.media3.common.j2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Format.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList)).toArray(new Format[0]));
    }

    private static void logErrorMessage(String str, @Nullable String str2, @Nullable String str3, int i11) {
        Log.m2958e(TAG, "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i11 + ")"));
    }

    private static String normalizeLanguage(@Nullable String str) {
        return (str == null || str.equals(C2711C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int normalizeRoleFlags(int i11) {
        return i11 | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i11 = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i11 >= formatArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(formatArr[i11].language))) {
                Format[] formatArr2 = this.formats;
                logErrorMessage(LanguageSelectionViewModel.ARG_LANGS, formatArr2[0].language, formatArr2[i11].language, i11);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.formats[i11].roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i11].roleFlags), i11);
                    return;
                }
                i11++;
            }
        }
    }

    @CheckResult
    @UnstableApi
    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    @UnstableApi
    public Format getFormat(int i11) {
        return this.formats[i11];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((527 + this.f2793id.hashCode()) * 31) + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.formats.length);
        for (Format format : this.formats) {
            arrayList.add(format.toBundle(true));
        }
        bundle.putParcelableArrayList(FIELD_FORMATS, arrayList);
        bundle.putString(FIELD_ID, this.f2793id);
        return bundle;
    }
}
