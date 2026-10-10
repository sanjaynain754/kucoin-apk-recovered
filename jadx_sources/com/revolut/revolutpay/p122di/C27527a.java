package com.revolut.revolutpay.p122di;

import android.content.Context;
import com.revolut.revolutpay.data.repository.C27526b;
import com.revolut.revolutpay.data.repository.InterfaceC27525a;
import com.revolut.revolutpay.p123ui.picker.C27567d;
import com.revolut.revolutpay.p123ui.picker.InterfaceC27568e;
import ma0.C42498b;
import ma0.InterfaceC42497a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.revolut.revolutpay.di.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27527a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27527a f55957a = new C27527a();

    /* JADX INFO: renamed from: b */
    public static Context f55958b;

    /* JADX INFO: renamed from: c */
    public static int f55959c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f55960d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f55961e;

    /* JADX INFO: renamed from: com.revolut.revolutpay.di.a$a */
    public static final class a extends Lambda implements Function0<C42498b> {

        /* JADX INFO: renamed from: a */
        public static final a f55962a = new a();

        public a() {
            super(0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C42498b invoke() {
            return new C42498b(C27527a.f55957a.m68219d());
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.di.a$b */
    public static final class b extends Lambda implements Function0<C27526b> {

        /* JADX INFO: renamed from: a */
        public static final b f55963a = new b();

        public b() {
            super(0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27526b invoke() {
            return new C27526b(C27527a.f55957a.m68217a());
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        f55960d = LazyKt.lazy(lazyThreadSafetyMode, (Function0) a.f55962a);
        f55961e = LazyKt.lazy(lazyThreadSafetyMode, (Function0) b.f55963a);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Context m68217a() {
        Context context = f55958b;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC42497a m68218c() {
        return (InterfaceC42497a) f55960d.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC27525a m68219d() {
        return (InterfaceC27525a) f55961e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC27568e m68220e() {
        return new C27567d(m68218c());
    }

    /* JADX INFO: renamed from: f */
    public final int m68221f() {
        return f55959c;
    }
}
