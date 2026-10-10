package com.kubi.kumex.data;

import com.kubi.kumex.data.BKuMexMemoryProxy;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import p415kx.C42001a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BKuMexMemoryProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/kumex/data/BKuMexMemoryProxy;", "Lcom/kubi/restful/memory/MemoryProxy;", "<init>", "()V", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BKuMexMemoryProxy extends C42001a {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f28814d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy<BKuMexMemoryProxy> f28815e = LazyKt.lazy(new Function0() { // from class: zl.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BKuMexMemoryProxy.m33329j();
        }
    });

    /* JADX INFO: compiled from: BKuMexMemoryProxy.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/data/BKuMexMemoryProxy$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69653b, "Lcom/kubi/kumex/data/BKuMexMemoryProxy;", "getMemory", "()Lcom/kubi/kumex/data/BKuMexMemoryProxy;", "memory$delegate", "Lkotlin/Lazy;", "getInstance", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final BKuMexMemoryProxy m33330a() {
            return (BKuMexMemoryProxy) BKuMexMemoryProxy.f28815e.getValue();
        }

        @NotNull
        public final BKuMexMemoryProxy getInstance() {
            return m33330a();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final BKuMexMemoryProxy m33329j() {
        return new BKuMexMemoryProxy();
    }
}
