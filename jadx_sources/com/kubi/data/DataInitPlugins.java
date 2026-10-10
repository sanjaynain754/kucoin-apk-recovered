package com.kubi.data;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.data.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DataInitPlugins.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/data/DataInitPlugins;", "", "<init>", "()V", "interceptors", "", "Lcom/kubi/data/IInterceptor;", "precisionChain", "Lcom/kubi/data/InterceptorChain;", "getPrecisionChain", "addPrecisionInterceptor", "", "interceptor", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DataInitPlugins {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DataInitPlugins f21489a = new DataInitPlugins();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<IInterceptor> f21490b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterceptorChain f21491c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DefaultInterceptor());
        f21490b = arrayList;
        f21491c = new InterceptorChain(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m23680a(@NotNull IInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        f21490b.add(interceptor);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterceptorChain m23681b() {
        return f21491c;
    }
}
