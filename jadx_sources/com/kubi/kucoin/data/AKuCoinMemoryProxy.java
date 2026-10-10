package com.kubi.kucoin.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p415kx.C42001a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AKuCoinMemoryProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;", "Lcom/kubi/restful/memory/MemoryProxy;", "<init>", "()V", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AKuCoinMemoryProxy extends C42001a {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f27714d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @Nullable
    public static AKuCoinMemoryProxy f27715e;

    /* JADX INFO: compiled from: AKuCoinMemoryProxy.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/data/AKuCoinMemoryProxy$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;", "create", "", "getInstance", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAKuCoinMemoryProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AKuCoinMemoryProxy.kt\ncom/kubi/kucoin/data/AKuCoinMemoryProxy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void create() {
            AKuCoinMemoryProxy.f27715e = new AKuCoinMemoryProxy();
        }

        @NotNull
        public final AKuCoinMemoryProxy getInstance() {
            AKuCoinMemoryProxy aKuCoinMemoryProxy = AKuCoinMemoryProxy.f27715e;
            if (aKuCoinMemoryProxy != null) {
                return aKuCoinMemoryProxy;
            }
            throw new IllegalStateException("请先初始化后，在使用MemoryProxy！！！");
        }
    }
}
