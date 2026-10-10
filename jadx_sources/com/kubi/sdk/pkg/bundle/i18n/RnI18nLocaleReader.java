package com.kubi.sdk.pkg.bundle.i18n;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5288p;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: RnI18nLocaleReader.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nLocaleReader;", "", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;", "storage", "<init>", "(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;)V", "", "", "projectIds", "siteType", "lang", "e", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "status", "Lcom/google/gson/JsonObject;", "locales", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;", "b", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnI18nLocaleReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nLocaleReader.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nLocaleReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n766#2:44\n857#2,2:45\n1855#2:47\n1856#2:49\n1#3:48\n*S KotlinDebug\n*F\n+ 1 RnI18nLocaleReader.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nLocaleReader\n*L\n9#1:44\n9#1:45,2\n15#1:47\n15#1:49\n*E\n"})
public final class RnI18nLocaleReader {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f47313c = "hit";

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f47314d = "partial";

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f47315e = "miss";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Regex f47316f = new Regex("^[A-Za-z0-9._-]+$");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final RnI18nStorage storage;

    /* JADX INFO: compiled from: RnI18nLocaleReader.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nLocaleReader$Companion;", "", "()V", "SAFE_COMPONENT", "Lkotlin/text/Regex;", "getSAFE_COMPONENT", "()Lkotlin/text/Regex;", "STATUS_HIT", "", "getSTATUS_HIT", "()Ljava/lang/String;", "STATUS_MISS", "getSTATUS_MISS", "STATUS_PARTIAL", "getSTATUS_PARTIAL", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Regex getSAFE_COMPONENT() {
            return RnI18nLocaleReader.f47316f;
        }

        @NotNull
        public final String getSTATUS_HIT() {
            return RnI18nLocaleReader.f47313c;
        }

        @NotNull
        public final String getSTATUS_MISS() {
            return RnI18nLocaleReader.f47315e;
        }

        @NotNull
        public final String getSTATUS_PARTIAL() {
            return RnI18nLocaleReader.f47314d;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m57554e(@NotNull List<String> projectIds, @NotNull String siteType, @NotNull String lang) {
        JsonObject jsonObjectM57594r;
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        List listDistinct = CollectionsKt.distinct(projectIds);
        Regex regex = f47316f;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listDistinct) {
            if (regex.matches((CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Regex regex2 = f47316f;
            if (regex2.matches(siteType) && regex2.matches(lang)) {
                JsonObject jsonObject = new JsonObject();
                for (String str : arrayList) {
                    RnI18nStorage rnI18nStorage = this.storage;
                    if (rnI18nStorage != null && (jsonObjectM57594r = rnI18nStorage.m57594r(str, siteType, lang)) != null) {
                        jsonObject.add(str, jsonObjectM57594r);
                    }
                }
                int size = jsonObject.size();
                return m57555f(size == 0 ? f47315e : size == arrayList.size() ? f47313c : f47314d, siteType, lang, jsonObject);
            }
        }
        return m57555f(f47315e, siteType, lang, new JsonObject());
    }

    /* JADX INFO: renamed from: f */
    public final String m57555f(String status, String siteType, String lang, JsonObject locales) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status", status);
        jsonObject.addProperty("siteType", siteType);
        jsonObject.addProperty("lang", lang);
        jsonObject.add("locales", locales);
        String strM6348j = C5288p.m6348j(jsonObject);
        Intrinsics.checkNotNullExpressionValue(strM6348j, "toJson(response)");
        return strM6348j;
    }

    public RnI18nLocaleReader(@Nullable RnI18nStorage rnI18nStorage) {
        this.storage = rnI18nStorage;
    }
}
