package p503ok;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ok.c */
/* JADX INFO: compiled from: IHybridService.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/jsbridge/service/IHybridService;", "Landroidx/lifecycle/LifecycleObserver;", "bind", "", "unbind", "onDestroy", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43106c extends LifecycleObserver {
    void bind();

    void unbind();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    default void onDestroy() {
        unbind();
    }
}
