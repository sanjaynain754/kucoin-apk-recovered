package p329i2;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p419l2.InterfaceC42029c;
import p523p2.C43364k;

/* JADX INFO: renamed from: i2.r */
/* JADX INFO: compiled from: RequestTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class C38426r {

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC42029c> f86219a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC42029c> f86220b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f86221c;

    /* JADX INFO: renamed from: a */
    public boolean m86635a(@Nullable InterfaceC42029c interfaceC42029c) {
        boolean z11 = true;
        if (interfaceC42029c == null) {
            return true;
        }
        boolean zRemove = this.f86219a.remove(interfaceC42029c);
        if (!this.f86220b.remove(interfaceC42029c) && !zRemove) {
            z11 = false;
        }
        if (z11) {
            interfaceC42029c.clear();
        }
        return z11;
    }

    /* JADX INFO: renamed from: c */
    public void m86637c() {
        this.f86221c = true;
        for (InterfaceC42029c interfaceC42029c : C43364k.m95517j(this.f86219a)) {
            if (interfaceC42029c.isRunning() || interfaceC42029c.isComplete()) {
                interfaceC42029c.clear();
                this.f86220b.add(interfaceC42029c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m86638d() {
        this.f86221c = true;
        for (InterfaceC42029c interfaceC42029c : C43364k.m95517j(this.f86219a)) {
            if (interfaceC42029c.isRunning()) {
                interfaceC42029c.pause();
                this.f86220b.add(interfaceC42029c);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m86640f() {
        this.f86221c = false;
        for (InterfaceC42029c interfaceC42029c : C43364k.m95517j(this.f86219a)) {
            if (!interfaceC42029c.isComplete() && !interfaceC42029c.isRunning()) {
                interfaceC42029c.mo6943i();
            }
        }
        this.f86220b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m86636b() {
        Iterator it = C43364k.m95517j(this.f86219a).iterator();
        while (it.hasNext()) {
            m86635a((InterfaceC42029c) it.next());
        }
        this.f86220b.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m86639e() {
        for (InterfaceC42029c interfaceC42029c : C43364k.m95517j(this.f86219a)) {
            if (!interfaceC42029c.isComplete() && !interfaceC42029c.mo6940f()) {
                interfaceC42029c.clear();
                if (this.f86221c) {
                    this.f86220b.add(interfaceC42029c);
                } else {
                    interfaceC42029c.mo6943i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m86641g(@NonNull InterfaceC42029c interfaceC42029c) {
        this.f86219a.add(interfaceC42029c);
        if (!this.f86221c) {
            interfaceC42029c.mo6943i();
            return;
        }
        interfaceC42029c.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f86220b.add(interfaceC42029c);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f86219a.size() + ", isPaused=" + this.f86221c + "}";
    }
}
