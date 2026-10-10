package com.kubi.assets.filter;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.filter.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetFilterHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/filter/IFilterDialogCallBack;", "", "filterCallBack", "", DbParams.KEY_CHANNEL_RESULT, "", "Lcom/kubi/assets/filter/ParcelizePair;", "getAdapterResult", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IFilterDialogCallBack {
    @NotNull
    default String getAdapterResult() {
        return "";
    }

    /* JADX INFO: renamed from: z */
    default void mo15926z(@NotNull List<ParcelizePair> result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }
}
