package com.chad.library.adapter.base.util;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ItemClickUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\"\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0010\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0011\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/chad/library/adapter/base/util/DebouncedClickListener;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;", JPushConstants.Geofence.KEY_INTERVAL, "", "(J)V", "mLastClickTime", "onClick", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.POSITION, "", "onItemClick", "onSingleClick", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
abstract class DebouncedClickListener<T> implements BaseQuickAdapter.OnItemClickListener<T>, BaseQuickAdapter.OnItemChildClickListener<T> {
    private final long interval;
    private long mLastClickTime;

    public abstract void onSingleClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.mLastClickTime;
        if (j11 >= this.interval || j11 < 0) {
            this.mLastClickTime = jCurrentTimeMillis;
            onSingleClick(adapter, view, position);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.mLastClickTime;
        if (j11 >= this.interval || j11 < 0) {
            this.mLastClickTime = jCurrentTimeMillis;
            onSingleClick(adapter, view, position);
        }
    }

    public DebouncedClickListener(long j11) {
        this.interval = j11;
    }
}
