package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class CueGroup {

    @UnstableApi
    public static final CueGroup EMPTY_TIME_ZERO = new CueGroup(ImmutableList.m13439of(), 0);
    private static final String FIELD_CUES = Util.intToStringMaxRadix(0);
    private static final String FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    public final ImmutableList<Cue> cues;

    @UnstableApi
    public final long presentationTimeUs;

    @UnstableApi
    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? ImmutableList.m13439of() : BundleCollectionUtil.fromBundleList(new C2802a(), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new Function() { // from class: androidx.media3.common.text.b
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((Cue) obj).toBinderBasedBundle();
            }
        }));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }

    @UnstableApi
    public CueGroup(List<Cue> list, long j11) {
        this.cues = ImmutableList.copyOf((Collection) list);
        this.presentationTimeUs = j11;
    }

    private static ImmutableList<Cue> filterOutBitmapCues(List<Cue> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).bitmap == null) {
                builder.add(list.get(i11));
            }
        }
        return builder.build();
    }
}
