package androidx.customview.poolingcontainer;

import androidx.annotation.UiThread;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, m90084d2 = {"Landroidx/customview/poolingcontainer/PoolingContainerListener;", "", "onRelease", "", "customview-poolingcontainer_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface PoolingContainerListener {
    @UiThread
    void onRelease();
}
