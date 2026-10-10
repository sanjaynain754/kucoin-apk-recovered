package d10;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: d10.a */
/* JADX INFO: compiled from: WebShareSite.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Ld10/a;", "", "Landroid/net/Uri;", "uri", "", "", "addParams", "currentLanguagePath", "d", "(Landroid/net/Uri;Ljava/util/Map;Ljava/lang/String;)Landroid/net/Uri;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "localLanPath", "b", "(Ljava/lang/String;)Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36593a {
    @NotNull
    /* JADX INFO: renamed from: a */
    String mo81880a();

    @NotNull
    /* JADX INFO: renamed from: b */
    String mo81881b(@NotNull String localLanPath);

    @NotNull
    /* JADX INFO: renamed from: d */
    Uri mo81882d(@NotNull Uri uri, @NotNull Map<String, String> addParams, @NotNull String currentLanguagePath);
}
