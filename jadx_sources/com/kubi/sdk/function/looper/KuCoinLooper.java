package com.kubi.sdk.function.looper;

import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.sdk.util.C24217a1;
import dz.C36993c;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public enum KuCoinLooper {
    INSTANCE;

    private ConcurrentHashMap<String, C36993c> looperContainer = new ConcurrentHashMap<>();
    private Disposable mainTimer;

    public void addTask(C36993c... c36993cArr) {
        for (C36993c c36993c : c36993cArr) {
            this.looperContainer.put(c36993c.m82818c(), c36993c);
        }
        startLoop();
    }

    public void removeTask(C36993c c36993c) {
        removeTask(c36993c.m82818c());
    }

    public void clearAllTask() {
        this.looperContainer.clear();
        stopLoop();
    }

    public void onFragmentShowOrHide(OldBaseFragment oldBaseFragment, boolean z11) {
        for (C36993c c36993c : this.looperContainer.values()) {
            if (c36993c != null) {
                c36993c.m82820e(oldBaseFragment, z11);
            }
        }
    }

    public void removeTask(String str) {
        this.looperContainer.remove(str);
        if (this.looperContainer.isEmpty()) {
            stopLoop();
        }
    }

    public void startLoop() {
        if (this.looperContainer.isEmpty()) {
            return;
        }
        stopLoop();
        this.mainTimer = Observable.interval(1L, TimeUnit.SECONDS).compose(C24217a1.m58387k()).subscribe(new Consumer() { // from class: dz.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinLooper.m57035b(this.f82108b, (Long) obj);
            }
        }, new Consumer() { // from class: dz.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f82109b.startLoop();
            }
        });
    }

    public void stopLoop() {
        Disposable disposable = this.mainTimer;
        if (disposable != null) {
            disposable.dispose();
            this.mainTimer = null;
        }
    }

    KuCoinLooper() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57035b(KuCoinLooper kuCoinLooper, Long l11) {
        kuCoinLooper.getClass();
        if (l11.longValue() > 180) {
            kuCoinLooper.startLoop();
            return;
        }
        for (C36993c c36993c : kuCoinLooper.looperContainer.values()) {
            if (c36993c != null && c36993c.m82819d() && l11.longValue() % c36993c.m82817b() == 0) {
                c36993c.m82816a().run();
            }
        }
    }
}
