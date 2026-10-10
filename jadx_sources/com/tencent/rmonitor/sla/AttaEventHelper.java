package com.tencent.rmonitor.sla;

import android.app.Application;
import android.text.TextUtils;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33797md;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/rmonitor/sla/AttaEventHelper;", "", "()V", "fillBaseInfo", "", "attaEvent", "Lcom/tencent/rmonitor/sla/AttaEvent;", "list", "", "fillFieldIfEmpty", "", "field", "block", "Lkotlin/Function0;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AttaEventHelper {

    @NotNull
    public static final AttaEventHelper INSTANCE = new AttaEventHelper();

    public final void fillBaseInfo(@NotNull AttaEvent attaEvent) {
        Intrinsics.checkNotNullParameter(attaEvent, "attaEvent");
        attaEvent.setAppVersion(fillFieldIfEmpty(attaEvent.getAppVersion(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.1
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return BaseInfo.userMeta.appVersion;
            }
        }));
        attaEvent.setAppName(fillFieldIfEmpty(attaEvent.getAppName(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.2
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return AppInfo.INSTANCE.getAppName(BaseInfo.app);
            }
        }));
        attaEvent.setAppBundleId(fillFieldIfEmpty(attaEvent.getAppBundleId(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.3
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                String packageName;
                Application application = BaseInfo.app;
                return (application == null || (packageName = application.getPackageName()) == null) ? "" : packageName;
            }
        }));
        attaEvent.setAppKey(fillFieldIfEmpty(attaEvent.getAppKey(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.4
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                UserMeta userMeta = BaseInfo.userMeta;
                sb2.append(userMeta.appKey);
                sb2.append('-');
                sb2.append(userMeta.appId);
                return sb2.toString();
            }
        }));
        attaEvent.setUserId(fillFieldIfEmpty(attaEvent.getUserId(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.5
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return BaseInfo.userMeta.uin;
            }
        }));
        attaEvent.setSdkVersion(fillFieldIfEmpty(attaEvent.getSdkVersion(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.6
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "4.4.7.8";
            }
        }));
        attaEvent.setEventTime(attaEvent.getEventTime() > 0 ? attaEvent.getEventTime() : System.currentTimeMillis());
        attaEvent.setUploadTime(System.currentTimeMillis());
        attaEvent.setDeviceId(fillFieldIfEmpty(attaEvent.getDeviceId(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.7
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return BaseInfo.userMeta.getUniqueID();
            }
        }));
        attaEvent.setOsVersion(fillFieldIfEmpty(attaEvent.getOsVersion(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.8
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return C33797md.m74119a(C33714ie.m73408k().mo73415c(), C33714ie.f70270o.mo73419g());
            }
        }));
        attaEvent.setManufacturer(fillFieldIfEmpty(attaEvent.getManufacturer(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.9
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return C33714ie.m73408k().mo73413b();
            }
        }));
        attaEvent.setModel(fillFieldIfEmpty(attaEvent.getModel(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.10
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return C33714ie.m73408k().mo73416d();
            }
        }));
        attaEvent.setProductId(fillFieldIfEmpty(attaEvent.getProductId(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.11
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return BaseInfo.userMeta.appId;
            }
        }));
        attaEvent.setFullOSVersion(fillFieldIfEmpty(attaEvent.getFullOSVersion(), new Function0<String>() { // from class: com.tencent.rmonitor.sla.AttaEventHelper.fillBaseInfo.12
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return C33797md.m74120b(C33714ie.m73408k().mo73415c(), C33714ie.f70270o.mo73419g());
            }
        }));
    }

    private AttaEventHelper() {
    }

    private final String fillFieldIfEmpty(String field, Function0<String> block) {
        if (TextUtils.isEmpty(field)) {
            String strInvoke = block.invoke();
            if (strInvoke == null) {
                return "";
            }
            return strInvoke;
        }
        Intrinsics.checkNotNull(field);
        return field;
    }

    public final void fillBaseInfo(@NotNull List<AttaEvent> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            INSTANCE.fillBaseInfo((AttaEvent) it.next());
        }
    }
}
