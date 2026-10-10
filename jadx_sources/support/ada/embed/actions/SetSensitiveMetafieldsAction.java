package support.ada.embed.actions;

import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import ci0.InterfaceC4987a;
import di0.C36715b;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SetSensitiveMetafieldsAction.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"Lsupport/ada/embed/actions/SetSensitiveMetafieldsAction;", "Lci0/a;", "Landroid/webkit/WebView;", "webView", "", "", "", "metaFields", "<init>", "(Landroid/webkit/WebView;Ljava/util/Map;)V", "key", "()Ljava/lang/String;", "", "execute", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/webkit/WebView;", "b", "Ljava/util/Map;", "c", "Companion", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class SetSensitiveMetafieldsAction implements InterfaceC4987a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final WebView webView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Map<String, Object> metaFields;

    @Override // ci0.InterfaceC4987a
    public void execute() {
        WebView webView = this.webView;
        String str = String.format("setSensitiveMetaFields(%s)", Arrays.copyOf(new Object[]{C36715b.m82237c(this.metaFields)}, 1));
        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(str, null);
    }

    @Override // ci0.InterfaceC4987a
    @NotNull
    public String key() {
        String simpleName = SetSensitiveMetafieldsAction.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "SetSensitiveMetafieldsAc…on::class.java.simpleName");
        return simpleName;
    }

    public SetSensitiveMetafieldsAction(@NotNull WebView webView, @NotNull Map<String, ? extends Object> map) {
        this.webView = webView;
        this.metaFields = map;
    }
}
