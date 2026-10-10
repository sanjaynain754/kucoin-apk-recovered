package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.y */
/* JADX INFO: compiled from: createMapForCache.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "initialCapacity", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Ljava/util/Map;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41961y {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <K, V> Map<K, V> m92019a(int i11) {
        return new ConcurrentHashMap(i11);
    }
}
