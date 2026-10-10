package p684v5;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p585r5.C43928c;
import p749x5.C46075i;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46080n;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: v5.b */
/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lv5/b;", "", "Lx5/i;", "encodedImage", "", SessionDescription.ATTR_LENGTH, "Lx5/n;", "qualityInfo", "Lr5/c;", "options", "Lx5/e;", "decode", "(Lx5/i;ILx5/n;Lr5/c;)Lx5/e;", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC45421b {
    @Nullable
    InterfaceC46071e decode(@NotNull C46075i encodedImage, int length, @NotNull InterfaceC46080n qualityInfo, @NotNull C43928c options);
}
