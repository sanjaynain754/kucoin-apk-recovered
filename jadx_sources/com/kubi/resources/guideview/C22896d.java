package com.kubi.resources.guideview;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.kubi.resources.guideview.d */
/* JADX INFO: compiled from: GuideBuilder.java */
/* JADX INFO: loaded from: classes11.dex */
public class C22896d {

    /* JADX INFO: renamed from: b */
    public boolean f43643b;

    /* JADX INFO: renamed from: d */
    public a f43645d;

    /* JADX INFO: renamed from: c */
    public List<InterfaceC22894b> f43644c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public Configuration f43642a = new Configuration();

    /* JADX INFO: renamed from: com.kubi.resources.guideview.d$a */
    /* JADX INFO: compiled from: GuideBuilder.java */
    public interface a {
        void onDismiss();

        void onShown();
    }

    /* JADX INFO: renamed from: a */
    public C22896d m54317a(InterfaceC22894b interfaceC22894b) {
        if (this.f43643b) {
            throw new BuildException("Already created, rebuild a new one.");
        }
        this.f43644c.add(interfaceC22894b);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public ViewOnKeyListenerC22895c m54318b() {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = new ViewOnKeyListenerC22895c();
        viewOnKeyListenerC22895c.m54310h((InterfaceC22894b[]) this.f43644c.toArray(new InterfaceC22894b[this.f43644c.size()]));
        viewOnKeyListenerC22895c.m54311i(this.f43642a);
        viewOnKeyListenerC22895c.setCallback(this.f43645d);
        this.f43644c = null;
        this.f43642a = null;
        this.f43645d = null;
        this.f43643b = true;
        return viewOnKeyListenerC22895c;
    }

    /* JADX INFO: renamed from: c */
    public C22896d m54319c(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 < 0 || i11 > 255) {
            throw new BuildException("Illegal alpha value, should between [0-255]");
        }
        this.f43642a.mAlpha = i11;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C22896d m54320d(boolean z11) {
        if (this.f43643b) {
            throw new BuildException("Already created, rebuild a new one.");
        }
        this.f43642a.mAutoDismiss = z11;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C22896d m54321e(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 < 0) {
            this.f43642a.mCorner = 0;
        }
        this.f43642a.mCorner = i11;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C22896d m54322f(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 <= 0) {
            throw new BuildException("Illegal color resource id.");
        }
        this.f43642a.mDashColor = i11;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C22896d m54323g(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        this.f43642a.mGraphStyle = i11;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C22896d m54324h(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 < 0) {
            this.f43642a.mPadding = 0;
        }
        this.f43642a.mPadding = i11;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C22896d m54325i(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 < 0) {
            this.f43642a.mPaddingBottom = 0;
        }
        this.f43642a.mPaddingBottom = i11;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C22896d m54326j(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 < 0) {
            this.f43642a.mPaddingLeft = 0;
        }
        this.f43642a.mPaddingLeft = i11;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C22896d m54327k(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 < 0) {
            this.f43642a.mPaddingRight = 0;
        }
        this.f43642a.mPaddingRight = i11;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C22896d m54328l(int i11) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (i11 < 0) {
            this.f43642a.mPaddingTop = 0;
        }
        this.f43642a.mPaddingTop = i11;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C22896d m54329m(a aVar) {
        if (this.f43643b) {
            throw new BuildException("Already created, rebuild a new one.");
        }
        this.f43645d = aVar;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C22896d m54330n(boolean z11) {
        this.f43642a.mOutsideTouchable = z11;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C22896d m54331o(boolean z11) {
        if (this.f43643b) {
            throw new BuildException("Already created, rebuild a new one.");
        }
        this.f43642a.mOverlayTarget = z11;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C22896d m54332p(Rect rect) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (rect == null) {
            throw new BuildException("Illegal view.");
        }
        this.f43642a.mTargetRect = rect;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C22896d m54333q(View view) {
        if (this.f43643b) {
            throw new BuildException("Already created. rebuild a new one.");
        }
        if (view == null) {
            throw new BuildException("Illegal view.");
        }
        this.f43642a.mTargetView = view;
        return this;
    }
}
