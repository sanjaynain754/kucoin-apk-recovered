package k50;

import androidx.credentials.provider.CredentialEntry;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: k50.a */
/* JADX INFO: compiled from: RobotH5PathConstant.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\b"}, m90084d2 = {"jumpToRobotH5", "", "path", "", "parameter", "needLogin", "", "getPlusString", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40911a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m89597a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return StringsKt.contains$default((CharSequence) path, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?";
    }

    /* JADX INFO: renamed from: b */
    public static final void m89598b(@NotNull String path, @NotNull String parameter, boolean z11) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        String strM89597a = m89597a(path);
        C37304a c37304a = C37304a.f82764a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.j());
        sb2.append(path);
        sb2.append(strM89597a);
        sb2.append("redirect=false&loading=2&needLogin=");
        sb2.append(z11);
        sb2.append("&lang=");
        sb2.append(MultiLanguageManager.f46811g.getLocale());
        sb2.append(parameter);
        sb2.append("&appNeedLang=true&night=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
        InterfaceC37766r.a.m85190a(c37304a, sb2.toString(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m89599c(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        m89598b(str, str2, z11);
    }
}
