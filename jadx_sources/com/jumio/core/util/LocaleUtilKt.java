package com.jumio.core.util;

import com.jumio.sdk.util.IsoCountryConverter;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m90084d2 = {"alpha3Country", "", "Ljava/util/Locale;", "getAlpha3Country", "(Ljava/util/Locale;)Ljava/lang/String;", "bcp47", "getBcp47", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocaleUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleUtil.kt\ncom/jumio/core/util/LocaleUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class LocaleUtilKt {
    @NotNull
    public static final String getAlpha3Country(@NotNull Locale locale) {
        String strConvertToAlpha3;
        Intrinsics.checkNotNullParameter(locale, "<this>");
        String country = locale.getCountry();
        if (country.length() != 2) {
            country = null;
        }
        return (country == null || (strConvertToAlpha3 = IsoCountryConverter.convertToAlpha3(country)) == null) ? "" : strConvertToAlpha3;
    }

    @NotNull
    public static final String getBcp47(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        String languageTag = locale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        return languageTag;
    }
}
