package com.kubi.home.realtime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.home.realtime.IRealTimeData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.realtime.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IRealTimeAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0013H&¢\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J/\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/realtime/IRealTimeAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/home/realtime/IRealTimeData;", "", "type", "Lcom/kubi/home/realtime/RealTimeViewType;", "getType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "layoutResId", "", "getLayoutResId", "()I", "layoutDialogResId", "getLayoutDialogResId", "onBindView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "data", "Lcom/kubi/home/realtime/AdapterViewType;", "(Landroid/view/View;Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/AdapterViewType;)V", "onCreateView", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "createView", "(Landroid/content/Context;Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/AdapterViewType;Landroid/view/ViewGroup;)Landroid/view/View;", "updateView", "shouldUpdate", "", "oldData", "newData", "(Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/IRealTimeData;)Z", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRealTimeAdapter<T extends IRealTimeData> {
    @LayoutRes
    /* JADX INFO: renamed from: b */
    int mo30046b();

    @LayoutRes
    /* JADX INFO: renamed from: c */
    int mo30047c();

    /* JADX INFO: renamed from: e */
    void mo30049e(@NotNull View view, @NotNull T t11, @NotNull AdapterViewType adapterViewType);

    @NotNull
    RealTimeViewType getType();

    /* JADX INFO: renamed from: a */
    default void m30045a(@NotNull View view, @NotNull T data, @NotNull AdapterViewType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        mo30049e(view, data, type);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    default View m30048d(@NotNull Context context, @NotNull AdapterViewType type, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == AdapterViewType.CARD) {
            View viewInflate = LayoutInflater.from(context).inflate(mo30046b(), viewGroup, false);
            Intrinsics.checkNotNull(viewInflate);
            return viewInflate;
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(mo30047c(), viewGroup, false);
        Intrinsics.checkNotNull(viewInflate2);
        return viewInflate2;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    default View m30050f(@NotNull Context context, @NotNull T data, @NotNull AdapterViewType type, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(type, "type");
        View viewM30048d = m30048d(context, type, viewGroup);
        mo30049e(viewM30048d, data, type);
        return viewM30048d;
    }
}
