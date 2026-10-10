package f30;

import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f30.e */
/* JADX INFO: compiled from: LiveDataExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"putValue", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "value", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37334e {
    /* JADX INFO: renamed from: a */
    public static final <T> void m83919a(@NotNull MutableLiveData<T> mutableLiveData, T t11) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            mutableLiveData.setValue(t11);
        } else {
            mutableLiveData.postValue(t11);
        }
    }
}
