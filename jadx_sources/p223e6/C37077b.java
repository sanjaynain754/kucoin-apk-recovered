package p223e6;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: e6.b */
/* JADX INFO: compiled from: ImageTranscodeResult.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, m90084d2 = {"Le6/b;", "", "", "transcodeStatus", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "()I", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37077b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int transcodeStatus;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getTranscodeStatus() {
        return this.transcodeStatus;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.transcodeStatus)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public C37077b(int i11) {
        this.transcodeStatus = i11;
    }
}
