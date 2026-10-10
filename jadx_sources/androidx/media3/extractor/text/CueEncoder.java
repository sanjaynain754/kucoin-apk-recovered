package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CueEncoder {
    public byte[] encode(List<Cue> list, long j11) {
        ArrayList<Bundle> bundleArrayList = BundleCollectionUtil.toBundleArrayList(list, new Function() { // from class: androidx.media3.extractor.text.a
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((Cue) obj).toSerializableBundle();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        bundle.putLong("d", j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
