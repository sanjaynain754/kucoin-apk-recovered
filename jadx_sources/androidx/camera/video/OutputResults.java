package androidx.camera.video;

import android.net.Uri;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
public abstract class OutputResults {
    public abstract Uri getOutputUri();

    /* JADX INFO: renamed from: of */
    public static OutputResults m2108of(Uri uri) {
        Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new AutoValue_OutputResults(uri);
    }
}
