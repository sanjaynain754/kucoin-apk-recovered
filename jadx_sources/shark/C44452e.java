package shark;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: shark.e */
/* JADX INFO: compiled from: GraphContext.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lshark/e;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/Function0;", "defaultValue", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "value", "", "b", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Ljava/util/Map;", "store", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44452e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Map<String, Object> store = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final <T> T m98167a(@NotNull String key, @NotNull Function0<? extends T> defaultValue) {
        Map<String, Object> map = this.store;
        T t11 = (T) map.get(key);
        if (t11 != null) {
            return t11;
        }
        T tInvoke = defaultValue.invoke();
        map.put(key, tInvoke);
        return tInvoke;
    }

    /* JADX INFO: renamed from: b */
    public final <T> void m98168b(@NotNull String key, T value) {
        this.store.put(key, value);
    }
}
