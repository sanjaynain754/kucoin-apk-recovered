package com.kubi.kucoin.utils;

import com.kubi.theme.R$drawable;
import com.kubi.utils.ToastCompat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.c1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ToastThemeManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/utils/ToastThemeManager;", "", "<init>", "()V", "applyTheme", "", "LTheme_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ToastThemeManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ToastThemeManager f28560a = new ToastThemeManager();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m33149a() {
        ToastCompat.m66457n().m66468t(17, 0, 0).m66470v(14).m66469u(-1).m66467s(!DayNightThemeManager.f28592a.m33187l() ? R$drawable.ltheme_shape_toast_bg_dark : R$drawable.ltheme_shape_toast_bg);
    }
}
