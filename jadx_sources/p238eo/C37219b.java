package p238eo;

import com.google.gson.Gson;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.bean.TabConfigResponse;
import com.kubi.lite.tab.util.LiteCommonUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: eo.b */
/* JADX INFO: compiled from: TabKVStoreUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/lite/tab/kv/TabKVStoreUtil;", "", "<init>", "()V", "LTAG", "", "gson", "Lcom/google/gson/Gson;", "saveTabConfigs", "", "response", "Lcom/kubi/lite/tab/bean/TabConfigResponse;", "getCachedTabConfigs", "getDefaultTabConfigs", "", "Lcom/kubi/lite/tab/bean/TabConfig;", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37219b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37219b f82538a = new C37219b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Gson f82539b = new Gson();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final TabConfigResponse m83264a() {
        C44128b.m97266j("LiteV2-TabKVStoreUtil", "Start getting cached TAB configurations");
        try {
            String strM102326h = C46392a.m102326h(LiteCommonUtils.f32173a.m37653g(), "");
            if (strM102326h.length() != 0 && !Intrinsics.areEqual(StringsKt.trim((CharSequence) strM102326h).toString(), "{}")) {
                return (TabConfigResponse) f82539b.fromJson(strM102326h, TabConfigResponse.class);
            }
            return null;
        } catch (Exception e11) {
            C44128b.m97262f("LiteV2-TabKVStoreUtil", "Exception while getting cached TAB configs", e11);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<TabConfig> m83265b() {
        C44128b.m97266j("LiteV2-TabKVStoreUtil", "Using default TAB configurations");
        List<TabConfig> listListOf = CollectionsKt.listOf((Object[]) new TabConfig[]{new TabConfig("Home", "kucoin://lite/home", "1001", null, null, null, 56, null), new TabConfig("Trade", "kucoin://lite/trade", "1003", null, null, null, 56, null), new TabConfig("Portfolio", "kucoin://lite/asset", "1005", null, null, null, 56, null)});
        C44128b.m97266j("LiteV2-TabKVStoreUtil", "Return default TAB configurations: " + listListOf);
        return listListOf;
    }

    /* JADX INFO: renamed from: c */
    public final void m83266c(@NotNull TabConfigResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String json = f82539b.toJson(response);
            StorageId<String> storageIdM37653g = LiteCommonUtils.f32173a.m37653g();
            Intrinsics.checkNotNull(json);
            C46392a.m102333p(storageIdM37653g, json);
        } catch (Exception e11) {
            C44128b.m97262f("LiteV2-TabKVStoreUtil", "Failed to save TAB configs", e11);
        }
    }
}
