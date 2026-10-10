package p658ub;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.a */
/* JADX INFO: compiled from: ChatTrack.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"", "path", "", "success", "code", "errorMessage", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "ImSDK_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C45147a {
    /* JADX INFO: renamed from: a */
    public static final void m99789a(@NotNull String path, boolean z11, @NotNull String code, @Nullable String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(code, "code");
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "apiRequest");
        eventParametersBuilderAcquire.m42393d("path", path);
        eventParametersBuilderAcquire.m42393d("error_message", C45148b.m99794d(str));
        eventParametersBuilderAcquire.m42393d("code", code);
        eventParametersBuilderAcquire.m42394e("success", z11);
        TechnologyEvent.m42388d("payment_im", eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m99790b(String str, boolean z11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            str2 = "200";
        }
        if ((i11 & 8) != 0) {
            str3 = "";
        }
        m99789a(str, z11, str2, str3);
    }
}
