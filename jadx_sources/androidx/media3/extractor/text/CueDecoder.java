package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.C2802a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CueDecoder {
    static final String BUNDLE_FIELD_CUES = "c";
    static final String BUNDLE_FIELD_DURATION_US = "d";

    public CuesWithTiming decode(long j11, byte[] bArr, int i11, int i12) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i11, i12);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new CuesWithTiming(BundleCollectionUtil.fromBundleList(new C2802a(), (ArrayList) Assertions.checkNotNull(bundle.getParcelableArrayList(BUNDLE_FIELD_CUES))), j11, bundle.getLong("d"));
    }
}
