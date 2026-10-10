package com.kubi.lite.tab.util;

import android.content.Context;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.lite.tab.util.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiteCommonUtils.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u00020\u0007*\u00020\bJ\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012¨\u0006&"}, m90084d2 = {"Lcom/kubi/lite/tab/util/LiteCommonUtils;", "", "<init>", "()V", "TAG", "", "isDarkTheme", "", "Landroid/content/Context;", "isFiveItemsTabTrade", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "tabCount", "", "isHttp", "path", "CATEGORY_TAB", "getCATEGORY_TAB", "()Ljava/lang/String;", "MAX_TAB_COUNTS_FIVE", "getMAX_TAB_COUNTS_FIVE", "()I", "TAB_CONFIGS", "Lcom/kubi/utils/storage/StorageId;", "getTAB_CONFIGS", "()Lcom/kubi/utils/storage/StorageId;", "ID_HOME", "getID_HOME", "ID_SQUARE", "getID_SQUARE", "ID_TRADE", "getID_TRADE", "ID_EARN", "getID_EARN", "ID_PORTFOLIO", "getID_PORTFOLIO", "getBaseName", "tabId", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiteCommonUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiteCommonUtils f32173a = new LiteCommonUtils();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f32174b = "tab_config";

    /* JADX INFO: renamed from: c */
    public static final int f32175c = 5;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f32176d = new StorageId<>("tab_config", "tab_configs_data", null, false, 12, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f32177e = "1001";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f32178f = "1002";

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final String f32179g = "1003";

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final String f32180h = "1004";

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final String f32181i = "1005";

    /* JADX INFO: renamed from: k */
    public final boolean m37657k(@Nullable String str) {
        boolean z11 = false;
        if (str != null && str.length() != 0 && (StringsKt.startsWith(str, "http://", true) || StringsKt.startsWith(str, "https://", true))) {
            z11 = true;
        }
        C44128b.m97266j("LiteV2-LiteCommonUtils", "isHttp: path=" + str + ", result=" + z11);
        return z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m37647a() {
        return f32180h;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m37648b() {
        return f32177e;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m37649c() {
        return f32181i;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m37650d() {
        return f32178f;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m37651e() {
        return f32179g;
    }

    /* JADX INFO: renamed from: f */
    public final int m37652f() {
        return f32175c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<String> m37653g() {
        return f32176d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37654h() {
        boolean zM37655i = m37655i(C27017c.f54310a.m66513b());
        C44128b.m97266j("LiteV2-LiteCommonUtils", "isDarkTheme (Global): result=" + zM37655i);
        return zM37655i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m37655i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        boolean z11 = (context.getResources().getConfiguration().uiMode & 48) == 32;
        C44128b.m97266j("LiteV2-LiteCommonUtils", "isDarkTheme: context=" + context.getClass().getSimpleName() + ", result=" + z11);
        return z11;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37656j(@NotNull TabConfig tabConfig, int i11) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        boolean z11 = Intrinsics.areEqual(tabConfig.getTabId(), f32179g) && i11 == f32175c;
        C44128b.m97266j("LiteV2-LiteCommonUtils", "isFiveItemsTabTrade: tabId=" + tabConfig.getTabId() + ", tabCount=" + i11 + ", result=" + z11);
        return z11;
    }
}
