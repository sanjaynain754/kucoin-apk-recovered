package com.kubi.advert.flavor;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45660a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.advert.flavor.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IFacebookSdkFlavor.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45660a
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/advert/flavor/IFacebookSdkFlavor;", "", "initialize", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "fbEvent", "eventName", "", ReportDataTable.COLUMN_PARAMS, "", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IFacebookSdkFlavor {
    /* JADX INFO: renamed from: a */
    void mo14775a(@NotNull Application application);

    /* JADX INFO: renamed from: e */
    void mo14777e(@NotNull String str, @NotNull Map<String, String> map);
}
