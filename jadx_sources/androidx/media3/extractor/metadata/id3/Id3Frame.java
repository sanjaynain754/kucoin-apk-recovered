package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: id */
    public final String f3519id;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f3519id;
    }

    public Id3Frame(String str) {
        this.f3519id = str;
    }
}
