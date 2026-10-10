package com.kubi.helpcenter;

import com.kubi.host.HostManager;
import com.kubi.mvi.common.MviExKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import p798yi.InterfaceC46508c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WorkOrderHelper.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\t"}, m90084d2 = {"Lcom/kubi/helpcenter/WorkOrderHelper;", "", "<init>", "()V", "getFallBackWorkOrderUrl", "", "fromId", "jumpToWorkOrderPage", "", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWorkOrderHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderHelper.kt\ncom/kubi/helpcenter/WorkOrderHelper\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,62:1\n17#2,2:63\n*S KotlinDebug\n*F\n+ 1 WorkOrderHelper.kt\ncom/kubi/helpcenter/WorkOrderHelper\n*L\n27#1:63,2\n*E\n"})
public final class WorkOrderHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WorkOrderHelper f25242a = new WorkOrderHelper();

    /* JADX INFO: renamed from: b */
    public final String m28898b(String str) {
        String strM102581a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46508c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (strM102581a = ((InterfaceC46508c) objM56186h).m102581a(str)) != null) {
            return strM102581a;
        }
        if (str.length() <= 0) {
            return HostManager.a.q() + "/requests?appNeedLang=true&";
        }
        String str2 = "";
        if (MultiLanguageManager.m56980j()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(HostManager.a.p());
            sb2.append("/hc/zh-tw/requests/new");
            if (str.length() > 0) {
                str2 = "?ticket_form_id=" + str;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(HostManager.a.p());
        sb3.append("/hc/en-us/requests/new");
        if (str.length() > 0) {
            str2 = "?ticket_form_id=" + str;
        }
        sb3.append(str2);
        return sb3.toString();
    }

    /* JADX INFO: renamed from: c */
    public final void m28899c(@NotNull String fromId) {
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        MviExKt.m42518n(new WorkOrderHelper$jumpToWorkOrderPage$1(fromId, null));
    }
}
