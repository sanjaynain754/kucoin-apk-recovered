package com.kubi.utils.extensions;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.extensions.a */
/* JADX INFO: compiled from: AppTrackEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"", "pageId", "blockId", "locationId", "Lorg/json/JSONObject;", ReportDataTable.COLUMN_PARAMS, "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27023a {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m66555b(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m66554a(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m66557d(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m66556c(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static final void m66554a(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C43852m.m96589a(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static final void m66556c(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C43852m.m96593e(pageId, blockId, locationId, jSONObject);
    }
}
