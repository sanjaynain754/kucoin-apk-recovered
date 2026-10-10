package support.ada.embed.actions;

import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import ci0.InterfaceC4987a;
import di0.C36715b;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ResetAction.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m90084d2 = {"Lsupport/ada/embed/actions/ResetAction;", "Lci0/a;", "Landroid/webkit/WebView;", "webView", "", "language", "greetings", "", "", "metaFields", "sensitiveMetaFields", "", "resetChatHistory", "<init>", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V", "key", "()Ljava/lang/String;", "", "execute", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/webkit/WebView;", "b", "Ljava/lang/String;", "c", "d", "Ljava/util/Map;", "e", "f", "Ljava/lang/Boolean;", "g", "Companion", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class ResetAction implements InterfaceC4987a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final WebView webView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String language;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String greetings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Map<String, Object> metaFields;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Map<String, Object> sensitiveMetaFields;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Boolean resetChatHistory;

    @Override // ci0.InterfaceC4987a
    public void execute() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.language;
        if (str != null && !StringsKt.isBlank(str)) {
            linkedHashMap.put("language", this.language);
        }
        String str2 = this.greetings;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            linkedHashMap.put("greeting", this.greetings);
        }
        Boolean bool = this.resetChatHistory;
        if (bool != null) {
            linkedHashMap.put("resetChatHistory", bool);
        }
        Map<String, Object> map = this.metaFields;
        if (map != null) {
            linkedHashMap.put("metaFields", map);
        }
        Map<String, Object> map2 = this.sensitiveMetaFields;
        if (map2 != null) {
            linkedHashMap.put("sensitiveMetaFields", map2);
        }
        WebView webView = this.webView;
        String str3 = String.format("reset(%s)", Arrays.copyOf(new Object[]{linkedHashMap.isEmpty() ? null : C36715b.m82237c(linkedHashMap)}, 1));
        Intrinsics.checkExpressionValueIsNotNull(str3, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(str3, null);
    }

    @Override // ci0.InterfaceC4987a
    @NotNull
    public String key() {
        String simpleName = ResetAction.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "ResetAction::class.java.simpleName");
        return simpleName;
    }

    public ResetAction(@NotNull WebView webView, @Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, ? extends Object> map2, @Nullable Boolean bool) {
        this.webView = webView;
        this.language = str;
        this.greetings = str2;
        this.metaFields = map;
        this.sensitiveMetaFields = map2;
        this.resetChatHistory = bool;
    }
}
