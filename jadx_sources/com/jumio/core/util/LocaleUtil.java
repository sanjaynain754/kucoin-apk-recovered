package com.jumio.core.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.jumio.core.C9301R;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/util/LocaleUtil;", "", "<init>", "()V", "getLocale", "Ljava/util/Locale;", "context", "Landroid/content/Context;", "checkForLocalization", "", "getDefaultLocale", "kotlin.jvm.PlatformType", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLocaleUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleUtil.kt\ncom/jumio/core/util/LocaleUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class LocaleUtil {

    @NotNull
    public static final LocaleUtil INSTANCE = new LocaleUtil();

    public final boolean checkForLocalization(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            Locale locale = Locale.ENGLISH;
            configuration.setLocale(locale);
            Resources resources = context.createConfigurationContext(configuration).getResources();
            int i11 = C9301R.string.jumio_idtype_pp;
            String string = resources.getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getResources().getString(i11);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (Intrinsics.areEqual(string, string2)) {
                Locale locale2 = context.getApplicationContext().getResources().getConfiguration().getLocales().get(0);
                if (!Intrinsics.areEqual(locale2 != null ? locale2.getLanguage() : null, locale.getLanguage())) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Nullable
    public final Locale getLocale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return checkForLocalization(context) ? context.getApplicationContext().getResources().getConfiguration().getLocales().get(0) : Locale.US;
    }
}
