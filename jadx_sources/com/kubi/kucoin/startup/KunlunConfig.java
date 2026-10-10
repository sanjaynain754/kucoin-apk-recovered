package com.kubi.kucoin.startup;

import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.sdk.function.language.MultiLanguageManager;
import org.jetbrains.annotations.NotNull;
import p352iz.InterfaceC40193a;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.startup.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KunlunStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/startup/KunlunConfig;", "Lcom/kubi/sdk/lib/kunlun/sdk/config/KunlunConfigProvider;", "<init>", "()V", "getAppVersion", "", "getCountry", "getOsVersion", "getPlatform", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KunlunConfig implements InterfaceC40193a {
    @Override // p352iz.InterfaceC40193a
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo32875a() {
        return KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID;
    }

    @Override // p352iz.InterfaceC40193a
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo32876b() {
        StringBuilder sb2 = new StringBuilder();
        C45590s c45590s = C45590s.f102687a;
        sb2.append(c45590s.m100675Z());
        sb2.append("-(");
        sb2.append(c45590s.m100673X());
        sb2.append(')');
        return sb2.toString();
    }

    @Override // p352iz.InterfaceC40193a
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo32877c() {
        String country = MultiLanguageManager.f46811g.getLocale().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }
}
