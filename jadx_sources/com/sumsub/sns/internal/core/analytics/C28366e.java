package com.sumsub.sns.internal.core.analytics;

import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28366e {

    /* JADX INFO: renamed from: a */
    public static C29903a f57832a;

    /* JADX INFO: renamed from: f */
    public static InterfaceC41775x1 f57837f;

    /* JADX INFO: renamed from: g */
    public static Function1 f57838g;

    /* JADX INFO: renamed from: b */
    public static final List f57833b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f57834c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final InterfaceC41709m0 f57835d = C41713n0.m91125a(C41782z0.m91392b().plus(C41727q2.m91192b(null, 1, null)));

    /* JADX INFO: renamed from: e */
    public static final AbstractC41697j0 f57836e = C41782z0.m91392b().limitedParallelism(1);

    /* JADX INFO: renamed from: h */
    public static boolean f57839h = true;
}
