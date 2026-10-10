package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;

/* JADX INFO: renamed from: kotlinx.serialization.internal.k2 */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H ¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058 X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lkotlinx/serialization/internal/k2;", "Array", "", "<init>", "()V", "", "requiredCapacity", "", "b", "(I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "d", "()I", ViewProps.POSITION, "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public abstract class AbstractC41841k2<Array> {
    /* JADX INFO: renamed from: a */
    public abstract Array mo91434a();

    /* JADX INFO: renamed from: b */
    public abstract void mo91435b(int requiredCapacity);

    /* JADX INFO: renamed from: d */
    public abstract int mo91436d();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m91627c(AbstractC41841k2 abstractC41841k2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i12 & 1) != 0) {
            i11 = abstractC41841k2.mo91436d() + 1;
        }
        abstractC41841k2.mo91435b(i11);
    }
}
