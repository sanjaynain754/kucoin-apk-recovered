package x00;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.helper.C24308d;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: x00.e */
/* JADX INFO: compiled from: WebUriInfo.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0086\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lx00/e;", "", "Landroid/net/Uri;", "url", "<init>", "(Landroid/net/Uri;)V", "", "index", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Ljava/lang/String;", "path", "", "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "", "Ljava/util/List;", "getUnLocalePath", "()Ljava/util/List;", "unLocalePath", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebUriInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebUriInfo.kt\ncom/kubi/sdk/web/config/WebUriInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n766#2:45\n857#2,2:46\n*S KotlinDebug\n*F\n+ 1 WebUriInfo.kt\ncom/kubi/sdk/web/config/WebUriInfo\n*L\n32#1:45\n32#1:46,2\n*E\n"})
public final class C45980e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Uri url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<String> unLocalePath;

    public C45980e(@NotNull Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.unLocalePath = C24308d.m58707f(url);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m101435a(int index) {
        return (String) CollectionsKt.getOrNull(this.unLocalePath, index);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Uri getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m101437c(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return C24308d.m58705d(this.unLocalePath, arrayList);
    }

    @NotNull
    public String toString() {
        return this.unLocalePath.toString();
    }
}
