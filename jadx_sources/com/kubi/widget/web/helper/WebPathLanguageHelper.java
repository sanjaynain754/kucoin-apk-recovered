package com.kubi.widget.web.helper;

import com.kubi.sdk.function.language.LanguageType;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.helper.t, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WebPathLanguageHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/widget/web/helper/WebPathLanguageHelper;", "", "<init>", "()V", "toWebLanguagePath", "", "Ljava/util/Locale;", "Lcom/kubi/sdk/function/language/LanguageType;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WebPathLanguageHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WebPathLanguageHelper f55187a = new WebPathLanguageHelper();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m67322a(@NotNull LanguageType languageType) {
        Intrinsics.checkNotNullParameter(languageType, "<this>");
        return m67323b(languageType.getLocale());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m67323b(@NotNull Locale locale) {
        String language;
        Intrinsics.checkNotNullParameter(locale, "<this>");
        if (Intrinsics.areEqual(locale.getLanguage(), TUIThemeManager.LANGUAGE_ZH_CN)) {
            language = Intrinsics.areEqual(locale.getCountry(), "CN") ? "zh-hans" : "zh-hant";
        } else {
            language = Intrinsics.areEqual(locale.getLanguage(), "in") ? "id" : locale.getLanguage();
        }
        Intrinsics.checkNotNull(language);
        return language;
    }
}
