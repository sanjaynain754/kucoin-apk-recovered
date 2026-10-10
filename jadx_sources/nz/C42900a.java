package nz;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.lib.kunlun.sdk.KunLunSdk;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nz.a */
/* JADX INFO: compiled from: KunlunEventTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lnz/a;", "Lrq/a;", "<init>", "()V", "", "eventName", "", "", "labels", "", "b", "(Ljava/lang/String;Ljava/util/Map;)V", "", "values", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Monitor-kunlun_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C42900a implements InterfaceC44169a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42900a f94979a = new C42900a();

    @Override // p604rq.InterfaceC44169a
    /* JADX INFO: renamed from: a */
    public void mo94078a(@NotNull String eventName, @NotNull Map<String, Number> values, @NotNull Map<String, Object> labels) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(labels, "labels");
        KunLunSdk.f46915a.m57129o(eventName, values, labels);
    }

    @Override // p604rq.InterfaceC44169a
    /* JADX INFO: renamed from: b */
    public void mo94079b(@NotNull String eventName, @NotNull Map<String, Object> labels) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(labels, "labels");
        KunLunSdk.f46915a.m57130q(eventName, labels);
    }
}
