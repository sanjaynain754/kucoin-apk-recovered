package androidx.datastore.preferences.core;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Actual.jvmAndroid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Landroidx/datastore/preferences/core/AtomicBoolean;", "", "initialValue", "", "(Z)V", "delegate", "Ljava/util/concurrent/atomic/AtomicBoolean;", "get", "set", "", "value", "datastore-preferences-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AtomicBoolean {

    @NotNull
    private final java.util.concurrent.atomic.AtomicBoolean delegate;

    public final boolean get() {
        return this.delegate.get();
    }

    public final void set(boolean value) {
        this.delegate.set(value);
    }

    public AtomicBoolean(boolean z11) {
        this.delegate = new java.util.concurrent.atomic.AtomicBoolean(z11);
    }
}
