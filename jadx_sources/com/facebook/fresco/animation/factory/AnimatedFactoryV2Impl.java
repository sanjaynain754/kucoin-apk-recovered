package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.animated.util.AnimatedDrawableUtil;
import com.facebook.imagepipeline.cache.InterfaceC5645c;
import java.util.concurrent.ExecutorService;
import p191d5.C36618d;
import p448m5.C42429d;
import p448m5.InterfaceC42426a;
import p463n5.C42755e;
import p463n5.InterfaceC42751a;
import p463n5.InterfaceC42754d;
import p488o5.C42964a;
import p488o5.InterfaceC42965b;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;
import p585r5.C43928c;
import p617s5.InterfaceC44341n;
import p651u3.C45101d;
import p651u3.C45106i;
import p651u3.InterfaceExecutorServiceC45104g;
import p684v5.InterfaceC45421b;
import p712w3.C45712l;
import p712w3.InterfaceC45704d;
import p712w3.InterfaceC45711k;
import p714w5.InterfaceC45739a;
import p749x5.C46075i;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46080n;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class AnimatedFactoryV2Impl implements InterfaceC42751a {

    /* JADX INFO: renamed from: a */
    public final AbstractC43387c f8459a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC44341n f8460b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> f8461c;

    /* JADX INFO: renamed from: d */
    public final boolean f8462d;

    /* JADX INFO: renamed from: e */
    public InterfaceC42754d f8463e;

    /* JADX INFO: renamed from: f */
    public InterfaceC42965b f8464f;

    /* JADX INFO: renamed from: g */
    public AnimatedDrawableUtil f8465g;

    /* JADX INFO: renamed from: h */
    public InterfaceC45739a f8466h;

    /* JADX INFO: renamed from: i */
    public InterfaceExecutorServiceC45104g f8467i;

    /* JADX INFO: renamed from: j */
    public int f8468j;

    /* JADX INFO: renamed from: k */
    public final boolean f8469k;

    /* JADX INFO: renamed from: l */
    public int f8470l;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a */
    public class C5613a implements InterfaceC45421b {
        public C5613a() {
        }

        @Override // p684v5.InterfaceC45421b
        public InterfaceC46071e decode(C46075i c46075i, int i11, InterfaceC46080n interfaceC46080n, C43928c c43928c) {
            return AnimatedFactoryV2Impl.this.m8827n().mo93678b(c46075i, c43928c, c43928c.f97127i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b */
    public class C5614b implements InterfaceC42965b {
        public C5614b() {
        }

        @Override // p488o5.InterfaceC42965b
        /* JADX INFO: renamed from: a */
        public InterfaceC42426a mo8828a(C42429d c42429d, Rect rect) {
            return new C42964a(AnimatedFactoryV2Impl.this.m8826m(), c42429d, rect, AnimatedFactoryV2Impl.this.f8462d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$c */
    public class C5615c implements InterfaceC42965b {
        public C5615c() {
        }

        @Override // p488o5.InterfaceC42965b
        /* JADX INFO: renamed from: a */
        public InterfaceC42426a mo8828a(C42429d c42429d, Rect rect) {
            return new C42964a(AnimatedFactoryV2Impl.this.m8826m(), c42429d, rect, AnimatedFactoryV2Impl.this.f8462d);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Integer m8815e() {
        return 2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Integer m8816f() {
        return 3;
    }

    @Override // p463n5.InterfaceC42751a
    /* JADX INFO: renamed from: a */
    public InterfaceC45739a mo8820a(Context context) {
        if (this.f8466h == null) {
            this.f8466h = m8824k();
        }
        return this.f8466h;
    }

    @Override // p463n5.InterfaceC42751a
    /* JADX INFO: renamed from: b */
    public InterfaceC45421b mo8821b() {
        return new InterfaceC45421b() { // from class: d5.a
            @Override // p684v5.InterfaceC45421b
            public final InterfaceC46071e decode(C46075i c46075i, int i11, InterfaceC46080n interfaceC46080n, C43928c c43928c) {
                return this.f79416a.m8827n().mo93677a(c46075i, c43928c, c43928c.f97127i);
            }
        };
    }

    @Override // p463n5.InterfaceC42751a
    /* JADX INFO: renamed from: c */
    public InterfaceC45421b mo8822c() {
        return new C5613a();
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC42754d m8823j() {
        return new C42755e(new C5615c(), this.f8459a, this.f8469k);
    }

    /* JADX INFO: renamed from: k */
    public final C36618d m8824k() {
        InterfaceC45711k interfaceC45711k = new InterfaceC45711k() { // from class: d5.b
            @Override // p712w3.InterfaceC45711k
            public final Object get() {
                return AnimatedFactoryV2Impl.m8815e();
            }
        };
        ExecutorService c45101d = this.f8467i;
        if (c45101d == null) {
            c45101d = new C45101d(this.f8460b.getDecodeExecutor());
        }
        InterfaceC45711k interfaceC45711k2 = new InterfaceC45711k() { // from class: d5.c
            @Override // p712w3.InterfaceC45711k
            public final Object get() {
                return AnimatedFactoryV2Impl.m8816f();
            }
        };
        InterfaceC45711k<Boolean> interfaceC45711k3 = C45712l.f103052b;
        return new C36618d(m8825l(), C45106i.m99726g(), c45101d, RealtimeSinceBootClock.get(), this.f8459a, this.f8461c, interfaceC45711k, interfaceC45711k2, interfaceC45711k3, C45712l.m100904a(Boolean.valueOf(this.f8469k)), C45712l.m100904a(Boolean.valueOf(this.f8462d)), C45712l.m100904a(Integer.valueOf(this.f8468j)), C45712l.m100904a(Integer.valueOf(this.f8470l)));
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC42965b m8825l() {
        if (this.f8464f == null) {
            this.f8464f = new C5614b();
        }
        return this.f8464f;
    }

    /* JADX INFO: renamed from: m */
    public final AnimatedDrawableUtil m8826m() {
        if (this.f8465g == null) {
            this.f8465g = new AnimatedDrawableUtil();
        }
        return this.f8465g;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC42754d m8827n() {
        if (this.f8463e == null) {
            this.f8463e = m8823j();
        }
        return this.f8463e;
    }

    @InterfaceC45704d
    public AnimatedFactoryV2Impl(AbstractC43387c abstractC43387c, InterfaceC44341n interfaceC44341n, InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> interfaceC5645c, boolean z11, boolean z12, int i11, int i12, InterfaceExecutorServiceC45104g interfaceExecutorServiceC45104g) {
        this.f8459a = abstractC43387c;
        this.f8460b = interfaceC44341n;
        this.f8461c = interfaceC5645c;
        this.f8468j = i11;
        this.f8469k = z12;
        this.f8462d = z11;
        this.f8467i = interfaceExecutorServiceC45104g;
        this.f8470l = i12;
    }
}
