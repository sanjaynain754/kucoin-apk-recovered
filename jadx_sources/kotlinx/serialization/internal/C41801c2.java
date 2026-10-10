package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.c2 */
/* JADX INFO: compiled from: PluginExceptions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"", "seen", "goldenMask", "Lvg0/f;", "descriptor", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILvg0/f;)V", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41801c2 {
    /* JADX INFO: renamed from: a */
    public static final void m91514a(int i11, int i12, @NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                arrayList.add(descriptor.mo91527f(i14));
            }
            i13 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.getSerialName());
    }
}
