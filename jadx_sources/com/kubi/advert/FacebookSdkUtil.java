package com.kubi.advert;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.advert.flavor.IFacebookSdkFlavor;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.advert.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FacebookSdkUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/advert/FacebookSdkUtil;", "", "<init>", "()V", "initialize", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "fbEvent", "eventName", "", ReportDataTable.COLUMN_PARAMS, "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFacebookSdkUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacebookSdkUtil.kt\ncom/kubi/advert/FacebookSdkUtil\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 AdvertEx.kt\ncom/kubi/advert/AdvertExKt\n*L\n1#1,28:1\n25#2,2:29\n27#2:34\n25#2,2:35\n27#2:40\n40#3,3:31\n40#3,3:37\n*S KotlinDebug\n*F\n+ 1 FacebookSdkUtil.kt\ncom/kubi/advert/FacebookSdkUtil\n*L\n16#1:29,2\n16#1:34\n24#1:35,2\n24#1:40\n17#1:31,3\n25#1:37,3\n*E\n"})
public final class FacebookSdkUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FacebookSdkUtil f15173a = new FacebookSdkUtil();

    /* JADX INFO: renamed from: a */
    public final void m14819a(@NotNull String eventName, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        Object objM56186h = Router.f46192a.m56186h(IFacebookSdkFlavor.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((IFacebookSdkFlavor) objM56186h).mo14777e(eventName, params);
        } else {
            C43840a.m96550d("fbEvent, nothing flavor get", "FacebookSdkUtil");
            C44128b.m97266j("FacebookSdkUtil", "fbEvent, nothing flavor get");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14820b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Object objM56186h = Router.f46192a.m56186h(IFacebookSdkFlavor.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((IFacebookSdkFlavor) objM56186h).mo14775a(application);
        } else {
            C43840a.m96550d("initialize, nothing flavor get", "FacebookSdkUtil");
            C44128b.m97266j("FacebookSdkUtil", "initialize, nothing flavor get");
        }
    }
}
