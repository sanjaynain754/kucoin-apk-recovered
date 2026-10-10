package com.kubi.sdk.adapter;

import androidx.annotation.UiThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.chad.library.adapter.base.BaseDifferAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p275fy.RunnableC37729b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcBaseDifferAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0017J\"\u0010\u000e\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/adapter/KcBaseDifferAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/chad/library/adapter/base/BaseDifferAdapter;", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", FirebaseAnalytics.Param.ITEMS, "", "<init>", "(Landroidx/recyclerview/widget/AsyncDifferConfig;Ljava/util/List;)V", "submitList", "", "list", "submitListWithCallBack", "commitCallback", "Ljava/lang/Runnable;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class KcBaseDifferAdapter<T, VH extends RecyclerView.ViewHolder> extends BaseDifferAdapter<T, VH> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcBaseDifferAdapter(@NotNull AsyncDifferConfig<T> config, @NotNull List<? extends T> items) {
        super(config, items);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(items, "items");
    }

    @Override // com.chad.library.adapter.base.BaseDifferAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    @UiThread
    public void submitList(@Nullable List<? extends T> list) {
        submitList(list, new RunnableC37729b());
    }
}
