package j90;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: j90.a */
/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lj90/a;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "maxPoolSize", "<init>", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "instance", "", "c", "(Ljava/lang/Object;)Z", "b", "", "[Ljava/lang/Object;", "mPool", "I", "mPoolSize", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public class C40352a<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Object[] mPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int mPoolSize;

    @Nullable
    /* JADX INFO: renamed from: a */
    public T m88926a() {
        int i11 = this.mPoolSize;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.mPool;
        T t11 = (T) objArr[i12];
        objArr[i12] = null;
        this.mPoolSize = i11 - 1;
        return t11;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m88927b(T instance) {
        int i11 = this.mPoolSize;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.mPool[i12] == instance) {
                return true;
            }
        }
        return false;
    }

    public C40352a(int i11) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.mPool = new Object[i11];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* JADX INFO: renamed from: c */
    public boolean m88928c(T instance) {
        if (!m88927b(instance)) {
            int i11 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i11 < objArr.length) {
                objArr[i11] = instance;
                this.mPoolSize = i11 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
