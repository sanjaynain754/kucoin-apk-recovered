package p10;

import android.net.Uri;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27025c;
import f00.C37304a;
import g00.InterfaceC37760l;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: p10.a */
/* JADX INFO: compiled from: SearchJumpHelper.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/search/api/SearchJumpHelper;", "", "<init>", "()V", "REMOTE_CONFIG_SEARCH_V4", "", "RN_SEARCH_ROUTE", "isRnSearchV4Enabled", "", "jumpSearch", "", ReactTextInputShadowNode.PROP_PLACEHOLDER, "from", "spm", "resourceType", "jumpToRnSearch", "SearchApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchJumpHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchJumpHelper.kt\ncom/kubi/search/api/SearchJumpHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,47:1\n35#2,4:48\n39#2:54\n44#3,2:52\n*S KotlinDebug\n*F\n+ 1 SearchJumpHelper.kt\ncom/kubi/search/api/SearchJumpHelper\n*L\n19#1:48,4\n19#1:54\n19#1:52,2\n*E\n"})
public final class C43353a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43353a f95736a = new C43353a();

    /* JADX INFO: renamed from: p10.a$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95473a() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_enable_search_v4", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m95474b(@NotNull String placeholder, @NotNull String from, @Nullable String str, @NotNull String resourceType) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        if (m95473a()) {
            m95475c(placeholder, from);
        } else {
            InterfaceC37760l.a.m85175a(C37304a.f82764a, from, placeholder, resourceType, null, str, null, null, 104, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m95475c(String str, String str2) {
        String strEncode = Uri.encode("SearchPage?placeholder=" + str + "&from=" + str2);
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/krn/router?biz=opportunity&entry=main&component=kucoin_opportunity_rn&disableAddHome=1&route=");
        sb2.append(strEncode);
        router.m56184f(sb2.toString()).m4048k();
    }
}
