package r90;

import android.media.MediaFormat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.common.TrackType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: r90.c */
/* JADX INFO: compiled from: TrackType.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Landroid/media/MediaFormat;", "Lcom/otaliastudios/transcoder/common/TrackType;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/common/TrackType;", "trackType", "b", "trackTypeOrNull", "lib_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C43960c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TrackType m96908a(@NotNull MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        TrackType trackTypeM96909b = m96909b(mediaFormat);
        if (trackTypeM96909b != null) {
            return trackTypeM96909b;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected mime type: ", mediaFormat.getString("mime")).toString());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final TrackType m96909b(@NotNull MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        String string = mediaFormat.getString("mime");
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNullExpressionValue(string, "getString(MediaFormat.KEY_MIME)!!");
        if (StringsKt.startsWith$default(string, "audio/", false, 2, (Object) null)) {
            return TrackType.AUDIO;
        }
        String string2 = mediaFormat.getString("mime");
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(MediaFormat.KEY_MIME)!!");
        if (StringsKt.startsWith$default(string2, "video/", false, 2, (Object) null)) {
            return TrackType.VIDEO;
        }
        return null;
    }
}
