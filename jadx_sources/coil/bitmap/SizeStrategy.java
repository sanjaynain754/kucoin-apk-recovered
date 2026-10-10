package coil.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.TreeMap;
import kotlin.C4444a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p627t0.C44606a;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BitmapPoolStrategy.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(19)
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcoil/bitmap/SizeStrategy;", "Lcoil/bitmap/BitmapPoolStrategy;", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "b", "(Landroid/graphics/Bitmap;)V", "removeLast", "()Landroid/graphics/Bitmap;", "", "toString", "()Ljava/lang/String;", "", "size", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "Lt0/a;", "Lt0/a;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Ljava/util/TreeMap;", "c", "Ljava/util/TreeMap;", "sizes", "d", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
@VisibleForTesting
public final class SizeStrategy implements BitmapPoolStrategy {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C44606a<Integer, Bitmap> entries = new C44606a<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final TreeMap<Integer, Integer> sizes = new TreeMap<>();

    /* JADX INFO: renamed from: a */
    public final void m5474a(int size) {
        int iIntValue = ((Number) MapsKt.getValue(this.sizes, Integer.valueOf(size))).intValue();
        if (iIntValue == 1) {
            this.sizes.remove(Integer.valueOf(size));
        } else {
            this.sizes.put(Integer.valueOf(size), Integer.valueOf(iIntValue - 1));
        }
    }

    @Override // coil.bitmap.BitmapPoolStrategy
    /* JADX INFO: renamed from: b */
    public void mo5461b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iM4231a = C4444a.m4231a(bitmap);
        this.entries.m98707c(Integer.valueOf(iM4231a), bitmap);
        Integer num = this.sizes.get(Integer.valueOf(iM4231a));
        this.sizes.put(Integer.valueOf(iM4231a), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // coil.bitmap.BitmapPoolStrategy
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapM98709e = this.entries.m98709e();
        if (bitmapM98709e != null) {
            m5474a(bitmapM98709e.getAllocationByteCount());
        }
        return bitmapM98709e;
    }

    @NotNull
    public String toString() {
        return "SizeStrategy: entries=" + this.entries + ", sizes=" + this.sizes;
    }
}
