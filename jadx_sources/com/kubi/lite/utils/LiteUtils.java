package com.kubi.lite.utils;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.lite.R$font;
import com.kubi.sdk.mode.config.LiteConfigManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p742wz.C45960a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.lite.utils.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiteUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u0015*\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\rR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/lite/utils/LiteUtils;", "", "<init>", "()V", "mediumFont", "Landroid/graphics/Typeface;", "getMediumFont", "()Landroid/graphics/Typeface;", "mediumFont$delegate", "Lkotlin/Lazy;", "isLitePath", "", "path", "", "uri", "Landroid/net/Uri;", "isLiteModeAvailable", "Ljava/lang/Boolean;", "isLiteAvailable", "isSupportSwitchAnimation", "log", "", "tag", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteUtils.kt\ncom/kubi/lite/utils/LiteUtils\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,79:1\n35#2,4:80\n39#2:86\n44#3,2:84\n*S KotlinDebug\n*F\n+ 1 LiteUtils.kt\ncom/kubi/lite/utils/LiteUtils\n*L\n51#1:80,4\n51#1:86\n51#1:84,2\n*E\n"})
public final class LiteUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiteUtils f32203a = new LiteUtils();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f32204b = LazyKt.lazy(new Function0() { // from class: com.kubi.lite.utils.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteUtils.m37699c();
        }
    });

    /* JADX INFO: renamed from: c */
    @Nullable
    public static Boolean f32205c;

    /* JADX INFO: renamed from: com.kubi.lite.utils.e$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: c */
    public static final Typeface m37699c() {
        return ResourcesCompat.getFont(C27059l.f54343a.m66757a(), R$font.medium);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37700b() {
        Object objM20457a;
        Boolean bool = f32205c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_lite_show", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, true);
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.Lite);
        boolean z11 = zM66567e && zM58030b;
        UserInfo userInfo = UserInfo.a;
        if (userInfo.d() == UserInfo.LoginState.Login) {
            z11 = z11 && LiteConfigManager.f47070a.m57262f();
        }
        C44128b.m97266j("LiteTag", "isLiteAvailable: remoteEnabled=" + zM66567e + ", siteEnabled=" + zM58030b + ",login=[" + userInfo.d() + " -- " + LiteConfigManager.f47070a.m57262f() + "] $" + z11);
        C45960a.f103398a.m101391f(z11);
        f32205c = Boolean.valueOf(z11);
        return z11;
    }
}
