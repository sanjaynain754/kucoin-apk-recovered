package support.ada.embed.actions;

import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import ci0.InterfaceC4987a;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SetDeviceTokenAction.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m90084d2 = {"Lsupport/ada/embed/actions/SetDeviceTokenAction;", "Lci0/a;", "Landroid/webkit/WebView;", "webView", "", InterfaceC33826o0.f71244p, "<init>", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "key", "()Ljava/lang/String;", "", "execute", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/webkit/WebView;", "b", "Ljava/lang/String;", "c", "Companion", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class SetDeviceTokenAction implements InterfaceC4987a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final WebView webView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String token;

    @Override // ci0.InterfaceC4987a
    public void execute() {
        WebView webView = this.webView;
        String str = String.format("setDeviceToken('%s')", Arrays.copyOf(new Object[]{this.token}, 1));
        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(str, null);
    }

    @Override // ci0.InterfaceC4987a
    @NotNull
    public String key() {
        String simpleName = SetDeviceTokenAction.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "SetDeviceTokenAction::class.java.simpleName");
        return simpleName;
    }

    public SetDeviceTokenAction(@NotNull WebView webView, @NotNull String str) {
        this.webView = webView;
        this.token = str;
    }
}
