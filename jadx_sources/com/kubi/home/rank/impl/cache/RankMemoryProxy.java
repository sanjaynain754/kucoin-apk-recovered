package com.kubi.home.rank.impl.cache;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p415kx.C42001a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RankMemoryProxy.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/RankMemoryProxy;", "Lcom/kubi/restful/memory/MemoryProxy;", "<init>", "()V", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankMemoryProxy extends C42001a {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f26042d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @Nullable
    public static RankMemoryProxy f26043e;

    /* JADX INFO: compiled from: RankMemoryProxy.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/RankMemoryProxy$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/home/rank/impl/cache/RankMemoryProxy;", "create", "", "getInstance", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void create() {
            RankMemoryProxy.f26043e = new RankMemoryProxy();
        }

        @Nullable
        public final RankMemoryProxy getInstance() {
            if (RankMemoryProxy.f26043e == null) {
                create();
            }
            return RankMemoryProxy.f26043e;
        }
    }
}
