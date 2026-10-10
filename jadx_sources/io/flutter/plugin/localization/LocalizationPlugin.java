package io.flutter.plugin.localization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.proguard.C33820nf;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class LocalizationPlugin {

    @NonNull
    private final Context context;

    @NonNull
    private final LocalizationChannel localizationChannel;

    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    @VisibleForTesting
    final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    @NonNull
    public static Locale localeFromString(@NonNull String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split(C33820nf.f71144W, -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i11 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i11 = 2;
        }
        if (strArrSplit.length > i11 && strArrSplit[i11].length() >= 2 && strArrSplit[i11].length() <= 3) {
            str4 = strArrSplit[i11];
        }
        return new Locale(str3, str4, str2);
    }

    @Nullable
    public Locale resolveNativeLocale(@Nullable List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            for (int i11 = 0; i11 < locales.size(); i11++) {
                Locale locale = locales.get(i11);
                for (Locale locale2 : list) {
                    if (locale.equals(locale2)) {
                        return locale2;
                    }
                }
                for (Locale locale3 : list) {
                    if (locale.getLanguage().equals(locale3.toLanguageTag())) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale.getLanguage().equals(locale4.getLanguage())) {
                        return locale4;
                    }
                }
            }
            return list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales2 = this.context.getResources().getConfiguration().getLocales();
        int size = locales2.size();
        for (int i12 = 0; i12 < size; i12++) {
            Locale locale5 = locales2.get(i12);
            String language = locale5.getLanguage();
            if (!locale5.getScript().isEmpty()) {
                language = language + C33820nf.f71144W + locale5.getScript();
            }
            if (!locale5.getCountry().isEmpty()) {
                language = language + C33820nf.f71144W + locale5.getCountry();
            }
            arrayList.add(C38826b.m87548a(language));
            C38827c.m87549a();
            arrayList.add(C38826b.m87548a(locale5.getLanguage()));
            C38827c.m87549a();
            arrayList.add(C38826b.m87548a(locale5.getLanguage() + "-*"));
        }
        Locale localeLookup = Locale.lookup(arrayList, list);
        return localeLookup != null ? localeLookup : list.get(0);
    }

    public void sendLocalesToFlutter(@NonNull Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(locales.get(i11));
        }
        this.localizationChannel.sendLocales(arrayList);
    }

    public LocalizationPlugin(@NonNull Context context, @NonNull LocalizationChannel localizationChannel) {
        LocalizationChannel.LocalizationMessageHandler localizationMessageHandler = new LocalizationChannel.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
            public String getStringResource(@NonNull String str, @Nullable String str2) {
                Context contextCreateConfigurationContext = LocalizationPlugin.this.context;
                if (str2 != null) {
                    Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str2);
                    Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeLocaleFromString);
                    contextCreateConfigurationContext = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return contextCreateConfigurationContext.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = localizationMessageHandler;
        this.context = context;
        this.localizationChannel = localizationChannel;
        localizationChannel.setLocalizationMessageHandler(localizationMessageHandler);
    }
}
