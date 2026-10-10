package com.kubi.sdk.function.language.dynamic.client;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p847zy.C46943e;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;
import ro.C44128b;

/* JADX INFO: compiled from: AssetsConfigClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\bJ&\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/AssetsConfigClient;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "memCache", "", "", "", "getValue", "originKey", "loadFromAssets", "site", "locale", "clearCache", "", "Companion", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsConfigClient.kt\ncom/kubi/sdk/function/language/dynamic/client/AssetsConfigClient\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n382#2,7:75\n1#3:82\n*S KotlinDebug\n*F\n+ 1 AssetsConfigClient.kt\ncom/kubi/sdk/function/language/dynamic/client/AssetsConfigClient\n*L\n38#1:75,7\n*E\n"})
public final class AssetsConfigClient {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f46820c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f46821a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<String, Map<String, String>> f46822b;

    /* JADX INFO: compiled from: AssetsConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/AssetsConfigClient$Companion;", "", "<init>", "()V", "TAG", "", "ASSETS_DIR", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.client.AssetsConfigClient$a */
    /* JADX INFO: compiled from: AssetsConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/sdk/function/language/dynamic/client/AssetsConfigClient$loadFromAssets$1$type$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23820a extends TypeToken<Map<String, ? extends String>> {
    }

    public AssetsConfigClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46821a = context;
        this.f46822b = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m57017a() {
        this.f46822b.clear();
        C44128b.m97266j("LangAssetsConfigClient", "clearCache done");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m57018b(@NotNull String originKey) {
        Intrinsics.checkNotNullParameter(originKey, "originKey");
        C46943e c46943e = C46943e.f104811a;
        String strM103421c = c46943e.m103421c();
        String strM103419a = c46943e.m103419a();
        String str = strM103421c + '/' + strM103419a;
        Map<String, Map<String, String>> map = this.f46822b;
        Map<String, String> mapM57019c = map.get(str);
        if (mapM57019c == null) {
            mapM57019c = m57019c(strM103421c, strM103419a);
            if (mapM57019c == null) {
                mapM57019c = MapsKt.emptyMap();
            }
            map.put(str, mapM57019c);
        }
        String str2 = mapM57019c.get(originKey);
        C44128b.m97266j("LangAssetsConfigClient", "getValue from assets key=" + originKey + ", site=" + strM103421c + ", locale=" + strM103419a + ", value=" + str2);
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m57019c(String str, String str2) {
        String str3 = "language/" + str + '/' + str2 + ".json";
        try {
            InputStream inputStreamOpen = this.f46821a.getAssets().open(str3);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                Object objFromJson = new Gson().fromJson(bufferedReader, new C23820a().getType());
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                Map<String, String> map = (Map) objFromJson;
                C44128b.m97266j("LangAssetsConfigClient", "loadFromAssets success: path=" + str3 + ", size=" + map.size());
                CloseableKt.closeFinally(bufferedReader, null);
                return map;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            C44128b.m97270n("LangAssetsConfigClient", "loadFromAssets not found or failed: path=" + str3 + ", reason=" + e11.getMessage());
            return null;
        }
    }
}
